package com.lgmro.cryptoapp

import android.app.Application
import com.lgmro.cryptoapp.di.repositoryModule
import com.lgmro.cryptoapp.di.retrofitModule
import com.lgmro.cryptoapp.di.serviceModule
import com.lgmro.cryptoapp.di.useCaseModule
import com.lgmro.cryptoapp.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@App)
            modules(
                arrayListOf(
                    retrofitModule,
                    useCaseModule,
                    viewModelModule,
                    repositoryModule,
                    serviceModule
                )
            )
        }
    }
}