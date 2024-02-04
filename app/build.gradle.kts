plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("kotlin-parcelize")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.suretrustapp.suretrust"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.suretrustapp.suretrust"
        minSdk = 24
        targetSdk = 33
        versionCode = 3
        versionName = "2.0.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isShrinkResources = false
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.0"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")


    //multidex utility
    val multiDexVersion = "2.0.1"
    implementation("androidx.multidex:multidex:$multiDexVersion")

    //room
    val roomVersion = "2.5.1"
    implementation("androidx.room:room-runtime:$roomVersion") { exclude(group = "org.xerial") }
    kapt("androidx.room:room-compiler:$roomVersion") { exclude(group = "org.xerial") }
    implementation("androidx.room:room-ktx:$roomVersion") { exclude(group = "org.xerial") }
    implementation("org.xerial:sqlite-jdbc:3.42.0.0")

    // Compose
    implementation("androidx.compose.ui:ui:1.4.3")
    implementation("androidx.compose.ui:ui-tooling:1.4.3")
    implementation("androidx.compose.ui:ui-tooling-preview:1.4.3")
    implementation("androidx.compose.material3:material3:1.1.1")
    implementation("androidx.compose.material:material:1.4.3")
    implementation("androidx.activity:activity-compose:1.7.2")
    implementation("androidx.constraintlayout:constraintlayout-compose:1.0.1")
    implementation("androidx.compose.runtime:runtime-livedata:1.4.3")

    //Timber
    implementation("com.jakewharton.timber:timber:5.0.1")

    //swipe to refresh
    implementation("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")

    //Coil
    implementation("io.coil-kt:coil:2.4.0")

    //hilt
    implementation("com.google.dagger:hilt-android:2.47")
    kapt("com.google.dagger:hilt-android-compiler:2.47")
    implementation("androidx.hilt:hilt-navigation-compose:1.0.0")

    //retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-moshi:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.google.code.gson:gson:2.10.1")

    //okhttp
    implementation("com.squareup.okhttp3:okhttp:5.0.0-alpha.11")
    implementation("com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.11")

    //navigation
    val nav_version_ktx = "2.7.6"
    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version_ktx")
    implementation("androidx.navigation:navigation-ui-ktx:$nav_version_ktx")

    //circular image library
    implementation("de.hdodenhof:circleimageview:3.1.0")

    //Splitties
    val splittiesVersion = "3.0.0"
    implementation("com.louiscad.splitties:splitties-preferences:$splittiesVersion")
}