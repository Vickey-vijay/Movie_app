package com.ironsource;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.ironsource.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3639p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC3757w0 f30379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final W6 f30380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final W0 f30381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private M0 f30382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC3791y0 f30383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final tg f30384f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final WeakReference<K0> f30385g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C3570l5 f30386h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final E5 f30387i;

    /* JADX INFO: renamed from: com.ironsource.p0$a */
    public class a implements E {
        @Override // com.ironsource.E
        public void a(A a10, IronSourceError ironSourceError) {
            ck.p.j(a10, C3605n2.f30210p);
            ck.p.j(ironSourceError, "error");
            IronLog.INTERNAL.verbose(AbstractC3639p0.this.a(a10.q()));
            AbstractC3639p0.this.f30387i.a().a(AbstractC3639p0.this.h(), ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), null);
            InterfaceC3791y0 interfaceC3791y0I = AbstractC3639p0.this.i();
            if (interfaceC3791y0I != null) {
                interfaceC3791y0I.c(ironSourceError);
            }
        }

        public a() {
        }

        @Override // com.ironsource.E
        public void b(A a10) {
            ck.p.j(a10, C3605n2.f30210p);
            IronLog.INTERNAL.verbose(AbstractC3639p0.this.a(a10.q()));
            AbstractC3639p0.this.k().c(a10);
            AbstractC3639p0.this.f30387i.a().g(AbstractC3639p0.this.h());
            AbstractC3639p0.this.f().l().b(AbstractC3639p0.this.e().b().a());
        }

        @Override // com.ironsource.E
        public void a(A a10) {
            ck.p.j(a10, C3605n2.f30210p);
            AbstractC3639p0.this.f30387i.a().a(AbstractC3639p0.this.h());
            K0 k10 = (K0) AbstractC3639p0.this.f30385g.get();
            if (k10 != null) {
                k10.e();
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.p0$b */
    public static final class b implements Bg {
        @Override // com.ironsource.Bg
        public void a(int i10, String str) {
            ck.p.j(str, "errorReason");
            AbstractC3639p0.this.a(i10, str);
        }

        public b() {
        }

        @Override // com.ironsource.Bg
        public void a(A a10) {
            ck.p.j(a10, C3605n2.f30210p);
            AbstractC3639p0.this.f().e().a().e(AbstractC3639p0.this.h());
            M0 m0J = AbstractC3639p0.this.j();
            if (m0J != null) {
                m0J.b(new C3706t0(AbstractC3639p0.this, a10.e()));
            }
        }

        @Override // com.ironsource.Bg
        public void b(A a10) {
            ck.p.j(a10, C3605n2.f30210p);
            AbstractC3639p0.this.f30387i.e().a(C3570l5.a(AbstractC3639p0.this.f30386h), AbstractC3639p0.this.e().u());
            M0 m0J = AbstractC3639p0.this.j();
            if (m0J != null) {
                m0J.a(new C3706t0(AbstractC3639p0.this, a10.e()));
            }
        }
    }

    public AbstractC3639p0(C3621o0 c3621o0, AbstractC3757w0 abstractC3757w0, K0 k10, W6 w10) {
        ck.p.j(c3621o0, "adTools");
        ck.p.j(abstractC3757w0, "adUnitData");
        ck.p.j(k10, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ck.p.j(w10, "taskScheduler");
        this.f30379a = abstractC3757w0;
        this.f30380b = w10;
        W0 w11 = new W0(c3621o0, abstractC3757w0, E0.b.MEDIATION);
        this.f30381c = w11;
        this.f30384f = new tg(w11, abstractC3757w0, false, c());
        this.f30385g = new WeakReference<>(k10);
        this.f30387i = w11.e();
        IronLog.INTERNAL.verbose("adFormat = " + abstractC3757w0.b().a() + ", adUnitId = " + abstractC3757w0.b().c());
    }

    public abstract D a();

    private final b c() {
        return new b();
    }

    public final void a(InterfaceC3791y0 interfaceC3791y0) {
        this.f30383e = interfaceC3791y0;
    }

    public final void b(M0 m10) {
        this.f30382d = m10;
    }

    public InterfaceC3529j0 d() {
        return this.f30384f.h() ? InterfaceC3529j0.b.f29181a : new InterfaceC3529j0.a(null, 1, null);
    }

    public final AbstractC3757w0 e() {
        return this.f30379a;
    }

    public final W0 f() {
        return this.f30381c;
    }

    public final C3489gd g() {
        return this.f30379a.b().f();
    }

    public final String h() {
        return this.f30379a.l();
    }

    public final InterfaceC3791y0 i() {
        return this.f30383e;
    }

    public final M0 j() {
        return this.f30382d;
    }

    public final tg k() {
        return this.f30384f;
    }

    public void a(M0 m10) {
        ck.p.j(m10, "loadListener");
        IronLog.INTERNAL.verbose(C3621o0.a(this.f30381c, (String) null, (String) null, 3, (Object) null));
        this.f30381c.a(b());
        this.f30382d = m10;
        this.f30387i.a(this.f30379a.u());
        this.f30386h = new C3570l5();
        this.f30384f.a(a());
    }

    public C3672r0 b() {
        return new C3672r0(this.f30379a.b());
    }

    public final void a(J j10, InterfaceC3791y0 interfaceC3791y0) {
        ck.p.j(j10, "adInstancePresenter");
        ck.p.j(interfaceC3791y0, "displayListener");
        this.f30383e = interfaceC3791y0;
        this.f30384f.a(j10, false);
    }

    public /* synthetic */ AbstractC3639p0(C3621o0 c3621o0, AbstractC3757w0 abstractC3757w0, K0 k10, W6 w10, int i10, ck.i iVar) {
        this(c3621o0, abstractC3757w0, k10, (i10 & 8) != 0 ? new W6(X6.a(c3621o0.a())) : w10);
    }

    public final void a(boolean z10) {
        IronLog.INTERNAL.verbose(C3621o0.a(this.f30381c, (String) null, (String) null, 3, (Object) null));
        this.f30384f.d();
        if (z10) {
            this.f30381c.e().e().a(this.f30381c.f());
        }
    }

    public final void a(int i10, String str) {
        ck.p.j(str, "errorReason");
        IronLog.INTERNAL.verbose(a("errorCode = " + i10 + ", errorReason = " + str));
        this.f30387i.e().a(C3570l5.a(this.f30386h), i10, str, this.f30379a.u());
        M0 m10 = this.f30382d;
        if (m10 != null) {
            m10.a(new IronSourceError(i10, str));
        }
    }

    public final String a(String str) {
        return C3621o0.a(this.f30381c, str, (String) null, 2, (Object) null);
    }
}
