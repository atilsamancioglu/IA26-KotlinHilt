package com.atilsamancioglu.kotlinhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    //Field Injection
    @Inject
    lateinit var musician2 : Musician

    @Inject
    lateinit var myClass : ClassExample

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        var instrument = Instrument()
        var band = Band()
        var musician = Musician(instrument,band)
        musician.sing()

         */

        musician2.sing()

        println(myClass.myFunction())

        println(myClass.secondFunction())

    }
}

@AndroidEntryPoint
class FragmentExample : Fragment() {
    @Inject
    lateinit var musician : Musician
}