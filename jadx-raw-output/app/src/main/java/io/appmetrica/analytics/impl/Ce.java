package io.appmetrica.analytics.impl;

import java.io.IOException;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes2.dex */
public final class Ce implements InterfaceC4335l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55099a = 10;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55100b = 13;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Regex f55101c = new Regex("^[0-9()\\-+\\s]+$");

    @Override // io.appmetrica.analytics.impl.InterfaceC4335l2
    public final String a(String str) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        int length2 = string.length();
        Character chS1 = lk.c0.s1(str);
        Character chS2 = lk.c0.s1(string);
        if (length2 < this.f55099a || length2 > this.f55100b || ((chS2 != null && chS2.charValue() == '0') || !this.f55101c.matches(str))) {
            return null;
        }
        if (length2 == 10 && (chS1 == null || chS1.charValue() != '+')) {
            return com.ironsource.Gc.f26641e.concat(string);
        }
        if (length2 == 11) {
            if (chS1 != null && chS1.charValue() == '+' && chS2 != null && chS2.charValue() == '8') {
                return null;
            }
            if (chS2 != null && chS2.charValue() == '8') {
                return com.ironsource.Gc.f26641e + string.substring(1);
            }
        }
        if (length2 < 12 || chS1 == null || chS1.charValue() != '+' || chS2 == null || chS2.charValue() != '7') {
            return string;
        }
        return null;
    }
}
