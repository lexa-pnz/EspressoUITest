package com.codingwithmitch.espressouitestexamples.ui.movie.pages

import com.codingwithmitch.espressouitestexamples.R

class FragmentMovieListPage{

    companion object {

        fun getMovieRecyclerView(): Int {
            return R.id.recycler_view
        }

        fun getMovieTitle(): Int {
            return R.id.movie_title
        }

        fun getMovieDirectors(): Int {
            return R.id.movie_directiors
        }

        fun getMovieDirectorsText(): Int {
            return R.id.directors_text
        }

        fun getMovieStarActors(): Int {
            return R.id.movie_star_actors
        }

        fun getMovieStarActorsText(): Int {
            return R.id.star_actors_text
        }
    }
}









