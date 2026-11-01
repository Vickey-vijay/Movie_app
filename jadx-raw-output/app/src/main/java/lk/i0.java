package lk;

import java.util.Locale;

/* JADX INFO: compiled from: _OneToManyTitlecaseMappings.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class i0 {
    public static final String a(char c10) {
        String strValueOf = String.valueOf(c10);
        ck.p.h(strValueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = strValueOf.toUpperCase(locale);
        ck.p.i(upperCase, "toUpperCase(...)");
        if (upperCase.length() > 1) {
            if (c10 != 329) {
                char cCharAt = upperCase.charAt(0);
                ck.p.h(upperCase, "null cannot be cast to non-null type java.lang.String");
                String strSubstring = upperCase.substring(1);
                ck.p.i(strSubstring, "substring(...)");
                ck.p.h(strSubstring, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = strSubstring.toLowerCase(locale);
                ck.p.i(lowerCase, "toLowerCase(...)");
                return cCharAt + lowerCase;
            }
            return upperCase;
        }
        return String.valueOf(Character.toTitleCase(c10));
    }
}
