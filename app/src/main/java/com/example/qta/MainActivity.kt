package com.example.qta

    import android.content.Intent
    import android.os.Bundle
    import android.widget.Button
    import androidx.activity.ComponentActivity

    class MainActivity : ComponentActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val btnLogin = findViewById<Button>(R.id.botonIniciar)

            btnLogin.setOnClickListener {
                val intent = Intent(this, Login::class.java)
                startActivity(intent)
            }

        }
    }