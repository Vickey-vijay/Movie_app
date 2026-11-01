package com.mbridge.msdk.tracker.network;

/* JADX INFO: compiled from: DefaultRetryPolicy.java */
/* JADX INFO: loaded from: classes6.dex */
public class e implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f38171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f38172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f38174d;

    public e() {
        this(2500, 1);
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public long a() {
        return this.f38172b;
    }

    public e(int i10, int i11) {
        this(i10, 60000L, i11);
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public boolean a(b0 b0Var) {
        int i10 = this.f38173c + 1;
        this.f38173c = i10;
        return i10 <= this.f38174d;
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public int b() {
        return this.f38171a;
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public int c() {
        return this.f38173c;
    }

    public e(int i10, long j10, int i11) {
        this.f38172b = j10;
        this.f38171a = i10;
        this.f38174d = i11;
    }
}
