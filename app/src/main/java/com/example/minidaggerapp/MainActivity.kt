package com.example.minidaggerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.minidaggerapp.di.module.ActivityModule
import com.example.minidaggerapp.ui.theme.MiniDaggerAppTheme
import javax.inject.Inject

class MainActivity : ComponentActivity() {

    @Inject
    lateinit var viewModel: MainViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        getDependencies()


        setContent {
            MiniDaggerAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }

    private fun getDependencies() {
        val applicationComponent = (application as MyApplication).applicationComponent


        // Build the ActivityComponent
        DaggerActivityComponent.builder()
            .applicationComponent(applicationComponent) // Pass the ApplicationComponent
            .activityModule(ActivityModule(this)) // Provide the ActivityModule
            .build()
            .inject(this)

    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MiniDaggerAppTheme {
        Greeting("Android")
    }
}