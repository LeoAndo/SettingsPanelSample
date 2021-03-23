package com.template.settingspanelsample

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.view.View
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val startActivityResult =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            Log.d(
                MainActivity::class.java.simpleName,
                "resultCode: ${it.resultCode} data: ${it.data}"
            )
            if (it.resultCode != RESULT_OK) return@registerForActivityResult
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickAction(view: View) {
        val action = when (view.id) {
            R.id.button_internet -> Settings.Panel.ACTION_INTERNET_CONNECTIVITY
            R.id.button_nfc -> Settings.Panel.ACTION_NFC
            R.id.button_volume -> Settings.Panel.ACTION_VOLUME
            R.id.button_wifi -> Settings.Panel.ACTION_WIFI
            else -> throw  IllegalStateException("unknown view id...")
        }
        startActivityResult.launch(Intent().apply { this.action = action })
    }
}