package com.example.daggerpractice

import javax.inject.Inject

class Remote {

    lateinit var car: Car

    @Inject
    constructor(){

    }

    fun provideCar(car: Car){
        System.out.println("Providing car to remote")
        this.car=car
    }
}