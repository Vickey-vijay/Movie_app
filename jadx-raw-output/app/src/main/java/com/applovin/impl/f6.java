package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.mediation.MaxAdWaterfallInfoImpl;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MaxNetworkResponseInfoImpl;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxErrorCode;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class f6 extends i5 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final AtomicBoolean f7483o = new AtomicBoolean();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a3 f7484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final JSONObject f7485h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f7486i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.applovin.impl.mediation.ads.a.InterfaceC0040a f7487j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final WeakReference f7488k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f7489l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f7490m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f7491n;

    public class b extends i5 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f7492g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f7493h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final y2 f7494i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final List f7495j;

        public class a extends i3 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MaxAdFormat f7497b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f7498c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a, MaxAdFormat maxAdFormat, String str) {
                super(interfaceC0040a);
                this.f7497b = maxAdFormat;
                this.f7498c = str;
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoaded(MaxAd maxAd) {
                b.this.b("loaded ad");
                long jElapsedRealtime = SystemClock.elapsedRealtime() - b.this.f7492g;
                com.applovin.impl.sdk.o unused = b.this.f7707c;
                if (com.applovin.impl.sdk.o.a()) {
                    b.this.f7707c.a(b.this.f7706b, "Ad loaded in " + jElapsedRealtime + "ms for " + this.f7497b.getLabel() + " ad unit " + this.f7498c);
                }
                y2 y2Var = (y2) maxAd;
                b.this.a(y2Var, MaxNetworkResponseInfo.AdLoadState.AD_LOADED, jElapsedRealtime, null);
                int i10 = b.this.f7493h;
                while (true) {
                    i10++;
                    if (i10 >= b.this.f7495j.size()) {
                        f6.this.b(y2Var);
                        return;
                    } else {
                        b bVar = b.this;
                        bVar.a((y2) bVar.f7495j.get(i10), MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1L, null);
                    }
                }
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoadFailed(String str, MaxError maxError) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - b.this.f7492g;
                com.applovin.impl.sdk.o unused = b.this.f7707c;
                if (com.applovin.impl.sdk.o.a()) {
                    b.this.f7707c.a(b.this.f7706b, "Ad failed to load in " + jElapsedRealtime + " ms for " + this.f7497b.getLabel() + " ad unit " + str + " with error: " + maxError);
                }
                b.this.b("failed to load ad: " + maxError.getCode());
                b bVar = b.this;
                bVar.a(bVar.f7494i, MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, jElapsedRealtime, maxError);
                if (b.this.f7493h < b.this.f7495j.size() - 1) {
                    b bVar2 = b.this;
                    b.this.f7705a.q0().a((i5) new b(bVar2.f7493h + 1, b.this.f7495j), d6.b.MEDIATION);
                } else {
                    f6.this.b(new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str) {
        }

        private b(int i10, List list) {
            super(f6.this.f7706b, f6.this.f7705a, f6.this.f7484g.b());
            this.f7492g = SystemClock.elapsedRealtime();
            this.f7493h = i10;
            this.f7494i = (y2) list.get(i10);
            this.f7495j = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            String strB = f6.this.f7484g.b();
            MaxAdFormat maxAdFormatA = f6.this.f7484g.a();
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.a(this.f7706b, "Loading ad " + (this.f7493h + 1) + " of " + this.f7495j.size() + " from " + this.f7494i.c() + " for " + maxAdFormatA.getLabel() + " ad unit " + strB);
            }
            b("started to load ad");
            Context context = (Context) f6.this.f7488k.get();
            Activity activityU0 = context instanceof Activity ? (Activity) context : this.f7705a.u0();
            this.f7705a.a0().b(this.f7494i);
            this.f7705a.X().loadThirdPartyMediatedAd(strB, this.f7494i, activityU0, new a(f6.this.f7487j, maxAdFormatA, strB));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(y2 y2Var, MaxNetworkResponseInfo.AdLoadState adLoadState, long j10, MaxError maxError) {
            f6.this.f7491n.add(new MaxNetworkResponseInfoImpl(adLoadState, w3.a(y2Var.b()), y2Var.E(), y2Var.W(), j10, y2Var.B(), maxError));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        n7.a("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", this.f7705a.u0());
    }

    public f6(a3 a3Var, JSONObject jSONObject, Context context, com.applovin.impl.sdk.k kVar, com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
        super("TaskProcessMediationWaterfall", kVar, a3Var.b());
        this.f7484g = a3Var;
        this.f7485h = jSONObject;
        this.f7487j = interfaceC0040a;
        this.f7488k = new WeakReference(context);
        this.f7489l = JsonUtils.getString(jSONObject, "mcode", "");
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray());
        this.f7486i = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            this.f7486i.add(y2.a(a3Var, JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null), jSONObject, kVar));
        }
        this.f7491n = new ArrayList(this.f7486i.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(y2 y2Var) {
        this.f7705a.a0().c(y2Var);
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f7490m;
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.d(this.f7706b, "Waterfall loaded in " + jElapsedRealtime + "ms from " + y2Var.c() + " for " + this.f7484g.a().getLabel() + " ad unit " + this.f7484g.b());
        }
        y2Var.a(new MaxAdWaterfallInfoImpl(y2Var, jElapsedRealtime, this.f7491n, this.f7489l));
        t2.f(this.f7487j, y2Var);
    }

    @Override // java.lang.Runnable
    public void run() {
        final MaxErrorImpl maxErrorImpl;
        this.f7490m = SystemClock.elapsedRealtime();
        int i10 = 0;
        if (this.f7485h.optBoolean("is_testing", false) && !this.f7705a.s0().c() && f7483o.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.oa
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8684b.e();
                }
            });
        }
        String strB = this.f7484g.b();
        MaxAdFormat maxAdFormatA = this.f7484g.a();
        if (this.f7486i.size() > 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.a(this.f7706b, "Starting waterfall for " + maxAdFormatA.getLabel() + " ad unit " + strB + " with " + this.f7486i.size() + " ad(s)...");
            }
            this.f7705a.q0().a(new b(i10, this.f7486i));
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.k(this.f7706b, "No ads were returned from the server for " + maxAdFormatA.getLabel() + " ad unit " + strB);
        }
        n7.a(strB, maxAdFormatA, this.f7485h, this.f7705a);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f7485h, "settings", new JSONObject());
        long j10 = JsonUtils.getLong(jSONObject, "alfdcs", 0L);
        if (w3.a(this.f7485h, strB, this.f7705a)) {
            maxErrorImpl = new MaxErrorImpl(MaxErrorCode.INVALID_AD_UNIT_ID, "Ad Unit ID " + strB + " is invalid or disabled.\nMake sure to use an Ad Unit ID from the MAX dashboard that is enabled and configured for the current application.\nFor more information, see https://support.axon.ai/en/max/getting-started#step-2-create-an-ad-unit\nNote: New ad units cannot load ads until 30-60 minutes after they are created");
            if (n7.c(this.f7705a) && ((Boolean) this.f7705a.a(x4.A6)).booleanValue()) {
                j10 = 0;
            }
        } else {
            maxErrorImpl = new MaxErrorImpl(204, "MAX returned no eligible ads from any mediated networks for this app/device");
        }
        if (j10 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(j10);
            Runnable runnable = new Runnable() { // from class: com.applovin.impl.pa
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8758b.b(maxErrorImpl);
                }
            };
            if (JsonUtils.getBoolean(jSONObject, "alfdcs_iba", Boolean.FALSE).booleanValue()) {
                g0.a(millis, this.f7705a, runnable);
                return;
            } else {
                AppLovinSdkUtils.runOnUiThreadDelayed(runnable, millis);
                return;
            }
        }
        b(maxErrorImpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(MaxError maxError) {
        ArrayList arrayList = new ArrayList(this.f7491n.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : this.f7491n) {
            if (maxNetworkResponseInfo.getAdLoadState() == MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                arrayList.add(maxNetworkResponseInfo);
            }
        }
        if (arrayList.size() > 0) {
            StringBuilder sb2 = new StringBuilder("======FAILED AD LOADS======");
            sb2.append("\n");
            int i10 = 0;
            while (i10 < arrayList.size()) {
                MaxNetworkResponseInfo maxNetworkResponseInfo2 = (MaxNetworkResponseInfo) arrayList.get(i10);
                i10++;
                sb2.append(i10);
                sb2.append(") ");
                sb2.append(maxNetworkResponseInfo2.getMediatedNetwork().getName());
                sb2.append("\n");
                sb2.append("..code: ");
                sb2.append(maxNetworkResponseInfo2.getError().getCode());
                sb2.append("\n");
                sb2.append("..message: ");
                sb2.append(maxNetworkResponseInfo2.getError().getMessage());
                sb2.append("\n");
            }
            ((MaxErrorImpl) maxError).setAdLoadFailureInfo(sb2.toString());
        }
        String strB = this.f7484g.b();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f7490m;
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.d(this.f7706b, "Waterfall failed in " + jElapsedRealtime + "ms for " + this.f7484g.a().getLabel() + " ad unit " + strB + " with error: " + maxError);
        }
        ((MaxErrorImpl) maxError).setWaterfall(new MaxAdWaterfallInfoImpl(null, JsonUtils.getString(this.f7485h, "waterfall_name", ""), JsonUtils.getString(this.f7485h, "waterfall_test_name", ""), jElapsedRealtime, this.f7491n, this.f7484g, JsonUtils.optList(JsonUtils.getJSONArray(this.f7485h, "mwf_info_urls", null), Collections.EMPTY_LIST), this.f7489l, JsonUtils.getString(this.f7485h, "event_id", "")));
        t2.a(this.f7487j, strB, maxError);
    }
}
