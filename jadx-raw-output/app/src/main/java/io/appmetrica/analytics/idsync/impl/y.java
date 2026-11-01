package io.appmetrica.analytics.idsync.impl;

import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f54919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f54920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f54921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f54922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f54923f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f54924g;

    public final String toString() {
        return "RequestResult(type='" + this.f54918a + "', isCompleted=" + this.f54919b + ", url=" + this.f54920c + ", responseCodeIsValid=" + this.f54921d + ", responseCode=" + this.f54922e + ", responseBody=" + this.f54923f + ", responseHeaders=" + this.f54924g + ')';
    }

    public y(String str, boolean z10, String str2, boolean z11, int i10, byte[] bArr, Map map) {
        this.f54918a = str;
        this.f54919b = z10;
        this.f54920c = str2;
        this.f54921d = z11;
        this.f54922e = i10;
        this.f54923f = bArr;
        this.f54924g = map;
    }
}
