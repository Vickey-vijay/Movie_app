package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.qn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3142qn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f25204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean[] f25205b;

    public C3142qn(G g10) {
        ck.p.j(g10, "adContext");
        this.f25204a = g10;
        boolean[] zArr = new boolean[5];
        for (int i10 = 0; i10 < 5; i10++) {
            zArr[i10] = false;
        }
        this.f25205b = zArr;
    }
}
