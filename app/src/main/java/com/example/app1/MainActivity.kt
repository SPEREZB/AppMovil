package com.example.app1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun enviar_info(view: View) {
        val intent = Intent(this, ActividadRecibir::class.java);
        val Nomb = findViewById<EditText>(R.id.llenarnombre);
        val Fecha = findViewById<EditText>(R.id.llenarfecha);
        val Masculino = findViewById<RadioButton>(R.id.masculino)
        val Femenino = findViewById<RadioButton>(R.id.femenino);
        val Telf = findViewById<EditText>(R.id.llenartelefono);

        val b = Bundle();
        b.putString("NOMBRE", Nomb.getText().toString());
        b.putString("FECHA", Fecha.getText().toString());
        if(Masculino.isChecked){
            b.putString("GENERO", Masculino.getText().toString());
        }else{
            b.putString("GENERO", Femenino.getText().toString());
        }
        b.putString("TELEFONO", Telf.getText().toString());
        intent.putExtras(b);
        startActivity(intent);
    }
}