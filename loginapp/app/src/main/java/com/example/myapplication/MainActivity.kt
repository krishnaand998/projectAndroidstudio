package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.ads.mediationtestsuite.activities.HomeActivity

class MainActivity : AppCompatActivity() {

    private lateinit var usernameTextView: TextView
    private lateinit var passwordTextView: EditText
    private lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usernameTextView = findViewById(R.id.usernameTextView)
        passwordTextView = findViewById(R.id.passwordTextView)
        loginButton = findViewById(R.id.loginButton)

        loginButton.setOnClickListener {
            val username = usernameTextView.text.toString()
            val password = passwordTextView.text.toString()

            if (isValidCredentials(username, password)) {
                // Jalankan kode untuk melanjutkan ke halaman utama
                startActivity(Intent(this, HomeActivity::class.java))
            } else {
                // Tampilkan pesan error
                Toast.makeText(this, "Username atau password salah", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun isValidCredentials(username: String, password: String): Boolean {
        // Simulasikan proses verifikasi kredensial
        // Anda dapat mengganti kode ini dengan proses verifikasi yang sebenarnya
        return username == "admin" && password == "password"
    }
}