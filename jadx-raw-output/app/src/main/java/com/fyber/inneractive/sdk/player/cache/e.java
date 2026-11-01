package com.fyber.inneractive.sdk.player.cache;

import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f16155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f16157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f16158e;

    public e(g gVar, String str) {
        this.f16158e = gVar;
        this.f16154a = str;
        this.f16155b = new long[gVar.f16167g];
    }

    public final File a(int i10) {
        return new File(this.f16158e.f16161a, this.f16154a + "." + i10);
    }

    public final File b(int i10) {
        return new File(this.f16158e.f16161a, this.f16154a + "." + i10 + ".tmp");
    }
}
