package pl.dsw.baism

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val result = Calculator.add(2, 2)
        findViewById<TextView>(R.id.resultText).text =
            getString(R.string.result_format, result)
    }
}
