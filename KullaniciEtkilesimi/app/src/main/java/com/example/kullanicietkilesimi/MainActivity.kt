package com.example.kullanicietkilesimi

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kullanicietkilesimi.databinding.ActivityMainBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonToast.setOnClickListener{

            Toast.makeText(this,"merhaba",Toast.LENGTH_SHORT).show()
        }
        binding.buttonSnackbar.setOnClickListener{

            Snackbar.make(it,"silmek istiyor musunuz",Snackbar.LENGTH_SHORT)

                .setAction("EVET"){
                    Toast.makeText(this,"Silindi",Toast.LENGTH_SHORT).show()
                }
                .setTextColor(Color.RED)
                .setActionTextColor(Color.BLUE)
                .setBackgroundTint(Color.WHITE)
                .show()
        }
        binding.buttonDialog.setOnClickListener{
            MaterialAlertDialogBuilder(this)
                .setTitle("mesaj ")
                .setMessage("merhaba")
                .setPositiveButton("Tamam"){d,i ->
                    Toast.makeText(this,"Tamam seçildi",Toast.LENGTH_SHORT).show()
                }
                .setNegativeButton("Hayır") {d,i ->
                    Toast.makeText(this,"Hayır seçildi",Toast.LENGTH_SHORT).show()
                }.show()


        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}