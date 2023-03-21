package hr.algebra.daggerintro

import android.app.Application
import javax.inject.Inject

class ToastService @Inject constructor( private val app : Application ) {

    fun generateFromRes( stringId : Int ) : String {
        return app.getString( stringId )
    }
}