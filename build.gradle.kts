android {
    compileSdk = 33
    buildToolsVersion = "33.0.1"
    defaultConfig {
        targetSdk = 33
        minSdk = 33
    }
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.0.0" // Apply the Android plugin without `apply true`
    id("org.jetbrains.kotlin.android") version "1.9.0" // Apply the Kotlin Android plugin
    id("org.jetbrains.kotlin.kapt") version "1.9.0" // Apply the Kotlin Kapt plugin
    id("androidx.navigation.safeargs.kotlin") version "2.7.0" // Apply the Safe Args plugin
}

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.0.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.0")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.7.0")

    }
}

// Apply the Kotlin Android and Kapt plugins explicitly
apply(plugin = "org.jetbrains.kotlin.android")
apply(plugin = "org.jetbrains.kotlin.kapt")