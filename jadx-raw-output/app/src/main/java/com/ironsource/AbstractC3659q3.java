package com.ironsource;

import android.text.TextUtils;
import com.ironsource.R0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.q3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3659q3<Listener extends R0> implements NetworkInitializationListener, C3704sf.a, D0, AdapterAdListener, O8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3583m0 f30501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Listener f30502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseAdAdapter<?, AdapterAdListener> f30503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public E0 f30504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f30505e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C3489gd f30507g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C3405c1 f30508h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public JSONObject f30509i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f30510j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AdData f30511k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Long f30512l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C3570l5 f30513m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final C3605n2 f30515o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final InterfaceC3652pd f30516p;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AtomicBoolean f30506f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C3704sf f30514n = new C3704sf(TimeUnit.SECONDS.toMillis(s()));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f30517q = new Object();

    /* JADX INFO: renamed from: com.ironsource.q3$a */
    public class a extends AbstractRunnableC3526ie {
        public a() {
        }

        @Override // com.ironsource.AbstractRunnableC3526ie
        public void a() {
            AbstractC3659q3.this.L();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.q3$b */
    public class b extends AbstractRunnableC3526ie {
        public b() {
        }

        @Override // com.ironsource.AbstractRunnableC3526ie
        public void a() {
            AbstractC3659q3.this.K();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.q3$c */
    public class c extends AbstractRunnableC3526ie {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f30520b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f30521c;

        public c(int i10, String str) {
            this.f30520b = i10;
            this.f30521c = str;
        }

        @Override // com.ironsource.AbstractRunnableC3526ie
        public void a() {
            AbstractC3659q3.this.a(this.f30520b, this.f30521c);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.q3$d */
    public class d extends AbstractRunnableC3526ie {
        public d() {
        }

        @Override // com.ironsource.AbstractRunnableC3526ie
        public void a() {
            AbstractC3659q3.this.I();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.q3$e */
    public class e extends AbstractRunnableC3526ie {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdapterErrorType f30524b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f30525c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f30526d;

        public e(AdapterErrorType adapterErrorType, int i10, String str) {
            this.f30524b = adapterErrorType;
            this.f30525c = i10;
            this.f30526d = str;
        }

        @Override // com.ironsource.AbstractRunnableC3526ie
        public void a() {
            AbstractC3659q3.this.a(this.f30524b, this.f30525c, this.f30526d);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.q3$f */
    public class f extends AbstractRunnableC3526ie {
        public f() {
        }

        @Override // com.ironsource.AbstractRunnableC3526ie
        public void a() {
            AbstractC3659q3.this.J();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.q3$g */
    public class g extends AbstractRunnableC3526ie {
        public g() {
        }

        @Override // com.ironsource.AbstractRunnableC3526ie
        public void a() {
            AbstractC3659q3.this.H();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.q3$h */
    public enum h {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        SHOWING,
        FAILED
    }

    private int o() {
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0056 A[Catch: all -> 0x0066, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0006, B:12:0x0052, B:14:0x0056, B:15:0x005b, B:17:0x005f, B:18:0x0064, B:9:0x000a, B:11:0x004b), top: B:23:0x0001, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x005f A[Catch: all -> 0x0066, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0006, B:12:0x0052, B:14:0x0056, B:15:0x005b, B:17:0x005f, B:18:0x0064, B:9:0x000a, B:11:0x004b), top: B:23:0x0001, inners: #1 }] */
    public void M() {
        E0 e10;
        C3704sf c3704sf;
        synchronized (this) {
            if (this.f30503c != null) {
                try {
                    this.f30503c = null;
                } catch (Exception e11) {
                    C3676r4.d().a(e11);
                    String str = "Exception while calling adapter.releaseMemory() from " + this.f30508h.f() + " - " + e11.getMessage() + " - state = " + this.f30505e;
                    IronLog.INTERNAL.error(a(str));
                    if (this.f30504d != null) {
                        this.f30504d.f26413j.g(str);
                    }
                }
                e10 = this.f30504d;
                if (e10 != null) {
                    e10.f();
                    this.f30504d = null;
                }
                c3704sf = this.f30514n;
                if (c3704sf != null) {
                    c3704sf.d();
                    this.f30514n = null;
                }
            } else {
                e10 = this.f30504d;
                if (e10 != null) {
                    e10.f();
                    this.f30504d = null;
                }
                c3704sf = this.f30514n;
                if (c3704sf != null) {
                    c3704sf.d();
                    this.f30514n = null;
                }
            }
            throw th;
        }
    }

    public boolean O() {
        return true;
    }

    public Map<String, Object> a(B0 b10) {
        HashMap map = new HashMap();
        try {
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.f30503c;
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, baseAdAdapter != null ? baseAdAdapter.getNetworkAdapter().getAdapterVersion() : "");
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter2 = this.f30503c;
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, baseAdAdapter2 != null ? baseAdAdapter2.getNetworkAdapter().getNetworkSDKVersion() : "");
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(a("could not get adapter version for event data" + k()));
        }
        map.put("spId", this.f30508h.i());
        map.put(IronSourceConstants.EVENTS_PROVIDER, this.f30508h.a());
        map.put("instanceType", Integer.valueOf(l()));
        map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(o()));
        if (!TextUtils.isEmpty(this.f30510j)) {
            map.put("dynamicDemandSource", this.f30510j);
        }
        map.put("sessionDepth", r());
        if (this.f30501a.e() != null && this.f30501a.e().length() > 0) {
            map.put("genericParams", this.f30501a.e());
        }
        if (!TextUtils.isEmpty(this.f30501a.c())) {
            map.put("auctionId", this.f30501a.c());
        }
        if (b(b10)) {
            map.put("auctionTrials", Integer.valueOf(this.f30501a.d()));
            if (!TextUtils.isEmpty(this.f30501a.b())) {
                map.put(IronSourceConstants.AUCTION_FALLBACK, this.f30501a.b());
            }
        }
        if (!TextUtils.isEmpty(this.f30501a.g().getCustomNetwork())) {
            map.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, this.f30501a.g().getCustomNetwork());
        }
        return map;
    }

    public void b(String str) {
        this.f30510j = com.ironsource.mediationsdk.d.b().c(str);
    }

    @Override // com.ironsource.O8.b
    public String c() {
        return this.f30508h.f();
    }

    public String d() {
        return a((String) null);
    }

    public Long e() {
        return this.f30512l;
    }

    public AdInfo f() {
        return new AdInfo(this.f30515o.a(j()), this.f30515o.d());
    }

    public IronSource.a g() {
        return this.f30501a.a();
    }

    public boolean v() {
        return false;
    }

    private boolean D() {
        return this.f30505e == h.INIT_IN_PROGRESS;
    }

    private void F() {
        IronLog.INTERNAL.verbose(d());
        a(h.LOADING);
        a(false);
        try {
            this.f30514n.a((C3704sf.a) this);
            G();
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            String str = "unexpected error while calling adapter.loadAd() - " + th2.getMessage() + " - state = " + this.f30505e;
            IronLog.INTERNAL.error(a(str));
            E0 e10 = this.f30504d;
            if (e10 != null) {
                e10.f26413j.g(str);
            }
            onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        IronLog.INTERNAL.verbose(d());
        E0 e10 = this.f30504d;
        if (e10 != null) {
            e10.f26412i.a(j());
        }
        this.f30502b.e(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        boolean zO;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        C3704sf c3704sf = this.f30514n;
        if (c3704sf != null) {
            c3704sf.e();
        }
        synchronized (this.f30517q) {
            h hVar = this.f30505e;
            zO = false;
            if (hVar == h.LOADING) {
                long jA = C3570l5.a(this.f30513m);
                ironLog.verbose(a("Load duration = " + jA));
                if (this.f30504d != null) {
                    if (v()) {
                        this.f30504d.f26409f.a(jA);
                    } else {
                        this.f30504d.f26409f.a(jA, false);
                    }
                }
                a(h.LOADED);
                zO = O();
            } else if (hVar != h.FAILED) {
                ironLog.error(a(String.format("unexpected load success for %s, state - %s", k(), this.f30505e)));
                String str = String.format("unexpected load success, state - %s", this.f30505e);
                if (this.f30504d != null) {
                    if (v()) {
                        this.f30504d.f26413j.s(str);
                    } else {
                        this.f30504d.f26413j.p(str);
                    }
                }
            }
        }
        if (zO) {
            this.f30502b.d(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        IronLog.INTERNAL.verbose(d());
        a(h.SHOWING);
        E0 e10 = this.f30504d;
        if (e10 != null) {
            e10.f26412i.g(j());
        }
        this.f30502b.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        if (D()) {
            C3704sf c3704sf = this.f30514n;
            if (c3704sf != null) {
                c3704sf.e();
            }
            a(h.READY_TO_LOAD);
            F();
            return;
        }
        if (this.f30505e == h.FAILED) {
            return;
        }
        ironLog.error(a(String.format("unexpected init success for %s, state - %s", k(), this.f30505e)));
        if (this.f30504d != null) {
            this.f30504d.f26413j.n(String.format("unexpected init success, state - %s", this.f30505e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        long jA = C3570l5.a(this.f30513m);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("Load duration = " + jA + ", state = " + this.f30505e + ", isBidder = " + w()));
        synchronized (this.f30517q) {
            if (!z()) {
                ironLog.error(a(String.format("unexpected timeout for %s, state - %s, error - %s", k(), this.f30505e, 1025)));
                if (this.f30504d != null) {
                    this.f30504d.f26413j.u(String.format("unexpected timeout, state - %s, error - %s", this.f30505e, 1025));
                }
            } else {
                a(h.FAILED);
                E0 e10 = this.f30504d;
                if (e10 != null) {
                    e10.f26409f.a(jA, 1025, false);
                    this.f30504d.f26409f.a(jA, 1025, "time out", false);
                }
                this.f30502b.a(ErrorBuilder.buildLoadFailedError("time out"), this);
            }
        }
    }

    private int s() {
        C3605n2 c3605n2 = this.f30515o;
        if (c3605n2 == null) {
            return this.f30501a.f();
        }
        Integer numF = c3605n2.f();
        int iF = (numF == null || numF.intValue() <= 0) ? this.f30501a.f() : numF.intValue();
        IronLog.INTERNAL.verbose(a("Load timeout for " + this.f30515o.c() + " - " + iF + " seconds"));
        return iF;
    }

    public AtomicBoolean A() {
        return this.f30506f;
    }

    public boolean C() {
        return this.f30505e == h.SHOWING;
    }

    public void E() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        C3605n2 c3605n2I = i();
        String strK = c3605n2I.k();
        Map<String, Object> mapA = C3575la.a(c3605n2I.a());
        mapA.put("adUnit", this.f30501a.a());
        b(strK);
        try {
            boolean z10 = false;
            if (v()) {
                this.f30504d.f26409f.a();
            } else {
                this.f30504d.f26409f.a(false);
            }
            this.f30512l = null;
            this.f30513m = new C3570l5();
            this.f30511k = a(strK, mapA);
            synchronized (this.f30517q) {
                if (this.f30505e != h.NONE) {
                    z10 = true;
                } else {
                    a(h.INIT_IN_PROGRESS);
                }
            }
            if (z10) {
                String str = "loadAd - incorrect state while loading, state = " + this.f30505e;
                ironLog.error(a(str));
                this.f30504d.f26413j.g(str);
                onInitFailed(A0.c(this.f30501a.a()), str);
                return;
            }
            this.f30514n.a((C3704sf.a) this);
            AdapterBaseInterface networkAdapter = this.f30503c.getNetworkAdapter();
            if (networkAdapter != null) {
                networkAdapter.init(this.f30511k, ContextProvider.getInstance().getApplicationContext(), this);
                return;
            }
            String str2 = "loadAd - network adapter not available " + k();
            ironLog.error(a(str2));
            onInitFailed(A0.c(this.f30501a.a()), str2);
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            String str3 = "loadAd - exception = " + th2.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str3));
            E0 e10 = this.f30504d;
            if (e10 != null) {
                e10.f26413j.g(str3);
            }
            onInitFailed(A0.c(this.f30501a.a()), str3);
        }
    }

    public void G() {
        Object obj = this.f30503c;
        if (obj instanceof AdapterAdFullScreenInterface) {
            ((AdapterAdFullScreenInterface) obj).loadAd(this.f30511k, ContextProvider.getInstance().getCurrentActiveActivity(), this);
        } else {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
        }
    }

    public void N() {
        IronLog.INTERNAL.verbose(d());
        E0 e10 = this.f30504d;
        if (e10 != null) {
            e10.f26412i.a();
        }
    }

    @Override // com.ironsource.O8.b
    public int b() {
        return this.f30508h.e();
    }

    public String h() {
        return this.f30501a.c();
    }

    public C3605n2 i() {
        return this.f30515o;
    }

    public String j() {
        C3489gd c3489gd = this.f30507g;
        return c3489gd == null ? "" : c3489gd.c();
    }

    public int l() {
        return this.f30508h.d();
    }

    public String m() {
        return this.f30508h.h().isMultipleInstances() ? this.f30508h.h().getProviderTypeForReflection() : this.f30508h.f();
    }

    public String n() {
        return this.f30508h.g();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdClicked() {
        if (this.f30516p.e()) {
            this.f30516p.a(new g());
        } else {
            H();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadFailed(AdapterErrorType adapterErrorType, int i10, String str) {
        if (this.f30516p.e()) {
            this.f30516p.a(new e(adapterErrorType, i10, str));
        } else {
            a(adapterErrorType, i10, str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess() {
        if (this.f30516p.e()) {
            this.f30516p.a(new d());
        } else {
            I();
        }
    }

    public void onAdOpened() {
        if (this.f30516p.e()) {
            this.f30516p.a(new f());
        } else {
            J();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitFailed(int i10, String str) {
        if (this.f30516p.e()) {
            this.f30516p.a(new c(i10, str));
        } else {
            a(i10, str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitSuccess() {
        if (this.f30516p.e()) {
            this.f30516p.a(new b());
        } else {
            K();
        }
    }

    public NetworkSettings p() {
        return this.f30501a.g();
    }

    public Map<String, Object> q() {
        HashMap map = new HashMap();
        map.putAll(C3575la.a(this.f30509i));
        return map;
    }

    public Integer r() {
        C3583m0 c3583m0 = this.f30501a;
        if (c3583m0 != null) {
            return Integer.valueOf(c3583m0.h());
        }
        return null;
    }

    public h t() {
        return this.f30505e;
    }

    public InterfaceC3652pd u() {
        return this.f30516p;
    }

    public boolean w() {
        return this.f30508h.j();
    }

    public boolean x() {
        return this.f30505e == h.FAILED;
    }

    public boolean y() {
        return this.f30505e == h.LOADED;
    }

    public boolean z() {
        h hVar = this.f30505e;
        return hVar == h.INIT_IN_PROGRESS || hVar == h.LOADING;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC3659q3(InterfaceC3652pd interfaceC3652pd, C3583m0 c3583m0, BaseAdAdapter<?, ?> baseAdAdapter, C3405c1 c3405c1, C3605n2 c3605n2, Listener listener) {
        this.f30501a = c3583m0;
        this.f30502b = listener;
        this.f30504d = new E0(c3583m0.a(), E0.b.PROVIDER, this);
        this.f30508h = c3405c1;
        this.f30509i = c3405c1.c();
        this.f30503c = baseAdAdapter;
        this.f30515o = c3605n2;
        this.f30516p = interfaceC3652pd;
        a(h.NONE);
    }

    private boolean b(B0 b10) {
        return new ArrayList(Arrays.asList(B0.LOAD_AD, B0.LOAD_AD_SUCCESS, B0.LOAD_AD_FAILED, B0.LOAD_AD_FAILED_WITH_REASON, B0.LOAD_AD_NO_FILL, B0.RELOAD_AD, B0.RELOAD_AD_SUCCESS, B0.RELOAD_AD_FAILED_WITH_REASON, B0.RELOAD_AD_NO_FILL, B0.DESTROY_AD, B0.AD_PRESENT_SCREEN, B0.AD_DISMISS_SCREEN, B0.AD_LEFT_APPLICATION, B0.AD_OPENED, B0.AD_CLOSED, B0.SHOW_AD, B0.SHOW_AD_FAILED, B0.AD_CLICKED, B0.AD_REWARDED)).contains(b10);
    }

    public boolean B() {
        return y();
    }

    public String k() {
        return String.format("%s %s", c(), Integer.valueOf(hashCode()));
    }

    public void a(h hVar) {
        IronLog.INTERNAL.verbose(d());
        this.f30505e = hVar;
    }

    public void a(boolean z10) {
        this.f30506f.set(z10);
    }

    public Map<String, Object> a(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("userId", this.f30501a.i());
        return map;
    }

    public AdData a(String str, Map<String, Object> map) {
        return new AdData(str, q(), a(map));
    }

    public String a(String str) {
        String str2 = this.f30501a.a().name() + " - " + k() + " - state = " + this.f30505e;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return str2 + " - " + str;
    }

    @Override // com.ironsource.C3704sf.a
    public void a() {
        if (!this.f30516p.e()) {
            L();
        } else {
            this.f30516p.a(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("error = " + i10 + ", " + str));
        if (D()) {
            C3704sf c3704sf = this.f30514n;
            if (c3704sf != null) {
                c3704sf.e();
            }
            a(h.FAILED);
            a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, i10, str, C3570l5.a(this.f30513m));
            this.f30502b.a(new IronSourceError(i10, str), this);
            return;
        }
        if (this.f30505e == h.FAILED) {
            return;
        }
        ironLog.error(a(String.format("unexpected init failed for %s, state - %s, error - %s, %s", k(), this.f30505e, Integer.valueOf(i10), str)));
        if (this.f30504d != null) {
            this.f30504d.f26413j.m(String.format("unexpected init failed, state - %s, error - %s, %s", this.f30505e, Integer.valueOf(i10), str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AdapterErrorType adapterErrorType, int i10, String str) {
        long jA = C3570l5.a(this.f30513m);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("Load duration = " + jA + ", error = " + i10 + ", " + str));
        C3704sf c3704sf = this.f30514n;
        if (c3704sf != null) {
            c3704sf.e();
        }
        synchronized (this.f30517q) {
            h hVar = this.f30505e;
            if (hVar == h.LOADING) {
                a(adapterErrorType, i10, str, jA);
                a(h.FAILED);
                this.f30502b.a(new IronSourceError(i10, str), this);
                return;
            }
            if (hVar == h.FAILED) {
                a(adapterErrorType, i10, str, jA);
                return;
            }
            if (hVar == h.LOADED && adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED) {
                this.f30512l = Long.valueOf(System.currentTimeMillis());
                ironLog.error(a(String.format("ad expired for %s, state = %s", this.f30508h.f(), this.f30505e)));
                E0 e10 = this.f30504d;
                if (e10 != null) {
                    e10.f26413j.a(String.format("ad expired, state = %s", this.f30505e));
                }
                return;
            }
            ironLog.error(a(String.format("unexpected load failed for %s, state - %s, error - %s, %s", k(), this.f30505e, Integer.valueOf(i10), str)));
            String str2 = String.format("unexpected load failed, state - %s, error - %s, %s", this.f30505e, Integer.valueOf(i10), str);
            if (this.f30504d != null) {
                if (v()) {
                    this.f30504d.f26413j.r(str2);
                } else if (this.f30501a.a() != IronSource.a.REWARDED_VIDEO || this.f30505e != h.SHOWING) {
                    this.f30504d.f26413j.o(str2);
                }
            }
        }
    }

    private void a(AdapterErrorType adapterErrorType, int i10, String str, long j10) {
        if (this.f30504d != null) {
            if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
                if (v()) {
                    this.f30504d.f26409f.b(j10, i10);
                    return;
                } else {
                    this.f30504d.f26409f.a(j10, i10);
                    return;
                }
            }
            if (!TextUtils.isEmpty(str)) {
                if (v()) {
                    this.f30504d.f26409f.a(j10, i10, str);
                    return;
                } else {
                    this.f30504d.f26409f.a(j10, i10, str, false);
                    return;
                }
            }
            this.f30504d.f26409f.a(j10, i10, false);
        }
    }
}
