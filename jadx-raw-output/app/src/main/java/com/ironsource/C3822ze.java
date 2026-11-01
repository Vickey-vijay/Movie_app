package com.ironsource;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ze, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C3822ze {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Re f31735b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static C3579le f31741h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static C3617ne f31742i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f31743j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static long f31744k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3822ze f31734a = new C3822ze();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final mj.g f31736c = kotlin.b.a(a.f31745a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f31737d = C3822ze.class.getSimpleName();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final De f31738e = new De();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Ke f31739f = new Ke();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final List<InterfaceC3686re> f31740g = new ArrayList();

    /* JADX INFO: renamed from: com.ironsource.ze$a */
    public static final class a extends Lambda implements bk.a<InterfaceC3628o7> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31745a = new a();

        public a() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3628o7 invoke() {
            return Lb.f26968s.d().k();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.ze$b */
    public static final class b implements InterfaceC3686re {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f31746a;

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(C3617ne c3617ne) {
            ck.p.j(c3617ne, "$error");
            C3822ze.f31734a.a(c3617ne);
        }

        @Override // com.ironsource.InterfaceC3686re
        public void a(final C3579le c3579le) {
            ck.p.j(c3579le, "sdkConfig");
            De de2 = C3822ze.f31738e;
            final Context context = this.f31746a;
            de2.a(new Runnable() { // from class: com.ironsource.gn
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    C3822ze.b.a(context, c3579le);
                }
            });
        }

        public b(Context context) {
            this.f31746a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Context context, C3579le c3579le) throws JSONException {
            ck.p.j(c3579le, "$sdkConfig");
            C3822ze c3822ze = C3822ze.f31734a;
            ck.p.i(context, "applicationContext");
            c3822ze.a(context, c3579le);
        }

        @Override // com.ironsource.InterfaceC3686re
        public void a(final C3617ne c3617ne) {
            ck.p.j(c3617ne, "error");
            C3822ze.f31738e.a(new Runnable() { // from class: com.ironsource.hn
                @Override // java.lang.Runnable
                public final void run() {
                    C3822ze.b.b(c3617ne);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3737ue c3737ue) {
        ck.p.j(c3737ue, "$serverResponse");
        C3579le c3579le = new C3579le(c3737ue);
        C3822ze c3822ze = f31734a;
        c3822ze.b(c3579le);
        c3822ze.a(c3579le);
    }

    private final InterfaceC3628o7 c() {
        return (InterfaceC3628o7) f31736c.getValue();
    }

    private final void d() {
        if (Lb.f26968s.d().g().h()) {
            C3400be.i().a(new C5(D5.EP_CONFIG_RECEIVED, (JSONObject) null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C3617ne c3617ne) {
        ck.p.j(c3617ne, "$error");
        f31734a.a(c3617ne);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f() {
        f31734a.a(true);
    }

    public final void e() {
        f31738e.c(new Runnable() { // from class: com.ironsource.en
            @Override // java.lang.Runnable
            public final void run() {
                C3822ze.f();
            }
        });
    }

    private C3822ze() {
    }

    private final void a(Context context, X9 x10, Ne ne2) {
        x10.i(ne2.g().h());
        x10.c(ne2.g().d());
        A1 a1B = ne2.c().b();
        ck.p.g(a1B);
        x10.a(a1B.a());
        x10.d(a1B.c().b());
        x10.b(a1B.k().b());
        x10.a(Boolean.valueOf(IronSourceUtils.c(context)));
        A1 a1B2 = ne2.c().b();
        ck.p.g(a1B2);
        x10.b(a1B2.f().b());
    }

    public final void b(final C3617ne c3617ne) {
        ck.p.j(c3617ne, "error");
        f31738e.c(new Runnable() { // from class: com.ironsource.dn
            @Override // java.lang.Runnable
            public final void run() {
                C3822ze.c(c3617ne);
            }
        });
    }

    private final void b(C3579le c3579le) {
        f31741h = c3579le;
        a(false);
    }

    private final Be b() {
        if (f31741h != null) {
            return Be.INITIATED;
        }
        if (f31742i != null) {
            return Be.INIT_FAILED;
        }
        if (f31743j) {
            return Be.INIT_IN_PROGRESS;
        }
        return Be.NOT_INIT;
    }

    public final void a(final Context context, final C3720te c3720te, final InterfaceC3686re interfaceC3686re) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(c3720te, "initRequest");
        ck.p.j(interfaceC3686re, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        final Context applicationContext = context.getApplicationContext();
        f31738e.c(new Runnable() { // from class: com.ironsource.fn
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                C3822ze.a(interfaceC3686re, context, c3720te, applicationContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(InterfaceC3686re interfaceC3686re, C3579le c3579le) {
        ck.p.j(interfaceC3686re, "$listener");
        ck.p.j(c3579le, "$sdkConfig");
        interfaceC3686re.a(c3579le);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC3686re interfaceC3686re, Context context, C3720te c3720te, Context context2) throws Throwable {
        ck.p.j(interfaceC3686re, "$listener");
        ck.p.j(context, "$context");
        ck.p.j(c3720te, "$initRequest");
        C3579le c3579le = f31741h;
        if (c3579le != null) {
            f31734a.a(interfaceC3686re, c3579le);
            return;
        }
        f31740g.add(interfaceC3686re);
        if (f31743j) {
            return;
        }
        f31742i = null;
        f31734a.a(true);
        f31744k = new Date().getTime();
        f31739f.a(context, c3720te, f31738e, new b(context2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(InterfaceC3686re interfaceC3686re, C3617ne c3617ne) {
        ck.p.j(interfaceC3686re, "$listener");
        ck.p.j(c3617ne, "$error");
        interfaceC3686re.a(c3617ne);
    }

    private final void b(Context context, C3579le c3579le) {
        H1 h1B;
        Qb qbE;
        H1 h1G;
        U2 u2C;
        H1 h1G2;
        H9 h9D;
        H1 h1I;
        Zd zdF;
        H1 h1M;
        H1 h1B2;
        Ne neD = c3579le.d();
        A1 a1B = neD.c().b();
        boolean zL = (a1B == null || (h1B2 = a1B.b()) == null) ? false : h1B2.l();
        T3 t3C = neD.c();
        boolean zL2 = (t3C == null || (zdF = t3C.f()) == null || (h1M = zdF.m()) == null) ? false : h1M.l();
        T3 t3C2 = neD.c();
        boolean zL3 = (t3C2 == null || (h9D = t3C2.d()) == null || (h1I = h9D.i()) == null) ? false : h1I.l();
        T3 t3C3 = neD.c();
        boolean zL4 = (t3C3 == null || (u2C = t3C3.c()) == null || (h1G2 = u2C.g()) == null) ? false : h1G2.l();
        T3 t3C4 = neD.c();
        boolean zL5 = (t3C4 == null || (qbE = t3C4.e()) == null || (h1G = qbE.g()) == null) ? false : h1G.l();
        if (zL) {
            A1 a1B2 = neD.c().b();
            if (a1B2 != null && (h1B = a1B2.b()) != null) {
                a(f31734a, Lb.f26968s.d().q(), h1B, context, neD, false, 16, null);
            }
        } else {
            Lb.f26968s.d().q().a(false);
        }
        if (zL2) {
            T3 t3C5 = neD.c();
            Zd zdF2 = t3C5 != null ? t3C5.f() : null;
            ck.p.g(zdF2);
            H1 h1M2 = zdF2.m();
            C3400be c3400beI = C3400be.i();
            ck.p.i(c3400beI, "getInstance()");
            ck.p.i(h1M2, "rewardedVideoConfig");
            a(this, c3400beI, h1M2, context, neD, false, 16, null);
        } else {
            C3400be.i().a(false);
        }
        if (zL3) {
            T3 t3C6 = neD.c();
            H9 h9D2 = t3C6 != null ? t3C6.d() : null;
            ck.p.g(h9D2);
            H1 h1I2 = h9D2.i();
            J9 j9I = J9.i();
            ck.p.i(j9I, "getInstance()");
            ck.p.i(h1I2, "interstitialConfig");
            a(this, j9I, h1I2, context, neD, false, 16, null);
        } else if (zL4) {
            T3 t3C7 = neD.c();
            U2 u2C2 = t3C7 != null ? t3C7.c() : null;
            ck.p.g(u2C2);
            H1 h1G3 = u2C2.g();
            J9 j9I2 = J9.i();
            ck.p.i(j9I2, "getInstance()");
            ck.p.i(h1G3, "bannerConfig");
            a(this, j9I2, h1G3, context, neD, false, 16, null);
        } else if (zL5) {
            T3 t3C8 = neD.c();
            Qb qbE2 = t3C8 != null ? t3C8.e() : null;
            ck.p.g(qbE2);
            H1 h1G4 = qbE2.g();
            J9 j9I3 = J9.i();
            ck.p.i(j9I3, "getInstance()");
            a(this, j9I3, h1G4, context, neD, false, 16, null);
        } else {
            J9.i().a(false);
        }
        T3 t3C9 = neD.c();
        A1 a1B3 = t3C9 != null ? t3C9.b() : null;
        ck.p.g(a1B3);
        C3453ed c3453edI = a1B3.i();
        boolean zA = c3453edI.a();
        String strB = c3453edI.b();
        boolean zC = c3453edI.c();
        int iD = c3453edI.d();
        int[] iArrE = c3453edI.e();
        int[] iArrF = c3453edI.f();
        C3435dd c3435dd = C3435dd.P;
        c3435dd.a(zA);
        if (zA) {
            c3435dd.b(strB, context);
            c3435dd.b(iArrE, context);
            c3435dd.c(iArrF, context);
            c3435dd.b(zC);
            c3435dd.c(iD);
        }
    }

    public final void a(final C3737ue c3737ue) {
        ck.p.j(c3737ue, "serverResponse");
        f31738e.c(new Runnable() { // from class: com.ironsource.bn
            @Override // java.lang.Runnable
            public final void run() {
                C3822ze.b(c3737ue);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C3617ne c3617ne) {
        f31742i = c3617ne;
        a(false);
        Iterator<InterfaceC3686re> it = f31740g.iterator();
        while (it.hasNext()) {
            a(it.next(), c3617ne);
        }
        f31740g.clear();
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: " + c3617ne, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Context context, C3579le c3579le) throws JSONException {
        b(c3579le);
        K1 k1A = c3579le.a();
        C3373a5 c3373a5 = C3373a5.f28115a;
        c3373a5.c(k1A.g());
        Lb.b bVar = Lb.f26968s;
        bVar.a().o().a(k1A.c());
        c3373a5.a(k1A.f());
        c3373a5.a(k1A.j());
        IronSourceThreadManager.INSTANCE.setUseSharedExecutorService(k1A.h());
        c().a(k1A);
        De de2 = f31738e;
        a(context, de2.c(), c3579le.d());
        de2.a(new Date().getTime() - f31744k, c3579le.f());
        Re re2 = new Re();
        f31735b = re2;
        re2.a(c());
        IronSourceUtils.e(context, c3579le.d().toString());
        bVar.d().q().c(true);
        J9.i().c(true);
        C3400be.i().c(true);
        C3435dd.P.c(true);
        b(context, c3579le);
        IronSourceLoggerManager.getLogger(0).setDebugLevel(c3579le.e().b());
        D1 d1B = c3579le.b();
        if (d1B.f()) {
            de2.a(d1B);
        }
        a(c3579le);
        new C3435dd.a().a();
        d();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("parameters for init url: " + Pe.a());
        ironLog.verbose("parameters for init POST data: " + Pe.b());
    }

    private final void a(C3579le c3579le) {
        Iterator<InterfaceC3686re> it = f31740g.iterator();
        while (it.hasNext()) {
            a(it.next(), c3579le);
        }
        f31740g.clear();
    }

    private final void a(boolean z10) {
        f31743j = z10;
        f31738e.a(b());
    }

    private final void a(final InterfaceC3686re interfaceC3686re, final C3579le c3579le) {
        f31738e.e(new Runnable() { // from class: com.ironsource.cn
            @Override // java.lang.Runnable
            public final void run() {
                C3822ze.b(interfaceC3686re, c3579le);
            }
        });
    }

    private final void a(final InterfaceC3686re interfaceC3686re, final C3617ne c3617ne) {
        f31738e.e(new Runnable() { // from class: com.ironsource.an
            @Override // java.lang.Runnable
            public final void run() {
                C3822ze.b(interfaceC3686re, c3617ne);
            }
        });
    }

    public static /* synthetic */ void a(C3822ze c3822ze, AbstractC3692s3 abstractC3692s3, H1 h10, Context context, Ne ne2, boolean z10, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z10 = true;
        }
        c3822ze.a(abstractC3692s3, h10, context, ne2, z10);
    }

    private final void a(AbstractC3692s3 abstractC3692s3, H1 h10, Context context, Ne ne2, boolean z10) {
        abstractC3692s3.a(z10);
        abstractC3692s3.a(h10.c(), context);
        abstractC3692s3.b(h10.d(), context);
        abstractC3692s3.a(h10.f());
        abstractC3692s3.d(h10.e());
        abstractC3692s3.b(h10.a());
        abstractC3692s3.b(h10.i(), context);
        abstractC3692s3.c(h10.h(), context);
        abstractC3692s3.a(h10.j(), context);
        abstractC3692s3.d(h10.g(), context);
        A1 a1B = ne2.c().b();
        ck.p.g(a1B);
        abstractC3692s3.a(a1B.j());
        abstractC3692s3.b(h10.k());
        abstractC3692s3.c(h10.b());
    }
}
