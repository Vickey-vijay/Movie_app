package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f17165e;

    public final void a() {
        int i10 = this.f17164d;
        this.f17164d = i10 == Integer.MIN_VALUE ? this.f17162b : i10 + this.f17163c;
        this.f17165e = this.f17161a + this.f17164d;
    }

    public final void b() {
        if (this.f17164d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public e0(int i10, int i11, int i12) {
        String str;
        if (i10 != Integer.MIN_VALUE) {
            str = i10 + "/";
        } else {
            str = "";
        }
        this.f17161a = str;
        this.f17162b = i11;
        this.f17163c = i12;
        this.f17164d = Integer.MIN_VALUE;
    }
}
