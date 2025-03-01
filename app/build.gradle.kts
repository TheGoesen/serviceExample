plugins {
    application
}
application{
    mainClass= "org.example.app.Main"
}

dependencies{
    runtimeOnly(project(":libImpl"))
}


