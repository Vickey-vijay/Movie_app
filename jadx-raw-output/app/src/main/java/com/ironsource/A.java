package com.ironsource;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class A implements AdapterAdListener, NetworkInitializationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W0 f25891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B f25892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final H f25893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private WeakReference<E> f25894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private F f25895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final BaseAdAdapter<?, ?> f25896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C3570l5 f25897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AbstractRunnableC3526ie f25898h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, Object> f25899i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f25900j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f25901k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f25902l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f25903m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AdData f25904n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final C3605n2 f25905o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final C3605n2 f25906p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f25907q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f25908r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f25909s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f25910t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final IronSource.a f25911u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f25912v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final I f25913w;

    public static final class a extends AbstractRunnableC3526ie {
        public a() {
        }

        @Override // com.ironsource.AbstractRunnableC3526ie
        public void a() {
            long jA = C3570l5.a(A.this.f25897g);
            IronLog ironLog = IronLog.INTERNAL;
            A a10 = A.this;
            ironLog.verbose(a10.a("Load duration = " + jA + ", isBidder = " + a10.u()));
            A.this.f25903m = true;
            A.this.f().e().e().a(jA, 1025, false);
            A.this.f().e().e().a(jA, 1025, "time out", false);
            A a11 = A.this;
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("time out");
            ck.p.i(ironSourceErrorBuildLoadFailedError, "buildLoadFailedError(errorMessage)");
            a11.a(ironSourceErrorBuildLoadFailedError);
        }
    }

    public abstract void A();

    public abstract void a(J j10);

    public void b() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        H();
        this.f25891a.e().e().a(this.f25912v);
    }

    public void c() {
    }

    public final IronSource.a d() {
        return this.f25911u;
    }

    public LevelPlayAdInfo e() {
        String string = this.f25892b.i().b().b().toString();
        ck.p.i(string, "instanceData.adUnitData.…roperties.adId.toString()");
        String strC = this.f25892b.i().b().c();
        String string2 = this.f25892b.h().toString();
        ck.p.i(string2, "instanceData.adFormat.toString()");
        return new LevelPlayAdInfo(string, strC, string2, this.f25892b.n(), null, this.f25892b.i().l(), kotlin.collections.a.x(this.f25899i));
    }

    public final W0 f() {
        return this.f25891a;
    }

    public final BaseAdAdapter<?, ?> g() {
        return this.f25896f;
    }

    public final C3605n2 h() {
        return this.f25905o;
    }

    public final AdData i() {
        return this.f25904n;
    }

    public final C3489gd j() {
        return this.f25892b.i().b().f();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess() {
        onAdLoadSuccess(new LinkedHashMap());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        onAdOpened(new LinkedHashMap());
    }

    public A(W0 w10, B b10, H h10, E e10) {
        ck.p.j(w10, "adTools");
        ck.p.j(b10, "instanceData");
        ck.p.j(h10, "adInstancePayload");
        ck.p.j(e10, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f25891a = w10;
        this.f25892b = b10;
        this.f25893c = h10;
        this.f25894d = new WeakReference<>(e10);
        this.f25899i = new LinkedHashMap();
        this.f25904n = b10.g();
        this.f25905o = b10.n();
        this.f25906p = b10.p();
        this.f25907q = b10.j().j();
        this.f25908r = b10.r();
        this.f25909s = b10.s();
        this.f25910t = b10.w();
        this.f25911u = b10.h();
        this.f25912v = b10.v();
        this.f25913w = b10.t();
        BaseAdAdapter<?, ?> baseAdAdapterA = a(b10);
        this.f25896f = baseAdAdapterA;
        w10.e().a(new C(w10, b10, baseAdAdapterA));
        w10.e().a(new U1(b10.k()));
    }

    private final void B() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        try {
            G();
            A();
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            String str = "unexpected error while calling adapter.loadAd() - " + th2.getMessage();
            IronLog.INTERNAL.error(a(str));
            this.f25891a.e().h().g(str);
            a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, str);
        }
    }

    private final void C() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        this.f25891a.e().a().a(k());
        E e10 = this.f25894d.get();
        if (e10 != null) {
            e10.a(this);
        }
    }

    private final void D() {
        IronLog ironLog = IronLog.INTERNAL;
        F f10 = null;
        ironLog.verbose(a(this, (String) null, 1, (Object) null));
        H();
        if (this.f25903m) {
            c();
            this.f25891a.e().h().f("instance load success after it was already failed");
            return;
        }
        if (this.f25901k) {
            this.f25891a.e().h().f("instance load success after it was already loaded");
            return;
        }
        this.f25901k = true;
        long jA = C3570l5.a(this.f25897g);
        ironLog.verbose(a("Load duration = " + jA));
        this.f25891a.e().e().a(jA, false);
        a(C3656q0.a.LoadedSuccessfully);
        F f11 = this.f25895e;
        if (f11 == null) {
            ck.p.B("loadListener");
        } else {
            f10 = f11;
        }
        f10.b(this);
    }

    private final void E() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        if (this.f25902l) {
            this.f25891a.e().h().f("instance opened after it was already opened");
            return;
        }
        this.f25902l = true;
        this.f25891a.e().a().g(k());
        a(C3656q0.a.ShowedSuccessfully);
        E e10 = this.f25894d.get();
        if (e10 != null) {
            e10.b(this);
        }
    }

    private final void F() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        H();
        if (this.f25903m) {
            return;
        }
        B();
    }

    private final void H() {
        AbstractRunnableC3526ie abstractRunnableC3526ie = this.f25898h;
        if (abstractRunnableC3526ie != null) {
            this.f25891a.b(abstractRunnableC3526ie);
            this.f25898h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(A a10) {
        ck.p.j(a10, "this$0");
        a10.F();
    }

    private final int o() {
        Integer numF = this.f25892b.n().f();
        return (numF == null || numF.intValue() <= 0) ? this.f25892b.i().h() : numF.intValue();
    }

    public final String k() {
        return this.f25892b.i().l();
    }

    public final Map<String, Object> l() {
        return this.f25899i;
    }

    public final C3605n2 m() {
        return this.f25906p;
    }

    public final B n() {
        return this.f25892b;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdClicked() {
        a(new Runnable() { // from class: com.ironsource.ch
            @Override // java.lang.Runnable
            public final void run() {
                A.b(this.f28364b);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadFailed(final AdapterErrorType adapterErrorType, final int i10, final String str) {
        ck.p.j(adapterErrorType, "adapterErrorType");
        ck.p.j(str, "errorMessage");
        a(new Runnable() { // from class: com.ironsource.gh
            @Override // java.lang.Runnable
            public final void run() {
                A.a(this.f29021b, adapterErrorType, i10, str);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess(final Map<String, Object> map) {
        ck.p.j(map, "extraData");
        a(new Runnable() { // from class: com.ironsource.ah
            @Override // java.lang.Runnable
            public final void run() {
                A.a(this.f28200b, map);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened(final Map<String, Object> map) {
        ck.p.j(map, "extraData");
        a(new Runnable() { // from class: com.ironsource.eh
            @Override // java.lang.Runnable
            public final void run() {
                A.b(this.f28798b, map);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdShowFailed(final int i10, final String str) {
        ck.p.j(str, "errorMessage");
        a(new Runnable() { // from class: com.ironsource.bh
            @Override // java.lang.Runnable
            public final void run() {
                A.a(this.f28271b, i10, str);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitFailed(final int i10, final String str) {
        a(new Runnable() { // from class: com.ironsource.dh
            @Override // java.lang.Runnable
            public final void run() {
                A.b(this.f28696b, i10, str);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitSuccess() {
        a(new Runnable() { // from class: com.ironsource.fh
            @Override // java.lang.Runnable
            public final void run() {
                A.c(this.f28944b);
            }
        });
    }

    public final String p() {
        return this.f25908r;
    }

    public final String q() {
        return this.f25910t;
    }

    public final int r() {
        return this.f25909s;
    }

    public final I s() {
        return this.f25913w;
    }

    public final int t() {
        return this.f25912v;
    }

    public final boolean u() {
        return this.f25907q;
    }

    public final boolean v() {
        return this.f25903m;
    }

    public final boolean w() {
        return this.f25901k;
    }

    public final boolean x() {
        return this.f25900j;
    }

    public final boolean y() {
        return this.f25902l;
    }

    public boolean z() {
        return this.f25901k;
    }

    private final void G() {
        H();
        a aVarA = a();
        this.f25898h = aVarA;
        if (aVarA != null) {
            this.f25891a.a((AbstractRunnableC3526ie) aVarA, TimeUnit.SECONDS.toMillis(o()));
        }
    }

    private final void b(int i10, String str) {
        IronLog.INTERNAL.verbose(a("error = " + i10 + ", " + str));
        H();
        this.f25903m = true;
        a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, i10, str, C3570l5.a(this.f25897g));
        a(new IronSourceError(i10, str));
    }

    public final void a(C3656q0.a aVar) {
        ck.p.j(aVar, "performance");
        this.f25892b.a(aVar);
    }

    public final void a(Runnable runnable) {
        ck.p.j(runnable, "callback");
        this.f25891a.a(runnable);
    }

    public final void a(boolean z10) {
        this.f25891a.e().a().a(z10);
    }

    private final BaseAdAdapter<?, ?> a(B b10) {
        if (b10.i().e().q()) {
            return this.f25893c.b();
        }
        return this.f25891a.a(b10);
    }

    public final void a(F f10) {
        ck.p.j(f10, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a(this, (String) null, 1, (Object) null));
        this.f25895e = f10;
        this.f25900j = true;
        try {
            this.f25891a.e().e().a(false);
            this.f25897g = new C3570l5();
            G();
            BaseAdAdapter<?, ?> baseAdAdapter = this.f25896f;
            ck.p.g(baseAdAdapter);
            AdapterBaseInterface networkAdapter = baseAdAdapter.getNetworkAdapter();
            if (networkAdapter != null) {
                networkAdapter.init(this.f25892b.g(), ContextProvider.getInstance().getApplicationContext(), this);
            } else {
                String str = "loadAd - network adapter not available " + this.f25910t;
                ironLog.error(a(str));
                b(A0.c(this.f25892b.h()), str);
            }
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            String str2 = "loadAd - exception = " + th2.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str2));
            this.f25891a.e().h().g(str2);
            b(A0.c(this.f25892b.h()), str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(A a10, Map map) {
        ck.p.j(a10, "this$0");
        ck.p.j(map, "$extraData");
        a10.f25899i.putAll(map);
        a10.E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(A a10) {
        ck.p.j(a10, "this$0");
        a10.C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(A a10, int i10, String str) {
        ck.p.j(a10, "this$0");
        a10.b(i10, str);
    }

    public static /* synthetic */ String a(A a10, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLogMessage");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        return a10.a(str);
    }

    public final String a(String str) {
        return this.f25891a.a(str, this.f25910t);
    }

    private final a a() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(IronSourceError ironSourceError) {
        a(C3656q0.a.FailedToLoad);
        F f10 = this.f25895e;
        if (f10 == null) {
            ck.p.B("loadListener");
            f10 = null;
        }
        f10.a(ironSourceError, this);
    }

    private final void a(AdapterErrorType adapterErrorType, int i10, String str) {
        long jA = C3570l5.a(this.f25897g);
        IronLog.INTERNAL.verbose(a("Load duration = " + jA + ", error = " + i10 + ", " + str));
        H();
        if (this.f25903m) {
            c();
            a(adapterErrorType, i10, str, jA);
        } else {
            if (this.f25901k) {
                a(adapterErrorType);
                return;
            }
            this.f25903m = true;
            c();
            a(adapterErrorType, i10, str, jA);
            a(new IronSourceError(i10, str));
        }
    }

    public final void a(int i10, String str) {
        ck.p.j(str, "errorMessage");
        IronLog.INTERNAL.verbose(a("Show error = " + i10 + ", " + str));
        this.f25903m = true;
        this.f25891a.e().a().a(k(), i10, str, null);
        a(C3656q0.a.FailedToShow);
        E e10 = this.f25894d.get();
        if (e10 != null) {
            e10.a(this, new IronSourceError(i10, str));
        }
        c();
    }

    private final void a(AdapterErrorType adapterErrorType) {
        if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED) {
            this.f25891a.e().h().a("");
        } else {
            this.f25891a.e().h().f("instance load failed after it was already loaded");
        }
    }

    private final void a(AdapterErrorType adapterErrorType, int i10, String str, long j10) {
        if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
            this.f25891a.e().e().a(j10, i10);
        } else if (str != null && str.length() != 0) {
            this.f25891a.e().e().a(j10, i10, str, false);
        } else {
            this.f25891a.e().e().a(j10, i10, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(A a10, Map map) {
        ck.p.j(a10, "this$0");
        ck.p.j(map, "$extraData");
        a10.f25899i.putAll(map);
        a10.D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(A a10, AdapterErrorType adapterErrorType, int i10, String str) {
        ck.p.j(a10, "this$0");
        ck.p.j(adapterErrorType, "$adapterErrorType");
        ck.p.j(str, "$errorMessage");
        a10.a(adapterErrorType, i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(A a10, int i10, String str) {
        ck.p.j(a10, "this$0");
        ck.p.j(str, "$errorMessage");
        a10.a(i10, str);
    }
}
