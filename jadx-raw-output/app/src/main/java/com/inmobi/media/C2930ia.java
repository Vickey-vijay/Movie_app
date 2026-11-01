package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.ia, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2930ia extends AbstractC2905ha {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterstitialAdEventListener f24547a;

    @Override // com.inmobi.media.J
    public final void a(Object obj, Map map) {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) obj;
        ck.p.j(inMobiInterstitial, "ad");
        ck.p.j(map, "params");
        this.f24547a.onAdClicked(inMobiInterstitial, map);
    }

    public C2930ia(InterstitialAdEventListener interstitialAdEventListener) {
        ck.p.j(interstitialAdEventListener, "adEventListener");
        this.f24547a = interstitialAdEventListener;
    }

    @Override // com.inmobi.media.J
    public final void b(Object obj, AdMetaInfo adMetaInfo) {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) obj;
        ck.p.j(inMobiInterstitial, "ad");
        ck.p.j(adMetaInfo, "info");
        this.f24547a.onAdLoadSucceeded(inMobiInterstitial, adMetaInfo);
    }

    @Override // com.inmobi.media.J
    public final void a(Object obj, AdMetaInfo adMetaInfo) {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) obj;
        ck.p.j(inMobiInterstitial, "ad");
        ck.p.j(adMetaInfo, "info");
        this.f24547a.onAdFetchSuccessful(inMobiInterstitial, adMetaInfo);
    }

    @Override // com.inmobi.media.J
    public final void a(Object obj, InMobiAdRequestStatus inMobiAdRequestStatus) {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) obj;
        ck.p.j(inMobiInterstitial, "ad");
        ck.p.j(inMobiAdRequestStatus, "status");
        this.f24547a.onAdLoadFailed(inMobiInterstitial, inMobiAdRequestStatus);
    }

    @Override // com.inmobi.media.J
    public final void a(Object obj, String str) {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) obj;
        ck.p.j(inMobiInterstitial, "ad");
        ck.p.j(str, "data");
        try {
            Class<?> cls = Class.forName("IMraidLog");
            Method declaredMethod = cls.getDeclaredMethod("imraidLog", InterstitialAdEventListener.class, InMobiInterstitial.class, String.class);
            ck.p.i(declaredMethod, "getDeclaredMethod(...)");
            declaredMethod.invoke(cls.newInstance(), this.f24547a, inMobiInterstitial, str);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
