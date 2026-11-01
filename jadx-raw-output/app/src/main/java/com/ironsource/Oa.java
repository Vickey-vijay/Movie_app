package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Lambda;
import kotlin.time.DurationUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class Oa implements Ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ha f27285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L2 f27286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final L2 f27287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f27288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC3650pb<LevelPlayAdInfo> f27289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InterfaceC3755vf.a f27290f;

    public static final class a extends Lambda implements bk.l<Oa, mj.r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27291a = new a();

        public a() {
            super(1);
        }

        public final void a(Oa oa2) {
            ck.p.j(oa2, "$this$weak");
            oa2.e();
        }

        @Override // bk.l
        public /* bridge */ /* synthetic */ mj.r invoke(Oa oa2) {
            a(oa2);
            return mj.r.f64562a;
        }
    }

    @Override // com.ironsource.Ra
    public void b() {
        this.f27285a.a("Loading an ad while reloading");
    }

    public Oa(Ha ha2, L2 l10, L2 l11, long j10) {
        ck.p.j(ha2, C3426d4.f.f28486e);
        ck.p.j(l10, "currentAdUnit");
        ck.p.j(l11, "reloadingAdUnit");
        this.f27285a = ha2;
        this.f27286b = l10;
        this.f27287c = l11;
        this.f27288d = j10;
        g();
    }

    private final void b(IronSourceError ironSourceError) {
        this.f27285a.a(ironSourceError, this.f27286b, (AbstractC3515i3) new AbstractC3515i3.c(this.f27285a.p().a() - this.f27288d, AbstractC3515i3.d.g.f29130a), true, false, Long.valueOf(this.f27288d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        InterfaceC3650pb<LevelPlayAdInfo> interfaceC3650pb = this.f27289e;
        if (interfaceC3650pb == null) {
            Ha ha2 = this.f27285a;
            ha2.a((Ra) new Qa(ha2, this.f27286b, this.f27287c, this.f27288d));
        } else if (interfaceC3650pb instanceof InterfaceC3650pb.b) {
            a((LevelPlayAdInfo) ((InterfaceC3650pb.b) interfaceC3650pb).b());
        } else if (interfaceC3650pb instanceof InterfaceC3650pb.a) {
            b(((InterfaceC3650pb.a) interfaceC3650pb).b());
        }
    }

    private final void g() {
        InterfaceC3755vf interfaceC3755vfO = this.f27285a.o();
        InterfaceC3755vf.b bVarA = X6.a(this, a.f27291a);
        mk.b.a aVar = mk.b.f64563c;
        this.f27290f = interfaceC3755vfO.a(bVarA, mk.d.t(this.f27285a.l(), DurationUnit.MILLISECONDS));
    }

    @Override // com.ironsource.M0
    public void a(C3706t0 c3706t0) {
        ck.p.j(c3706t0, "adUnitCallback");
        LevelPlayAdInfo levelPlayAdInfoC = c3706t0.c();
        if (levelPlayAdInfoC != null) {
            a(new InterfaceC3650pb.b(levelPlayAdInfoC));
        } else {
            a(new InterfaceC3650pb.a(new IronSourceError(0, "Missing ad info")));
        }
    }

    @Override // com.ironsource.Ra
    public void c() {
        InterfaceC3755vf.a aVar = this.f27290f;
        if (aVar != null) {
            aVar.a();
        }
        this.f27286b.a(true);
        this.f27287c.a(true);
        Ha ha2 = this.f27285a;
        ha2.a((Ra) new Ka(ha2));
    }

    @Override // com.ironsource.Ra
    public void d() {
        InterfaceC3755vf.a aVar = this.f27290f;
        if (aVar != null) {
            aVar.a();
        }
        Ha ha2 = this.f27285a;
        ha2.a((Ra) new Na(ha2, this.f27286b));
    }

    @Override // com.ironsource.Ra
    public void f() {
        Ha ha2 = this.f27285a;
        ha2.a((Ra) new Oa(ha2, this.f27286b, this.f27287c, ha2.p().a()));
    }

    @Override // com.ironsource.M0
    public void a(IronSourceError ironSourceError) {
        if (ironSourceError == null) {
            ironSourceError = new IronSourceError(0, "Unknown error");
        }
        a(new InterfaceC3650pb.a(ironSourceError));
    }

    private final void a(LevelPlayAdInfo levelPlayAdInfo) {
        long jA = this.f27285a.p().a() - this.f27288d;
        this.f27285a.a(new C3706t0(this.f27287c, levelPlayAdInfo), this.f27287c, this.f27286b, (AbstractC3515i3) new AbstractC3515i3.c(jA, AbstractC3515i3.d.h.f29131a), false, Long.valueOf(this.f27288d));
    }

    private final void a(InterfaceC3650pb<LevelPlayAdInfo> interfaceC3650pb) {
        if (this.f27289e != null) {
            this.f27285a.a("Received excessive load " + Pa.b(interfaceC3650pb) + " while reloading");
            return;
        }
        this.f27289e = interfaceC3650pb;
    }
}
