package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.AudioStatus;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiAudio;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.ads.listeners.AudioAdEventListener;
import com.vungle.ads.internal.ui.AdActivity;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract class R1 extends PublisherCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<InMobiAudio> f23420a;

    public final WeakReference<InMobiAudio> a() {
        return this.f23420a;
    }

    public R1(InMobiAudio inMobiAudio) {
        ck.p.j(inMobiAudio, "audio");
        this.f23420a = new WeakReference<>(inMobiAudio);
    }

    public final void a(WeakReference<InMobiAudio> weakReference) {
        ck.p.j(weakReference, "<set-?>");
        this.f23420a = weakReference;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdClicked(Map<Object, ? extends Object> map) {
        AudioAdEventListener mPubListener$media_release;
        ck.p.j(map, "params");
        InMobiAudio inMobiAudio = this.f23420a.get();
        if (inMobiAudio == null || (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.onAdClicked(inMobiAudio, map);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDismissed() {
        AudioAdEventListener mPubListener$media_release;
        InMobiAudio inMobiAudio = this.f23420a.get();
        if (inMobiAudio == null || (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.onAdDismissed(inMobiAudio);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayFailed() {
        AudioAdEventListener mPubListener$media_release;
        InMobiAudio inMobiAudio = this.f23420a.get();
        if (inMobiAudio == null || (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.onAdDisplayFailed(inMobiAudio);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayed(AdMetaInfo adMetaInfo) {
        AudioAdEventListener mPubListener$media_release;
        ck.p.j(adMetaInfo, "info");
        InMobiAudio inMobiAudio = this.f23420a.get();
        if (inMobiAudio == null || (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.onAdDisplayed(inMobiAudio);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchSuccessful(AdMetaInfo adMetaInfo) {
        AudioAdEventListener mPubListener$media_release;
        ck.p.j(adMetaInfo, "info");
        InMobiAudio inMobiAudio = this.f23420a.get();
        if (inMobiAudio == null || (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.onAdFetchSuccessful(inMobiAudio, adMetaInfo);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdImpression(C2890gk c2890gk) {
        InMobiAudio inMobiAudio = this.f23420a.get();
        AudioAdEventListener mPubListener$media_release = inMobiAudio != null ? inMobiAudio.getMPubListener$media_release() : null;
        if (mPubListener$media_release == null) {
            if (c2890gk != null) {
                c2890gk.b();
            }
        } else {
            mPubListener$media_release.onAdImpression(inMobiAudio);
            if (c2890gk != null) {
                c2890gk.c();
            }
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        AudioAdEventListener mPubListener$media_release;
        ck.p.j(inMobiAdRequestStatus, "status");
        InMobiAudio inMobiAudio = this.f23420a.get();
        if (inMobiAudio == null || (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.onAdLoadFailed(inMobiAudio, inMobiAdRequestStatus);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadSucceeded(AdMetaInfo adMetaInfo) {
        AudioAdEventListener mPubListener$media_release;
        ck.p.j(adMetaInfo, "info");
        InMobiAudio inMobiAudio = this.f23420a.get();
        if (inMobiAudio == null || (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.onAdLoadSucceeded(inMobiAudio, adMetaInfo);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAudioStatusChanged(V1 v10) {
        AudioAdEventListener mPubListener$media_release;
        AudioStatus audioStatus;
        ck.p.j(v10, "audioStatusInternal");
        InMobiAudio inMobiAudio = this.f23420a.get();
        if (inMobiAudio == null || (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) == null) {
            return;
        }
        V1.f23663b.getClass();
        ck.p.j(v10, "item");
        int iOrdinal = v10.ordinal();
        if (iOrdinal != 1) {
            audioStatus = iOrdinal != 2 ? AudioStatus.COMPLETED : AudioStatus.PAUSED;
        } else {
            audioStatus = AudioStatus.PLAYING;
        }
        mPubListener$media_release.onAudioStatusChanged(inMobiAudio, audioStatus);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreated(byte[] bArr) {
        AudioAdEventListener mPubListener$media_release;
        ck.p.j(bArr, AdActivity.REQUEST_KEY_EXTRA);
        InMobiAudio inMobiAudio = this.f23420a.get();
        if (inMobiAudio == null || (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.onRequestPayloadCreated(bArr);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreationFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        AudioAdEventListener mPubListener$media_release;
        ck.p.j(inMobiAdRequestStatus, "reason");
        InMobiAudio inMobiAudio = this.f23420a.get();
        if (inMobiAudio == null || (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.onRequestPayloadCreationFailed(inMobiAdRequestStatus);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRewardsUnlocked(Map<Object, ? extends Object> map) {
        AudioAdEventListener mPubListener$media_release;
        ck.p.j(map, "rewards");
        InMobiAudio inMobiAudio = this.f23420a.get();
        if (inMobiAudio == null || (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.onRewardsUnlocked(inMobiAudio, map);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onUserLeftApplication() {
        AudioAdEventListener mPubListener$media_release;
        InMobiAudio inMobiAudio = this.f23420a.get();
        if (inMobiAudio == null || (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.onUserLeftApplication(inMobiAudio);
    }
}
