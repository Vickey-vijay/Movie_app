package com.yandex.div.core.util.inputfilter;

import kotlin.text.Regex;

/* JADX INFO: compiled from: RegexInputFilter.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class RegexInputFilter implements BaseInputFilter {
    private final Regex regex;

    @Override // com.yandex.div.core.util.inputfilter.BaseInputFilter
    public boolean checkValue(String str) {
        return this.regex.matches(str);
    }

    public RegexInputFilter(String str) {
        this.regex = new Regex(str);
    }
}
