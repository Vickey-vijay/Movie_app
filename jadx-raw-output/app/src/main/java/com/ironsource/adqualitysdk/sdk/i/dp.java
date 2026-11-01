package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class dp {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1808 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static long f1809 = -3367701063337788816L;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1810 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f1811;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f1812;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1813;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f1814;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f1815;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String m2031() {
        int i10 = f1808 + 51;
        int i11 = i10 % 128;
        f1810 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        String str = this.f1814;
        int i12 = i11 + 53;
        f1808 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2030(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2284) {
            char[] cArrM2243 = h.m2243(f1809, cArr, i10);
            h.f2285 = 4;
            while (true) {
                int i11 = h.f2285;
                if (i11 < cArrM2243.length) {
                    h.f2283 = i11 - 4;
                    int i12 = h.f2285;
                    cArrM2243[i12] = (char) (((long) (cArrM2243[i12] ^ cArrM2243[i12 % 4])) ^ (((long) h.f2283) * f1809));
                    h.f2285++;
                } else {
                    str2 = new String(cArrM2243, 4, cArrM2243.length - 4);
                }
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m2032() {
        int i10 = f1808 + 47;
        f1810 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1812;
        }
        int i11 = 22 / 0;
        return this.f1812;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final boolean m2033() {
        boolean z10;
        int i10 = f1808 + 19;
        int i11 = i10 % 128;
        f1810 = i11;
        if ((i10 % 2 == 0 ? '4' : 'B') != 'B') {
            z10 = this.f1811;
            int i12 = 25 / 0;
        } else {
            z10 = this.f1811;
        }
        int i13 = i11 + 45;
        f1808 = i13 % 128;
        if (!(i13 % 2 != 0)) {
            return z10;
        }
        int i14 = 69 / 0;
        return z10;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m2034() {
        int i10 = f1808;
        int i11 = i10 + 105;
        f1810 = i11 % 128;
        int i12 = i11 % 2;
        String str = this.f1815;
        int i13 = i10 + 103;
        f1810 = i13 % 128;
        if (i13 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m2035() {
        int i10 = f1808 + 51;
        int i11 = i10 % 128;
        f1810 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        String str = this.f1813;
        int i12 = i11 + 53;
        f1808 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        return str;
    }

    public dp(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f1815 = jSONObject.optString(m2030("ϱ屼ꑬ៖Ά\ue67e탭㣶\uea41\uf829諭", ViewConfiguration.getMaximumDrawingCacheSize() >> 24).intern());
            this.f1812 = jSONObject.optString(m2030("㋬읺Κᓝ㊏絥眗㯠\udb43挤", ExpandableListView.getPackedPositionGroup(0L)).intern());
            this.f1814 = jSONObject.optString(m2030("擣넖瞊놡撆ଞ̞麃赂", ExpandableListView.getPackedPositionType(0L)).intern());
            this.f1813 = jSONObject.optString(m2030("砤៷䎙셧硓귢㜛\uee41醍뎢ᵎ", 1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern());
            this.f1811 = jSONObject.optBoolean(m2030("翝臭攛帽羨㯮ᆞ焨陥▩㯉䝌갗౮", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
        }
    }
}
