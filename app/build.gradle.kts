plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.theapplicationpad.legalonus"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.theapplicationpad.legalonus"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)

    val nav_version = "2.7.7"
    implementation("androidx.navigation:navigation-compose:$nav_version")
    implementation ("androidx.compose.material:material-icons-extended:1.6.7")

    //lottie
    implementation( "com.airbnb.android:lottie-compose:5.2.0")
    debugImplementation(libs.androidx.ui.test.manifest)

    // Gemini
    implementation("com.google.ai.client.generativeai:generativeai:0.4.0")
    // Ui Controller

    implementation("com.google.accompanist:accompanist-systemuicontroller:0.32.0")
    // Pager

    implementation ("com.google.accompanist:accompanist-pager:0.25.1")
//    implementation ("com.google.accompanist:accompanist-pager-indicators:0.25.1")


    val retrofitVersion = "2.11.0"
    implementation ("com.squareup.retrofit2:retrofit:$retrofitVersion")
    implementation ("com.squareup.retrofit2:converter-gson:$retrofitVersion")

    implementation("androidx.compose.runtime:runtime-livedata:1.6.6")

    implementation ("androidx.lifecycle:lifecycle-viewmodel-compose:1.0.0-alpha07")

}