package lk;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Comparator;
import java.util.Locale;

/* JADX INFO: compiled from: StringsJVM.kt */
/* JADX INFO: loaded from: classes10.dex */
public class x extends w {
    public static final boolean A(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        return z10 ? a0.Y(charSequence, charSequence2) : z(charSequence, charSequence2);
    }

    public static final String B(byte[] bArr) {
        ck.p.j(bArr, "<this>");
        return new String(bArr, c.f63591b);
    }

    public static final boolean C(String str, String str2, boolean z10) {
        ck.p.j(str, "<this>");
        ck.p.j(str2, "suffix");
        return !z10 ? str.endsWith(str2) : H(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static /* synthetic */ boolean D(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return C(str, str2, z10);
    }

    public static final boolean E(String str, String str2, boolean z10) {
        if (str == null) {
            return str2 == null;
        }
        return !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ boolean F(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return E(str, str2, z10);
    }

    public static final Comparator<String> G(ck.w wVar) {
        ck.p.j(wVar, "<this>");
        Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
        ck.p.i(comparator, "CASE_INSENSITIVE_ORDER");
        return comparator;
    }

    public static final boolean H(String str, int i10, String str2, int i11, int i12, boolean z10) {
        ck.p.j(str, "<this>");
        ck.p.j(str2, "other");
        return !z10 ? str.regionMatches(i10, str2, i11, i12) : str.regionMatches(z10, i10, str2, i11, i12);
    }

    public static /* synthetic */ boolean I(String str, int i10, String str2, int i11, int i12, boolean z10, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z10 = false;
        }
        return H(str, i10, str2, i11, i12, z10);
    }

    public static final String J(CharSequence charSequence, int i10) {
        ck.p.j(charSequence, "<this>");
        int i11 = 1;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + '.').toString());
        }
        if (i10 == 0) {
            return "";
        }
        if (i10 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                cArr[i12] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb2 = new StringBuilder(charSequence.length() * i10);
        if (1 <= i10) {
            while (true) {
                sb2.append(charSequence);
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        String string = sb2.toString();
        ck.p.g(string);
        return string;
    }

    public static final String K(String str, char c10, char c11, boolean z10) {
        ck.p.j(str, "<this>");
        if (!z10) {
            String strReplace = str.replace(c10, c11);
            ck.p.i(strReplace, "replace(...)");
            return strReplace;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (b.h(cCharAt, c10, z10)) {
                cCharAt = c11;
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    public static final String L(String str, String str2, String str3, boolean z10) {
        ck.p.j(str, "<this>");
        ck.p.j(str2, "oldValue");
        ck.p.j(str3, "newValue");
        int i10 = 0;
        int iH0 = a0.h0(str, str2, 0, z10);
        if (iH0 < 0) {
            return str;
        }
        int length = str2.length();
        int iD = ik.k.d(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        do {
            sb2.append((CharSequence) str, i10, iH0);
            sb2.append(str3);
            i10 = iH0 + length;
            if (iH0 >= str.length()) {
                break;
            }
            iH0 = a0.h0(str, str2, iH0 + iD, z10);
        } while (iH0 > 0);
        sb2.append((CharSequence) str, i10, str.length());
        String string = sb2.toString();
        ck.p.i(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String M(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return K(str, c10, c11, z10);
    }

    public static /* synthetic */ String N(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return L(str, str2, str3, z10);
    }

    public static final boolean O(String str, String str2, int i10, boolean z10) {
        ck.p.j(str, "<this>");
        ck.p.j(str2, "prefix");
        return !z10 ? str.startsWith(str2, i10) : H(str, i10, str2, 0, str2.length(), z10);
    }

    public static final boolean P(String str, String str2, boolean z10) {
        ck.p.j(str, "<this>");
        ck.p.j(str2, "prefix");
        return !z10 ? str.startsWith(str2) : H(str, 0, str2, 0, str2.length(), z10);
    }

    public static /* synthetic */ boolean Q(String str, String str2, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return O(str, str2, i10, z10);
    }

    public static /* synthetic */ boolean R(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return P(str, str2, z10);
    }

    public static final String v(String str) {
        ck.p.j(str, "<this>");
        Locale locale = Locale.getDefault();
        ck.p.i(locale, "getDefault(...)");
        return w(str, locale);
    }

    public static final String w(String str, Locale locale) {
        ck.p.j(str, "<this>");
        ck.p.j(locale, CommonUrlParts.LOCALE);
        if (!(str.length() > 0)) {
            return str;
        }
        char cCharAt = str.charAt(0);
        if (!Character.isLowerCase(cCharAt)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char titleCase = Character.toTitleCase(cCharAt);
        if (titleCase != Character.toUpperCase(cCharAt)) {
            sb2.append(titleCase);
        } else {
            String strSubstring = str.substring(0, 1);
            ck.p.i(strSubstring, "substring(...)");
            ck.p.h(strSubstring, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strSubstring.toUpperCase(locale);
            ck.p.i(upperCase, "toUpperCase(...)");
            sb2.append(upperCase);
        }
        String strSubstring2 = str.substring(1);
        ck.p.i(strSubstring2, "substring(...)");
        sb2.append(strSubstring2);
        return sb2.toString();
    }

    public static final String x(char[] cArr) {
        ck.p.j(cArr, "<this>");
        return new String(cArr);
    }

    public static final String y(char[] cArr, int i10, int i11) {
        ck.p.j(cArr, "<this>");
        nj.d.Companion.a(i10, i11, cArr.length);
        return new String(cArr, i10, i11 - i10);
    }

    public static final boolean z(CharSequence charSequence, CharSequence charSequence2) {
        return (!(charSequence instanceof String) || charSequence2 == null) ? a0.Z(charSequence, charSequence2) : ((String) charSequence).contentEquals(charSequence2);
    }
}
