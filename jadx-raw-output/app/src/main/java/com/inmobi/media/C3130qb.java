package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.qb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3130qb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f25162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f25164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f25165e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f25166f;

    public C3130qb(String str, long j10, int i10, long j11, boolean z10, int i11) {
        ck.p.j(str, com.ironsource.Y5.c.f27928b);
        this.f25161a = str;
        this.f25162b = j10;
        this.f25163c = i10;
        this.f25164d = j11;
        this.f25165e = z10;
        this.f25166f = i11;
    }

    public /* synthetic */ C3130qb(String str, long j10, int i10, long j11, boolean z10, int i11, int i12) {
        this(str, j10, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0L : j11, (i12 & 16) != 0 ? false : z10, (i12 & 32) != 0 ? 0 : i11);
    }
}
