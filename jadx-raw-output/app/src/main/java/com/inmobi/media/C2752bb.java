package com.inmobi.media;

import com.inmobi.media.C2752bb;

/* JADX INFO: renamed from: com.inmobi.media.bb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2752bb extends AbstractC3169s1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3070o1 f24054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ac f24055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public kotlinx.coroutines.g f24056d;

    public static final mj.r a(C2752bb c2752bb) {
        c2752bb.f24055c.e();
        return mj.r.f64562a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2752bb(C3070o1 c3070o1, Ac ac2) {
        super(c3070o1);
        ck.p.j(c3070o1, "adManagerComponent");
        ck.p.j(ac2, "stateMachine");
        this.f24054b = c3070o1;
        this.f24055c = ac2;
    }

    @Override // com.inmobi.media.AbstractC3169s1
    public final void e() {
        H6.a(this.f24056d);
        this.f24056d = null;
    }

    public final void g() {
        long j10 = this.f25288a.f24890c;
        nk.l0 l0Var = this.f24054b.f24941e;
        bk.a aVar = new bk.a() { // from class: b7.s5
            @Override // bk.a
            public final Object invoke() {
                return C2752bb.a(this.f5167b);
            }
        };
        ck.p.j(l0Var, "coroutineScope");
        ck.p.j(aVar, "timeOutCallback");
        this.f24056d = nk.j.d(l0Var, null, null, new C3188sk(j10, aVar, null), 3, null);
    }

    @Override // com.inmobi.media.AbstractC3169s1
    public final void a() {
        H6.a(this.f24056d);
        this.f24056d = null;
    }

    @Override // com.inmobi.media.AbstractC3169s1
    public final void b() {
        g();
    }

    @Override // com.inmobi.media.AbstractC3169s1
    public final void d() {
        g();
    }
}
