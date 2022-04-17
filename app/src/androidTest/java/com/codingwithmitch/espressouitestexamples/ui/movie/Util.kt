package com.codingwithmitch.espressouitestexamples.ui.movie

import android.util.Log

open class Util {

    companion object {

        var logEnable = false

        fun logTest(log: String) {
            if(logEnable){
                Log.v("Espresso Logs: \n", log)
            }

        }

    }
}