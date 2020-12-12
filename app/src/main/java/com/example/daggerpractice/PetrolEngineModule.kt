package com.example.daggerpractice

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class PetrolEngineModule {
//
//    var powerCapacity:Int
//
//    constructor(powerCapacity:Int){
//        this.powerCapacity = powerCapacity
//    }

    @Provides
    fun providesPetrolEngine(@Named("power")powerCapacity:Int, @Named("engine")engineCapacity:Int):Engine{
        return PetrolEngine(powerCapacity, engineCapacity) ;
    }
}