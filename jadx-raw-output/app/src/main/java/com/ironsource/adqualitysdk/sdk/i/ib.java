package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class ib {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f2449;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ig f2450;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Cif f2451;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Context f2452;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final HashMap<String, String> m2459(String str, int i10) {
        try {
            HashMap<String, String> mapM2481 = this.f2450.m2481(str, i10);
            HashMap<String, String> map = new HashMap<>();
            for (String str2 : mapM2481.keySet()) {
                String str3 = mapM2481.get(str2);
                if (str3 != null && !TextUtils.isEmpty(str3)) {
                    try {
                        map.put(str2, this.f2451.m2477(str3));
                    } catch (Cif.e unused) {
                    }
                }
            }
            return map;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m2457(String str) {
        try {
            this.f2450.m2483(str);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final int m2460(String str) {
        try {
            return this.f2450.m2480(str);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m2461(String str, String str2) {
        try {
            this.f2450.m2482(str, this.f2451.m2476(str2));
        } catch (Throwable unused) {
        }
    }

    public ib(Context context, String str, String str2) {
        this.f2452 = context.getApplicationContext();
        this.f2449 = str2;
        this.f2450 = new ig(this.f2452, str);
        this.f2451 = new Cif(id.f2453, this.f2452.getPackageName(), ik.m2506(this.f2452), this.f2449);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m2458(String str) {
        try {
            String strM2484 = this.f2450.m2484(str);
            if (strM2484 == null || TextUtils.isEmpty(strM2484)) {
                return strM2484;
            }
            try {
                return this.f2451.m2477(strM2484);
            } catch (Cif.e unused) {
                return "";
            }
        } catch (Throwable unused2) {
            return null;
        }
    }
}
