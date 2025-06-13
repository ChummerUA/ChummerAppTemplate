plugins {
    id(Plugins.Android.library)
    id(Plugins.JetBrains.android)
    id(Plugins.sqlDelight)
    id(Plugins.hilt)
    id(Plugins.ksp)
}

android {
    namespace = "${GradleConfig.namespaceRoot}.db"

    defaultConfig {
        compileSdk = GradleConfig.compileSdk
        multiDexEnabled = true
    }

    buildTypes {
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

    api(Dependencies.Infrastructure.db)
    implementation(Dependencies.SqlDelight.androidDriver)
    implementation(Dependencies.SqlDelight.adapters)
    implementation(Dependencies.Dagger.hilt)
    ksp(Dependencies.Dagger.compiler)
    ksp(Dependencies.Dagger.hiltCompiler)

    coreLibraryDesugaring(Dependencies.desugaring)
}

sqldelight {
    databases {
        create(GradleConfig.dbName) {
            packageName.set(GradleConfig.namespaceRoot)
            schemaOutputDirectory = file("src/main/sqldelight/databases")
            migrationOutputDirectory = file("src/main/sqldelight/migrations")
            deriveSchemaFromMigrations = true
        }
    }
}