plugins {
    id("java-library")
    alias(libs.plugins.jetbrains.kotlin.jvm)
    alias(libs.plugins.kotlin.kapt)
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
    implementation(project(":domain"))
    implementation(project(":core"))

    // Room (local DB)
//    implementation(libs.room.runtime)
//    implementation(libs.room.ktx)
//    ksp(libs.room.compiler)


    // Retrofit + OkHttp (remote API)
    implementation(libs.retrofit)
    implementation(libs.okhttp)
    implementation(libs.gson)

    // Coroutines
    implementation(libs.kotlinx.coroutines.core)
}
