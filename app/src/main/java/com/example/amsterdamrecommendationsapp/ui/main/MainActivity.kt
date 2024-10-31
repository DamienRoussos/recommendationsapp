package com.example.amsterdamrecommendationsapp.ui.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.amsterdamrecommendationsapp.ui.RecommendationsAppScreen
import com.example.amsterdamrecommendationsapp.ui.theme.AmsterdamRecommendationsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AmsterdamRecommendationsAppTheme {
                Surface {
                    RecommendationsAppScreen()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RecommendationPreview() {
    AmsterdamRecommendationsAppTheme {
        RecommendationsAppScreen()
    }
}
