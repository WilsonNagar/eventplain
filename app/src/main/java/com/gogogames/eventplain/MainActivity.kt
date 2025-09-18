package com.gogogames.eventplain

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold{ it->
                Column(modifier = Modifier.padding(it)) {
                    Text("Welcome")
                    Spacer(modifier = Modifier.height(20.dp))
                    Button(
                        onClick = {  }
                    ) {
                        Text(" Main Activity")
                    }
                }
            }
//            EventPlainTheme {
//                val navController = rememberNavController()
//                AppNavGraph(navController)
//            }
        }
    }
}