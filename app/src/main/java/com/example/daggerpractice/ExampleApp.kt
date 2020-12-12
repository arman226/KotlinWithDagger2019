package com.example.daggerpractice

import android.app.Application

class ExampleApp:Application() {

    lateinit var carComponent: CarComponent

    override fun onCreate() {
        super.onCreate()

        carComponent= DaggerCarComponent.builder()
                .powerCapacity(40)
                .engineCapaciity(300)
                .build()

    }

    fun carComponent():CarComponent{
        return carComponent
    }

}