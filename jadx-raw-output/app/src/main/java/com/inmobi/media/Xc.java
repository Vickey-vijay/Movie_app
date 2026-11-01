package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
public final class Xc implements InterfaceC2786cj, InterfaceC2843f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f23791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InMobiAdRequestStatus f23792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ec f23793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Jc f23794d;

    @Override // com.inmobi.media.InterfaceC2786cj
    public final void a() {
        C3053n9 c3053n9 = this.f23793c.f22583a.f25676a.f24939c;
        if (c3053n9 != null) {
            c3053n9.a("NativeFailedState", "Initialize Called");
        }
        this.f23793c.f22585c.a(this.f23792b, this.f23791a);
    }

    @Override // com.inmobi.media.InterfaceC2786cj
    public final void c() {
    }

    public Xc(short s10, InMobiAdRequestStatus inMobiAdRequestStatus, Ec ec2, Jc jc2) {
        ck.p.j(inMobiAdRequestStatus, "status");
        ck.p.j(ec2, "nativeAdUnitComponent");
        ck.p.j(jc2, "stateMachine");
        this.f23791a = s10;
        this.f23792b = inMobiAdRequestStatus;
        this.f23793c = ec2;
        this.f23794d = jc2;
    }

    @Override // com.inmobi.media.InterfaceC2843f
    public final Object a(rj.c cVar) throws Throwable {
        C3053n9 c3053n9 = this.f23793c.f22583a.f25676a.f24939c;
        if (c3053n9 != null) {
            c3053n9.a("NativeFailedState", "onDestroy");
        }
        Object objA = this.f23794d.a(new Vc(), this, (ContinuationImpl) cVar);
        return objA == sj.a.f() ? objA : mj.r.f64562a;
    }
}
