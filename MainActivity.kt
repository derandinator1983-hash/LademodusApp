package com.example.lademodus

import android.content.ActivityNotFoundException
import android.content.ComponentName
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = Intent().apply {
            component = ComponentName(
                "com.asus.mobilemanager",
                "com.asus.mobilemanager.powersaver.ChargingModeActivity"
            )
        }

        try {
            startActivity(intent)
        } catch (e: ActivityNotFoundException) {
            Toast.makeText(
                this,
                "ASUS-Lademodus auf diesem Gerät nicht gefunden.",
                Toast.LENGTH_LONG
            ).show()
        } catch (e: SecurityException) {
            Toast.makeText(
                this,
                "ASUS hat den Zugriff auf diese Seite blockiert.",
                Toast.LENGTH_LONG
            ).show()
        } finally {
            finish()
        }
    }
}
