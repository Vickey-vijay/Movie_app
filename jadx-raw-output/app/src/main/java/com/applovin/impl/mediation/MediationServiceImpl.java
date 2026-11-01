package com.applovin.impl.mediation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import com.applovin.impl.a3;
import com.applovin.impl.b5;
import com.applovin.impl.b6;
import com.applovin.impl.c3;
import com.applovin.impl.c5;
import com.applovin.impl.d2;
import com.applovin.impl.d5;
import com.applovin.impl.d6;
import com.applovin.impl.f2;
import com.applovin.impl.h3;
import com.applovin.impl.i5;
import com.applovin.impl.i6;
import com.applovin.impl.k3;
import com.applovin.impl.n6;
import com.applovin.impl.n7;
import com.applovin.impl.r3;
import com.applovin.impl.s3;
import com.applovin.impl.s4;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.impl.t3;
import com.applovin.impl.u6;
import com.applovin.impl.w3;
import com.applovin.impl.x4;
import com.applovin.impl.y2;
import com.applovin.impl.z4;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class MediationServiceImpl implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f8040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b5 f8041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference f8042d = new AtomicReference();

    public class b implements MaxAdListener, MaxRewardedAdListener, MaxAdViewAdListener, MaxAdRevenueListener, com.applovin.impl.mediation.ads.a.InterfaceC0040a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final y2 f8044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.applovin.impl.mediation.ads.a.InterfaceC0040a f8045b;

        public void a(com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
            this.f8045b = interfaceC0040a;
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            a(maxAd, (Bundle) null);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            b(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            a(maxAd, maxError, (Bundle) null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            c(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            d(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            e(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            f(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            a(maxAd, maxReward, (Bundle) null);
        }

        public b(y2 y2Var, com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
            this.f8044a = y2Var;
            this.f8045b = interfaceC0040a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd) {
            if (maxAd.getFormat().isFullscreenAd()) {
                MediationServiceImpl.this.f8039a.H().b(maxAd);
            }
            t2.e(this.f8045b, maxAd);
        }

        public void b(MaxAd maxAd, Bundle bundle) {
            this.f8044a.a(bundle);
            t2.b(this.f8045b, maxAd);
        }

        public void c(MaxAd maxAd, Bundle bundle) {
            this.f8044a.a(bundle);
            this.f8044a.b0();
            com.applovin.impl.sdk.o unused = MediationServiceImpl.this.f8040b;
            if (com.applovin.impl.sdk.o.a()) {
                MediationServiceImpl.this.f8040b.a("MediationService", "Scheduling impression for ad via callback...");
            }
            MediationServiceImpl.this.processCallbackAdImpressionPostback(this.f8044a, this.f8045b);
            if (!((Boolean) MediationServiceImpl.this.f8039a.a(r3.f8963w8)).booleanValue() || this.f8044a.u().compareAndSet(false, true)) {
                MediationServiceImpl.this.f8039a.l().a(this.f8044a, com.applovin.impl.sdk.g.c.SHOW);
                MediationServiceImpl.this.f8039a.t().b(this.f8044a, "DID_DISPLAY");
                if (maxAd.getFormat().isFullscreenAd()) {
                    MediationServiceImpl.this.f8039a.H().a(this.f8044a);
                }
                t2.c(this.f8045b, maxAd);
            }
        }

        public void d(MaxAd maxAd, Bundle bundle) {
            this.f8044a.a(bundle);
            t2.d(this.f8045b, maxAd);
        }

        public void e(final MaxAd maxAd, Bundle bundle) {
            this.f8044a.a(bundle);
            this.f8044a.c0();
            MediationServiceImpl.this.f8039a.l().a(this.f8044a, com.applovin.impl.sdk.g.c.HIDE);
            MediationServiceImpl.this.a(this.f8044a);
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8441b.a(maxAd);
                }
            }, maxAd instanceof c3 ? ((c3) maxAd).l0() : 0L);
        }

        public void f(MaxAd maxAd, Bundle bundle) {
            this.f8044a.a(bundle);
            this.f8044a.e0();
            MediationServiceImpl.this.f8039a.l().a(this.f8044a, com.applovin.impl.sdk.g.c.LOAD);
            MediationServiceImpl.this.b(this.f8044a);
            t2.f(this.f8045b, maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            this.f8044a.e0();
            MediationServiceImpl.this.b(this.f8044a, maxError, this.f8045b);
        }

        public void a(MaxAd maxAd, Bundle bundle) {
            this.f8044a.a(bundle);
            MediationServiceImpl.this.f8039a.l().a(this.f8044a, com.applovin.impl.sdk.g.c.CLICK);
            MediationServiceImpl.this.a(this.f8044a, this.f8045b);
            t2.a((MaxAdListener) this.f8045b, maxAd);
        }

        public void a(MaxAd maxAd, MaxError maxError, Bundle bundle) {
            this.f8044a.a(bundle);
            this.f8044a.a0();
            MediationServiceImpl.this.a(this.f8044a, maxError, this.f8045b);
            if (maxAd.getFormat() == MaxAdFormat.REWARDED && (maxAd instanceof c3)) {
                ((c3) maxAd).j0();
            }
        }

        public void a(MaxAd maxAd, MaxReward maxReward, Bundle bundle) {
            this.f8044a.a(bundle);
            t2.a(this.f8045b, maxAd, maxReward);
            MediationServiceImpl.this.f8039a.q0().a((i5) new n6((c3) maxAd, MediationServiceImpl.this.f8039a), d6.b.OTHER);
        }
    }

    public void loadAd(String str, @Nullable String str2, MaxAdFormat maxAdFormat, com.applovin.impl.i iVar, Map<String, Object> map, Map<String, Object> map2, Context context, com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No Ad Unit ID specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        if (interfaceC0040a == null) {
            throw new IllegalArgumentException("No listener specified");
        }
        if (TextUtils.isEmpty(this.f8039a.V())) {
            com.applovin.impl.sdk.o.h("AppLovinSdk", "Mediation provider is null. Please set the mediation provider in the AppLovinSdkInitializationConfiguration.Builder when initializing the AppLovinSDK.");
        }
        if (!this.f8039a.B0()) {
            com.applovin.impl.sdk.o.j("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        List<String> adUnitIds = this.f8039a.J() != null ? this.f8039a.J().getAdUnitIds() : null;
        boolean zStartsWith = str.startsWith("test_mode");
        if (adUnitIds != null && adUnitIds.size() > 0 && !adUnitIds.contains(str) && !zStartsWith) {
            if (n7.c(this.f8039a)) {
                String str3 = "Ad Unit ID " + str + " has not been initialized. When you use selective init, any ad units that you do not explicitly specify are excluded from serving ads for the current session. For more information visit our docs: https://support.axon.ai/en/max/android/overview/advanced-settings#selective-init";
                if (((Boolean) this.f8039a.a(x4.B6)).booleanValue()) {
                    throw new RuntimeException(str3);
                }
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8040b.b("MediationService", str3);
                }
            }
            this.f8039a.D().a(d2.S0, "uninitialized_ad_unit_id", CollectionUtils.hashMap("ad_unit_id", str), "uninitialized_ad_unit_id" + str);
        }
        this.f8039a.c();
        if (str.length() != 16 && !zStartsWith && !this.f8039a.i0().startsWith("05TMD")) {
            com.applovin.impl.sdk.o.h("MediationService", "Ad unit ID provided for " + maxAdFormat.getLabel() + " is invalid (" + str + "). Expected length: 16 characters.\n\nStack trace:\n" + Log.getStackTraceString(new Throwable()));
        }
        if (!this.f8039a.a(maxAdFormat)) {
            this.f8039a.U0();
            t2.a((MaxAdRequestListener) interfaceC0040a, str, true);
            if (this.f8039a.R() != null) {
                this.f8039a.R().a(str, str2, maxAdFormat, iVar, map, map2, context, interfaceC0040a);
                return;
            } else {
                this.f8039a.Q().a(str, str2, maxAdFormat, iVar, map, map2, context, interfaceC0040a);
                return;
            }
        }
        com.applovin.impl.sdk.o.h("MediationService", "Ad load failed due to disabled ad format " + maxAdFormat.getLabel());
        t2.a(interfaceC0040a, str, new MaxErrorImpl(-1, "Disabled ad format " + maxAdFormat.getLabel()));
    }

    public void loadThirdPartyMediatedAd(final String str, final y2 y2Var, final Activity activity, final com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
        if (y2Var == null) {
            throw new IllegalArgumentException("No mediated ad specified");
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f8040b.a("MediationService", "Loading " + y2Var + "...");
        }
        this.f8039a.P().a(d2.f7214k0, y2Var);
        this.f8039a.l().a(y2Var, com.applovin.impl.sdk.g.c.LOADING);
        this.f8039a.t().b(y2Var, "WILL_LOAD");
        final h hVarA = this.f8039a.T().a(y2Var);
        if (hVarA == null) {
            String str2 = "Failed to load " + y2Var + ": adapter not loaded";
            com.applovin.impl.sdk.o.h("MediationService", str2);
            b(y2Var, new MaxErrorImpl(-5001, str2), interfaceC0040a);
            return;
        }
        final MaxAdapterParametersImpl maxAdapterParametersImplA = MaxAdapterParametersImpl.a(y2Var);
        s4 s4VarA = null;
        if (y2Var.Y()) {
            s4VarA = this.f8039a.S().a(y2Var, activity);
        } else if (y2Var.Z()) {
            this.f8039a.S().a(y2Var, activity);
        }
        s4 s4Var = s4VarA;
        final y2 y2VarA = y2Var.a(hVarA);
        hVarA.a(str, y2VarA);
        y2VarA.f0();
        if (s4Var == null) {
            hVarA.a(str, maxAdapterParametersImplA, y2VarA, activity, new b(y2VarA, interfaceC0040a));
            return;
        }
        Executor executor = s4.f9022j;
        s4Var.a(executor, new s4.a() { // from class: com.applovin.impl.mediation.o
            @Override // com.applovin.impl.s4.a
            public final void a(Object obj) {
                this.f8427a.a(y2Var, interfaceC0040a, (String) obj);
            }
        });
        s4Var.a(executor, new Runnable() { // from class: com.applovin.impl.mediation.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f8432b.a(hVarA, str, maxAdapterParametersImplA, y2VarA, activity, interfaceC0040a);
            }
        });
    }

    public void processAdDisplayErrorPostbackForUserError(MaxError maxError, y2 y2Var) {
        a(maxError, y2Var, false);
    }

    public void showFullscreenAd(final c3 c3Var, final Activity activity, Map<String, Object> map, Map<String, Object> map2, final com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
        if (c3Var == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (activity == null && MaxAdFormat.APP_OPEN != c3Var.getFormat()) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.f8039a.H().a(true);
        final h hVarB = b(c3Var);
        long jR0 = c3Var.r0();
        if (((Boolean) this.f8039a.a(r3.f8935f8)).booleanValue() && this.f8039a.R() == null && this.f8039a.Q().a((MaxAd) c3Var)) {
            this.f8039a.Q().a(c3Var.getAdUnitId(), (String) null, c3Var.getFormat(), com.applovin.impl.i.SEQUENTIAL_OR_PRECACHE, map, map2, activity, (com.applovin.impl.mediation.ads.a.InterfaceC0040a) null);
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f8040b.d("MediationService", "Showing ad " + c3Var.getAdUnitId() + " with delay of " + jR0 + "ms...");
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f8420b.a(c3Var, hVarB, activity, interfaceC0040a);
            }
        }, jR0);
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8043a;

        static {
            int[] iArr = new int[MaxAdapter.InitializationStatus.values().length];
            f8043a = iArr;
            try {
                iArr[MaxAdapter.InitializationStatus.DOES_NOT_APPLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8043a[MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8043a[MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8043a[MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8043a[MaxAdapter.InitializationStatus.NOT_INITIALIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8043a[MaxAdapter.InitializationStatus.INITIALIZING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public void collectSignal(final d5 d5Var, Context context, final c5.a aVar) {
        if (d5Var == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("No callback specified");
        }
        a3 a3VarU = d5Var.u();
        final String strB = a3VarU.b();
        final MaxAdFormat maxAdFormatA = a3VarU.a();
        c5 c5VarB = this.f8041c.b(d5Var, strB, maxAdFormatA);
        if (c5VarB != null) {
            aVar.a(c5.a(c5VarB));
            return;
        }
        final h hVarA = this.f8039a.T().a(d5Var, d5Var.A());
        if (hVarA == null) {
            aVar.a(c5.a(d5Var, new MaxErrorImpl("Could not load adapter")));
            return;
        }
        final s4 s4Var = new s4("SignalCollection:" + d5Var.c());
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        Executor executor = s4.f9022j;
        s4Var.a(executor, new s4.b() { // from class: com.applovin.impl.mediation.k
            @Override // com.applovin.impl.s4.b
            public final void a(boolean z10, Object obj, Object obj2) {
                this.f8394a.a(jElapsedRealtime, hVarA, strB, d5Var, maxAdFormatA, aVar, z10, (String) obj, (MaxError) obj2);
            }
        });
        i6.a(d5Var.m(), s4Var, new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_TIMEOUT, "The adapter (" + d5Var.c() + ") timed out collecting signal"), "MediationService", this.f8039a);
        final Activity activityU0 = context instanceof Activity ? (Activity) context : this.f8039a.u0();
        final MaxAdapterParametersImpl maxAdapterParametersImplA = MaxAdapterParametersImpl.a(d5Var, strB, maxAdFormatA);
        if (d5Var.w()) {
            s4 s4VarA = this.f8039a.S().a(d5Var, activityU0);
            s4VarA.a(executor, new Runnable() { // from class: com.applovin.impl.mediation.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8405b.a(s4Var, hVarA, maxAdapterParametersImplA, d5Var, activityU0);
                }
            });
            s4VarA.a(executor, new s4.a() { // from class: com.applovin.impl.mediation.m
                @Override // com.applovin.impl.s4.a
                public final void a(Object obj) {
                    this.f8415a.a(hVarA, s4Var, (String) obj);
                }
            });
            return;
        }
        if (d5Var.x()) {
            s4 s4VarA2 = this.f8039a.S().a(d5Var, activityU0);
            if (s4VarA2.e() && !d5Var.z()) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8040b.b("MediationService", "Skip collecting signal for failed-initialized adapter: " + hVarA.g());
                }
                s4Var.a(new MaxErrorImpl("Could not initialize adapter: " + ((String) s4VarA2.b())));
                return;
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f8040b.a("MediationService", "Collecting signal for adapter: " + hVarA.g());
        }
        hVarA.a(maxAdapterParametersImplA, d5Var, activityU0, s4Var);
    }

    public void destroyAd(MaxAd maxAd) {
        if (maxAd instanceof y2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8040b.d("MediationService", "Destroying " + maxAd);
            }
            y2 y2Var = (y2) maxAd;
            h hVarA = y2Var.A();
            if (hVarA != null) {
                hVarA.a();
                y2Var.t();
            }
            this.f8039a.j().c(y2Var.Q());
            this.f8039a.l().a(y2Var, com.applovin.impl.sdk.g.c.DESTROY);
        }
    }

    public JSONObject getAndResetCustomPostBodyData() {
        return (JSONObject) this.f8042d.getAndSet(null);
    }

    public void maybeFireAppKilledWhilePlayingMediatedAdPostback() {
        String str = (String) this.f8039a.b(z4.R);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        JSONObject jSONObjectJsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(str, new JSONObject());
        if (a(JsonUtils.getLong(jSONObjectJsonObjectFromJsonString, "timestamp_ms", 0L))) {
            Long l10 = (Long) this.f8039a.b(z4.S);
            String string = l10 != null ? l10.toString() : "";
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONObjectJsonObjectFromJsonString, "ad_info");
            Map mapTryToStringMap = jSONObject != null ? JsonUtils.tryToStringMap(jSONObject) : new HashMap(1);
            CollectionUtils.putStringIfValid("duration_ms", string, mapTryToStringMap);
            this.f8039a.D().d(d2.I0, mapTryToStringMap);
            List list = JsonUtils.getList(jSONObjectJsonObjectFromJsonString, "app_killed_urls", Collections.emptyList());
            if (CollectionUtils.isEmpty(list)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8040b.k("MediationService", "Unable to track app killed during mediated ad from previous run. Missing app killed tracking URLs.");
                }
            } else {
                JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObjectJsonObjectFromJsonString, "user_info");
                Map<String, String> mapTryToStringMap2 = jSONObject2 != null ? JsonUtils.tryToStringMap(jSONObject2) : w3.c(this.f8039a);
                mapTryToStringMap2.put("{IMP_DURATION_MS}", string);
                a("mappk", list, mapTryToStringMap2, null, null, null, true);
            }
        }
    }

    public void processAdapterInitializationPostback(k3 k3Var, long j10, MaxAdapter.InitializationStatus initializationStatus, String str) {
        HashMap map = new HashMap(2);
        map.put("{INIT_STATUS}", String.valueOf(initializationStatus.getCode()));
        map.put("{INIT_TIME_MS}", String.valueOf(j10));
        a("minit", map, new MaxErrorImpl(str), k3Var);
        Map mapA = f2.a(k3Var);
        CollectionUtils.putStringIfValid("adapter_init_status", String.valueOf(initializationStatus.getCode()), mapA);
        CollectionUtils.putStringIfValid("error_message", str, mapA);
        CollectionUtils.putStringIfValid("duration_ms", String.valueOf(j10), mapA);
        switch (a.f8043a[initializationStatus.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.f8039a.P().d(d2.f7200d0, mapA);
                break;
            case 4:
                this.f8039a.P().d(d2.f7202e0, mapA);
                break;
            case 5:
            case 6:
                this.f8039a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8039a.O().k("MediationService", "Adapter init postback called while the adapter is not fully initialized.");
                }
                this.f8039a.D().a(d2.f7199d, "adapterNotInitializedForPostback", mapA);
                break;
        }
    }

    public void processRawAdImpression(y2 y2Var, com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
        this.f8039a.t().b(y2Var, "WILL_DISPLAY");
        if (y2Var.O().endsWith("mimp")) {
            this.f8039a.t().b(y2Var);
            t2.a((MaxAdRevenueListener) interfaceC0040a, (MaxAd) y2Var);
        }
        if (((Boolean) this.f8039a.a(x4.M4)).booleanValue()) {
            this.f8039a.Y().a(s3.f9014g, t3.a(y2Var), Long.valueOf(System.currentTimeMillis() - this.f8039a.K()));
        }
        HashMap map = new HashMap(3);
        if (y2Var instanceof c3) {
            c3 c3Var = (c3) y2Var;
            map.put("{TIME_TO_SHOW_MS}", String.valueOf(c3Var.p0()));
            map.put("{PREVIOUS_FAILED_NETWORK_NAME}", StringUtils.emptyIfNull(c3Var.u0()));
        }
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f8039a.w0().e());
        if (!((Boolean) this.f8039a.a(x4.H3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        a("mimp", map, y2Var);
        this.f8039a.P().a(d2.f7222o0, y2Var);
    }

    public void setCustomPostBodyData(JSONObject jSONObject) {
        this.f8042d.set(jSONObject);
    }

    public MediationServiceImpl(com.applovin.impl.sdk.k kVar) {
        this.f8039a = kVar;
        this.f8040b = kVar.O();
        this.f8041c = new b5(kVar);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, @Nullable Map<String, Object> map) {
        if ("com.applovin.render_process_gone".equals(intent.getAction())) {
            Object objA = this.f8039a.H().a();
            if (objA instanceof y2) {
                a((MaxError) MaxAdapterError.WEBVIEW_ERROR, (y2) objA, true);
            }
        }
    }

    public void processCallbackAdImpressionPostback(y2 y2Var, com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
        if (y2Var.O().endsWith("cimp")) {
            this.f8039a.t().b(y2Var);
            t2.a((MaxAdRevenueListener) interfaceC0040a, (MaxAd) y2Var);
        }
        HashMap map = new HashMap(2);
        if (y2Var instanceof c3) {
            map.put("{PREVIOUS_FAILED_NETWORK_NAME}", StringUtils.emptyIfNull(((c3) y2Var).u0()));
        }
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f8039a.w0().e());
        if (!((Boolean) this.f8039a.a(x4.H3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        a("mcimp", map, y2Var);
        this.f8039a.P().a(d2.f7224p0, y2Var);
    }

    public void processViewabilityAdImpressionPostback(h3 h3Var, long j10, com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
        if (h3Var.O().endsWith("vimp")) {
            this.f8039a.t().b(h3Var);
            t2.a((MaxAdRevenueListener) interfaceC0040a, (MaxAd) h3Var);
        }
        HashMap map = new HashMap(3);
        map.put("{VIEWABILITY_FLAGS}", String.valueOf(j10));
        map.put("{USED_VIEWABILITY_TIMER}", String.valueOf(h3Var.q0()));
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f8039a.w0().e());
        if (!((Boolean) this.f8039a.a(x4.H3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        a("mvimp", map, h3Var);
        this.f8039a.P().a(d2.f7226q0, h3Var);
    }

    public void processWaterfallInfoPostback(MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl, @Nullable MaxError maxError, long j10, long j11) {
        a3 requestParameters = maxAdWaterfallInfoImpl.getRequestParameters();
        String strB = requestParameters.b();
        MaxAdFormat maxAdFormatA = requestParameters.a();
        HashMap map = new HashMap();
        CollectionUtils.putStringIfValid("ad_format", maxAdFormatA.getLabel(), map);
        CollectionUtils.putStringIfValid("ad_unit_id", strB, map);
        CollectionUtils.putStringIfValid("duration_ms", String.valueOf(j11), map);
        CollectionUtils.putStringIfValid("ad_event_id", maxAdWaterfallInfoImpl.getEventId(), map);
        if (maxError != null) {
            map.putAll(f2.a(maxError));
        }
        this.f8039a.P().d(d2.f7220n0, map);
        if (CollectionUtils.isEmpty(maxAdWaterfallInfoImpl.getPostbackUrls())) {
            return;
        }
        HashMap map2 = new HashMap(8);
        CollectionUtils.putStringIfValid("mcode", maxAdWaterfallInfoImpl.getMCode(), map2);
        CollectionUtils.putStringIfValid("ad_unit_id", strB, map2);
        CollectionUtils.putStringIfValid("ad_format", maxAdFormatA.getLabel(), map2);
        CollectionUtils.putStringIfValid("name", maxAdWaterfallInfoImpl.getName(), map2);
        CollectionUtils.putLongIfValid("request_latency_ms", Long.valueOf(j11), map2);
        CollectionUtils.putLongIfValid("request_start_timestamp_ms", Long.valueOf(j10), map2);
        CollectionUtils.putLongIfValid("wf_latency_ms", Long.valueOf(maxAdWaterfallInfoImpl.getLatencyMillis()), map2);
        map2.put("arn_info", requestParameters.f().e());
        List<MaxNetworkResponseInfo> networkResponses = maxAdWaterfallInfoImpl.getNetworkResponses();
        ArrayList arrayList = new ArrayList(networkResponses.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : networkResponses) {
            MaxMediatedNetworkInfo mediatedNetwork = maxNetworkResponseInfo.getMediatedNetwork();
            HashMap map3 = new HashMap(5);
            CollectionUtils.putStringIfValid("bcode", ((MaxNetworkResponseInfoImpl) maxNetworkResponseInfo).getBCode(), map3);
            map3.put("name", mediatedNetwork.getName());
            CollectionUtils.putLongIfValid("latency_ms", Long.valueOf(maxNetworkResponseInfo.getLatencyMillis()), map3);
            map3.put("load_state", Integer.valueOf(maxNetworkResponseInfo.getAdLoadState().ordinal()));
            MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxNetworkResponseInfo.getError();
            if (maxErrorImpl != null) {
                HashMap map4 = new HashMap(4);
                map4.put("error_code", Integer.valueOf(maxErrorImpl.getCode()));
                map4.put("error_message", maxErrorImpl.getMessage());
                map4.put("third_party_sdk_error_code", Integer.valueOf(maxErrorImpl.getMediatedNetworkErrorCode()));
                map4.put("third_party_sdk_error_message", maxErrorImpl.getMediatedNetworkErrorMessage());
                map3.put("error_info", map4);
            }
            arrayList.add(map3);
        }
        map2.put("ads_info", arrayList);
        a("mwf_info", maxAdWaterfallInfoImpl.getPostbackUrls(), Collections.EMPTY_MAP, map2, null, null, false);
    }

    private h b(c3 c3Var) {
        h hVarA = c3Var.A();
        if (hVarA != null) {
            return hVarA;
        }
        this.f8039a.H().a(false);
        if (com.applovin.impl.sdk.o.a()) {
            this.f8040b.k("MediationService", "Failed to show " + c3Var + ": adapter not found");
        }
        com.applovin.impl.sdk.o.h("MediationService", "There may be an integration problem with the adapter for Ad Unit ID '" + c3Var.getAdUnitId() + "'. Please check if you have a supported version of that SDK integrated into your project.");
        throw new IllegalStateException("Could not find adapter for provided ad");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(c3 c3Var, h hVar, Activity activity, com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
        a(c3Var);
        hVar.b(c3Var, activity);
        a(c3Var, interfaceC0040a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(c3 c3Var, h hVar, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity, com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
        a(c3Var);
        hVar.a(c3Var, viewGroup, lifecycle, activity);
        a(c3Var, interfaceC0040a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(y2 y2Var, MaxError maxError, MaxAdListener maxAdListener) {
        a(maxError, y2Var);
        destroyAd(y2Var);
        t2.a(maxAdListener, y2Var.getAdUnitId(), maxError);
    }

    private void a(c3 c3Var) {
        if (c3Var.getFormat() == MaxAdFormat.REWARDED) {
            this.f8039a.q0().a((i5) new u6(c3Var, this.f8039a), d6.b.OTHER);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(y2 y2Var) {
        this.f8039a.t().b(y2Var, "DID_LOAD");
        if (y2Var.O().endsWith("load")) {
            this.f8039a.t().b(y2Var);
        }
        HashMap map = new HashMap(3);
        long jG = y2Var.G();
        map.put("{LOAD_TIME_MS}", String.valueOf(jG));
        if (y2Var.getFormat().isFullscreenAd()) {
            com.applovin.impl.sdk.n.a aVarB = this.f8039a.H().b(y2Var.getAdUnitId());
            map.put("{SHOW_ATTEMPT_COUNT}", String.valueOf(aVarB.a()));
            map.put("{SHOW_ATTEMPT_TIMESTAMP_MS}", String.valueOf(aVarB.b()));
        }
        a("load", map, y2Var);
        Map mapA = f2.a(y2Var);
        mapA.put("duration_ms", String.valueOf(jG));
        this.f8039a.P().d(d2.f7216l0, mapA);
    }

    public void showFullscreenAd(final c3 c3Var, final ViewGroup viewGroup, final Lifecycle lifecycle, final Activity activity, Map<String, Object> map, Map<String, Object> map2, final com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
        if (c3Var == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (activity != null) {
            this.f8039a.H().a(true);
            final h hVarB = b(c3Var);
            long jR0 = c3Var.r0();
            if (((Boolean) this.f8039a.a(r3.f8935f8)).booleanValue() && this.f8039a.R() == null && this.f8039a.Q().a((MaxAd) c3Var)) {
                this.f8039a.Q().a(c3Var.getAdUnitId(), (String) null, c3Var.getFormat(), com.applovin.impl.i.SEQUENTIAL_OR_PRECACHE, map, map2, activity, (com.applovin.impl.mediation.ads.a.InterfaceC0040a) null);
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f8040b.d("MediationService", "Showing ad " + c3Var.getAdUnitId() + " with delay of " + jR0 + "ms...");
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8385b.a(c3Var, hVarB, viewGroup, lifecycle, activity, interfaceC0040a);
                }
            }, jR0);
            return;
        }
        throw new IllegalArgumentException("No activity specified");
    }

    private void a(c3 c3Var, com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
        this.f8039a.H().a(false);
        a(c3Var, (MaxAdListener) interfaceC0040a);
        if (com.applovin.impl.sdk.o.a()) {
            this.f8040b.a("MediationService", "Scheduling impression for ad manually...");
        }
        processRawAdImpression(c3Var, interfaceC0040a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(y2 y2Var, com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a, String str) {
        String str2 = "Failed to load " + y2Var + ": adapter init failed with error: " + str;
        if (com.applovin.impl.sdk.o.a()) {
            this.f8040b.k("MediationService", str2);
        }
        b(y2Var, new MaxErrorImpl(MaxAdapterError.NOT_INITIALIZED.getErrorCode(), "Adapter initialization failed"), interfaceC0040a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(h hVar, String str, MaxAdapterParametersImpl maxAdapterParametersImpl, y2 y2Var, Activity activity, com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
        hVar.a(str, maxAdapterParametersImpl, y2Var, activity, new b(y2Var, interfaceC0040a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(long j10, h hVar, String str, d5 d5Var, MaxAdFormat maxAdFormat, c5.a aVar, boolean z10, String str2, MaxError maxError) {
        c5 c5VarA;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j10;
        if (z10) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8040b.a("MediationService", "Signal collection successful from: " + hVar.g() + " for Ad Unit ID: " + str + " with signal: \"" + str2 + "\"");
            }
            c5VarA = c5.a(d5Var, hVar, str2, j10, jElapsedRealtime);
            this.f8041c.a(c5VarA, d5Var, str, maxAdFormat);
            HashMap map = new HashMap();
            CollectionUtils.putStringIfValid(BrandSafetyEvent.f44576ad, d5Var.c(), map);
            CollectionUtils.putStringIfValid("adapter_class", d5Var.b(), map);
            CollectionUtils.putStringIfValid("adapter_version", hVar.b(), map);
            CollectionUtils.putStringIfValid("duration_ms", String.valueOf(jElapsedRealtime), map);
            CollectionUtils.putStringIfValid("ad_format", String.valueOf(maxAdFormat.getLabel()), map);
            CollectionUtils.putStringIfValid("ad_unit_id", str, map);
            this.f8039a.P().d(d2.f7204f0, map);
        } else {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8040b.b("MediationService", "Signal collection failed from: " + hVar.g() + " for Ad Unit ID: " + str + " with error message: \"" + maxError.getMessage() + "\"");
            }
            c5VarA = c5.a(d5Var, hVar, maxError, j10, jElapsedRealtime);
            a(c5VarA, d5Var, hVar);
        }
        aVar.a(c5VarA);
        hVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(s4 s4Var, h hVar, MaxAdapterParametersImpl maxAdapterParametersImpl, d5 d5Var, Activity activity) {
        if (s4Var.d()) {
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f8040b.a("MediationService", "Collecting signal for now-initialized adapter: " + hVar.g());
        }
        hVar.a(maxAdapterParametersImpl, d5Var, activity, s4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(h hVar, s4 s4Var, String str) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f8040b.b("MediationService", "Skip collecting signal for failed-initialized adapter: " + hVar.g());
        }
        s4Var.a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_NOT_INITIALIZED, "Could not initialize adapter: " + str));
    }

    private void a(final c3 c3Var, final MaxAdListener maxAdListener) {
        final Long l10 = (Long) this.f8039a.a(r3.U7);
        if (l10.longValue() <= 0) {
            return;
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f8375b.a(c3Var, l10, maxAdListener);
            }
        }, l10.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(c3 c3Var, Long l10, MaxAdListener maxAdListener) {
        if (c3Var.u().get()) {
            return;
        }
        String str = "Ad (" + c3Var.k() + ") has not been displayed after " + l10 + "ms. Failing ad display...";
        com.applovin.impl.sdk.o.h("MediationService", str);
        a(c3Var, new MaxErrorImpl(-1, str), maxAdListener);
        this.f8039a.H().b(c3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(y2 y2Var, MaxError maxError, MaxAdListener maxAdListener) {
        this.f8039a.l().a(y2Var, com.applovin.impl.sdk.g.c.SHOW_ERROR);
        this.f8039a.t().b(y2Var, "DID_FAIL_DISPLAY");
        a(maxError, y2Var, true);
        if (y2Var.u().compareAndSet(false, true)) {
            t2.a(maxAdListener, y2Var, maxError);
        }
    }

    private void a(MaxError maxError, y2 y2Var) {
        HashMap map = new HashMap(3);
        long jG = y2Var.G();
        map.put("{LOAD_TIME_MS}", String.valueOf(jG));
        if (y2Var.getFormat().isFullscreenAd()) {
            com.applovin.impl.sdk.n.a aVarB = this.f8039a.H().b(y2Var.getAdUnitId());
            map.put("{SHOW_ATTEMPT_COUNT}", String.valueOf(aVarB.a()));
            map.put("{SHOW_ATTEMPT_TIMESTAMP_MS}", String.valueOf(aVarB.b()));
        }
        a("mlerr", map, maxError, y2Var);
        Map mapA = f2.a(y2Var);
        mapA.putAll(f2.a(maxError));
        mapA.put("duration_ms", String.valueOf(jG));
        this.f8039a.P().d(d2.f7218m0, mapA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(y2 y2Var) {
        this.f8039a.t().b(y2Var, "DID_HIDE");
        HashMap map = new HashMap(1);
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f8039a.w0().e());
        if (!((Boolean) this.f8039a.a(x4.H3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        a("mclose", map, y2Var);
        long jS = y2Var.S();
        long jH = y2Var.H();
        Map map2 = CollectionUtils.map("duration_ms", String.valueOf(jS));
        map2.put("details", "foreground_duration_ms = " + jH);
        this.f8039a.P().a(d2.f7230s0, y2Var, map2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(y2 y2Var, com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
        this.f8039a.t().b(y2Var, "DID_CLICKED");
        this.f8039a.t().b(y2Var, "DID_CLICK");
        if (y2Var.O().endsWith("click")) {
            this.f8039a.t().b(y2Var);
            t2.a((MaxAdRevenueListener) interfaceC0040a, (MaxAd) y2Var);
        }
        HashMap map = new HashMap(1);
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f8039a.w0().e());
        if (!((Boolean) this.f8039a.a(x4.H3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        a("mclick", map, y2Var);
    }

    private void a(MaxError maxError, y2 y2Var, boolean z10) {
        HashMap map = new HashMap(1);
        if (y2Var instanceof c3) {
            map.put("{PREVIOUS_FAILED_NETWORK_NAME}", StringUtils.emptyIfNull(((c3) y2Var).u0()));
        }
        a("mierr", map, maxError, y2Var, z10);
        if (!z10 || y2Var == null) {
            return;
        }
        this.f8039a.P().a(d2.f7228r0, y2Var, maxError, CollectionUtils.map("duration_ms", String.valueOf(y2Var.F())));
    }

    private void a(c5 c5Var, d5 d5Var, h hVar) {
        long jB = c5Var.b();
        HashMap map = new HashMap(3);
        map.put("{LOAD_TIME_MS}", String.valueOf(jB));
        CollectionUtils.putStringIfValid("{ADAPTER_VERSION}", hVar.b(), map);
        CollectionUtils.putStringIfValid("{SDK_VERSION}", hVar.i(), map);
        a("serr", map, c5Var.c(), d5Var);
        Map mapA = f2.a(c5Var.c());
        CollectionUtils.putStringIfValid(BrandSafetyEvent.f44576ad, d5Var.c(), mapA);
        CollectionUtils.putStringIfValid("adapter_class", d5Var.b(), mapA);
        CollectionUtils.putStringIfValid("adapter_version", hVar.b(), mapA);
        CollectionUtils.putStringIfValid("duration_ms", String.valueOf(jB), mapA);
        this.f8039a.P().d(d2.f7206g0, mapA);
    }

    private void a(String str, Map map, k3 k3Var) {
        a(str, map, (MaxError) null, k3Var);
    }

    private void a(String str, Map map, MaxError maxError, k3 k3Var) {
        a(str, map, maxError, k3Var, true);
    }

    private void a(String str, Map map, MaxError maxError, k3 k3Var, boolean z10) {
        Map map2 = CollectionUtils.map(map);
        map2.put("{PLACEMENT}", z10 ? StringUtils.emptyIfNull(k3Var.getPlacement()) : "");
        map2.put("{CUSTOM_DATA}", z10 ? StringUtils.emptyIfNull(k3Var.e()) : "");
        if (k3Var instanceof y2) {
            map2.put("{CREATIVE_ID}", z10 ? StringUtils.emptyIfNull(((y2) k3Var).getCreativeId()) : "");
        }
        a(str, null, map2, null, maxError, k3Var, z10);
    }

    private void a(String str, List list, Map map, Map map2, MaxError maxError, k3 k3Var, boolean z10) {
        this.f8039a.q0().a((i5) new b6(str, list, map, map2, maxError, k3Var, this.f8039a, z10), d6.b.OTHER);
    }

    private boolean a(long j10) {
        return System.currentTimeMillis() - j10 <= ((Long) this.f8039a.a(x4.E2)).longValue();
    }
}
