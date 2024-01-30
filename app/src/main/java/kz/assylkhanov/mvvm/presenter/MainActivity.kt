package kz.assylkhanov.mvvm.presenter

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kz.assylkhanov.mvvm.R
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"


    private val viewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val btnGenerate: Button = findViewById(R.id.tv_hello)
        btnGenerate.setOnClickListener {
            viewModel.onCreatePostClick()
        }

        viewModel.posts.observe(this) {
            Log.e(TAG, "Posts = $it")
        }

    }

}
