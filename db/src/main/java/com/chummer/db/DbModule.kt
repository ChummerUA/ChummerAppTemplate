package com.chummer.db

import android.content.Context
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.android.AndroidSqliteDriver
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object DbModule {

//    TODO Replace with your db
//    @Singleton
//    @Provides
//    fun provideDataBase(
//        sqlDriver: SqlDriver
//    )

    @Provides
    fun provideSqlDriver(
        @ApplicationContext context: Context
    ): SqlDriver = AndroidSqliteDriver(
        TODO(),
        context,
        "YourDbName"
    )
}