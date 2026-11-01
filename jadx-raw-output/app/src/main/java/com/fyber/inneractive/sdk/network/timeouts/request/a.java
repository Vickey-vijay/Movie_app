package com.fyber.inneractive.sdk.network.timeouts.request;

import com.fyber.inneractive.sdk.config.global.features.j;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a extends com.fyber.inneractive.sdk.network.timeouts.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16108h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16109i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f16110j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f16111k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f16112l;

    public int a(int i10) {
        return 0;
    }

    public abstract int a(j jVar);

    public abstract int a(j jVar, String str);

    public int b() {
        return 0;
    }

    public abstract int b(j jVar, String str);

    public int c() {
        return 0;
    }

    public abstract int c(j jVar, String str);

    public void d(j jVar, String str) {
        int iB = b(jVar, "read");
        int iB2 = b(jVar, "conn");
        int iA = a(jVar, str);
        this.f16105f = a(jVar);
        this.f16110j = c(jVar, "read");
        int iC = c(jVar, "conn");
        this.f16111k = iC;
        int i10 = (this.f16110j * iA) / 100;
        this.f16108h = i10;
        this.f16109i = (iA * iC) / 100;
        this.f16108h = Math.max(iB, i10);
        this.f16109i = Math.max(iB2, this.f16109i);
    }

    public a(String str, j jVar, String str2) {
        this.f16112l = str2;
        d(jVar, str);
    }
}
