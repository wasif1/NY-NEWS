package com.nytimesapp.ui.interfaces

import android.view.View
import com.nytimesapp.model.ResultsItem

interface Callback {
    fun onDetails(view: View, item: ResultsItem?)
}