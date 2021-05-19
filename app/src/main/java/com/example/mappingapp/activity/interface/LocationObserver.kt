package com.example.mappingapp.activity.`interface`

import android.location.Location

interface LocationObserver {
    fun onRawLocationChanged(rawLocation: Location)
    fun onEnhancedLocationChanged(enhancedLocation: Location, keyPoints: List<Location>)
}