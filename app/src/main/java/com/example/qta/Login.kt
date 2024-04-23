package com.example.qta

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.qta.databinding.ActivityLoginBinding
import com.google.android.material.textfield.TextInputEditText

class Login : AppCompatActivity() {

    private val usuario = "tylercorrad@gmail.com"
    private val contrasena = "contrasena1234"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val textinputUsuario = findViewById<TextInputEditText>(R.id.textInputEditTextUsuario)
        val textinputContrasena = findViewById<TextInputEditText>(R.id.textInputEditTextContrasena)
        val btnIngresar = findViewById<Button>(R.id.btonIngresar)

        val textoError = findViewById<TextView>(R.id.textoError)

        btnIngresar.setOnClickListener{
            val usuario1 = textinputUsuario.text.toString()
            val contrasena1 = textinputContrasena.text.toString()

            if(usuario1 == usuario && contrasena1 == contrasena){
                val intent = Intent(this, ActividadBottomDrawer::class.java)
                intent.putExtra("USUARIO", usuario1)
                startActivity(intent)
        }else{
            textoError.setText("el usuario o la contrasena no son correctos")

            }
        }



    }
}