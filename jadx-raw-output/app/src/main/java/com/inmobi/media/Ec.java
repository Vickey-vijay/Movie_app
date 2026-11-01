package com.inmobi.media;

import com.inmobi.media.Ec;
import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;

/* JADX INFO: loaded from: classes5.dex */
public final class Ec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3292x f22583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InMobiJsonResponse f22584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ac f22585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ic f22586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C3015ll f22587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final mj.g f22588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mj.g f22589g;

    public Ec(C3292x c3292x, InMobiJsonResponse inMobiJsonResponse, Ac ac2) {
        ck.p.j(c3292x, "adComponent");
        ck.p.j(inMobiJsonResponse, "inMobiJsonResponse");
        ck.p.j(ac2, "adUnitCallback");
        this.f22583a = c3292x;
        this.f22584b = inMobiJsonResponse;
        this.f22585c = ac2;
        this.f22586d = new Ic(c3292x);
        this.f22588f = kotlin.b.a(new bk.a() { // from class: b7.x
            @Override // bk.a
            public final Object invoke() {
                return Ec.b(this.f5241b);
            }
        });
        this.f22589g = kotlin.b.a(new bk.a() { // from class: b7.y
            @Override // bk.a
            public final Object invoke() {
                return Ec.a(this.f5255b);
            }
        });
    }

    public static final C3006lc a(Ec ec2) {
        C3070o1 c3070o1 = ec2.f22586d.f22859a.f25676a;
        return new C3006lc(c3070o1.f24938b, c3070o1.f24941e, c3070o1.f24939c);
    }

    public static final Dc b(Ec ec2) {
        return (Dc) ec2.f22586d.f22860b.getValue();
    }
}
