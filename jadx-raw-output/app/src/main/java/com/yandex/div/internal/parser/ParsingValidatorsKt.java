package com.yandex.div.internal.parser;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: ParsingValidators.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ParsingValidatorsKt {
    public static final boolean doesMatch(String str, String str2) {
        return Pattern.matches(str2, str);
    }
}
