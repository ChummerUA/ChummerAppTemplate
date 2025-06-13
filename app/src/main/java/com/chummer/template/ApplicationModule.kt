package com.chummer.template

import com.chummer.db.DbModule
import com.chummer.network.NetworkModule
import com.chummer.preferences.PreferencesModule
import dagger.Module
import javax.inject.Singleton

@Singleton
@Module(includes = [NetworkModule::class, DbModule::class, PreferencesModule::class])
object ApplicationModule {
}
