plugins {
    id("droidkaigi.primitive.android")
    id("droidkaigi.primitive.android.kotlin")
    id("droidkaigi.primitive.android.compose")
    id("droidkaigi.primitive.android.hilt")
    id("droidkaigi.primitive.detekt")
}

android.namespace = "io.github.droidkaigi.confsched.core.testing"

dependencies {
    implementation(projects.core.model)
    implementation(projects.core.designsystem)
    implementation(projects.core.data)
    implementation(projects.core.ui)
    implementation(projects.feature.main)
    implementation(projects.feature.sessions)
    implementation(libs.daggerHiltAndroidTesting)
    implementation(libs.roborazzi)
    implementation(libs.kermit)
    api(libs.roborazziRule)
    api(libs.robolectric)
    api(libs.composeUiTestJunit4)
    implementation(libs.composeMaterialWindowSize)
}
