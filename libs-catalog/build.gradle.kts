@file:kotlin.Suppress("UNUSED_EXPRESSION")

plugins {
    `javiersc-publish-version-catalog`
}

catalog {
    versionCatalog {
        from(files("$buildDir/catalogs/libs.versions.toml"))
    }
}

// catalog start

// [versions]
val activity = "1.2.3"
val appCompat = "1.3.0"
val browser = "1.3.0"
val core = "1.5.0"
val coroutines = "1.5.0-native-mt"
val dagger = "2.37"
val datetime = "0.2.1"
val either = "0.1.0-alpha.1"
val gson = "2.8.7"
val javierscKamp = "0.1.0"
val jsoup = "1.13.1"
val koin = "3.1.1"
val koinCompose = "3.1.1"
val kotest = "4.6.0"
val kotlinInject = "0.3.5"
val ksp = "1.5.20-1.0.0-beta03"
val ktfmt = "0.26"
val ktor = "1.6.0"
val mokoki = "0.1.0-alpha.4"
val moshi = "1.12.0"
val okHttp = "4.9.1"
val popkorn = "2.1.1"
val retrofit = "2.9.0"
val retrofitKotlinConverter = "0.8.0"
val runBlocking = "0.1.0-alpha.3"
val semanticVersioning = "0.1.0-alpha.1"
val serialization = "1.2.1"
val turbine = "0.5.2"

// [libraries]
"androidx.activity:activity-ktx:$activity"
"androidx.appcompat:appcompat:$appCompat"
"androidx.browser:browser:$browser"
"androidx.core:core-ktx:$core"
"app.cash.turbine:turbine:$turbine"
"cc.popkorn:popkorn-compiler:$popkorn"
"cc.popkorn:popkorn:$popkorn"
"com.facebook:ktfmt:$ktfmt"
"com.google.code.gson:gson:$gson"
"com.google.dagger:hilt-android:$dagger"
"com.google.dagger:hilt-compiler:$dagger"
"com.google.dagger:hilt-core:$dagger"
"com.google.devtools.ksp:symbol-processing-api:$ksp"
"com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:$retrofitKotlinConverter"
"com.javiersc.either:either-core:$either"
"com.javiersc.either:network-core:$either"
"com.javiersc.either:network-logger:$either"
"com.javiersc.either:network-resource:$either"
"com.javiersc.either:resource-core:$either"
"com.javiersc.kamp:scanner:$javierscKamp"
"com.javiersc.mokoki:mokoki-core:$mokoki"
"com.javiersc.mokoki:mokoki-serialization:$mokoki"
"com.javiersc.run-blocking:run-blocking-core:$runBlocking"
"com.javiersc.run-blocking:suspend-test:$runBlocking"
"com.javiersc.semantic-versioning:semantic-versioning-core:$semanticVersioning"
"com.squareup.moshi:moshi:$moshi"
"com.squareup.okhttp3:mockwebserver:$okHttp"
"com.squareup.okhttp3:okhttp:$okHttp"
"com.squareup.retrofit2:retrofit:$retrofit"
"io.insert-koin:koin-android:$koin"
"io.insert-koin:koin-androidx-compose:$koinCompose"
"io.insert-koin:koin-core:$koin"
"io.insert-koin:koin-test:$koin"
"io.kotest:kotest-assertions-core:$kotest"
"io.ktor:ktor-client-cio:$ktor"
"io.ktor:ktor-client-core:$ktor"
"io.ktor:ktor-client-mock:$ktor"
"io.ktor:ktor-client-serialization:$ktor"
"me.tatarka.inject:kotlin-inject-compiler-kapt:$kotlinInject"
"me.tatarka.inject:kotlin-inject-compiler-ksp:$kotlinInject"
"me.tatarka.inject:kotlin-inject-runtime:$kotlinInject"
"org.jetbrains.kotlin:kotlin-reflect"
"org.jetbrains.kotlin:kotlin-test"
"org.jetbrains.kotlin:kotlin-test-common"
"org.jetbrains.kotlin:kotlin-test-junit"
"org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutines"
"org.jetbrains.kotlinx:kotlinx-coroutines-test:$coroutines"
"org.jetbrains.kotlinx:kotlinx-datetime:$datetime"
"org.jetbrains.kotlinx:kotlinx-serialization-core:$serialization"
"org.jetbrains.kotlinx:kotlinx-serialization-json:$serialization"
"org.jsoup:jsoup:$jsoup"

// catalog end
