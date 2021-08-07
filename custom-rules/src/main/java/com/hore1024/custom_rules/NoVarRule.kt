package com.hore1024.custom_rules

import com.pinterest.ktlint.core.Rule
import com.pinterest.ktlint.core.ast.ElementType
import org.jetbrains.kotlin.com.intellij.lang.ASTNode

class NoVarRule : Rule("no-var") {
    override fun visit(node: ASTNode, autoCorrect: Boolean, emit: (offset: Int, errorMessage: String, canBeAutoCorrected: Boolean) -> Unit) {
        if (node.elementType == ElementType.VAR_KEYWORD) {
            emit(node.startOffset, "😱 Unexpected var, use val instead 🏄‍", false)
        }
    }
}
