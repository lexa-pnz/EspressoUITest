package com.codingwithmitch.espressouitestexamples.ui.movie.tests

import androidx.test.espresso.Espresso.pressBack
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.codingwithmitch.espressouitestexamples.ui.movie.EspressoBaseTest.Companion.checkDisplayedElement
import com.codingwithmitch.espressouitestexamples.ui.movie.EspressoBaseTest.Companion.checkDisplayedTextElement
import com.codingwithmitch.espressouitestexamples.ui.movie.EspressoBaseTest.Companion.clickButton
import com.codingwithmitch.espressouitestexamples.ui.movie.EspressoBaseTest.Companion.clickRecyclerViewElement
import com.codingwithmitch.espressouitestexamples.ui.movie.MainActivity
import com.codingwithmitch.espressouitestexamples.ui.movie.TestsData.Companion.DIRECTORS_STR
import com.codingwithmitch.espressouitestexamples.ui.movie.TestsData.Companion.LIST_ITEM_IN_TEST
import com.codingwithmitch.espressouitestexamples.ui.movie.TestsData.Companion.MOVIE_IN_TEST
import com.codingwithmitch.espressouitestexamples.ui.movie.TestsData.Companion.STAR_ACTORS_STR
import com.codingwithmitch.espressouitestexamples.ui.movie.Util
import com.codingwithmitch.espressouitestexamples.ui.movie.pages.FragmentMovieListPage.Companion.getMovieDirectors
import com.codingwithmitch.espressouitestexamples.ui.movie.pages.FragmentMovieListPage.Companion.getMovieDirectorsText
import com.codingwithmitch.espressouitestexamples.ui.movie.pages.FragmentMovieListPage.Companion.getMovieRecyclerView
import com.codingwithmitch.espressouitestexamples.ui.movie.pages.FragmentMovieListPage.Companion.getMovieStarActors
import com.codingwithmitch.espressouitestexamples.ui.movie.pages.FragmentMovieListPage.Companion.getMovieStarActorsText
import com.codingwithmitch.espressouitestexamples.ui.movie.pages.FragmentMovieListPage.Companion.getMovieTitle
import org.junit.Rule
import org.junit.Test

import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class FragmentMovieListTest{

    // "STEP.1: Run Activity"
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun test_isListFragmentVisible_onAppLaunch() {

        Util.logTest("Checking the displayed MovieRecyclerView")
        checkDisplayedElement(getMovieRecyclerView())

    }

    @Test
    fun test_selectListItem_isDetailFragmentVisible() {

        Util.logTest("STEP.2: Click Film on RecyclerView")
        clickRecyclerViewElement(getMovieRecyclerView(), LIST_ITEM_IN_TEST)

        Util.logTest("Checking the text on Title")
        checkDisplayedTextElement(getMovieTitle(), MOVIE_IN_TEST.title)

    }

    @Test
    fun test_backNavigation_toMovieListFragment() {

        Util.logTest("STEP.2: Click Film on RecyclerView")
        clickRecyclerViewElement(getMovieRecyclerView(), LIST_ITEM_IN_TEST)

        Util.logTest("Checking the text on Title")
        checkDisplayedTextElement(getMovieTitle(), MOVIE_IN_TEST.title)

        Util.logTest("STEP.3: Press back")
        pressBack()

        Util.logTest("Checking the displayed MovieRecyclerView")
        checkDisplayedElement(getMovieRecyclerView())

    }

    @Test
    fun test_navDirectorsFragment_validateDirectorsList() {

        Util.logTest("STEP.2: Click Film on RecyclerView")
        clickRecyclerViewElement(getMovieRecyclerView(), LIST_ITEM_IN_TEST)

        Util.logTest("Checking the text on Title")
        checkDisplayedTextElement(getMovieTitle(), MOVIE_IN_TEST.title)

        Util.logTest("STEP.3: Click on the Directors button")
        clickButton(getMovieDirectors())

        Util.logTest("Checking the list of Directors")
        checkDisplayedTextElement(getMovieDirectorsText(), DIRECTORS_STR)

    }

    @Test
    fun test_navStarActorsFragment_validateActorsList() {

        Util.logTest("STEP.2: Click Film on RecyclerView")
        clickRecyclerViewElement(getMovieRecyclerView(), LIST_ITEM_IN_TEST)

        Util.logTest("Checking the text on Title")
        checkDisplayedTextElement(getMovieTitle(), MOVIE_IN_TEST.title)

        Util.logTest("STEP.3: Click on the Star Actors button")
        clickButton(getMovieStarActors())

        Util.logTest("Checking the list of Star Actors")
        checkDisplayedTextElement(getMovieStarActorsText(), STAR_ACTORS_STR)

    }
}









