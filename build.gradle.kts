plugins {
    kotlin("jvm") version "1.9.22"
    id("fabric-loom") version "1.5-SNAPSHOT"
    `maven-publish`
}

val mod_version: String by project
val maven_group: String by project
val archives_base_name: String by project
val minecraft_version: String by project
val yarn_mappings: String by project
val loader_version: String by project
val fabric_api_version: String by project
val fabric_kotlin_version: String by project
val modmenu_version: String by project

version = mod_version
group = maven_group
base.archivesName = archives_base_name

repositories {
    maven("https://maven.terraformersmc.com/releases/")
}

dependencies {
    minecraft("com.mojang:minecraft:$minecraft_version")
    mappings("net.fabricmc:yarn:$yarn_mappings:v2")
    modImplementation("net.fabricmc:fabric-loader:$loader_version")

    modImplementation("net.fabricmc.fabric-api:fabric-api:$fabric_api_version")
    modImplementation("net.fabricmc:fabric-language-kotlin:$fabric_kotlin_version")

    modLocalRuntime("com.terraformersmc:modmenu:$modmenu_version")
}

tasks {
    processResources {
        inputs.property("version", project.version)

        filesMatching("fabric.mod.json") {
            expand("version" to project.version)
        }
    }

    compileJava {
        options.release = 17
    }

    compileKotlin {
        kotlinOptions.jvmTarget = "17"
    }

    jar {
        from("LICENSE") {
            rename { "${it}_${archives_base_name}" }
        }
    }
}

java {
    withSourcesJar()

    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

kotlin {
    jvmToolchain(17)
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }

    repositories {

    }
}