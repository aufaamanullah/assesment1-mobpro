package org.d3if3160.assesment1mobpro

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextExchangeRate = findViewById<EditText>(R.id.edittext_exchange_rate)
        val editTextNominalIdr = findViewById<EditText>(R.id.edittext_nominal_idr)
        val buttonConvert = findViewById<Button>(R.id.button_convert)
        val textViewResult = findViewById<TextView>(R.id.textview_result)

        buttonConvert.setOnClickListener {
            if (editTextExchangeRate.text.toString().isEmpty()) {
                editTextExchangeRate.error = "Nilai tukar tidak boleh kosong"
                return@setOnClickListener
            }

            if (editTextNominalIdr.text.toString().isEmpty()) {
                editTextNominalIdr.error = "Nominal IDR tidak boleh kosong"
                return@setOnClickListener
            }

            val exchangeRate = editTextExchangeRate.text.toString().toDouble()
            val nominalIdr = editTextNominalIdr.text.toString().toDouble()
            val nominalMyr = nominalIdr / exchangeRate
            textViewResult.text = "Hasil Konversi: MYR " + String.format("%.2f", nominalMyr)
        }
    }
}




