package com.example.daggerpractice

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class DieselEngineModule {

    @Binds
    abstract fun providesDieselEngine(dieselEngine: DieselEngine):Engine
}