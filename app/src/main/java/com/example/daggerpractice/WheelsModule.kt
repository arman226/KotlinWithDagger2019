package com.example.daggerpractice

import dagger.Module
import dagger.Provides

@Module
class WheelsModule {


    @Provides
    fun providesTires():Tires{
        System.out.println("provides Tires")
        return Tires();

    }

    @Provides
    fun providesRims():Rims{
        System.out.println("provides Rims")
        return Rims()
    }

    @Provides
    fun providesWheels( rims: Rims, tires: Tires):Wheels{
        System.out.println("Wheels Module")
        return Wheels(rims, tires)
    }
}