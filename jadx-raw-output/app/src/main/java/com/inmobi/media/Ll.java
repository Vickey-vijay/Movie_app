package com.inmobi.media;

import com.inmobi.media.Ll;
import com.ironsource.C3426d4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class Ll {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Nl f23099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3330yc f23100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3330yc f23101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3330yc f23102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3330yc f23103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3330yc f23104f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C3330yc f23105g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3330yc f23106h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C3330yc f23107i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C3330yc f23108j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C3330yc f23109k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C3330yc f23110l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final N5 f23111m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C3330yc f23112n;

    public static final List a(Ll ll2) {
        return AbstractC3347z4.a("companion_view", ll2.f23099a.f23255a.f24460a);
    }

    public Ll(Mc mc2, Nl nl2) {
        ck.p.j(mc2, "nativeBeaconMacroData");
        ck.p.j(nl2, "trackerData");
        this.f23099a = nl2;
        C2760bj c2760bj = new C2760bj(mc2, new bk.a() { // from class: b7.z2
            @Override // bk.a
            public final Object invoke() {
                return Ll.d(this.f5274b);
            }
        });
        C2760bj c2760bj2 = new C2760bj(mc2, new bk.a() { // from class: b7.i3
            @Override // bk.a
            public final Object invoke() {
                return Ll.e(this.f4979b);
            }
        });
        this.f23100b = new C3330yc(mc2, new bk.a() { // from class: b7.j3
            @Override // bk.a
            public final Object invoke() {
                return Ll.c(this.f4998b);
            }
        });
        this.f23101c = new C3330yc(mc2, new bk.a() { // from class: b7.k3
            @Override // bk.a
            public final Object invoke() {
                return Ll.f(this.f5014b);
            }
        });
        this.f23102d = new C3330yc(mc2, new bk.a() { // from class: b7.l3
            @Override // bk.a
            public final Object invoke() {
                return Ll.g(this.f5035b);
            }
        });
        this.f23103e = new C3330yc(mc2, new bk.a() { // from class: b7.m3
            @Override // bk.a
            public final Object invoke() {
                return Ll.b(this.f5054b);
            }
        });
        this.f23104f = new C3330yc(mc2, new bk.a() { // from class: b7.a3
            @Override // bk.a
            public final Object invoke() {
                return Ll.i(this.f4838b);
            }
        });
        this.f23105g = new C3330yc(mc2, new bk.a() { // from class: b7.b3
            @Override // bk.a
            public final Object invoke() {
                return Ll.m(this.f4852b);
            }
        });
        this.f23106h = new C3330yc(mc2, new bk.a() { // from class: b7.c3
            @Override // bk.a
            public final Object invoke() {
                return Ll.j(this.f4871b);
            }
        });
        this.f23107i = new C3330yc(mc2, new bk.a() { // from class: b7.d3
            @Override // bk.a
            public final Object invoke() {
                return Ll.n(this.f4886b);
            }
        });
        this.f23108j = new C3330yc(mc2, new bk.a() { // from class: b7.e3
            @Override // bk.a
            public final Object invoke() {
                return Ll.k(this.f4905b);
            }
        });
        this.f23109k = new C3330yc(mc2, new bk.a() { // from class: b7.f3
            @Override // bk.a
            public final Object invoke() {
                return Ll.l(this.f4920b);
            }
        });
        this.f23110l = new C3330yc(mc2, new bk.a() { // from class: b7.g3
            @Override // bk.a
            public final Object invoke() {
                return Ll.h(this.f4940b);
            }
        });
        this.f23111m = new N5(mc2, nl2, c2760bj, c2760bj2);
        this.f23112n = new C3330yc(mc2, new bk.a() { // from class: b7.h3
            @Override // bk.a
            public final Object invoke() {
                return Ll.a(this.f4954b);
            }
        });
    }

    public static final List b(Ll ll2) {
        return ll2.a("complete", "complete");
    }

    public static final List c(Ll ll2) {
        return ll2.a(CampaignEx.JSON_NATIVE_VIDEO_FIRST_QUARTILE, "firstQuartile");
    }

    public static final List d(Ll ll2) {
        return AbstractC3347z4.a("progress_received", ll2.f23099a.f23255a.f24460a);
    }

    public static final List e(Ll ll2) {
        return AbstractC3347z4.a("progress_occurred", ll2.f23099a.f23255a.f24460a);
    }

    public static final List f(Ll ll2) {
        return ll2.a("second_quartile", CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT);
    }

    public static final List g(Ll ll2) {
        return ll2.a(CampaignEx.JSON_NATIVE_VIDEO_THIRD_QUARTILE, "thirdQuartile");
    }

    public static final List h(Ll ll2) {
        return ll2.a("error", "error");
    }

    public static final List i(Ll ll2) {
        return ll2.a("load", C3426d4.i.f28562r);
    }

    public static final List j(Ll ll2) {
        return ll2.a(CampaignEx.JSON_NATIVE_VIDEO_MUTE, CampaignEx.JSON_NATIVE_VIDEO_MUTE);
    }

    public static final List k(Ll ll2) {
        return ll2.a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public static final List l(Ll ll2) {
        return ll2.a(CampaignEx.JSON_NATIVE_VIDEO_RESUME, CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public static final List m(Ll ll2) {
        return ll2.a("start", "start");
    }

    public static final List n(Ll ll2) {
        return ll2.a(CampaignEx.JSON_NATIVE_VIDEO_UNMUTE, CampaignEx.JSON_NATIVE_VIDEO_UNMUTE);
    }

    public final List a(String str, String str2) {
        return nj.b0.y0(Jl.a(str2, this.f23099a.f23256b), AbstractC3347z4.a(str, this.f23099a.f23255a.f24460a));
    }
}
