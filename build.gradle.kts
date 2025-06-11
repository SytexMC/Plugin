allprojects {
    group = "me.sytex"
    version = "0.0.1-SNAPSHOT"

    ext { set("javaToolchainVersion", 21) }

    repositories {
        mavenLocal()
        mavenCentral()
        maven("https://repo.papermc.io/repository/maven-public/")
    }
}
