package com.vungle.ads.internal.presenter;

import ck.p;
import com.ironsource.Mf;
import com.vungle.ads.VungleError;
import kotlin.Metadata;

/* JADX INFO: compiled from: AdPlayCallback.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0001J\u0013\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0001J\u0013\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0001J\u0013\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0001J\u0013\u0010\t\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0001J\u0013\u0010\n\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0001J\u0011\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0001R\u0014\u0010\u000e\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/vungle/ads/internal/presenter/AdPlayCallbackWrapper;", "Lcom/vungle/ads/internal/presenter/AdPlayCallback;", "", "id", "Lmj/r;", "onAdClick", "onAdEnd", "onAdImpression", Mf.f27061k, Mf.f27059i, "onAdStart", "Lcom/vungle/ads/VungleError;", "error", "onFailure", "adPlayCallback", "Lcom/vungle/ads/internal/presenter/AdPlayCallback;", "<init>", "(Lcom/vungle/ads/internal/presenter/AdPlayCallback;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public class AdPlayCallbackWrapper implements AdPlayCallback {
    private final AdPlayCallback adPlayCallback;

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdClick(String str) {
        this.adPlayCallback.onAdClick(str);
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdEnd(String str) {
        this.adPlayCallback.onAdEnd(str);
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdImpression(String str) {
        this.adPlayCallback.onAdImpression(str);
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdLeftApplication(String str) {
        this.adPlayCallback.onAdLeftApplication(str);
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdRewarded(String str) {
        this.adPlayCallback.onAdRewarded(str);
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdStart(String str) {
        this.adPlayCallback.onAdStart(str);
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onFailure(VungleError vungleError) {
        p.j(vungleError, "error");
        this.adPlayCallback.onFailure(vungleError);
    }

    public AdPlayCallbackWrapper(AdPlayCallback adPlayCallback) {
        p.j(adPlayCallback, "adPlayCallback");
        this.adPlayCallback = adPlayCallback;
    }
}
