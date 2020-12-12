package com.example.daggerpractice

import javax.inject.Inject

class PetrolEngine: Engine {

    var powerCapacity: Int
    var engineCapacity:Int

    @Inject
    constructor(powerCapacity:Int, engineCapacity:Int){
        this.powerCapacity=powerCapacity
        this.engineCapacity=engineCapacity
        System.out.println("power!!!" +powerCapacity+ "engine!!!"+ engineCapacity)

    }

    override fun start() {
        System.out.println("Petrol Engine Started")
    }

}