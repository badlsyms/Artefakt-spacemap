plugins { id("com.android.application") }
android {
 namespace = "cz.artefaktlab.spacemap"
 compileSdk = 35
 defaultConfig { applicationId = "cz.artefaktlab.spacemap"; minSdk = 26; targetSdk = 35; versionCode = 2; versionName = "0.1.1" }
 compileOptions { sourceCompatibility = JavaVersion.VERSION_17; targetCompatibility = JavaVersion.VERSION_17 }
 buildTypes { release { isMinifyEnabled = false } }
}