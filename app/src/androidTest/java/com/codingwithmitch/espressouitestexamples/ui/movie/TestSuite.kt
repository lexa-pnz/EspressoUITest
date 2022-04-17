package com.codingwithmitch.espressouitestexamples.ui.movie

import com.codingwithmitch.espressouitestexamples.ui.movie.tests.FragmentDirectorsTest
import com.codingwithmitch.espressouitestexamples.ui.movie.tests.FragmentMovieDetailTest
import com.codingwithmitch.espressouitestexamples.ui.movie.tests.FragmentMovieListTest
import com.codingwithmitch.espressouitestexamples.ui.movie.tests.FragmentStarActorsTest
import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Suite::class)
@Suite.SuiteClasses(
    FragmentDirectorsTest::class,
    FragmentStarActorsTest::class,
    FragmentMovieListTest::class,
    FragmentMovieDetailTest::class
)
class TestSuite