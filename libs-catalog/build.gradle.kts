import internal.groupId

plugins {
    `publish-catalog`
}

group = groupId

catalog {
    versionCatalog {
        from(files("$buildDir/catalogs/libs.versions.toml"))
    }
}

// catalog start

// [versions]
val coroutines = "1.4.3-native-mt"
val kotest = "4.4.3"
val kotlin = "1.4.31"
val ktor = "1.5.2"
val okHttp = "4.9.1"
val retrofit = "2.9.0"
val retrofitKotlinConverter = "0.8.0"
val runBlocking = "0.1.0-alpha.1"
val serialization = "1.1.0"
val turbine = "0.4.1"

// [libraries]
"app.cash.turbine:turbine:$turbine"
"com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:$retrofitKotlinConverter"
"com.javiersc.run-blocking:run-blocking:$runBlocking"
"com.javiersc.run-blocking:suspend-test:$runBlocking"
"com.squareup.okhttp3:mockwebserver:$okHttp"
"com.squareup.okhttp3:okhttp:$okHttp"
"com.squareup.retrofit2:retrofit:$retrofit"
"io.kotest:kotest-assertions-core:$kotest"
"io.ktor:ktor-client-cio:$ktor"
"io.ktor:ktor-client-core:$ktor"
"io.ktor:ktor-client-mock:$ktor"
"io.ktor:ktor-client-serialization:$ktor"
"org.jetbrains.kotlin:kotlin-test-multiplatform:$kotlin"
"org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutines"
"org.jetbrains.kotlinx:kotlinx-serialization-core:$serialization"
"org.jetbrains.kotlinx:kotlinx-serialization-json:$serialization"

// catalog end
