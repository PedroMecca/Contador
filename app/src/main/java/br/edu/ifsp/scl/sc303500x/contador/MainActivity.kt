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

class MainActivity : AppCompatActivity() {
    private lateinit var initialEt: EditText
    private lateinit var visorTv: TextView
    private lateinit var  incrementBt: Button
    private var value: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initialEt =findViewById(R.id.initial_et)
        visorTv = findViewById(R.id.visor_tv)
        incrementBt = findViewById(R.id.increment_bt)

        incrementBt.setOnClickListener(
            object : View.OnClickListener{
                override fun onClick(v: View?) {
                    value++
                    visorTv.setText(value.toString())
                }

            }
        )
    }
}