plugins {
    id(Plugins.Android.application)
    id(Plugins.JetBrains.android)
    id(Plugins.hilt)
    id(Plugins.ksp)
    id(Plugins.googleServices)
    kotlin(Plugins.serialization)
}

android {
    namespace = GradleConfig.namespaceRoot
    compileSdk = GradleConfig.compileSdk

    defaultConfig {
        applicationId = GradleConfig.namespaceRoot
        minSdk = GradleConfig.minSdk
        targetSdk = GradleConfig.compileSdk
        versionCode = 1
        versionName = "1.0"
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
        isCoreLibraryDesugaringEnabled = true
        sourceCompatibility = GradleConfig.javaVersion
        targetCompatibility = GradleConfig.javaVersion
    }
    kotlinOptions {
        jvmTarget = GradleConfig.jvmTarget
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Dependencies.Compose.compilerVersion
    }
}

dependencies {
    api(project(mapOf("path" to ":shared")))
    api(project(mapOf("path" to ":db")))
    api(project(mapOf("path" to ":network")))
    api(project(mapOf("path" to ":preferences")))

//    implementation(Dependencies.Compose.compiler)
    implementation(Dependencies.Compose.runtime)
    implementation(Dependencies.Compose.foundation)
    implementation(Dependencies.Compose.ui)
    implementation(Dependencies.Compose.preview)
//    implementation(Dependencies.Compose.animation)
//    implementation(Dependencies.Compose.material)

    implementation(Dependencies.AndroidX.core)
    implementation(Dependencies.AndroidX.appCompat)

    implementation(Dependencies.AndroidX.Lifecycle.process)
    implementation(Dependencies.AndroidX.Lifecycle.runtime)
    implementation(Dependencies.AndroidX.Lifecycle.viewModelCompose)

    implementation(Dependencies.AndroidX.Activity.compose)
    implementation(Dependencies.AndroidX.Activity.ktx)
    implementation(Dependencies.AndroidX.composeNavigation)

    implementation(Dependencies.AndroidX.Hilt.compose)
    implementation(Dependencies.AndroidX.Hilt.common)

    implementation(Dependencies.Dagger.hilt)
    ksp(Dependencies.Dagger.hiltCompiler)
    implementation(Dependencies.AndroidX.Hilt.work)
    ksp(Dependencies.AndroidX.Hilt.compiler)

    implementation(Dependencies.KotlinX.immutableCollections)

    implementation(Dependencies.AndroidX.work)
    coreLibraryDesugaring(Dependencies.desugaring)
//
//    implementation(platform(Dependencies.Firebase.bom))
//    implementation(Dependencies.Firebase.analytics)
}