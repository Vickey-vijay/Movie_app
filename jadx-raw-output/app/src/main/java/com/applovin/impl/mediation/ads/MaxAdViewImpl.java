package com.applovin.impl.mediation.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.applovin.impl.b3;
import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.e8;
import com.applovin.impl.f8;
import com.applovin.impl.g8;
import com.applovin.impl.i5;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.n7;
import com.applovin.impl.o0;
import com.applovin.impl.r3;
import com.applovin.impl.r6;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxAdViewConfiguration;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes8.dex */
public class MaxAdViewImpl extends com.applovin.impl.mediation.ads.a implements com.applovin.impl.sdk.f.a, g8.a, com.applovin.impl.j.b {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f8058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MaxAdView f8059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final View f8061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f8062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b3 f8063f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f8064g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f8065h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final MaxAdViewConfiguration f8066i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b f8067j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final d f8068k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.applovin.impl.sdk.f f8069l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final f8 f8070m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final g8 f8071n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Object f8072o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Object f8073p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private b3 f8074q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private MaxAd f8075r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f8076s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f8077t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f8078u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final AtomicBoolean f8079v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f8080w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f8081x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f8082y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f8083z;

    public class b extends c {
        private b() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            com.applovin.impl.sdk.o oVar = MaxAdViewImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdListener.onAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + MaxAdViewImpl.this.adListener);
            }
            t2.a(MaxAdViewImpl.this.adListener, str, maxError, true);
            MaxAdViewImpl.this.a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (MaxAdViewImpl.this.a()) {
                com.applovin.impl.sdk.o oVar = MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Precache ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
                }
                MaxAdViewImpl.this.sdk.X().destroyAd(maxAd);
                return;
            }
            b3 b3Var = (b3) maxAd;
            b3Var.g(MaxAdViewImpl.this.f8064g);
            b3Var.f(MaxAdViewImpl.this.f8065h);
            if (b3Var.y() == null) {
                MaxAdViewImpl.this.sdk.X().destroyAd(b3Var);
                onAdLoadFailed(b3Var.getAdUnitId(), new MaxErrorImpl(-5001, "Ad view not fully loaded"));
                return;
            }
            if (b3Var.w0()) {
                long jR0 = b3Var.r0();
                MaxAdViewImpl.this.sdk.O();
                if (com.applovin.impl.sdk.o.a()) {
                    MaxAdViewImpl.this.sdk.O().a(MaxAdViewImpl.this.tag, "Scheduling banner ad refresh " + jR0 + " milliseconds from now for '" + MaxAdViewImpl.this.adUnitId + "'...");
                }
                MaxAdViewImpl.this.f8069l.a(jR0);
                if (MaxAdViewImpl.this.f8069l.g() || MaxAdViewImpl.this.f8078u) {
                    com.applovin.impl.sdk.o oVar2 = MaxAdViewImpl.this.logger;
                    if (com.applovin.impl.sdk.o.a()) {
                        MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                        maxAdViewImpl2.logger.a(maxAdViewImpl2.tag, "Pausing ad refresh for publisher");
                    }
                    MaxAdViewImpl.this.f8069l.j();
                }
            }
            com.applovin.impl.sdk.o oVar3 = MaxAdViewImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxAdViewImpl maxAdViewImpl3 = MaxAdViewImpl.this;
                maxAdViewImpl3.logger.a(maxAdViewImpl3.tag, "MaxAdListener.onAdLoaded(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
            }
            t2.f(MaxAdViewImpl.this.adListener, maxAd, true);
            MaxAdViewImpl.this.d(b3Var);
        }
    }

    public abstract class c implements MaxAdListener, MaxAdViewAdListener, MaxAdRevenueListener, com.applovin.impl.mediation.ads.a.InterfaceC0040a {
        private c() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f8074q)) {
                com.applovin.impl.sdk.o oVar = MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdListener.onAdClicked(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                t2.a(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f8075r)) {
                MaxAdViewImpl.this.f8075r = null;
                if ((MaxAdViewImpl.this.f8074q.x0() || MaxAdViewImpl.this.B) && MaxAdViewImpl.this.f8076s) {
                    MaxAdViewImpl.this.f8076s = false;
                    MaxAdViewImpl.this.startAutoRefresh();
                }
                com.applovin.impl.sdk.o oVar = MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdViewAdListener.onAdCollapsed(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                t2.b(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            if (maxAd.equals(MaxAdViewImpl.this.f8074q)) {
                com.applovin.impl.sdk.o oVar = MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdListener.onAdDisplayFailed(ad=" + maxAd + ", error=" + maxError + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                t2.a(MaxAdViewImpl.this.adListener, maxAd, maxError, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f8074q)) {
                com.applovin.impl.sdk.o oVar = MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdListener.onAdDisplayed(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                t2.c(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f8074q)) {
                MaxAdViewImpl.this.f8075r = maxAd;
                if ((MaxAdViewImpl.this.f8074q.x0() || MaxAdViewImpl.this.B) && !MaxAdViewImpl.this.f8069l.g()) {
                    MaxAdViewImpl.this.f8076s = true;
                    MaxAdViewImpl.this.stopAutoRefresh();
                }
                com.applovin.impl.sdk.o oVar = MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdViewAdListener.onAdExpanded(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                t2.d(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f8074q)) {
                com.applovin.impl.sdk.o oVar = MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdListener.onAdHidden(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                t2.e(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
            com.applovin.impl.sdk.o oVar = MaxAdViewImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdRequestListener.onAdRequestStarted(adUnitId=" + str + "), listener=" + MaxAdViewImpl.this.requestListener);
            }
            t2.a(MaxAdViewImpl.this.requestListener, str, true);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            com.applovin.impl.sdk.o oVar = MaxAdViewImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.revenueListener);
            }
            t2.a(MaxAdViewImpl.this.revenueListener, maxAd, true);
        }
    }

    public class d extends c {
        private d() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            com.applovin.impl.sdk.o oVar = MaxAdViewImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Failed to precache ad for refresh with error code: " + maxError.getCode());
            }
            MaxAdViewImpl.this.a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (!MaxAdViewImpl.this.f8081x) {
                com.applovin.impl.sdk.o oVar = MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Successfully precached ad for refresh");
                }
                if (((Boolean) MaxAdViewImpl.this.sdk.a(r3.H7)).booleanValue()) {
                    MaxAdViewImpl.this.b(maxAd);
                    return;
                } else {
                    MaxAdViewImpl.this.a(maxAd);
                    return;
                }
            }
            com.applovin.impl.sdk.o oVar2 = MaxAdViewImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                maxAdViewImpl2.logger.a(maxAdViewImpl2.tag, "Ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
            }
            MaxAdViewImpl.this.sdk.X().destroyAd(maxAd);
        }
    }

    public void loadAd() {
        loadAd(com.applovin.impl.i.PUBLISHER_INITIATED);
    }

    public void setPublisherBackgroundColor(int i10) {
        this.f8062e = i10;
    }

    public void startAutoRefresh() {
        this.f8078u = false;
        if (!this.f8069l.g()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Ignoring call to startAutoRefresh() - ad refresh is not paused");
                return;
            }
            return;
        }
        this.f8069l.m();
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Resumed auto-refresh with remaining time: " + this.f8069l.b() + "ms");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final b3 b3Var) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.ads.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f8136b.b(b3Var);
            }
        });
    }

    private void e() {
        this.f8079v.set(false);
        if (this.f8063f != null) {
            i();
            return;
        }
        if (!b()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Refreshing ad from network...");
            }
            loadAd(com.applovin.impl.i.REFRESH);
        } else if (this.f8077t) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Refreshing ad from network due to viewability requirements not met for refresh request...");
            }
            loadAd(com.applovin.impl.i.REFRESH);
        } else {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.b(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
            }
            this.f8079v.set(true);
        }
    }

    private void f() {
        boolean z10;
        boolean z11;
        synchronized (this.f8073p) {
            z10 = false;
            this.f8079v.set(false);
            z11 = this.f8063f != null;
            if (!z11) {
                if (b()) {
                    if (!this.f8077t) {
                        if (com.applovin.impl.sdk.o.a()) {
                            this.logger.b(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
                        }
                        this.f8079v.set(true);
                    } else if (com.applovin.impl.sdk.o.a()) {
                        this.logger.a(this.tag, "Refreshing ad from network due to viewability requirements not met for refresh request...");
                    }
                } else if (com.applovin.impl.sdk.o.a()) {
                    this.logger.a(this.tag, "Refreshing ad from network...");
                }
                z10 = true;
            }
        }
        if (z11) {
            i();
        } else if (z10) {
            loadAd(com.applovin.impl.i.REFRESH);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        h();
        if (this.f8063f != null) {
            this.sdk.X().destroyAd(this.f8063f);
        }
        synchronized (this.f8072o) {
            this.f8081x = true;
        }
        this.f8069l.a();
        this.sdk.j().b(this);
        if (this.sdk.R() != null) {
            this.sdk.R().c(this.adUnitId, this.f8060c);
        } else {
            this.sdk.Q().c(this.adUnitId, this.f8060c);
        }
        super.destroy();
    }

    private void h() {
        b3 b3Var;
        MaxAdView maxAdView = this.f8059b;
        if (maxAdView != null) {
            com.applovin.impl.s.a(maxAdView, this.f8061d);
        }
        this.f8071n.b();
        synchronized (this.f8072o) {
            b3Var = this.f8074q;
        }
        MaxAd maxAd = this.f8075r;
        if (maxAd != null && maxAd.equals(b3Var)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Collapsing ad manually for removed ad.");
            }
            t2.b(this.f8067j, maxAd);
        }
        if (b3Var != null) {
            this.sdk.X().destroyAd(b3Var);
        }
    }

    private void i() {
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Rendering for cached ad: " + this.f8063f + "...");
        }
        this.f8067j.onAdLoaded(this.f8063f);
        this.f8063f = null;
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        if (((Boolean) this.sdk.a(r3.I7)).booleanValue()) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.ads.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8143b.g();
                }
            });
        } else {
            g();
        }
    }

    public MaxAdFormat getAdFormat() {
        return this.adFormat;
    }

    public String getPlacement() {
        return this.f8064g;
    }

    public void loadAd(com.applovin.impl.i iVar) {
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "" + this + " Loading ad for " + this.adUnitId + "...");
        }
        boolean z10 = this.f8082y || ((Boolean) this.sdk.a(r3.G7)).booleanValue();
        if (z10 && !this.f8069l.g() && this.f8069l.h()) {
            com.applovin.impl.sdk.o.h(this.tag, "Unable to load a new ad. An ad refresh has already been scheduled in " + TimeUnit.MILLISECONDS.toSeconds(this.f8069l.b()) + " seconds.");
            return;
        }
        if (!z10) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Loading ad...");
            }
            a(iVar, this.f8067j);
        } else if (this.f8063f != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Rendering cached ad");
            }
            i();
        } else if (this.f8080w) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Waiting for precache ad to load to render");
            }
            this.f8079v.set(true);
        } else {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Loading ad...");
            }
            a(iVar, this.f8067j);
        }
    }

    @Override // com.applovin.impl.sdk.f.a
    public void onAdRefresh() {
        if (((Boolean) this.sdk.a(r3.H7)).booleanValue()) {
            f();
        } else {
            e();
        }
    }

    @Override // com.applovin.impl.j.b
    public void onCreativeIdGenerated(String str, String str2) {
        b3 b3Var = this.f8074q;
        if (b3Var != null && b3Var.Q().equalsIgnoreCase(str)) {
            this.f8074q.h(str2);
            t2.b(this.adReviewListener, str2, this.f8074q);
            return;
        }
        b3 b3Var2 = this.f8063f;
        if (b3Var2 == null || !b3Var2.Q().equalsIgnoreCase(str)) {
            return;
        }
        this.f8063f.h(str2);
    }

    @Override // com.applovin.impl.g8.a
    public void onLogVisibilityImpression() {
        a(this.f8074q, this.f8070m.a(this.f8074q));
    }

    public void onWindowVisibilityChanged(int i10) {
        if (((Boolean) this.sdk.a(r3.E7)).booleanValue() && this.f8069l.h()) {
            if (e8.b(i10)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.logger.a(this.tag, "Ad view visible");
                }
                this.f8069l.d();
            } else {
                if (com.applovin.impl.sdk.o.a()) {
                    this.logger.a(this.tag, "Ad view hidden");
                }
                this.f8069l.c();
            }
        }
    }

    public void setCustomData(String str) {
        if (this.f8074q != null && com.applovin.impl.sdk.o.a()) {
            this.logger.k(this.tag, "Setting custom data (" + str + ") for Ad Unit ID (" + this.adUnitId + ") after an ad has been loaded already.");
        }
        n7.b(str, this.tag);
        this.f8065h = str;
    }

    public void setPlacement(String str) {
        if (this.f8074q != null && com.applovin.impl.sdk.o.a()) {
            this.logger.k(this.tag, "Setting placement (" + str + ") for Ad Unit ID (" + this.adUnitId + ") after an ad has been loaded already.");
        }
        this.f8064g = str;
    }

    public void stopAutoRefresh() {
        if (this.f8074q == null) {
            if (this.f8082y || ((Boolean) this.sdk.a(r3.G7)).booleanValue()) {
                this.f8078u = true;
                return;
            } else {
                com.applovin.impl.sdk.o.j(this.tag, "Stopping auto-refresh has no effect until after the first ad has been loaded.");
                return;
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Pausing auto-refresh with remaining time: " + this.f8069l.b() + "ms");
        }
        this.f8069l.j();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MaxAdView{adUnitId='");
        sb2.append(this.adUnitId);
        sb2.append('\'');
        sb2.append(", adListener=");
        Object obj = this.adListener;
        if (obj == this.f8059b) {
            obj = "this";
        }
        sb2.append(obj);
        sb2.append(", isDestroyed=");
        sb2.append(a());
        sb2.append('}');
        return sb2.toString();
    }

    public MaxAdViewImpl(String str, MaxAdFormat maxAdFormat, MaxAdViewConfiguration maxAdViewConfiguration, MaxAdView maxAdView, View view, Context context) {
        super(str, maxAdFormat, "MaxAdView", AppLovinSdk.getInstance(context).a());
        this.f8060c = UUID.randomUUID().toString().toLowerCase(Locale.US);
        this.f8062e = Long.MAX_VALUE;
        this.f8072o = new Object();
        this.f8073p = new Object();
        this.f8074q = null;
        this.f8075r = null;
        this.f8079v = new AtomicBoolean();
        this.f8081x = false;
        this.f8058a = context.getApplicationContext();
        this.f8059b = maxAdView;
        this.f8061d = view;
        this.f8067j = new b();
        this.f8068k = new d();
        this.f8069l = new com.applovin.impl.sdk.f(this.sdk, this);
        this.f8070m = new f8(maxAdView, this.sdk);
        this.f8071n = new g8(maxAdView, this.sdk, this);
        this.f8066i = maxAdViewConfiguration;
        this.sdk.j().a(this);
        if (maxAdViewConfiguration != null && maxAdViewConfiguration.getAdaptiveType() != MaxAdViewConfiguration.AdaptiveType.NONE) {
            setExtraParameter("adaptive_banner", Boolean.toString(true));
            setLocalExtraParameter("adaptive_banner_type", maxAdViewConfiguration.getAdaptiveType().toString());
            int adaptiveWidth = maxAdViewConfiguration.getAdaptiveWidth();
            if (adaptiveWidth > 0) {
                setLocalExtraParameter("adaptive_banner_width", Integer.valueOf(adaptiveWidth));
            }
            int inlineMaximumHeight = maxAdViewConfiguration.getInlineMaximumHeight();
            if (inlineMaximumHeight > 0) {
                setLocalExtraParameter("inline_adaptive_banner_max_height", Integer.valueOf(inlineMaximumHeight));
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Created new MaxAdView (" + this + ")");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(final b3 b3Var) {
        View viewY = b3Var.y();
        String str = viewY == null ? "MaxAdView does not have a loaded ad view" : null;
        MaxAdView maxAdView = this.f8059b;
        if (maxAdView == null) {
            str = "MaxAdView does not have a parent view";
        }
        if (str != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.b(this.tag, str);
            }
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, str);
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + b3Var + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
            }
            t2.a(this.adListener, (MaxAd) b3Var, (MaxError) maxErrorImpl, true);
            this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, b3Var);
            return;
        }
        h();
        a((y2) b3Var);
        if (b3Var.q0()) {
            this.f8071n.a(b3Var);
        }
        maxAdView.setDescendantFocusability(393216);
        if (b3Var.s0() != Long.MAX_VALUE) {
            this.f8061d.setBackgroundColor((int) b3Var.s0());
        } else {
            long j10 = this.f8062e;
            if (j10 != Long.MAX_VALUE) {
                this.f8061d.setBackgroundColor((int) j10);
            } else {
                this.f8061d.setBackgroundColor(0);
            }
        }
        maxAdView.addView(viewY);
        a(viewY, b3Var);
        this.sdk.y().d(b3Var);
        c(b3Var);
        synchronized (this.f8072o) {
            this.f8074q = b3Var;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Scheduling impression for ad manually...");
        }
        this.sdk.X().processRawAdImpression(b3Var, this.f8067j);
        if (StringUtils.isValidString(this.f8074q.getAdReviewCreativeId())) {
            t2.a(this.adReviewListener, this.f8074q.getAdReviewCreativeId(), (MaxAd) this.f8074q, true);
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.ads.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f8138b.a(b3Var);
            }
        }, b3Var.u0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Loading ad for precache request...");
        }
        a(com.applovin.impl.i.SEQUENTIAL_OR_PRECACHE, this.f8068k);
    }

    private void d() {
        if (b()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Scheduling refresh precache request now");
            }
            this.f8080w = true;
            this.sdk.q0().a((i5) new r6(this.sdk, "loadMaxAdForPrecacheRequest", new Runnable() { // from class: com.applovin.impl.mediation.ads.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8144b.c();
                }
            }), d6.b.MEDIATION);
        }
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void setExtraParameter(String str, String str2) {
        super.setExtraParameter(str, str2);
        a(str, str2);
    }

    private void c(b3 b3Var) {
        int height = this.f8059b.getHeight();
        int width = this.f8059b.getWidth();
        if (height > 0 || width > 0) {
            int iPxToDp = AppLovinSdkUtils.pxToDp(this.f8058a, height);
            int iPxToDp2 = AppLovinSdkUtils.pxToDp(this.f8058a, width);
            MaxAdFormat format = b3Var.getFormat();
            int height2 = (this.D ? format.getAdaptiveSize(iPxToDp2, this.f8059b.getContext()) : format.getSize()).getHeight();
            int iMin = Math.min(format.getSize().getWidth(), o0.b(this.f8058a).x);
            if (iPxToDp < height2 || iPxToDp2 < iMin) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\n**************************************************\n`MaxAdView` size ");
                sb2.append(iPxToDp2);
                sb2.append(VastAttributes.HORIZONTAL_POSITION);
                sb2.append(iPxToDp);
                sb2.append(" dp smaller than required ");
                sb2.append(this.D ? "adaptive " : "");
                sb2.append("size: ");
                sb2.append(iMin);
                sb2.append(VastAttributes.HORIZONTAL_POSITION);
                sb2.append(height2);
                sb2.append(" dp\nSome mediated networks (e.g. Google Ad Manager) may not render correctly\n**************************************************\n");
                String string = sb2.toString();
                if (com.applovin.impl.sdk.o.a()) {
                    this.logger.b("AppLovinSdk", string);
                }
            }
        }
    }

    private void a(final com.applovin.impl.i iVar, final com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
        if (a()) {
            boolean zC = n7.c(this.sdk);
            this.sdk.D().a(d2.S0, "attemptingToLoadDestroyedAdView", CollectionUtils.hashMap("details", "debug=" + zC));
            if (!zC) {
                com.applovin.impl.sdk.o.h(this.tag, "Failed to load new ad - this instance is already destroyed");
                return;
            }
            throw new IllegalStateException("Failed to load new ad - this instance is already destroyed for ad unit ID: " + this.adUnitId);
        }
        AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.mediation.ads.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f8140b.a(interfaceC0040a, iVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a, com.applovin.impl.i iVar) {
        int adaptiveWidth;
        b3 b3Var = this.f8074q;
        if (b3Var != null) {
            long jA = this.f8070m.a(b3Var);
            this.extraParameters.put("visible_ad_ad_unit_id", this.f8074q.getAdUnitId());
            this.extraParameters.put("viewability_flags", Long.valueOf(jA));
        } else {
            this.extraParameters.remove("visible_ad_ad_unit_id");
            this.extraParameters.remove("viewability_flags");
        }
        int iPxToDp = AppLovinSdkUtils.pxToDp(this.f8059b.getContext(), this.f8059b.getWidth());
        int iPxToDp2 = AppLovinSdkUtils.pxToDp(this.f8059b.getContext(), this.f8059b.getHeight());
        this.extraParameters.put("viewport_width", Integer.valueOf(iPxToDp));
        this.extraParameters.put("viewport_height", Integer.valueOf(iPxToDp2));
        this.extraParameters.put("auto_refresh_stopped", Boolean.valueOf(this.f8069l.g() || this.f8078u));
        this.extraParameters.put("auto_retries_disabled", Boolean.valueOf(this.f8083z));
        MaxAdViewConfiguration maxAdViewConfiguration = this.f8066i;
        if (maxAdViewConfiguration != null && (adaptiveWidth = maxAdViewConfiguration.getAdaptiveWidth()) > 0 && iPxToDp != adaptiveWidth) {
            com.applovin.impl.sdk.o.j(this.tag, "The requested adaptive ad view width (" + adaptiveWidth + " dp) is different from the MaxAdView width (" + iPxToDp + " dp).");
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Loading " + this.adFormat.getLabel().toLowerCase(Locale.ENGLISH) + " ad for '" + this.adUnitId + "' and notifying " + interfaceC0040a + "...");
        }
        this.sdk.X().loadAd(this.adUnitId, this.f8060c, this.adFormat, iVar, this.localExtraParameters, this.extraParameters, this.f8058a, interfaceC0040a);
    }

    private void a(String str, String str2) {
        if ("allow_pause_auto_refresh_immediately".equalsIgnoreCase(str)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Updated allow immediate auto-refresh pause and ad load to: " + str2);
            }
            this.f8082y = Boolean.parseBoolean(str2);
            return;
        }
        if ("disable_auto_retries".equalsIgnoreCase(str)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Updated disable auto-retries to: " + str2);
            }
            this.f8083z = Boolean.parseBoolean(str2);
            return;
        }
        if ("disable_precache".equalsIgnoreCase(str)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Updated precached disabled to: " + str2);
            }
            this.A = Boolean.parseBoolean(str2);
            return;
        }
        if ("should_stop_auto_refresh_on_ad_expand".equals(str)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Updated should stop auto-refresh on ad expand to: " + str2);
            }
            this.B = Boolean.parseBoolean(str2);
            return;
        }
        if ("force_precache".equals(str)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Updated force precache to: " + str2);
            }
            this.C = Boolean.parseBoolean(str2);
            return;
        }
        if ("adaptive_banner".equalsIgnoreCase(str)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Updated is adaptive banner to: " + str2);
            }
            if (this.f8066i == null) {
                com.applovin.impl.sdk.o.h(this.tag, "You configured adaptive banners incorrectly by setting extra parameters to the MaxAdView! Please configure adaptive banners via MaxAdViewConfiguration instead. Learn more: https://support.axon.ai/en/max/android/ad-formats/banner-and-mrec-ads#adaptive-banners");
            }
            this.D = Boolean.parseBoolean(str2);
            setLocalExtraParameter(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(MaxAd maxAd) {
        boolean zCompareAndSet;
        this.f8080w = false;
        synchronized (this.f8073p) {
            zCompareAndSet = this.f8079v.compareAndSet(true, false);
            if (!zCompareAndSet) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.logger.a(this.tag, "Saving precache ad...");
                }
                b3 b3Var = (b3) maxAd;
                this.f8063f = b3Var;
                b3Var.g(this.f8064g);
                this.f8063f.f(this.f8065h);
            }
        }
        if (zCompareAndSet) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Rendering precache request ad: " + maxAd.getAdUnitId() + "...");
            }
            this.f8067j.onAdLoaded(maxAd);
        }
    }

    private boolean b() {
        if (this.A) {
            return false;
        }
        return ((Boolean) this.sdk.a(r3.N7)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b3 b3Var) {
        long jA = this.f8070m.a(b3Var);
        if (!b3Var.q0()) {
            a(b3Var, jA);
        }
        a(jA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxError maxError) {
        if (a()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Ad load failure with ad unit ID '" + this.adUnitId + "' occured after MaxAdView was destroyed.");
                return;
            }
            return;
        }
        if (this.sdk.c(r3.A7).contains(String.valueOf(maxError.getCode()))) {
            this.sdk.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.sdk.O().a(this.tag, "Ignoring banner ad refresh for error code " + maxError.getCode());
                return;
            }
            return;
        }
        if (!this.f8078u && !this.f8069l.g()) {
            this.f8077t = true;
            this.f8080w = false;
            long jLongValue = ((Long) this.sdk.a(r3.f8968z7)).longValue();
            if (jLongValue >= 0) {
                this.sdk.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.sdk.O().a(this.tag, "Scheduling failed banner ad refresh " + jLongValue + " milliseconds from now for '" + this.adUnitId + "'...");
                }
                this.f8069l.a(jLongValue);
                return;
            }
            return;
        }
        if (this.f8080w) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Refresh precache failed when auto-refresh is stopped");
            }
            this.f8080w = false;
        }
        if (this.f8079v.get()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Refresh precache failed - MaxAdListener.onAdLoadFailed(adUnitId=" + this.adUnitId + ", error=" + maxError + "), listener=" + this.adListener);
            }
            t2.a(this.adListener, this.adUnitId, maxError, true);
        }
    }

    private void a(View view, b3 b3Var) {
        int iV0 = b3Var.v0();
        int iT0 = b3Var.t0();
        int iDpToPx = iV0 == -1 ? -1 : AppLovinSdkUtils.dpToPx(view.getContext(), iV0);
        int iDpToPx2 = iT0 != -1 ? AppLovinSdkUtils.dpToPx(view.getContext(), iT0) : -1;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(iDpToPx, iDpToPx2);
        } else {
            layoutParams.width = iDpToPx;
            layoutParams.height = iDpToPx2;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Pinning ad view to MAX ad view with width: " + iDpToPx + " and height: " + iDpToPx2 + ".");
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            for (int i10 : e8.a(this.f8059b.getGravity(), 10, 14)) {
                layoutParams2.addRule(i10);
            }
        }
        view.setLayoutParams(layoutParams);
    }

    private void a(b3 b3Var, long j10) {
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Scheduling viewability impression for ad...");
        }
        this.sdk.X().processViewabilityAdImpressionPostback(b3Var, j10, this.f8067j);
    }

    private void a(long j10) {
        if (n7.a(j10, ((Long) this.sdk.a(r3.M7)).longValue()) && !this.C) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Undesired flags matched - current: " + Long.toBinaryString(j10) + ", undesired: " + Long.toBinaryString(j10));
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Waiting for refresh timer to manually fire request");
            }
            this.f8077t = true;
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "No undesired viewability flags matched or forcing precache - scheduling viewability");
        }
        this.f8077t = false;
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxAd maxAd) {
        this.f8080w = false;
        if (this.f8079v.compareAndSet(true, false)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Rendering precache request ad: " + maxAd.getAdUnitId() + "...");
            }
            this.f8067j.onAdLoaded(maxAd);
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Saving precache ad...");
        }
        b3 b3Var = (b3) maxAd;
        this.f8063f = b3Var;
        b3Var.g(this.f8064g);
        this.f8063f.f(this.f8065h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        boolean z10;
        synchronized (this.f8072o) {
            z10 = this.f8081x;
        }
        return z10;
    }
}
