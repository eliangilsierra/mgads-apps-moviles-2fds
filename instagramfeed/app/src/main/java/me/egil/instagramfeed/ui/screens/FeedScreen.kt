package me.egil.instagramfeed.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Send
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.egil.instagramfeed.data.DataSource
import me.egil.instagramfeed.ui.components.PostCard
import me.egil.instagramfeed.ui.components.StoriesRow

@Composable
fun FeedScreen() {
    val posts = remember { DataSource.getPosts() }
    val stories = remember { DataSource.getStories() }

    Scaffold(
        topBar = { InstagramTopBar() }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            state = rememberLazyListState()
        ) {
            item(key = "stories_row") {
                StoriesRow(stories = stories)
                HorizontalDivider()
            }

            items(
                items = posts,
                key = { post -> post.id }
            ) { post ->
                PostCard(
                    post = post,
                    onLikeClick = { likedPost ->
                        android.util.Log.d("Feed", "Like en: ${likedPost.username}")
                    }
                )
            }

            item(key = "end_of_feed") {
                Text(
                    text = "— Has llegado al final 🎉 —",
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 24.dp),
                    color = Color.Gray,
                    fontSize = 13.sp
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InstagramTopBar() {
    TopAppBar(
        title = {
            Text(
                text = "Instagram",
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Bold,
                fontSize = 26.sp,
                fontFamily = FontFamily.Cursive
            )
        },
        actions = {
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Outlined.FavoriteBorder,
                    contentDescription = "Notificaciones"
                )
            }
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Outlined.Send,
                    contentDescription = "Mensajes"
                )
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.White
        )
    )
}
