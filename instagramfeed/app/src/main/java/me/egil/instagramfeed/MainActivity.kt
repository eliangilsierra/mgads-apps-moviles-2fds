package me.egil.instagramfeed

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import me.egil.instagramfeed.ui.screens.FeedScreen
import me.egil.instagramfeed.ui.theme.InstagramFeedTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstagramFeedTheme {
                FeedScreen()
            }
        }
    }
}
