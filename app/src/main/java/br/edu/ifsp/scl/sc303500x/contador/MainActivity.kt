package br.edu.ifsp.scl.sc303500x.contador

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.widget.addTextChangedListener
import br.edu.ifsp.scl.sc303500x.contador.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val activityMainBinding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private var value: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(activityMainBinding.root)

        with(activityMainBinding) {
            activityMainBinding.initialEt.addTextChangedListener {
                value = it.toString().toIntOrNull() ?: 0
            }

            activityMainBinding.incrementBt.setOnClickListener {
                (++value).let { activityMainBinding.visorTv.text = it.toString() }
            }

            activityMainBinding.resetBt.setOnClickListener {
                value = 0
                value.toString().let { activityMainBinding.visorTv.text = it }
            }
        }
    }
}