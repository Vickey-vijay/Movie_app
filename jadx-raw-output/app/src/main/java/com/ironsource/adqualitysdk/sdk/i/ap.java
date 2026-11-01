package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.view.ViewConfiguration;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class ap extends ar.AnonymousClass4 {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f352 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f353 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f354 = -634914241;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f355;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f356;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m474(String str, char c10, String str2, int i10, String str3) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (j.f2673) {
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr2.clone();
            cArr4[0] = (char) (c10 ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i10));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            j.f2675 = 0;
            while (true) {
                int i11 = j.f2675;
                if (i11 < length) {
                    int i12 = (i11 + 2) % 4;
                    int i13 = (i11 + 3) % 4;
                    int i14 = cArr4[i11 % 4] * 32718;
                    char c11 = cArr5[i12];
                    char c12 = (char) ((i14 + c11) % 65535);
                    j.f2674 = c12;
                    cArr5[i13] = (char) (((cArr4[i13] * 32718) + c11) / 65535);
                    cArr4[i13] = c12;
                    int i15 = j.f2675;
                    cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f352) ^ ((long) f354)) ^ ((long) f356));
                    j.f2675 = i15 + 1;
                } else {
                    str4 = new String(cArr6);
                }
            }
        }
        return str4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if ((r0 == null ? 'D' : '$') != 'D') goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        return r0.opt(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        r4 = com.ironsource.adqualitysdk.sdk.i.ap.f353 + 101;
        com.ironsource.adqualitysdk.sdk.i.ap.f355 = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r0 == null) goto L18;
     */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m475(java.lang.String r4) {
        /*
            r3 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.ap.f353
            r1 = 53
            int r0 = r0 + r1
            int r2 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ap.f355 = r2
            int r0 = r0 % 2
            r2 = 89
            if (r0 == 0) goto L10
            r1 = r2
        L10:
            if (r1 == r2) goto L19
            org.json.JSONObject r0 = r3.m477()
            if (r0 != 0) goto L2b
            goto L30
        L19:
            org.json.JSONObject r0 = r3.m477()
            r1 = 49
            int r1 = r1 / 0
            r1 = 68
            if (r0 != 0) goto L27
            r2 = r1
            goto L29
        L27:
            r2 = 36
        L29:
            if (r2 == r1) goto L30
        L2b:
            java.lang.Object r4 = r0.opt(r4)
            return r4
        L30:
            int r4 = com.ironsource.adqualitysdk.sdk.i.ap.f353
            int r4 = r4 + 101
            int r0 = r4 % 128
            com.ironsource.adqualitysdk.sdk.i.ap.f355 = r0
            int r4 = r4 % 2
            r4 = 0
            return r4
        L3c:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ap.m475(java.lang.String):java.lang.Object");
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m476() {
        int i10 = f355 + 109;
        f353 = i10 % 128;
        int i11 = i10 % 2;
        String strOptString = m517().optString(m474("䀆횊ꊹ", (char) (42876 - (ViewConfiguration.getTouchSlop() >> 8)), "\u0000\u0000\u0000\u0000", 1321286499 - Color.green(0), "揷섻籎Ꭷ").intern());
        int i12 = f353 + 79;
        f355 = i12 % 128;
        if ((i12 % 2 != 0 ? '_' : '\'') != '_') {
            return strOptString;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final JSONObject m477() {
        int i10 = f355 + 77;
        f353 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject jSONObjectOptJSONObject = m517().optJSONObject(m474("佾㒫䀜妦赇곜", (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 47601), "\u0000\u0000\u0000\u0000", ViewConfiguration.getMinimumFlingVelocity() >> 16, "嚙寉\uf1b8Ჹ").intern());
        int i12 = f355 + 41;
        f353 = i12 % 128;
        if (i12 % 2 != 0) {
            return jSONObjectOptJSONObject;
        }
        int i13 = 28 / 0;
        return jSONObjectOptJSONObject;
    }
}
