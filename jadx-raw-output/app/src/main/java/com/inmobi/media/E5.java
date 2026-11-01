package com.inmobi.media;

import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public final class E5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f22566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public D5 f22568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ H5 f22569e;

    public E5(H5 h10, String str) {
        this.f22569e = h10;
        this.f22565a = str;
        this.f22566b = new long[h10.f22779h];
    }

    public final File a(int i10) {
        return new File(this.f22569e.f22773b, this.f22565a + "." + i10);
    }

    public final File b(int i10) {
        return new File(this.f22569e.f22773b, this.f22565a + "." + i10 + ".tmp");
    }
}
