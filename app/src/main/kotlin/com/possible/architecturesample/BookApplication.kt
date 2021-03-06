package com.possible.architecturesample

import android.app.Application
import com.possible.architecturesample.data.models.DaoMaster
import com.possible.architecturesample.data.models.DaoSession
import com.possible.architecturesample.di.ApplicationComponent
import com.possible.architecturesample.di.ApplicationModule
import com.possible.architecturesample.di.DaggerApplicationComponent


class BookApplication : Application() {

    lateinit var appComponent: ApplicationComponent
    lateinit var daoSession: DaoSession

    override fun onCreate() {
        super.onCreate()

        initializeInjector()

        val helper = DaoMaster.DevOpenHelper(this, "books.db")
        val db = helper.writableDb
        daoSession = DaoMaster(db).newSession()
    }

    private fun initializeInjector() {
        appComponent = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
        appComponent.inject(this@BookApplication)
    }
}
