package com.yandex.div.evaluable.types;

import ck.i;
import ck.p;
import java.util.Locale;
import lk.a;
import lk.a0;

/* JADX INFO: compiled from: Color.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class Color {
    public static final Companion Companion = new Companion(null);
    private final int value;

    /* JADX INFO: compiled from: Color.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        /* JADX INFO: renamed from: argb-H0kstlE, reason: not valid java name */
        public final int m3377argbH0kstlE(int i10, int i11, int i12, int i13) {
            return Color.m3369constructorimpl((i10 << 24) | (i11 << 16) | (i12 << 8) | i13);
        }

        /* JADX INFO: renamed from: parse-C4zCDoM, reason: not valid java name */
        public final int m3378parseC4zCDoM(String str) throws IllegalArgumentException {
            String str2;
            p.j(str, "colorString");
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("Expected color string, actual string is empty".toString());
            }
            if (!(str.charAt(0) == '#')) {
                throw new IllegalArgumentException(("Unknown color " + str).toString());
            }
            int length = str.length();
            if (length == 4) {
                char cCharAt = str.charAt(1);
                char cCharAt2 = str.charAt(2);
                char cCharAt3 = str.charAt(3);
                str2 = new String(new char[]{'f', 'f', cCharAt, cCharAt, cCharAt2, cCharAt2, cCharAt3, cCharAt3});
            } else if (length == 5) {
                char cCharAt4 = str.charAt(1);
                char cCharAt5 = str.charAt(2);
                char cCharAt6 = str.charAt(3);
                char cCharAt7 = str.charAt(4);
                str2 = new String(new char[]{cCharAt4, cCharAt4, cCharAt5, cCharAt5, cCharAt6, cCharAt6, cCharAt7, cCharAt7});
            } else if (length == 7) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ff");
                String strSubstring = str.substring(1);
                p.i(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb2.append(strSubstring);
                str2 = sb2.toString();
            } else {
                if (length != 9) {
                    throw new IllegalArgumentException("Unknown color " + str);
                }
                str2 = str.substring(1);
                p.i(str2, "this as java.lang.String).substring(startIndex)");
            }
            return Color.m3369constructorimpl((int) Long.parseLong(str2, a.a(16)));
        }
    }

    /* JADX INFO: renamed from: alpha-impl, reason: not valid java name */
    public static final int m3366alphaimpl(int i10) {
        return i10 >>> 24;
    }

    /* JADX INFO: renamed from: blue-impl, reason: not valid java name */
    public static final int m3367blueimpl(int i10) {
        return i10 & 255;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Color m3368boximpl(int i10) {
        return new Color(i10);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m3369constructorimpl(int i10) {
        return i10;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3370equalsimpl(int i10, Object obj) {
        return (obj instanceof Color) && i10 == ((Color) obj).m3376unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3371equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: green-impl, reason: not valid java name */
    public static final int m3372greenimpl(int i10) {
        return (i10 >> 8) & 255;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3373hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* JADX INFO: renamed from: red-impl, reason: not valid java name */
    public static final int m3374redimpl(int i10) {
        return (i10 >> 16) & 255;
    }

    public boolean equals(Object obj) {
        return m3370equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3373hashCodeimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3376unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3375toStringimpl(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('#');
        String hexString = Integer.toHexString(i10);
        p.i(hexString, "toHexString(value)");
        String upperCase = a0.w0(hexString, 8, '0').toUpperCase(Locale.ROOT);
        p.i(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        sb2.append(upperCase);
        return sb2.toString();
    }

    public String toString() {
        return m3375toStringimpl(this.value);
    }

    private /* synthetic */ Color(int i10) {
        this.value = i10;
    }
}
