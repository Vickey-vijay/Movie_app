package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.widget.ActivityChooserModel;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.C3004la;
import com.ironsource.C3605n2;
import com.ironsource.C3702sd;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;

/* JADX INFO: renamed from: com.inmobi.media.la, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3004la extends Dk {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f24757j = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C2954ja f24758h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f24759i;

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC2871g1
    public final void a() throws JSONException {
        this.f22540d.post(new Runnable() { // from class: b7.k9
            @Override // java.lang.Runnable
            public final void run() {
                C3004la.a(this.f5021b);
            }
        });
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            c3053n9.d("InterstitialUnifiedAdManager", "AdManager state - CREATED");
        }
        this.f22537a = (byte) 0;
        this.f22538b = null;
        C2954ja c2954ja = this.f24758h;
        if (c2954ja != null) {
            c2954ja.d();
        }
        C3053n9 c3053n10 = this.f22542f;
        if (c3053n10 != null) {
            c3053n10.a();
        }
    }

    public final void b(PublisherCallbacks publisherCallbacks) {
        C2954ja c2954ja;
        ck.p.j(publisherCallbacks, "callbacks");
        if (this.f22539c == null) {
            this.f22539c = publisherCallbacks;
        }
        if (ck.p.e(this.f22538b, Boolean.FALSE)) {
            C2954ja c2954ja2 = this.f24758h;
            if (c2954ja2 != null) {
                c2954ja2.b((short) 2006);
            }
            publisherCallbacks.onAdLoadFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            C3053n9 c3053n9 = this.f22542f;
            if (c3053n9 != null) {
                c3053n9.b("InMobi", "Cannot call load() API after calling load(byte[])");
            }
            Kb.a((byte) 1, "InMobi", "Cannot call load() API after calling load(byte[])");
            return;
        }
        if (this.f24759i) {
            C2954ja c2954ja3 = this.f24758h;
            if (c2954ja3 != null) {
                c2954ja3.b((short) 2004);
            }
            publisherCallbacks.onAdLoadFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            C3053n9 c3053n10 = this.f22542f;
            if (c3053n10 != null) {
                c3053n10.b("InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            }
            Kb.a((byte) 1, "InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            return;
        }
        this.f22538b = Boolean.TRUE;
        C2954ja c2954ja4 = this.f24758h;
        if (c2954ja4 == null || !a("InMobi", String.valueOf(c2954ja4.f24720l), publisherCallbacks) || (c2954ja = this.f24758h) == null) {
            return;
        }
        PublisherCallbacks publisherCallbacks2 = this.f22539c;
        if (c2954ja.d((publisherCallbacks2 == null || publisherCallbacks2.getType() != 1) ? (byte) 1 : (byte) 2)) {
            this.f22537a = (byte) 1;
            C3053n9 c3053n11 = this.f22542f;
            if (c3053n11 != null) {
                C2954ja c2954ja5 = this.f24758h;
                c3053n11.c("InterstitialUnifiedAdManager", "Fetching an Interstitial ad for placement id: " + (c2954ja5 != null ? c2954ja5.f24720l : null));
            }
            C2954ja c2954ja6 = this.f24758h;
            Kb.a((byte) 2, "InterstitialUnifiedAdManager", "Fetching an Interstitial ad for placement id: " + (c2954ja6 != null ? c2954ja6.f24720l : null));
            C2954ja c2954ja7 = this.f24758h;
            if (c2954ja7 != null) {
                c2954ja7.e(this);
            }
            C2954ja c2954ja8 = this.f24758h;
            if (c2954ja8 != null) {
                c2954ja8.C();
            }
        }
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC2871g1
    public final void c(AdMetaInfo adMetaInfo) throws JSONException {
        ck.p.j(adMetaInfo, "info");
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            c3053n9.c("InterstitialUnifiedAdManager", "onAdLoadSucceeded");
        }
        if (this.f24758h != null) {
            d(adMetaInfo);
            return;
        }
        C3053n9 c3053n10 = this.f22542f;
        if (c3053n10 != null) {
            c3053n10.b("InterstitialUnifiedAdManager", "adUnit is null");
        }
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        byte b10 = this.f22537a;
        if (b10 == 8 || b10 == 1) {
            b((AbstractC2995l1) null, inMobiAdRequestStatus);
            return;
        }
        if (b10 == 2) {
            Kb.a((byte) 1, "InMobi", "Unable to Show Ad, canShowAd Failed");
            C3053n9 c3053n11 = this.f22542f;
            if (c3053n11 != null) {
                c3053n11.b("InMobi", "Unable to Show Ad, canShowAd Failed");
            }
            a(true, (short) 0);
            return;
        }
        if (b10 != 5) {
            Kb.a((byte) 1, "InMobi", "Invalid state passed in fireErrorScenarioCallback");
            C3053n9 c3053n12 = this.f22542f;
            if (c3053n12 != null) {
                c3053n12.b("InMobi", "Invalid state passed in fireErrorScenarioCallback");
                return;
            }
            return;
        }
        Kb.a((byte) 1, "InMobi", "Ad will be dismissed, Internal error");
        C3053n9 c3053n13 = this.f22542f;
        if (c3053n13 != null) {
            c3053n13.b("InMobi", "Ad will be dismissed, Internal error");
        }
        C2954ja c2954ja = this.f24758h;
        if (c2954ja != null) {
            c2954ja.b((byte) 4);
        }
        a();
    }

    public final void d(final AdMetaInfo adMetaInfo) {
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            c3053n9.c("InterstitialUnifiedAdManager", C3702sd.f30731f);
        }
        super.c(adMetaInfo);
        C3053n9 c3053n10 = this.f22542f;
        if (c3053n10 != null) {
            c3053n10.d("InterstitialUnifiedAdManager", "AdManager state - LOADED");
        }
        this.f22537a = (byte) 2;
        this.f22540d.post(new Runnable() { // from class: b7.i9
            @Override // java.lang.Runnable
            public final void run() {
                C3004la.b(this.f4987b, adMetaInfo);
            }
        });
    }

    @Override // com.inmobi.media.Dk
    public final AbstractC2995l1 f() {
        return this.f24758h;
    }

    public final boolean h() throws JSONException {
        byte b10 = this.f22537a;
        if (b10 == 1) {
            C3053n9 c3053n9 = this.f22542f;
            if (c3053n9 != null) {
                c3053n9.b("InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            }
            Kb.a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            a(false, (short) 2147);
            return false;
        }
        if (b10 == 7) {
            Kb.a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            C3053n9 c3053n10 = this.f22542f;
            if (c3053n10 != null) {
                c3053n10.b("InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            }
            a(false, (short) 2168);
            return false;
        }
        if (b10 != 5) {
            if (!this.f24759i) {
                return true;
            }
            C2954ja c2954ja = this.f24758h;
            if (c2954ja != null) {
                c2954ja.d((short) 2149);
            }
            Kb.a((byte) 1, "InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            C3053n9 c3053n11 = this.f22542f;
            if (c3053n11 != null) {
                c3053n11.b("InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            }
            return false;
        }
        C2954ja c2954ja2 = this.f24758h;
        if (c2954ja2 != null) {
            Kb.a((byte) 1, "InMobi", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + c2954ja2.f24720l);
            C3053n9 c3053n12 = this.f22542f;
            if (c3053n12 != null) {
                C2954ja c2954ja3 = this.f24758h;
                c3053n12.b("InMobi", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + (c2954ja3 != null ? c2954ja3.f24720l : null));
            }
            a(false, (short) 2148);
        }
        return false;
    }

    public final void i() throws JSONException {
        C2954ja c2954ja;
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            c3053n9.a("InterstitialUnifiedAdManager", "render");
        }
        C2954ja c2954ja2 = this.f24758h;
        if (c2954ja2 == null) {
            throw new IllegalStateException("Please make an ad request first in order to start loading the ad.");
        }
        if (c2954ja2.f24710b == 4 && this.f22541e != null) {
            C3053n9 c3053n10 = this.f22542f;
            if (c3053n10 != null) {
                c3053n10.c("InterstitialUnifiedAdManager", "already in ready state");
            }
            AdMetaInfo adMetaInfo = this.f22541e;
            ck.p.g(adMetaInfo);
            d(adMetaInfo);
            return;
        }
        if (this.f24759i) {
            C3053n9 c3053n11 = this.f22542f;
            if (c3053n11 != null) {
                c3053n11.b("InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            }
            Kb.a((byte) 1, "InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            b(this.f24758h, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            C2954ja c2954ja3 = this.f24758h;
            if (c2954ja3 != null) {
                c2954ja3.c((short) 2128);
                return;
            }
            return;
        }
        com.inmobi.media.ads.network.common.model.Ad adB = c2954ja2.b(0);
        C2954ja c2954ja4 = this.f24758h;
        boolean zA = a("InMobi", String.valueOf(c2954ja4 != null ? c2954ja4.f24720l : null));
        if (adB == null) {
            C3053n9 c3053n12 = this.f22542f;
            if (c3053n12 != null) {
                c3053n12.b("InterstitialUnifiedAdManager", "ad is null. failure");
            }
            b(this.f24758h, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            C2954ja c2954ja5 = this.f24758h;
            if (c2954ja5 != null) {
                c2954ja5.b((short) 2166);
            }
        }
        if (this.f22541e == null) {
            C3053n9 c3053n13 = this.f22542f;
            if (c3053n13 != null) {
                c3053n13.b("InterstitialUnifiedAdManager", "ad meta info is null. failure");
            }
            b(this.f24758h, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            C2954ja c2954ja6 = this.f24758h;
            if (c2954ja6 != null) {
                c2954ja6.b((short) 2167);
            }
        }
        if (adB == null || !zA) {
            return;
        }
        PublisherCallbacks publisherCallbacks = this.f22539c;
        if (publisherCallbacks != null && publisherCallbacks.getType() == 1 && (c2954ja = this.f24758h) != null) {
            c2954ja.d((byte) 1);
        }
        C3053n9 c3053n14 = this.f22542f;
        if (c3053n14 != null) {
            c3053n14.d("InterstitialUnifiedAdManager", "AdManager state - LOADING_INTO_VIEW");
        }
        this.f22537a = (byte) 8;
        C2954ja c2954ja7 = this.f24758h;
        if (c2954ja7 != null) {
            c2954ja7.X();
        }
    }

    @Override // com.inmobi.media.AbstractC2871g1
    public final void d() throws JSONException {
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            c3053n9.a("InterstitialUnifiedAdManager", "showTimeOut");
        }
        C2954ja c2954ja = this.f24758h;
        if (c2954ja != null) {
            byte b10 = c2954ja.f24710b;
            if (b10 != 6 && b10 != 7) {
                a(true, (short) 2159);
            } else {
                c2954ja.f(this);
            }
        }
    }

    public static final void a(C3004la c3004la) {
        C3053n9 c3053n9 = c3004la.f22542f;
        if (c3053n9 != null) {
            c3053n9.a("InterstitialUnifiedAdManager", "callback - onAdDismissed");
        }
        PublisherCallbacks publisherCallbacks = c3004la.f22539c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDismissed();
        }
    }

    public static final void a(C3004la c3004la, AdMetaInfo adMetaInfo) {
        C3053n9 c3053n9 = c3004la.f22542f;
        if (c3053n9 != null) {
            c3053n9.a("InterstitialUnifiedAdManager", "callback - onAdFetchSuccessful");
        }
        PublisherCallbacks publisherCallbacks = c3004la.f22539c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdFetchSuccessful(adMetaInfo);
        }
    }

    public final void a(boolean z10, short s10) throws JSONException {
        C2954ja c2954ja;
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            c3053n9.c("InterstitialUnifiedAdManager", "onShowFailure");
        }
        if (s10 != 0 && (c2954ja = this.f24758h) != null) {
            c2954ja.d(s10);
        }
        this.f22540d.post(new Runnable() { // from class: b7.l9
            @Override // java.lang.Runnable
            public final void run() {
                C3004la.c(this.f5040b);
            }
        });
        if (z10) {
            C3053n9 c3053n10 = this.f22542f;
            if (c3053n10 != null) {
                c3053n10.d("InterstitialUnifiedAdManager", "AdManager state - FAILED");
            }
            this.f22537a = (byte) 6;
            C2954ja c2954ja2 = this.f24758h;
            if (c2954ja2 != null) {
                c2954ja2.d();
            }
        }
        C3053n9 c3053n11 = this.f22542f;
        if (c3053n11 != null) {
            c3053n11.a();
        }
    }

    public static final void c(C3004la c3004la) {
        C3053n9 c3053n9 = c3004la.f22542f;
        if (c3053n9 != null) {
            c3053n9.a("InterstitialUnifiedAdManager", "callback - onAdDisplayFailed");
        }
        PublisherCallbacks publisherCallbacks = c3004la.f22539c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDisplayFailed();
        }
        C3053n9 c3053n10 = c3004la.f22542f;
        if (c3053n10 != null) {
            c3053n10.a();
        }
        C2954ja c2954ja = c3004la.f24758h;
        if (c2954ja != null) {
            c2954ja.b((byte) 4);
        }
    }

    public final void a(Activity activity) throws JSONException {
        Pj pj2;
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            c3053n9.a("InterstitialUnifiedAdManager", C3605n2.f30216v);
        }
        C2954ja c2954ja = this.f24758h;
        if (c2954ja != null && (pj2 = c2954ja.H) != null) {
            pj2.f23344b = true;
        }
        if (c2954ja != null) {
            c2954ja.Q();
        }
        if (h()) {
            if (!W6.a()) {
                if (this.f24758h != null) {
                    a(true, (short) 2141);
                    return;
                }
                return;
            }
            C2954ja c2954ja2 = this.f24758h;
            if (c2954ja2 == null || !c2954ja2.d((byte) 4)) {
                return;
            }
            this.f24759i = true;
            C2954ja c2954ja3 = this.f24758h;
            if (c2954ja3 != null) {
                c2954ja3.a(this, activity);
            }
        }
    }

    @Override // com.inmobi.media.AbstractC2871g1
    public final void b() throws JSONException {
        this.f22540d.post(new Runnable() { // from class: b7.h9
            @Override // java.lang.Runnable
            public final void run() {
                C3004la.b(this.f4960b);
            }
        });
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            c3053n9.d("InterstitialUnifiedAdManager", "AdManager state - DISPLAY_FAILED");
        }
        this.f22537a = (byte) 6;
        C2954ja c2954ja = this.f24758h;
        if (c2954ja != null) {
            c2954ja.d();
        }
        C3053n9 c3053n10 = this.f22542f;
        if (c3053n10 != null) {
            c3053n10.a();
        }
    }

    public final void a(Jg jg2, Context context, boolean z10, String str) {
        C2954ja c2954ja;
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciI;
        C2954ja c2954ja2;
        String str2;
        String str3;
        ck.p.j(jg2, "pubSettings");
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(str, "logType");
        if (this.f24758h == null) {
            ck.p.j(ImpressionLog.f43647w, "mAdType");
            String string = UUID.randomUUID().toString();
            ck.p.i(string, "toString(...)");
            long j10 = jg2.f22935a;
            String str4 = jg2.f22936b;
            Map map = jg2.f22937c;
            String str5 = jg2.f22941g;
            String str6 = jg2.f22939e;
            if (j10 != Long.MIN_VALUE) {
                if (map == null || (str3 = (String) map.get("tp")) == null) {
                    str2 = "";
                    str3 = str2;
                } else {
                    str2 = "";
                }
                C3243v0 c3243v0 = new C3243v0(j10, str3, ImpressionLog.f43647w, str5);
                c3243v0.f25508d = str4;
                c3243v0.f25507c = map;
                ck.p.j(str2, "<set-?>");
                c3243v0.f25512h = str2;
                ck.p.j(ActivityChooserModel.ATTRIBUTE_ACTIVITY, "<set-?>");
                c3243v0.f25513i = ActivityChooserModel.ATTRIBUTE_ACTIVITY;
                c3243v0.f25511g = string;
                c3243v0.f25514j = false;
                c3243v0.f25515k = str6;
                this.f24758h = new C2954ja(context, c3243v0, this);
            } else {
                throw new IllegalStateException("When the integration type is IM, IM-Plc can't be empty");
            }
        }
        if (z10) {
            g();
        }
        String str7 = jg2.f22941g;
        if (str7 != null) {
            C3053n9 c3053n9 = this.f22542f;
            if (c3053n9 != null) {
                c3053n9.a();
            }
            C3053n9 c3053n9A = Jh.a(str, str7);
            this.f22542f = c3053n9A;
            if (c3053n9A != null) {
                c3053n9A.a("InterstitialUnifiedAdManager", "Ad Unit initialised");
            }
            C3053n9 c3053n10 = this.f22542f;
            if (c3053n10 != null && (c2954ja2 = this.f24758h) != null) {
                ck.p.j(c3053n10, "logger");
                c2954ja2.f24717i = c3053n10;
                C2741b0 c2741b0 = c2954ja2.f24729u;
                c2741b0.getClass();
                ck.p.j(c3053n10, "logger");
                c2741b0.f24029f = c3053n10;
            }
            C3053n9 c3053n11 = this.f22542f;
            if (c3053n11 != null) {
                c3053n11.a("InterstitialUnifiedAdManager", "adding interstitialAdUnit in referenceTracker");
            }
            C2954ja c2954ja3 = this.f24758h;
            ck.p.g(c2954ja3);
            Jh.a(c2954ja3, this.f22542f);
        }
        C2954ja c2954ja4 = this.f24758h;
        if (c2954ja4 != null) {
            c2954ja4.a(context);
        }
        C2954ja c2954ja5 = this.f24758h;
        if (c2954ja5 != null) {
            c2954ja5.a(jg2.f22937c);
        }
        C2954ja c2954ja6 = this.f24758h;
        if (c2954ja6 != null) {
            c2954ja6.K();
        }
        if (jg2.f22938d && (c2954ja = this.f24758h) != null && (gestureDetectorOnGestureListenerC2785ciI = c2954ja.i()) != null) {
            c2954ja.G = true;
            gestureDetectorOnGestureListenerC2785ciI.k();
        }
        WatermarkData watermarkData = this.f22543g;
        if (watermarkData != null) {
            C2954ja c2954ja7 = this.f24758h;
            if (c2954ja7 != null) {
                ck.p.j(watermarkData, "watermarkData");
                c2954ja7.A = watermarkData;
                GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciQ = c2954ja7.q();
                if (gestureDetectorOnGestureListenerC2785ciQ != null) {
                    gestureDetectorOnGestureListenerC2785ciQ.setWatermark(watermarkData);
                }
            }
            C3053n9 c3053n12 = this.f22542f;
            if (c3053n12 != null) {
                c3053n12.c("InterstitialUnifiedAdManager", "setting up watermark");
            }
        }
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC2871g1
    public final void b(final AdMetaInfo adMetaInfo) {
        ck.p.j(adMetaInfo, "info");
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            c3053n9.c("InterstitialUnifiedAdManager", "onAdFetchSuccess");
        }
        this.f22541e = adMetaInfo;
        if (this.f24758h == null) {
            C3053n9 c3053n10 = this.f22542f;
            if (c3053n10 != null) {
                c3053n10.b("InterstitialUnifiedAdManager", "onAdFetchSuccess - adUnit is null - fail");
            }
            a((AbstractC2995l1) null, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            a((short) 2190);
            return;
        }
        super.b(adMetaInfo);
        this.f22540d.post(new Runnable() { // from class: b7.j9
            @Override // java.lang.Runnable
            public final void run() {
                C3004la.a(this.f5003b, adMetaInfo);
            }
        });
    }

    public static final void b(C3004la c3004la) {
        C3053n9 c3053n9 = c3004la.f22542f;
        if (c3053n9 != null) {
            c3053n9.a("InterstitialUnifiedAdManager", "callback - onAdDisplayFailed");
        }
        PublisherCallbacks publisherCallbacks = c3004la.f22539c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDisplayFailed();
        }
        C2954ja c2954ja = c3004la.f24758h;
        if (c2954ja != null) {
            c2954ja.b((byte) 4);
        }
    }

    public static final void b(C3004la c3004la, AdMetaInfo adMetaInfo) {
        C3053n9 c3053n9 = c3004la.f22542f;
        if (c3053n9 != null) {
            c3053n9.a("InterstitialUnifiedAdManager", "callback - onAdLoadSucceeded");
        }
        PublisherCallbacks publisherCallbacks = c3004la.f22539c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdLoadSucceeded(adMetaInfo);
        }
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC2871g1
    public final void a(AdMetaInfo adMetaInfo) {
        ck.p.j(adMetaInfo, "info");
        super.a(adMetaInfo);
        C2954ja c2954ja = this.f24758h;
        if (c2954ja != null) {
            c2954ja.R();
        }
        this.f24759i = false;
    }

    @Override // com.inmobi.media.Dk
    public final void a(WatermarkData watermarkData) {
        ck.p.j(watermarkData, "watermarkData");
        super.a(watermarkData);
        C2954ja c2954ja = this.f24758h;
        if (c2954ja != null) {
            ck.p.j(watermarkData, "watermarkData");
            c2954ja.A = watermarkData;
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciQ = c2954ja.q();
            if (gestureDetectorOnGestureListenerC2785ciQ != null) {
                gestureDetectorOnGestureListenerC2785ciQ.setWatermark(watermarkData);
            }
        }
    }
}
