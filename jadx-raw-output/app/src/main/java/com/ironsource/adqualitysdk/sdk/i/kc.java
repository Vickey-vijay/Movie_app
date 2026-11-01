package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes8.dex */
public final class kc {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2963 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2964 = {'[', 51818, 37976, 24241, 10473, 62250, 48485, '\\', 51738, 7151, 53726, 36792, 17664, 13083, 59636, 42660, 40071, 18977, 'H', 64896, 43984, 25067, 24369, 48877, '^', 51823, 37940, 24303, 10380, 62295, 48485, 34630, '$', 46431, 32620, 8479, 60356, 40327, 18013, 2070, 3809, 50388, 39578, 20485, 9820};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f2965 = 6849758736906832436L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2966 = 1;

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d8, code lost:
    
        if ((r0 < r7.length ? 22 : '>') != 22) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e7, code lost:
    
        if ((r0 < r7.length ? 'A' : 25) != 25) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fd, code lost:
    
        return java.lang.Integer.signum(java.lang.Integer.valueOf(r6[r0]).compareTo(java.lang.Integer.valueOf(r7[r0])));
     */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m2859(java.lang.String r6, java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.kc.m2859(java.lang.String, java.lang.String):int");
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static List<String> m2865(String str, String str2, boolean z10) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = Pattern.compile(str2).matcher(str);
        int i10 = f2966 + 45;
        f2963 = i10 % 128;
        int i11 = i10 % 2;
        while (true) {
            if (!matcher.find()) {
                int i12 = f2966 + 107;
                f2963 = i12 % 128;
                if ((i12 % 2 == 0 ? 0 : 1) == 0) {
                    return arrayList;
                }
                throw null;
            }
            if ((matcher.groupCount() == 0 ? (char) 2 : 'Z') != 2) {
                for (int i13 = 1; i13 <= matcher.groupCount(); i13++) {
                    int i14 = f2966 + 65;
                    f2963 = i14 % 128;
                    int i15 = i14 % 2;
                    arrayList.add(matcher.group(i13));
                    if (z10) {
                        int i16 = f2966 + 27;
                        f2963 = i16 % 128;
                        int i17 = i16 % 2;
                        return arrayList;
                    }
                }
            } else {
                int i18 = f2966 + 41;
                f2963 = i18 % 128;
                int i19 = i18 % 2;
                arrayList.add(matcher.group());
                if (z10) {
                    int i20 = f2963 + 63;
                    f2966 = i20 % 128;
                    int i21 = i20 % 2;
                    return arrayList;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static List<String> m2867(String str, String str2) {
        int i10 = f2963 + 105;
        f2966 = i10 % 128;
        if (i10 % 2 == 0) {
        }
        return m2865(str, str2, false);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m2870(String str, JSONArray jSONArray, boolean z10) {
        int i10 = f2963;
        int i11 = i10 + 81;
        f2966 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = 0;
        int i14 = i10 + 111;
        f2966 = i14 % 128;
        int i15 = i14 % 2;
        while (true) {
            if ((i13 < jSONArray.length() ? '\b' : ':') == ':') {
                return null;
            }
            int i16 = f2966 + 3;
            f2963 = i16 % 128;
            int i17 = i16 % 2;
            String strM2861 = m2861(str, jSONArray.optString(i13), z10);
            if ((strM2861 != null ? '@' : '+') != '+') {
                return strM2861;
            }
            i13++;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2863(String str) {
        int i10 = f2963 + 19;
        f2966 = i10 % 128;
        int i11 = i10 % 2;
        if ((!TextUtils.isEmpty(str) ? (char) 6 : '@') == '@') {
            return str;
        }
        if (!str.startsWith(m2869(KeyEvent.getDeadChar(0, 0) + 23, (char) (ExpandableListView.getPackedPositionChild(0L) + 48820), -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2869(KeyEvent.getDeadChar(0, 0) + 24, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.indexOf("", "") + 8).intern());
            sb2.append(str);
            str = sb2.toString();
        }
        if (str.endsWith(m2869(32 - View.MeasureSpec.getMode(0), (char) View.resolveSize(0, 0), TextUtils.getOffsetBefore("", 0) + 1).intern())) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(m2869((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 32, (char) (TextUtils.lastIndexOf("", '0', 0) + 46341), View.MeasureSpec.getMode(0) + 7).intern());
        String string = sb3.toString();
        int i12 = f2966 + 15;
        f2963 = i12 % 128;
        int i13 = i12 % 2;
        return string;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static List<String> m2868(String str, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int i10 = f2966 + 89;
        f2963 = i10 % 128;
        int i11 = i10 % 2;
        int i12 = 0;
        while (true) {
            if ((i12 < jSONArray.length() ? '3' : '>') != '3') {
                return arrayList;
            }
            int i13 = f2963 + 109;
            f2966 = i13 % 128;
            int i14 = i13 % 2;
            arrayList.addAll(m2865(str, jSONArray.optString(i12), false));
            i12++;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m2871(String str) {
        int i10 = f2963 + 101;
        f2966 = i10 % 128;
        int i11 = i10 % 2;
        if ((TextUtils.isEmpty(str) ? '0' : (char) 0) != 0) {
            int i12 = f2966 + 31;
            f2963 = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        return str.matches(m2869(8 - ImageFormat.getBitsPerPixel(0), (char) (7089 - (ViewConfiguration.getWindowTouchSlop() >> 8)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 14).intern());
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2869(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1653) {
            char[] cArr = new char[i11];
            d.f1652 = 0;
            while (true) {
                int i12 = d.f1652;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f2964[i10 + i12]) ^ (((long) i12) * f2965)) ^ ((long) c10));
                    d.f1652 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static String m2864(String str, String str2) {
        int i10 = f2966 + 107;
        f2963 = i10 % 128;
        return i10 % 2 == 0 ? str.substring(0, str.length() - str2.length()) : str.substring(1, str.length() % str2.length());
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static boolean m2866(String str) {
        int i10 = f2966 + 105;
        f2963 = i10 % 128;
        int i11 = i10 % 2;
        if ((t.m2997() ? (char) 24 : ',') == 24) {
            int i12 = f2966 + 61;
            f2963 = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        try {
            new GZIPInputStream(new ByteArrayInputStream(Base64.decode(str, 0)));
            int i14 = f2966 + 45;
            f2963 = i14 % 128;
            int i15 = i14 % 2;
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static String m2861(String str, String str2, boolean z10) {
        if ((z10 ? 'M' : '\f') != '\f') {
            int i10 = f2963 + 83;
            f2966 = i10 % 128;
            if (i10 % 2 == 0) {
                m2863(str2);
                throw null;
            }
            str2 = m2863(str2);
        }
        List<String> listM2865 = m2865(str, str2, true);
        if ((listM2865.size() > 0 ? (char) 3 : '4') == '4') {
            return null;
        }
        int i11 = f2963 + 79;
        f2966 = i11 % 128;
        return i11 % 2 == 0 ? listM2865.get(1) : listM2865.get(0);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static boolean m2862(String str, int i10) {
        if (!TextUtils.isEmpty(str)) {
            int i11 = f2963 + 55;
            f2966 = i11 % 128;
            int i12 = i11 % 2;
            if (str.length() > 0) {
                if (!(str.length() > i10)) {
                    int i13 = f2966 + 45;
                    f2963 = i13 % 128;
                    int i14 = i13 % 2;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static String m2860(String str) {
        if (str != null) {
            if (!(t.m2997())) {
                int i10 = f2963 + 73;
                f2966 = i10 % 128;
                int i11 = i10 % 2;
                if (m2866(str)) {
                    try {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 0));
                        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                        new ByteArrayOutputStream();
                        byte[] bArr = new byte[8192];
                        int i12 = f2966 + 117;
                        f2963 = i12 % 128;
                        int i13 = i12 % 2;
                        int i14 = 0;
                        while (true) {
                            int i15 = gZIPInputStream.read(bArr, i14, 8192 - i14);
                            if ((i15 != -1 ? 'c' : '0') != 'c') {
                                gZIPInputStream.close();
                                byteArrayInputStream.close();
                                return new String(bArr, m2869(ExpandableListView.getPackedPositionGroup(0L) + 40, (char) (TextUtils.indexOf("", "", 0, 0) + 3764), ((Process.getThreadPriority(0) + 20) >> 6) + 5).intern());
                            }
                            int i16 = f2963 + 81;
                            f2966 = i16 % 128;
                            int i17 = i16 % 2;
                            i14 += i15;
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return null;
    }
}
