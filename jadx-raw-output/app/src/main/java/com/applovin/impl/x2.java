package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes5.dex */
public class x2 extends MaxNativeAdListener implements MaxAdRevenueListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f9867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MaxNativeAdLoader f9868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Queue f9869c = new LinkedList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f9870d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f9871e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f9872f;

    public interface a {
        void onAdRevenuePaid(MaxAd maxAd);

        void onNativeAdClicked(MaxAd maxAd);

        void onNativeAdLoadFailed(String str, MaxError maxError);

        void onNativeAdLoaded();
    }

    public void a(MaxAd maxAd) {
        this.f9868b.destroy(maxAd);
    }

    public void c() {
        this.f9872f = null;
        a();
        this.f9868b.destroy();
    }

    public void a() {
        synchronized (this.f9871e) {
            Iterator it = this.f9869c.iterator();
            while (it.hasNext()) {
                a((MaxAd) it.next());
            }
            this.f9869c.clear();
        }
    }

    public MaxAd b() {
        MaxAd maxAd;
        synchronized (this.f9871e) {
            maxAd = null;
            while (!this.f9869c.isEmpty() && (maxAd == null || maxAd.getNativeAd().isExpired())) {
                maxAd = (MaxAd) this.f9869c.remove();
            }
            e();
        }
        return maxAd;
    }

    public boolean d() {
        boolean z10;
        synchronized (this.f9871e) {
            z10 = !this.f9869c.isEmpty();
        }
        return z10;
    }

    public void e() {
        synchronized (this.f9871e) {
            if (!this.f9870d && this.f9869c.size() < this.f9867a) {
                this.f9870d = true;
                this.f9868b.loadAd();
            }
        }
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        a aVar = this.f9872f;
        if (aVar != null) {
            aVar.onAdRevenuePaid(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdClicked(MaxAd maxAd) {
        a aVar = this.f9872f;
        if (aVar != null) {
            aVar.onNativeAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        a aVar = this.f9872f;
        if (aVar != null) {
            aVar.onNativeAdLoadFailed(str, maxError);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        synchronized (this.f9871e) {
            this.f9869c.add(maxAd);
            this.f9870d = false;
            e();
        }
        a aVar = this.f9872f;
        if (aVar != null) {
            aVar.onNativeAdLoaded();
        }
    }

    public x2(MaxAdPlacerSettings maxAdPlacerSettings, Context context, a aVar) {
        this.f9867a = maxAdPlacerSettings.getMaxPreloadedAdCount();
        this.f9872f = aVar;
        MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(maxAdPlacerSettings.getAdUnitId(), context);
        this.f9868b = maxNativeAdLoader;
        maxNativeAdLoader.setNativeAdListener(this);
        maxNativeAdLoader.setRevenueListener(this);
        maxNativeAdLoader.setPlacement(maxAdPlacerSettings.getPlacement());
        maxNativeAdLoader.setLocalExtraParameter(MaxNativeAdLoaderImpl.KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE, i.NATIVE_AD_PLACER);
    }

    public boolean a(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        return this.f9868b.render(maxNativeAdView, maxAd);
    }
}
