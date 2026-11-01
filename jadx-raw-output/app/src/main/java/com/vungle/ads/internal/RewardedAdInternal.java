package com.vungle.ads.internal;

import android.content.Context;
import ck.p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.presenter.AdPlayCallback;
import com.vungle.ads.internal.presenter.PresenterDelegate;
import com.vungle.ads.internal.ui.AdActivity;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Metadata;

/* JADX INFO: compiled from: RewardedAdInternal.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J!\u0010\u0014\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR$\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR$\u0010!\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR$\u0010$\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0016\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001a¨\u0006+"}, d2 = {"Lcom/vungle/ads/internal/RewardedAdInternal;", "Lcom/vungle/ads/internal/FullscreenAdInternal;", "Lcom/vungle/ads/internal/presenter/PresenterDelegate;", "", "getUserId", "getAlertTitleText", "getAlertBodyText", "getAlertCloseButtonText", "getAlertContinueButtonText", "Lcom/vungle/ads/internal/model/Placement;", "placement", "", "isValidAdTypeForPlacement", "Lcom/vungle/ads/internal/presenter/AdPlayCallback;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/vungle/ads/internal/model/AdPayload;", "advertisement", "Lmj/r;", "renderAd$vungle_ads_release", "(Lcom/vungle/ads/internal/presenter/AdPlayCallback;Lcom/vungle/ads/internal/model/AdPayload;)V", "renderAd", "alertTitleText", "Ljava/lang/String;", "getAlertTitleText$vungle_ads_release", "()Ljava/lang/String;", "setAlertTitleText$vungle_ads_release", "(Ljava/lang/String;)V", "alertBodyText", "getAlertBodyText$vungle_ads_release", "setAlertBodyText$vungle_ads_release", "alertCloseButtonText", "getAlertCloseButtonText$vungle_ads_release", "setAlertCloseButtonText$vungle_ads_release", "alertContinueButtonText", "getAlertContinueButtonText$vungle_ads_release", "setAlertContinueButtonText$vungle_ads_release", "userId", "getUserId$vungle_ads_release", "setUserId$vungle_ads_release", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "<init>", "(Landroid/content/Context;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class RewardedAdInternal extends FullscreenAdInternal implements PresenterDelegate {
    private String alertBodyText;
    private String alertCloseButtonText;
    private String alertContinueButtonText;
    private String alertTitleText;
    private String userId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardedAdInternal(Context context) {
        super(context);
        p.j(context, GAMConfig.KEY_CONTEXT);
    }

    @Override // com.vungle.ads.internal.presenter.PresenterDelegate
    public String getAlertBodyText() {
        return this.alertBodyText;
    }

    public final String getAlertBodyText$vungle_ads_release() {
        return this.alertBodyText;
    }

    @Override // com.vungle.ads.internal.presenter.PresenterDelegate
    public String getAlertCloseButtonText() {
        return this.alertCloseButtonText;
    }

    public final String getAlertCloseButtonText$vungle_ads_release() {
        return this.alertCloseButtonText;
    }

    @Override // com.vungle.ads.internal.presenter.PresenterDelegate
    public String getAlertContinueButtonText() {
        return this.alertContinueButtonText;
    }

    public final String getAlertContinueButtonText$vungle_ads_release() {
        return this.alertContinueButtonText;
    }

    @Override // com.vungle.ads.internal.presenter.PresenterDelegate
    public String getAlertTitleText() {
        return this.alertTitleText;
    }

    public final String getAlertTitleText$vungle_ads_release() {
        return this.alertTitleText;
    }

    @Override // com.vungle.ads.internal.presenter.PresenterDelegate
    public String getUserId() {
        return this.userId;
    }

    public final String getUserId$vungle_ads_release() {
        return this.userId;
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdTypeForPlacement(Placement placement) {
        p.j(placement, "placement");
        return placement.isRewardedVideo();
    }

    @Override // com.vungle.ads.internal.AdInternal
    public void renderAd$vungle_ads_release(AdPlayCallback listener, AdPayload advertisement) {
        p.j(advertisement, "advertisement");
        AdActivity.INSTANCE.setPresenterDelegate$vungle_ads_release(this);
        super.renderAd$vungle_ads_release(listener, advertisement);
    }

    public final void setAlertBodyText$vungle_ads_release(String str) {
        this.alertBodyText = str;
    }

    public final void setAlertCloseButtonText$vungle_ads_release(String str) {
        this.alertCloseButtonText = str;
    }

    public final void setAlertContinueButtonText$vungle_ads_release(String str) {
        this.alertContinueButtonText = str;
    }

    public final void setAlertTitleText$vungle_ads_release(String str) {
        this.alertTitleText = str;
    }

    public final void setUserId$vungle_ads_release(String str) {
        this.userId = str;
    }
}
