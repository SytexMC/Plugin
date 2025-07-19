allprojects {
    apply {
        plugin("java-library")
        plugin("checkstyle")
    }

    group = "me.sytex"
    version = "0.0.1-SNAPSHOT"

    ext { set("javaToolchainVersion", 21) }

    tasks.withType<Jar> {
        archiveBaseName.set(rootProject.name)
    }

    configure<CheckstyleExtension> {
        toolVersion = "10.26.1"
        configDirectory.set(rootProject.file("config/checkstyle"))
        configFile = rootProject.file("config/checkstyle/checkstyle.xml")
        maxWarnings = 0
        maxErrors = 0
    }

    repositories {
        mavenLocal()
        mavenCentral()
        maven("https://repo.papermc.io/repository/maven-public/")
    }
}
