plugins {
    id("java-library")
    alias(libs.plugins.jetbrains.kotlin.jvm)
}
java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}
kotlin {
    compilerOptions {
        jvmTarget = org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_11
    }
}

dependencies {
    // Retrofit / OkHttp for networking
    api(libs.retrofit)
    api(libs.okhttp)
    api(libs.okhttp.logging)

    // SSE / WebSocket client
    api(libs.okhttp.sse)

    // Kotlin stdlib + coroutines
    api(libs.kotlinx.coroutines.core)
}
