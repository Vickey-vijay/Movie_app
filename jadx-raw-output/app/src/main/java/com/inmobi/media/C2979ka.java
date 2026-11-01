package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.internal.special.SpecialsBridge;
import com.vungle.ads.internal.ui.AdActivity;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.ka, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C2979ka extends PublisherCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference<InMobiInterstitial> f24665a;

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public byte getType() {
        return (byte) 1;
    }

    public C2979ka(InMobiInterstitial inMobiInterstitial) {
        ck.p.j(inMobiInterstitial, "interstitial");
        this.f24665a = new WeakReference<>(inMobiInterstitial);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdClicked(Map<Object, ? extends Object> map) {
        AbstractC2905ha mPubListener$media_release;
        ck.p.j(map, "params");
        InMobiInterstitial inMobiInterstitial = this.f24665a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, map);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDismissed() {
        AbstractC2905ha mPubListener$media_release;
        InMobiInterstitial inMobiInterstitial = this.f24665a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        ck.p.j(inMobiInterstitial, "ad");
        ((C2930ia) mPubListener$media_release).f24547a.onAdDismissed(inMobiInterstitial);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayFailed() {
        AbstractC2905ha mPubListener$media_release;
        InMobiInterstitial inMobiInterstitial = this.f24665a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        ck.p.j(inMobiInterstitial, "ad");
        ((C2930ia) mPubListener$media_release).f24547a.onAdDisplayFailed(inMobiInterstitial);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayed(AdMetaInfo adMetaInfo) {
        AbstractC2905ha mPubListener$media_release;
        ck.p.j(adMetaInfo, "info");
        InMobiInterstitial inMobiInterstitial = this.f24665a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        ck.p.j(inMobiInterstitial, "ad");
        ck.p.j(adMetaInfo, "info");
        SpecialsBridge.inmobiOnInterstitialAdDisplayed(((C2930ia) mPubListener$media_release).f24547a, inMobiInterstitial, adMetaInfo);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        AbstractC2905ha mPubListener$media_release;
        ck.p.j(inMobiAdRequestStatus, "status");
        InMobiInterstitial inMobiInterstitial = this.f24665a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        ck.p.j(inMobiInterstitial, "ad");
        ck.p.j(inMobiAdRequestStatus, "status");
        ((C2930ia) mPubListener$media_release).f24547a.onAdFetchFailed(inMobiInterstitial, inMobiAdRequestStatus);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchSuccessful(AdMetaInfo adMetaInfo) {
        AbstractC2905ha mPubListener$media_release;
        ck.p.j(adMetaInfo, "info");
        InMobiInterstitial inMobiInterstitial = this.f24665a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, adMetaInfo);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdImpression(C2890gk c2890gk) {
        InMobiInterstitial inMobiInterstitial = this.f24665a.get();
        AbstractC2905ha mPubListener$media_release = inMobiInterstitial != null ? inMobiInterstitial.getMPubListener$media_release() : null;
        if (mPubListener$media_release == null) {
            if (c2890gk != null) {
                c2890gk.b();
            }
        } else {
            ck.p.j(inMobiInterstitial, "ad");
            ((C2930ia) mPubListener$media_release).f24547a.onAdImpression(inMobiInterstitial);
            if (c2890gk != null) {
                c2890gk.c();
            }
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        AbstractC2905ha mPubListener$media_release;
        ck.p.j(inMobiAdRequestStatus, "status");
        InMobiInterstitial inMobiInterstitial = this.f24665a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, inMobiAdRequestStatus);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadSucceeded(AdMetaInfo adMetaInfo) {
        AbstractC2905ha mPubListener$media_release;
        ck.p.j(adMetaInfo, "info");
        InMobiInterstitial inMobiInterstitial = this.f24665a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.b(inMobiInterstitial, adMetaInfo);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdWillDisplay() {
        AbstractC2905ha mPubListener$media_release;
        InMobiInterstitial inMobiInterstitial = this.f24665a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        ck.p.j(inMobiInterstitial, "ad");
        ((C2930ia) mPubListener$media_release).f24547a.onAdWillDisplay(inMobiInterstitial);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onImraidLog(String str) {
        AbstractC2905ha mPubListener$media_release;
        ck.p.j(str, CreativeInfo.f44317an);
        InMobiInterstitial inMobiInterstitial = this.f24665a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, str);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreated(byte[] bArr) {
        AbstractC2905ha mPubListener$media_release;
        ck.p.j(bArr, AdActivity.REQUEST_KEY_EXTRA);
        InMobiInterstitial inMobiInterstitial = this.f24665a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        ((C2930ia) mPubListener$media_release).f24547a.onRequestPayloadCreated(bArr);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreationFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        AbstractC2905ha mPubListener$media_release;
        ck.p.j(inMobiAdRequestStatus, "reason");
        InMobiInterstitial inMobiInterstitial = this.f24665a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        ck.p.j(inMobiAdRequestStatus, "status");
        ((C2930ia) mPubListener$media_release).f24547a.onRequestPayloadCreationFailed(inMobiAdRequestStatus);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRewardsUnlocked(Map<Object, ? extends Object> map) {
        AbstractC2905ha mPubListener$media_release;
        ck.p.j(map, "rewards");
        InMobiInterstitial inMobiInterstitial = this.f24665a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        ck.p.j(inMobiInterstitial, "ad");
        ck.p.j(map, "rewards");
        ((C2930ia) mPubListener$media_release).f24547a.onRewardsUnlocked(inMobiInterstitial, map);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onUserLeftApplication() {
        AbstractC2905ha mPubListener$media_release;
        InMobiInterstitial inMobiInterstitial = this.f24665a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        ck.p.j(inMobiInterstitial, "ad");
        ((C2930ia) mPubListener$media_release).f24547a.onUserLeftApplication(inMobiInterstitial);
    }
}
