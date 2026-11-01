package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class Y4 implements Qa, Fa, InterfaceC4324kh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f56199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R4 f56200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Xe f56201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4064af f56202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final M6 f56203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C4575ui f56204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Y8 f56205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C4281j0 f56206h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C4307k0 f56207i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Sk f56208j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Rg f56209k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final N8 f56210l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final PublicLogger f56211m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C4342l9 f56212n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final T4 f56213o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final InterfaceC4491r9 f56214p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C4386n3 f56215q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TimePassedChecker f56216r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C4572uf f56217s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yo f56218t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Kk f56219u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C4460q2 f56220v;

    public Y4(@NonNull Context context, @NonNull C4226gm c4226gm, @NonNull R4 r10, @NonNull C4437p4 c4437p4, @NonNull InterfaceC4272ih interfaceC4272ih, @NonNull W4 w10) {
        this(context, r10, new C4307k0(), new TimePassedChecker(), new C4132d5(context, r10, c4437p4, w10, c4226gm, interfaceC4272ih, C4418oa.k().w().c(), PackageManagerUtils.getAppVersionCodeInt(context), C4418oa.k().l(), new Q4()), c4437p4);
    }

    public void C() {
    }

    @Override // io.appmetrica.analytics.impl.Qa, io.appmetrica.analytics.impl.Rl
    public final void a(@NonNull Kl kl2, @Nullable C4226gm c4226gm) {
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(@NonNull Q5 q10) {
        String strA = Rf.a("Event received on service", EnumC4112cb.a(q10.f55776d), q10.getName(), q10.getValue());
        if (strA != null) {
            this.f56211m.info(strA, new Object[0]);
        }
        String str = this.f56200b.f55817b;
        if (TextUtils.isEmpty(str) || com.ironsource.Y1.f27894f.equals(str)) {
            return;
        }
        this.f56204f.a(q10, new C4550ti());
    }

    @Override // io.appmetrica.analytics.impl.Fa
    @NonNull
    public final R4 b() {
        return this.f56200b;
    }

    public final synchronized void e() {
        ((C4338l5) this.f56214p).d();
    }

    public final boolean A() {
        C4350lh c4350lh = (C4350lh) this.f56209k.a();
        return c4350lh.f57210n && this.f56216r.didTimePassSeconds(this.f56212n.f57190k, c4350lh.f57216t, "should force send permissions");
    }

    public final boolean B() {
        C4226gm c4226gm;
        C4572uf c4572uf = this.f56217s;
        c4572uf.f55796h.a(c4572uf.f55789a);
        boolean z10 = ((C4497rf) c4572uf.c()).f57605d;
        Rg rg2 = this.f56209k;
        synchronized (rg2) {
            c4226gm = rg2.f57492c.f55547a;
        }
        return !(z10 && c4226gm.f56847q);
    }

    public final void b(Q5 q10) {
        this.f56206h.a(q10.f55778f);
        C4256i0 c4256i0A = this.f56206h.a();
        C4307k0 c4307k0 = this.f56207i;
        Xe xe2 = this.f56201c;
        synchronized (c4307k0) {
            if (c4256i0A.f56934b > xe2.d().f56934b) {
                xe2.a(c4256i0A).b();
                this.f56211m.info("Save new app environment for %s. Value: %s", this.f56200b, c4256i0A.f56933a);
            }
        }
    }

    @NonNull
    public CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.MANUAL;
    }

    public final void d() {
        C4281j0 c4281j0 = this.f56206h;
        synchronized (c4281j0) {
            c4281j0.f56985a = new Gc();
        }
        this.f56207i.a(this.f56206h.a(), this.f56201c);
    }

    @NonNull
    public final C4460q2 f() {
        return this.f56220v;
    }

    @NonNull
    public final C4386n3 g() {
        return this.f56215q;
    }

    @Override // io.appmetrica.analytics.impl.Fa
    @NonNull
    public final Context getContext() {
        return this.f56199a;
    }

    @NonNull
    public final Xe h() {
        return this.f56201c;
    }

    @NonNull
    public final M6 i() {
        return this.f56203e;
    }

    @NonNull
    public final N8 j() {
        return this.f56210l;
    }

    @NonNull
    public final Y8 k() {
        return this.f56205g;
    }

    @NonNull
    public final C4342l9 l() {
        return this.f56212n;
    }

    @NonNull
    public final InterfaceC4491r9 m() {
        return this.f56214p;
    }

    @NonNull
    public final C4350lh n() {
        return (C4350lh) this.f56209k.a();
    }

    @Nullable
    public final String o() {
        return this.f56201c.j();
    }

    @NonNull
    public final PublicLogger p() {
        return this.f56211m;
    }

    @NonNull
    public final C4064af q() {
        return this.f56202d;
    }

    @NonNull
    public final Kk r() {
        return this.f56219u;
    }

    @NonNull
    public final Sk s() {
        return this.f56208j;
    }

    @NonNull
    public final C4226gm t() {
        C4226gm c4226gm;
        Rg rg2 = this.f56209k;
        synchronized (rg2) {
            c4226gm = rg2.f57492c.f55547a;
        }
        return c4226gm;
    }

    @NonNull
    public final yo u() {
        return this.f56218t;
    }

    public final void v() {
        C4342l9 c4342l9 = this.f56212n;
        int i10 = c4342l9.f57189j;
        c4342l9.f57191l = i10;
        c4342l9.f57180a.a(i10).b();
    }

    public final boolean x() {
        C4350lh c4350lh = (C4350lh) this.f56209k.a();
        return c4350lh.f57210n && c4350lh.isIdentifiersValid() && this.f56216r.didTimePassSeconds(this.f56212n.f57190k, c4350lh.f57215s, "need to check permissions");
    }

    public final boolean y() {
        C4342l9 c4342l9 = this.f56212n;
        return c4342l9.f57191l < c4342l9.f57189j && ((C4350lh) this.f56209k.a()).f57211o && ((C4350lh) this.f56209k.a()).isIdentifiersValid();
    }

    public final void z() {
        Rg rg2 = this.f56209k;
        synchronized (rg2) {
            rg2.f57490a = null;
        }
    }

    public final void w() {
        int iOptInt;
        int libraryApiLevel = AppMetrica.getLibraryApiLevel();
        yo yoVar = this.f56218t;
        synchronized (yoVar) {
            iOptInt = yoVar.f58037a.a().optInt("last_migration_api_level", 0);
        }
        Integer numValueOf = Integer.valueOf(iOptInt);
        if (numValueOf.intValue() < libraryApiLevel) {
            this.f56213o.getClass();
            List listE = nj.r.e(new V4(this));
            int iIntValue = numValueOf.intValue();
            Iterator it = listE.iterator();
            while (it.hasNext()) {
                ((U4) it.next()).a(iIntValue);
            }
            this.f56218t.b(libraryApiLevel);
        }
    }

    public Y4(Context context, R4 r10, C4307k0 c4307k0, TimePassedChecker timePassedChecker, C4132d5 c4132d5, C4437p4 c4437p4) {
        this.f56199a = context.getApplicationContext();
        this.f56200b = r10;
        this.f56207i = c4307k0;
        this.f56216r = timePassedChecker;
        yo yoVarF = c4132d5.f();
        this.f56218t = yoVarF;
        this.f56217s = C4418oa.k().t();
        Xe xeA = c4132d5.e().a();
        this.f56201c = xeA;
        this.f56220v = c4132d5.a(xeA);
        Rg rgA = c4132d5.a(this);
        this.f56209k = rgA;
        PublicLogger publicLoggerA = c4132d5.d().a();
        this.f56211m = publicLoggerA;
        this.f56202d = C4418oa.k().y();
        C4281j0 c4281j0A = c4307k0.a(r10, publicLoggerA, xeA);
        this.f56206h = c4281j0A;
        this.f56210l = c4132d5.a();
        M6 m6B = c4132d5.b(this);
        this.f56203e = m6B;
        C4625wi c4625wiD = c4132d5.d(this);
        this.f56213o = C4132d5.b();
        w();
        Sk skA = C4132d5.a(this, yoVarF, new X4(this));
        this.f56208j = skA;
        publicLoggerA.info("Read app environment for component %s. Value: %s", r10.toString(), c4281j0A.a().f56933a);
        Kk kkC = c4132d5.c();
        this.f56219u = kkC;
        this.f56212n = c4132d5.a(xeA, yoVarF, skA, m6B, c4281j0A, kkC, c4625wiD);
        Y8 y8C = C4132d5.c(this);
        this.f56205g = y8C;
        this.f56204f = C4132d5.a(this, y8C);
        this.f56215q = c4132d5.b(xeA);
        this.f56214p = c4132d5.a(c4625wiD, m6B, rgA, c4437p4, r10, xeA);
        m6B.e();
    }

    @Override // io.appmetrica.analytics.impl.Qa, io.appmetrica.analytics.impl.Fa
    public synchronized void a(@NonNull C4437p4 c4437p4) {
        long jLongValue;
        this.f56209k.a(c4437p4);
        boolean z10 = false;
        if (Boolean.TRUE.equals(c4437p4.f57482h)) {
            this.f56211m.setEnabled(true);
        } else {
            if (Boolean.FALSE.equals(c4437p4.f57482h)) {
                this.f56211m.setEnabled(false);
            }
        }
        C4460q2 c4460q2 = this.f56220v;
        Set<String> set = c4437p4.f57489o;
        long jCurrentTimeMillis = c4460q2.f57542d.currentTimeMillis();
        boolean z11 = false;
        for (String str : set) {
            Long l10 = (Long) c4460q2.f57543e.get(str);
            if (l10 != null) {
                jLongValue = l10.longValue();
            } else {
                jLongValue = -1;
                z11 = true;
            }
            if (jCurrentTimeMillis - jLongValue > c4460q2.f57540b) {
                c4460q2.f57543e.put(str, Long.valueOf(jCurrentTimeMillis));
                z10 = true;
            }
        }
        if (z10) {
            c4460q2.a(c4460q2.f57543e);
            c4460q2.f57539a.a(c4460q2.f57543e);
        }
        if (z11) {
            this.f56209k.e();
        }
    }

    @Override // io.appmetrica.analytics.impl.Qa, io.appmetrica.analytics.impl.Rl
    public final synchronized void a(@NonNull C4226gm c4226gm) {
        this.f56209k.a(c4226gm);
        ((C4338l5) this.f56214p).e();
    }

    public final void a(@Nullable String str) {
        this.f56201c.j(str).b();
    }
}
