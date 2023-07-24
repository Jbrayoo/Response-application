package com.example.responseactivity1
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity1 {

    class NewActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main_1)
        }
    }
}
