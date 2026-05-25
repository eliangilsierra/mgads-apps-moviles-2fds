package me.egil.instagramfeed.data

import me.egil.instagramfeed.model.Post
import me.egil.instagramfeed.model.Story

object DataSource {

    fun getPosts(): List<Post> = listOf(
        Post(
            id = 1,
            username = "android_developer",
            profileImageUrl = "https://picsum.photos/seed/user1/200/200",
            imageUrl = "https://picsum.photos/seed/post1/800/800",
            likes = 1_204,
            caption = "Explorando Jetpack Compose 🚀 #Android #Kotlin"
        ),
        Post(
            id = 2,
            username = "kotlin_ninja",
            profileImageUrl = "https://picsum.photos/seed/user2/200/200",
            imageUrl = "https://picsum.photos/seed/post2/800/800",
            likes = 847,
            caption = "Data classes son la mejor feature de Kotlin ❤️",
            isLiked = true
        ),
        Post(
            id = 3,
            username = "compose_ui",
            profileImageUrl = "https://picsum.photos/seed/user3/200/200",
            imageUrl = "https://picsum.photos/seed/post3/800/800",
            likes = 3_456,
            caption = "Material3 + Compose = perfecta combinación 🎨"
        ),
        Post(
            id = 4,
            username = "google_devs",
            profileImageUrl = "https://picsum.photos/seed/user4/200/200",
            imageUrl = "https://picsum.photos/seed/post4/800/800",
            likes = 12_891,
            caption = "Android 15 trae increíbles mejoras de performance! 🏎"
        ),
        Post(
            id = 5,
            username = "mobile_craft",
            profileImageUrl = "https://picsum.photos/seed/user5/200/200",
            imageUrl = "https://picsum.photos/seed/post5/800/800",
            likes = 629,
            caption = "LazyColumn vs RecyclerView: ¿cuál prefieres? 😄"
        ),
        Post(
            id = 6,
            username = "ux_android",
            profileImageUrl = "https://picsum.photos/seed/user6/200/200",
            imageUrl = "https://picsum.photos/seed/post6/800/800",
            likes = 2_185,
            caption = "Animaciones fluidas con animateAsState 🎬",
            isLiked = true
        ),
        Post(
            id = 7,
            username = "dev_colombia",
            profileImageUrl = "https://picsum.photos/seed/user7/200/200",
            imageUrl = "https://picsum.photos/seed/post7/800/800",
            likes = 445,
            caption = "Coil hace super fácil cargar imágenes en Compose 🖼"
        ),
        Post(
            id = 8,
            username = "jetpack_pro",
            profileImageUrl = "https://picsum.photos/seed/user8/200/200",
            imageUrl = "https://picsum.photos/seed/post8/800/800",
            likes = 1_023,
            caption = "Scaffold hace que crear pantallas sea más fácil 🏗️"
        ),
        Post(
            id = 9,
            username = "android_dev_co",
            profileImageUrl = "https://picsum.photos/seed/user9/200/200",
            imageUrl = "https://picsum.photos/seed/post9/800/800",
            likes = 756,
            caption = "LazyRow para scrolls horizontales 👈👉"
        ),
        Post(
            id = 10,
            username = "kotlin_devs",
            profileImageUrl = "https://picsum.photos/seed/user10/200/200",
            imageUrl = "https://picsum.photos/seed/post10/800/800",
            likes = 2_340,
            caption = "Kotlin Coroutines hacen la vida más fácil ⚡"
        )
    )

    fun getStories(): List<Story> = listOf(
        Story(id = 1, username = "Tu historia", profileImageUrl = "", hasSeen = false),
        Story(id = 2, username = "android_dev", profileImageUrl = "https://picsum.photos/seed/s2/200/200"),
        Story(id = 3, username = "kotlin_fan", profileImageUrl = "https://picsum.photos/seed/s3/200/200"),
        Story(id = 4, username = "google_io", profileImageUrl = "https://picsum.photos/seed/s4/200/200", hasSeen = true),
        Story(id = 5, username = "compose_io", profileImageUrl = "https://picsum.photos/seed/s5/200/200"),
        Story(id = 6, username = "dev_notes", profileImageUrl = "https://picsum.photos/seed/s6/200/200", hasSeen = true),
        Story(id = 7, username = "android_tips", profileImageUrl = "https://picsum.photos/seed/s7/200/200")
    )
}
