package com.ironsource;

/* JADX INFO: loaded from: classes6.dex */
public class O0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f27221e = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f27222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f27223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f27224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f27225d;

    public enum a {
        MANUAL,
        MANUAL_WITH_AUTOMATIC_RELOAD,
        MANUAL_WITH_LOAD_ON_SHOW,
        AUTOMATIC_LOAD_AFTER_CLOSE,
        AUTOMATIC_LOAD_WHILE_SHOW
    }

    public a a() {
        return this.f27222a;
    }

    public long b() {
        return this.f27225d;
    }

    public long c() {
        return this.f27224c;
    }

    public long d() {
        return this.f27223b;
    }

    public boolean e() {
        a aVar = this.f27222a;
        return aVar == a.AUTOMATIC_LOAD_AFTER_CLOSE || aVar == a.AUTOMATIC_LOAD_WHILE_SHOW;
    }

    public boolean f() {
        a aVar = this.f27222a;
        return aVar == a.MANUAL || aVar == a.MANUAL_WITH_AUTOMATIC_RELOAD || aVar == a.MANUAL_WITH_LOAD_ON_SHOW;
    }

    public O0(a aVar, long j10, long j11, long j12) {
        this.f27222a = aVar;
        this.f27223b = j10;
        this.f27224c = j11;
        this.f27225d = j12;
    }
}
