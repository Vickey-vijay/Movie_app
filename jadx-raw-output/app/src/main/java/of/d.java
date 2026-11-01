package of;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.iab.IabError;
import io.bidmachine.iab.utils.IabClickCallback;
import io.bidmachine.iab.vast.VastActivityListener;
import io.bidmachine.iab.vast.VastRequest;
import io.bidmachine.iab.vast.activity.VastActivity;
import io.bidmachine.measurer.MraidOMSDKAdMeasurer;
import io.bidmachine.measurer.VastOMSDKAdMeasurer;
import io.bidmachine.rendering.utils.UrlHandler;
import io.bidmachine.unified.UnifiedFullscreenAdCallback;
import io.bidmachine.util.SafeExecutable;
import io.bidmachine.utils.IabUtils;

/* JADX INFO: compiled from: VastFullScreenAdShowListener.java */
/* JADX INFO: loaded from: classes11.dex */
public class d implements VastActivityListener {

    @NonNull
    private final UnifiedFullscreenAdCallback callback;

    @Nullable
    private final MraidOMSDKAdMeasurer postBannerAdMeasurer;

    @Nullable
    private final VastOMSDKAdMeasurer vastOMSDKAdMeasurer;

    @Override // io.bidmachine.iab.vast.VastActivityListener
    public void onVastClick(@NonNull VastActivity vastActivity, @NonNull VastRequest vastRequest, @NonNull final IabClickCallback iabClickCallback, @Nullable String str) {
        this.callback.onAdClicked();
        if (str != null) {
            UrlHandler.openUrl(vastActivity, str, new SafeExecutable() { // from class: of.c
                @Override // io.bidmachine.util.SafeExecutable
                public final void onExecute(Object obj) {
                    iabClickCallback.clickHandled();
                }
            });
        } else {
            iabClickCallback.clickHandleCanceled();
        }
    }

    @Override // io.bidmachine.iab.vast.VastActivityListener
    public void onVastComplete(@NonNull VastActivity vastActivity, @NonNull VastRequest vastRequest) {
        VastOMSDKAdMeasurer vastOMSDKAdMeasurer = this.vastOMSDKAdMeasurer;
        if (vastOMSDKAdMeasurer != null) {
            vastOMSDKAdMeasurer.destroy();
        }
        this.callback.onAdFinished();
    }

    @Override // io.bidmachine.iab.vast.VastActivityListener
    public void onVastDismiss(@NonNull VastActivity vastActivity, @Nullable VastRequest vastRequest, boolean z10) {
        MraidOMSDKAdMeasurer mraidOMSDKAdMeasurer = this.postBannerAdMeasurer;
        if (mraidOMSDKAdMeasurer != null) {
            mraidOMSDKAdMeasurer.destroy();
        }
        this.callback.onAdClosed();
    }

    @Override // io.bidmachine.iab.vast.VastActivityListener
    public void onVastShowFailed(@Nullable VastRequest vastRequest, @NonNull IabError iabError) {
        this.callback.onAdShowFailed(IabUtils.mapError(iabError));
    }

    @Override // io.bidmachine.iab.vast.VastActivityListener
    public void onVastShown(@NonNull VastActivity vastActivity, @NonNull VastRequest vastRequest) {
        this.callback.onAdShown();
    }

    public d(@NonNull UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, @Nullable VastOMSDKAdMeasurer vastOMSDKAdMeasurer, @Nullable MraidOMSDKAdMeasurer mraidOMSDKAdMeasurer) {
        this.callback = unifiedFullscreenAdCallback;
        this.vastOMSDKAdMeasurer = vastOMSDKAdMeasurer;
        this.postBannerAdMeasurer = mraidOMSDKAdMeasurer;
    }
}
