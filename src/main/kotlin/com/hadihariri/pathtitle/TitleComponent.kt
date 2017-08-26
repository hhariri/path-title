package com.hadihariri.pathtitle

import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.components.ApplicationComponent
import org.picocontainer.MutablePicoContainer

class TitleComponent : ApplicationComponent {

    override fun initComponent() {
        val picoContainer = ApplicationManager.getApplication().picoContainer as MutablePicoContainer
        picoContainer.unregisterComponent(FRAME_TITLE_BUILDER)
        picoContainer.registerComponentImplementation(FRAME_TITLE_BUILDER, PathTitleBuilder::class.java)
    }

    override fun disposeComponent() {}

    override fun getComponentName(): String {
        return javaClass.simpleName
    }

    companion object {
        val FRAME_TITLE_BUILDER = "com.intellij.openapi.wm.impl.FrameTitleBuilder"
    }
}
