package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.A3;
import com.ironsource.B3;
import com.ironsource.C3400be;
import com.ironsource.C3436de;
import com.ironsource.C3450ea;
import com.ironsource.C3489gd;
import com.ironsource.C3605n2;
import com.ironsource.C3631oa;
import com.ironsource.C3641p2;
import com.ironsource.C3676r4;
import com.ironsource.C3818za;
import com.ironsource.C5;
import com.ironsource.CallableC3777x3;
import com.ironsource.Cc;
import com.ironsource.D5;
import com.ironsource.Dd;
import com.ironsource.InterfaceC3454ee;
import com.ironsource.InterfaceC3620o;
import com.ironsource.InterfaceC3801ya;
import com.ironsource.Lb;
import com.ironsource.P7;
import com.ironsource.R5;
import com.ironsource.R7;
import com.ironsource.S1;
import com.ironsource.Te;
import com.ironsource.Zd;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
class s extends m implements InterfaceC3801ya, InterfaceC3454ee, S1, R7, Cc, InterfaceC3620o {
    private e A;
    private long B;
    private Boolean C;
    private final Object D;
    private R5 E;
    private final long F;
    private final P7.a G;
    private final P7 H;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C3818za f29970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ConcurrentHashMap<String, C3605n2> f29971f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ConcurrentHashMap<String, h.a> f29972g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C3605n2 f29973h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private h f29974i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.ironsource.mediationsdk.e f29975j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private JSONObject f29976k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private C3436de f29977l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f29978m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f29979n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f29980o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f29981p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f29982q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private NetworkStateReceiver f29983r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f29984s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ConcurrentHashMap<String, t> f29985t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Te f29986u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f29987v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f29988w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f29989x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f29990y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f29991z;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ NetworkSettings f29992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Zd f29993b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f29994c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f29995d;

        public a(NetworkSettings networkSettings, Zd zd2, String str, String str2) {
            this.f29992a = networkSettings;
            this.f29993b = zd2;
            this.f29994c = str;
            this.f29995d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            s.this.a(this.f29992a, this.f29993b, this.f29994c, this.f29995d);
        }
    }

    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            s.this.j();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s.this.d("makeAuction()");
            s.this.f29980o = new Date().getTime();
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            s.this.b(map, arrayList, sb2, arrayList2);
            s.this.a(map, arrayList, sb2, arrayList2);
        }
    }

    public class d implements A3.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f29999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f30000b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f30001c;

        public d(Map map, StringBuilder sb2, List list) {
            this.f29999a = map;
            this.f30000b = sb2;
            this.f30001c = list;
        }

        @Override // com.ironsource.A3.b
        public void a(List<B3> list, long j10, List<String> list2) {
            s.this.c(D5.RV_COLLECT_TOKENS_COMPLETED, C3631oa.a(new Object[][]{new Object[]{"duration", Long.valueOf(j10)}}));
            for (B3 b10 : list) {
                t tVar = (t) s.this.f29985t.get(b10.c());
                if (b10.a() != null) {
                    this.f29999a.put(b10.c(), b10.a());
                    StringBuilder sb2 = this.f30000b;
                    sb2.append(b10.d());
                    sb2.append(b10.c());
                    sb2.append(StringUtils.COMMA);
                    if (tVar != null) {
                        tVar.a(D5.RV_INSTANCE_COLLECT_TOKEN_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(b10.e())}});
                    }
                } else if (tVar != null) {
                    tVar.a(D5.RV_INSTANCE_COLLECT_TOKEN_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(b10.e())}, new Object[]{"reason", b10.b()}});
                }
            }
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                t tVar2 = (t) s.this.f29985t.get(it.next());
                if (tVar2 != null) {
                    tVar2.a(D5.RV_INSTANCE_COLLECT_TOKEN_TIMED_OUT, new Object[][]{new Object[]{"duration", Long.valueOf(j10)}});
                }
            }
            s.this.a((Map<String, Object>) this.f29999a, (List<String>) this.f30001c, this.f30000b.toString());
        }

        @Override // com.ironsource.A3.b
        public void onFailure(String str) {
            s.this.c(D5.RV_COLLECT_TOKENS_FAILED, C3631oa.a(new Object[][]{new Object[]{"reason", str}}));
            s.this.a((Map<String, Object>) this.f29999a, (List<String>) this.f30001c, this.f30000b.toString());
        }
    }

    public enum e {
        RV_STATE_INITIATING,
        RV_STATE_AUCTION_IN_PROGRESS,
        RV_STATE_NOT_LOADED,
        RV_STATE_LOADING_SMASHES,
        RV_STATE_READY_TO_SHOW
    }

    private void a(List<NetworkSettings> list, Zd zd2, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        Iterator<NetworkSettings> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new a(it.next(), zd2, str, str2));
        }
        IronSourceThreadManager.INSTANCE.executeTasks(zd2.f(), zd2.o(), arrayList);
    }

    private List<C3605n2> g() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (t tVar : this.f29985t.values()) {
            if (!tVar.p() && !this.f29986u.b(tVar) && this.f29970e.b(tVar)) {
                copyOnWriteArrayList.add(new C3605n2(tVar.c()));
            }
        }
        return copyOnWriteArrayList;
    }

    private void h() {
        a(e.RV_STATE_NOT_LOADED);
        if (!this.f29991z) {
            b(false);
        }
        this.f29977l.a();
    }

    private void i() {
        if (this.f29970e.c().isEmpty()) {
            d("loadSmashes -  waterfall is empty");
            a(D5.TROUBLESHOOTING_RV_LOAD_FAILED, C3631oa.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new Object[]{"reason", "waterfall is empty"}}));
            h();
            return;
        }
        a(e.RV_STATE_LOADING_SMASHES);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f29970e.c().size() && i10 < this.f29989x; i11++) {
            t tVar = this.f29970e.c().get(i11);
            if (tVar.h()) {
                if (this.f29990y && tVar.p()) {
                    if (i10 != 0) {
                        String str = "Advanced Loading: Won't start loading bidder " + tVar.c() + " as a non bidder is being loaded";
                        d(str);
                        IronSourceUtils.i(str);
                        return;
                    }
                    String str2 = "Advanced Loading: Starting to load bidder " + tVar.c() + ". No other instances will be loaded at the same time.";
                    d(str2);
                    IronSourceUtils.i(str2);
                    g(tVar);
                    return;
                }
                g(tVar);
                i10++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        synchronized (this.D) {
            e eVar = this.A;
            e eVar2 = e.RV_STATE_AUCTION_IN_PROGRESS;
            if (eVar != eVar2) {
                a(eVar2);
                AsyncTask.execute(new c());
            }
        }
    }

    private void k() {
        a(g(), "fallback_" + System.currentTimeMillis(), this.f29976k);
    }

    @Override // com.ironsource.InterfaceC3801ya
    public void b(t tVar) {
        a(tVar, "onRewardedVideoAdStarted");
        Dd.a().c();
    }

    @Override // com.ironsource.InterfaceC3801ya
    public void c(t tVar) {
        a(tVar, "onRewardedVideoAdClosed, mediation state: " + this.A.name());
        Dd.a().b(this.f29970e.a(tVar.u()));
        this.f29991z = false;
        boolean z10 = this.A == e.RV_STATE_READY_TO_SHOW;
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            for (t tVar2 : this.f29970e.c()) {
                if (tVar2.y()) {
                    sb2.append(tVar2.c() + ";");
                }
            }
        }
        D5 d10 = D5.RV_INSTANCE_CLOSED;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("otherRVAvailable = ");
        sb3.append(sb2.length() > 0 ? "true|" + ((Object) sb2) : com.ironsource.mediationsdk.metadata.a.f29886h);
        tVar.b(d10, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb3.toString()}});
        if (tVar.equals(this.f29970e.f())) {
            this.f29970e.a((t) null);
            if (this.A != e.RV_STATE_READY_TO_SHOW) {
                b(false);
            }
        }
    }

    @Override // com.ironsource.R7
    public boolean d() {
        if ((!this.f29984s || IronSourceUtils.g(ContextProvider.getInstance().getApplicationContext())) && this.A == e.RV_STATE_READY_TO_SHOW && !this.f29991z) {
            Iterator<t> it = this.f29970e.c().iterator();
            while (it.hasNext()) {
                if (it.next().A()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.ironsource.InterfaceC3801ya
    public void e(t tVar) {
        a(tVar, "onRewardedVideoAdEnded");
        Dd.a().b();
    }

    @Override // com.ironsource.InterfaceC3801ya
    public void f(t tVar) {
        this.f29970e.a(tVar);
        this.f29987v++;
        a(tVar, "onRewardedVideoAdOpened");
        if (this.f29978m) {
            C3605n2 c3605n2 = this.f29971f.get(tVar.c());
            if (c3605n2 != null) {
                C3818za c3818za = this.f29970e;
                c3818za.a(c3818za.d(), c3605n2.a(this.f29988w), c3605n2.d());
                this.f29975j.a(c3605n2, tVar.g(), this.f29973h, this.f29988w);
                this.f29972g.put(tVar.c(), h.a.ISAuctionPerformanceShowedSuccessfully);
                a(c3605n2, this.f29988w);
            } else {
                String strC = tVar.c();
                c("onRewardedVideoAdOpened showing instance " + strC + " missing from waterfall");
                a(D5.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, C3631oa.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1011}, new Object[]{"reason", "Showing missing " + this.A}, new Object[]{IronSourceConstants.EVENTS_EXT1, strC}}));
            }
        }
        Dd.a().c(this.f29970e.a(tVar.u()));
        b(false);
        this.f29977l.c();
    }

    public s(List<NetworkSettings> list, Zd zd2, String str, String str2, HashSet<ImpressionDataListener> hashSet, C3450ea c3450ea) {
        boolean z10;
        super(hashSet, c3450ea);
        this.f29981p = "";
        this.f29984s = false;
        this.f29987v = 1;
        this.D = new Object();
        this.G = Lb.O().x();
        this.H = Lb.U().w();
        long time = new Date().getTime();
        c(D5.RV_MANAGER_INIT_STARTED, C3631oa.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, IronSourceConstants.LWS_RV_MANAGER_NAME}}));
        a(e.RV_STATE_INITIATING);
        this.C = null;
        this.f29989x = zd2.g();
        this.f29990y = zd2.j();
        this.f29988w = "";
        this.f29976k = null;
        C3641p2 c3641p2K = zd2.k();
        this.f29991z = false;
        this.f29970e = new C3818za(zd2.k().f(), zd2.k().i());
        this.f29971f = new ConcurrentHashMap<>();
        this.f29972g = new ConcurrentHashMap<>();
        this.B = new Date().getTime();
        if (c3641p2K.g() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f29978m = z10;
        this.f29979n = c3641p2K.n();
        if (this.f29978m) {
            this.f29975j = new com.ironsource.mediationsdk.e(IronSource.a.REWARDED_VIDEO, c3641p2K, this);
        }
        this.f29977l = new C3436de(c3641p2K, this);
        ConcurrentHashMap<String, t> concurrentHashMap = new ConcurrentHashMap<>();
        this.f29985t = concurrentHashMap;
        a(list, zd2, str, str2);
        this.f29974i = new h(list, c3641p2K.c());
        Te te2 = new Te();
        this.f29986u = te2;
        te2.a(new ArrayList(concurrentHashMap.values()));
        this.E = new R5(zd2.c(), this);
        this.F = zd2.l();
        c(D5.RV_MANAGER_INIT_ENDED, C3631oa.a(new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - time)}}));
        a(c3641p2K.k());
    }

    @Override // com.ironsource.InterfaceC3801ya
    public void b(t tVar, C3489gd c3489gd) {
        a(tVar, "onRewardedVideoAdClicked");
        Dd.a().a(c3489gd, this.f29970e.a(tVar.u()));
    }

    @Override // com.ironsource.InterfaceC3454ee
    public void b() {
        d("onLoadTriggered: RV load was triggered in " + this.A + " state");
        a(0L);
    }

    private void g(t tVar) {
        String strK = this.f29971f.get(tVar.c()).k();
        JSONObject jSONObjectA = this.f29971f.get(tVar.c()).a();
        tVar.c(strK);
        tVar.a(strK, jSONObjectA);
    }

    /* JADX WARN: Code duplicated, block: B:70:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0058 A[SYNTHETIC] */
    @Override // com.ironsource.InterfaceC3801ya
    public void d(t tVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        synchronized (this.D) {
            a(tVar, "onLoadError mState=" + this.A);
            if (tVar.u() == this.f29970e.d() && this.A != e.RV_STATE_AUCTION_IN_PROGRESS) {
                this.f29972g.put(tVar.c(), h.a.ISAuctionPerformanceFailedToLoad);
                e eVar = this.A;
                if (eVar == e.RV_STATE_LOADING_SMASHES || eVar == e.RV_STATE_READY_TO_SHOW) {
                    boolean z10 = false;
                    boolean z11 = false;
                    for (t tVar2 : this.f29970e.c()) {
                        if (tVar2.h()) {
                            if (this.f29990y && tVar2.p()) {
                                if (!z10 && !z11) {
                                    String str = "Advanced Loading: Starting to load bidder " + tVar2.c() + ". No other instances will be loaded at the same time.";
                                    d(str);
                                    IronSourceUtils.i(str);
                                    if (this.f29971f.get(tVar2.c()) != null) {
                                        copyOnWriteArrayList.add(tVar2);
                                        if (this.f29990y) {
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                    continue;
                                } else {
                                    String str2 = "Advanced Loading: Won't start loading bidder " + tVar2.c() + " as " + (z10 ? "a non bidder is being loaded" : "a non bidder was already loaded successfully");
                                    d(str2);
                                    IronSourceUtils.i(str2);
                                    break;
                                }
                            } else if (this.f29971f.get(tVar2.c()) != null) {
                                copyOnWriteArrayList.add(tVar2);
                                if (this.f29990y || !tVar.p() || tVar2.p() || copyOnWriteArrayList.size() >= this.f29989x) {
                                    break;
                                } else {
                                    z10 = true;
                                }
                            } else {
                                continue;
                            }
                        } else if (tVar2.z()) {
                            z10 = true;
                        } else if (tVar2.A()) {
                            z11 = true;
                        }
                    }
                    if (copyOnWriteArrayList.size() == 0 && !z11 && !z10) {
                        d("onLoadError(): No other available smashes");
                        if (!this.f29991z) {
                            b(false);
                        }
                        a(D5.TROUBLESHOOTING_RV_LOAD_FAILED, C3631oa.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 509}, new Object[]{"reason", "Mediation No fill"}}));
                        a(e.RV_STATE_NOT_LOADED);
                        this.f29977l.a();
                    }
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        g((t) it.next());
                    }
                    return;
                }
                return;
            }
            d("onLoadError was invoked with auctionId:" + tVar.u() + " and the current id is " + this.f29970e.d());
            tVar.a(D5.RV_MANAGER_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 4}, new Object[]{"reason", "loadError wrong auction ID " + this.A}});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(NetworkSettings networkSettings, Zd zd2, String str, String str2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(String.format("Start initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName()));
        AbstractAdapter abstractAdapterA = com.ironsource.mediationsdk.c.b().a(networkSettings, networkSettings.getRewardedVideoSettings(), false);
        if (abstractAdapterA != null) {
            t tVar = new t(str, str2, networkSettings, this, zd2.h(), abstractAdapterA, this.f29987v);
            this.f29985t.put(tVar.c(), tVar);
        }
        ironLog.verbose(String.format("Done initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map<String, Object> map, List<String> list, StringBuilder sb2, List<CallableC3777x3> list2) {
        for (t tVar : this.f29985t.values()) {
            if (!this.f29986u.b(tVar) && this.f29970e.b(tVar)) {
                if (tVar.p()) {
                    list2.add(new CallableC3777x3(tVar.g(), tVar.c(), null, tVar, null, null));
                } else {
                    list.add(tVar.c());
                    sb2.append(tVar.g() + tVar.c() + StringUtils.COMMA);
                }
            }
        }
    }

    private void b(boolean z10) {
        a(z10, (Map<String, Object>) null);
    }

    private void b(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 0);
    }

    private void c(t tVar, C3489gd c3489gd) {
        d("showVideo()");
        this.f29986u.a(tVar);
        if (this.f29986u.b(tVar)) {
            tVar.B();
            IronSourceUtils.i(tVar.c() + " rewarded video is now session capped");
        }
        P7.a aVar = this.G;
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        String strC = c3489gd.c();
        IronSource.a aVar2 = IronSource.a.REWARDED_VIDEO;
        aVar.a(applicationContext, strC, aVar2);
        if (this.H.c(ContextProvider.getInstance().getApplicationContext(), c3489gd, aVar2)) {
            a(D5.RV_CAP_PLACEMENT);
        }
        this.E.a();
        tVar.a(c3489gd);
    }

    private void b(D5 d10) {
        a(d10, (Map<String, Object>) null, false, false);
    }

    private void b(D5 d10, Map<String, Object> map) {
        a(d10, map, true, true);
    }

    @Override // com.ironsource.R7
    public void a(Activity activity, C3489gd c3489gd) {
        synchronized (this.D) {
            try {
                if (c3489gd == null) {
                    a("showRewardedVideo error: empty default placement");
                    IronSourceError ironSourceError = new IronSourceError(1021, "showRewardedVideo error: empty default placement");
                    Dd ddA = Dd.a();
                    C3818za c3818za = this.f29970e;
                    ddA.a(ironSourceError, c3818za.a(c3818za.d()));
                    a(D5.RV_CALLBACK_SHOW_FAILED, C3631oa.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1021}, new Object[]{"reason", "showRewardedVideo error: empty default placement"}}), false, true);
                    return;
                }
                this.f29988w = c3489gd.c();
                b("showRewardedVideo(" + c3489gd + ")");
                t tVar = null;
                b(D5.RV_API_SHOW_CALLED, activity != null ? C3631oa.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, IronSourceConstants.EVENTS_INIT_CONTEXT_FLOW}}) : null);
                if (this.f29991z) {
                    a("showRewardedVideo error: can't show ad while an ad is already showing");
                    IronSourceError ironSourceError2 = new IronSourceError(1022, "showRewardedVideo error: can't show ad while an ad is already showing");
                    Dd ddA2 = Dd.a();
                    C3818za c3818za2 = this.f29970e;
                    ddA2.a(ironSourceError2, c3818za2.a(c3818za2.d()));
                    b(D5.RV_CALLBACK_SHOW_FAILED, C3631oa.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1022}, new Object[]{"reason", "showRewardedVideo error: can't show ad while an ad is already showing"}}));
                    return;
                }
                if (this.A != e.RV_STATE_READY_TO_SHOW) {
                    a("showRewardedVideo error: show called while no ads are available");
                    IronSourceError ironSourceError3 = new IronSourceError(1023, "showRewardedVideo error: show called while no ads are available");
                    Dd ddA3 = Dd.a();
                    C3818za c3818za3 = this.f29970e;
                    ddA3.a(ironSourceError3, c3818za3.a(c3818za3.d()));
                    b(D5.RV_CALLBACK_SHOW_FAILED, C3631oa.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1023}, new Object[]{"reason", "showRewardedVideo error: show called while no ads are available"}}));
                    return;
                }
                if (this.H.c(ContextProvider.getInstance().getApplicationContext(), c3489gd, IronSource.a.REWARDED_VIDEO)) {
                    String str = "showRewardedVideo error: placement " + this.f29988w + " is capped";
                    a(str);
                    IronSourceError ironSourceError4 = new IronSourceError(IronSourceError.ERROR_PLACEMENT_CAPPED, str);
                    Dd ddA4 = Dd.a();
                    C3818za c3818za4 = this.f29970e;
                    ddA4.a(ironSourceError4, c3818za4.a(c3818za4.d()));
                    b(D5.RV_CALLBACK_SHOW_FAILED, C3631oa.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_PLACEMENT_CAPPED)}, new Object[]{"reason", str}}));
                    return;
                }
                StringBuffer stringBuffer = new StringBuffer();
                for (t tVar2 : this.f29970e.c()) {
                    if (tVar2.A()) {
                        this.f29991z = true;
                        tVar2.b(true);
                        a(e.RV_STATE_NOT_LOADED);
                        tVar = tVar2;
                        break;
                    }
                    if (tVar2.e() != null) {
                        stringBuffer.append(tVar2.c() + StringUtils.PROCESS_POSTFIX_DELIMITER + tVar2.e() + StringUtils.COMMA);
                    }
                    tVar2.b(false);
                }
                if (tVar == null) {
                    d("showRewardedVideo(): No ads to show");
                    Dd ddA5 = Dd.a();
                    IronSourceError ironSourceErrorBuildNoAdsToShowError = ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
                    C3818za c3818za5 = this.f29970e;
                    ddA5.a(ironSourceErrorBuildNoAdsToShowError, c3818za5.a(c3818za5.d()));
                    HashMap map = new HashMap();
                    map.put(IronSourceConstants.EVENTS_ERROR_CODE, 509);
                    map.put("reason", "showRewardedVideo(): No ads to show");
                    if (stringBuffer.length() != 0) {
                        map.put(IronSourceConstants.EVENTS_EXT1, stringBuffer.toString());
                    }
                    b(D5.RV_CALLBACK_SHOW_FAILED, map);
                    this.f29977l.b();
                    return;
                }
                c(tVar, c3489gd);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean c(D5 d10) {
        return d10 == D5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS || d10 == D5.RV_AUCTION_SUCCESS || d10 == D5.RV_AUCTION_FAILED || d10 == D5.RV_AD_UNIT_CAPPED;
    }

    private void c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager: " + str, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(D5 d10, Map<String, Object> map) {
        a(d10, map, false, false);
    }

    private boolean c(boolean z10) {
        Boolean bool = this.C;
        if (bool == null) {
            return false;
        }
        return (z10 && !bool.booleanValue() && d()) || (!z10 && this.C.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager: " + str, 0);
    }

    @Override // com.ironsource.InterfaceC3801ya
    public void a(t tVar) {
        synchronized (this.D) {
            a(tVar, "onLoadSuccess mState=" + this.A);
            if (tVar.u() == this.f29970e.d() && this.A != e.RV_STATE_AUCTION_IN_PROGRESS) {
                this.f29972g.put(tVar.c(), h.a.ISAuctionPerformanceLoadedSuccessfully);
                e eVar = this.A;
                e eVar2 = e.RV_STATE_LOADING_SMASHES;
                if (eVar == eVar2) {
                    a(e.RV_STATE_READY_TO_SHOW);
                    a(D5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS, C3631oa.a(new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - this.f29980o)}}));
                    this.E.a(0L);
                    if (this.f29978m) {
                        C3605n2 c3605n2 = this.f29971f.get(tVar.c());
                        if (c3605n2 != null) {
                            C3818za c3818za = this.f29970e;
                            c3818za.a(c3818za.d(), c3605n2.a(""), c3605n2.d());
                            this.f29975j.a(c3605n2, tVar.g(), this.f29973h);
                            this.f29975j.a(this.f29970e.c(), this.f29971f, tVar.g(), this.f29973h, c3605n2);
                        } else {
                            String strC = tVar.c();
                            c("onLoadSuccess winner instance " + strC + " missing from waterfall. auctionId: " + tVar.u() + " and the current id is " + this.f29970e.d());
                            D5 d10 = D5.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR;
                            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 1010};
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Loaded missing ");
                            sb2.append(eVar2);
                            a(d10, C3631oa.a(new Object[][]{objArr, new Object[]{"reason", sb2.toString()}, new Object[]{IronSourceConstants.EVENTS_EXT1, strC}}));
                        }
                    }
                    b(true);
                }
                return;
            }
            d("onLoadSuccess was invoked with auctionId: " + tVar.u() + " and the current id is " + this.f29970e.d());
            tVar.a(D5.RV_MANAGER_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 2}, new Object[]{"reason", "onLoadSuccess wrong auction ID " + this.A}});
        }
    }

    @Override // com.ironsource.InterfaceC3801ya
    public void a(IronSourceError ironSourceError, t tVar) {
        C3605n2 c3605n2;
        if (this.f29978m && (c3605n2 = this.f29971f.get(tVar.c())) != null) {
            C3818za c3818za = this.f29970e;
            c3818za.a(c3818za.d(), c3605n2.a(this.f29988w), c3605n2.d());
        }
        a(tVar, "onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.f29991z = false;
        b(D5.RV_CALLBACK_SHOW_FAILED, C3631oa.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}}));
        Dd.a().a(ironSourceError, this.f29970e.a(tVar.u()));
        this.f29972g.put(tVar.c(), h.a.ISAuctionPerformanceFailedToShow);
        if (this.A != e.RV_STATE_READY_TO_SHOW) {
            b(false);
        }
        this.f29977l.b();
    }

    @Override // com.ironsource.InterfaceC3801ya
    public void a(t tVar, C3489gd c3489gd) {
        a(tVar, "onRewardedVideoAdRewarded");
        Dd.a().b(c3489gd, this.f29970e.a(tVar.u()));
    }

    @Override // com.ironsource.S1
    public void a(List<C3605n2> list, String str, C3605n2 c3605n2, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        d("makeAuction(): success");
        this.f29973h = c3605n2;
        this.f29982q = i10;
        this.f29976k = jSONObject;
        this.f29981p = "";
        if (!TextUtils.isEmpty(str2)) {
            a(D5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, C3631oa.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i11)}, new Object[]{"reason", str2}}));
        }
        IronSource.a aVar = IronSource.a.REWARDED_VIDEO;
        a(jSONObject2, aVar);
        if (this.f29872b.a(aVar)) {
            a(D5.RV_AD_UNIT_CAPPED, C3631oa.a(new Object[][]{new Object[]{"auctionId", str}}));
            h();
        } else {
            a(list, str, this.f29976k);
            a(D5.RV_AUCTION_SUCCESS, C3631oa.a(new Object[][]{new Object[]{"duration", Long.valueOf(j10)}}));
            i();
        }
    }

    @Override // com.ironsource.S1
    public void a(int i10, String str, int i11, String str2, long j10) {
        String str3 = "Auction failed (error " + i10 + " - " + str + ")";
        d(str3);
        IronSourceUtils.i("RV: " + str3);
        this.f29982q = i11;
        this.f29981p = str2;
        this.f29976k = null;
        if (this.f29979n) {
            d("Moving to fallback waterfall");
            k();
        }
        if (TextUtils.isEmpty(str)) {
            a(D5.RV_AUCTION_FAILED, C3631oa.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{"duration", Long.valueOf(j10)}}));
        } else {
            a(D5.RV_AUCTION_FAILED, C3631oa.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{"reason", str}, new Object[]{"duration", Long.valueOf(j10)}}));
        }
        i();
    }

    private void a(long j10) {
        if (this.f29986u.a()) {
            d("all smashes are capped");
            a(D5.TROUBLESHOOTING_RV_LOAD_FAILED, C3631oa.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80001}, new Object[]{"reason", "all smashes are capped"}}));
            h();
            return;
        }
        a(IronSource.a.REWARDED_VIDEO);
        if (this.f29978m) {
            if (!this.f29972g.isEmpty()) {
                this.f29974i.a(this.f29972g);
                this.f29972g.clear();
            }
            new Timer().schedule(new b(), j10);
            return;
        }
        d("auction fallback flow starting");
        k();
        if (this.f29970e.c().isEmpty()) {
            d("loadSmashes -  waterfall is empty");
            a(D5.TROUBLESHOOTING_RV_LOAD_FAILED, C3631oa.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new Object[]{"reason", "waterfall is empty"}}));
            h();
        } else {
            b(D5.RV_BUSINESS_MEDIATION_LOAD);
            i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, StringBuilder sb2, List<CallableC3777x3> list2) {
        if (list2.isEmpty()) {
            a(map, list, sb2.toString());
            return;
        }
        A3 a10 = new A3();
        d dVar = new d(map, sb2, list);
        b(D5.RV_COLLECT_TOKENS);
        a10.a(list2, dVar, this.F, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, String str) {
        if (map.keySet().size() == 0 && list.size() == 0) {
            c(D5.RV_AUCTION_FAILED, C3631oa.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{"duration", 0}}));
            d("makeAuction() failed - No candidates available for auctioning");
            h();
            return;
        }
        d("makeAuction() - request waterfall is: " + str);
        b(D5.RV_BUSINESS_MEDIATION_LOAD);
        b(D5.RV_AUCTION_REQUEST);
        c(D5.RV_AUCTION_REQUEST_WATERFALL, C3631oa.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, str.toString()}}));
        this.f29975j.a(ContextProvider.getInstance().getApplicationContext(), map, list, this.f29974i, this.f29987v, this.f29873c);
    }

    private void a(List<C3605n2> list, String str, JSONObject jSONObject) {
        this.f29971f.clear();
        this.f29972g.clear();
        CopyOnWriteArrayList<t> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        StringBuilder sb2 = new StringBuilder();
        for (C3605n2 c3605n2 : list) {
            sb2.append(a(c3605n2) + StringUtils.COMMA);
            t tVar = this.f29985t.get(c3605n2.c());
            if (tVar != null) {
                AbstractAdapter abstractAdapterA = com.ironsource.mediationsdk.c.b().a(tVar.f29513b.h());
                if (abstractAdapterA != null) {
                    t tVar2 = new t(tVar, this, abstractAdapterA, this.f29987v, str, jSONObject, this.f29982q, this.f29981p);
                    tVar2.a(true);
                    copyOnWriteArrayList.add(tVar2);
                    this.f29971f.put(tVar2.c(), c3605n2);
                    this.f29972g.put(c3605n2.c(), h.a.ISAuctionPerformanceDidntAttemptToLoad);
                }
            } else {
                d("updateWaterfall() - could not find matching smash for auction response item " + c3605n2.c());
            }
        }
        this.f29970e.a(copyOnWriteArrayList, str);
        if (this.f29970e.a()) {
            a(D5.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD, C3631oa.a(new Object[][]{new Object[]{"reason", "waterfalls hold too many with size=" + this.f29970e.e()}}));
        }
        d("updateWaterfall() - next waterfall is " + sb2.toString());
        if (sb2.length() == 0) {
            d("Updated waterfall is empty");
        }
        a(D5.RV_AUCTION_RESPONSE_WATERFALL, C3631oa.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb2.toString()}}));
    }

    private String a(C3605n2 c3605n2) {
        String string;
        t tVar = this.f29985t.get(c3605n2.c());
        if (tVar != null) {
            string = Integer.toString(tVar.g());
        } else {
            string = TextUtils.isEmpty(c3605n2.k()) ? "1" : "2";
        }
        return string + c3605n2.c();
    }

    private void a(e eVar) {
        d("current state=" + this.A + ", new state=" + eVar);
        this.A = eVar;
    }

    private void a(boolean z10, Map<String, Object> map) {
        D5 d10;
        synchronized (this.D) {
            Boolean bool = this.C;
            if (bool == null || bool.booleanValue() != z10) {
                this.C = Boolean.valueOf(z10);
                long time = new Date().getTime() - this.B;
                this.B = new Date().getTime();
                if (map == null) {
                    map = new HashMap<>();
                }
                map.put("duration", Long.valueOf(time));
                if (z10) {
                    d10 = D5.RV_CALLBACK_AVAILABILITY_TRUE;
                } else {
                    d10 = D5.RV_CALLBACK_AVAILABILITY_FALSE;
                }
                a(d10, map);
                Dd ddA = Dd.a();
                C3818za c3818za = this.f29970e;
                ddA.a(z10, c3818za.a(c3818za.d()));
            }
        }
    }

    private void a(t tVar, String str) {
        String str2 = tVar.c() + " : " + str;
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "LWSProgRvManager: " + str2, 0);
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 3);
    }

    private void a(D5 d10, Map<String, Object> map) {
        a(d10, map, false, true);
    }

    private void a(D5 d10) {
        a(d10, (Map<String, Object>) null, true, true);
    }

    private void a(D5 d10, Map<String, Object> map, boolean z10, boolean z11) {
        HashMap map2 = new HashMap();
        map2.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        map2.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 2);
        if (z11 && !TextUtils.isEmpty(this.f29970e.d())) {
            map2.put("auctionId", this.f29970e.d());
        }
        JSONObject jSONObject = this.f29976k;
        if (jSONObject != null && jSONObject.length() > 0) {
            map2.put("genericParams", this.f29976k);
        }
        if (z10 && !TextUtils.isEmpty(this.f29988w)) {
            map2.put("placement", this.f29988w);
        }
        if (c(d10)) {
            C3400be.i().a(map2, this.f29982q, this.f29981p);
        }
        map2.put("sessionDepth", Integer.valueOf(this.f29987v));
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    map2.putAll(map);
                }
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager: RV sendMediationEvent " + Log.getStackTraceString(e10), 3);
            }
        }
        C3400be.i().a(new C5(d10, new JSONObject(map2)));
    }

    @Override // com.ironsource.InterfaceC3620o
    public void a() {
        a(e.RV_STATE_NOT_LOADED);
        a(false, C3631oa.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS)}, new Object[]{"reason", "loaded ads are expired"}}));
        a(0L);
    }

    @Override // com.ironsource.Cc
    public void a(boolean z10) {
        if (this.f29984s) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "Network Availability Changed To: " + z10, 0);
            if (c(z10)) {
                b(z10);
            }
        }
    }

    @Override // com.ironsource.R7
    public void a(Context context, boolean z10) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager Should Track Network State: " + z10, 0);
        try {
            this.f29984s = z10;
            if (z10) {
                if (this.f29983r == null) {
                    this.f29983r = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.f29983r, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.f29983r != null) {
                context.getApplicationContext().unregisterReceiver(this.f29983r);
            }
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error("Got an error from receiver with message: " + e10.getMessage());
        }
    }
}
