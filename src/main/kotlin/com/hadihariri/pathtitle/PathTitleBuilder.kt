package com.hadihariri.pathtitle

import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.openapi.wm.impl.FrameTitleBuilder

class PathTitleBuilder : FrameTitleBuilder() {

    override fun getProjectTitle(project: Project): String {
        return ""
    }

    override fun getFileTitle(project: Project, virtualFile: VirtualFile): String {
        return "[${project.name}] ${virtualFile.canonicalPath?.replace(project.basePath ?: "", "")}"
    }

}
