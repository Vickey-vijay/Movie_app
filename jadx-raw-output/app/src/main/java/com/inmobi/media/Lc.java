package com.inmobi.media;

import com.inmobi.media.Lc;
import com.ironsource.C3426d4;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class Lc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pc f23071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2760bj f23072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3330yc f23073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2760bj f23074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2760bj f23075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2760bj f23076f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C2760bj f23077g;

    public static final List a() {
        return nj.s.k();
    }

    public Lc(Mc mc2, Pc pc2) {
        ck.p.j(mc2, "nativeBeaconMacroData");
        ck.p.j(pc2, "trackerData");
        this.f23071a = pc2;
        this.f23072b = new C2760bj(mc2, new bk.a() { // from class: b7.r2
            @Override // bk.a
            public final Object invoke() {
                return Lc.c(this.f5153b);
            }
        });
        this.f23073c = new C3330yc(mc2, new bk.a() { // from class: b7.s2
            @Override // bk.a
            public final Object invoke() {
                return Lc.a();
            }
        });
        this.f23074d = new C2760bj(mc2, new bk.a() { // from class: b7.t2
            @Override // bk.a
            public final Object invoke() {
                return Lc.e(this.f5179b);
            }
        });
        this.f23075e = new C2760bj(mc2, new bk.a() { // from class: b7.u2
            @Override // bk.a
            public final Object invoke() {
                return Lc.b(this.f5195b);
            }
        });
        this.f23076f = new C2760bj(mc2, new bk.a() { // from class: b7.v2
            @Override // bk.a
            public final Object invoke() {
                return Lc.a(this.f5210b);
            }
        });
        this.f23077g = new C2760bj(mc2, new bk.a() { // from class: b7.w2
            @Override // bk.a
            public final Object invoke() {
                return Lc.d(this.f5224b);
            }
        });
    }

    public static final List a(Lc lc2) {
        return nj.b0.y0(AbstractC3347z4.a("impression", lc2.f23071a.f23331a.f25659a), Jl.a(VastTagName.IMPRESSION, lc2.f23071a.f23332b));
    }

    public static final List b(Lc lc2) {
        return AbstractC3347z4.a("impression_shown", lc2.f23071a.f23331a.f25659a);
    }

    public static final List c(Lc lc2) {
        return AbstractC3347z4.a(C3426d4.i.f28562r, lc2.f23071a.f23331a.f25659a);
    }

    public static final List d(Lc lc2) {
        return AbstractC3347z4.a("mrc50", lc2.f23071a.f23331a.f25659a);
    }

    public static final List e(Lc lc2) {
        return AbstractC3347z4.a("start_tracking", lc2.f23071a.f23331a.f25659a);
    }
}
