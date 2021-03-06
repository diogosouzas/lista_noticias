package br.com.sdiogo.listanoticias

import android.app.Application
import br.com.sdiogo.listanoticias.ui.activity.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class AppApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@AppApplication)
            modules(appModules)
        }
    }

}