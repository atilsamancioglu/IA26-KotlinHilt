package com.atilsamancioglu.kotlinhilt

import com.google.gson.Gson
import javax.inject.Inject

class ClassExample
@Inject
//constructor(private val myInterfaceImplementor: MyInterface)
//constructor(private val myInterfaceImplementor : MyInterface, private val gson : Gson)
constructor(@FirstImplementor private val myInterfaceImplementor : MyInterface, @SecondImplementor private val mySecondInterfaceImplementor : MyInterface)
{
    fun myFunction() : String {
        return "Working : ${myInterfaceImplementor.myPrintFunction()}"
    }

    fun secondFunction() : String {
        return "Working : ${mySecondInterfaceImplementor.myPrintFunction()}"
    }
}