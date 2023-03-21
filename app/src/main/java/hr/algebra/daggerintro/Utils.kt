package hr.algebra.daggerintro

import android.widget.EditText
import javax.inject.Inject

class Utils @Inject constructor( ) {

    private val PI : Double = 3.14

    fun getNumber( et : EditText ) : Int {
        return et.text.toString( ).toInt( )
    }

    fun add( num1 : Int, num2 : Int ) : Int {
        return num1 + num2
    }

    fun times( num1 : Int, num2 : Int ) : Int {
        return num1 * num2
    }

    fun pi( ) : Double {
        return PI
    }
}