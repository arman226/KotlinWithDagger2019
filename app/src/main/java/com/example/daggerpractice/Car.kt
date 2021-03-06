package com.example.daggerpractice

import javax.inject.Inject

class Car {
    @Inject
    lateinit var wheels: Wheels
    lateinit var engine: Engine
    lateinit var driver: Driver

    @Inject
    constructor( engine: Engine, driver: Driver){
        this.engine=engine
        this.driver = driver
    }

    @Inject
    fun provideCarToRemote(remote: Remote){
        remote.provideCar(this)
    }

    fun start(){
//        engine.start()
//        System.out.println("Wheels:"+wheels)
//        System.out.println("driving...")
        System.out.println("driver Check:"+ driver)
    }

}