package hr.algebra.daggerintro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import hr.algebra.daggerintro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity( ) {

    private lateinit var binding : ActivityMainBinding
    private lateinit var utils        : Utils
    private lateinit var toastService : ToastService

    override fun onCreate( savedInstanceState: Bundle? ) {
        super.onCreate( savedInstanceState )
        binding = ActivityMainBinding.inflate( layoutInflater )
        setContentView( binding.root )
/*
        Korištenjem Dagger-a izbjegnite direktno kreiranje objekata - kao u ovom primjeru
        utils        = Utils( )
        toastService = ToastService( application )
*/
        binding.bAdd.setOnClickListener {
            val num1 = utils.getNumber( binding.etNum1 )
            val num2 = utils.getNumber( binding.etNum2 )

            Toast
                .makeText( this, "$num1+$num2=${ utils.add( num1, num2 ) }", Toast.LENGTH_SHORT )
                .show( )
        }

        binding.bTimes.setOnClickListener {
            val num1 = utils.getNumber( binding.etNum1 )
            val num2 = utils.getNumber( binding.etNum2 )
            Toast
                .makeText( this, "$num1*$num2=${ utils.times( num1, num2 ) }", Toast.LENGTH_SHORT )
                .show( )
        }

        binding.bPi.setOnClickListener {
            Toast
                .makeText( this, "${ utils.pi() }", Toast.LENGTH_SHORT )
                .show( )
        }

        binding.bToast.setOnClickListener {
            Toast
                .makeText( this, "${ toastService.generateFromRes( R.string.app_name) }", Toast.LENGTH_SHORT )
                .show( )
        }
    }
}