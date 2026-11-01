package com.unity3d.ads.adplayer.model;

import ck.p;
import com.unity3d.services.banners.bridge.BannerBridge;

/* JADX INFO: compiled from: WebViewEvent.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class OnScarBannerEvent implements WebViewEvent {
    private final String category;
    private final String name;
    private final Object[] parameters;

    public OnScarBannerEvent(BannerBridge.BannerEvent bannerEvent) {
        p.j(bannerEvent, "bannerEvent");
        this.category = "BANNER";
        this.name = bannerEvent.name();
        this.parameters = new Object[0];
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    public String getCategory() {
        return this.category;
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    public String getName() {
        return this.name;
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    public Object[] getParameters() {
        return this.parameters;
    }
}
