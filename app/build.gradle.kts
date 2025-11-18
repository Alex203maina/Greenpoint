plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    kotlin("plugin.serialization") version "1.9.0"

}

android {
    namespace = "com.example.greenpoint"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.greenpoint"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
  implementation(libs.androidx.core.ktx)
  implementation(libs.androidx.constraintlayout)
  implementation(libs.androidx.gridlayout)
  testImplementation(libs.junit)
  androidTestImplementation(libs.androidx.junit)
  androidTestImplementation(libs.androidx.espresso.core)
  implementation("androidx.constraintlayout:constraintlayout:2.1.4")
  implementation("com.google.android.material:material:1.9.0")
  implementation("androidx.appcompat:appcompat:1.6.1")
  implementation("io.github.jan-tennert.supabase:gotrue-kt:2.0.0") // Auth
  implementation("io.github.jan-tennert.supabase:postgrest-kt:2.0.0") // Database
  implementation("io.github.jan-tennert.supabase:realtime-kt:2.0.0") // Realtime (optional)
  implementation("io.github.jan-tennert.supabase:storage-kt:2.0.0") // Storage (optional)
  implementation(platform("io.github.jan-tennert.supabase:bom:3.2.3"))
  implementation("io.github.jan-tennert.supabase:postgrest-kt")
  implementation("io.ktor:ktor-client-android:3.2.3")
  implementation("androidx.cardview:cardview:1.0.0")
  implementation("androidx.gridlayout:gridlayout:1.0.0")

}
