package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class iq {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private d f2585;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f2586;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private long f2587;

    public static class d {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private int f2588;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private String f2589;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final int m2517() {
            return this.f2588;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final String m2518() {
            return this.f2589;
        }

        public d(int i10, String str) {
            this.f2588 = i10;
            this.f2589 = str;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final JSONObject m2513() throws JSONException {
        return !TextUtils.isEmpty(this.f2586) ? IronSourceVideoBridge.jsonObjectInit(this.f2586) : IronSourceVideoBridge.jsonObjectInit();
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final d m2514() {
        return this.f2585;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final long m2515() {
        return this.f2587;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m2516() {
        return this.f2586;
    }

    public iq(String str, int i10, String str2, long j10) {
        this.f2586 = str;
        this.f2587 = j10;
        this.f2585 = new d(i10, str2);
    }
}
