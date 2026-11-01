package com.inmobi.media;

import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.jk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2964jk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Yj f24627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Fi f24628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2989kk f24629c;

    public C2964jk(Yj yj2, List list) {
        ck.p.j(yj2, "telemetryConfigMetaData");
        ck.p.j(list, "samplingEvents");
        this.f24627a = yj2;
        double dRandom = Math.random();
        this.f24628b = new Fi(yj2, dRandom, list);
        this.f24629c = new C2989kk(yj2, dRandom);
    }
}
