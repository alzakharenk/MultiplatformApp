package com.example.multiplatformapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform