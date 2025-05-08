package edu.unicauca.aplimovil.safekids

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform

expect class PlatformContext