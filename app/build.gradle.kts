plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.my_application_test"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.my_application_test"
        minSdk = 24
        //noinspection EditedTargetSdkVersion
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    packaging {
        resources {
            resources.excludes.add("META-INF/NOTICE.md")
            resources.excludes.add("META-INF/LICENSE.md")
            resources.excludes.add("META-INF/INDEX.LIST")
            resources.excludes.add("META-INF/DEPENDENCIES")
            resources.excludes.add("META-INF/io.netty.versions.properties")
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    // https://mvnrepository.com/artifact/io.appium/java-client
    implementation("io.appium:java-client:8.5.0") {
        exclude(group = "org.seleniumhq.selenium", module = "selenium-java")
        exclude(group = "org.seleniumhq.selenium", module = "selenium-support")
        exclude(group = "org.seleniumhq.selenium", module = "selenium-api")
    }
    implementation("org.seleniumhq.selenium:selenium-java:4.9.1")


}