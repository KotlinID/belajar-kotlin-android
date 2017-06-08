package id.kotlin.app.belajarkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = "Click"
        val next = "Next"
        btnClick.text = text
        btnClick.setOnClickListener { toast("Halo") }
        btnNext.text = next
        btnNext.setOnClickListener { startActivity<DetailActivity>("NAMA" to "Budi") }
    }
}