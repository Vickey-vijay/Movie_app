package com.applovin.impl.mediation;

import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.a3;
import com.applovin.impl.d6;
import com.applovin.impl.i5;
import com.applovin.impl.n7;
import com.applovin.impl.p5;
import com.applovin.impl.r3;
import com.applovin.impl.s3;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.impl.t3;
import com.applovin.impl.u3;
import com.applovin.impl.v5;
import com.applovin.impl.x4;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes11.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f8210b = new HashMap(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f8211c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f8212d = new HashMap(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f8213e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f8214f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f8215g = new Object();

    public class a implements p5.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f8216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f8217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f8218c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a3 f8219d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Context f8220e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ com.applovin.impl.mediation.ads.a.InterfaceC0040a f8221f;

        public a(long j10, Map map, String str, a3 a3Var, Context context, com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
            this.f8216a = j10;
            this.f8217b = map;
            this.f8218c = str;
            this.f8219d = a3Var;
            this.f8220e = context;
            this.f8221f = interfaceC0040a;
        }

        @Override // com.applovin.impl.p5.b
        public void a(JSONArray jSONArray) {
            this.f8217b.put("sct_ms", Long.valueOf(SystemClock.elapsedRealtime() - this.f8216a));
            this.f8217b.put("calfc", Integer.valueOf(d.this.b(this.f8218c)));
            v5 v5Var = new v5(this.f8219d, jSONArray, this.f8220e, d.this.f8209a, this.f8221f);
            if (((Boolean) d.this.f8209a.a(r3.f8947o8)).booleanValue()) {
                d.this.f8209a.q0().a((i5) v5Var, d6.b.MEDIATION);
            } else {
                d.this.f8209a.q0().a(v5Var);
            }
        }
    }

    public static class b implements com.applovin.impl.mediation.ads.a.InterfaceC0040a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f8223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference f8224b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d f8225c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final c f8226d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final MaxAdFormat f8227e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Map f8228f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Map f8229g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Map f8230h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f8231i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f8232j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f8233k;

        public /* synthetic */ b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j10, long j11, d dVar, com.applovin.impl.sdk.k kVar, Context context, a aVar) {
            this(map, map2, map3, cVar, maxAdFormat, j10, j11, dVar, kVar, context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i10, String str) {
            this.f8229g.put("retry_delay_sec", Integer.valueOf(i10));
            this.f8229g.put("retry_attempt", Integer.valueOf(this.f8226d.f8236c));
            Context contextO = (Context) this.f8224b.get();
            if (contextO == null) {
                contextO = com.applovin.impl.sdk.k.o();
            }
            this.f8230h.put("art", com.applovin.impl.i.EXPONENTIAL_RETRY.b());
            this.f8230h.put("era", Integer.valueOf(this.f8226d.f8236c));
            this.f8233k = System.currentTimeMillis();
            this.f8225c.a(str, this.f8227e, this.f8228f, this.f8229g, this.f8230h, contextO, this);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            y2 y2Var = (y2) maxAd;
            y2Var.i(this.f8226d.f8234a);
            y2Var.a(SystemClock.elapsedRealtime() - this.f8232j);
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) y2Var.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f8223a.X().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, null, this.f8233k, y2Var.getRequestLatencyMillis());
            }
            this.f8225c.a(maxAd.getAdUnitId());
            this.f8226d.f8236c = 0;
            if (this.f8226d.f8237d == null) {
                this.f8225c.a(y2Var);
                this.f8226d.f8235b.set(false);
                return;
            }
            y2Var.A().c().a(this.f8226d.f8237d);
            this.f8226d.f8237d.onAdLoaded(y2Var);
            if (y2Var.O().endsWith("load")) {
                this.f8226d.f8237d.onAdRevenuePaid(y2Var);
            }
            this.f8226d.f8237d = null;
            if (((Boolean) this.f8223a.a(r3.f8935f8)).booleanValue() || !this.f8225c.a(maxAd)) {
                this.f8226d.f8235b.set(false);
                return;
            }
            Context contextO = (Context) this.f8224b.get();
            if (contextO == null) {
                contextO = com.applovin.impl.sdk.k.o();
            }
            this.f8232j = SystemClock.elapsedRealtime();
            this.f8233k = System.currentTimeMillis();
            this.f8230h.put("art", com.applovin.impl.i.SEQUENTIAL_OR_PRECACHE.b());
            this.f8225c.a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f8228f, this.f8229g, this.f8230h, contextO, this);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        private b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j10, long j11, d dVar, com.applovin.impl.sdk.k kVar, Context context) {
            this.f8223a = kVar;
            this.f8224b = new WeakReference(context);
            this.f8225c = dVar;
            this.f8226d = cVar;
            this.f8227e = maxAdFormat;
            this.f8229g = map2;
            this.f8228f = map;
            this.f8230h = map3;
            this.f8232j = j10;
            this.f8233k = j11;
            if (CollectionUtils.getBoolean(map2, "disable_auto_retries")) {
                this.f8231i = -1;
            } else if (maxAdFormat.isAdViewAd() && CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) {
                this.f8231i = Math.min(2, ((Integer) kVar.a(r3.f8937h8)).intValue());
            } else {
                this.f8231i = ((Integer) kVar.a(r3.f8937h8)).intValue();
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            throw new IllegalStateException("Wrong callback invoked for ad: " + maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final String str, MaxError maxError) {
            this.f8225c.c(str);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f8232j;
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) maxError.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f8223a.X().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, maxError, this.f8233k, jElapsedRealtime);
            }
            boolean z10 = maxError.getCode() == -5603 && n7.c(this.f8223a) && ((Boolean) this.f8223a.a(x4.A6)).booleanValue();
            if (this.f8223a.a(r3.f8938i8, this.f8227e) && this.f8226d.f8236c < this.f8231i && !z10) {
                c.e(this.f8226d);
                final int iPow = (int) Math.pow(2.0d, this.f8226d.f8236c);
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8455b.a(iPow, str);
                    }
                }, TimeUnit.SECONDS.toMillis(iPow));
                return;
            }
            this.f8226d.f8236c = 0;
            this.f8226d.f8235b.set(false);
            if (this.f8226d.f8237d != null) {
                MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxError;
                maxErrorImpl.setLoadTag(this.f8226d.f8234a);
                maxErrorImpl.setRequestLatencyMillis(jElapsedRealtime);
                t2.a(this.f8226d.f8237d, str, maxError);
                this.f8226d.f8237d = null;
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f8234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f8235b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f8236c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile com.applovin.impl.mediation.ads.a.InterfaceC0040a f8237d;

        public /* synthetic */ c(String str, a aVar) {
            this(str);
        }

        private c(String str) {
            this.f8235b = new AtomicBoolean();
            this.f8234a = str;
        }

        public static /* synthetic */ int e(c cVar) {
            int i10 = cVar.f8236c;
            cVar.f8236c = i10 + 1;
            return i10;
        }
    }

    public void c(String str, String str2) {
        synchronized (this.f8211c) {
            this.f8210b.remove(b(str, str2));
        }
    }

    private String b(String str, String str2) {
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        if (str2 != null) {
            str3 = "-" + str2;
        } else {
            str3 = "";
        }
        sb2.append(str3);
        return sb2.toString();
    }

    private y2 e(String str) {
        y2 y2Var;
        synchronized (this.f8213e) {
            y2Var = (y2) this.f8212d.get(str);
            this.f8212d.remove(str);
        }
        return y2Var;
    }

    public boolean d(String str) {
        boolean z10;
        synchronized (this.f8213e) {
            z10 = this.f8212d.get(str) != null;
        }
        return z10;
    }

    public d(com.applovin.impl.sdk.k kVar) {
        this.f8209a = kVar;
    }

    public int b(String str) {
        int iIntValue;
        synchronized (this.f8215g) {
            Integer num = (Integer) this.f8214f.get(str);
            iIntValue = num != null ? num.intValue() : 0;
        }
        return iIntValue;
    }

    public void a(String str, String str2, MaxAdFormat maxAdFormat, com.applovin.impl.i iVar, Map map, Map map2, Context context, com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
        y2 y2VarE = (this.f8209a.s0().d() || n7.h(com.applovin.impl.sdk.k.o())) ? null : e(str);
        if (y2VarE != null) {
            y2VarE.i(str2);
            y2VarE.A().c().a(interfaceC0040a);
            interfaceC0040a.onAdLoaded(y2VarE);
            if (y2VarE.O().endsWith("load")) {
                interfaceC0040a.onAdRevenuePaid(y2VarE);
            }
            if (((Boolean) this.f8209a.a(r3.f8935f8)).booleanValue() && a((MaxAd) y2VarE)) {
                return;
            }
        }
        c cVarA = a(str, str2);
        if (!cVarA.f8235b.compareAndSet(false, true)) {
            if (cVarA.f8237d != null && cVarA.f8237d != interfaceC0040a) {
                com.applovin.impl.sdk.o.j("MediationAdLoadManager", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
            }
            cVarA.f8237d = interfaceC0040a;
            return;
        }
        if (y2VarE == null) {
            cVarA.f8237d = interfaceC0040a;
        }
        Map mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
        mapSynchronizedMap.put("art", iVar.b());
        if (StringUtils.isValidString(str2)) {
            mapSynchronizedMap.put("alt", str2);
        }
        a(str, maxAdFormat, map, map2, mapSynchronizedMap, context, new b(map, map2, mapSynchronizedMap, cVarA, maxAdFormat, SystemClock.elapsedRealtime(), System.currentTimeMillis(), this, this.f8209a, context, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        synchronized (this.f8215g) {
            this.f8209a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8209a.O().a("MediationAdLoadManager", "Incrementing ad load failures count for ad unit ID: " + str);
            }
            Integer num = (Integer) this.f8214f.get(str);
            if (num == null) {
                num = 0;
            }
            this.f8214f.put(str, Integer.valueOf(num.intValue() + 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, Context context, com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        a3 a3Var = new a3(str, maxAdFormat, map, map2, map3, a(str, maxAdFormat));
        this.f8209a.q0().a((i5) new p5(a3Var, context, this.f8209a, new a(jElapsedRealtime, map3, str, a3Var, context, interfaceC0040a)), d6.b.MEDIATION);
    }

    private com.applovin.impl.h a(String str, MaxAdFormat maxAdFormat) {
        if (((Boolean) this.f8209a.a(x4.M4)).booleanValue()) {
            u3 u3VarY = this.f8209a.Y();
            s3 s3Var = s3.f9012e;
            Map mapA = u3VarY.a(s3Var, t3.a(str));
            s3.a aVar = s3.a.SESSION;
            int iA = a(mapA, aVar);
            s3.a aVar2 = s3.a.INSTALL;
            int iA2 = a(mapA, aVar2);
            Map mapA2 = this.f8209a.Y().a(s3Var, t3.a(maxAdFormat));
            return new com.applovin.impl.h(iA, iA2, a(mapA2, aVar), a(mapA2, aVar2));
        }
        return new com.applovin.impl.h(-1, -1, -1, -1);
    }

    private int a(Map map, s3.a aVar) {
        Long l10;
        if (map == null || (l10 = (Long) map.get(aVar.b())) == null) {
            return -1;
        }
        return l10.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(y2 y2Var) {
        synchronized (this.f8213e) {
            if (this.f8212d.containsKey(y2Var.getAdUnitId())) {
                com.applovin.impl.sdk.o.h("AppLovinSdk", "Ad in cache already: " + y2Var.getAdUnitId());
            }
            this.f8212d.put(y2Var.getAdUnitId(), y2Var);
        }
    }

    private c a(String str, String str2) {
        c cVar;
        synchronized (this.f8211c) {
            String strB = b(str, str2);
            cVar = (c) this.f8210b.get(strB);
            if (cVar == null) {
                cVar = new c(str2, null);
                this.f8210b.put(strB, cVar);
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.f8215g) {
            this.f8209a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8209a.O().a("MediationAdLoadManager", "Clearing ad load failures count for ad unit ID: " + str);
            }
            this.f8214f.remove(str);
        }
    }

    public boolean a(MaxAd maxAd) {
        return ((!this.f8209a.c(r3.f8933d8).contains(maxAd.getAdUnitId()) && !this.f8209a.a(r3.f8932c8, maxAd.getFormat())) || this.f8209a.s0().c() || this.f8209a.s0().d()) ? false : true;
    }
}
