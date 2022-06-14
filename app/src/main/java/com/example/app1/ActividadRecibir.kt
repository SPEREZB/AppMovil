package com.example.app1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
class ActividadRecibir : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad_recibir)
        val  recNombre = findViewById<TextView>(R.id.recibirnombre);
        val  recFechas = findViewById<TextView>(R.id.recibirfechanac);
        val  recTelf = findViewById<TextView>(R.id.recibirtelefono);
        val  recGenero = findViewById<TextView>(R.id.recibirgenero);

        val bundle = this.getIntent().getExtras();

        recNombre.setText(bundle?.getString("NOMBRE"));
        recFechas.setText(bundle?.getString("FECHA"));
        recTelf.setText(bundle?.getString("TELEFONO"));
        recGenero.setText(bundle?.getString("GENERO"));
    }

    fun regresar_menu(v: View){
        val intent = Intent(this, MainActivity::class.java);
        startActivity(intent);
    }
}