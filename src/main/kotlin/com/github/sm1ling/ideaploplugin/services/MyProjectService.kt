package com.github.sm1ling.ideaploplugin.services

import com.intellij.openapi.project.Project
import com.github.sm1ling.ideaploplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
