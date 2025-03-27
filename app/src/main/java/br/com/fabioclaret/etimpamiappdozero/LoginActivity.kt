package br.com.fabioclaret.etimpamiappdozero

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import br.com.fabioclaret.etimpamiappdozero.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.entrar.setOnClickListener {
            var intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}