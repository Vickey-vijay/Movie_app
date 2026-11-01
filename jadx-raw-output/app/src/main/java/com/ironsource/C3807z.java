package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3807z implements InterfaceC3610n7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P8 f31683a;

    public C3807z(P8 p10) {
        ck.p.j(p10, "sessionDepthService");
        this.f31683a = p10;
    }

    @Override // com.ironsource.InterfaceC3610n7
    public void a(Map<String, Object> map) {
        ck.p.j(map, "output");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Q6.J0, Integer.valueOf(this.f31683a.a(LevelPlay.AdFormat.INTERSTITIAL)));
        map.put("interstitial", linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(Q6.J0, Integer.valueOf(this.f31683a.a(LevelPlay.AdFormat.REWARDED)));
        map.put("rewardedVideo", linkedHashMap2);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put(Q6.J0, Integer.valueOf(this.f31683a.a(LevelPlay.AdFormat.BANNER)));
        map.put("banner", linkedHashMap3);
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put(Q6.J0, Integer.valueOf(this.f31683a.a(LevelPlay.AdFormat.NATIVE_AD)));
        map.put("nativeAd", linkedHashMap4);
    }
}
