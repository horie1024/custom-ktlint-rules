package com.horie1024.custom_rules

import com.google.common.truth.Truth.assertThat
import com.pinterest.ktlint.core.LintError
import com.pinterest.ktlint.test.lint
import org.junit.Test

class NoVarRuleTest {

    @Test
    fun test() {
        assertThat(
            NoVarRule().lint(
                """
                    val foo = 0
                    var bar = 1
                """
                    .trimIndent()
            )
        ).containsExactly(
            LintError(
                2, 1, "no-var",
                "\uD83D\uDE31 Unexpected var, use val instead \uD83C\uDFC4\u200D"
            )
        )
    }

}
