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
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes9.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f8283b = new HashMap(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f8284c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f8285d = new HashMap(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f8286e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f8287f = Collections.synchronizedMap(new HashMap(4));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f8288g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f8289h = new Object();

    public class a implements p5.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f8290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f8291b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f8292c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a3 f8293d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Context f8294e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ com.applovin.impl.mediation.ads.a.InterfaceC0040a f8295f;

        public a(long j10, Map map, String str, a3 a3Var, Context context, com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
            this.f8290a = j10;
            this.f8291b = map;
            this.f8292c = str;
            this.f8293d = a3Var;
            this.f8294e = context;
            this.f8295f = interfaceC0040a;
        }

        @Override // com.applovin.impl.p5.b
        public void a(JSONArray jSONArray) {
            this.f8291b.put("sct_ms", Long.valueOf(SystemClock.elapsedRealtime() - this.f8290a));
            this.f8291b.put("calfc", Integer.valueOf(e.this.b(this.f8292c)));
            v5 v5Var = new v5(this.f8293d, jSONArray, this.f8294e, e.this.f8282a, this.f8295f);
            if (((Boolean) e.this.f8282a.a(r3.f8947o8)).booleanValue()) {
                e.this.f8282a.q0().a((i5) v5Var, d6.b.MEDIATION);
            } else {
                e.this.f8282a.q0().a(v5Var);
            }
        }
    }

    public static class b implements com.applovin.impl.mediation.ads.a.InterfaceC0040a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f8297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference f8298b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e f8299c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final c f8300d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final MaxAdFormat f8301e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Map f8302f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Map f8303g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Map f8304h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f8305i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f8306j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f8307k;

        public /* synthetic */ b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j10, long j11, e eVar, com.applovin.impl.sdk.k kVar, Context context, a aVar) {
            this(map, map2, map3, cVar, maxAdFormat, j10, j11, eVar, kVar, context);
        }

        private void a(MaxAd maxAd) {
            Context contextO = (Context) this.f8298b.get();
            if (contextO == null) {
                contextO = com.applovin.impl.sdk.k.o();
            }
            this.f8306j = SystemClock.elapsedRealtime();
            this.f8307k = System.currentTimeMillis();
            this.f8304h.put("art", com.applovin.impl.i.SEQUENTIAL_OR_PRECACHE.b());
            this.f8299c.a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f8302f, this.f8303g, this.f8304h, contextO, this);
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
            int sizeSafely;
            y2 y2Var = (y2) maxAd;
            y2Var.i(this.f8300d.f8308a);
            y2Var.a(SystemClock.elapsedRealtime() - this.f8306j);
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) y2Var.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f8297a.X().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, null, this.f8307k, y2Var.getRequestLatencyMillis());
            }
            this.f8299c.a(maxAd.getAdUnitId());
            this.f8300d.f8310c = 0;
            if (this.f8300d.f8311d == null) {
                this.f8299c.a(y2Var);
                this.f8300d.f8309b.set(false);
                int iL = y2Var.L();
                synchronized (this.f8299c.f8286e) {
                    sizeSafely = CollectionUtils.getSizeSafely((Queue) this.f8299c.f8285d.get(maxAd.getAdUnitId()));
                }
                if (sizeSafely < iL) {
                    int i10 = sizeSafely + 1;
                    this.f8297a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f8297a.O().a("MediationAdLoadManagerV2", "Preloading waterfall " + i10 + " of " + iL);
                    }
                    a(maxAd);
                    return;
                }
                return;
            }
            y2Var.A().c().a(this.f8300d.f8311d);
            this.f8300d.f8311d.onAdLoaded(y2Var);
            this.f8299c.f8287f.put(maxAd.getAdUnitId(), y2Var);
            if (y2Var.O().endsWith("load")) {
                this.f8300d.f8311d.onAdRevenuePaid(y2Var);
            }
            this.f8300d.f8311d = null;
            if ((!this.f8297a.c(r3.f8933d8).contains(maxAd.getAdUnitId()) && !this.f8297a.a(r3.f8932c8, maxAd.getFormat())) || this.f8297a.s0().c() || this.f8297a.s0().d()) {
                this.f8300d.f8309b.set(false);
                return;
            }
            int iL2 = y2Var.L();
            this.f8297a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8297a.O().a("MediationAdLoadManagerV2", "Preloading waterfall 1 of " + iL2);
            }
            a(maxAd);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        private b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j10, long j11, e eVar, com.applovin.impl.sdk.k kVar, Context context) {
            this.f8297a = kVar;
            this.f8298b = new WeakReference(context);
            this.f8299c = eVar;
            this.f8300d = cVar;
            this.f8301e = maxAdFormat;
            this.f8303g = map2;
            this.f8302f = map;
            this.f8304h = map3;
            this.f8306j = j10;
            this.f8307k = j11;
            if (CollectionUtils.getBoolean(map2, "disable_auto_retries")) {
                this.f8305i = -1;
            } else if (maxAdFormat.isAdViewAd() && CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) {
                this.f8305i = Math.min(2, ((Integer) kVar.a(r3.f8937h8)).intValue());
            } else {
                this.f8305i = ((Integer) kVar.a(r3.f8937h8)).intValue();
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            throw new IllegalStateException("Wrong callback invoked for ad: " + maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final String str, MaxError maxError) {
            this.f8299c.d(str);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f8306j;
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) maxError.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f8297a.X().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, maxError, this.f8307k, jElapsedRealtime);
            }
            boolean z10 = maxError.getCode() == -5603 && n7.c(this.f8297a) && ((Boolean) this.f8297a.a(x4.A6)).booleanValue();
            if (this.f8297a.a(r3.f8938i8, this.f8301e) && this.f8300d.f8310c < this.f8305i && !z10) {
                c.e(this.f8300d);
                final int iPow = (int) Math.pow(2.0d, this.f8300d.f8310c);
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8460b.a(iPow, str);
                    }
                }, TimeUnit.SECONDS.toMillis(iPow));
                return;
            }
            this.f8300d.f8310c = 0;
            this.f8300d.f8309b.set(false);
            if (this.f8300d.f8311d != null) {
                MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxError;
                maxErrorImpl.setLoadTag(this.f8300d.f8308a);
                maxErrorImpl.setRequestLatencyMillis(jElapsedRealtime);
                t2.a(this.f8300d.f8311d, str, maxError);
                this.f8300d.f8311d = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i10, String str) {
            this.f8303g.put("retry_delay_sec", Integer.valueOf(i10));
            this.f8303g.put("retry_attempt", Integer.valueOf(this.f8300d.f8310c));
            Context contextO = (Context) this.f8298b.get();
            if (contextO == null) {
                contextO = com.applovin.impl.sdk.k.o();
            }
            this.f8304h.put("art", com.applovin.impl.i.EXPONENTIAL_RETRY.b());
            this.f8304h.put("era", Integer.valueOf(this.f8300d.f8310c));
            this.f8307k = System.currentTimeMillis();
            this.f8299c.a(str, this.f8301e, this.f8302f, this.f8303g, this.f8304h, contextO, this);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f8308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f8309b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f8310c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile com.applovin.impl.mediation.ads.a.InterfaceC0040a f8311d;

        public /* synthetic */ c(String str, a aVar) {
            this(str);
        }

        private c(String str) {
            this.f8309b = new AtomicBoolean();
            this.f8308a = str;
        }

        public static /* synthetic */ int e(c cVar) {
            int i10 = cVar.f8310c;
            cVar.f8310c = i10 + 1;
            return i10;
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

    private y2 f(String str) {
        synchronized (this.f8286e) {
            Queue queue = (Queue) this.f8285d.get(str);
            if (CollectionUtils.isEmpty(queue)) {
                return null;
            }
            return (y2) queue.poll();
        }
    }

    public Queue c(String str) {
        ArrayDeque arrayDeque = new ArrayDeque();
        y2 y2Var = (y2) this.f8287f.get(str);
        if (y2Var != null) {
            arrayDeque.add(y2Var);
        }
        synchronized (this.f8284c) {
            Queue queue = (Queue) this.f8285d.get(str);
            if (queue != null) {
                arrayDeque.addAll(queue);
            }
        }
        return arrayDeque;
    }

    public void d(String str) {
        synchronized (this.f8289h) {
            this.f8282a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8282a.O().a("MediationAdLoadManagerV2", "Incrementing ad load failures count for ad unit ID: " + str);
            }
            Integer num = (Integer) this.f8288g.get(str);
            if (num == null) {
                num = 0;
            }
            this.f8288g.put(str, Integer.valueOf(num.intValue() + 1));
        }
    }

    public boolean e(String str) {
        boolean z10;
        synchronized (this.f8286e) {
            z10 = !CollectionUtils.isEmpty((Queue) this.f8285d.get(str));
        }
        return z10;
    }

    public e(com.applovin.impl.sdk.k kVar) {
        this.f8282a = kVar;
    }

    public int b(String str) {
        int iIntValue;
        synchronized (this.f8289h) {
            Integer num = (Integer) this.f8288g.get(str);
            iIntValue = num != null ? num.intValue() : 0;
        }
        return iIntValue;
    }

    public void a(String str, String str2, MaxAdFormat maxAdFormat, com.applovin.impl.i iVar, Map map, Map map2, Context context, com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
        y2 y2VarF = (this.f8282a.s0().d() || n7.h(com.applovin.impl.sdk.k.o())) ? null : f(str);
        if (y2VarF != null) {
            y2VarF.i(str2);
            y2VarF.A().c().a(interfaceC0040a);
            interfaceC0040a.onAdLoaded(y2VarF);
            this.f8287f.put(str, y2VarF);
            if (y2VarF.O().endsWith("load")) {
                interfaceC0040a.onAdRevenuePaid(y2VarF);
            }
        }
        c cVarA = a(str, str2);
        if (!cVarA.f8309b.compareAndSet(false, true)) {
            if (cVarA.f8311d != null && cVarA.f8311d != interfaceC0040a) {
                com.applovin.impl.sdk.o.j("MediationAdLoadManagerV2", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
            }
            cVarA.f8311d = interfaceC0040a;
            return;
        }
        if (y2VarF == null) {
            cVarA.f8311d = interfaceC0040a;
        }
        Map mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
        mapSynchronizedMap.put("art", iVar.b());
        if (StringUtils.isValidString(str2)) {
            mapSynchronizedMap.put("alt", str2);
        }
        a(str, maxAdFormat, map, map2, mapSynchronizedMap, context, new b(map, map2, mapSynchronizedMap, cVarA, maxAdFormat, SystemClock.elapsedRealtime(), System.currentTimeMillis(), this, this.f8282a, context, null));
    }

    public void c(String str, String str2) {
        synchronized (this.f8284c) {
            this.f8283b.remove(b(str, str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, Context context, com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        a3 a3Var = new a3(str, maxAdFormat, map, map2, map3, a(str, maxAdFormat));
        this.f8282a.q0().a((i5) new p5(a3Var, context, this.f8282a, new a(jElapsedRealtime, map3, str, a3Var, context, interfaceC0040a)), d6.b.MEDIATION);
    }

    private com.applovin.impl.h a(String str, MaxAdFormat maxAdFormat) {
        if (((Boolean) this.f8282a.a(x4.M4)).booleanValue()) {
            u3 u3VarY = this.f8282a.Y();
            s3 s3Var = s3.f9012e;
            Map mapA = u3VarY.a(s3Var, t3.a(str));
            s3.a aVar = s3.a.SESSION;
            int iA = a(mapA, aVar);
            s3.a aVar2 = s3.a.INSTALL;
            int iA2 = a(mapA, aVar2);
            Map mapA2 = this.f8282a.Y().a(s3Var, t3.a(maxAdFormat));
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
        synchronized (this.f8286e) {
            Queue arrayDeque = (Queue) this.f8285d.get(y2Var.getAdUnitId());
            if (arrayDeque == null) {
                arrayDeque = new ArrayDeque();
                this.f8285d.put(y2Var.getAdUnitId(), arrayDeque);
            }
            arrayDeque.add(y2Var);
        }
    }

    private c a(String str, String str2) {
        c cVar;
        synchronized (this.f8284c) {
            String strB = b(str, str2);
            cVar = (c) this.f8283b.get(strB);
            if (cVar == null) {
                cVar = new c(str2, null);
                this.f8283b.put(strB, cVar);
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.f8289h) {
            this.f8282a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8282a.O().a("MediationAdLoadManagerV2", "Clearing ad load failures count for ad unit ID: " + str);
            }
            this.f8288g.remove(str);
        }
    }
}
