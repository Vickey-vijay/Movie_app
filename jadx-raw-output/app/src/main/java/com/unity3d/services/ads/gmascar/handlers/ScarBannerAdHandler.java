package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import oc.f;

/* JADX INFO: loaded from: classes11.dex */
public class ScarBannerAdHandler implements f {
    private final IEventSender _eventSender;
    private final String _operationId;

    @Override // oc.d
    public void onAdClicked() {
        this._eventSender.sendEvent(WebViewEventCategory.BANNER, BannerBridge.BannerEvent.SCAR_BANNER_CLICKED, this._operationId);
    }

    @Override // oc.d
    public void onAdClosed() {
        this._eventSender.sendEvent(WebViewEventCategory.BANNER, BannerBridge.BannerEvent.SCAR_BANNER_CLOSED, this._operationId);
    }

    @Override // oc.d
    public void onAdFailedToLoad(int i10, String str) {
        this._eventSender.sendEvent(WebViewEventCategory.BANNER, BannerBridge.BannerEvent.SCAR_BANNER_LOAD_FAILED, this._operationId, Integer.valueOf(i10), str);
    }

    @Override // oc.f
    public void onAdImpression() {
        this._eventSender.sendEvent(WebViewEventCategory.BANNER, BannerBridge.BannerEvent.SCAR_BANNER_IMPRESSION, this._operationId);
    }

    @Override // oc.d
    public void onAdOpened() {
        this._eventSender.sendEvent(WebViewEventCategory.BANNER, BannerBridge.BannerEvent.SCAR_BANNER_OPENED, this._operationId);
    }

    public ScarBannerAdHandler(IEventSender iEventSender, String str) {
        this._eventSender = iEventSender;
        this._operationId = str;
    }

    @Override // oc.d
    public void onAdLoaded() {
        BannerViewCache.getInstance().addScarContainer(this._operationId);
        this._eventSender.sendEvent(WebViewEventCategory.BANNER, BannerBridge.BannerEvent.SCAR_BANNER_LOADED, this._operationId);
    }
}
