package com.test.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contentReadable = contentResolver

        // it crashes.
        val cursor = contentResolver.query(
                MediaStore.Audio.Media.EXTERNAL_CONTENT_URI,
                null,
                null,
                null,
                "TITLE ASC")   // "title ASC" is ok.

    }
}