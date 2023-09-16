package com.aginsideout.travelchecklist

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LocationViewModel : ViewModel() {
    val location = MutableLiveData<String>()

    // You can set the location value from your fragment or activity
    fun setLocation(newLocation: String) {
        location.value = newLocation
    }
}