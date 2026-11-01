package io.bidmachine.ads.networks.gam;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import io.bidmachine.AdsFormat;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.utils.BMError;

/* JADX INFO: loaded from: classes4.dex */
public abstract class InternalGAMFullscreenAd extends InternalGAMAd {
    @UiThread
    public abstract void showAd(@NonNull Activity activity, @NonNull InternalGAMFullscreenAdPresentListener internalGAMFullscreenAdPresentListener) throws Throwable;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$0(Activity activity, InternalGAMFullscreenAdPresentListener internalGAMFullscreenAdPresentListener) {
        try {
            setStatus(InternalGAMAd.Status.Showing);
            showAd(activity, internalGAMFullscreenAdPresentListener);
        } catch (Throwable th2) {
            Logger.w(th2);
            internalGAMFullscreenAdPresentListener.onAdShowFailed(BMError.throwable("Exception showing InternalGAM object", th2));
        }
    }

    public final void show(@NonNull final Activity activity, @NonNull final InternalGAMFullscreenAdPresentListener internalGAMFullscreenAdPresentListener) {
        Utils.onUiThread(new Runnable() { // from class: ef.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f52591b.lambda$show$0(activity, internalGAMFullscreenAdPresentListener);
            }
        });
    }

    public InternalGAMFullscreenAd(@NonNull GAMLoader gAMLoader, @NonNull AdsFormat adsFormat, @NonNull GAMUnitData gAMUnitData) {
        super(gAMLoader, adsFormat, gAMUnitData);
    }
}
