package com.example.firebase

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    lateinit var btn:MaterialButton
    lateinit var data:TextInputEditText


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn=findViewById(R.id.my_button)
        data=findViewById(R.id.input_data)


        btn.setOnClickListener {
            val user_data:String = data.text.toString().trim()

            //Intent intent = new Intent()

            val obj=Intent(this@MainActivity,second::class.java)
            obj.putExtra("All Data",user_data)

            startActivity(obj)
            finish()




        }
    }
}