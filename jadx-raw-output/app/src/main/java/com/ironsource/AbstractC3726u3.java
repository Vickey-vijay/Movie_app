package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.u3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3726u3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f31391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f31393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3507hd f31394d;

    public AbstractC3726u3(int i10, String str, boolean z10, C3507hd c3507hd) {
        ck.p.j(str, "placementName");
        this.f31391a = i10;
        this.f31392b = str;
        this.f31393c = z10;
        this.f31394d = c3507hd;
    }

    public final C3507hd a() {
        return this.f31394d;
    }

    public final boolean a(int i10) {
        return this.f31391a == i10;
    }

    public final int b() {
        return this.f31391a;
    }

    public final String c() {
        return this.f31392b;
    }

    public final boolean d() {
        return this.f31393c;
    }

    public String toString() {
        return "placement name: " + this.f31392b;
    }

    public /* synthetic */ AbstractC3726u3(int i10, String str, boolean z10, C3507hd c3507hd, int i11, ck.i iVar) {
        this((i11 & 1) != 0 ? 0 : i10, str, (i11 & 4) != 0 ? false : z10, (i11 & 8) != 0 ? null : c3507hd);
    }
}
