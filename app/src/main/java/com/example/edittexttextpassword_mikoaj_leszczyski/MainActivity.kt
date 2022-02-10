package com.example.edittexttextpassword_mikoaj_leszczyski
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener {
            for (i in 1 until findViewById<EditText>(R.id.haslo_textBox).length()) {
                if((i + 1)< 10){
                    findViewById<TextView>(R.id.haslo_textView).text = "Słabe"
                }
                else if((i + 1)< 15){
                    findViewById<TextView>(R.id.haslo_textView).text = "Średnie"
                }
                else if((i + 1)< 20){
                    findViewById<TextView>(R.id.haslo_textView).text = "Dobre"
                }
                else if((i + 1)< 25){
                    findViewById<TextView>(R.id.haslo_textView).text = "Bardzo Dobre"
                }
            }
        }
    }
}
