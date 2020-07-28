package com.atilsamancioglu.kotlinhilt

import dagger.hilt.android.scopes.FragmentScoped
import dagger.hilt.android.scopes.ViewScoped
import javax.inject.Inject
import javax.inject.Singleton

//Constructor Injection
@Singleton
class Musician
    @Inject
    constructor(instrument: Instrument, band : Band) {
    fun sing() {
        println("working")
    }
}