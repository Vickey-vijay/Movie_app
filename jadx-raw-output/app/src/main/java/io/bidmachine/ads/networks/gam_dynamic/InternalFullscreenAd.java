package io.bidmachine.ads.networks.gam_dynamic;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import io.bidmachine.AdsFormat;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.protobuf.Waterfall;
import io.bidmachine.utils.BMError;

/* JADX INFO: loaded from: classes11.dex */
public abstract class InternalFullscreenAd extends InternalAd {
    @UiThread
    public abstract void showAd(@NonNull Activity activity, @NonNull InternalFullscreenAdPresentListener internalFullscreenAdPresentListener) throws Throwable;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$0(Activity activity, InternalFullscreenAdPresentListener internalFullscreenAdPresentListener) {
        try {
            setStatus(InternalAd.Status.Showing);
            showAd(activity, internalFullscreenAdPresentListener);
        } catch (Throwable th2) {
            Logger.w(th2);
            internalFullscreenAdPresentListener.onAdShowFailed(BMError.throwable("Exception showing InternalAd object", th2));
        }
    }

    public final void show(@NonNull final Activity activity, @NonNull final InternalFullscreenAdPresentListener internalFullscreenAdPresentListener) {
        Utils.onUiThread(new Runnable() { // from class: if.e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f54136b.lambda$show$0(activity, internalFullscreenAdPresentListener);
            }
        });
    }

    public InternalFullscreenAd(@NonNull NetworkParams networkParams, @NonNull TaskExecutor taskExecutor, @NonNull AdsFormat adsFormat, @NonNull Waterfall.Configuration.AdUnit adUnit, @NonNull InternalAdListener internalAdListener) {
        super(networkParams, taskExecutor, adsFormat, adUnit, internalAdListener);
    }
}
