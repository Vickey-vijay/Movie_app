package com.ironsource.mediationsdk;

import android.content.Context;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.A3;
import com.ironsource.B3;
import com.ironsource.C3;
import com.ironsource.C3450ea;
import com.ironsource.C3497h3;
import com.ironsource.C3570l5;
import com.ironsource.C3605n2;
import com.ironsource.C3676r4;
import com.ironsource.C3725u2;
import com.ironsource.C3785xb;
import com.ironsource.C5;
import com.ironsource.CallableC3777x3;
import com.ironsource.D5;
import com.ironsource.InterfaceC3685rd;
import com.ironsource.J9;
import com.ironsource.K7;
import com.ironsource.L7;
import com.ironsource.Lb;
import com.ironsource.P7;
import com.ironsource.P8;
import com.ironsource.S1;
import com.ironsource.Vf;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.iab.vast.tags.VastAttributes;
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

/* JADX INFO: loaded from: classes2.dex */
public class y extends m implements InterfaceC3685rd, S1 {
    private ConcurrentHashMap<String, com.ironsource.mediationsdk.h.a> A;
    private long B;
    private final Object C;
    private C3570l5 D;
    private boolean E;
    private final long F;
    private final Runnable G;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final P8 f30117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final P8.a f30118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final P7 f30119g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final P7.a f30120h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private k f30121i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private i f30122j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private C3785xb f30123k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private q f30124l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private C3497h3 f30125m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f30126n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private z f30127o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f30128p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ConcurrentHashMap<String, z> f30129q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private CopyOnWriteArrayList<z> f30130r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f30131s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private JSONObject f30132t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f30133u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f30134v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private com.ironsource.mediationsdk.e f30135w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private C3605n2 f30136x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private com.ironsource.mediationsdk.h f30137y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ConcurrentHashMap<String, C3605n2> f30138z;

    public class a implements l.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C3497h3 f30139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q f30140b;

        @Override // com.ironsource.mediationsdk.l.b
        public void a() {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("placement = " + this.f30139a.c());
            l.b(this.f30140b);
            y yVar = y.this;
            yVar.f30124l = this.f30140b;
            yVar.f30125m = this.f30139a;
            P7 p10 = yVar.f30119g;
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            C3497h3 c3497h3 = this.f30139a;
            IronSource.a aVar = IronSource.a.BANNER;
            if (!p10.c(applicationContext, c3497h3, aVar)) {
                y.this.b(false);
                return;
            }
            ironLog.verbose("placement is capped");
            n.a().b(aVar, new IronSourceError(604, "placement " + this.f30139a.c() + " is capped"));
            y.this.a(D5.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 604}});
            y.this.a(i.READY_TO_LOAD);
        }

        public a(C3497h3 c3497h3, q qVar) {
            this.f30139a = c3497h3;
            this.f30140b = qVar;
        }

        @Override // com.ironsource.mediationsdk.l.b
        public void a(String str) {
            IronLog.API.error("can't load banner - errorMessage = " + str);
        }
    }

    public class b implements l.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f30142a;

        @Override // com.ironsource.mediationsdk.l.b
        public void a() {
            IronLog.INTERNAL.verbose("destroying banner");
            y.this.f30123k.b();
            y yVar = y.this;
            z zVar = yVar.f30127o;
            y.this.a(D5.BN_DESTROY, (Object[][]) null, zVar != null ? zVar.n() : yVar.f30128p);
            y.this.h();
            this.f30142a.a();
            y yVar2 = y.this;
            yVar2.f30124l = null;
            yVar2.f30125m = null;
            yVar2.a(i.READY_TO_LOAD);
        }

        public b(q qVar) {
            this.f30142a = qVar;
        }

        @Override // com.ironsource.mediationsdk.l.b
        public void a(String str) {
            IronLog.API.error("destroy banner failed - errorMessage = " + str);
        }
    }

    public class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                y yVar = y.this;
                if (yVar.f30124l == null) {
                    IronLog.INTERNAL.verbose("mIronSourceBanner is null");
                    y.this.a(D5.BN_SKIP_RELOAD, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_BN_RELOAD_SKIP_BANNER_LAYOUT_IS_NULL)}});
                } else {
                    if (yVar.o()) {
                        y.this.v();
                        return;
                    }
                    IronLog.INTERNAL.verbose("banner is not visible, reload skipped");
                    y.this.a(D5.BN_SKIP_RELOAD, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 613}});
                    y yVar2 = y.this;
                    yVar2.f30123k.a(TimeUnit.SECONDS.toMillis(yVar2.f30121i.f()));
                }
            } catch (Throwable th2) {
                C3676r4.d().a(th2);
                y.this.a(D5.TROUBLESHOOTING_BN_RELOAD_EXCEPTION, new Object[][]{new Object[]{"reason", th2.getMessage()}});
            }
        }

        public c() {
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            y.this.w();
            if (y.this.y()) {
                return;
            }
            y.this.a(D5.BN_AUCTION_REQUEST);
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            y.this.b(map, arrayList, sb2, arrayList2);
            y.this.a(map, arrayList, sb2, arrayList2);
        }
    }

    public class e implements A3.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f30146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f30147b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f30148c;

        public e(Map map, StringBuilder sb2, List list) {
            this.f30146a = map;
            this.f30147b = sb2;
            this.f30148c = list;
        }

        @Override // com.ironsource.A3.b
        public void a(List<B3> list, long j10, List<String> list2) {
            y.this.a(D5.BN_COLLECT_TOKENS_COMPLETED, new Object[][]{new Object[]{"duration", Long.valueOf(j10)}});
            for (B3 b10 : list) {
                if (b10.a() != null) {
                    this.f30146a.put(b10.c(), b10.a());
                    StringBuilder sb2 = this.f30147b;
                    sb2.append(b10.d());
                    sb2.append(b10.c());
                    sb2.append(StringUtils.COMMA);
                    ((z) y.this.f30129q.get(b10.c())).a(D5.BN_INSTANCE_COLLECT_TOKEN_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(b10.e())}});
                } else {
                    ((z) y.this.f30129q.get(b10.c())).a(D5.BN_INSTANCE_COLLECT_TOKEN_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(b10.e())}, new Object[]{"reason", b10.b()}});
                }
            }
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                ((z) y.this.f30129q.get(it.next())).a(D5.BN_INSTANCE_COLLECT_TOKEN_TIMED_OUT, new Object[][]{new Object[]{"duration", Long.valueOf(j10)}});
            }
            y.this.a((Map<String, Object>) this.f30146a, (List<String>) this.f30148c, this.f30147b);
        }

        @Override // com.ironsource.A3.b
        public void onFailure(String str) {
            y.this.a(D5.BN_COLLECT_TOKENS_FAILED, new Object[][]{new Object[]{"duration", str}});
            y.this.a((Map<String, Object>) this.f30146a, (List<String>) this.f30148c, this.f30147b);
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ NetworkSettings f30150a;

        public f(NetworkSettings networkSettings) {
            this.f30150a = networkSettings;
        }

        @Override // java.lang.Runnable
        public void run() {
            y.this.a(this.f30150a);
        }
    }

    public class g implements C3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ z f30152a;

        public g(z zVar) {
            this.f30152a = zVar;
        }

        @Override // com.ironsource.C3
        public void a() {
            this.f30152a.D();
        }
    }

    public class h extends TimerTask {
        public h() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            y.this.u();
        }
    }

    public enum i {
        NONE,
        READY_TO_LOAD,
        STARTED_LOADING,
        FIRST_AUCTION,
        AUCTION,
        LOADING,
        RELOADING,
        LOADED
    }

    public y(List<NetworkSettings> list, k kVar, HashSet<ImpressionDataListener> hashSet, C3450ea c3450ea) {
        this(Lb.U(), Lb.O(), list, kVar, hashSet, c3450ea);
    }

    private boolean a(i iVar, i iVar2) {
        boolean z10;
        synchronized (this.C) {
            if (this.f30122j == iVar) {
                IronLog.INTERNAL.verbose("set state from '" + this.f30122j + "' to '" + iVar2 + "'");
                z10 = true;
                this.f30122j = iVar2;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z10) {
        i iVar;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("current state = " + this.f30122j);
        if (this.f30121i.j()) {
            iVar = z10 ? i.AUCTION : i.FIRST_AUCTION;
        } else {
            iVar = z10 ? i.RELOADING : i.LOADING;
        }
        if (!a(i.STARTED_LOADING, iVar)) {
            ironLog.error("wrong state - " + this.f30122j);
            return;
        }
        this.D = new C3570l5();
        this.f30131s = "";
        this.f30132t = null;
        this.f30126n = 0;
        this.f30128p = this.f30117e.a(IronSource.a.BANNER);
        if (z10) {
            a(D5.BN_RELOAD);
        } else {
            a(D5.BN_LOAD);
        }
        if (this.f30121i.j()) {
            u();
        } else {
            x();
            t();
        }
    }

    private boolean g() {
        q qVar = this.f30124l;
        return (qVar == null || qVar.b()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.f30127o != null) {
            IronLog.INTERNAL.verbose("mActiveSmash = " + this.f30127o.f());
            this.f30127o.t();
            this.f30127o = null;
        }
    }

    private List<C3605n2> i() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (z zVar : this.f30129q.values()) {
            if (!zVar.p() && !this.f30119g.c(ContextProvider.getInstance().getApplicationContext(), this.f30125m, IronSource.a.BANNER)) {
                copyOnWriteArrayList.add(new C3605n2(zVar.c()));
            }
        }
        return copyOnWriteArrayList;
    }

    private ISBannerSize j() {
        q qVar = this.f30124l;
        if (qVar == null || qVar.getSize() == null) {
            return null;
        }
        if (this.f30124l.getSize().isSmart()) {
            return AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()) ? ISBannerSize.f29519f : ISBannerSize.BANNER;
        }
        return this.f30124l.getSize();
    }

    private ISBannerSize k() {
        q qVar = this.f30124l;
        if (qVar != null) {
            return qVar.getSize();
        }
        return null;
    }

    private String l() {
        C3497h3 c3497h3 = this.f30125m;
        return c3497h3 != null ? c3497h3.c() : "";
    }

    private void m() {
        String str = this.f30130r.isEmpty() ? "Empty waterfall" : "Mediation No fill";
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("errorReason = " + str);
        g((z) null);
        i iVar = i.LOADING;
        i iVar2 = i.READY_TO_LOAD;
        if (a(iVar, iVar2)) {
            a(D5.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 606}, new Object[]{"reason", str}, new Object[]{"duration", Long.valueOf(C3570l5.a(this.D))}});
            n.a().b(IronSource.a.BANNER, new IronSourceError(606, str));
        } else if (a(i.RELOADING, i.LOADED)) {
            a(D5.BN_CALLBACK_RELOAD_ERROR, new Object[][]{new Object[]{"duration", Long.valueOf(C3570l5.a(this.D))}});
            n.a().b(IronSource.a.BANNER, new IronSourceError(606, str));
            this.f30123k.a(TimeUnit.SECONDS.toMillis(this.f30121i.f()));
        } else {
            a(iVar2);
            ironLog.error("wrong state = " + this.f30122j);
        }
    }

    private void n() {
        String strL = l();
        P7.a aVar = this.f30120h;
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        IronSource.a aVar2 = IronSource.a.BANNER;
        aVar.a(applicationContext, strL, aVar2);
        if (this.f30119g.c(ContextProvider.getInstance().getApplicationContext(), this.f30125m, aVar2)) {
            a(D5.BN_PLACEMENT_CAPPED);
        }
    }

    private boolean p() {
        i iVar = this.f30122j;
        return iVar == i.RELOADING || iVar == i.AUCTION;
    }

    private boolean q() {
        boolean z10;
        synchronized (this.C) {
            z10 = this.f30122j == i.LOADED;
        }
        return z10;
    }

    private boolean r() {
        boolean z10;
        synchronized (this.C) {
            i iVar = this.f30122j;
            z10 = iVar == i.FIRST_AUCTION || iVar == i.AUCTION;
        }
        return z10;
    }

    private boolean s() {
        boolean z10;
        synchronized (this.C) {
            i iVar = this.f30122j;
            z10 = iVar == i.LOADING || iVar == i.RELOADING;
        }
        return z10;
    }

    private void t() {
        try {
            for (int i10 = this.f30126n; i10 < this.f30130r.size(); i10++) {
                z zVar = this.f30130r.get(i10);
                if (zVar.h()) {
                    IronLog.INTERNAL.verbose("loading smash - " + zVar.f());
                    this.f30126n = i10 + 1;
                    f(zVar);
                    return;
                }
            }
            m();
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            a(D5.TROUBLESHOOTING_BN_INTERNAL_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, "loadNextSmash"}, new Object[]{"reason", Log.getStackTraceString(e10)}});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        IronLog.INTERNAL.verbose();
        AsyncTask.execute(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("");
        if (a(i.LOADED, i.STARTED_LOADING)) {
            b(true);
            return;
        }
        ironLog.error("wrong state = " + this.f30122j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        if (this.A.isEmpty()) {
            return;
        }
        this.f30137y.a(this.A);
        this.A.clear();
    }

    private void x() {
        List<C3605n2> listI = i();
        this.f30131s = e();
        a(listI);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean y() {
        long jA = l.a(this.B, this.f30121i.h());
        if (jA <= 0) {
            return false;
        }
        IronLog.INTERNAL.verbose("waiting before auction - timeToWaitBeforeAuction = " + jA);
        new Timer().schedule(new h(), jA);
        return true;
    }

    @Override // com.ironsource.InterfaceC3685rd
    public void d(z zVar) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(zVar.f());
        if (g()) {
            C3725u2.a().b(this.f29874d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        a(D5.BN_CALLBACK_CLICK, objArr, zVar.n());
    }

    public boolean o() {
        if (!this.f30124l.isShown()) {
            IronLog.INTERNAL.verbose("banner or one of its parents are INVISIBLE or GONE");
            return false;
        }
        if (!this.f30124l.hasWindowFocus()) {
            IronLog.INTERNAL.verbose("banner has no window focus");
            return false;
        }
        boolean globalVisibleRect = this.f30124l.getGlobalVisibleRect(new Rect());
        IronLog.INTERNAL.verbose("visible = " + globalVisibleRect);
        return globalVisibleRect;
    }

    private void f(z zVar) {
        String strK;
        q qVar = this.f30124l;
        if (qVar == null || qVar.b()) {
            return;
        }
        q qVarC = null;
        if (zVar.p()) {
            strK = this.f30138z.get(zVar.c()).k();
            zVar.c(strK);
        } else {
            strK = null;
        }
        JSONObject jSONObjectA = this.f30138z.get(zVar.c()).a();
        try {
            qVarC = this.f30124l.c();
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.verbose("Failed to make copy of banner layout: " + e10.getMessage());
        }
        zVar.a(qVarC, this.f30125m, strK, jSONObjectA);
    }

    @Override // com.ironsource.InterfaceC3685rd
    public void c(z zVar) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(zVar.f());
        if (g()) {
            C3725u2.a().f(this.f29874d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        a(D5.BN_CALLBACK_PRESENT_SCREEN, objArr, zVar.n());
    }

    @Override // com.ironsource.InterfaceC3685rd
    public void e(z zVar) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(zVar.f());
        if (g()) {
            C3725u2.a().e(this.f29874d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        a(D5.BN_CALLBACK_DISMISS_SCREEN, objArr, zVar.n());
    }

    public void g(z zVar) {
        for (z zVar2 : this.f30130r) {
            if (!zVar2.equals(zVar)) {
                zVar2.q();
            }
        }
    }

    public y(L7 l10, K7 k10, List<NetworkSettings> list, k kVar, HashSet<ImpressionDataListener> hashSet, C3450ea c3450ea) {
        super(hashSet, c3450ea);
        this.f30122j = i.NONE;
        this.f30133u = "";
        this.C = new Object();
        this.E = false;
        c cVar = new c();
        this.G = cVar;
        P8 p8S = l10.s();
        this.f30117e = p8S;
        this.f30118f = k10.h();
        this.f30119g = l10.w();
        this.f30120h = k10.x();
        long time = new Date().getTime();
        a(D5.BN_MANAGER_INIT_STARTED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, IronSourceConstants.PROG_BN_MANAGER_NAME}});
        IronLog.INTERNAL.verbose("isAuctionEnabled = " + kVar.j());
        this.f30121i = kVar;
        this.f30129q = new ConcurrentHashMap<>();
        this.f30130r = new CopyOnWriteArrayList<>();
        this.f30138z = new ConcurrentHashMap<>();
        this.A = new ConcurrentHashMap<>();
        IronSource.a aVar = IronSource.a.BANNER;
        this.f30128p = p8S.a(aVar);
        n.a().a(aVar, this.f30121i.d());
        if (this.f30121i.j()) {
            this.f30135w = new com.ironsource.mediationsdk.e(aVar, this.f30121i.b(), this);
        }
        this.f30137y = new com.ironsource.mediationsdk.h(list, this.f30121i.b().c());
        a(list, kVar);
        this.B = new Date().getTime();
        a(i.READY_TO_LOAD);
        this.F = kVar.g();
        this.f30123k = new C3785xb(cVar, com.ironsource.lifecycle.b.d(), new Vf());
        a(D5.BN_MANAGER_INIT_ENDED, new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - time)}});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(i iVar) {
        IronLog.INTERNAL.verbose("from '" + this.f30122j + "' to '" + iVar + "'");
        synchronized (this.C) {
            this.f30122j = iVar;
        }
    }

    public void a(q qVar, C3497h3 c3497h3) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        IronSource.a aVar = IronSource.a.BANNER;
        a(aVar);
        f();
        if (a(i.READY_TO_LOAD, i.STARTED_LOADING)) {
            if (!n.a().b(aVar)) {
                l.a(qVar, c3497h3, new a(c3497h3, qVar));
                return;
            } else {
                ironLog.verbose("can't load banner - already has pending invocation");
                return;
            }
        }
        IronLog.API.error("can't load banner - loadBanner already called and still in progress");
    }

    @Override // com.ironsource.InterfaceC3685rd
    public void b(z zVar) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(zVar.f());
        if (g()) {
            C3725u2.a().c(this.f29874d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        a(D5.BN_CALLBACK_LEAVE_APP, objArr, zVar.n());
    }

    public void a(q qVar) {
        IronLog.INTERNAL.verbose();
        l.a(qVar, new b(qVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map<String, Object> map, List<String> list, StringBuilder sb2, List<CallableC3777x3> list2) {
        if (this.f30119g.c(ContextProvider.getInstance().getApplicationContext(), this.f30125m, IronSource.a.BANNER)) {
            return;
        }
        for (z zVar : this.f30129q.values()) {
            AdData adDataCreateAdDataForNetworkAdapter = AdData.createAdDataForNetworkAdapter(zVar.f29515d, IronSource.a.BANNER, null, this.f30124l);
            if (zVar.p()) {
                list2.add(new CallableC3777x3(zVar.g(), zVar.c(), adDataCreateAdDataForNetworkAdapter, zVar, null, null));
            } else if (!zVar.p()) {
                list.add(zVar.c());
                sb2.append(zVar.g() + zVar.c() + StringUtils.COMMA);
            }
        }
    }

    @Override // com.ironsource.S1
    public void a(List<C3605n2> list, String str, C3605n2 c3605n2, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        i iVar;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("auctionId = " + str);
        if (r()) {
            this.f30133u = "";
            this.f30131s = str;
            this.f30134v = i10;
            this.f30136x = c3605n2;
            this.f30132t = jSONObject;
            if (!TextUtils.isEmpty(str2)) {
                a(D5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i11)}, new Object[]{"reason", str2}});
            }
            IronSource.a aVar = IronSource.a.BANNER;
            a(jSONObject2, aVar);
            if (this.f29872b.a(aVar)) {
                a(D5.BN_AD_UNIT_CAPPED, new Object[][]{new Object[]{"auctionId", str}});
                i iVar2 = this.f30122j;
                a(i.READY_TO_LOAD);
                if (iVar2 == i.FIRST_AUCTION) {
                    n.a().b(aVar, new IronSourceError(IronSourceError.ERROR_AD_FORMAT_CAPPED, "Ad unit is capped"));
                    return;
                }
                return;
            }
            a(D5.BN_AUCTION_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(j10)}});
            if (this.f30122j == i.FIRST_AUCTION) {
                iVar = i.LOADING;
            } else {
                iVar = i.RELOADING;
            }
            a(iVar);
            a(D5.BN_AUCTION_RESPONSE_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, a(list)}});
            t();
            return;
        }
        ironLog.warning("wrong state - mCurrentState = " + this.f30122j);
    }

    private void b(z zVar, View view, FrameLayout.LayoutParams layoutParams) {
        if (this.f30124l != null) {
            zVar.E();
            l.a(this.f30124l, view, layoutParams, new g(zVar));
        }
    }

    private String b(C3605n2 c3605n2) {
        z zVar = this.f30129q.get(c3605n2.c());
        String str = "1";
        if (zVar == null ? !TextUtils.isEmpty(c3605n2.k()) : zVar.p()) {
            str = "2";
        }
        return str + c3605n2.c();
    }

    private boolean b(D5 d10) {
        return d10 == D5.BN_CALLBACK_RELOAD_ERROR || d10 == D5.BN_CALLBACK_LOAD_SUCCESS || d10 == D5.BN_CALLBACK_LOAD_ERROR || d10 == D5.BN_CALLBACK_RELOAD_SUCCESS || d10 == D5.BN_CALLBACK_SHOW || d10 == D5.BN_CALLBACK_CLICK || d10 == D5.BN_CALLBACK_LEAVE_APP || d10 == D5.BN_AUCTION_FAILED || d10 == D5.BN_AUCTION_SUCCESS || d10 == D5.BN_AD_UNIT_CAPPED;
    }

    @Override // com.ironsource.S1
    public void a(int i10, String str, int i11, String str2, long j10) {
        i iVar;
        String str3 = "Auction failed (error " + i10 + " - " + str + ")";
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(str3);
        IronSourceUtils.i("BN: " + str3);
        if (r()) {
            this.f30133u = str2;
            this.f30134v = i11;
            this.f30132t = null;
            if (this.f30121i.b().n()) {
                ironLog.verbose("Moving to fallback waterfall");
                x();
            }
            a(D5.BN_AUCTION_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(j10)}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{"reason", str}});
            if (this.f30122j == i.FIRST_AUCTION) {
                iVar = i.LOADING;
            } else {
                iVar = i.RELOADING;
            }
            a(iVar);
            t();
            return;
        }
        ironLog.warning("wrong state - mCurrentState = " + this.f30122j);
    }

    @Override // com.ironsource.InterfaceC3685rd
    public void a(z zVar, View view, FrameLayout.LayoutParams layoutParams) {
        Object[][] objArr;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash = " + zVar.f());
        if (zVar.x() != this.f30131s) {
            ironLog.error("invoked with auctionId: " + zVar.x() + " and the current id is " + this.f30131s);
            zVar.a(D5.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 2}, new Object[]{"reason", "Wrong auction id " + zVar.x() + " State - " + this.f30122j}, new Object[]{IronSourceConstants.EVENTS_EXT1, zVar.c()}});
            return;
        }
        if (s()) {
            z zVar2 = this.f30127o;
            if (zVar2 != null) {
                zVar2.q();
            }
            g(zVar);
            this.f30127o = zVar;
            b(zVar, view, layoutParams);
            this.A.put(zVar.c(), com.ironsource.mediationsdk.h.a.ISAuctionPerformanceShowedSuccessfully);
            if (this.f30121i.j()) {
                C3605n2 c3605n2 = this.f30138z.get(zVar.c());
                if (c3605n2 != null) {
                    a(c3605n2.a(l()), c3605n2.d());
                    this.f30135w.a(c3605n2, zVar.g(), this.f30136x);
                    this.f30135w.a(this.f30130r, this.f30138z, zVar.g(), this.f30136x, c3605n2);
                    if (!this.f30121i.b().r()) {
                        a(zVar, c3605n2);
                    }
                } else {
                    String strC = zVar.c();
                    ironLog.error("onLoadSuccess winner instance " + strC + " missing from waterfall. auctionId = " + this.f30131s);
                    a(D5.TROUBLESHOOTING_BN_NOTIFICATIONS_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}, new Object[]{"reason", "Loaded missing"}, new Object[]{IronSourceConstants.EVENTS_EXT1, strC}});
                }
            }
            if (this.f30122j == i.LOADING) {
                if (g()) {
                    C3725u2.a().d(this.f29874d);
                    objArr = new Object[][]{new Object[]{"duration", Long.valueOf(C3570l5.a(this.D))}};
                } else {
                    objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}, new Object[]{"duration", Long.valueOf(C3570l5.a(this.D))}};
                }
                a(D5.BN_CALLBACK_LOAD_SUCCESS, objArr);
            } else {
                if (g()) {
                    C3725u2.a().d(this.f29874d);
                }
                IronSourceUtils.i("bannerReloadSucceeded");
                a(D5.BN_CALLBACK_RELOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(C3570l5.a(this.D))}});
            }
            n();
            this.f30118f.b(IronSource.a.BANNER);
            a(i.LOADED);
            this.f30123k.a(TimeUnit.SECONDS.toMillis(this.f30121i.f()));
            return;
        }
        ironLog.warning("wrong state - mCurrentState = " + this.f30122j);
    }

    @Override // com.ironsource.InterfaceC3685rd
    public void a(IronSourceError ironSourceError, z zVar, boolean z10) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("error = " + ironSourceError);
        if (zVar.x() != this.f30131s) {
            ironLog.error("invoked with auctionId: " + zVar.x() + " and the current id is " + this.f30131s);
            zVar.a(D5.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 3}, new Object[]{"reason", "Wrong auction " + zVar.x() + " State - " + this.f30122j}, new Object[]{IronSourceConstants.EVENTS_EXT1, zVar.c()}});
            return;
        }
        if (s()) {
            this.A.put(zVar.c(), com.ironsource.mediationsdk.h.a.ISAuctionPerformanceFailedToLoad);
            t();
        } else {
            ironLog.warning("wrong state - mCurrentState = " + this.f30122j);
        }
    }

    @Override // com.ironsource.InterfaceC3685rd
    public void a(z zVar) {
        C3605n2 c3605n2;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(zVar.f());
        if (q()) {
            if (this.f30121i.j() && this.f30121i.b().r() && (c3605n2 = this.f30138z.get(zVar.c())) != null) {
                a(zVar, c3605n2);
            }
            a(D5.BN_CALLBACK_SHOW);
            return;
        }
        ironLog.warning("wrong state - mCurrentState = " + this.f30122j);
        String strC = zVar.c();
        a(D5.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1}, new Object[]{"reason", "Wrong State - " + this.f30122j}, new Object[]{IronSourceConstants.EVENTS_EXT1, strC}});
    }

    private void a(z zVar, C3605n2 c3605n2) {
        this.f30135w.a(c3605n2, zVar.g(), this.f30136x, l());
        a(this.f30138z.get(zVar.c()), l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, StringBuilder sb2, List<CallableC3777x3> list2) {
        if (list2.isEmpty()) {
            a(map, list, sb2);
            return;
        }
        A3 a10 = new A3();
        e eVar = new e(map, sb2, list);
        a(D5.BN_COLLECT_TOKENS);
        a10.a(list2, eVar, this.F, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, StringBuilder sb2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("auction waterfallString = " + ((Object) sb2));
        if (map.size() == 0 && list.size() == 0) {
            a(D5.BN_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{"duration", 0}});
            if (a(i.AUCTION, i.LOADED)) {
                this.f30123k.a(TimeUnit.SECONDS.toMillis(this.f30121i.f()));
                return;
            }
            n.a().b(IronSource.a.BANNER, new IronSourceError(1005, "No candidates available for auctioning"));
            a(D5.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}});
            a(i.READY_TO_LOAD);
            return;
        }
        a(D5.BN_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb2.toString()}});
        com.ironsource.mediationsdk.e eVar = this.f30135w;
        if (eVar != null) {
            eVar.a(ContextProvider.getInstance().getApplicationContext(), map, list, this.f30137y, this.f30128p, this.f29873c, j());
        } else {
            ironLog.error("mAuctionHandler is null");
        }
    }

    private void a(List<NetworkSettings> list, k kVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<NetworkSettings> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new f(it.next()));
        }
        IronSourceThreadManager.INSTANCE.executeTasks(kVar.c().l(), kVar.c().n(), arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(NetworkSettings networkSettings) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(String.format("Start initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName()));
        AbstractAdapter abstractAdapterA = com.ironsource.mediationsdk.c.b().a(networkSettings, networkSettings.getBannerSettings(), false);
        if (abstractAdapterA != null) {
            z zVar = new z(this.f30121i, this, networkSettings, abstractAdapterA, this.f30128p, p());
            this.f30129q.put(zVar.c(), zVar);
        } else {
            ironLog.verbose(networkSettings.getProviderInstanceName() + " can't load adapter");
        }
        ironLog.verbose(String.format("Done initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName()));
    }

    private String a(List<C3605n2> list) {
        IronLog.INTERNAL.verbose("waterfall.size() = " + list.size());
        this.f30130r.clear();
        this.f30138z.clear();
        this.A.clear();
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            C3605n2 c3605n2 = list.get(i10);
            a(c3605n2);
            sb2.append(b(c3605n2));
            if (i10 != list.size() - 1) {
                sb2.append(StringUtils.COMMA);
            }
        }
        IronLog.INTERNAL.verbose("updateWaterfall() - next waterfall is " + sb2.toString());
        return sb2.toString();
    }

    private void a(C3605n2 c3605n2) {
        z zVar = this.f30129q.get(c3605n2.c());
        if (zVar != null) {
            AbstractAdapter abstractAdapterA = com.ironsource.mediationsdk.c.b().a(zVar.f29513b.h());
            if (abstractAdapterA != null) {
                z zVar2 = new z(this.f30121i, this, zVar.f29513b.h(), abstractAdapterA, this.f30128p, this.f30131s, this.f30132t, this.f30134v, this.f30133u, p());
                zVar2.a(true);
                this.f30130r.add(zVar2);
                this.f30138z.put(zVar2.c(), c3605n2);
                this.A.put(c3605n2.c(), com.ironsource.mediationsdk.h.a.ISAuctionPerformanceDidntAttemptToLoad);
                return;
            }
            return;
        }
        IronLog.INTERNAL.error("could not find matching smash for auction response item - item = " + c3605n2.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(D5 d10) {
        a(d10, (Object[][]) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(D5 d10, Object[][] objArr) {
        a(d10, objArr, this.f30128p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(D5 d10, Object[][] objArr, int i10) {
        JSONObject jSONObjectA = IronSourceUtils.a(false, true, 1);
        try {
            ISBannerSize iSBannerSizeK = k();
            if (iSBannerSizeK != null) {
                a(jSONObjectA, iSBannerSizeK);
            }
            if (this.f30125m != null) {
                jSONObjectA.put("placement", l());
            }
            jSONObjectA.put("sessionDepth", i10);
            if (!TextUtils.isEmpty(this.f30131s)) {
                jSONObjectA.put("auctionId", this.f30131s);
            }
            JSONObject jSONObject = this.f30132t;
            if (jSONObject != null && jSONObject.length() > 0) {
                jSONObjectA.put("genericParams", this.f30132t);
            }
            if (b(d10)) {
                jSONObjectA.put("auctionTrials", this.f30134v);
                if (!TextUtils.isEmpty(this.f30133u)) {
                    jSONObjectA.put(IronSourceConstants.AUCTION_FALLBACK, this.f30133u);
                }
            }
            if (objArr != null) {
                for (Object[] objArr2 : objArr) {
                    jSONObjectA.put(objArr2[0].toString(), objArr2[1]);
                }
            }
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(Log.getStackTraceString(e10));
        }
        J9.i().a(new C5(d10, jSONObjectA));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static void a(JSONObject jSONObject, ISBannerSize iSBannerSize) {
        try {
            String description = iSBannerSize.getDescription();
            byte b10 = -1;
            switch (description.hashCode()) {
                case -387072689:
                    if (description.equals(l.f29840c)) {
                        b10 = 2;
                    }
                    break;
                case 72205083:
                    if (description.equals(l.f29839b)) {
                        b10 = 1;
                    }
                    break;
                case 79011241:
                    if (description.equals(l.f29842e)) {
                        b10 = 3;
                    }
                    break;
                case 1951953708:
                    if (description.equals("BANNER")) {
                        b10 = 0;
                    }
                    break;
                case 1999208305:
                    if (description.equals("CUSTOM")) {
                        b10 = 4;
                    }
                    break;
            }
            if (b10 == 0) {
                jSONObject.put(l.f29845h, 1);
            } else if (b10 == 1) {
                jSONObject.put(l.f29845h, 2);
            } else if (b10 == 2) {
                jSONObject.put(l.f29845h, 3);
            } else if (b10 == 3) {
                jSONObject.put(l.f29845h, 5);
            } else if (b10 == 4) {
                jSONObject.put(l.f29845h, 6);
                jSONObject.put("custom_banner_size", iSBannerSize.getWidth() + VastAttributes.HORIZONTAL_POSITION + iSBannerSize.getHeight());
            }
            if (iSBannerSize.isAdaptive()) {
                boolean zHas = jSONObject.has(IronSourceConstants.EVENTS_EXT1);
                String str = l.f29854q;
                if (zHas) {
                    str = jSONObject.optString(IronSourceConstants.EVENTS_EXT1) + " , " + l.f29854q;
                }
                jSONObject.put(IronSourceConstants.EVENTS_EXT1, str);
            }
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(Log.getStackTraceString(e10));
        }
    }
}
