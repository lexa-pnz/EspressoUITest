package com.codingwithmitch.espressouitestexamples.ui.movie.tests
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.codingwithmitch.espressouitestexamples.ui.movie.EspressoBaseTest
import com.codingwithmitch.espressouitestexamples.ui.movie.TestsData.Companion.ARGS_DIRECTORS
import com.codingwithmitch.espressouitestexamples.ui.movie.TestsData.Companion.DIRECTORS
import com.codingwithmitch.espressouitestexamples.ui.movie.TestsData.Companion.DIRECTORS_FRAGMENT
import com.codingwithmitch.espressouitestexamples.ui.movie.TestsData.Companion.VERIFY_DIRECTORS_VALUE
import com.codingwithmitch.espressouitestexamples.ui.movie.Util
import com.codingwithmitch.espressouitestexamples.ui.movie.pages.FragmentDirectorsPage.Companion.getDirectorsText
import org.junit.Test

import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class FragmentDirectorsTest : EspressoBaseTest() {

    @Test
    fun test_isDirectorsListVisible() {

        Util.logTest("STEP.1: Run fragment Directors")
        runFragment(
            ARGS_DIRECTORS,
            DIRECTORS,
            DIRECTORS_FRAGMENT
        )

        Util.logTest("Checking the list of directors")
        checkDisplayedTextElement(
            getDirectorsText(),
            VERIFY_DIRECTORS_VALUE
        )

    }

}





















