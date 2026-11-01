package mf;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.Executable;
import io.bidmachine.core.Utils;
import io.bidmachine.iab.IabError;
import io.bidmachine.iab.mraid.MraidInterstitial;
import io.bidmachine.iab.mraid.MraidInterstitialListener;
import io.bidmachine.iab.utils.IabClickCallback;
import io.bidmachine.measurer.MraidOMSDKAdMeasurer;
import io.bidmachine.rendering.model.PrivacySheetParams;
import io.bidmachine.rendering.utils.UrlHandler;
import io.bidmachine.rendering.view.PrivacySheetDialog;
import io.bidmachine.unified.UnifiedFullscreenAdCallback;
import io.bidmachine.util.SafeExecutable;
import io.bidmachine.utils.IabUtils;

/* JADX INFO: compiled from: MraidFullScreenAdListener.java */
/* JADX INFO: loaded from: classes3.dex */
public class l implements MraidInterstitialListener {

    @NonNull
    private final Context applicationContext;

    @NonNull
    private final UnifiedFullscreenAdCallback callback;

    @Nullable
    private final MraidOMSDKAdMeasurer mraidOMSDKAdMeasurer;

    @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
    public void onPlayVideo(@NonNull MraidInterstitial mraidInterstitial, @NonNull String str) {
    }

    @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
    public void onCalendarEvent(@NonNull MraidInterstitial mraidInterstitial, @NonNull String str, @NonNull final IabClickCallback iabClickCallback) {
        this.callback.onAdClicked();
        UrlHandler.openCalendar(this.applicationContext, str, new SafeExecutable() { // from class: mf.i
            @Override // io.bidmachine.util.SafeExecutable
            public final void onExecute(Object obj) {
                iabClickCallback.clickHandled();
            }
        });
    }

    @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
    public void onExpired(@NonNull MraidInterstitial mraidInterstitial, @NonNull IabError iabError) {
        this.callback.onAdExpired();
    }

    @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
    public void onLoadFailed(@NonNull MraidInterstitial mraidInterstitial, @NonNull IabError iabError) {
        this.callback.onAdLoadFailed(IabUtils.mapError(iabError));
    }

    @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
    public void onLoaded(@NonNull MraidInterstitial mraidInterstitial) {
        this.callback.onAdLoaded();
    }

    @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
    public void onOpenUrl(@NonNull MraidInterstitial mraidInterstitial, @NonNull String str, @NonNull final IabClickCallback iabClickCallback) {
        this.callback.onAdClicked();
        UrlHandler.openUrl(this.applicationContext, str, new SafeExecutable() { // from class: mf.j
            @Override // io.bidmachine.util.SafeExecutable
            public final void onExecute(Object obj) {
                iabClickCallback.clickHandled();
            }
        });
    }

    @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
    public void onShowFailed(@NonNull MraidInterstitial mraidInterstitial, @NonNull IabError iabError) {
        this.callback.onAdShowFailed(IabUtils.mapError(iabError));
    }

    @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
    public void onShown(@NonNull MraidInterstitial mraidInterstitial) {
        this.callback.onAdShown();
    }

    @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
    public void onStorePicture(@NonNull MraidInterstitial mraidInterstitial, @NonNull String str, @NonNull final IabClickCallback iabClickCallback) {
        this.callback.onAdClicked();
        UrlHandler.storePicture(this.applicationContext, str, new SafeExecutable() { // from class: mf.k
            @Override // io.bidmachine.util.SafeExecutable
            public final void onExecute(Object obj) {
                iabClickCallback.clickHandled();
            }
        });
    }

    public l(@NonNull Context context, @NonNull UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, @Nullable MraidOMSDKAdMeasurer mraidOMSDKAdMeasurer) {
        this.applicationContext = context;
        this.callback = unifiedFullscreenAdCallback;
        this.mraidOMSDKAdMeasurer = mraidOMSDKAdMeasurer;
    }

    @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
    public void onClose(@NonNull MraidInterstitial mraidInterstitial) {
        if (mraidInterstitial.isShown()) {
            MraidOMSDKAdMeasurer mraidOMSDKAdMeasurer = this.mraidOMSDKAdMeasurer;
            if (mraidOMSDKAdMeasurer != null) {
                mraidOMSDKAdMeasurer.destroy();
            }
            this.callback.onAdFinished();
        }
        this.callback.onAdClosed();
    }

    @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
    public void onOpenPrivacySheet(@NonNull MraidInterstitial mraidInterstitial, @NonNull final PrivacySheetParams privacySheetParams) {
        Context contextPeekContext = mraidInterstitial.peekContext();
        if (contextPeekContext == null) {
            contextPeekContext = this.applicationContext;
        }
        Utils.ifNotNull(Utils.findDialogContext(contextPeekContext), new Executable() { // from class: mf.h
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                PrivacySheetDialog.show((Context) obj, privacySheetParams);
            }
        });
    }
}
