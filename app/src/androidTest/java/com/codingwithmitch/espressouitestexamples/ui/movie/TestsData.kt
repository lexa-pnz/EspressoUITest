package com.codingwithmitch.espressouitestexamples.ui.movie

import com.codingwithmitch.espressouitestexamples.data.FakeMovieData
import com.codingwithmitch.espressouitestexamples.data.Movie
import io.mockk.InternalPlatformDsl.toStr


open class TestsData {

    companion object {

        const val LIST_ITEM_IN_TEST = 1
        val MOVIE_IN_TEST = FakeMovieData.movies[LIST_ITEM_IN_TEST]
        val DIRECTORS_STR = DirectorsFragment.stringBuilderForDirectors(MOVIE_IN_TEST.directors!!)
        val STAR_ACTORS_STR = StarActorsFragment.stringBuilderForStarActors(MOVIE_IN_TEST.star_actors!!)

        val DIRECTORS: ArrayList<String> = arrayListOf(FakeMovieData.movies[LIST_ITEM_IN_TEST].directors.toStr())
        val VERIFY_DIRECTORS_VALUE = DirectorsFragment.stringBuilderForDirectors(DIRECTORS)

        val ACTORS: ArrayList<String> = arrayListOf(FakeMovieData.movies[LIST_ITEM_IN_TEST].star_actors.toStr())
        val VERIFY_ACTORS_VALUE = StarActorsFragment.stringBuilderForStarActors(ACTORS)

        val TITLE:String = arrayListOf(FakeMovieData.movies[LIST_ITEM_IN_TEST].title).first()
        val DESCRIPTIONS:String = arrayListOf(FakeMovieData.movies[LIST_ITEM_IN_TEST].description).first()
        val MOVIE: Movie = arrayListOf(FakeMovieData.movies[LIST_ITEM_IN_TEST]).first()

        const val DIRECTORS_FRAGMENT = "DirectorsFragment"
        const val STAR_ACTORS_FRAGMENT = "StarActorsFragment"

        const val ARGS_DIRECTORS = "args_directors"
        const val ARGS_ACTORS = "args_actors"
        const val MOVIE_ID = "movie_id"
    }

}