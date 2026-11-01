package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.AudioStatus;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.banner.AudioListener;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.vungle.ads.internal.ui.AdActivity;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C2769c2 extends PublisherCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<InMobiBanner> f24110a;

    public final WeakReference<InMobiBanner> a() {
        return this.f24110a;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public byte getType() {
        return (byte) 1;
    }

    public C2769c2(InMobiBanner inMobiBanner) {
        ck.p.j(inMobiBanner, "banner");
        this.f24110a = new WeakReference<>(inMobiBanner);
    }

    public final void a(WeakReference<InMobiBanner> weakReference) {
        ck.p.j(weakReference, "<set-?>");
        this.f24110a = weakReference;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdClicked(Map<Object, ? extends Object> map) {
        Y1 mPubListener$media_release;
        ck.p.j(map, "params");
        InMobiBanner inMobiBanner = this.f24110a.get();
        if (inMobiBanner == null || (mPubListener$media_release = inMobiBanner.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiBanner, map);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDismissed() {
        InMobiBanner inMobiBanner = this.f24110a.get();
        if (inMobiBanner == null) {
            return;
        }
        Y1 mPubListener$media_release = inMobiBanner.getMPubListener$media_release();
        if (mPubListener$media_release != null) {
            ck.p.j(inMobiBanner, "ad");
            ((Z1) mPubListener$media_release).f23882a.onAdDismissed(inMobiBanner);
        }
        inMobiBanner.scheduleRefresh$media_release();
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayed(AdMetaInfo adMetaInfo) {
        Y1 mPubListener$media_release;
        ck.p.j(adMetaInfo, "info");
        InMobiBanner inMobiBanner = this.f24110a.get();
        if (inMobiBanner == null || (mPubListener$media_release = inMobiBanner.getMPubListener$media_release()) == null) {
            return;
        }
        ck.p.j(inMobiBanner, "ad");
        ((Z1) mPubListener$media_release).f23882a.onAdDisplayed(inMobiBanner);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        Y1 mPubListener$media_release;
        ck.p.j(inMobiAdRequestStatus, "status");
        InMobiBanner inMobiBanner = this.f24110a.get();
        if (inMobiBanner == null || (mPubListener$media_release = inMobiBanner.getMPubListener$media_release()) == null) {
            return;
        }
        ck.p.j(inMobiBanner, "ad");
        ck.p.j(inMobiAdRequestStatus, "status");
        ((Z1) mPubListener$media_release).f23882a.onAdFetchFailed(inMobiBanner, inMobiAdRequestStatus);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchSuccessful(AdMetaInfo adMetaInfo) {
        Y1 mPubListener$media_release;
        ck.p.j(adMetaInfo, "info");
        InMobiBanner inMobiBanner = this.f24110a.get();
        if (inMobiBanner == null || (mPubListener$media_release = inMobiBanner.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiBanner, adMetaInfo);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdImpression(C2890gk c2890gk) {
        InMobiBanner inMobiBanner = this.f24110a.get();
        Y1 mPubListener$media_release = inMobiBanner != null ? inMobiBanner.getMPubListener$media_release() : null;
        if (mPubListener$media_release == null) {
            if (c2890gk != null) {
                c2890gk.b();
            }
        } else {
            ck.p.j(inMobiBanner, "ad");
            ((Z1) mPubListener$media_release).f23882a.onAdImpression(inMobiBanner);
            if (c2890gk != null) {
                c2890gk.c();
            }
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        ck.p.j(inMobiAdRequestStatus, "status");
        ck.p.i(C2769c2.class.getSimpleName(), "getSimpleName(...)");
        InMobiBanner inMobiBanner = this.f24110a.get();
        if (inMobiBanner == null) {
            return;
        }
        Y1 mPubListener$media_release = inMobiBanner.getMPubListener$media_release();
        if (mPubListener$media_release != null) {
            mPubListener$media_release.a(inMobiBanner, inMobiAdRequestStatus);
        }
        inMobiBanner.scheduleRefresh$media_release();
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadSucceeded(AdMetaInfo adMetaInfo) {
        C2820e2 mAdManager$media_release;
        ck.p.j(adMetaInfo, "info");
        InMobiBanner inMobiBanner = this.f24110a.get();
        if (inMobiBanner == null || (mAdManager$media_release = inMobiBanner.getMAdManager$media_release()) == null) {
            return;
        }
        if (!mAdManager$media_release.l()) {
            mAdManager$media_release.h();
            inMobiBanner.swapAdUnitsAndDisplayAd$media_release();
            Y1 mPubListener$media_release = inMobiBanner.getMPubListener$media_release();
            if (mPubListener$media_release != null) {
                mPubListener$media_release.b(inMobiBanner, adMetaInfo);
            }
            inMobiBanner.scheduleRefresh$media_release();
            return;
        }
        if (mAdManager$media_release.l()) {
            AbstractC2995l1 abstractC2995l1F = mAdManager$media_release.f();
            if (abstractC2995l1F != null) {
                abstractC2995l1F.c((short) 2173);
                return;
            }
            return;
        }
        AbstractC2995l1 abstractC2995l1F2 = mAdManager$media_release.f();
        if (abstractC2995l1F2 != null) {
            abstractC2995l1F2.c((short) 2174);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAudioStatusChanged(V1 v10) {
        AudioStatus audioStatus;
        ck.p.j(v10, "audioStatusInternal");
        InMobiBanner inMobiBanner = this.f24110a.get();
        if (inMobiBanner == null) {
            return;
        }
        inMobiBanner.setAudioStatusInternal$media_release(v10);
        AudioListener mAudioListener$media_release = inMobiBanner.getMAudioListener$media_release();
        if (mAudioListener$media_release != null) {
            V1.f23663b.getClass();
            ck.p.j(v10, "item");
            int iOrdinal = v10.ordinal();
            if (iOrdinal != 1) {
                audioStatus = iOrdinal != 2 ? AudioStatus.COMPLETED : AudioStatus.PAUSED;
            } else {
                audioStatus = AudioStatus.PLAYING;
            }
            mAudioListener$media_release.onAudioStatusChanged(inMobiBanner, audioStatus);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onImraidLog(String str) {
        Y1 mPubListener$media_release;
        ck.p.j(str, CreativeInfo.f44317an);
        InMobiBanner inMobiBanner = this.f24110a.get();
        if (inMobiBanner == null || (mPubListener$media_release = inMobiBanner.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiBanner, str);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreated(byte[] bArr) {
        Y1 mPubListener$media_release;
        ck.p.j(bArr, AdActivity.REQUEST_KEY_EXTRA);
        InMobiBanner inMobiBanner = this.f24110a.get();
        if (inMobiBanner == null || (mPubListener$media_release = inMobiBanner.getMPubListener$media_release()) == null) {
            return;
        }
        ((Z1) mPubListener$media_release).f23882a.onRequestPayloadCreated(bArr);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreationFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        Y1 mPubListener$media_release;
        ck.p.j(inMobiAdRequestStatus, "reason");
        InMobiBanner inMobiBanner = this.f24110a.get();
        if (inMobiBanner == null || (mPubListener$media_release = inMobiBanner.getMPubListener$media_release()) == null) {
            return;
        }
        ck.p.j(inMobiAdRequestStatus, "status");
        ((Z1) mPubListener$media_release).f23882a.onRequestPayloadCreationFailed(inMobiAdRequestStatus);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRewardsUnlocked(Map<Object, ? extends Object> map) {
        Y1 mPubListener$media_release;
        ck.p.j(map, "rewards");
        InMobiBanner inMobiBanner = this.f24110a.get();
        if (inMobiBanner == null || (mPubListener$media_release = inMobiBanner.getMPubListener$media_release()) == null) {
            return;
        }
        ck.p.j(inMobiBanner, "ad");
        ck.p.j(map, "rewards");
        ((Z1) mPubListener$media_release).f23882a.onRewardsUnlocked(inMobiBanner, map);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onUserLeftApplication() {
        Y1 mPubListener$media_release;
        InMobiBanner inMobiBanner = this.f24110a.get();
        if (inMobiBanner == null || (mPubListener$media_release = inMobiBanner.getMPubListener$media_release()) == null) {
            return;
        }
        ck.p.j(inMobiBanner, "ad");
        ((Z1) mPubListener$media_release).f23882a.onUserLeftApplication(inMobiBanner);
    }
}
