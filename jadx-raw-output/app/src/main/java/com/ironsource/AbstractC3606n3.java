package com.ironsource;

import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.ironsource.AbstractC3659q3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.n3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3606n3<Smash extends AbstractC3659q3<?>, Listener extends AdapterAdListener> implements R0, S1, D0, Gb, Cc, InterfaceC3620o, Ag, InterfaceC3794y3, InterfaceC3652pd {
    private AdInfo A;
    private C3649pa B;
    public final P8 C;
    public final P8.a D;
    public final P7 E;
    private final P7.a F;
    private boolean G;
    private Hf H;
    private AtomicBoolean I;
    private V9 J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zg<Smash> f30235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ConcurrentHashMap<String, com.ironsource.mediationsdk.h.a> f30236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.ironsource.mediationsdk.e f30237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.ironsource.mediationsdk.h f30238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f30239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f30240f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public JSONObject f30241g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C3605n2 f30242h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C3489gd f30243i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f30244j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private NetworkStateReceiver f30245k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Te f30246l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C3570l5 f30247m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C3570l5 f30248n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public V f30249o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public f f30250p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Q0 f30251q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public R5 f30252r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public E0 f30253s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public L0 f30254t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public r f30255u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C3450ea f30256v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public UUID f30257w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f30258x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f30259y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Boolean f30260z;

    /* JADX INFO: renamed from: com.ironsource.n3$a */
    public class a extends AbstractRunnableC3526ie {
        public a() {
        }

        @Override // com.ironsource.AbstractRunnableC3526ie
        public void a() {
            AbstractC3606n3.this.B();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.n3$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ NetworkSettings f30262a;

        public b(NetworkSettings networkSettings) {
            this.f30262a = networkSettings;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC3606n3.this.c(this.f30262a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.n3$c */
    public class c extends TimerTask {
        public c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            AbstractC3606n3.this.D();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.n3$d */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC3606n3.this.f30241g = IronSourceVideoBridge.jsonObjectInit();
            AbstractC3606n3.this.f30253s.f26411h.a((Double) null);
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            AbstractC3606n3.this.b(map, arrayList, sb2, arrayList2);
            AbstractC3606n3.this.a(map, arrayList, sb2, arrayList2);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.n3$e */
    public class e implements A3.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f30266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f30267b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f30268c;

        public e(Map map, StringBuilder sb2, List list) {
            this.f30266a = map;
            this.f30267b = sb2;
            this.f30268c = list;
        }

        @Override // com.ironsource.A3.b
        public void a(List<B3> list, long j10, List<String> list2) {
            AbstractC3606n3.this.f30253s.f26410g.a(j10);
            for (B3 b10 : list) {
                NetworkSettings networkSettingsA = AbstractC3606n3.this.f30249o.a(b10.c());
                Map<String, Object> mapB = AbstractC3606n3.this.b(networkSettingsA, com.ironsource.mediationsdk.c.b().b(networkSettingsA, AbstractC3606n3.this.f30249o.b(), AbstractC3606n3.this.k()));
                if (b10.a() != null) {
                    this.f30266a.put(b10.c(), b10.a());
                    StringBuilder sb2 = this.f30267b;
                    sb2.append(b10.d());
                    sb2.append(b10.c());
                    sb2.append(StringUtils.COMMA);
                    AbstractC3606n3.this.f30253s.f26410g.a(mapB, b10.e());
                } else {
                    AbstractC3606n3.this.f30253s.f26410g.a(mapB, b10.e(), b10.b());
                }
            }
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                NetworkSettings networkSettingsA2 = AbstractC3606n3.this.f30249o.a(it.next());
                AbstractC3606n3.this.f30253s.f26410g.b(AbstractC3606n3.this.b(networkSettingsA2, com.ironsource.mediationsdk.c.b().b(networkSettingsA2, AbstractC3606n3.this.f30249o.b(), AbstractC3606n3.this.k())), j10);
            }
            AbstractC3606n3.this.a((Map<String, Object>) this.f30266a, (List<String>) this.f30268c, this.f30267b.toString());
        }

        @Override // com.ironsource.A3.b
        public void onFailure(String str) {
            AbstractC3606n3.this.f30253s.f26410g.a(str);
            AbstractC3606n3.this.a((Map<String, Object>) this.f30266a, (List<String>) this.f30268c, this.f30267b.toString());
        }
    }

    /* JADX INFO: renamed from: com.ironsource.n3$f */
    public enum f {
        NONE,
        READY_TO_LOAD,
        AUCTION,
        LOADING,
        READY_TO_SHOW,
        SHOWING
    }

    public AbstractC3606n3(V v10, C3649pa c3649pa, C3450ea c3450ea) {
        this(Lb.U(), Lb.O(), v10, c3649pa, c3450ea);
    }

    private boolean c(boolean z10) {
        Boolean bool = this.f30260z;
        if (bool == null) {
            return false;
        }
        return (z10 && !bool.booleanValue() && u()) || (!z10 && this.f30260z.booleanValue());
    }

    private boolean d(NetworkSettings networkSettings) {
        AdapterBaseInterface adapterBaseInterfaceB = com.ironsource.mediationsdk.c.b().b(networkSettings, this.f30249o.b(), k());
        if (adapterBaseInterfaceB instanceof AdapterSettingsInterface) {
            return this.f30235a.a(this.f30249o.h().a(), networkSettings.getProviderInstanceName(), networkSettings.getProviderTypeForReflection(), a(networkSettings, adapterBaseInterfaceB), adapterBaseInterfaceB, this.f30249o.b());
        }
        return false;
    }

    private int p() {
        return 1;
    }

    public boolean H() {
        return true;
    }

    public boolean I() {
        return true;
    }

    public abstract Smash a(NetworkSettings networkSettings, BaseAdAdapter<?, Listener> baseAdAdapter, int i10, String str, C3605n2 c3605n2);

    public void a(Context context, boolean z10) {
        IronLog.INTERNAL.verbose(b("track = " + z10));
        try {
            this.f30244j = z10;
            if (z10) {
                if (this.f30245k == null) {
                    this.f30245k = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.f30245k, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.f30245k != null) {
                context.getApplicationContext().unregisterReceiver(this.f30245k);
            }
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error("Got an error from receiver with message: " + e10.getMessage());
        }
    }

    public abstract JSONObject b(NetworkSettings networkSettings);

    public void b(boolean z10) {
        a(false, z10, (AbstractC3659q3<?>) null);
    }

    @Override // com.ironsource.R0
    public void e(AbstractC3659q3<?> abstractC3659q3) {
        IronLog.INTERNAL.verbose(b(abstractC3659q3.k()));
        this.f30253s.f26412i.a(n());
        this.f30254t.a(this.f30243i, abstractC3659q3.f());
    }

    public abstract L0 g();

    public void g(AbstractC3659q3<?> abstractC3659q3) {
        this.f30254t.d(abstractC3659q3.f());
    }

    public Q0 h() {
        return new Q0(this.f30249o.h(), this);
    }

    public String i() {
        return b((String) null);
    }

    public abstract String l();

    public abstract String o();

    public boolean q() {
        return false;
    }

    public boolean t() {
        return false;
    }

    public boolean u() {
        return false;
    }

    public abstract boolean v();

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        f fVar;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(i());
        synchronized (this.f30258x) {
            if (this.f30249o.h().e() && this.f30246l.a()) {
                ironLog.verbose(b("all smashes are capped"));
                a(A0.a(this.f30249o.b()), "all smashes are capped", false);
                return;
            }
            if (!t() && this.f30250p == f.SHOWING) {
                IronLog.API.error(b("load cannot be invoked while showing an ad"));
                a(new IronSourceError(A0.d(this.f30249o.b()), "load cannot be invoked while showing an ad"));
                return;
            }
            if (this.f30249o.h().a() != O0.a.AUTOMATIC_LOAD_WHILE_SHOW && this.f30249o.h().a() != O0.a.MANUAL_WITH_LOAD_ON_SHOW && (((fVar = this.f30250p) != f.READY_TO_LOAD && fVar != f.READY_TO_SHOW) || com.ironsource.mediationsdk.n.a().b(this.f30249o.b()))) {
                IronLog.API.error(b("load is already in progress"));
                return;
            }
            this.f30241g = IronSourceVideoBridge.jsonObjectInit();
            F();
            if (v()) {
                this.f30253s.f26409f.a();
            } else {
                this.f30253s.f26409f.a(q());
            }
            this.f30248n = new C3570l5();
            if (this.f30249o.q()) {
                if (!this.f30236b.isEmpty()) {
                    this.f30238d.a(this.f30236b);
                    this.f30236b.clear();
                }
                K();
            } else {
                a(f.LOADING);
            }
            if (this.f30249o.q()) {
                return;
            }
            ironLog.verbose(b("auction disabled"));
            L();
            C();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        IronLog.INTERNAL.verbose(i());
        AsyncTask.execute(new d());
    }

    private Gg<Smash> E() {
        IronLog.INTERNAL.verbose();
        return new Fg(this.f30249o).d(this.f30235a.b());
    }

    private void F() {
        this.f30255u.a(this.f30249o.b(), false);
    }

    private void K() {
        IronLog.INTERNAL.verbose(i());
        synchronized (this.f30258x) {
            f fVar = this.f30250p;
            f fVar2 = f.AUCTION;
            if (fVar == fVar2) {
                return;
            }
            a(fVar2);
            this.I.set(false);
            long jK = this.f30249o.d().k() - C3570l5.a(this.f30247m);
            if (jK > 0) {
                new Timer().schedule(new c(), jK);
            } else {
                D();
            }
        }
    }

    private void L() {
        IronLog.INTERNAL.verbose(i());
        a(j(), m());
    }

    private List<C3605n2> j() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (NetworkSettings networkSettings : this.f30249o.j()) {
            if (!networkSettings.isBidder(this.f30249o.b()) && d(networkSettings)) {
                Se se2 = new Se(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.f30249o.b()));
                if (!this.f30246l.b(se2)) {
                    copyOnWriteArrayList.add(new C3605n2(se2.c()));
                }
            }
        }
        return copyOnWriteArrayList;
    }

    private void r() {
        IronLog.INTERNAL.verbose(i());
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : this.f30249o.j()) {
            if (c(networkSettings, com.ironsource.mediationsdk.c.b().b(networkSettings, this.f30249o.b(), k()))) {
                arrayList.add(new b(networkSettings));
            }
        }
        IronSourceThreadManager.INSTANCE.executeTasks(this.f30249o.k(), this.f30249o.p(), arrayList);
    }

    private void s() {
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : this.f30249o.j()) {
            arrayList.add(new Se(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.f30249o.b())));
        }
        Te te2 = new Te();
        this.f30246l = te2;
        te2.a(arrayList);
    }

    public void J() {
        Iterator<NetworkSettings> it = this.f30249o.j().iterator();
        while (it.hasNext()) {
            com.ironsource.mediationsdk.c.b().b(it.next(), this.f30249o.b(), k());
        }
    }

    public void b() {
        IronLog.INTERNAL.verbose(i());
        A();
    }

    public void h(AbstractC3659q3<?> abstractC3659q3) {
        if (this.f30249o.h().f()) {
            a(abstractC3659q3, abstractC3659q3.f());
        } else {
            a(true, false, abstractC3659q3);
        }
    }

    public void i(AbstractC3659q3<?> abstractC3659q3) {
        if (this.f30249o.q() && this.I.compareAndSet(false, true)) {
            C3605n2 c3605n2I = abstractC3659q3.i();
            this.f30237c.a(c3605n2I, abstractC3659q3.l(), this.f30242h);
            ArrayList<String> arrayList = new ArrayList<>();
            ConcurrentHashMap<String, C3605n2> concurrentHashMap = new ConcurrentHashMap<>();
            for (Smash smash : this.f30235a.b()) {
                arrayList.add(smash.c());
                concurrentHashMap.put(smash.c(), smash.i());
            }
            this.f30237c.a(arrayList, concurrentHashMap, abstractC3659q3.l(), this.f30242h, c3605n2I);
        }
    }

    public UUID k() {
        return this.f30257w;
    }

    public String m() {
        return "fallback_" + System.currentTimeMillis();
    }

    public String n() {
        C3489gd c3489gd = this.f30243i;
        return c3489gd == null ? "" : c3489gd.c();
    }

    public boolean w() {
        boolean z10;
        synchronized (this.f30258x) {
            f fVar = this.f30250p;
            z10 = fVar == f.LOADING || fVar == f.READY_TO_SHOW;
        }
        return z10;
    }

    public boolean x() {
        boolean z10;
        synchronized (this.f30258x) {
            z10 = this.f30250p == f.READY_TO_SHOW;
        }
        return z10;
    }

    public boolean y() {
        boolean z10;
        synchronized (this.f30258x) {
            z10 = this.f30250p == f.AUCTION;
        }
        return z10;
    }

    public boolean z() {
        boolean z10;
        synchronized (this.f30258x) {
            z10 = this.f30250p == f.LOADING;
        }
        return z10;
    }

    private void C() {
        Gg<Smash> ggE = E();
        if (ggE.c()) {
            a(509, "Mediation No fill", false);
        }
        Iterator<Smash> it = ggE.a().iterator();
        while (it.hasNext()) {
            it.next().E();
        }
    }

    public void A() {
        if (!e()) {
            B();
        } else {
            a(new a());
        }
    }

    public void G() {
        com.ironsource.mediationsdk.n.a().a(this.f30249o.b(), this.f30249o.f());
    }

    public AbstractC3606n3(L7 l10, K7 k10, V v10, C3649pa c3649pa, C3450ea c3450ea) {
        this.f30240f = "";
        this.f30244j = false;
        this.f30258x = new Object();
        this.f30259y = 0L;
        this.I = new AtomicBoolean(false);
        this.f30257w = UUID.randomUUID();
        this.C = l10.s();
        this.D = k10.h();
        this.E = l10.w();
        this.F = k10.x();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("adUnit = " + v10.b() + ", loading mode = " + v10.h().a());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(v10.b());
        sb2.append(" initiated object per waterfall mode");
        IronSourceUtils.i(sb2.toString());
        C3570l5 c3570l5 = new C3570l5();
        this.J = a(v10);
        this.f30256v = c3450ea;
        this.f30249o = v10;
        this.f30253s = new E0(v10.b(), E0.b.MEDIATION, this);
        this.f30254t = g();
        this.f30251q = h();
        a(f.NONE);
        this.B = c3649pa;
        this.f30235a = new zg<>(this.f30249o.d().f(), this.f30249o.d().i(), this);
        this.f30253s.f26408e.a(o(), this.f30249o.h().a().toString());
        this.f30236b = new ConcurrentHashMap<>();
        this.f30243i = null;
        G();
        this.f30241g = IronSourceVideoBridge.jsonObjectInit();
        if (this.f30249o.q()) {
            this.f30237c = new com.ironsource.mediationsdk.e(new com.ironsource.mediationsdk.f(this.f30249o.d(), IronSourceUtils.d()));
        }
        this.f30238d = new com.ironsource.mediationsdk.h(this.f30249o.j(), this.f30249o.d().c());
        s();
        r();
        this.f30247m = new C3570l5();
        a(f.READY_TO_LOAD);
        this.f30252r = new R5(v10.a(), this);
        this.f30255u = new r();
        this.f30253s.f26408e.a(C3570l5.a(c3570l5));
        if (this.f30249o.h().e()) {
            ironLog.verbose("first automatic load");
            A();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map<String, Object> map, List<String> list, StringBuilder sb2, List<CallableC3777x3> list2) {
        for (NetworkSettings networkSettings : this.f30249o.j()) {
            Hf hf2 = this.H;
            if (hf2 == null || hf2.a(networkSettings, this.f30249o.b())) {
                if (!this.f30246l.b(new Se(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.f30249o.b()))) && d(networkSettings)) {
                    AdData adDataA = a(networkSettings, (String) null);
                    if (networkSettings.isBidder(this.f30249o.b())) {
                        AdapterBaseInterface adapterBaseInterfaceB = com.ironsource.mediationsdk.c.b().b(networkSettings, this.f30249o.b(), k());
                        if (adapterBaseInterfaceB instanceof InterfaceC3811z3) {
                            list2.add(new CallableC3777x3(networkSettings.getInstanceType(this.f30249o.b()), networkSettings.getProviderInstanceName(), adDataA, (InterfaceC3811z3) adapterBaseInterfaceB, this, networkSettings));
                        } else {
                            this.f30253s.f26413j.g(adapterBaseInterfaceB == null ? "prepareAuctionCandidates - could not load network adapter " + networkSettings.getProviderName() : "network adapter " + networkSettings.getProviderName() + " does not implementing BiddingDataInterface");
                        }
                    } else {
                        list.add(networkSettings.getProviderInstanceName());
                        sb2.append(networkSettings.getInstanceType(this.f30249o.b()));
                        sb2.append(networkSettings.getProviderInstanceName());
                        sb2.append(StringUtils.COMMA);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(NetworkSettings networkSettings) {
        IronLog.INTERNAL.verbose(b(String.format("Start initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName())));
        AdData adDataA = a(networkSettings, this.f30249o.o());
        AdapterBaseInterface adapterBaseInterfaceB = com.ironsource.mediationsdk.c.b().b(networkSettings, this.f30249o.b(), k());
        if (adapterBaseInterfaceB != null) {
            try {
                adapterBaseInterfaceB.init(adDataA, ContextProvider.getInstance().getApplicationContext(), null);
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                this.f30253s.f26413j.g("initProvider - exception while calling networkAdapter.init with " + networkSettings.getProviderName() + " - " + e10);
            }
        }
        IronLog.INTERNAL.verbose(b(String.format("Done initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName())));
    }

    @Override // com.ironsource.InterfaceC3652pd
    public boolean e() {
        V9 v10 = this.J;
        if (v10 == null || v10 == Thread.currentThread()) {
            return false;
        }
        return this.f30249o.l();
    }

    public void a(f fVar) {
        synchronized (this.f30258x) {
            IronLog.INTERNAL.verbose("set current state to = " + fVar);
            this.f30250p = fVar;
        }
    }

    @Override // com.ironsource.R0
    public void d(AbstractC3659q3<?> abstractC3659q3) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b(abstractC3659q3.k()));
        if (!abstractC3659q3.h().equals(this.f30235a.c())) {
            ironLog.error(b("invoked from " + abstractC3659q3.c() + " with state = " + this.f30250p + " auctionId: " + abstractC3659q3.h() + " and the current id is " + this.f30235a.c()));
            C3402bg c3402bg = this.f30253s.f26413j;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onAdLoadSuccess invoked with state = ");
            sb2.append(this.f30250p);
            c3402bg.p(sb2.toString());
            return;
        }
        if (this.f30249o.m()) {
            List<Smash> listB = this.f30235a.b();
            Fg fg2 = new Fg(this.f30249o);
            boolean zA = fg2.a(abstractC3659q3, listB);
            synchronized (this.f30258x) {
                if (zA) {
                    if (w()) {
                        i(abstractC3659q3);
                    }
                }
                if (fg2.a(listB)) {
                    i(fg2.c(listB));
                }
            }
        }
        this.f30236b.put(abstractC3659q3.c(), com.ironsource.mediationsdk.h.a.ISAuctionPerformanceLoadedSuccessfully);
        if (a(f.LOADING, f.READY_TO_SHOW)) {
            long jA = C3570l5.a(this.f30248n);
            if (v()) {
                this.f30253s.f26409f.a(jA);
            } else {
                this.f30253s.f26409f.a(jA, q());
            }
            if (this.f30249o.h().e()) {
                this.f30252r.a(0L);
            }
            if (!this.f30249o.m()) {
                i(abstractC3659q3);
            }
            h(abstractC3659q3);
        }
    }

    public boolean a(f fVar, f fVar2) {
        boolean z10;
        synchronized (this.f30258x) {
            if (this.f30250p == fVar) {
                IronLog.INTERNAL.verbose("expected state = " + fVar + ", state to set = " + fVar2);
                z10 = true;
                this.f30250p = fVar2;
            } else {
                IronLog.INTERNAL.verbose("wrong state, current state = " + this.f30250p + ", expected state = " + fVar);
                z10 = false;
            }
        }
        return z10;
    }

    private V9 a(V v10) {
        if (v10.l()) {
            return IronSourceThreadManager.INSTANCE.getSharedManagersThread();
        }
        return null;
    }

    private boolean c(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        if (this.f30235a.a(adapterBaseInterface, this.f30249o.b(), networkSettings.getProviderInstanceName())) {
            return false;
        }
        return networkSettings.shouldEarlyInit() || networkSettings.isIronSource() || networkSettings.isBidder(this.f30249o.b());
    }

    public void a(L0 l10) {
        this.f30254t = l10;
    }

    public BaseAdAdapter<?, Listener> a(NetworkSettings networkSettings, IronSource.a aVar) {
        BaseAdAdapter<?, Listener> baseAdAdapter = (BaseAdAdapter<?, Listener>) com.ironsource.mediationsdk.c.b().a(networkSettings, aVar, k());
        if (baseAdAdapter != null) {
            return baseAdAdapter;
        }
        return null;
    }

    public void a(boolean z10, boolean z11, AbstractC3659q3<?> abstractC3659q3) {
        synchronized (this.f30258x) {
            Boolean bool = this.f30260z;
            if (bool == null || bool.booleanValue() != z10) {
                this.f30260z = Boolean.valueOf(z10);
                long time = 0;
                if (this.f30259y != 0) {
                    time = new Date().getTime() - this.f30259y;
                }
                this.f30259y = new Date().getTime();
                this.f30253s.f26409f.a(z10, time, z11);
                AdInfo adInfoF = abstractC3659q3 != null ? abstractC3659q3.f() : this.A;
                this.A = adInfoF;
                L0 l10 = this.f30254t;
                if (!z10) {
                    adInfoF = null;
                }
                l10.a(z10, adInfoF);
            }
        }
    }

    private boolean c(B0 b10) {
        return new ArrayList(Arrays.asList(B0.LOAD_AD_SUCCESS, B0.LOAD_AD_FAILED, B0.LOAD_AD_FAILED_WITH_REASON, B0.AUCTION_SUCCESS, B0.AUCTION_FAILED, B0.AUCTION_FAILED_NO_CANDIDATES, B0.AD_FORMAT_CAPPED, B0.AD_OPENED, B0.SHOW_AD, B0.SHOW_AD_FAILED, B0.AD_CLICKED, B0.RELOAD_AD_FAILED_WITH_REASON, B0.RELOAD_AD_SUCCESS, B0.AD_LEFT_APPLICATION)).contains(b10);
    }

    private boolean b(B0 b10) {
        return !new ArrayList(Arrays.asList(B0.INIT_STARTED, B0.LOAD_AD, B0.AUCTION_REQUEST, B0.AUCTION_REQUEST_WATERFALL, B0.AUCTION_FAILED_NO_CANDIDATES, B0.COLLECT_TOKEN, B0.COLLECT_TOKENS_COMPLETED, B0.COLLECT_TOKENS_FAILED, B0.INSTANCE_COLLECT_TOKEN, B0.INSTANCE_COLLECT_TOKEN_SUCCESS, B0.INSTANCE_COLLECT_TOKEN_FAILED, B0.INSTANCE_COLLECT_TOKEN_TIMED_OUT)).contains(b10);
    }

    public void b(C3605n2 c3605n2, String str) {
        if (c3605n2 != null) {
            Z8 z8A = c3605n2.a(str);
            if (z8A != null) {
                for (ImpressionDataListener impressionDataListener : new HashSet(this.B.a())) {
                    IronLog.CALLBACK.info(b("onImpressionSuccess " + impressionDataListener.getClass().getSimpleName() + ": " + z8A));
                    impressionDataListener.onImpressionSuccess(z8A);
                }
                return;
            }
            return;
        }
        IronLog.INTERNAL.error(b("reportImpressionDataToPublisher - no auctionResponseItem or listener"));
        E0 e10 = this.f30253s;
        if (e10 != null) {
            e10.f26413j.g("reportImpressionDataToPublisher - no auctionResponseItem or listener");
        }
    }

    @Override // com.ironsource.InterfaceC3620o
    public void a() {
        if (this.f30249o.h().e()) {
            a(f.READY_TO_LOAD);
            b(true);
            A();
        }
    }

    @Override // com.ironsource.Cc
    public void a(boolean z10) {
        if (!this.f30244j || this.f30249o.h().f()) {
            return;
        }
        IronLog.INTERNAL.verbose("network availability changed to - " + z10);
        if (c(z10)) {
            a(z10, false, (AbstractC3659q3<?>) null);
        }
    }

    public LoadWhileShowSupportState a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        return LoadWhileShowSupportState.NONE;
    }

    private String a(List<C3605n2> list, String str) {
        IronLog.INTERNAL.verbose(b("waterfall.size() = " + list.size()));
        this.f30236b.clear();
        StringBuilder sb2 = new StringBuilder();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            C3605n2 c3605n2 = list.get(i10);
            AbstractC3659q3 abstractC3659q3A = a(c3605n2, str);
            if (abstractC3659q3A != null) {
                copyOnWriteArrayList.add(abstractC3659q3A);
                sb2.append(a(c3605n2, abstractC3659q3A.l()));
            }
            if (i10 != list.size() - 1) {
                sb2.append(StringUtils.COMMA);
            }
        }
        this.f30235a.a(this.f30249o.h().a(), (CopyOnWriteArrayList<Smash>) copyOnWriteArrayList, str);
        IronLog.INTERNAL.verbose(b("updateWaterfall() - next waterfall is " + ((Object) sb2)));
        return sb2.toString();
    }

    private void b(JSONObject jSONObject) {
        int i10;
        try {
            if (jSONObject == null) {
                this.f30249o.b(false);
                IronLog.INTERNAL.verbose(b("loading configuration from auction response is null, using the following: " + this.f30249o.r()));
                return;
            }
            try {
                if (jSONObject.has("parallelLoad") && (i10 = jSONObject.getInt("parallelLoad")) > 0) {
                    this.f30249o.a(i10);
                }
                if (jSONObject.has("bidderExclusive")) {
                    this.f30249o.a(jSONObject.getBoolean("bidderExclusive"));
                }
                this.f30249o.b(jSONObject.optBoolean(com.ironsource.mediationsdk.d.f29614z, false));
                IronLog.INTERNAL.verbose(b(this.f30249o.r()));
            } catch (JSONException e10) {
                C3676r4.d().a(e10);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("failed to update loading configuration for" + this.f30249o.b() + " Error: " + e10.getMessage());
                ironLog.verbose(b(this.f30249o.r()));
            }
        } catch (Throwable th2) {
            IronLog.INTERNAL.verbose(b(this.f30249o.r()));
            throw th2;
        }
    }

    @Override // com.ironsource.Ag
    public void a(int i10) {
        this.f30253s.f26413j.v("waterfalls hold too many with size = " + i10);
    }

    private Smash a(C3605n2 c3605n2, String str) {
        NetworkSettings networkSettingsA = this.f30249o.a(c3605n2.c());
        if (networkSettingsA != null) {
            com.ironsource.mediationsdk.c.b().b(networkSettingsA, this.f30249o.b(), k());
            BaseAdAdapter<?, Listener> baseAdAdapterA = a(networkSettingsA, this.f30249o.b());
            if (baseAdAdapterA != null) {
                Smash smash = (Smash) a(networkSettingsA, baseAdAdapterA, this.C.a(this.f30249o.b()), str, c3605n2);
                this.f30236b.put(c3605n2.c(), com.ironsource.mediationsdk.h.a.ISAuctionPerformanceDidntAttemptToLoad);
                return smash;
            }
            IronLog.INTERNAL.error(b("addSmashToWaterfall - could not load ad adapter for " + networkSettingsA.getProviderInstanceName()));
        } else {
            String str2 = "could not find matching provider settings for auction response item - item = " + c3605n2.c() + " state = " + this.f30250p;
            IronLog.INTERNAL.error(b(str2));
            this.f30253s.f26413j.i(str2);
        }
        return null;
    }

    public String b(String str) {
        String str2 = this.f30249o.b().name() + " state:" + this.f30250p;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return str2 + " - " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> b(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        HashMap map = new HashMap();
        try {
            map.put(IronSourceConstants.EVENTS_PROVIDER, networkSettings.getProviderDefaultInstance());
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterBaseInterface.getAdapterVersion());
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, adapterBaseInterface.getNetworkSDKVersion());
            map.put("spId", networkSettings.getSubProviderId());
            map.put("instanceType", Integer.valueOf(networkSettings.getInstanceType(this.f30249o.b())));
            map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(p()));
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getProviderEventData " + networkSettings.getProviderDefaultInstance(), e10);
        }
        return map;
    }

    public void a(int i10, String str, boolean z10) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        a(f.READY_TO_LOAD);
        ironLog.verbose(b("errorCode = " + i10 + ", errorReason = " + str));
        if (this.f30249o.h().f()) {
            if (!z10) {
                this.f30253s.f26409f.a(C3570l5.a(this.f30248n), i10, str, q());
            }
            a(new IronSourceError(i10, str));
        } else {
            if (!z10) {
                this.f30253s.f26413j.b(i10, str);
            }
            b(false);
        }
        this.f30251q.e();
    }

    public void a(AbstractC3659q3<?> abstractC3659q3, AdInfo adInfo) {
        this.f30254t.c(adInfo);
    }

    public void a(IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.n.a().b(this.f30249o.b(), ironSourceError);
    }

    public AdData a(NetworkSettings networkSettings, String str) {
        return AdData.createAdDataForNetworkAdapter(b(networkSettings), this.f30249o.b(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, StringBuilder sb2, List<CallableC3777x3> list2) {
        if (list2.isEmpty()) {
            a(map, list, sb2.toString());
            return;
        }
        A3 a10 = new A3();
        e eVar = new e(map, sb2, list);
        this.f30253s.f26410g.a();
        a10.a(list2, eVar, this.f30249o.e(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b("auction waterfallString = " + str));
        boolean z10 = false;
        if (map.size() == 0 && list.size() == 0) {
            ironLog.verbose(b("auction failed - no candidates"));
            this.f30253s.f26411h.a(1005, "No candidates available for auctioning");
            a(A0.e(this.f30249o.b()), "no available ad to load", false);
            return;
        }
        this.f30253s.f26411h.b(str);
        if (this.f30237c != null) {
            int iA = this.C.a(this.f30249o.b());
            com.ironsource.mediationsdk.i iVar = new com.ironsource.mediationsdk.i(this.f30249o.b());
            iVar.b(IronSourceUtils.g());
            iVar.a(map);
            iVar.a(list);
            iVar.a(this.f30238d);
            iVar.a(iA);
            iVar.a(this.f30256v);
            iVar.d(this.G);
            Hf hf2 = this.H;
            if (hf2 != null && hf2.b()) {
                z10 = true;
            }
            iVar.e(z10);
            a(ContextProvider.getInstance().getApplicationContext(), iVar, this);
            return;
        }
        ironLog.error(b("mAuctionHandler is null"));
    }

    public void a(Context context, com.ironsource.mediationsdk.i iVar, S1 s10) {
        com.ironsource.mediationsdk.e eVar = this.f30237c;
        if (eVar != null) {
            eVar.a(context, iVar, s10);
        } else {
            IronLog.INTERNAL.error(b("mAuctionHandler is null"));
        }
    }

    @Override // com.ironsource.S1
    public void a(List<C3605n2> list, String str, C3605n2 c3605n2, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(i());
        if (y()) {
            this.f30240f = "";
            this.f30239e = i10;
            this.f30242h = c3605n2;
            this.f30241g = jSONObject;
            if (!TextUtils.isEmpty(str2)) {
                this.f30253s.f26413j.a(i11, str2);
            }
            a(jSONObject2);
            if (this.f30255u.a(this.f30249o.b())) {
                this.f30253s.f26411h.a(str);
                a(IronSourceError.ERROR_AD_FORMAT_CAPPED, "Ad unit is capped", true);
                return;
            }
            String strA = a(list, str);
            this.f30253s.f26411h.a(j10, this.f30249o.r() + ";wtf=" + list.size());
            this.f30253s.f26411h.c(strA);
            a(f.LOADING);
            C();
            return;
        }
        ironLog.error(b("unexpected auction success for auctionId - " + str + " state = " + this.f30250p));
        C3402bg c3402bg = this.f30253s.f26413j;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("unexpected auction success, state = ");
        sb2.append(this.f30250p);
        c3402bg.k(sb2.toString());
    }

    @Override // com.ironsource.S1
    public void a(int i10, String str, int i11, String str2, long j10) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(i());
        if (y()) {
            String str3 = "Auction failed (error " + i10 + " - " + str + ")";
            ironLog.verbose(b(str3));
            IronSourceUtils.i(l() + ": " + str3);
            this.f30239e = i11;
            this.f30240f = str2;
            this.f30241g = IronSourceVideoBridge.jsonObjectInit();
            if (this.f30249o.d().n()) {
                ironLog.verbose(b("Moving to fallback waterfall"));
                L();
            }
            this.f30253s.f26411h.a(j10, i10, str);
            a(f.LOADING);
            C();
            return;
        }
        String str4 = "unexpected auction fail - error = " + i10 + ", " + str + " state = " + this.f30250p;
        ironLog.error(b(str4));
        this.f30253s.f26413j.j(str4);
    }

    @Override // com.ironsource.R0
    public void a(IronSourceError ironSourceError, AbstractC3659q3<?> abstractC3659q3) {
        Gg<Smash> ggE;
        AbstractC3659q3<?> abstractC3659q3C;
        synchronized (this.f30258x) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose(b(abstractC3659q3.k() + " - error = " + ironSourceError));
            if (abstractC3659q3.h().equals(this.f30235a.c()) && this.f30250p != f.AUCTION) {
                this.f30236b.put(abstractC3659q3.c(), com.ironsource.mediationsdk.h.a.ISAuctionPerformanceFailedToLoad);
                if (z() || x()) {
                    ggE = E();
                    if (ggE.c()) {
                        a(509, "Mediation No fill", false);
                        return;
                    }
                } else {
                    ggE = null;
                }
                if (ggE == null) {
                    return;
                }
                if (this.f30249o.m()) {
                    synchronized (this.f30258x) {
                        if (ggE.b() && w() && (abstractC3659q3C = new Fg(this.f30249o).c(this.f30235a.b())) != null) {
                            i(abstractC3659q3C);
                        }
                    }
                }
                Iterator<Smash> it = ggE.a().iterator();
                while (it.hasNext()) {
                    it.next().E();
                }
                return;
            }
            ironLog.error(b("onAdLoadFailed was invoked from " + abstractC3659q3.c() + " with state =" + this.f30250p + " auctionId: " + abstractC3659q3.h() + " and the current id is " + this.f30235a.c()));
            C3402bg c3402bg = this.f30253s.f26413j;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onAdLoadFailed was invoked with state =");
            sb2.append(this.f30250p);
            c3402bg.o(sb2.toString());
        }
    }

    @Override // com.ironsource.R0
    public void a(AbstractC3659q3<?> abstractC3659q3) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b(abstractC3659q3.k()));
        this.f30253s.f26412i.g(n());
        this.f30235a.a(abstractC3659q3);
        this.f30235a.b(abstractC3659q3);
        this.f30246l.a(abstractC3659q3);
        if (this.f30246l.b(abstractC3659q3)) {
            ironLog.verbose(b(abstractC3659q3.c() + " was session capped"));
            abstractC3659q3.N();
            IronSourceUtils.i(abstractC3659q3.c() + " was session capped");
        }
        this.F.a(ContextProvider.getInstance().getApplicationContext(), n(), this.f30249o.b());
        if (this.E.c(ContextProvider.getInstance().getApplicationContext(), this.f30243i, this.f30249o.b())) {
            ironLog.verbose(b("placement " + n() + " is capped"));
            this.f30253s.f26412i.b(n(), null);
        }
        this.D.b(this.f30249o.b());
        if (this.f30249o.q()) {
            C3605n2 c3605n2I = abstractC3659q3.i();
            this.f30237c.a(c3605n2I, abstractC3659q3.l(), this.f30242h, n());
            this.f30236b.put(abstractC3659q3.c(), com.ironsource.mediationsdk.h.a.ISAuctionPerformanceShowedSuccessfully);
            if (H()) {
                b(c3605n2I, n());
            }
        }
        g(abstractC3659q3);
        if (this.f30249o.h().e()) {
            b(false);
        }
        this.f30251q.h();
    }

    public Map<String, Object> a(B0 b10) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        JSONObject jSONObject = this.f30241g;
        if (jSONObject != null && jSONObject.length() > 0) {
            map.put("genericParams", this.f30241g);
        }
        map.put("sessionDepth", Integer.valueOf(this.C.a(this.f30249o.b())));
        if (c(b10)) {
            map.put("auctionTrials", Integer.valueOf(this.f30239e));
            if (!TextUtils.isEmpty(this.f30240f)) {
                map.put(IronSourceConstants.AUCTION_FALLBACK, this.f30240f);
            }
        }
        if (b(b10) && !TextUtils.isEmpty(this.f30235a.c())) {
            map.put("auctionId", this.f30235a.c());
        }
        return map;
    }

    public void a(C3450ea c3450ea) {
        this.f30256v = c3450ea;
    }

    private void a(JSONObject jSONObject) {
        this.f30255u.a(this.f30249o.b(), jSONObject != null ? jSONObject.optBoolean(com.ironsource.mediationsdk.d.f29594f, false) : false);
        b(jSONObject);
    }

    public String a(C3605n2 c3605n2, int i10) {
        return String.format("%s%s", Integer.valueOf(i10), c3605n2.c());
    }

    public void a(Hf hf2) {
        this.H = hf2;
        if (hf2 != null) {
            this.G = true;
        } else {
            this.G = false;
        }
        this.f30260z = null;
    }

    @Override // com.ironsource.InterfaceC3794y3
    public void a(NetworkSettings networkSettings) {
        AdapterBaseInterface adapterBaseInterfaceB = com.ironsource.mediationsdk.c.b().b(networkSettings, this.f30249o.b(), k());
        if (adapterBaseInterfaceB != null) {
            this.f30253s.f26410g.a(b(networkSettings, adapterBaseInterfaceB));
        }
    }

    @Override // com.ironsource.InterfaceC3794y3
    public void a(String str) {
        this.f30253s.f26413j.g(str);
    }

    @Override // com.ironsource.InterfaceC3652pd
    public void a(Runnable runnable) {
        V9 v10 = this.J;
        if (v10 != null) {
            v10.a(runnable);
        }
    }
}
