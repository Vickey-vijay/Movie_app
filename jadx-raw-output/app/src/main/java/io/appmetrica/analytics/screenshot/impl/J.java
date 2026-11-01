package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: loaded from: classes10.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f58375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W f58376b;

    public J(boolean z10, W w10) {
        this.f58375a = z10;
        this.f58376b = w10;
    }

    public final W a() {
        return this.f58376b;
    }

    public final boolean b() {
        return this.f58375a;
    }

    public final String toString() {
        return "RemoteScreenshotConfig(enabled=" + this.f58375a + ", config=" + this.f58376b + ')';
    }

    public J() {
        this(new S().f58395a, new W());
    }
}
