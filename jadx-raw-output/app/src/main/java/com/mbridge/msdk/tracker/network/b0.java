package com.mbridge.msdk.tracker.network;

/* JADX INFO: compiled from: VolleyError.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class b0 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f38165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f38166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f38168d;

    public b0() {
        this.f38167c = 0;
        this.f38168d = "";
        this.f38165a = null;
    }

    public void a(long j10) {
        this.f38166b = j10;
    }

    public abstract int d();

    public void a(int i10) {
        this.f38167c = i10;
    }

    public int g() {
        return this.f38167c;
    }

    public b0(q qVar) {
        this.f38167c = 0;
        this.f38168d = "";
        this.f38165a = qVar;
    }

    public b0(String str) {
        super(str);
        this.f38167c = 0;
        this.f38168d = "";
        this.f38165a = null;
    }

    public b0(Throwable th2) {
        super(th2);
        this.f38167c = 0;
        this.f38168d = "";
        this.f38165a = null;
    }
}
