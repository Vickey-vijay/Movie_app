package io.bidmachine;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdRequest;
import io.bidmachine.core.VisibilitySource;
import io.bidmachine.models.AdObject;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.unified.UnifiedAd;
import io.bidmachine.unified.UnifiedAdCallback;
import io.bidmachine.unified.UnifiedAdRequestParams;
import io.bidmachine.unified.UnifiedFullscreenAd;
import io.bidmachine.utils.BMError;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class AdObjectImpl<AdRequestType extends AdRequest<AdRequestType, ?, UnifiedAdRequestParamsType>, AdObjectParamsType extends AdObjectParams, UnifiedAdType extends UnifiedAd<UnifiedAdCallbackType, UnifiedAdRequestParamsType>, UnifiedAdCallbackType extends UnifiedAdCallback, UnifiedAdRequestParamsType extends UnifiedAdRequestParams> implements AdObject<AdObjectParamsType, UnifiedAdRequestParamsType, UnifiedAdCallbackType> {

    @NonNull
    private final AdObjectParamsType adObjectParams;

    @NonNull
    private final AdRequestType adRequest;

    @NonNull
    private final ContextProvider contextProvider;

    @NonNull
    private final AdProcessCallback processCallback;

    @NonNull
    private final UnifiedAdType unifiedAd;

    @NonNull
    private final UnifiedAdCallbackType unifiedAdCallback;

    public static class BaseUnifiedAdCallback implements UnifiedAdCallback {

        @NonNull
        public final AdProcessCallback processCallback;

        @Override // io.bidmachine.unified.UnifiedAdCallback
        public void onAdClicked() {
            this.processCallback.processClicked();
        }

        @Override // io.bidmachine.unified.UnifiedAdCallback
        public void onAdExpired() {
            this.processCallback.processExpired();
        }

        @Override // io.bidmachine.unified.UnifiedAdCallback
        public void onAdLoadFailed(@NonNull BMError bMError) {
            this.processCallback.processLoadFail(bMError);
        }

        @Override // io.bidmachine.unified.UnifiedAdCallback
        public void onAdShowFailed(@NonNull BMError bMError) {
            this.processCallback.processShowFail(bMError);
        }

        @Override // io.bidmachine.unified.UnifiedAdCallback
        public void onAdShown() {
            this.processCallback.processShown();
        }

        @Override // io.bidmachine.unified.UnifiedAdCallback
        public void onBrokenCreativeEvent(@Nullable Map<String, Object> map) {
            this.processCallback.onBrokenCreativeEvent(map);
        }

        @Override // io.bidmachine.unified.UnifiedAdCallback
        public void setVisibilitySource(@NonNull VisibilitySource visibilitySource) {
            this.processCallback.setVisibilitySource(visibilitySource);
        }

        public BaseUnifiedAdCallback(@NonNull AdProcessCallback adProcessCallback) {
            this.processCallback = adProcessCallback;
        }
    }

    @Override // io.bidmachine.models.AdObject
    @NonNull
    public abstract /* synthetic */ UnifiedAdCallbackType createUnifiedCallback(@NonNull AdProcessCallback adProcessCallback);

    @Override // io.bidmachine.models.AdObject
    public void hide() {
    }

    @Nullable
    public Activity getActivity() {
        return this.contextProvider.getActivity();
    }

    @NonNull
    public AdRequestType getAdRequest() {
        return this.adRequest;
    }

    @NonNull
    public Context getApplicationContext() {
        return this.contextProvider.getApplicationContext();
    }

    @Override // io.bidmachine.models.AdObject
    @NonNull
    public AdObjectParamsType getParams() {
        return this.adObjectParams;
    }

    @NonNull
    public AdProcessCallback getProcessCallback() {
        return this.processCallback;
    }

    @NonNull
    public UnifiedAdType getUnifiedAd() {
        return this.unifiedAd;
    }

    @NonNull
    public UnifiedAdCallbackType getUnifiedAdCallback() {
        return this.unifiedAdCallback;
    }

    @Override // io.bidmachine.models.AdObject
    public void load(@NonNull ContextProvider contextProvider, @NonNull UnifiedAdRequestParamsType unifiedadrequestparamstype, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        this.unifiedAd.load(contextProvider, this.unifiedAdCallback, unifiedadrequestparamstype, this.adObjectParams.getMediationParams(), networkAdUnit);
    }

    public AdObjectImpl(@NonNull ContextProvider contextProvider, @NonNull AdProcessCallback adProcessCallback, @NonNull AdRequestType adrequesttype, @NonNull AdObjectParamsType adobjectparamstype, @NonNull UnifiedAdType unifiedadtype) {
        this.contextProvider = contextProvider;
        this.processCallback = adProcessCallback;
        this.adRequest = adrequesttype;
        this.adObjectParams = adobjectparamstype;
        this.unifiedAd = unifiedadtype;
        this.unifiedAdCallback = (UnifiedAdCallbackType) createUnifiedCallback(adProcessCallback);
    }

    @Override // io.bidmachine.models.AdObject
    @Nullable
    public Map<String, Object> getCustomParams() {
        return getUnifiedAd().getCustomParams();
    }

    @Override // io.bidmachine.models.AdObject
    @CallSuper
    public void onClicked() {
        getUnifiedAd().onClicked();
    }

    @Override // io.bidmachine.models.AdObject
    @CallSuper
    public void onClosed(boolean z10) {
        UnifiedAd unifiedAd = getUnifiedAd();
        if (unifiedAd instanceof UnifiedFullscreenAd) {
            ((UnifiedFullscreenAd) unifiedAd).onClosed(z10);
        }
    }

    @Override // io.bidmachine.models.AdObject
    @CallSuper
    public void onDestroy() {
        getUnifiedAd().onDestroy();
    }

    @Override // io.bidmachine.models.AdObject
    public void onExpired() {
        getUnifiedAd().onExpired();
    }

    @Override // io.bidmachine.models.AdObject
    @CallSuper
    public void onFinished() {
        UnifiedAd unifiedAd = getUnifiedAd();
        if (unifiedAd instanceof UnifiedFullscreenAd) {
            ((UnifiedFullscreenAd) unifiedAd).onFinished();
        }
    }

    @Override // io.bidmachine.models.AdObject
    @CallSuper
    public void onImpression() {
        getUnifiedAd().onImpression();
    }

    @Override // io.bidmachine.models.AdObject
    @CallSuper
    public void onShowFailed() {
        getUnifiedAd().onShowFailed();
    }

    @Override // io.bidmachine.models.AdObject
    @CallSuper
    public void onShown() {
        getUnifiedAd().onShown();
    }
}
