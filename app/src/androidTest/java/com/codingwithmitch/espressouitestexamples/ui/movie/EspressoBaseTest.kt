package com.codingwithmitch.espressouitestexamples.ui.movie

import android.os.Bundle
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.bumptech.glide.request.RequestOptions
import com.codingwithmitch.espressouitestexamples.R
import com.codingwithmitch.espressouitestexamples.data.source.MoviesRemoteDataSource
import com.codingwithmitch.espressouitestexamples.factory.MovieFragmentFactory
import io.mockk.every
import io.mockk.mockk
import java.util.ArrayList

open class EspressoBaseTest {

    companion object {

        fun runFragment(key:String, list: ArrayList<String>, fragment: String){

            val fragmentFactory = MovieFragmentFactory(null, null)
            val bundle = Bundle()
            bundle.putStringArrayList(key, list)

            if (fragment.equals("StarActorsFragment"))
            {
                val scenario = launchFragmentInContainer<StarActorsFragment>(
                    fragmentArgs = bundle,
                    factory = fragmentFactory
                )
            }
            else if (fragment.equals("DirectorsFragment")){
                val scenario = launchFragmentInContainer<DirectorsFragment>(
                    fragmentArgs = bundle,
                    factory = fragmentFactory
                )
            }

        }

        fun runFragment(key:String, Item: Int){
            val moviesDataSource = mockk<MoviesRemoteDataSource>()
            every {
                moviesDataSource.getMovie(Item)
            } returns TestsData.MOVIE

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.default_image)
                .error(R.drawable.default_image)
            val fragmentFactory = MovieFragmentFactory(requestOptions, moviesDataSource)
            val bundle = Bundle()
            bundle.putInt(key, Item)
            val scenario = launchFragmentInContainer<MovieDetailFragment>(
                fragmentArgs = bundle,
                factory = fragmentFactory
            )
        }

        fun clickButton(resourceId: Int) {
            onView(withId(resourceId))
                .perform(click())
        }

        fun clickRecyclerViewElement(resourceId: Int, LIST_ITEM_IN_TEST:Int) {
            onView(withId(resourceId))
                .perform(
                    RecyclerViewActions.actionOnItemAtPosition<MoviesListAdapter.MovieViewHolder>(
                        LIST_ITEM_IN_TEST,
                        click()
                    )
                )
        }

        fun checkDisplayedElement(resourceId: Int) {
            onView(withId(resourceId))
                .check(matches(isDisplayed()))
        }

        fun checkDisplayedTextElement(resourceId: Int, text: String) {
            onView(withId(resourceId))
                .check(matches(ViewMatchers.withText(text)))
        }
    }
}