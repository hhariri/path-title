package com.hadihariri.pathtitle

import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.openapi.wm.impl.FrameTitleBuilder

class PathTitleBuilder(val defaultBuilder: FrameTitleBuilder) : FrameTitleBuilder() {


    override fun getProjectTitle(project: Project): String {
        return defaultBuilder.getProjectTitle(project)
    }

    override fun getFileTitle(project: Project, virtualFile: VirtualFile): String {
        return virtualFile.name
    }


}
