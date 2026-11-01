package lk;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Locale;

/* JADX INFO: compiled from: CharJVM.kt */
/* JADX INFO: loaded from: classes11.dex */
public class a {
    public static final int a(int i10) {
        boolean z10 = false;
        if (2 <= i10 && i10 < 37) {
            z10 = true;
        }
        if (z10) {
            return i10;
        }
        throw new IllegalArgumentException("radix " + i10 + " was not in valid range " + new ik.i(2, 36));
    }

    public static final String d(char c10, Locale locale) {
        ck.p.j(locale, CommonUrlParts.LOCALE);
        String strValueOf = String.valueOf(c10);
        ck.p.h(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strValueOf.toLowerCase(locale);
        ck.p.i(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static final String e(char c10, Locale locale) {
        ck.p.j(locale, CommonUrlParts.LOCALE);
        String strF = f(c10, locale);
        if (strF.length() <= 1) {
            String strValueOf = String.valueOf(c10);
            ck.p.h(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            ck.p.i(upperCase, "toUpperCase(...)");
            return !ck.p.e(strF, upperCase) ? strF : String.valueOf(Character.toTitleCase(c10));
        }
        if (c10 == 329) {
            return strF;
        }
        char cCharAt = strF.charAt(0);
        ck.p.h(strF, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = strF.substring(1);
        ck.p.i(strSubstring, "substring(...)");
        ck.p.h(strSubstring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
        ck.p.i(lowerCase, "toLowerCase(...)");
        return cCharAt + lowerCase;
    }

    public static final String f(char c10, Locale locale) {
        ck.p.j(locale, CommonUrlParts.LOCALE);
        String strValueOf = String.valueOf(c10);
        ck.p.h(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(locale);
        ck.p.i(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public static final int b(char c10, int i10) {
        return Character.digit((int) c10, i10);
    }

    public static final boolean c(char c10) {
        if (!Character.isWhitespace(c10) && !Character.isSpaceChar(c10)) {
            return false;
        }
        return true;
    }
}
