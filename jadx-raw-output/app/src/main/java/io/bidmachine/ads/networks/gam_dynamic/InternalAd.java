package io.bidmachine.ads.networks.gam_dynamic;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.AdsFormat;
import io.bidmachine.ExpirationHandler;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.iab.vast.tags.VastTagName;
import io.bidmachine.protobuf.Waterfall;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.ProtoUtils;
import io.bidmachine.utils.Tag;
import io.bidmachine.utils.lazy.LazyValue;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public abstract class InternalAd implements InternalAdData, ExpirationHandler.Listener {

    @NonNull
    private final Waterfall.Configuration.AdUnit adUnit;

    @NonNull
    private final AdsFormat adsFormat;

    @NonNull
    private final ExpirationHandler expirationHandler;

    @NonNull
    private final InternalAdListener internalAdListener;

    @Nullable
    private InternalAdLoadData internalAdLoadData;

    @NonNull
    private final Tag tag;

    @NonNull
    private final TaskExecutor taskExecutor;

    @Nullable
    private WeakReference<InternalAdPresentListener> weakAdPresentListener;

    @Nullable
    private volatile Status status = Status.Idle;

    @NonNull
    private final Map<String, Object> customParamsMap = new ConcurrentHashMap();

    public enum Status {
        Idle,
        Loading,
        Loaded,
        Showing,
        Shown,
        Expired
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$destroy$4() {
        return String.format("destroy (%s)", GAMUtils.toString(this.adUnit));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$load$5() {
        return String.format("load (%s)", GAMUtils.toString(this.adUnit));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$onAdLoaded$1(Waterfall.Result.EstimatedPrice estimatedPrice) {
        return String.format("onAdLoaded (%s, %s)", GAMUtils.toString(this.adUnit), GAMUtils.toString(estimatedPrice));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$onAdShown$2() {
        return String.format("onAdShown (%s)", GAMUtils.toString(this.adUnit));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$onExpired$0() {
        return String.format("onExpired (%s)", GAMUtils.toString(this.adUnit));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$onPaidEvent$3(Waterfall.Result.EstimatedPrice estimatedPrice) {
        return String.format("onPaidEvent (%s, %s)", GAMUtils.toString(this.adUnit), GAMUtils.toString(estimatedPrice));
    }

    public void destroy() {
        destroy(isShown());
    }

    @UiThread
    public abstract void destroyAd() throws Throwable;

    @UiThread
    public abstract void loadAd(@NonNull Context context, @NonNull InternalLoadListener internalLoadListener) throws Throwable;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$load$6(Context context, InternalLoadListener internalLoadListener) {
        try {
            setStatus(Status.Loading);
            loadAd(context, internalLoadListener);
        } catch (Throwable th2) {
            Logger.w(th2);
            internalLoadListener.onAdLoadFailed(this, BMError.throwable("Exception loading InternalAd object", th2));
        }
    }

    @VisibleForTesting
    public void destroy(boolean z10) {
        try {
            Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: if.b0
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    return this.f54127a.lambda$destroy$4();
                }
            });
            WeakReference<InternalAdPresentListener> weakReference = this.weakAdPresentListener;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.weakAdPresentListener = null;
            if (z10) {
                release();
            }
            this.internalAdListener.onAdDestroyed(this, z10);
        } catch (Throwable th2) {
            Logger.w(th2);
        }
    }

    @Nullable
    public InternalAdPresentListener getAdPresentListener() {
        WeakReference<InternalAdPresentListener> weakReference = this.weakAdPresentListener;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @NonNull
    public Waterfall.Configuration.AdUnit getAdUnit() {
        return this.adUnit;
    }

    @NonNull
    public AdsFormat getAdsFormat() {
        return this.adsFormat;
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdData
    @NonNull
    public Map<String, Object> getCustomParamsMap() {
        return this.customParamsMap;
    }

    @Nullable
    public InternalAdLoadData getInternalAdLoadData() {
        return this.internalAdLoadData;
    }

    public boolean isExpired() {
        return this.status == Status.Expired;
    }

    public boolean isLoaded() {
        return this.status == Status.Loaded;
    }

    public boolean isShown() {
        Status status = this.status;
        return status != null && status.ordinal() >= Status.Shown.ordinal();
    }

    public final void load(@NonNull Context context, @NonNull final InternalLoadListener internalLoadListener) {
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: if.v
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return this.f54160a.lambda$load$5();
            }
        });
        final Context applicationContext = context.getApplicationContext();
        Utils.onUiThread(new Runnable() { // from class: if.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f54162b.lambda$load$6(applicationContext, internalLoadListener);
            }
        });
    }

    public void onAdLoaded(@Nullable InternalAdLoadData internalAdLoadData) {
        this.internalAdLoadData = internalAdLoadData;
        final Waterfall.Result.EstimatedPrice price = internalAdLoadData != null ? internalAdLoadData.getPrice() : null;
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: if.a0
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return this.f54125a.lambda$onAdLoaded$1(price);
            }
        });
        String strEncodeToString = ProtoUtils.encodeToString(price);
        if (strEncodeToString != null) {
            setCustomParam("gam_estimated_price", strEncodeToString);
        }
        setStatus(Status.Loaded);
        this.expirationHandler.start();
    }

    public void onAdShown() {
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: if.z
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return this.f54167a.lambda$onAdShown$2();
            }
        });
        this.internalAdListener.onAdShown(this);
        setStatus(Status.Shown);
        this.expirationHandler.stop();
    }

    public void onBackground(@NonNull Runnable runnable) {
        this.taskExecutor.execute(runnable);
    }

    public void onPaidEvent(@NonNull final Waterfall.Result.EstimatedPrice estimatedPrice) {
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: if.u
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return this.f54157a.lambda$onPaidEvent$3(estimatedPrice);
            }
        });
        String strEncodeToString = ProtoUtils.encodeToString(estimatedPrice);
        if (strEncodeToString != null) {
            setCustomParam("gam_estimated_price", strEncodeToString);
        }
        this.internalAdListener.onPaidEvent(this);
    }

    @VisibleForTesting
    public void release() {
        this.expirationHandler.stop();
        Utils.onUiThread(new Runnable() { // from class: if.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f54165b.lambda$release$7();
            }
        });
    }

    public void setAdPresentListener(@Nullable InternalAdPresentListener internalAdPresentListener) {
        this.weakAdPresentListener = new WeakReference<>(internalAdPresentListener);
    }

    public void setCustomParam(@NonNull String str, @NonNull Object obj) {
        this.customParamsMap.put(str, obj);
    }

    public void setStatus(@NonNull Status status) {
        this.status = status;
    }

    @NonNull
    public String toString() {
        return this.tag + ", " + GAMUtils.toString(this.adUnit);
    }

    public InternalAd(@NonNull NetworkParams networkParams, @NonNull TaskExecutor taskExecutor, @NonNull AdsFormat adsFormat, @NonNull Waterfall.Configuration.AdUnit adUnit, @NonNull InternalAdListener internalAdListener) {
        this.tag = new Tag(networkParams.getNetworkName() + VastTagName.AD);
        this.taskExecutor = taskExecutor;
        this.adsFormat = adsFormat;
        this.adUnit = adUnit;
        this.internalAdListener = internalAdListener;
        this.expirationHandler = new ExpirationHandler(adUnit.getExpirationTime(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$7() {
        try {
            destroyAd();
        } catch (Throwable th2) {
            Logger.w(th2);
        }
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdData
    @NonNull
    public String getAdUnitId() {
        return getAdUnit().getAdUnitId();
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdData
    public double getPrice() {
        return getAdUnit().getPrice();
    }

    @Override // io.bidmachine.ExpirationHandler.Listener
    public void onExpired() {
        if (isShown()) {
            return;
        }
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: if.y
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return this.f54166a.lambda$onExpired$0();
            }
        });
        this.internalAdListener.onAdExpired(this);
        setStatus(Status.Expired);
        InternalAdPresentListener adPresentListener = getAdPresentListener();
        if (adPresentListener != null) {
            adPresentListener.onAdExpired();
        }
        destroy(true);
    }
}
