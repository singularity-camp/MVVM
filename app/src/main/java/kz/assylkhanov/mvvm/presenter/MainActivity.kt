package kz.assylkhanov.mvvm.presenter

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kz.assylkhanov.mvvm.R
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

//    private val viewModel: MainViewModel by viewModels<MainViewModel>()
//
//    val classWithoutParams: ClassWithoutParams by inject()
//    val classWithoutParams2: ClassWithoutParams by inject()
//
//    val classWithSeveralParams: ClassWithSeveralParams by inject()
//    val classWithSeveralParams2: ClassWithSeveralParams by inject()
//
//    val analyticsSender: AnalyticsSender by inject {
//        parametersOf("MainActivity")
//    }
//
//    val db: Database by inject()
//
//    private val studentAijan: Student by inject()
//    private val studentAidar: Student by inject()

    private val viewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        viewModel.posts.observe(this) {
            Log.e(TAG, "Posts = $it")
        }

    }

}
