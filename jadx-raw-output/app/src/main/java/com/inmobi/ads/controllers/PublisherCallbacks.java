package com.inmobi.ads.controllers;

import androidx.annotation.Keep;
import androidx.annotation.UiThread;
import ck.p;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C2890gk;
import com.inmobi.media.Qg;
import com.inmobi.media.V1;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.vungle.ads.internal.ui.AdActivity;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@UiThread
public abstract class PublisherCallbacks {
    public static final Qg Companion = new Qg();
    public static final byte NORMAL_FLOW = 0;
    public static final byte PRELOAD_FLOW = 1;

    public abstract byte getType();

    public abstract void onAdClicked(Map<Object, ? extends Object> map);

    public abstract void onAdDismissed();

    public void onAdDisplayFailed() {
    }

    public abstract void onAdDisplayed(AdMetaInfo adMetaInfo);

    public abstract void onAdFetchFailed(InMobiAdRequestStatus inMobiAdRequestStatus);

    public void onAdFetchSuccessful(AdMetaInfo adMetaInfo) {
        p.j(adMetaInfo, "info");
    }

    public void onAdImpressed() {
    }

    public void onAdImpression(C2890gk c2890gk) {
    }

    public abstract void onAdLoadFailed(InMobiAdRequestStatus inMobiAdRequestStatus);

    public void onAdLoadSucceeded(AdMetaInfo adMetaInfo) {
        p.j(adMetaInfo, "info");
    }

    public void onAdWillDisplay() {
    }

    public void onAudioStateChanged(boolean z10) {
    }

    public void onAudioStatusChanged(V1 v10) {
        p.j(v10, "audioStatusInternal");
    }

    public void onImraidLog(String str) {
        p.j(str, CreativeInfo.f44317an);
    }

    public void onRequestPayloadCreated(byte[] bArr) {
        p.j(bArr, AdActivity.REQUEST_KEY_EXTRA);
    }

    public void onRequestPayloadCreationFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        p.j(inMobiAdRequestStatus, "reason");
    }

    public void onRewardsUnlocked(Map<Object, ? extends Object> map) {
        p.j(map, "rewards");
    }

    public abstract void onUserLeftApplication();

    public void onVideoCompleted() {
    }

    public void onVideoPaused() {
    }

    public void onVideoResumed() {
    }

    public void onVideoStarted() {
    }
}
