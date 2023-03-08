package hr.algebra.daggerintro

import android.app.Application

class ToastService ( private val app : Application ) {

    fun generateFromRes( stringId : Int ) : String {
        return app.getString( stringId )
    }
}