package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.view.ViewConfiguration;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class jb {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2714 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int[] f2715 = {433625881, 1637479217, -1985095493, 628328357, -967363710, 5720099, -473771358, -45404727, 1877659770, -792096389, -1196455218, 2100725071, 1780420405, -722162633, -1210916506, 1242792997, 1385166394, 180941739};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2716 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private JSONObject f2717;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f2718;

    public jb(JSONObject jSONObject) {
        this(jSONObject, UUID.randomUUID().toString());
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final JSONObject m2597() {
        int i10 = f2716 + 25;
        f2714 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f2717;
        }
        int i11 = 43 / 0;
        return this.f2717;
    }

    public jb(JSONObject jSONObject, String str) {
        this.f2717 = jSONObject;
        this.f2718 = str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2595(int[] iArr, int i10) {
        String str;
        synchronized (e.f1912) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2715.clone();
            e.f1913 = 0;
            while (true) {
                int i11 = e.f1913;
                if (i11 < iArr.length) {
                    int i12 = iArr[i11];
                    char c10 = (char) (i12 >> 16);
                    cArr[0] = c10;
                    char c11 = (char) i12;
                    cArr[1] = c11;
                    char c12 = (char) (iArr[i11 + 1] >> 16);
                    cArr[2] = c12;
                    char c13 = (char) iArr[i11 + 1];
                    cArr[3] = c13;
                    e.f1915 = (c10 << 16) + c11;
                    e.f1914 = (c12 << 16) + c13;
                    e.m2135(iArr2);
                    for (int i13 = 0; i13 < 16; i13++) {
                        int i14 = e.f1915 ^ iArr2[i13];
                        e.f1915 = i14;
                        e.f1914 = e.m2134(i14) ^ e.f1914;
                        int i15 = e.f1915;
                        e.f1915 = e.f1914;
                        e.f1914 = i15;
                    }
                    int i16 = e.f1915;
                    e.f1915 = e.f1914;
                    e.f1914 = i16;
                    e.f1914 = i16 ^ iArr2[16];
                    e.f1915 ^= iArr2[17];
                    int i17 = e.f1913;
                    int i18 = e.f1915;
                    cArr[0] = (char) (i18 >>> 16);
                    cArr[1] = (char) i18;
                    int i19 = e.f1914;
                    cArr[2] = (char) (i19 >>> 16);
                    cArr[3] = (char) i19;
                    e.m2135(iArr2);
                    int i20 = e.f1913;
                    cArr2[i20 << 1] = cArr[0];
                    cArr2[(i20 << 1) + 1] = cArr[1];
                    cArr2[(i20 << 1) + 2] = cArr[2];
                    cArr2[(i20 << 1) + 3] = cArr[3];
                    e.f1913 = i20 + 2;
                } else {
                    str = new String(cArr2, 0, i10);
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String m2596() {
        int i10 = f2716;
        int i11 = i10 + 81;
        f2714 = i11 % 128;
        int i12 = i11 % 2;
        String str = this.f2718;
        int i13 = i10 + 51;
        f2714 = i13 % 128;
        if (i13 % 2 == 0) {
            return str;
        }
        int i14 = 9 / 0;
        return str;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final JSONObject m2598() throws JSONException {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        jSONObjectJsonObjectInit.put(m2595(new int[]{-2126419468, -1149986458, 653468025, 1867341968}, 8 - ((Process.getThreadPriority(0) + 20) >> 6)).intern(), this.f2717);
        jSONObjectJsonObjectInit.put(m2595(new int[]{340223049, -1873379722}, (ViewConfiguration.getTouchSlop() >> 8) + 4).intern(), this.f2718);
        int i10 = f2716 + 67;
        f2714 = i10 % 128;
        int i11 = i10 % 2;
        return jSONObjectJsonObjectInit;
    }
}
