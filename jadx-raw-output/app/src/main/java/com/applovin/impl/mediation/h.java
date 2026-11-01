package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.impl.c3;
import com.applovin.impl.d5;
import com.applovin.impl.d6;
import com.applovin.impl.i5;
import com.applovin.impl.k3;
import com.applovin.impl.r3;
import com.applovin.impl.r6;
import com.applovin.impl.s4;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.x4;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdViewAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdViewAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.vungle.ads.internal.Constants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f8344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f8345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k3 f8346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f8347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private MaxAdapter f8348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f8349h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private y2 f8350i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private View f8351j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MaxNativeAd f8352k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private MaxNativeAdView f8353l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ViewGroup f8354m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private MaxAdapterResponseParameters f8356o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f8360s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f8342a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final b f8355n = new b(this, null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AtomicBoolean f8357p = new AtomicBoolean(true);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AtomicBoolean f8358q = new AtomicBoolean(false);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final AtomicBoolean f8359r = new AtomicBoolean(false);

    public class a implements MaxSignalCollectionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d5 f8361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s4 f8362b;

        public a(d5 d5Var, s4 s4Var) {
            this.f8361a = d5Var;
            this.f8362b = s4Var;
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
        public void onSignalCollected(String str) {
            if (this.f8361a.y() && TextUtils.isEmpty(str)) {
                this.f8362b.a(new MaxErrorImpl("Signal is not a valid string"));
            } else {
                this.f8362b.b(str);
            }
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
        public void onSignalCollectionFailed(String str) {
            this.f8362b.a(new MaxErrorImpl(str));
        }
    }

    public class b implements MaxInterstitialAdapterListener, MaxAppOpenAdapterListener, MaxRewardedAdapterListener, MaxAdViewAdapterListener, MaxNativeAdAdapterListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MediationServiceImpl.b f8364a;

        private b() {
        }

        private void b(String str, final Bundle bundle) {
            if (h.this.f8350i.w().compareAndSet(false, true)) {
                a(str, this.f8364a, new Runnable() { // from class: com.applovin.impl.mediation.r0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8447b.i(bundle);
                    }
                });
            }
        }

        private void c(String str, final Bundle bundle) {
            if (!h.this.f8350i.w().get()) {
                h.this.f8359r.set(true);
                a(str, this.f8364a, new Runnable() { // from class: com.applovin.impl.mediation.t0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8458b.j(bundle);
                    }
                });
                return;
            }
            com.applovin.impl.sdk.o unused = h.this.f8344c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f8344c.b("MediationAdapterWrapper", h.this.f8347f + ": blocking ad loaded callback for " + h.this.f8350i + " since onAdHidden() has been called");
            }
            h.this.f8343b.t().a(h.this.f8350i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(Bundle bundle) {
            this.f8364a.a(h.this.f8350i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(Bundle bundle) {
            this.f8364a.a(h.this.f8350i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(Bundle bundle) {
            this.f8364a.a(h.this.f8350i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(Bundle bundle) {
            this.f8364a.c(h.this.f8350i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(Bundle bundle) {
            this.f8364a.c(h.this.f8350i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i(Bundle bundle) {
            this.f8364a.e(h.this.f8350i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j(Bundle bundle) {
            if (h.this.f8358q.compareAndSet(false, true)) {
                this.f8364a.f(h.this.f8350i, bundle);
            }
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked() {
            onAdViewAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdCollapsed() {
            onAdViewAdCollapsed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onAdViewAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed() {
            onAdViewAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdExpanded() {
            onAdViewAdExpanded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden() {
            onAdViewAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view) {
            onAdViewAdLoaded(view, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdClicked() {
            onAppOpenAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onAppOpenAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayed() {
            onAppOpenAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdHidden() {
            onAppOpenAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoaded() {
            onAppOpenAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked() {
            onInterstitialAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onInterstitialAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed() {
            onInterstitialAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden() {
            onInterstitialAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded() {
            onInterstitialAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdClicked() {
            onNativeAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked() {
            onRewardedAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onRewardedAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed() {
            onRewardedAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden() {
            onRewardedAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded() {
            onRewardedAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onUserRewarded(MaxReward maxReward) {
            onUserRewarded(maxReward, null);
        }

        public /* synthetic */ b(h hVar, a aVar) {
            this();
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked(final Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f8344c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f8344c.d("MediationAdapterWrapper", h.this.f8347f + ": adview ad clicked with extra info: " + bundle);
            }
            a("onAdViewAdClicked", this.f8364a, new Runnable() { // from class: com.applovin.impl.mediation.p0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8439b.a(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdCollapsed(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f8344c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f8344c.d("MediationAdapterWrapper", h.this.f8347f + ": adview ad collapsed");
            }
            a("onAdViewAdCollapsed", this.f8364a, new Runnable() { // from class: com.applovin.impl.mediation.x0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8476b.a();
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f8344c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f8344c.k("MediationAdapterWrapper", h.this.f8347f + ": adview ad failed to display with error: " + maxAdapterError);
            }
            a("onAdViewAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f8344c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f8344c.d("MediationAdapterWrapper", h.this.f8347f + ": adview ad displayed with extra info: " + bundle);
            }
            a("onAdViewAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdExpanded(final Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f8344c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f8344c.d("MediationAdapterWrapper", h.this.f8347f + ": adview ad expanded");
            }
            a("onAdViewAdExpanded", this.f8364a, new Runnable() { // from class: com.applovin.impl.mediation.y0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8480b.b(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f8344c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f8344c.d("MediationAdapterWrapper", h.this.f8347f + ": adview ad hidden with extra info: " + bundle);
            }
            b("onAdViewAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoadFailed(MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.o unused = h.this.f8344c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f8344c.k("MediationAdapterWrapper", h.this.f8347f + ": adview ad ad failed to load with error: " + maxAdapterError);
            }
            a("onAdViewAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view, Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f8344c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f8344c.d("MediationAdapterWrapper", h.this.f8347f + ": adview ad loaded with extra info: " + bundle);
            }
            h.this.f8351j = view;
            c("onAdViewAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdClicked(final Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f8344c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f8344c.d("MediationAdapterWrapper", h.this.f8347f + ": app open ad clicked with extra info: " + bundle);
            }
            a("onAppOpenAdClicked", this.f8364a, new Runnable() { // from class: com.applovin.impl.mediation.n0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8425b.c(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f8344c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f8344c.k("MediationAdapterWrapper", h.this.f8347f + ": app open ad display failed with error: " + maxAdapterError);
            }
            a("onAppOpenAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayed(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f8344c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f8344c.d("MediationAdapterWrapper", h.this.f8347f + ": app open ad displayed with extra info: " + bundle);
            }
            a("onAppOpenAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdHidden(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f8344c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f8344c.d("MediationAdapterWrapper", h.this.f8347f + ": app open ad hidden with extra info: " + bundle);
            }
            b("onAppOpenAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoadFailed(MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.o unused = h.this.f8344c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f8344c.k("MediationAdapterWrapper", h.this.f8347f + ": app open ad failed to load with error: " + maxAdapterError);
            }
            a("onAppOpenAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoaded(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f8344c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f8344c.d("MediationAdapterWrapper", h.this.f8347f + ": app open ad loaded with extra info: " + bundle);
            }
            c("onAppOpenAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked(final Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f8344c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f8344c.d("MediationAdapterWrapper", h.this.f8347f + ": interstitial ad clicked with extra info: " + bundle);
            }
            a("onInterstitialAdClicked", this.f8364a, new Runnable() { // from class: com.applovin.impl.mediation.o0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8430b.d(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f8344c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f8344c.k("MediationAdapterWrapper", h.this.f8347f + ": interstitial ad failed to display with error " + maxAdapterError);
            }
            a("onInterstitialAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f8344c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f8344c.d("MediationAdapterWrapper", h.this.f8347f + ": interstitial ad displayed with extra info: " + bundle);
            }
            a("onInterstitialAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f8344c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f8344c.d("MediationAdapterWrapper", h.this.f8347f + ": interstitial ad hidden with extra info " + bundle);
            }
            b("onInterstitialAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoadFailed(MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.o unused = h.this.f8344c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f8344c.k("MediationAdapterWrapper", h.this.f8347f + ": interstitial ad failed to load with error " + maxAdapterError);
            }
            a("onInterstitialAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f8344c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f8344c.d("MediationAdapterWrapper", h.this.f8347f + ": interstitial ad loaded with extra info: " + bundle);
            }
            c("onInterstitialAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdClicked(final Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f8344c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f8344c.d("MediationAdapterWrapper", h.this.f8347f + ": native ad clicked");
            }
            a("onNativeAdClicked", this.f8364a, new Runnable() { // from class: com.applovin.impl.mediation.q0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8443b.e(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdDisplayed(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f8344c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f8344c.d("MediationAdapterWrapper", h.this.f8347f + ": native ad displayed with extra info: " + bundle);
            }
            a("onNativeAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoadFailed(MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.o unused = h.this.f8344c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f8344c.k("MediationAdapterWrapper", h.this.f8347f + ": native ad ad failed to load with error: " + maxAdapterError);
            }
            a("onNativeAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoaded(MaxNativeAd maxNativeAd, Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f8344c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f8344c.d("MediationAdapterWrapper", h.this.f8347f + ": native ad loaded with extra info: " + bundle);
            }
            h.this.f8352k = maxNativeAd;
            c("onNativeAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked(final Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f8344c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f8344c.d("MediationAdapterWrapper", h.this.f8347f + ": rewarded ad clicked with extra info: " + bundle);
            }
            a("onRewardedAdClicked", this.f8364a, new Runnable() { // from class: com.applovin.impl.mediation.a1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8056b.f(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f8344c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f8344c.k("MediationAdapterWrapper", h.this.f8347f + ": rewarded ad display failed with error: " + maxAdapterError);
            }
            a("onRewardedAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f8344c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f8344c.d("MediationAdapterWrapper", h.this.f8347f + ": rewarded ad displayed with extra info: " + bundle);
            }
            a("onRewardedAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f8344c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f8344c.d("MediationAdapterWrapper", h.this.f8347f + ": rewarded ad hidden with extra info: " + bundle);
            }
            b("onRewardedAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoadFailed(MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.o unused = h.this.f8344c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f8344c.k("MediationAdapterWrapper", h.this.f8347f + ": rewarded ad failed to load with error: " + maxAdapterError);
            }
            a("onRewardedAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f8344c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f8344c.d("MediationAdapterWrapper", h.this.f8347f + ": rewarded ad loaded with extra info: " + bundle);
            }
            c("onRewardedAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onUserRewarded(final MaxReward maxReward, final Bundle bundle) {
            if (h.this.f8350i instanceof c3) {
                final c3 c3Var = (c3) h.this.f8350i;
                if (c3Var.t0().compareAndSet(false, true)) {
                    com.applovin.impl.sdk.o unused = h.this.f8344c;
                    if (com.applovin.impl.sdk.o.a()) {
                        h.this.f8344c.d("MediationAdapterWrapper", h.this.f8347f + ": user was rewarded: " + maxReward);
                    }
                    a("onUserRewarded", this.f8364a, new Runnable() { // from class: com.applovin.impl.mediation.s0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f8451b.a(c3Var, maxReward, bundle);
                        }
                    });
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(Bundle bundle) {
            this.f8364a.d(h.this.f8350i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(MediationServiceImpl.b bVar) {
            if (bVar != null) {
                this.f8364a = bVar;
                return;
            }
            throw new IllegalArgumentException("No listener specified");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(Bundle bundle) {
            this.f8364a.a(h.this.f8350i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, final MaxError maxError) {
            if (h.this.f8350i.w().get()) {
                com.applovin.impl.sdk.o unused = h.this.f8344c;
                if (com.applovin.impl.sdk.o.a()) {
                    h.this.f8344c.b("MediationAdapterWrapper", h.this.f8347f + ": blocking ad load failed callback for " + h.this.f8350i + " since onAdHidden() has been called");
                }
                h.this.f8343b.t().a(h.this.f8350i, str);
                return;
            }
            a(str, this.f8364a, new Runnable() { // from class: com.applovin.impl.mediation.m0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8418b.a(maxError);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxError maxError) {
            if (h.this.f8358q.compareAndSet(false, true)) {
                this.f8364a.onAdLoadFailed(h.this.f8349h, maxError);
            }
        }

        private void a(String str, final Bundle bundle) {
            if (h.this.f8350i.w().get()) {
                com.applovin.impl.sdk.o unused = h.this.f8344c;
                if (com.applovin.impl.sdk.o.a()) {
                    h.this.f8344c.b("MediationAdapterWrapper", h.this.f8347f + ": blocking ad displayed callback for " + h.this.f8350i + " since onAdHidden() has been called");
                }
                h.this.f8343b.t().a(h.this.f8350i, str);
                return;
            }
            if (!((Boolean) h.this.f8343b.a(r3.f8963w8)).booleanValue()) {
                if (h.this.f8350i.u().compareAndSet(false, true)) {
                    a(str, this.f8364a, new Runnable() { // from class: com.applovin.impl.mediation.w0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f8471b.h(bundle);
                        }
                    });
                    return;
                }
                return;
            }
            a(str, this.f8364a, new Runnable() { // from class: com.applovin.impl.mediation.v0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8468b.g(bundle);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, final MaxError maxError, final Bundle bundle) {
            if (h.this.f8350i.w().get()) {
                com.applovin.impl.sdk.o unused = h.this.f8344c;
                if (com.applovin.impl.sdk.o.a()) {
                    h.this.f8344c.b("MediationAdapterWrapper", h.this.f8347f + ": blocking ad display failed callback for " + h.this.f8350i + " since onAdHidden() has been called");
                }
                h.this.f8343b.t().a(h.this.f8350i, str);
                return;
            }
            a(str, this.f8364a, new Runnable() { // from class: com.applovin.impl.mediation.z0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8485b.a(maxError, bundle);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxError maxError, Bundle bundle) {
            this.f8364a.a(h.this.f8350i, maxError, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(c3 c3Var, MaxReward maxReward, Bundle bundle) {
            this.f8364a.a(c3Var, maxReward, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Bundle bundle) {
            this.f8364a.a(h.this.f8350i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            this.f8364a.onAdCollapsed(h.this.f8350i);
        }

        private void a(final String str, final MaxAdListener maxAdListener, final Runnable runnable) {
            h.this.f8342a.post(new Runnable() { // from class: com.applovin.impl.mediation.u0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8463b.a(runnable, maxAdListener, str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Runnable runnable, MaxAdListener maxAdListener, String str) {
            try {
                runnable.run();
            } catch (Throwable th2) {
                com.applovin.impl.sdk.o.c("MediationAdapterWrapper", "Failed to forward call (" + str + ") to " + (maxAdListener != null ? maxAdListener.getClass().getName() : null), th2);
                h.this.f8343b.D().a("MediationAdapterWrapper", str, th2, CollectionUtils.hashMap("adapter_class", h.this.f8346e.b()));
            }
        }
    }

    public static class c implements MaxAdapter.OnCompletionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f8366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final k3 f8367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f8368c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final MaxAdapter.OnCompletionListener f8369d;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAdapter.InitializationStatus initializationStatus, String str) {
            this.f8366a.S().a(this.f8367b, SystemClock.elapsedRealtime() - this.f8368c, initializationStatus, str);
            MaxAdapter.OnCompletionListener onCompletionListener = this.f8369d;
            if (onCompletionListener != null) {
                onCompletionListener.onCompletion(initializationStatus, str);
            }
        }

        @Override // com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener
        public void onCompletion(final MaxAdapter.InitializationStatus initializationStatus, final String str) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.b1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8199b.a(initializationStatus, str);
                }
            }, this.f8367b.h());
        }

        public c(com.applovin.impl.sdk.k kVar, k3 k3Var, long j10, MaxAdapter.OnCompletionListener onCompletionListener) {
            this.f8366a = kVar;
            this.f8367b = k3Var;
            this.f8368c = j10;
            this.f8369d = onCompletionListener;
        }
    }

    public class d extends i5 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final WeakReference f8370g;

        public /* synthetic */ d(h hVar, a aVar) {
            this();
        }

        private d() {
            super("TaskTimeoutMediatedAd", h.this.f8343b);
            this.f8370g = new WeakReference(h.this.f8355n);
        }

        private void b(y2 y2Var) {
            if (y2Var != null) {
                this.f7705a.Z().a(y2Var);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (h.this.f8358q.get()) {
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.b(this.f7706b, h.this.f8347f + " is timing out " + h.this.f8350i + "...");
            }
            b(h.this.f8350i);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-5101, "Adapter timed out");
            b bVar = (b) this.f8370g.get();
            if (bVar != null) {
                bVar.a(this.f7706b, maxErrorImpl);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        a("destroy");
        MaxAdapter maxAdapter = this.f8348g;
        if (maxAdapter != null) {
            this.f8348g = null;
            maxAdapter.onDestroy();
        } else if (com.applovin.impl.sdk.o.a()) {
            this.f8344c.k("MediationAdapterWrapper", "Mediation adapter '" + this.f8347f + "' is already destroyed");
        }
        this.f8351j = null;
        this.f8352k = null;
        this.f8353l = null;
        this.f8354m = null;
    }

    public boolean k() {
        return this.f8357p.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxAppOpenAdapter) this.f8348g).loadAppOpenAd(maxAdapterResponseParameters, activity, this.f8355n);
    }

    public MediationServiceImpl.b c() {
        return this.f8355n.f8364a;
    }

    public View d() {
        return this.f8351j;
    }

    public MaxNativeAd e() {
        return this.f8352k;
    }

    public MaxNativeAdView f() {
        return this.f8353l;
    }

    public String g() {
        return this.f8345d;
    }

    public ViewGroup h() {
        return this.f8354m;
    }

    public String i() {
        MaxAdapter maxAdapter = this.f8348g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getSdkVersion();
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("MediationAdapterWrapper", "Failed to get adapter's SDK version for " + this.f8345d, th2);
            this.f8343b.D().a("MediationAdapterWrapper", "sdk_version", th2, CollectionUtils.hashMap("adapter_class", this.f8346e.b()));
            a("sdk_version");
            this.f8343b.T().a(this.f8346e.b(), "sdk_version", this.f8350i);
            return null;
        }
    }

    public boolean j() {
        return this.f8358q.get() && this.f8359r.get();
    }

    public String toString() {
        return "MediationAdapterWrapper{adapterTag='" + this.f8347f + "'}";
    }

    public h(k3 k3Var, MaxAdapter maxAdapter, boolean z10, com.applovin.impl.sdk.k kVar) {
        if (k3Var != null) {
            if (maxAdapter != null) {
                if (kVar != null) {
                    this.f8345d = k3Var.c();
                    this.f8348g = maxAdapter;
                    this.f8343b = kVar;
                    this.f8344c = kVar.O();
                    this.f8346e = k3Var;
                    this.f8347f = maxAdapter.getClass().getSimpleName();
                    this.f8360s = z10;
                    return;
                }
                throw new IllegalArgumentException("No sdk specified");
            }
            throw new IllegalArgumentException("No adapter specified");
        }
        throw new IllegalArgumentException("No adapter name specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxRewardedAdapter) this.f8348g).loadRewardedAd(maxAdapterResponseParameters, activity, this.f8355n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MediationAdapterBase) this.f8348g).loadNativeAd(maxAdapterResponseParameters, activity, this.f8355n);
    }

    public void a(final MaxAdapterInitializationParameters maxAdapterInitializationParameters, final Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) {
        b(MobileAdsBridgeBase.initializeMethodName, new Runnable() { // from class: com.applovin.impl.mediation.d0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8238b.a(onCompletionListener, maxAdapterInitializationParameters, activity);
            }
        });
    }

    public void b(y2 y2Var, final Activity activity) {
        Runnable runnable;
        if (a(y2Var, activity)) {
            if (y2Var.getFormat() == MaxAdFormat.INTERSTITIAL) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8312b.a(activity);
                    }
                };
            } else if (y2Var.getFormat() == MaxAdFormat.APP_OPEN) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.f0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8326b.b(activity);
                    }
                };
            } else if (y2Var.getFormat() == MaxAdFormat.REWARDED) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.g0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8340b.c(activity);
                    }
                };
            } else {
                throw new IllegalStateException("Failed to show " + y2Var + ": " + y2Var.getFormat() + " is not a supported ad format");
            }
            a(runnable, y2Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MaxAdapter.OnCompletionListener onCompletionListener, MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (com.applovin.impl.sdk.o.a()) {
            this.f8344c.a("MediationAdapterWrapper", "Initializing " + this.f8347f + " on thread: " + Thread.currentThread() + " with 'run_on_ui_thread' value: " + this.f8346e.r());
        }
        this.f8348g.initialize(maxAdapterInitializationParameters, activity, new c(this.f8343b, this.f8346e, jElapsedRealtime, onCompletionListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Activity activity) {
        ((MaxRewardedAdapter) this.f8348g).showRewardedAd(this.f8356o, activity, this.f8355n);
    }

    public void a(String str, y2 y2Var) {
        this.f8349h = str;
        this.f8350i = y2Var;
    }

    public void a(MaxNativeAdView maxNativeAdView) {
        this.f8353l = maxNativeAdView;
    }

    public void a(ViewGroup viewGroup) {
        this.f8354m = viewGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Activity activity) {
        ((MaxAppOpenAdapter) this.f8348g).showAppOpenAd(this.f8356o, activity, this.f8355n);
    }

    public void a(String str, final MaxAdapterResponseParameters maxAdapterResponseParameters, final y2 y2Var, final Activity activity, MediationServiceImpl.b bVar) {
        final Runnable runnable;
        if (y2Var != null) {
            if (!this.f8357p.get()) {
                String str2 = "Mediation adapter '" + this.f8347f + "' was disabled due to earlier failures. Loading ads with this adapter is disabled.";
                com.applovin.impl.sdk.o.h("MediationAdapterWrapper", str2);
                bVar.onAdLoadFailed(str, new MaxErrorImpl(-1, str2));
                return;
            }
            this.f8356o = maxAdapterResponseParameters;
            this.f8355n.a(bVar);
            final MaxAdFormat format = y2Var.getFormat();
            if (format == MaxAdFormat.INTERSTITIAL) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8473b.a(maxAdapterResponseParameters, activity);
                    }
                };
            } else if (format == MaxAdFormat.APP_OPEN) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8477b.b(maxAdapterResponseParameters, activity);
                    }
                };
            } else if (format == MaxAdFormat.REWARDED) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8482b.c(maxAdapterResponseParameters, activity);
                    }
                };
            } else if (format == MaxAdFormat.NATIVE) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8053b.d(maxAdapterResponseParameters, activity);
                    }
                };
            } else if (format.isAdViewAd()) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.b0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8195b.a(maxAdapterResponseParameters, format, activity);
                    }
                };
            } else {
                throw new IllegalStateException("Failed to load " + y2Var + ": " + y2Var.getFormat() + " is not a supported ad format");
            }
            a(Constants.LOAD_AD, format, new Runnable() { // from class: com.applovin.impl.mediation.c0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8206b.a(y2Var, runnable);
                }
            });
            return;
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(ViewGroup viewGroup, Lifecycle lifecycle, Activity activity) {
        ((MaxRewardedAdViewAdapter) this.f8348g).showRewardedAd(this.f8356o, viewGroup, lifecycle, activity, this.f8355n);
    }

    public String b() {
        MaxAdapter maxAdapter = this.f8348g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getAdapterVersion();
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("MediationAdapterWrapper", "Failed to get adapter version for " + this.f8345d, th2);
            this.f8343b.D().a("MediationAdapterWrapper", "adapter_version", th2, CollectionUtils.hashMap("adapter_class", this.f8346e.b()));
            a("adapter_version");
            this.f8343b.T().a(this.f8346e.b(), "adapter_version", this.f8350i);
            return null;
        }
    }

    private void b(String str, Runnable runnable) {
        a(str, (MaxAdFormat) null, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxInterstitialAdapter) this.f8348g).loadInterstitialAd(maxAdapterResponseParameters, activity, this.f8355n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity) {
        ((MaxAdViewAdapter) this.f8348g).loadAdViewAd(maxAdapterResponseParameters, maxAdFormat, activity, this.f8355n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(y2 y2Var, Runnable runnable) {
        a(this.f8346e, y2Var);
        try {
            runnable.run();
        } catch (Throwable th2) {
            String str = "Failed to start loading ad for " + this.f8345d + " due to: " + th2;
            com.applovin.impl.sdk.o.h("MediationAdapterWrapper", str);
            this.f8355n.a(Constants.LOAD_AD, new MaxErrorImpl(-1, str));
            this.f8343b.D().a("MediationAdapterWrapper", Constants.LOAD_AD, th2, CollectionUtils.hashMap("adapter_class", this.f8346e.b()));
            a(Constants.LOAD_AD);
            this.f8343b.T().a(this.f8346e.b(), Constants.LOAD_AD, this.f8350i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity) {
        ((MaxInterstitialAdapter) this.f8348g).showInterstitialAd(this.f8356o, activity, this.f8355n);
    }

    public void a(y2 y2Var, final ViewGroup viewGroup, final Lifecycle lifecycle, final Activity activity) {
        Runnable runnable;
        if (a(y2Var, activity)) {
            if (y2Var.getFormat() == MaxAdFormat.INTERSTITIAL) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8401b.a(viewGroup, lifecycle, activity);
                    }
                };
            } else if (y2Var.getFormat() == MaxAdFormat.REWARDED) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.l0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8411b.b(viewGroup, lifecycle, activity);
                    }
                };
            } else {
                throw new IllegalStateException("Failed to show " + y2Var + ": " + y2Var.getFormat() + " is not a supported ad format");
            }
            a(runnable, y2Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ViewGroup viewGroup, Lifecycle lifecycle, Activity activity) {
        ((MaxInterstitialAdViewAdapter) this.f8348g).showInterstitialAd(this.f8356o, viewGroup, lifecycle, activity, this.f8355n);
    }

    private boolean a(y2 y2Var, Activity activity) {
        if (y2Var != null) {
            if (y2Var.A() == null) {
                com.applovin.impl.sdk.o.h("MediationAdapterWrapper", "Adapter has been garbage collected");
                this.f8355n.a("ad_show", new MaxErrorImpl(-1, "Adapter has been garbage collected"), (Bundle) null);
                return false;
            }
            if (y2Var.A() == this) {
                if (activity == null && MaxAdFormat.APP_OPEN != y2Var.getFormat()) {
                    throw new IllegalArgumentException("No activity specified");
                }
                if (!this.f8357p.get()) {
                    String str = "Mediation adapter '" + this.f8347f + "' is disabled. Showing ads with this adapter is disabled.";
                    com.applovin.impl.sdk.o.h("MediationAdapterWrapper", str);
                    this.f8355n.a("ad_show", new MaxErrorImpl(-1, str), (Bundle) null);
                    return false;
                }
                if (j()) {
                    return true;
                }
                throw new IllegalStateException("Mediation adapter '" + this.f8347f + "' does not have an ad loaded. Please load an ad first");
            }
            throw new IllegalArgumentException("Mediated ad belongs to a different adapter");
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    private void a(final Runnable runnable, y2 y2Var) {
        y2Var.d0();
        a("show_ad", y2Var.getFormat(), new Runnable() { // from class: com.applovin.impl.mediation.j0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8392b.a(runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th2) {
            String str = "Failed to start displaying ad for " + this.f8345d + " due to: " + th2;
            com.applovin.impl.sdk.o.h("MediationAdapterWrapper", str);
            this.f8355n.a("show_ad", new MaxErrorImpl(-1, str), (Bundle) null);
            this.f8343b.D().a("MediationAdapterWrapper", "show_ad", th2, CollectionUtils.hashMap("adapter_class", this.f8346e.b()));
            a("show_ad");
            this.f8343b.T().a(this.f8346e.b(), "show_ad", this.f8350i);
        }
    }

    public void a(final MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, final d5 d5Var, final Activity activity, final s4 s4Var) {
        if (s4Var != null) {
            if (!this.f8357p.get()) {
                com.applovin.impl.sdk.o.h("MediationAdapterWrapper", "Mediation adapter '" + this.f8347f + "' is disabled. Signal collection ads with this adapter is disabled.");
                s4Var.a(new MaxErrorImpl("The adapter (" + this.f8347f + ") is disabled"));
                return;
            }
            MaxAdapter maxAdapter = this.f8348g;
            if (maxAdapter instanceof MaxSignalProvider) {
                final MaxSignalProvider maxSignalProvider = (MaxSignalProvider) maxAdapter;
                b("collect_signal", new Runnable() { // from class: com.applovin.impl.mediation.i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8379b.a(maxSignalProvider, maxAdapterSignalCollectionParameters, activity, d5Var, s4Var);
                    }
                });
                return;
            }
            s4Var.a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_NOT_SUPPORTED, "The adapter (" + this.f8347f + ") does not support signal collection"));
            return;
        }
        throw new IllegalArgumentException("No callback specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MaxSignalProvider maxSignalProvider, MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, d5 d5Var, s4 s4Var) {
        try {
            maxSignalProvider.collectSignal(maxAdapterSignalCollectionParameters, activity, new a(d5Var, s4Var));
        } catch (Throwable th2) {
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl("Failed signal collection for " + this.f8345d + " due to: " + th2);
            com.applovin.impl.sdk.o.h("MediationAdapterWrapper", maxErrorImpl.getMessage());
            s4Var.a(maxErrorImpl);
            this.f8343b.D().a("MediationAdapterWrapper", "collect_signal", th2, CollectionUtils.hashMap("adapter_class", this.f8346e.b()));
            a("collect_signal");
            this.f8343b.T().a(this.f8346e.b(), "collect_signal", this.f8350i);
        }
        if (!s4Var.d() && d5Var.m() == 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8344c.a("MediationAdapterWrapper", "Failing signal collection " + d5Var + " since it has 0 timeout");
            }
            s4Var.a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_TIMEOUT, "The adapter (" + this.f8347f + ") has 0 timeout"));
        }
    }

    public void a() {
        if (this.f8360s) {
            return;
        }
        b("destroy", new Runnable() { // from class: com.applovin.impl.mediation.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f8470b.l();
            }
        });
    }

    private void a(k3 k3Var, y2 y2Var) {
        a(new d(this, null), k3Var, y2Var);
    }

    private void a(i5 i5Var, k3 k3Var, y2 y2Var) {
        long jM = k3Var.m();
        if (jM <= 0) {
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVar = this.f8344c;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Non-positive timeout set for ");
                if (y2Var != null) {
                    k3Var = y2Var;
                }
                sb2.append(k3Var);
                sb2.append(", not scheduling a timeout");
                oVar.a("MediationAdapterWrapper", sb2.toString());
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            com.applovin.impl.sdk.o oVar2 = this.f8344c;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Setting timeout ");
            sb3.append(jM);
            sb3.append("ms for ");
            if (y2Var != null) {
                k3Var = y2Var;
            }
            sb3.append(k3Var);
            oVar2.a("MediationAdapterWrapper", sb3.toString());
        }
        this.f8343b.q0().a(i5Var, d6.b.TIMEOUT, jM);
    }

    private void a(String str) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f8344c.d("MediationAdapterWrapper", "Marking " + this.f8347f + " as disabled due to: " + str);
        }
        this.f8357p.set(false);
    }

    private void a(final String str, MaxAdFormat maxAdFormat, final Runnable runnable) {
        Runnable runnable2 = new Runnable() { // from class: com.applovin.impl.mediation.h0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8372b.a(str, runnable);
            }
        };
        if (a(str, maxAdFormat)) {
            this.f8342a.post(runnable2);
            return;
        }
        r6 r6Var = new r6(this.f8343b, str + StringUtils.PROCESS_POSTFIX_DELIMITER + this.f8346e.c(), runnable2);
        if (((Boolean) this.f8343b.a(x4.Z)).booleanValue()) {
            this.f8343b.q0().a(r6Var, this.f8346e);
        } else {
            this.f8343b.q0().a(r6Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        try {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8344c.a("MediationAdapterWrapper", this.f8347f + ": running " + str + "...");
            }
            runnable.run();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8344c.a("MediationAdapterWrapper", this.f8347f + ": finished " + str + "");
            }
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("MediationAdapterWrapper", "Failed operation " + str + " for " + this.f8345d, th2);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("fail_");
            sb2.append(str);
            a(sb2.toString());
            if (!str.equals("destroy")) {
                this.f8343b.T().a(this.f8346e.b(), str, this.f8350i);
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("is_wrapper", "true");
            CollectionUtils.putStringIfValid("adapter_class", this.f8346e.b(), mapHashMap);
            this.f8343b.D().a("MediationAdapterWrapper", str, th2, mapHashMap);
        }
    }

    private boolean a(String str, MaxAdFormat maxAdFormat) {
        Boolean boolG0;
        Boolean boolI0;
        Boolean boolH0;
        MaxAdapter maxAdapter = this.f8348g;
        if (maxAdapter == null) {
            return this.f8346e.r();
        }
        if (MobileAdsBridgeBase.initializeMethodName.equals(str)) {
            Boolean boolShouldInitializeOnUiThread = maxAdapter.shouldInitializeOnUiThread();
            if (boolShouldInitializeOnUiThread != null) {
                return boolShouldInitializeOnUiThread.booleanValue();
            }
        } else if ("collect_signal".equals(str)) {
            Boolean boolShouldCollectSignalsOnUiThread = maxAdapter.shouldCollectSignalsOnUiThread();
            if (boolShouldCollectSignalsOnUiThread != null) {
                return boolShouldCollectSignalsOnUiThread.booleanValue();
            }
        } else if (Constants.LOAD_AD.equals(str) && maxAdFormat != null) {
            y2 y2Var = this.f8350i;
            if (y2Var != null && (boolH0 = y2Var.h0()) != null) {
                return boolH0.booleanValue();
            }
            Boolean boolShouldLoadAdsOnUiThread = maxAdapter.shouldLoadAdsOnUiThread(maxAdFormat);
            if (boolShouldLoadAdsOnUiThread != null) {
                return boolShouldLoadAdsOnUiThread.booleanValue();
            }
        } else if ("show_ad".equals(str) && maxAdFormat != null) {
            y2 y2Var2 = this.f8350i;
            if (y2Var2 != null && (boolI0 = y2Var2.i0()) != null) {
                return boolI0.booleanValue();
            }
            Boolean boolShouldShowAdsOnUiThread = maxAdapter.shouldShowAdsOnUiThread(maxAdFormat);
            if (boolShouldShowAdsOnUiThread != null) {
                return boolShouldShowAdsOnUiThread.booleanValue();
            }
        } else if ("destroy".equals(str)) {
            y2 y2Var3 = this.f8350i;
            if (y2Var3 != null && (boolG0 = y2Var3.g0()) != null) {
                return boolG0.booleanValue();
            }
            Boolean boolShouldDestroyOnUiThread = maxAdapter.shouldDestroyOnUiThread();
            if (boolShouldDestroyOnUiThread != null) {
                return boolShouldDestroyOnUiThread.booleanValue();
            }
            return true;
        }
        return this.f8346e.r();
    }
}
