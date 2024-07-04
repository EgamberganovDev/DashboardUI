package uz.mobidev.dashboardui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.WindowInsetsControllerCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myenableEdgeToEdge()
    }

    private fun myenableEdgeToEdge() {
        val window = this.window ?: return
        val controller = WindowInsetsControllerCompat(window, window.decorView)
        controller.isAppearanceLightStatusBars = false
        controller.isAppearanceLightNavigationBars = false
        window.statusBarColor = ContextCompat.getColor(this, R.color.test1)
        window.navigationBarColor = ContextCompat.getColor(this, R.color.test2)
    }
}