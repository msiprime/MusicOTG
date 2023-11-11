buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
       // classpath ("com.google.gms:google-services:4.4.0")
        classpath("com.android.tools.build:gradle:7.0.4")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.44")
    }
}
plugins {
    id("com.android.application") version "8.1.2" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
    id ("com.android.library") version "7.4.0" apply false
}