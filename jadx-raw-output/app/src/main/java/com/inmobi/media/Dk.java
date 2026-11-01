package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.Dk;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Dk extends AbstractC2871g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f22537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f22538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PublisherCallbacks f22539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f22540d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AdMetaInfo f22541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C3053n9 f22542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WatermarkData f22543g;

    public static final void a(AbstractC2995l1 abstractC2995l1, Dk dk2, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (abstractC2995l1 != null) {
            abstractC2995l1.b((byte) 1);
        }
        C3053n9 c3053n9 = dk2.f22542f;
        if (c3053n9 != null) {
            ck.p.i("Dk", "TAG");
            c3053n9.a("Dk", "callback - onAdLoadFailed");
        }
        PublisherCallbacks publisherCallbacks = dk2.f22539c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdLoadFailed(inMobiAdRequestStatus);
        }
        C3053n9 c3053n10 = dk2.f22542f;
        if (c3053n10 != null) {
            c3053n10.a();
        }
    }

    public final void b(final AbstractC2995l1 abstractC2995l1, final InMobiAdRequestStatus inMobiAdRequestStatus) {
        ck.p.j(inMobiAdRequestStatus, "status");
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            ck.p.i("Dk", "TAG");
            c3053n9.c("Dk", "onLoadFailure " + this);
        }
        C3053n9 c3053n10 = this.f22542f;
        if (c3053n10 != null) {
            ck.p.i("Dk", "TAG");
            c3053n10.d("Dk", "AdManager state - LOAD_FAILED");
        }
        this.f22537a = (byte) 3;
        this.f22540d.post(new Runnable() { // from class: b7.u
            @Override // java.lang.Runnable
            public final void run() {
                Dk.a(abstractC2995l1, this, inMobiAdRequestStatus);
            }
        });
    }

    @Override // com.inmobi.media.AbstractC2871g1
    public final void c() {
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            ck.p.i("Dk", "TAG");
            c3053n9.c("Dk", "onAdWillShow " + this);
        }
        byte b10 = this.f22537a;
        if (b10 == 4 || b10 == 5) {
            return;
        }
        this.f22540d.post(new Runnable() { // from class: b7.o
            @Override // java.lang.Runnable
            public final void run() {
                Dk.b(this.f5087b);
            }
        });
        C3053n9 c3053n10 = this.f22542f;
        if (c3053n10 != null) {
            ck.p.i("Dk", "TAG");
            c3053n10.d("Dk", "AdManager state - WILL_DISPLAY");
        }
        this.f22537a = (byte) 4;
    }

    public abstract AbstractC2995l1 f();

    @Override // com.inmobi.media.AbstractC2871g1
    public final void e() {
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            ck.p.i("Dk", "TAG");
            c3053n9.c("Dk", "onUserLeftApplication " + this);
        }
        this.f22540d.post(new Runnable() { // from class: b7.r
            @Override // java.lang.Runnable
            public final void run() {
                Dk.c(this.f5150b);
            }
        });
    }

    public void g() {
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            ck.p.i("Dk", "TAG");
            c3053n9.c("Dk", "submitAdLoadCalled " + this);
        }
        AbstractC2995l1 abstractC2995l1F = f();
        if (abstractC2995l1F != null) {
            abstractC2995l1F.O();
        }
    }

    @Override // com.inmobi.media.AbstractC2871g1
    public final void a(final InMobiAdRequestStatus inMobiAdRequestStatus) {
        ck.p.j(inMobiAdRequestStatus, "status");
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            ck.p.i("Dk", "TAG");
            c3053n9.c("Dk", "onAdFetchFailed " + this);
        }
        this.f22537a = (byte) 3;
        this.f22540d.post(new Runnable() { // from class: b7.n
            @Override // java.lang.Runnable
            public final void run() {
                Dk.a(this.f5069b, inMobiAdRequestStatus);
            }
        });
    }

    @Override // com.inmobi.media.AbstractC2871g1
    public void b(AdMetaInfo adMetaInfo) {
        AbstractC2995l1 abstractC2995l1F;
        ck.p.j(adMetaInfo, "info");
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            ck.p.i("Dk", "TAG");
            c3053n9.c("Dk", "onAdFetchSuccess " + this);
        }
        C3053n9 c3053n10 = this.f22542f;
        if (c3053n10 != null) {
            ck.p.i("Dk", "TAG");
            c3053n10.d("Dk", "AdManager state - FETCHED");
        }
        this.f22537a = (byte) 7;
        PublisherCallbacks publisherCallbacks = this.f22539c;
        if (publisherCallbacks == null || publisherCallbacks.getType() != 1 || (abstractC2995l1F = f()) == null) {
            return;
        }
        abstractC2995l1F.b((byte) 2);
    }

    @Override // com.inmobi.media.AbstractC2871g1
    public void c(AdMetaInfo adMetaInfo) {
        ck.p.j(adMetaInfo, "info");
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            ck.p.i("Dk", "TAG");
            c3053n9.c("Dk", "onAdLoadSucceeded " + this);
        }
        this.f22541e = adMetaInfo;
        AbstractC2995l1 abstractC2995l1F = f();
        if (abstractC2995l1F != null) {
            abstractC2995l1F.b((byte) 1);
        }
    }

    public static final void a(Dk dk2, InMobiAdRequestStatus inMobiAdRequestStatus) {
        C3053n9 c3053n9 = dk2.f22542f;
        if (c3053n9 != null) {
            ck.p.i("Dk", "TAG");
            c3053n9.a("Dk", "callback - onAdFetchFailed");
        }
        PublisherCallbacks publisherCallbacks = dk2.f22539c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdFetchFailed(inMobiAdRequestStatus);
        }
        C3053n9 c3053n10 = dk2.f22542f;
        if (c3053n10 != null) {
            c3053n10.a();
        }
    }

    public static final void c(Dk dk2) {
        C3053n9 c3053n9 = dk2.f22542f;
        if (c3053n9 != null) {
            ck.p.i("Dk", "TAG");
            c3053n9.a("Dk", "callback - onUserLeftApplication");
        }
        PublisherCallbacks publisherCallbacks = dk2.f22539c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onUserLeftApplication();
        }
    }

    public static final void b(Dk dk2) {
        C3053n9 c3053n9 = dk2.f22542f;
        if (c3053n9 != null) {
            ck.p.i("Dk", "TAG");
            c3053n9.a("Dk", "callback - onAdWillShow");
        }
        PublisherCallbacks publisherCallbacks = dk2.f22539c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdWillDisplay();
        }
    }

    @Override // com.inmobi.media.AbstractC2871g1
    public void a(final AdMetaInfo adMetaInfo) {
        ck.p.j(adMetaInfo, "info");
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            ck.p.i("Dk", "TAG");
            c3053n9.c("Dk", "onAdDisplayed " + this);
        }
        if (this.f22537a != 5) {
            this.f22541e = adMetaInfo;
            this.f22540d.post(new Runnable() { // from class: b7.t
                @Override // java.lang.Runnable
                public final void run() {
                    Dk.a(this.f5174b, adMetaInfo);
                }
            });
            C3053n9 c3053n10 = this.f22542f;
            if (c3053n10 != null) {
                ck.p.i("Dk", "TAG");
                c3053n10.d("Dk", "AdManager state - DISPLAYED");
            }
            this.f22537a = (byte) 5;
        }
    }

    @Override // com.inmobi.media.AbstractC2871g1
    public final void b(final HashMap map) {
        ck.p.j(map, "rewards");
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            ck.p.i("Dk", "TAG");
            c3053n9.c("Dk", "onAdRewardActionCompleted " + this);
        }
        this.f22540d.post(new Runnable() { // from class: b7.q
            @Override // java.lang.Runnable
            public final void run() {
                Dk.b(this.f5134b, map);
            }
        });
    }

    public static final void b(Dk dk2, Map map) {
        C3053n9 c3053n9 = dk2.f22542f;
        if (c3053n9 != null) {
            ck.p.i("Dk", "TAG");
            c3053n9.a("Dk", "callback - onRewardsUnlocked");
        }
        PublisherCallbacks publisherCallbacks = dk2.f22539c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onRewardsUnlocked(map);
        }
    }

    public static final void a(Dk dk2, AdMetaInfo adMetaInfo) {
        C3053n9 c3053n9 = dk2.f22542f;
        if (c3053n9 != null) {
            ck.p.i("Dk", "TAG");
            c3053n9.a("Dk", "callback - onAdDisplayed");
        }
        PublisherCallbacks publisherCallbacks = dk2.f22539c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDisplayed(adMetaInfo);
        }
    }

    @Override // com.inmobi.media.AbstractC2871g1
    public void a(AbstractC2995l1 abstractC2995l1, InMobiAdRequestStatus inMobiAdRequestStatus) {
        ck.p.j(inMobiAdRequestStatus, "status");
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            ck.p.i("Dk", "TAG");
            c3053n9.c("Dk", "onAdLoadFailed " + this);
        }
        b(abstractC2995l1, inMobiAdRequestStatus);
    }

    @Override // com.inmobi.media.AbstractC2871g1
    public final void a(final HashMap map) {
        ck.p.j(map, "params");
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            ck.p.i("Dk", "TAG");
            c3053n9.c("Dk", "onAdInteraction " + this);
        }
        this.f22540d.post(new Runnable() { // from class: b7.s
            @Override // java.lang.Runnable
            public final void run() {
                Dk.a(this.f5161b, map);
            }
        });
    }

    public static final void a(Dk dk2, Map map) {
        C3053n9 c3053n9 = dk2.f22542f;
        if (c3053n9 != null) {
            ck.p.i("Dk", "TAG");
            c3053n9.a("Dk", "callback - onAdClicked");
        }
        PublisherCallbacks publisherCallbacks = dk2.f22539c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdClicked(map);
        }
    }

    public final void a(PublisherCallbacks publisherCallbacks) {
        ck.p.j(publisherCallbacks, "callbacks");
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            ck.p.i("Dk", "TAG");
            c3053n9.a("Dk", "getSignals " + this);
        }
        if (f() != null) {
            this.f22539c = publisherCallbacks;
            publisherCallbacks.onRequestPayloadCreationFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_INVALID));
        }
    }

    public void a(byte[] bArr, PublisherCallbacks publisherCallbacks) {
        C2954ja c2954ja;
        ck.p.j(publisherCallbacks, "callbacks");
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            ck.p.i("Dk", "TAG");
            c3053n9.c("Dk", "load " + this);
        }
        if (ck.p.e(this.f22538b, Boolean.TRUE)) {
            Kb.a((byte) 1, "InMobi", "Cannot call load(byte[]) API after load() API is called");
            C3053n9 c3053n10 = this.f22542f;
            if (c3053n10 != null) {
                ck.p.i("Dk", "TAG");
                c3053n10.a("Dk", "Cannot call load(byte[]) API after load() API is called");
            }
            C3004la c3004la = (C3004la) this;
            b(c3004la.f24758h, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            C2954ja c2954ja2 = c3004la.f24758h;
            if (c2954ja2 != null) {
                c2954ja2.b((short) 2140);
                return;
            }
            return;
        }
        this.f22538b = Boolean.FALSE;
        this.f22537a = (byte) 1;
        C3053n9 c3053n11 = this.f22542f;
        if (c3053n11 != null && (c2954ja = ((C3004la) this).f24758h) != null) {
            ck.p.j(c3053n11, "logger");
            c2954ja.f24717i = c3053n11;
            C2741b0 c2741b0 = c2954ja.f24729u;
            c2741b0.getClass();
            ck.p.j(c3053n11, "logger");
            c2741b0.f24029f = c3053n11;
        }
        C3004la c3004la2 = (C3004la) this;
        C2954ja c2954ja3 = c3004la2.f24758h;
        if (c2954ja3 == null || !c2954ja3.d((byte) 1)) {
            return;
        }
        C3053n9 c3053n12 = this.f22542f;
        if (c3053n12 != null) {
            ck.p.i("Dk", "TAG");
            c3053n12.a("Dk", "load starting. Started INTERNAL_LOAD_TIMER");
        }
        this.f22539c = publisherCallbacks;
        C2954ja c2954ja4 = c3004la2.f24758h;
        if (c2954ja4 != null) {
            c2954ja4.a(bArr);
        }
    }

    public void a(WatermarkData watermarkData) {
        ck.p.j(watermarkData, "watermarkData");
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            ck.p.i("Dk", "TAG");
            c3053n9.c("Dk", "setWatermark - " + watermarkData.getWatermarkBase64EncodedString());
        }
        this.f22543g = watermarkData;
    }

    public final boolean a(String str, String str2, PublisherCallbacks publisherCallbacks) {
        ck.p.j(str, "tag");
        ck.p.j(str2, "placementString");
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            c3053n9.c(str, "canProceedToLoad " + this);
        }
        PublisherCallbacks publisherCallbacks2 = this.f22539c;
        if (publisherCallbacks2 != null && publisherCallbacks != null && publisherCallbacks2.getType() != publisherCallbacks.getType()) {
            ck.p.i("Dk", "TAG");
            Kb.a((byte) 1, "Dk", "preload() and load() cannot be called on the same instance, please use a different instance.");
            C3053n9 c3053n10 = this.f22542f;
            if (c3053n10 != null) {
                c3053n10.b(str, "preload() and load() cannot be called on the same instance, please use a different instance.");
            }
            AbstractC2995l1 abstractC2995l1F = f();
            if (abstractC2995l1F != null) {
                abstractC2995l1F.b((short) 2005);
            }
            b(f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            return false;
        }
        byte b10 = this.f22537a;
        if (b10 == 8) {
            Kb.a((byte) 1, str, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + str2);
            C3053n9 c3053n11 = this.f22542f;
            if (c3053n11 != null) {
                c3053n11.b(str, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + str2);
            }
            AbstractC2995l1 abstractC2995l1F2 = f();
            if (abstractC2995l1F2 != null) {
                abstractC2995l1F2.b((short) 2002);
            }
            return false;
        }
        if (b10 == 1) {
            Kb.a((byte) 1, str, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + str2);
            C3053n9 c3053n12 = this.f22542f;
            if (c3053n12 != null) {
                c3053n12.b(str, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + str2);
            }
            AbstractC2995l1 abstractC2995l1F3 = f();
            if (abstractC2995l1F3 != null) {
                abstractC2995l1F3.b((short) 2001);
            }
            return false;
        }
        if (b10 != 5) {
            return true;
        }
        Kb.a((byte) 1, str, "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + str2);
        C3053n9 c3053n13 = this.f22542f;
        if (c3053n13 != null) {
            c3053n13.b(str, "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + str2);
        }
        b(f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
        AbstractC2995l1 abstractC2995l1F4 = f();
        if (abstractC2995l1F4 != null) {
            abstractC2995l1F4.c((short) 2003);
        }
        return false;
    }

    public final boolean a(String str, String str2) {
        ck.p.j(str, "tag");
        ck.p.j(str2, "placementString");
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            ck.p.i("Dk", "TAG");
            c3053n9.c("Dk", "canRender " + this);
        }
        byte b10 = this.f22537a;
        if (b10 == 1) {
            Kb.a((byte) 1, str, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + str2);
            C3053n9 c3053n10 = this.f22542f;
            if (c3053n10 != null) {
                ck.p.i("Dk", "TAG");
                c3053n10.b("Dk", "adload in progress");
            }
            AbstractC2995l1 abstractC2995l1F = f();
            if (abstractC2995l1F != null) {
                abstractC2995l1F.c((short) 2129);
            }
            return false;
        }
        if (b10 == 8) {
            Kb.a((byte) 1, str, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + str2);
            C3053n9 c3053n11 = this.f22542f;
            if (c3053n11 != null) {
                ck.p.i("Dk", "TAG");
                c3053n11.b("Dk", "ad loading into view is in progress");
            }
            AbstractC2995l1 abstractC2995l1F2 = f();
            if (abstractC2995l1F2 != null) {
                abstractC2995l1F2.c((short) 2164);
            }
            return false;
        }
        if (b10 != 5) {
            if (b10 == 7) {
                return true;
            }
            C3053n9 c3053n12 = this.f22542f;
            if (c3053n12 != null) {
                ck.p.i("Dk", "TAG");
                c3053n12.b("Dk", "ad in illegal state");
            }
            AbstractC2995l1 abstractC2995l1F3 = f();
            if (abstractC2995l1F3 != null) {
                abstractC2995l1F3.c((short) 2165);
            }
            AbstractC2995l1 abstractC2995l1F4 = f();
            if (abstractC2995l1F4 != null) {
                abstractC2995l1F4.J();
            }
            b(f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            throw new IllegalStateException("Please make an ad request first in order to start loading the ad.");
        }
        Kb.a((byte) 1, str, "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + str2);
        C3053n9 c3053n13 = this.f22542f;
        if (c3053n13 != null) {
            ck.p.i("Dk", "TAG");
            c3053n13.b("Dk", "ad active before renderAd");
        }
        AbstractC2995l1 abstractC2995l1F5 = f();
        if (abstractC2995l1F5 != null) {
            abstractC2995l1F5.c((short) 2130);
        }
        AbstractC2995l1 abstractC2995l1F6 = f();
        if (abstractC2995l1F6 != null) {
            abstractC2995l1F6.J();
        }
        b(f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
        return false;
    }

    @Override // com.inmobi.media.AbstractC2871g1
    public void a() {
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            ck.p.i("Dk", "TAG");
            c3053n9.c("Dk", "onAdDismissed " + this);
        }
        this.f22540d.post(new Runnable() { // from class: b7.l
            @Override // java.lang.Runnable
            public final void run() {
                Dk.a(this.f5028b);
            }
        });
        C3053n9 c3053n10 = this.f22542f;
        if (c3053n10 != null) {
            c3053n10.a();
        }
    }

    public static final void a(Dk dk2) {
        C3053n9 c3053n9 = dk2.f22542f;
        if (c3053n9 != null) {
            ck.p.i("Dk", "TAG");
            c3053n9.a("Dk", "callback - onAdDismissed");
        }
        PublisherCallbacks publisherCallbacks = dk2.f22539c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDismissed();
            return;
        }
        C3053n9 c3053n10 = dk2.f22542f;
        if (c3053n10 != null) {
            ck.p.i("Dk", "TAG");
            c3053n10.b("Dk", "callback is null");
        }
    }

    @Override // com.inmobi.media.AbstractC2871g1
    public final void a(final C2890gk c2890gk) {
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            ck.p.i("Dk", "TAG");
            c3053n9.c("Dk", "onAdImpression " + this);
        }
        this.f22540d.post(new Runnable() { // from class: b7.m
            @Override // java.lang.Runnable
            public final void run() {
                Dk.a(this.f5047b, c2890gk);
            }
        });
    }

    public static final void a(Dk dk2, C2890gk c2890gk) {
        if (dk2.f22539c == null) {
            C3053n9 c3053n9 = dk2.f22542f;
            if (c3053n9 != null) {
                ck.p.i("Dk", "TAG");
                c3053n9.b("Dk", "callback is null");
            }
            if (c2890gk != null) {
                c2890gk.b();
                return;
            }
            return;
        }
        C3053n9 c3053n10 = dk2.f22542f;
        if (c3053n10 != null) {
            ck.p.i("Dk", "TAG");
            c3053n10.a("Dk", "callback - onAdImpression");
        }
        PublisherCallbacks publisherCallbacks = dk2.f22539c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdImpression(c2890gk);
        }
    }

    @Override // com.inmobi.media.AbstractC2871g1
    public final void a(final V1 v10) {
        ck.p.j(v10, "audioStatusInternal");
        this.f22540d.post(new Runnable() { // from class: b7.p
            @Override // java.lang.Runnable
            public final void run() {
                Dk.a(this.f5113b, v10);
            }
        });
    }

    public static final void a(Dk dk2, V1 v10) {
        C3053n9 c3053n9 = dk2.f22542f;
        if (c3053n9 != null) {
            ck.p.i("Dk", "TAG");
            c3053n9.a("Dk", "callback - onAudioStatusChanged - " + v10.f23668a);
        }
        PublisherCallbacks publisherCallbacks = dk2.f22539c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAudioStatusChanged(v10);
        }
    }

    @Override // com.inmobi.media.AbstractC2871g1
    public final void a(final String str) {
        ck.p.j(str, CreativeInfo.f44317an);
        this.f22540d.post(new Runnable() { // from class: b7.k
            @Override // java.lang.Runnable
            public final void run() {
                Dk.a(this.f5007b, str);
            }
        });
    }

    public static final void a(Dk dk2, String str) {
        C3053n9 c3053n9 = dk2.f22542f;
        if (c3053n9 != null) {
            ck.p.i("Dk", "TAG");
            c3053n9.a("Dk", "callback - onImraidLog");
        }
        PublisherCallbacks publisherCallbacks = dk2.f22539c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onImraidLog(str);
        }
    }

    public void a(short s10) {
        C3053n9 c3053n9 = this.f22542f;
        if (c3053n9 != null) {
            ck.p.i("Dk", "TAG");
            c3053n9.c("Dk", "submitAdLoadDroppedAtSDK " + this);
        }
        AbstractC2995l1 abstractC2995l1F = f();
        if (abstractC2995l1F != null) {
            abstractC2995l1F.b(s10);
        }
    }
}
