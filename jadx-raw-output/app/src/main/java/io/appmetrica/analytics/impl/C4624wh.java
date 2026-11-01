package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4624wh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q5 f57887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f57888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f57889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f57890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Gh f57891e;

    public final String toString() {
        return "ReportToSend(report=" + this.f57887a + ", serviceDataReporterType=" + this.f57889c + ", environment=" + this.f57891e + ", isCrashReport=" + this.f57888b + ", trimmedFields=" + this.f57890d + ')';
    }

    public C4624wh(Q5 q10, boolean z10, int i10, HashMap map, Gh gh2) {
        this.f57887a = q10;
        this.f57888b = z10;
        this.f57889c = i10;
        this.f57890d = map;
        this.f57891e = gh2;
    }
}
