package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.kk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2989kk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Yj f24694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f24695b;

    public C2989kk(Yj yj2, double d10) {
        ck.p.j(yj2, "telemetryConfigMetaData");
        this.f24694a = yj2;
        this.f24695b = d10;
    }

    public final int a(String str) {
        ck.p.j(str, "eventType");
        if (this.f24695b >= this.f24694a.f23864g) {
            return 0;
        }
        Wj wj2 = Wj.f23753a;
        return 2;
    }
}
