package com.horie1024.custom_rules

import com.pinterest.ktlint.core.RuleSet
import com.pinterest.ktlint.core.RuleSetProvider

class CustomRuleSetProvider: RuleSetProvider {
    override fun get(): RuleSet = RuleSet(
        "custom-rules",
        NoVarRule()
    )
}
