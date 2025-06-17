object Dependencies {
    const val gradleVersion = "8.9.2"
    const val kotlinVersion = "2.1.21"
    const val kspVersion = "2.1.21-2.0.1"
    private const val ktxVersion = "1.10.1"
    const val googleServicesVersion = "4.4.2"
    private const val composeNavigationVersion = "2.9.0"

    const val gradle = "com.android.tools.build:gradle:${gradleVersion}"

    const val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:${kotlinVersion}"
    const val desugaring = "com.android.tools:desugar_jdk_libs:2.0.3"

    object AndroidX {
        const val core = "androidx.core:core-ktx:${ktxVersion}"
        const val composeNavigation =
            "androidx.navigation:navigation-compose:$composeNavigationVersion"
        const val work = "androidx.work:work-runtime-ktx:2.10.1"
        const val appCompat = "androidx.appcompat:appcompat:1.7.1"

        object Activity {
            private const val root = "androidx.activity"
            private const val version = "1.8.0"
            const val ktx = "$root:activity-ktx:$ktxVersion"
            const val compose = "$root:activity-compose:$version"
        }

        object Lifecycle {
            private const val root = "androidx.lifecycle"
            private const val version = ""
            const val process = "$root:lifecycle-process:$version"
            const val runtime = "$root:lifecycle-runtime-ktx:$version"
            const val viewModelCompose = "$root:lifecycle-viewmodel-compose:$version"
        }

        object Hilt {
            private const val root = "androidx.hilt"
            private const val hiltVersion = "1.1.0-alpha01"
            const val compiler = "$root:hilt-compiler:$hiltVersion"
            const val work = "$root:hilt-work:$hiltVersion"
            const val common = "$root:hilt-common:$hiltVersion"
            const val compose = "$root:hilt-navigation-compose:$hiltVersion"
        }
    }

    object Ktor {
        private const val root = "io.ktor"
        private const val version = "2.3.2"
        const val core = "$root:ktor-client-core:${version}"
        const val okhttp = "$root:ktor-client-okhttp:${version}"
        const val contentNegotiation = "$root:ktor-client-content-negotiation:${version}"
        const val jsonSerialization = "$root:ktor-serialization-kotlinx-json:${version}"
    }

    object SqlDelight {
        private const val root = "app.cash.sqldelight"
        const val version = "2.0.0"

        const val androidDriver = "$root:android-driver:$version"
        const val gradle = "$root:gradle-plugin:${version}"
        const val adapters = "$root:primitive-adapters:${version}"
    }

    object KotlinX {
        private const val root = "org.jetbrains.kotlinx"
        private const val coroutinesVersion = "1.7.1"
        const val jsonSerializationVersion = "1.6.0"

        const val coroutines =
            "$root:kotlinx-coroutines-android:${coroutinesVersion}"
        const val serialization =
            "$root:kotlinx-serialization-json:${jsonSerializationVersion}"
        const val immutableCollections = "$root:kotlinx-collections-immutable:0.3.6"
    }

    object DataStore {
        private const val version = "1.1.7"
        const val dataStore = "androidx.datastore:datastore-preferences:$version"
    }

    object Compose {
        private const val root = "androidx.compose"
        private const val version = "1.5.2"
        const val compilerVersion = "1.5.3"

        const val foundation = "$root.foundation:foundation:${version}"
        const val runtime = "$root.runtime:runtime:${version}"
        const val ui = "$root.ui:ui:${version}"
        const val preview = "$root.ui:ui-tooling:${version}"
    }

    object Lifecycle {
        const val root = "androidx.lifecycle"
        const val version = ""
        const val runtime = "$root:lifecycle-runtime-ktx:${version}"
    }

    object Dagger {
        const val daggerVersion = "2.48.1"
        private const val root = "com.google.dagger"
        const val hilt = "$root:hilt-android:${daggerVersion}"
        const val hiltClassPath = "$root:hilt-android-gradle-plugin:${daggerVersion}"
        const val compiler = "$root:dagger-compiler:${daggerVersion}"
        const val hiltCompiler = "$root:hilt-compiler:${daggerVersion}"
    }

    object AssistedInject {
        private const val version = "0.5.2"
        const val root = "com.squareup.inject"
        const val injections = "$root:assisted-inject-annotations-dagger2:${version}"
        const val processor = "$root:assisted-inject-processor-dagger2:${version}"
    }

    object Infrastructure {
        private const val root = "com.chummer.infrastructure"
        private const val version = "1.0.0"

        const val usecase = "$root:usecase:$version"
        const val db = "$root:db:$version"
        const val network = "$root:network:$version"
        const val preferences = "$root:preferences:$version"
    }

    object Firebase {
        const val bom = "com.google.firebase:firebase-bom:33.15.0"
        const val analytics = "com.google.firebase:firebase-analytics"
    }
}
