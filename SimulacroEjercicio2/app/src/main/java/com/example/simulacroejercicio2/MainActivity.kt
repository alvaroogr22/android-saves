package com.example.simulacroejercicio2

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import java.io.IOException
import java.io.OutputStreamWriter
import java.text.SimpleDateFormat
import java.util.Date


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnSave = findViewById<Button>(R.id.btnSave)
        val etUsername = findViewById<EditText>(R.id.etUsername)
        btnSave.setOnClickListener {
            val username = etUsername.text.toString()
            saveUsername(username)
        }

        // Mostrar un Toast
        Toast.makeText(this, "Bienvenido a la aplicación del curso", Toast.LENGTH_SHORT).show()

        // Loggear un mensaje
        Log.d("MainActivity", "La aplicación se ha iniciado correctamente")

        // Mostrar la fecha actual en un CardView usando LayoutInflater
        val cardView = findViewById<CardView>(R.id.cardView)
        val inflater = LayoutInflater.from(this)
        val dateView: View = inflater.inflate(R.layout.layout_date, cardView, false)
        val tvDate = dateView.findViewById<TextView>(R.id.tvDate)
        val sdf = SimpleDateFormat("dd/MM/yyyy")
        val currentDate = sdf.format(Date())
        tvDate.text = currentDate
        cardView.addView(dateView)
    }

    private fun saveUsername(username: String) {
        try {
            val fileOutputStream = openFileOutput("username.txt", MODE_PRIVATE)
            val outputStreamWriter = OutputStreamWriter(fileOutputStream)
            outputStreamWriter.write(
                """
                    Nombre de usuario: $username
                    Fecha de entrada: ${Date()}
                    """.trimIndent()
            )
            outputStreamWriter.close()
            Toast.makeText(this, "Nombre de usuario guardado correctamente", Toast.LENGTH_SHORT)
                .show()
        } catch (e: IOException) {
            e.printStackTrace()
            Toast.makeText(this, "Error al guardar el nombre de usuario", Toast.LENGTH_SHORT).show()
        }
    }
}

