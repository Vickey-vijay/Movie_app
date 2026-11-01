package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public final class dt {

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private static int f1853 = 1;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static char f1854;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f1855;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static char f1856;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static char f1857;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static char[] f1858;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char f1859;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static final Pattern f1860;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static final List<String> f1861;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static final Pattern f1862;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static final Pattern f1863;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static final Pattern f1864;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static final Pattern f1865;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static final Pattern f1866;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static final Pattern f1867;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static final Pattern f1868;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2100(String str) {
        int i10 = f1853 + 9;
        f1855 = i10 % 128;
        int i11 = i10 % 2;
        String strSubstring = str.substring(1, str.length() - 1);
        int i12 = f1853 + 115;
        f1855 = i12 % 128;
        int i13 = i12 % 2;
        return strSubstring;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2103() {
        f1856 = (char) 58808;
        f1857 = (char) 17955;
        f1854 = (char) 21237;
        f1859 = (char) 483;
        f1858 = new char[]{22, '-', '.', 'i', 127, 127, '|', 'a', 16, 'C', 'j', 'k', 'm', 's', 's', 'I', 'C', 'j', 'k', 'n', 'r', 'i', 'h', 'H', 'I', 'p', 'p', 'r', '[', '2', 'G', 'n', 'l', 'n', 'n', 'n', 'q', 'o', 'H', 'J', 'j', 'O', 194, 233, 197, '3', 'c', 'f', 'o', 'l', 16, 'G', 'n', 'l', 'n', 'n', 'n', 'q', 'o', 'H', 'J', 'j', '@', '0', 'j', 's', 'h', '\\', '^', 'G', 'S', ']', '7', 'C', '?', 'A', '^', '\\', '^', 'G', 'S', ']', '7', 'C', 'E', '.', '3', '.', 'A', 'F', 'E', 'C', 'C', 'E', 'H', 'g', '/', ']', 'l', 'l', 'l'};
    }

    /* JADX WARN: Code duplicated, block: B:147:0x0347 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x0326 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x0375 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x034b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:62:0x0118  */
    /* JADX WARN: Code duplicated, block: B:64:0x0120  */
    /* JADX WARN: Code duplicated, block: B:66:0x0126 A[PHI: r8 r10
  0x0126: PHI (r8v31 com.ironsource.adqualitysdk.sdk.i.dy$d) = (r8v30 com.ironsource.adqualitysdk.sdk.i.dy$d), (r8v46 com.ironsource.adqualitysdk.sdk.i.dy$d) binds: [B:41:0x008b, B:43:0x009d] A[DONT_GENERATE, DONT_INLINE]
  0x0126: PHI (r10v13 java.lang.String) = (r10v12 java.lang.String), (r10v26 java.lang.String) binds: [B:41:0x008b, B:43:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static List<dy> m2099(String str, String str2, String str3) {
        char c10;
        int i10;
        int length;
        ArrayList arrayList = new ArrayList();
        char c11 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if ((i11 < str3.length() ? '?' : (char) 15) != '?') {
                return arrayList;
            }
            int i13 = i11 + 1;
            char cCharAt = (i13 < str3.length() ? (char) 1 : c11) != 0 ? str3.charAt(i13) : c11;
            char cCharAt2 = str3.charAt(i11);
            if (cCharAt2 == '\n') {
                c10 = c11;
                i13 = i13;
                i12++;
                int i14 = f1853 + 111;
                f1855 = i14 % 128;
                int i15 = i14 % 2;
            } else if (cCharAt2 == '%' || cCharAt2 == '[' || cCharAt2 == ']' || cCharAt2 == '{' || cCharAt2 == '}') {
                c10 = c11;
                i13 = i13;
                dy.d dVar = dy.d.f1906;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str3.charAt(i11));
                arrayList.add(new dy(dVar, sb2.toString(), i12));
            } else {
                if (cCharAt2 != '!') {
                    if (cCharAt2 != '\"') {
                        switch (cCharAt2) {
                            case '\'':
                                String strM2100 = m2100(m2101(f1865, str3.substring(i11)));
                                if (strM2100.length() == 1) {
                                    arrayList.add(new dy(dy.d.f1907, String.valueOf((int) strM2100.charAt(0)), i12));
                                } else {
                                    arrayList.add(new dy(dy.d.f1909, strM2100, i12));
                                }
                                length = strM2100.length() + 2;
                                i11 += length;
                                c11 = 0;
                                break;
                            case '(':
                            case ')':
                            case '*':
                            case ',':
                            case '.':
                            case '/':
                                i13 = i13;
                                c10 = c11;
                                dy.d dVar2 = dy.d.f1906;
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(str3.charAt(i11));
                                arrayList.add(new dy(dVar2, sb3.toString(), i12));
                                break;
                            case '+':
                                if (cCharAt == '+') {
                                    arrayList.add(new dy(dy.d.f1906, m2104("\ue362謺", 1 - TextUtils.indexOf((CharSequence) "", '0')).intern(), i12));
                                    i11 += 2;
                                    c11 = 0;
                                } else if (cCharAt == '-') {
                                    c10 = 0;
                                    dy.d dVar3 = dy.d.f1906;
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append(str3.charAt(i11));
                                    arrayList.add(new dy(dVar3, sb4.toString(), i12));
                                } else {
                                    arrayList.add(new dy(dy.d.f1906, m2102(new int[]{0, 2, 0, 0}, "\u0001\u0000", false).intern(), i12));
                                    i11 += 2;
                                    int i16 = f1855 + 67;
                                    f1853 = i16 % 128;
                                    int i17 = i16 % 2;
                                    c11 = 0;
                                }
                                break;
                            case '-':
                                i13 = i13;
                                if (cCharAt == '-') {
                                    c10 = 0;
                                    dy.d dVar4 = dy.d.f1906;
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append(str3.charAt(i11));
                                    arrayList.add(new dy(dVar4, sb5.toString(), i12));
                                } else {
                                    arrayList.add(new dy(dy.d.f1906, m2102(new int[]{0, 2, 0, 0}, "\u0001\u0000", false).intern(), i12));
                                    i11 += 2;
                                    int i18 = f1855 + 67;
                                    f1853 = i18 % 128;
                                    int i19 = i18 % 2;
                                    c11 = 0;
                                }
                                break;
                            default:
                                switch (cCharAt2) {
                                    case ':':
                                    case ';':
                                        i13 = i13;
                                        c10 = c11;
                                        dy.d dVar5 = dy.d.f1906;
                                        StringBuilder sb6 = new StringBuilder();
                                        sb6.append(str3.charAt(i11));
                                        arrayList.add(new dy(dVar5, sb6.toString(), i12));
                                        break;
                                    case '<':
                                    case '=':
                                    case '>':
                                        break;
                                    default:
                                        if (!Character.isWhitespace(str3.charAt(i11))) {
                                            dy.d dVar6 = dy.d.f1904;
                                            String strM2101 = m2101(f1860, str3.substring(i11));
                                            if ((TextUtils.isEmpty(strM2101) ? (char) 1 : c11) != 0) {
                                                dVar6 = dy.d.f1910;
                                                strM2101 = m2101(f1867, str3.substring(i11));
                                                if (TextUtils.isEmpty(strM2101)) {
                                                    i10 = i13;
                                                } else {
                                                    int i20 = f1853 + 5;
                                                    f1855 = i20 % 128;
                                                    i10 = i13;
                                                    if ((i20 % 2 != 0 ? '#' : 'F') != '#') {
                                                        if ((!strM2101.equals(m2104("寬롦\u1776\ue7b8", 4 - (TypedValue.complexToFraction(c11, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(c11, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()) ? (char) 25 : '0') != '0') {
                                                            int i21 = f1855 + 123;
                                                            f1853 = i21 % 128;
                                                            int i22 = i21 % 2;
                                                            if (strM2101.equals(m2102(new int[]{45, 5, 0, 0}, "\u0000\u0001\u0001\u0001\u0000", false).intern())) {
                                                                if (f1861.contains(strM2101)) {
                                                                    dVar6 = dy.d.f1908;
                                                                }
                                                            }
                                                        }
                                                    } else if (!strM2101.equals(m2104("寬롦\u1776\ue7b8", 4 << (TypedValue.complexToFraction(1, 1.0f, 2.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(1, 1.0f, 2.0f) == 0.0f ? 0 : -1))).intern())) {
                                                        int i23 = f1855 + 123;
                                                        f1853 = i23 % 128;
                                                        int i24 = i23 % 2;
                                                        if (strM2101.equals(m2102(new int[]{45, 5, 0, 0}, "\u0000\u0001\u0001\u0001\u0000", false).intern())) {
                                                            if (f1861.contains(strM2101)) {
                                                                dVar6 = dy.d.f1908;
                                                            }
                                                        }
                                                    }
                                                    dVar6 = dy.d.f1902;
                                                }
                                            } else {
                                                i10 = i13;
                                            }
                                            if ((TextUtils.isEmpty(strM2101) ? 'V' : (char) 28) != 28) {
                                                int i25 = f1853 + 93;
                                                f1855 = i25 % 128;
                                                if (i25 % 2 != 0) {
                                                    dVar6 = dy.d.f1905;
                                                    strM2101 = m2101(f1864, str3.substring(i11));
                                                    int i26 = 98 / 0;
                                                } else {
                                                    dVar6 = dy.d.f1905;
                                                    strM2101 = m2101(f1864, str3.substring(i11));
                                                }
                                            }
                                            if ((TextUtils.isEmpty(strM2101) ? (char) 18 : 'U') != 'U') {
                                                dVar6 = dy.d.f1907;
                                                strM2101 = m2101(f1866, str3.substring(i11));
                                            }
                                            if (TextUtils.isEmpty(strM2101)) {
                                                dVar6 = dy.d.f1906;
                                                strM2101 = m2101(f1862, str3.substring(i11));
                                            }
                                            if (TextUtils.isEmpty(strM2101)) {
                                                dVar6 = dy.d.f1906;
                                                strM2101 = m2101(f1863, str3.substring(i11));
                                            }
                                            if (!TextUtils.isEmpty(strM2101)) {
                                                arrayList.add(new dy(dVar6, strM2101, i12));
                                                length = strM2101.length();
                                                i11 += length;
                                                c11 = 0;
                                            } else {
                                                StringBuilder sb7 = new StringBuilder();
                                                sb7.append(m2102(new int[]{2, 6, 17, 0}, "\u0001\u0001\u0001\u0001\u0001\u0001", false).intern());
                                                sb7.append(str);
                                                String string = sb7.toString();
                                                StringBuilder sb8 = new StringBuilder();
                                                sb8.append(m2104("ᶵ\uf78a鐐\u0ee8씝\ue832ꢳﰫ\ue821〺暪礦央탴꩖咘\uecd2\ude4e", TextUtils.indexOf((CharSequence) "", '0', 0) + 19).intern());
                                                sb8.append(str3.charAt(i11));
                                                sb8.append(m2102(new int[]{50, 13, 0, 13}, "\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001", true).intern());
                                                sb8.append(i11);
                                                sb8.append(m2102(new int[]{41, 4, 126, 0}, "\u0000\u0001\u0001\u0000", false).intern());
                                                sb8.append(str2);
                                                co.m1623(string, sb8.toString(), null);
                                                i11 = i10;
                                                c11 = 0;
                                            }
                                        } else {
                                            int i27 = f1855 + 23;
                                            f1853 = i27 % 128;
                                            int i28 = i27 % 2;
                                            i11 = i13;
                                        }
                                        break;
                                }
                                break;
                        }
                    } else {
                        i10 = i13;
                        String strM2102 = m2101(f1868, str3.substring(i11));
                        if (strM2102 == null) {
                            StringBuilder sb9 = new StringBuilder();
                            sb9.append(m2102(new int[]{2, 6, 17, 0}, "\u0001\u0001\u0001\u0001\u0001\u0001", false).intern());
                            sb9.append(str);
                            String string2 = sb9.toString();
                            StringBuilder sb10 = new StringBuilder();
                            sb10.append(m2102(new int[]{8, 33, 0, 21}, "\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001", true).intern());
                            sb10.append(i11);
                            sb10.append(m2102(new int[]{41, 4, 126, 0}, "\u0000\u0001\u0001\u0000", false).intern());
                            sb10.append(str2);
                            co.m1623(string2, sb10.toString(), null);
                            i11 = i10;
                            c11 = 0;
                        } else {
                            String strM2103 = m2100(strM2102);
                            arrayList.add(new dy(dy.d.f1909, strM2103, i12));
                            length = strM2103.length() + 2;
                            i11 += length;
                            c11 = 0;
                        }
                    }
                }
                if (cCharAt == '=') {
                    dy.d dVar7 = dy.d.f1906;
                    StringBuilder sb11 = new StringBuilder();
                    sb11.append(str3.charAt(i11));
                    sb11.append(m2104("乛\uebf7", -Process.getGidForName("")).intern());
                    arrayList.add(new dy(dVar7, sb11.toString(), i12));
                } else if (cCharAt == '+') {
                    arrayList.add(new dy(dy.d.f1906, m2104("\ue362謺", 1 - TextUtils.indexOf((CharSequence) "", '0')).intern(), i12));
                } else if (cCharAt == '-') {
                    arrayList.add(new dy(dy.d.f1906, m2102(new int[]{0, 2, 0, 0}, "\u0001\u0000", false).intern(), i12));
                    i11 += 2;
                    int i110 = f1855 + 67;
                    f1853 = i110 % 128;
                    int i111 = i110 % 2;
                    c11 = 0;
                } else {
                    c10 = 0;
                    dy.d dVar8 = dy.d.f1906;
                    StringBuilder sb12 = new StringBuilder();
                    sb12.append(str3.charAt(i11));
                    arrayList.add(new dy(dVar8, sb12.toString(), i12));
                }
                i11 += 2;
                c11 = 0;
            }
            c11 = c10;
            i11 = i13;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2101(Pattern pattern, String str) {
        int i10 = f1855 + 101;
        f1853 = i10 % 128;
        int i11 = i10 % 2;
        Matcher matcher = pattern.matcher(str);
        if ((matcher.find() ? '^' : '#') != '^') {
            return null;
        }
        String strSubstring = str.substring(matcher.start(), matcher.end());
        int i12 = f1853 + 47;
        f1855 = i12 % 128;
        if ((i12 % 2 != 0 ? '^' : (char) 15) != '^') {
            return strSubstring;
        }
        int i13 = 33 / 0;
        return strSubstring;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2104(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (n.f2992) {
            char[] cArr2 = new char[cArr.length];
            n.f2991 = 0;
            char[] cArr3 = new char[2];
            while (true) {
                int i11 = n.f2991;
                if (i11 < cArr.length) {
                    cArr3[0] = cArr[i11];
                    cArr3[1] = cArr[i11 + 1];
                    int i12 = 58224;
                    for (int i13 = 0; i13 < 16; i13++) {
                        char c10 = cArr3[1];
                        char c11 = cArr3[0];
                        char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f1856)) ^ ((c11 >>> 5) + f1854)));
                        cArr3[1] = c12;
                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f1857) ^ ((c12 + i12) ^ ((c12 << 4) + f1859))));
                        i12 -= 40503;
                    }
                    int i14 = n.f2991;
                    cArr2[i14] = cArr3[0];
                    cArr2[i14 + 1] = cArr3[1];
                    n.f2991 = i14 + 2;
                } else {
                    str2 = new String(cArr2, 0, i10);
                }
            }
        }
        return str2;
    }

    static {
        m2103();
        f1867 = Pattern.compile(m2104("薶콞蟓꺕\u0ee0쥗䶴ɤ৯䦲誥栯蟓꺕\u0ee0쥗䶴ɤ믓霌併鯚驳\ud9e1Ꮧগ", 25 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern());
        f1868 = Pattern.compile(m2104("쑸⇕ᕺ몚鵫ꇯ\ue30c夃쌢겛쑸⇕\ue2e9\ue9e1\uf47d煆", 15 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern());
        f1865 = Pattern.compile(m2104("ᔄѪᕺ몚鵫ꇯ㌇ؚ쌢겛ᔄѪ\ue2e9\ue9e1儁鶼", 15 - ImageFormat.getBitsPerPixel(0)).intern());
        f1864 = Pattern.compile(m2104("薶콞믓霌뤑韼煊ৌ\u1ae5턎믓霌뤑韼햍ే", 15 - View.resolveSize(0, 0)).intern());
        f1866 = Pattern.compile(m2104("薶콞믓霌뤑韼햍ే", 7 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern());
        f1860 = Pattern.compile(m2102(new int[]{63, 33, 0, 3}, "\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001", false).intern());
        f1863 = Pattern.compile(m2104("帡娘軧ྟ", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3).intern());
        f1862 = Pattern.compile(m2102(new int[]{96, 5, 0, 0}, "\u0000\u0000\u0000\u0000\u0000", false).intern());
        f1861 = Arrays.asList(m2104("ᛟ⌅", KeyEvent.normalizeMetaState(0) + 2).intern(), m2104("ꦮ⒒ᩘ쐎", 5 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), m2104("砲㾹졊㍵", 4 - View.resolveSize(0, 0)).intern(), m2104("鐐\u0ee8⠧픋ུ갪", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 5).intern(), m2104("∐ᄎ㤉қＫ䔧", 5 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), m2104("寬롦ێ⇓", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2).intern(), m2104("\uebe8凌䖫敤瀦ꚺ", 6 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern());
        int i10 = f1853 + 85;
        f1855 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2102(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (i.f2448) {
            int i10 = iArr[0];
            int i11 = iArr[1];
            int i12 = iArr[2];
            int i13 = iArr[3];
            char[] cArr = new char[i11];
            System.arraycopy(f1858, i10, cArr, 0, i11);
            if (bArr != null) {
                char[] cArr2 = new char[i11];
                i.f2447 = 0;
                char c10 = 0;
                while (true) {
                    int i14 = i.f2447;
                    if (i14 >= i11) {
                        break;
                    }
                    if (bArr[i14] == 1) {
                        cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                    } else {
                        cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                    }
                    c10 = cArr2[i14];
                    i.f2447 = i14 + 1;
                }
                cArr = cArr2;
            }
            if (i13 > 0) {
                char[] cArr3 = new char[i11];
                System.arraycopy(cArr, 0, cArr3, 0, i11);
                int i15 = i11 - i13;
                System.arraycopy(cArr3, 0, cArr, i15, i13);
                System.arraycopy(cArr3, i13, cArr, 0, i15);
            }
            if (z10) {
                char[] cArr4 = new char[i11];
                i.f2447 = 0;
                while (true) {
                    int i16 = i.f2447;
                    if (i16 >= i11) {
                        break;
                    }
                    cArr4[i16] = cArr[(i11 - i16) - 1];
                    i.f2447 = i16 + 1;
                }
                cArr = cArr4;
            }
            if (i12 > 0) {
                i.f2447 = 0;
                while (true) {
                    int i17 = i.f2447;
                    if (i17 >= i11) {
                        break;
                    }
                    cArr[i17] = (char) (cArr[i17] - iArr[2]);
                    i.f2447 = i17 + 1;
                }
            }
            str2 = new String(cArr);
        }
        return str2;
    }
}
