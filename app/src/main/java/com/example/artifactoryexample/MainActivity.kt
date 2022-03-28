package com.example.artifactoryexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.sentry.Sentry
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ret: Retrofit
        val sentry: Sentry

    }
}