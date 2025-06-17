package com.chummer.template

import com.chummer.db.DbModule
import com.chummer.network.NetworkModule
import com.chummer.preferences.PreferencesModule
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module(includes = [NetworkModule::class, DbModule::class, PreferencesModule::class])
object ApplicationModule {
}
