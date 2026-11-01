package io.bidmachine.ads.networks.gam_dynamic;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.UInt32Value;
import io.bidmachine.AdsFormat;
import io.bidmachine.TrackEventType;
import io.bidmachine.ads.networks.gam_dynamic.versions.VersionWrapper;
import io.bidmachine.core.Logger;
import io.bidmachine.protobuf.Waterfall;
import io.bidmachine.tracking.EventData;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.Tag;
import io.bidmachine.utils.lazy.LazyValue;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import p001if.g;
import p001if.j;
import p001if.o;

/* JADX INFO: loaded from: classes9.dex */
public class WaterfallLoader implements Runnable {

    @NonNull
    @VisibleForTesting
    public final Queue<Waterfall.Configuration.AdUnit> adUnitQueue;

    @NonNull
    private final AdsFormat adsFormat;

    @NonNull
    private final Context applicationContext;

    @VisibleForTesting
    public final int cacheSize;

    @NonNull
    private final g gamAdManager;

    @NonNull
    private final j gamEventTracker;

    @NonNull
    private final o gamNetwork;

    @NonNull
    private final Listener listener;

    @NonNull
    private final NetworkParams networkParams;

    @NonNull
    private final Tag tag;

    @NonNull
    private final TaskExecutor taskExecutor;

    @NonNull
    private final VersionWrapper versionWrapper;

    @Nullable
    private final String waterfallId;

    @NonNull
    @VisibleForTesting
    public final Queue<Waterfall.Result.AdUnit> adUnitResultQueue = new ConcurrentLinkedQueue();

    @NonNull
    @VisibleForTesting
    public final AtomicBoolean isLoading = new AtomicBoolean(false);

    public interface Listener {
        void onAdLoaded();

        void onWaterfallLoadCompleted(@NonNull Queue<Waterfall.Result.AdUnit> queue);
    }

    @VisibleForTesting
    public class a implements InternalAdListener {
        public a() {
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdListener
        public void onAdDestroyed(@NonNull InternalAd internalAd, boolean z10) {
            if (z10) {
                WaterfallLoader.this.removeAdFromCaches(internalAd);
            } else {
                WaterfallLoader.this.gamAdManager.unReserveAd(internalAd);
            }
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdListener
        public void onAdExpired(@NonNull InternalAd internalAd) {
            WaterfallLoader.this.trackEvent(TrackEventType.AdUnitExpired, internalAd);
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdListener
        public void onAdShown(@NonNull InternalAd internalAd) {
            WaterfallLoader.this.removeAdFromCaches(internalAd);
            WaterfallLoader.this.trackEvent(TrackEventType.AdUnitShown, internalAd);
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdListener
        public void onPaidEvent(@NonNull InternalAd internalAd) {
            WaterfallLoader.this.trackEvent(TrackEventType.AdUnitPaidEvent, internalAd);
        }
    }

    @VisibleForTesting
    public class b implements InternalLoadListener {
        public b() {
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.InternalLoadListener
        public void onAdLoaded(@NonNull InternalAd internalAd, @Nullable InternalAdLoadData internalAdLoadData) {
            WaterfallLoader.this.trackEvent(TrackEventType.AdUnitLoadFinish, internalAd);
            WaterfallLoader.this.trackEvent(TrackEventType.AdUnitWin, internalAd);
            WaterfallLoader.this.addAdUnitResult(internalAd.getAdUnit(), Waterfall.Result.AdUnit.Status.STATUS_SUCCESS, internalAdLoadData, null);
            InternalAd internalAdStoreOrSwapCheapestIdleAd = WaterfallLoader.this.gamAdManager.storeOrSwapCheapestIdleAd(internalAd, WaterfallLoader.this.cacheSize);
            if (internalAdStoreOrSwapCheapestIdleAd != null) {
                WaterfallLoader.this.trackEvent(TrackEventType.AdUnitCheapestDequeued, internalAdStoreOrSwapCheapestIdleAd);
                internalAdStoreOrSwapCheapestIdleAd.destroy();
            }
            WaterfallLoader.this.listener.onAdLoaded();
            WaterfallLoader.this.loadNextAdUnit(null);
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.InternalLoadListener
        public void onAdLoadFailed(@NonNull InternalAd internalAd, @NonNull BMError bMError) {
            Waterfall.Configuration.AdUnit adUnit = internalAd.getAdUnit();
            WaterfallLoader.this.trackEvent(TrackEventType.AdUnitLoadFinish, adUnit, internalAd, bMError);
            WaterfallLoader.this.trackEvent(TrackEventType.AdUnitLoss, internalAd);
            WaterfallLoader.this.addAdUnitResult(adUnit, Waterfall.Result.AdUnit.Status.STATUS_ERROR, null, bMError);
            internalAd.destroy();
            WaterfallLoader waterfallLoader = WaterfallLoader.this;
            waterfallLoader.loadNextAdUnit(Long.valueOf(waterfallLoader.getSleepTimeAfterMs(adUnit)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$load$0() {
        return String.format("(%s) Polling started (waterfallId - %s, ad unit count - %s)", this.adsFormat, this.waterfallId, Integer.valueOf(this.adUnitQueue.size()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$loadNextAdUnit$1(long j10) {
        return String.format("(%s) Execution ad unit load started after %s ms", this.adsFormat, Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$loadNextAdUnit$2() {
        return String.format("(%s) Stop polling. Waterfall already filled with expensive ads", this.adsFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$loadNextAdUnit$3() {
        return String.format("(%s) Can't create InternalAd", this.adsFormat);
    }

    @VisibleForTesting
    public void trackEvent(@NonNull TrackEventType trackEventType) {
        trackEvent(trackEventType, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadNextAdUnit$4(Waterfall.Configuration.AdUnit adUnit) {
        InternalAd internalAdFindCheapestIdleAd = this.gamAdManager.findCheapestIdleAd(this.adsFormat);
        if (internalAdFindCheapestIdleAd != null && adUnit.getPrice() <= internalAdFindCheapestIdleAd.getAdUnit().getPrice() && this.gamAdManager.getLoadedAdCount(this.adsFormat) >= this.cacheSize) {
            Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: if.t0
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    return this.f54156a.lambda$loadNextAdUnit$2();
                }
            });
            addAdUnitResult(adUnit, Waterfall.Result.AdUnit.Status.STATUS_SKIPPED, null, null);
            Iterator<Waterfall.Configuration.AdUnit> it = this.adUnitQueue.iterator();
            while (it.hasNext()) {
                addAdUnitResult(it.next(), Waterfall.Result.AdUnit.Status.STATUS_SKIPPED, null, null);
            }
            processLoadCompleted();
            return;
        }
        try {
            InternalAd internalAdCreateAd = this.versionWrapper.createAd(this.networkParams, this.taskExecutor, this.adsFormat, adUnit, new a());
            if (internalAdCreateAd == null) {
                Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: if.u0
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        return this.f54159a.lambda$loadNextAdUnit$3();
                    }
                });
                addAdUnitResult(adUnit, Waterfall.Result.AdUnit.Status.STATUS_SKIPPED, null, BMError.internal("Can't create InternalAd"));
                loadNextAdUnit(null);
            } else {
                if (!TextUtils.isEmpty(this.waterfallId)) {
                    internalAdCreateAd.setCustomParam("gam_waterfall_id", this.waterfallId);
                    internalAdCreateAd.setCustomParam("gam_ad_unit_id", adUnit.getAdUnitId());
                }
                internalAdCreateAd.load(this.applicationContext, new b());
                trackEvent(TrackEventType.AdUnitLoadStart, internalAdCreateAd);
            }
        } catch (Throwable th2) {
            Logger.w(th2);
            addAdUnitResult(adUnit, Waterfall.Result.AdUnit.Status.STATUS_SKIPPED, null, BMError.throwable("Exception loading InternalAd object", th2));
            loadNextAdUnit(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$processLoadCompleted$5() {
        StringBuilder sb2 = new StringBuilder(String.format("(%s) Polling completed (waterfallId - %s, ad unit count - %s)", this.adsFormat, this.waterfallId, Integer.valueOf(this.adUnitResultQueue.size())));
        Iterator<Waterfall.Result.AdUnit> it = this.adUnitResultQueue.iterator();
        while (it.hasNext()) {
            sb2.append(String.format("\n> %s", GAMUtils.toString(it.next())));
        }
        return sb2.toString();
    }

    @VisibleForTesting
    public void addAdUnitResult(@NonNull Waterfall.Configuration.AdUnit adUnit, @NonNull Waterfall.Result.AdUnit.Status status, @Nullable InternalAdLoadData internalAdLoadData, @Nullable BMError bMError) {
        this.adUnitResultQueue.add(create(adUnit, status, internalAdLoadData, bMError));
    }

    @VisibleForTesting
    public void load() {
        if (this.isLoading.compareAndSet(false, true)) {
            Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: if.v0
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    return this.f54161a.lambda$load$0();
                }
            });
            trackEvent(TrackEventType.WaterfallLoadStart);
            loadNextAdUnit(null);
        }
    }

    @VisibleForTesting
    public void loadNextAdUnit(@Nullable Long l10) {
        if (this.adUnitQueue.isEmpty()) {
            processLoadCompleted();
            return;
        }
        final Waterfall.Configuration.AdUnit adUnitPoll = this.adUnitQueue.poll();
        if (adUnitPoll == null) {
            loadNextAdUnit(l10);
            return;
        }
        final long jCalculateLoadingDelayMs = calculateLoadingDelayMs(adUnitPoll, l10);
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: if.r0
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return this.f54152a.lambda$loadNextAdUnit$1(jCalculateLoadingDelayMs);
            }
        });
        if (this.taskExecutor.execute(new Runnable() { // from class: if.s0
            @Override // java.lang.Runnable
            public final void run() {
                this.f54154b.lambda$loadNextAdUnit$4(adUnitPoll);
            }
        }, jCalculateLoadingDelayMs)) {
            return;
        }
        processLoadCompleted();
    }

    @VisibleForTesting
    public void processLoadCompleted() {
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: if.q0
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return this.f54150a.lambda$processLoadCompleted$5();
            }
        });
        trackEvent(TrackEventType.WaterfallLoadFinish);
        this.isLoading.set(false);
        this.listener.onWaterfallLoadCompleted(this.adUnitResultQueue);
    }

    @VisibleForTesting
    public void removeAdFromCaches(@NonNull InternalAd internalAd) {
        if (this.gamAdManager.removeAdFromCaches(internalAd)) {
            this.gamNetwork.cacheWaterfall(internalAd.getAdsFormat(), true);
        }
    }

    @VisibleForTesting
    public void trackEvent(@NonNull TrackEventType trackEventType, @NonNull InternalAd internalAd) {
        trackEvent(trackEventType, internalAd.getAdUnit(), internalAd, null);
    }

    public WaterfallLoader(@NonNull Context context, @NonNull NetworkParams networkParams, @NonNull AdsFormat adsFormat, @NonNull VersionWrapper versionWrapper, @NonNull o oVar, @NonNull g gVar, @NonNull j jVar, @NonNull TaskExecutor taskExecutor, @Nullable String str, @NonNull List<Waterfall.Configuration.AdUnit> list, int i10, @NonNull Listener listener) {
        this.tag = new Tag(networkParams.getNetworkName() + "WaterfallLoader");
        this.applicationContext = context.getApplicationContext();
        this.networkParams = networkParams;
        this.adsFormat = adsFormat;
        this.versionWrapper = versionWrapper;
        this.gamNetwork = oVar;
        this.gamAdManager = gVar;
        this.gamEventTracker = jVar;
        this.taskExecutor = taskExecutor;
        this.waterfallId = str;
        this.adUnitQueue = new ConcurrentLinkedQueue(list);
        this.cacheSize = i10;
        this.listener = listener;
    }

    @VisibleForTesting
    public long calculateLoadingDelayMs(@NonNull Waterfall.Configuration.AdUnit adUnit, @Nullable Long l10) {
        long sleepTimeBeforeMs = getSleepTimeBeforeMs(adUnit);
        if (l10 != null) {
            return sleepTimeBeforeMs + l10.longValue();
        }
        return sleepTimeBeforeMs;
    }

    @NonNull
    @VisibleForTesting
    public Waterfall.Result.AdUnit create(@NonNull Waterfall.Configuration.AdUnit adUnit, @NonNull Waterfall.Result.AdUnit.Status status, @Nullable InternalAdLoadData internalAdLoadData, @Nullable BMError bMError) {
        Waterfall.Result.AdUnit.Builder price = Waterfall.Result.AdUnit.newBuilder().setStatus(status).setPrice(adUnit.getPrice());
        if (adUnit.getAdUnitId() != null) {
            price.setAdUnitId(adUnit.getAdUnitId());
        }
        StringValue serverParams = adUnit.getServerParams();
        if (serverParams != null) {
            price.setServerParams(serverParams);
        }
        if (internalAdLoadData != null) {
            Waterfall.Result.EstimatedPrice price2 = internalAdLoadData.getPrice();
            if (price2 != null) {
                price.setEstimatedPrice(price2);
            }
            String adResponse = internalAdLoadData.getAdResponse();
            if (!TextUtils.isEmpty(adResponse)) {
                price.setAdResponse(StringValue.newBuilder().setValue(adResponse).build());
            }
        }
        if (bMError != null) {
            price.setError(Waterfall.Result.AdUnit.Error.newBuilder().setCode(bMError.getCode()).setDescription(bMError.getMessage()));
        }
        return price.build();
    }

    @VisibleForTesting
    public long getSleepTimeAfterMs(@NonNull Waterfall.Configuration.AdUnit adUnit) {
        UInt32Value sleepTimeAfter;
        if (adUnit.hasSleepTimeAfter()) {
            sleepTimeAfter = adUnit.getSleepTimeAfter();
        } else {
            sleepTimeAfter = null;
        }
        if (sleepTimeAfter != null) {
            return sleepTimeAfter.getValue();
        }
        return 0L;
    }

    @VisibleForTesting
    public long getSleepTimeBeforeMs(@NonNull Waterfall.Configuration.AdUnit adUnit) {
        UInt32Value sleepTimeBefore;
        if (adUnit.hasSleepTimeBefore()) {
            sleepTimeBefore = adUnit.getSleepTimeBefore();
        } else {
            sleepTimeBefore = null;
        }
        if (sleepTimeBefore != null) {
            return sleepTimeBefore.getValue();
        }
        return 0L;
    }

    @Override // java.lang.Runnable
    public void run() {
        load();
    }

    @VisibleForTesting
    public void trackEvent(@NonNull TrackEventType trackEventType, @Nullable Waterfall.Configuration.AdUnit adUnit, @Nullable InternalAd internalAd, @Nullable BMError bMError) {
        EventData networkName = new EventData().setNetworkName(this.networkParams.getNetworkKey());
        if (adUnit != null) {
            networkName.setPrice(Double.valueOf(adUnit.getPrice()));
        }
        if (internalAd != null) {
            networkName.setCustomParams(internalAd.getCustomParamsMap());
        }
        if (!TextUtils.isEmpty(this.waterfallId)) {
            networkName.setCustomParam("gam_waterfall_id", this.waterfallId);
        }
        this.gamEventTracker.trackEvent(trackEventType, this.adsFormat, networkName, bMError);
    }
}
