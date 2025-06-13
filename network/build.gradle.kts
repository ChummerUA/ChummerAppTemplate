plugins {
    id(Plugins.Android.library)
    id(Plugins.JetBrains.android)
    id(Plugins.JetBrains.serialization)
    id(Plugins.hilt)
    id(Plugins.ksp)
}

android {
    namespace = "${GradleConfig.namespaceRoot}.network"

    buildTypes {
        defaultConfig {
            multiDexEnabled = true
            compileSdk = GradleConfig.compileSdk
        }

        release {
            isMinifyEnabled = true
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
}

dependencies {
    api(project(mapOf("path" to ":shared")))

    api(Dependencies.Infrastructure.usecase)
    api(Dependencies.Infrastructure.network)

    implementation(Dependencies.Ktor.contentNegotiation)
    implementation(Dependencies.Ktor.jsonSerialization)
    implementation(Dependencies.KotlinX.serialization)

    implementation(Dependencies.Dagger.hilt)
    ksp(Dependencies.Dagger.compiler)
    ksp(Dependencies.Dagger.hiltCompiler)

    coreLibraryDesugaring(Dependencies.desugaring)
}