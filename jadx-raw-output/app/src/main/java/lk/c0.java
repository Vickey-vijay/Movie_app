package lk;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: _Strings.kt */
/* JADX INFO: loaded from: classes2.dex */
public class c0 extends b0 {
    public static final String p1(String str, int i10) {
        ck.p.j(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(ik.k.g(i10, str.length()));
            ck.p.i(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static final String q1(String str, int i10) {
        ck.p.j(str, "<this>");
        if (i10 >= 0) {
            return x1(str, ik.k.d(str.length() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static final char r1(CharSequence charSequence) {
        ck.p.j(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(0);
    }

    public static final Character s1(CharSequence charSequence) {
        ck.p.j(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    public static final char t1(CharSequence charSequence) {
        ck.p.j(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(a0.f0(charSequence));
    }

    public static final Character u1(CharSequence charSequence) {
        ck.p.j(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(charSequence.length() - 1));
    }

    public static final CharSequence v1(CharSequence charSequence) {
        ck.p.j(charSequence, "<this>");
        return new StringBuilder(charSequence).reverse();
    }

    public static final char w1(CharSequence charSequence) {
        ck.p.j(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (length == 1) {
            return charSequence.charAt(0);
        }
        throw new IllegalArgumentException("Char sequence has more than one element.");
    }

    public static final String x1(String str, int i10) {
        ck.p.j(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(0, ik.k.g(i10, str.length()));
            ck.p.i(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }
}
