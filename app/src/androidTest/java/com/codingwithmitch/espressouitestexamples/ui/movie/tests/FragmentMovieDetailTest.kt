package com.codingwithmitch.espressouitestexamples.ui.movie.tests
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.codingwithmitch.espressouitestexamples.ui.movie.EspressoBaseTest.Companion.checkDisplayedTextElement
import com.codingwithmitch.espressouitestexamples.ui.movie.EspressoBaseTest.Companion.runFragment
import com.codingwithmitch.espressouitestexamples.ui.movie.TestsData.Companion.DESCRIPTIONS
import com.codingwithmitch.espressouitestexamples.ui.movie.TestsData.Companion.LIST_ITEM_IN_TEST
import com.codingwithmitch.espressouitestexamples.ui.movie.TestsData.Companion.MOVIE_ID
import com.codingwithmitch.espressouitestexamples.ui.movie.TestsData.Companion.TITLE
import com.codingwithmitch.espressouitestexamples.ui.movie.Util
import com.codingwithmitch.espressouitestexamples.ui.movie.pages.FragmentMovieDetailPage.Companion.getMovieDescriptionButton
import com.codingwithmitch.espressouitestexamples.ui.movie.pages.FragmentMovieDetailPage.Companion.getMovieTitleButton
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4ClassRunner::class)
class FragmentMovieDetailTest{

    @Test
    fun test_isMovieDataVisible() {

        Util.logTest("STEP.1: Run fragment Movie Detail")
        runFragment(
            MOVIE_ID,
            LIST_ITEM_IN_TEST
        )

        Util.logTest("Checking the text on Title")
        checkDisplayedTextElement(
            getMovieTitleButton(),
            TITLE
        )

        Util.logTest("Checking the text on Descriptions")
        checkDisplayedTextElement(
            getMovieDescriptionButton(),
            DESCRIPTIONS
        )
    }

}



















