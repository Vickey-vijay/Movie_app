package com.ironsource;

/* JADX INFO: loaded from: classes5.dex */
public class Vf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f27808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f27809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f27810c;

    public long a() {
        return Math.max(0L, this.f27808a - System.currentTimeMillis());
    }

    public void b(long j10) {
        this.f27810c = j10;
        this.f27808a += j10 - this.f27809b;
    }

    public void a(long j10) {
        this.f27808a = System.currentTimeMillis() + j10;
    }

    public void c(long j10) {
        this.f27809b = j10;
        this.f27810c = 0L;
    }

    public void b() {
        this.f27808a = 0L;
        this.f27809b = 0L;
        this.f27810c = 0L;
    }
}
