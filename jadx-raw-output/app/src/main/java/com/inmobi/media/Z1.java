package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.listeners.BannerAdEventListener;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class Z1 extends Y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BannerAdEventListener f23882a;

    @Override // com.inmobi.media.J
    public final void a(Object obj, Map map) {
        InMobiBanner inMobiBanner = (InMobiBanner) obj;
        ck.p.j(inMobiBanner, "ad");
        ck.p.j(map, "params");
        this.f23882a.onAdClicked(inMobiBanner, map);
    }

    public Z1(BannerAdEventListener bannerAdEventListener) {
        ck.p.j(bannerAdEventListener, "adEventListener");
        this.f23882a = bannerAdEventListener;
    }

    @Override // com.inmobi.media.J
    public final void b(Object obj, AdMetaInfo adMetaInfo) {
        InMobiBanner inMobiBanner = (InMobiBanner) obj;
        ck.p.j(inMobiBanner, "ad");
        ck.p.j(adMetaInfo, "info");
        this.f23882a.onAdLoadSucceeded(inMobiBanner, adMetaInfo);
    }

    @Override // com.inmobi.media.J
    public final void a(Object obj, AdMetaInfo adMetaInfo) {
        InMobiBanner inMobiBanner = (InMobiBanner) obj;
        ck.p.j(inMobiBanner, "ad");
        ck.p.j(adMetaInfo, "info");
        this.f23882a.onAdFetchSuccessful(inMobiBanner, adMetaInfo);
    }

    @Override // com.inmobi.media.J
    public final void a(Object obj, InMobiAdRequestStatus inMobiAdRequestStatus) {
        InMobiBanner inMobiBanner = (InMobiBanner) obj;
        ck.p.j(inMobiBanner, "ad");
        ck.p.j(inMobiAdRequestStatus, "status");
        ck.p.i(Y1.class.getSimpleName(), "getSimpleName(...)");
        this.f23882a.onAdLoadFailed(inMobiBanner, inMobiAdRequestStatus);
    }

    @Override // com.inmobi.media.J
    public final void a(Object obj, String str) {
        InMobiBanner inMobiBanner = (InMobiBanner) obj;
        ck.p.j(inMobiBanner, "ad");
        ck.p.j(str, "data");
        try {
            Class<?> cls = Class.forName("IMraidLog");
            Method declaredMethod = cls.getDeclaredMethod("imraidLog", BannerAdEventListener.class, InMobiBanner.class, String.class);
            ck.p.i(declaredMethod, "getDeclaredMethod(...)");
            declaredMethod.invoke(cls.newInstance(), this.f23882a, inMobiBanner, str);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
