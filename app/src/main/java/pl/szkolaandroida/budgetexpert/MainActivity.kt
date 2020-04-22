package pl.szkolaandroida.budgetexpert

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sign_in_button.setOnClickListener {
            val username = username_edit_text.text.toString()
            if(username.isEmpty()) {
                username_error_text_view.text = "Username can't be empty!"
            }
        }
    }
}
