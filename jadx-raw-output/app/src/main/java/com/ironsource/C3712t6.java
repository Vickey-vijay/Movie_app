package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.time.DurationUnit;

/* JADX INFO: renamed from: com.ironsource.t6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3712t6 implements InterfaceC3589m6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lb f31265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final W0 f31266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC3757w0 f31267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC3763w6 f31268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final bk.q<B, H, InterfaceC3589m6, C3571l6> f31269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC3755vf f31270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC3710t4 f31271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C3609n6 f31272h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b f31273i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a f31274j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final tg f31275k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private InterfaceC3755vf.a f31276l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Long f31277m;

    /* JADX INFO: renamed from: com.ironsource.t6$a */
    public interface a {
        void a(C3712t6 c3712t6, IronSourceError ironSourceError);

        void a(C3712t6 c3712t6, LevelPlayAdInfo levelPlayAdInfo);
    }

    /* JADX INFO: renamed from: com.ironsource.t6$b */
    public interface b {
        void a(C3712t6 c3712t6);

        void b(C3712t6 c3712t6, IronSourceError ironSourceError);

        void b(C3712t6 c3712t6, LevelPlayAdInfo levelPlayAdInfo);

        void c(C3712t6 c3712t6, LevelPlayAdInfo levelPlayAdInfo);
    }

    /* JADX INFO: renamed from: com.ironsource.t6$c */
    public static final class c implements Bg {
        @Override // com.ironsource.Bg
        public void a(int i10, String str) {
            Long lValueOf;
            ck.p.j(str, "errorReason");
            Long l10 = C3712t6.this.f31277m;
            if (l10 != null) {
                lValueOf = Long.valueOf(C3712t6.this.f31271g.a() - l10.longValue());
            } else {
                lValueOf = null;
            }
            C3712t6.this.f31266b.e().e().a(lValueOf != null ? lValueOf.longValue() : 0L, i10, str, C3712t6.this.f31267c.u());
            b bVar = C3712t6.this.f31273i;
            if (bVar != null) {
                bVar.b(C3712t6.this, new IronSourceError(i10, str));
            }
        }

        public c() {
        }

        @Override // com.ironsource.Bg
        public void b(A a10) {
            Long lValueOf;
            ck.p.j(a10, C3605n2.f30210p);
            Long l10 = C3712t6.this.f31277m;
            if (l10 != null) {
                lValueOf = Long.valueOf(C3712t6.this.f31271g.a() - l10.longValue());
            } else {
                lValueOf = null;
            }
            C3712t6.this.f31266b.e().e().a(lValueOf != null ? lValueOf.longValue() : 0L, C3712t6.this.f31267c.u());
            C3712t6.this.g();
            b bVar = C3712t6.this.f31273i;
            if (bVar != null) {
                bVar.b(C3712t6.this, a10.e());
            }
        }

        @Override // com.ironsource.Bg
        public void a(A a10) {
            ck.p.j(a10, C3605n2.f30210p);
            C3712t6.this.f31266b.e().a().e(C3712t6.this.c());
            C3712t6.this.g();
            b bVar = C3712t6.this.f31273i;
            if (bVar != null) {
                bVar.c(C3712t6.this, a10.e());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.t6$d */
    public /* synthetic */ class d extends FunctionReferenceImpl implements bk.q<B, H, InterfaceC3589m6, C3571l6> {
        public d(Object obj) {
            super(3, obj, C3712t6.class, "createAdInstance", "createAdInstance(Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/AdInstanceData;Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/AdInstancePayload;Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/listeners/FullscreenAdInstanceListener;)Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/FullscreenAdInstance;", 0);
        }

        @Override // bk.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3571l6 invoke(B b10, H h10, InterfaceC3589m6 interfaceC3589m6) {
            ck.p.j(b10, "p0");
            ck.p.j(h10, "p1");
            ck.p.j(interfaceC3589m6, "p2");
            return ((C3712t6) this.receiver).a(b10, h10, interfaceC3589m6);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.t6$e */
    public static final class e extends Lambda implements bk.l<C3712t6, mj.r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f31279a = new e();

        public e() {
            super(1);
        }

        public final void a(C3712t6 c3712t6) {
            ck.p.j(c3712t6, "$this$weak");
            b bVar = c3712t6.f31273i;
            if (bVar != null) {
                bVar.a(c3712t6);
            }
            c3712t6.f31275k.a();
        }

        @Override // bk.l
        public /* bridge */ /* synthetic */ mj.r invoke(C3712t6 c3712t6) {
            a(c3712t6);
            return mj.r.f64562a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3712t6(Lb lb2, W0 w10, AbstractC3757w0 abstractC3757w0, InterfaceC3763w6 interfaceC3763w6, vg vgVar, bk.q<? super B, ? super H, ? super InterfaceC3589m6, C3571l6> qVar, InterfaceC3755vf interfaceC3755vf, InterfaceC3710t4 interfaceC3710t4) {
        ck.p.j(lb2, "mediationServices");
        ck.p.j(w10, "adUnitTools");
        ck.p.j(abstractC3757w0, "adUnitData");
        ck.p.j(interfaceC3763w6, "fullscreenListener");
        ck.p.j(interfaceC3755vf, "taskScheduler");
        ck.p.j(interfaceC3710t4, "currentTimeProvider");
        this.f31265a = lb2;
        this.f31266b = w10;
        this.f31267c = abstractC3757w0;
        this.f31268d = interfaceC3763w6;
        this.f31269e = qVar;
        this.f31270f = interfaceC3755vf;
        this.f31271g = interfaceC3710t4;
        this.f31275k = a(vgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c() {
        return this.f31267c.l();
    }

    private final InterfaceC3650pb<mj.r> f() {
        if (!this.f31275k.h()) {
            return new InterfaceC3650pb.a(new IronSourceError(509, "show called while ad unit is not ready to show"));
        }
        if (this.f31265a.p().a(c(), b()).d()) {
            return new InterfaceC3650pb.a(new IronSourceError(IronSourceError.ERROR_PLACEMENT_CAPPED, "placement " + c() + " is capped"));
        }
        if (!this.f31265a.f().a(this.f31267c.b().c()).d()) {
            return new InterfaceC3650pb.b(mj.r.f64562a);
        }
        return new InterfaceC3650pb.a(new IronSourceError(IronSourceError.ERROR_AD_UNIT_CAPPED, "adUnitId " + this.f31267c.b().c() + " is capped"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        InterfaceC3755vf.a aVar = this.f31276l;
        if (aVar != null) {
            aVar.a();
        }
        long jB = this.f31266b.b(b());
        InterfaceC3755vf interfaceC3755vf = this.f31270f;
        InterfaceC3755vf.b bVarA = X6.a(this, e.f31279a);
        mk.b.a aVar2 = mk.b.f64563c;
        this.f31276l = interfaceC3755vf.a(bVarA, mk.d.t(jB, DurationUnit.MILLISECONDS));
    }

    private final void h() {
        String strC = c();
        if (strC.length() > 0) {
            this.f31265a.a().b(strC, b());
            M3 m3A = this.f31265a.p().a(strC, b());
            if (m3A.d()) {
                this.f31266b.e().a().b(strC, m3A.e());
            }
        }
    }

    @Override // com.ironsource.E
    public void b(A a10) {
        ck.p.j(a10, C3605n2.f30210p);
        this.f31275k.c(a10);
        this.f31266b.e().a().g(c());
        this.f31265a.h().b(com.unity3d.mediation.a.a(b()));
    }

    public final InterfaceC3763w6 d() {
        return this.f31268d;
    }

    public final LevelPlayAdInfo e() {
        A aE = this.f31275k.e();
        if (aE != null) {
            return aE.e();
        }
        return null;
    }

    public final void finalize() {
        IronLog.INTERNAL.verbose(C3621o0.a(this.f31266b, "finalizing ad unit", (String) null, 2, (Object) null));
        InterfaceC3755vf.a aVar = this.f31276l;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void a(InterfaceC3763w6 interfaceC3763w6) {
        ck.p.j(interfaceC3763w6, "<set-?>");
        this.f31268d = interfaceC3763w6;
    }

    public final void a(b bVar) {
        ck.p.j(bVar, "loadListener");
        IronLog.INTERNAL.verbose(C3621o0.a(this.f31266b, (String) null, (String) null, 3, (Object) null));
        this.f31273i = bVar;
        this.f31277m = Long.valueOf(this.f31271g.a());
        this.f31266b.a(new C3672r0(this.f31267c.b()));
        D d10 = new D() { // from class: com.ironsource.xl
            @Override // com.ironsource.D
            public final A a(B b10, H h10) {
                return C3712t6.a(this.f31609a, b10, h10);
            }
        };
        this.f31266b.e().e().a(this.f31267c.u());
        this.f31275k.a(d10);
    }

    @Override // com.ironsource.InterfaceC3589m6
    public void b(C3571l6 c3571l6) {
        ck.p.j(c3571l6, "fullscreenInstance");
        this.f31266b.e().a().b(c());
        this.f31275k.c();
        this.f31272h = null;
        this.f31268d.onClosed();
    }

    private final LevelPlay.AdFormat b() {
        return this.f31267c.b().e();
    }

    public /* synthetic */ C3712t6(Lb lb2, W0 w10, AbstractC3757w0 abstractC3757w0, InterfaceC3763w6 interfaceC3763w6, vg vgVar, bk.q qVar, InterfaceC3755vf interfaceC3755vf, InterfaceC3710t4 interfaceC3710t4, int i10, ck.i iVar) {
        this(lb2, w10, abstractC3757w0, interfaceC3763w6, (i10 & 16) != 0 ? null : vgVar, (i10 & 32) != 0 ? null : qVar, (i10 & 64) != 0 ? new W6(X6.a(w10.a())) : interfaceC3755vf, (i10 & 128) != 0 ? new InterfaceC3710t4.a() : interfaceC3710t4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A a(C3712t6 c3712t6, B b10, H h10) {
        ck.p.j(c3712t6, "this$0");
        ck.p.j(b10, "instanceData");
        ck.p.j(h10, "adInstancePayload");
        bk.q dVar = c3712t6.f31269e;
        if (dVar == null) {
            dVar = new d(c3712t6);
        }
        return (A) dVar.invoke(b10, h10, c3712t6);
    }

    public final void a(Activity activity, a aVar) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        ck.p.j(aVar, "displayListener");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(C3621o0.a(this.f31266b, (String) null, (String) null, 3, (Object) null));
        this.f31274j = aVar;
        this.f31266b.e().a().a(activity, c());
        InterfaceC3650pb<mj.r> interfaceC3650pbF = f();
        if (interfaceC3650pbF instanceof InterfaceC3650pb.a) {
            IronSourceError ironSourceErrorB = ((InterfaceC3650pb.a) interfaceC3650pbF).b();
            ironLog.verbose(C3621o0.a(this.f31266b, ironSourceErrorB.getErrorMessage(), (String) null, 2, (Object) null));
            this.f31266b.e().a().a(c(), ironSourceErrorB.getErrorCode(), ironSourceErrorB.getErrorMessage(), this.f31275k.g());
            aVar.a(this, ironSourceErrorB);
            return;
        }
        InterfaceC3755vf.a aVar2 = this.f31276l;
        if (aVar2 != null) {
            aVar2.a();
        }
        C3609n6 c3609n6 = new C3609n6(activity);
        this.f31272h = c3609n6;
        this.f31275k.a((J) c3609n6, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C3571l6 a(B b10, H h10, InterfaceC3589m6 interfaceC3589m6) {
        return new C3571l6(new W0(this.f31266b, E0.b.PROVIDER), b10, h10, interfaceC3589m6);
    }

    private final tg a(vg vgVar) {
        Bg bgA = a();
        if (vgVar != null) {
            return vgVar.a(bgA);
        }
        return new tg(this.f31266b, this.f31267c, Lb.f26968s.c().g().f(), bgA);
    }

    private final Bg a() {
        return new c();
    }

    @Override // com.ironsource.InterfaceC3589m6
    public void a(C3571l6 c3571l6) {
        ck.p.j(c3571l6, "fullscreenInstance");
        this.f31275k.c();
        this.f31272h = null;
        a aVar = this.f31274j;
        if (aVar != null) {
            aVar.a(this, c3571l6.e());
        }
        h();
        this.f31265a.l().b(this.f31267c.b().c());
    }

    @Override // com.ironsource.E
    public void a(A a10, IronSourceError ironSourceError) {
        ck.p.j(a10, C3605n2.f30210p);
        ck.p.j(ironSourceError, "error");
        IronLog.INTERNAL.verbose(C3621o0.a(this.f31266b, ironSourceError.toString(), (String) null, 2, (Object) null));
        C3609n6 c3609n6 = this.f31272h;
        Ed edG = this.f31275k.g();
        a(edG);
        if (edG == Ed.CAN_RECOVER && c3609n6 != null) {
            this.f31275k.a((J) c3609n6, true);
            return;
        }
        this.f31275k.c();
        this.f31272h = null;
        this.f31266b.e().a().a(c(), ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), edG);
        a aVar = this.f31274j;
        if (aVar != null) {
            aVar.a(this, ironSourceError);
        }
    }

    private final void a(Ed ed2) {
        if (ed2 == Ed.CAN_RECOVER || ed2 == Ed.NO_LOADED_ADS) {
            this.f31266b.e().h().a(ed2);
        }
    }

    @Override // com.ironsource.InterfaceC3589m6
    public void a(C3571l6 c3571l6, LevelPlayReward levelPlayReward) {
        ck.p.j(c3571l6, "fullscreenInstance");
        ck.p.j(levelPlayReward, "reward");
        IronLog.INTERNAL.verbose(C3621o0.a(this.f31266b, c3571l6.q(), (String) null, 2, (Object) null));
        this.f31268d.a(levelPlayReward);
    }

    @Override // com.ironsource.E
    public void a(A a10) {
        ck.p.j(a10, C3605n2.f30210p);
        this.f31266b.e().a().a(c());
        this.f31268d.e();
    }
}
