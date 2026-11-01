package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class ai implements Comparable<ai> {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f284 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f285 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f286 = true;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f287 = true;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f288 = 244;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f289 = {360, 359, 345, 354, 356, 352, 347, 361, 349, 344};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private jb f290;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static List<String> m413() {
        List<String> listAsList;
        int i10 = f285 + 113;
        f284 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 18 : 'a') != 'a') {
            String[] strArr = new String[0];
            strArr[0] = ih.f2506;
            listAsList = Arrays.asList(strArr);
        } else {
            listAsList = Arrays.asList(ih.f2506);
        }
        int i11 = f285 + 51;
        f284 = i11 % 128;
        int i12 = i11 % 2;
        return listAsList;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized JSONObject m416() {
        JSONObject jSONObjectM2597;
        int i10 = f284 + 91;
        f285 = i10 % 128;
        int i11 = i10 % 2;
        jSONObjectM2597 = this.f290.m2597();
        int i12 = f284 + 81;
        f285 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        return jSONObjectM2597;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m418() {
        JSONObject jSONObjectM416;
        int iIndexOf;
        int i10 = f285 + 37;
        f284 = i10 % 128;
        if ((i10 % 2 == 0 ? 'J' : '-') != '-') {
            jSONObjectM416 = m416();
            iIndexOf = 113 << TextUtils.indexOf("", "", 0, 0);
        } else {
            jSONObjectM416 = m416();
            iIndexOf = TextUtils.indexOf("", "", 0, 0) + 127;
        }
        return jSONObjectM416.optString(m412(null, iIndexOf, null, "\u0084\u0087\u0086\u0085").intern());
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final jb m421() {
        int i10 = f284;
        int i11 = i10 + 69;
        f285 = i11 % 128;
        int i12 = i11 % 2;
        jb jbVar = this.f290;
        int i13 = i10 + 17;
        f285 = i13 % 128;
        int i14 = i13 % 2;
        return jbVar;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private long m409() {
        JSONObject jSONObjectM416;
        int i10;
        int i11 = f284 + 21;
        f285 = i11 % 128;
        if (i11 % 2 == 0) {
            jSONObjectM416 = m416();
            i10 = 127 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
        } else {
            jSONObjectM416 = m416();
            i10 = 109 << (TypedValue.complexToFraction(0, 2.0f, 2.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 2.0f, 2.0f) == 0.0f ? 0 : -1));
        }
        long jOptInt = jSONObjectM416.optInt(m412(null, i10, null, "\u0084\u0083").intern());
        int i12 = f285 + 119;
        f284 = i12 % 128;
        int i13 = i12 % 2;
        return jOptInt;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private String m410() {
        int i10 = f285 + 95;
        f284 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 16 : ' ') != 16) {
            return this.f290.m2596();
        }
        this.f290.m2596();
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private long m411() {
        int i10 = f285 + 75;
        f284 = i10 % 128;
        int i11 = i10 % 2;
        long jOptLong = m416().optLong(m412(null, View.MeasureSpec.getSize(0) + 127, null, "\u0082\u0081").intern());
        int i12 = f284 + 79;
        f285 = i12 % 128;
        int i13 = i12 % 2;
        return jOptLong;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m412(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (m.f2988) {
            char[] cArr2 = f289;
            int i11 = f288;
            if (f287) {
                int length = bArr.length;
                m.f2990 = length;
                char[] cArr3 = new char[length];
                m.f2989 = 0;
                while (m.f2989 < m.f2990) {
                    int i12 = m.f2989;
                    int i13 = m.f2990 - 1;
                    int i14 = m.f2989;
                    cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                    m.f2989 = i14 + 1;
                }
                return new String(cArr3);
            }
            if (f286) {
                int length2 = cArr.length;
                m.f2990 = length2;
                char[] cArr4 = new char[length2];
                m.f2989 = 0;
                while (m.f2989 < m.f2990) {
                    int i15 = m.f2989;
                    int i16 = m.f2990 - 1;
                    int i17 = m.f2989;
                    cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                    m.f2989 = i17 + 1;
                }
                return new String(cArr4);
            }
            int length3 = iArr.length;
            m.f2990 = length3;
            char[] cArr5 = new char[length3];
            m.f2989 = 0;
            while (m.f2989 < m.f2990) {
                int i18 = m.f2989;
                int i19 = m.f2990 - 1;
                int i20 = m.f2989;
                cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                m.f2989 = i20 + 1;
            }
            return new String(cArr5);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private int m415(ai aiVar) {
        int i10 = f284 + 91;
        f285 = i10 % 128;
        int i11 = i10 % 2;
        long jM411 = m411();
        long jM412 = aiVar.m411();
        if (jM411 >= jM412) {
            if ((jM411 == jM412 ? ';' : 'Z') != ';') {
                return 1;
            }
            return m414(aiVar);
        }
        int i12 = f284 + 57;
        f285 = i12 % 128;
        int i13 = i12 % 2;
        return -1;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ai aiVar) {
        int i10 = f284 + 85;
        f285 = i10 % 128;
        int i11 = i10 % 2;
        int iM415 = m415(aiVar);
        int i12 = f285 + 115;
        f284 = i12 % 128;
        int i13 = i12 % 2;
        return iM415;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0023, code lost:
    
        if ((r4 == r5 ? 22 : 27) != 27) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0025, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0026, code lost:
    
        if (r5 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0028, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002a, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        if (r0 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0034, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.ai.class == r5.getClass()) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0037, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0038, code lost:
    
        if (r2 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003a, code lost:
    
        r5 = com.ironsource.adqualitysdk.sdk.i.ai.f284 + 55;
        com.ironsource.adqualitysdk.sdk.i.ai.f285 = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0044, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0053, code lost:
    
        return m410().equals(((com.ironsource.adqualitysdk.sdk.i.ai) r5).m410());
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r4 == r5) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.ai.f285
            int r0 = r0 + 75
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ai.f284 = r1
            int r0 = r0 % 2
            r1 = 93
            if (r0 != 0) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = 6
        L11:
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L18
            if (r4 != r5) goto L26
            goto L25
        L18:
            r0 = 14
            int r0 = r0 / r3
            r0 = 27
            if (r4 != r5) goto L22
            r1 = 22
            goto L23
        L22:
            r1 = r0
        L23:
            if (r1 == r0) goto L26
        L25:
            return r2
        L26:
            if (r5 == 0) goto L2a
            r0 = r3
            goto L2b
        L2a:
            r0 = r2
        L2b:
            if (r0 == 0) goto L2e
            goto L3a
        L2e:
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.ai> r0 = com.ironsource.adqualitysdk.sdk.i.ai.class
            java.lang.Class r1 = r5.getClass()
            if (r0 == r1) goto L37
            goto L38
        L37:
            r2 = r3
        L38:
            if (r2 == 0) goto L45
        L3a:
            int r5 = com.ironsource.adqualitysdk.sdk.i.ai.f284
            int r5 = r5 + 55
            int r0 = r5 % 128
            com.ironsource.adqualitysdk.sdk.i.ai.f285 = r0
            int r5 = r5 % 2
            return r3
        L45:
            com.ironsource.adqualitysdk.sdk.i.ai r5 = (com.ironsource.adqualitysdk.sdk.i.ai) r5
            java.lang.String r0 = r4.m410()
            java.lang.String r5 = r5.m410()
            boolean r5 = r0.equals(r5)
            return r5
        L54:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ai.equals(java.lang.Object):boolean");
    }

    public final String toString() {
        int i10 = f285 + 45;
        f284 = i10 % 128;
        int i11 = i10 % 2;
        String string = m416().toString();
        int i12 = f284 + 79;
        f285 = i12 % 128;
        if (!(i12 % 2 != 0)) {
            return string;
        }
        int i13 = 16 / 0;
        return string;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized void m417(int i10) {
        int i11 = f285 + 51;
        f284 = i11 % 128;
        int i12 = i11 % 2;
        boolean z10 = false;
        if (!(this.f290.m2597() == null)) {
            int i13 = f284 + 19;
            f285 = i13 % 128;
            if (i13 % 2 == 0) {
                z10 = true;
            }
            if (!z10) {
                jz.m2798(this.f290.m2597(), i10, m413());
                throw null;
            }
            jz.m2798(this.f290.m2597(), i10, m413());
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m419(String str) throws UnsupportedEncodingException {
        JSONObject jSONObjectM416;
        String strM412;
        int i10 = f285 + 29;
        f284 = i10 % 128;
        try {
            if ((i10 % 2 == 0 ? (char) 1 : '(') != '(') {
                jSONObjectM416 = m416();
                strM412 = m412(null, 25768 - (ViewConfiguration.getScrollFriction() > 1.0f ? 1 : (ViewConfiguration.getScrollFriction() == 1.0f ? 0 : -1)), null, "\u008a\u0089\u0088");
            } else {
                jSONObjectM416 = m416();
                strM412 = m412(null, 128 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), null, "\u008a\u0089\u0088");
            }
            jSONObjectM416.put(strM412.intern(), str);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m420() {
        int i10 = f285 + 87;
        f284 = i10 % 128;
        int i11 = i10 % 2;
        String strOptString = m416().optString(m412(null, 127 - TextUtils.indexOf("", "", 0, 0), null, "\u008a\u0089\u0088").intern(), null);
        int i12 = f284 + 15;
        f285 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        return strOptString;
    }

    public ai(jb jbVar) {
        this.f290 = jbVar;
    }

    public final int hashCode() {
        boolean z10;
        boolean z11 = false;
        if (m416() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i10 = f284 + 111;
            f285 = i10 % 128;
            int i11 = i10 % 2;
            int iHashCode = m416().hashCode();
            int i12 = f285 + 73;
            f284 = i12 % 128;
            if (i12 % 2 != 0) {
                z11 = true;
            }
            if (z11) {
                return iHashCode;
            }
            throw null;
        }
        int i13 = f285 + 113;
        f284 = i13 % 128;
        int i14 = i13 % 2;
        return 0;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private int m414(ai aiVar) {
        long jM409 = m409();
        long jM4010 = aiVar.m409();
        if (jM409 < jM4010) {
            int i10 = f284 + 111;
            f285 = i10 % 128;
            if (i10 % 2 == 0) {
                return -1;
            }
            int i11 = 73 / 0;
            return -1;
        }
        if (jM409 != jM4010) {
            return 1;
        }
        int i12 = f284 + 19;
        f285 = i12 % 128;
        int i13 = i12 % 2;
        return 0;
    }
}
