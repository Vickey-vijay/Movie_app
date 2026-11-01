package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: loaded from: classes10.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4710e f58398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f58399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4721p f58400c;

    public W(C4710e c4710e, a0 a0Var, C4721p c4721p) {
        this.f58398a = c4710e;
        this.f58399b = a0Var;
        this.f58400c = c4721p;
    }

    public final C4710e a() {
        return this.f58398a;
    }

    public final C4721p b() {
        return this.f58400c;
    }

    public final a0 c() {
        return this.f58399b;
    }

    public final String toString() {
        return "ScreenshotConfig(apiCaptorConfig=" + this.f58398a + ", serviceCaptorConfig=" + this.f58399b + ", contentObserverCaptorConfig=" + this.f58400c + ')';
    }

    public W() {
        this(new C4710e(), new a0(), new C4721p());
    }
}
