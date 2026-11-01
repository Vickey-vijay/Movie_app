package com.ironsource;

/* JADX INFO: loaded from: classes6.dex */
public class P0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f27298e = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f27299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f27300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f27301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f27302d;

    public enum a {
        MANUAL,
        MANUAL_WITH_AUTOMATIC_RELOAD,
        AUTOMATIC_LOAD_AFTER_CLOSE,
        AUTOMATIC_LOAD_WHILE_SHOW
    }

    public a a() {
        return this.f27299a;
    }

    public long b() {
        return this.f27302d;
    }

    public long c() {
        return this.f27301c;
    }

    public long d() {
        return this.f27300b;
    }

    public boolean e() {
        a aVar = this.f27299a;
        return aVar == a.AUTOMATIC_LOAD_AFTER_CLOSE || aVar == a.AUTOMATIC_LOAD_WHILE_SHOW;
    }

    public boolean f() {
        a aVar = this.f27299a;
        return aVar == a.MANUAL || aVar == a.MANUAL_WITH_AUTOMATIC_RELOAD;
    }

    public P0(a aVar, long j10, long j11, long j12) {
        this.f27299a = aVar;
        this.f27300b = j10;
        this.f27301c = j11;
        this.f27302d = j12;
    }
}
