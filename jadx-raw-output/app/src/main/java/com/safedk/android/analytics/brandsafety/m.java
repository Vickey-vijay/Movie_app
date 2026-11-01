package com.safedk.android.analytics.brandsafety;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes7.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f44522a = Long.valueOf(System.currentTimeMillis());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f44523b = Long.valueOf(SystemClock.elapsedRealtime());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f44524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f44525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f44526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f44527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m f44528g;

    public m(String str, String str2, String str3, String str4, m mVar) {
        this.f44524c = str;
        this.f44525d = str2;
        this.f44526e = str3;
        this.f44527f = str4;
        this.f44528g = mVar;
    }

    public String toString() {
        return "IntentDetails{ " + this.f44523b + ", " + this.f44524c + ", " + this.f44525d + ", " + this.f44526e + ", " + this.f44527f + " }";
    }
}
