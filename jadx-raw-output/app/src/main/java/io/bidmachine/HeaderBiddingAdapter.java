package io.bidmachine;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import io.bidmachine.unified.UnifiedAdRequestParams;
import io.bidmachine.utils.BMError;

/* JADX INFO: loaded from: classes11.dex */
public abstract class HeaderBiddingAdapter extends NetworkAdapter {
    @WorkerThread
    public abstract void onCollectHeaderBiddingParams(@NonNull ContextProvider contextProvider, @NonNull UnifiedAdRequestParams unifiedAdRequestParams, @NonNull NetworkAdUnit networkAdUnit, @NonNull HeaderBiddingAdRequestParams headerBiddingAdRequestParams, @NonNull HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) throws Throwable;

    public HeaderBiddingAdapter(@NonNull String str, @NonNull String str2, @NonNull String str3, int i10, @NonNull AdsType[] adsTypeArr) {
        super(str, str2, str3, i10, adsTypeArr);
    }

    @WorkerThread
    public final void collectHeaderBiddingParams(@NonNull ContextProvider contextProvider, @NonNull UnifiedAdRequestParams unifiedAdRequestParams, @NonNull NetworkAdUnit networkAdUnit, @NonNull HeaderBiddingAdRequestParams headerBiddingAdRequestParams, @NonNull HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) throws Throwable {
        int adapterMinDeviceApiVersion = getAdapterMinDeviceApiVersion();
        if (Build.VERSION.SDK_INT < adapterMinDeviceApiVersion) {
            headerBiddingCollectParamsCallback.onCollectFail(BMError.adapter("minSdkVersion is " + adapterMinDeviceApiVersion));
            return;
        }
        if (!isInitialized(contextProvider)) {
            headerBiddingCollectParamsCallback.onCollectFail(BMError.adapterNotInitialized());
        } else {
            onCollectHeaderBiddingParams(contextProvider, unifiedAdRequestParams, networkAdUnit, headerBiddingAdRequestParams, headerBiddingCollectParamsCallback);
        }
    }
}
