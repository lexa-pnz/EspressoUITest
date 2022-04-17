package com.codingwithmitch.espressouitestexamples.ui.movie.tests

import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.codingwithmitch.espressouitestexamples.ui.movie.EspressoBaseTest.Companion.checkDisplayedTextElement
import com.codingwithmitch.espressouitestexamples.ui.movie.EspressoBaseTest.Companion.runFragment
import com.codingwithmitch.espressouitestexamples.ui.movie.TestsData.Companion.ACTORS
import com.codingwithmitch.espressouitestexamples.ui.movie.TestsData.Companion.ARGS_ACTORS
import com.codingwithmitch.espressouitestexamples.ui.movie.TestsData.Companion.STAR_ACTORS_FRAGMENT
import com.codingwithmitch.espressouitestexamples.ui.movie.TestsData.Companion.VERIFY_ACTORS_VALUE
import com.codingwithmitch.espressouitestexamples.ui.movie.Util.Companion.logTest
import com.codingwithmitch.espressouitestexamples.ui.movie.pages.FragmentStarActorsPage.Companion.getActorsText
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class FragmentStarActorsTest{

    @Test
    fun test_isActorsListVisible() {

        logTest("STEP.1: Run fragment Star Actors")
        runFragment(
            ARGS_ACTORS,
            ACTORS,
            STAR_ACTORS_FRAGMENT
        )

        logTest("Checking the list of actors")
        checkDisplayedTextElement(
            getActorsText(),
            VERIFY_ACTORS_VALUE
        )

    }

}





















