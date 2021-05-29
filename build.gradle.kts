plugins {
    val kotlinVersion = "1.4.30"
    kotlin("jvm") version kotlinVersion
    kotlin("plugin.serialization") version kotlinVersion

    id("net.mamoe.mirai-console") version "2.6.4"
}

group = "com.orisland"
version = "1.0-SNAPSHOT"

repositories {
    maven("https://maven.aliyun.com/repository/public")
    mavenCentral()
}

dependencies {
    // 开发时使用 mirai-core-api，运行时提供 mirai-core

//    api("net.mamoe:mirai-core-api:2.6.4")
//    api("net.mamoe:mirai-console-terminal:2.6.4")
//    runtimeOnly("net.mamoe:mirai-core:2.6.4")

    // 可以简单地只添加 api("net.mamoe:mirai-core:2.6.1")
}