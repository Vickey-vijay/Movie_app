package io.bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.openrtb.Response;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.core.VisibilitySource;
import io.bidmachine.models.AdObject;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.models.AuctionResult;
import io.bidmachine.protobuf.AdCacheControl;
import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.ProtoUtils;
import io.bidmachine.utils.Tag;
import io.bidmachine.utils.lazy.LazyValue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: AdResponse.java */
/* JADX INFO: loaded from: classes9.dex */
public class u implements ExpirationHandler.Listener {
    private static final long DEF_EXPIRATION_TIME_SEC = TimeUnit.MINUTES.toSeconds(29);

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    @NonNull
    private final Ad f60968ad;

    @Nullable
    private final AdCacheControl adCacheControl;

    @NonNull
    @VisibleForTesting
    public final d adCallbackComposite;

    @Nullable
    private volatile AdObject adObject;

    @NonNull
    private final AdRequestParameters adRequestParameters;

    @NonNull
    private final AuctionResult auctionResult;
    private final String bidId;
    private final long createTimeMs;

    @Nullable
    private final AdExtension.EventConfiguration eventConfiguration;

    @NonNull
    private final ExpirationHandler expirationHandler;
    private final long expirationTimeMs;
    public final boolean isCridMonitoringEnabled;

    @Nullable
    @VisibleForTesting
    public ExpirationHandler loadExpirationHandler;

    @NonNull
    private final NetworkAdUnitManager networkAdUnitManager;
    private final String responseId;
    private final Struct seatBidExt;

    @NonNull
    private final Tag tag;

    @NonNull
    @VisibleForTesting
    public final BidMachineTrackingObject trackingObject;

    @NonNull
    private final NetworkAdUnit winnerNetworkAdUnit;

    @VisibleForTesting
    public final Map<TrackEventType, List<String>> trackUrlsMap = new EnumMap(TrackEventType.class);

    @NonNull
    private final AtomicBoolean isExpired = new AtomicBoolean(false);

    @NonNull
    @VisibleForTesting
    public final List<WeakReference<AdRequest<?, ?, ?>>> weakAdRequestList = new CopyOnWriteArrayList();
    private volatile AdResponseStatus status = AdResponseStatus.Idle;

    /* JADX INFO: compiled from: AdResponse.java */
    public class a extends BidMachineTrackingObject {
        @Override // io.bidmachine.BidMachineTrackingObject, io.bidmachine.tracking.SessionTrackingObject, io.bidmachine.tracking.TrackingObjectImpl, io.bidmachine.tracking.TrackingObject
        public /* bridge */ /* synthetic */ void eventStart(@NonNull TrackEventType trackEventType) {
            super.eventStart(trackEventType);
        }

        public a(Object obj) {
            super(obj);
        }

        @Override // io.bidmachine.tracking.TrackingObjectImpl, io.bidmachine.tracking.TrackingObject
        @Nullable
        public AdExtension.EventConfiguration getEventConfiguration() {
            return u.this.getEventConfiguration();
        }

        @Override // io.bidmachine.tracking.TrackingObjectImpl, io.bidmachine.tracking.TrackingObject
        @Nullable
        public List<String> getTrackingUrls(@NonNull TrackEventType trackEventType) {
            return u.this.getTrackUrls(trackEventType);
        }
    }

    /* JADX INFO: compiled from: AdResponse.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                AdObject adObject = u.this.getAdObject();
                if (adObject != null) {
                    adObject.onDestroy();
                }
            } catch (Throwable th2) {
                Logger.w(th2);
            }
            u.this.adObject = null;
        }
    }

    /* JADX INFO: compiled from: AdResponse.java */
    @VisibleForTesting
    public static class d implements AdProcessCallback {

        @NonNull
        private final WeakReference<u> weakAdResponse;

        @NonNull
        private final Map<AdProcessCallback, Boolean> adProcessCallbackMap = new WeakHashMap();

        @NonNull
        private final Object mutexCallback = new Object();

        @NonNull
        @VisibleForTesting
        public final AtomicBoolean isLoaded = new AtomicBoolean(false);

        @NonNull
        @VisibleForTesting
        public final AtomicBoolean isLoading = new AtomicBoolean(false);

        @NonNull
        private final AtomicBoolean isLoadTracked = new AtomicBoolean(false);

        @NonNull
        private final AtomicBoolean isShownTracked = new AtomicBoolean(false);

        @NonNull
        private final AtomicBoolean isVisibilityTrackerStarted = new AtomicBoolean(false);

        @NonNull
        private final AtomicBoolean isVisibilityTrackerShownTracked = new AtomicBoolean(false);

        @NonNull
        private final AtomicBoolean isResultShownTracked = new AtomicBoolean(false);

        @NonNull
        private final AtomicBoolean isImpressionTracked = new AtomicBoolean(false);
        private volatile boolean isFinished = false;

        @NonNull
        private volatile VisibilitySource visibilitySource = VisibilitySource.Network;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onBrokenCreativeEvent$13(u uVar) {
            return String.format("onBrokenCreativeEvent - %s", uVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$processClicked$8(u uVar) {
            return String.format("processClicked - %s", uVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ String lambda$processClosed$10(u uVar) {
            return String.format("processClosed (%s) - %s", Boolean.valueOf(this.isFinished), uVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$processDestroy$12(u uVar) {
            return String.format("processDestroy - %s", uVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$processExpired$11(u uVar) {
            return String.format("processExpired - %s", uVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$processFillAd$3(u uVar) {
            return String.format("processFillAd - %s", uVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$processFinished$9(u uVar) {
            return String.format("processFinished - %s", uVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$processLoadFail$1(BMError bMError) {
            return String.format("processLoadFail - %s", bMError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$processLoadSuccess$0(u uVar) {
            return String.format("processLoadSuccess - %s", uVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$processResultShown$6(u uVar) {
            return String.format("processShown - %s", uVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$processShowFail$4(BMError bMError) {
            return String.format("processShowFail - %s", bMError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$processVisibilityTrackerImpression$7(u uVar) {
            return String.format("processImpression - %s", uVar);
        }

        private boolean canSendShownCallback() {
            int i10 = c.$SwitchMap$io$bidmachine$core$VisibilitySource[this.visibilitySource.ordinal()];
            if (i10 == 1) {
                return isBidMachineShowTracked();
            }
            if (i10 == 2) {
                return isNetworkShowTracked();
            }
            if (i10 != 3) {
                return false;
            }
            return isBidMachineShowTracked() && isNetworkShowTracked();
        }

        @NonNull
        private List<AdProcessCallback> getAdProcessCallbackList() {
            return new ArrayList(this.adProcessCallbackMap.keySet());
        }

        @Nullable
        private u getAdResponse() {
            return this.weakAdResponse.get();
        }

        private boolean isBidMachineShowTracked() {
            return !this.isVisibilityTrackerStarted.get() || this.isVisibilityTrackerShownTracked.get();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isLoading() {
            return this.isLoading.get();
        }

        private boolean isNetworkShowTracked() {
            return this.isShownTracked.get();
        }

        @VisibleForTesting
        public void appendCallback(@NonNull AdProcessCallback adProcessCallback) {
            synchronized (this.mutexCallback) {
                this.adProcessCallbackMap.put(adProcessCallback, Boolean.TRUE);
            }
        }

        @VisibleForTesting
        public void destroy() {
            this.weakAdResponse.clear();
            synchronized (this.mutexCallback) {
                this.adProcessCallbackMap.clear();
            }
        }

        @VisibleForTesting
        public void executeOnCallback(@NonNull Executable<AdProcessCallback> executable) {
            synchronized (this.mutexCallback) {
                for (AdProcessCallback adProcessCallback : getAdProcessCallbackList()) {
                    if (adProcessCallback != null) {
                        executable.execute(adProcessCallback);
                    }
                }
            }
        }

        @NonNull
        @VisibleForTesting
        public Map<AdProcessCallback, Boolean> getAdProcessCallbackMap() {
            return this.adProcessCallbackMap;
        }

        @Override // io.bidmachine.AdProcessCallback
        public void processDestroy() {
            executeOnCallback(new Executable() { // from class: io.bidmachine.q0
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    ((AdProcessCallback) obj).processDestroy();
                }
            });
            final u adResponse = getAdResponse();
            if (adResponse != null) {
                Logger.d(adResponse.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.r0
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        return u.d.lambda$processDestroy$12(adResponse);
                    }
                });
                adResponse.destroy();
            }
        }

        @Override // io.bidmachine.AdProcessCallback
        public void processLoadFail(@NonNull final BMError bMError) {
            if (this.isLoadTracked.getAndSet(true)) {
                return;
            }
            this.isLoaded.set(false);
            this.isLoading.set(false);
            u adResponse = getAdResponse();
            if (adResponse != null) {
                Logger.d(adResponse.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.v
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        return u.d.lambda$processLoadFail$1(bMError);
                    }
                });
                adResponse.clearCreativeLoadingTimeout();
                adResponse.eventFinish(TrackEventType.Load, bMError);
            }
            executeOnCallback(new Executable() { // from class: io.bidmachine.g0
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    ((AdProcessCallback) obj).processLoadFail(bMError);
                }
            });
            processDestroy();
        }

        @Override // io.bidmachine.AdProcessCallback
        public void processLoadSuccess() {
            if (this.isLoadTracked.getAndSet(true)) {
                return;
            }
            this.isLoaded.set(true);
            this.isLoading.set(false);
            final u adResponse = getAdResponse();
            if (adResponse != null) {
                Logger.d(adResponse.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.y
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        return u.d.lambda$processLoadSuccess$0(adResponse);
                    }
                });
                adResponse.clearCreativeLoadingTimeout();
                adResponse.eventFinish(TrackEventType.Load);
            }
            UserAgentManager.updateWebViewUserAgent();
            executeOnCallback(new Executable() { // from class: io.bidmachine.z
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    ((AdProcessCallback) obj).processLoadSuccess();
                }
            });
        }

        @VisibleForTesting
        public void processResultShown() {
            if (this.isResultShownTracked.compareAndSet(false, true)) {
                final u adResponse = getAdResponse();
                if (adResponse != null) {
                    Logger.d(adResponse.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.k0
                        @Override // io.bidmachine.utils.lazy.LazyValue
                        public final Object get() {
                            return u.d.lambda$processResultShown$6(adResponse);
                        }
                    });
                    adResponse.onShown();
                    AdObject adObject = adResponse.getAdObject();
                    if (adObject != null) {
                        adObject.onShown();
                    }
                    adResponse.eventFinish(TrackEventType.Show);
                }
                executeOnCallback(new Executable() { // from class: io.bidmachine.l0
                    @Override // io.bidmachine.Executable
                    public final void execute(Object obj) {
                        ((AdProcessCallback) obj).processShown();
                    }
                });
            }
        }

        @Override // io.bidmachine.AdProcessCallback
        public void processShown() {
            this.isShownTracked.set(true);
            if (canSendShownCallback()) {
                processResultShown();
            }
        }

        @Override // io.bidmachine.AdProcessCallback
        public void processStartVisibilityTracker() {
            this.isVisibilityTrackerStarted.set(true);
        }

        @Override // io.bidmachine.AdProcessCallback
        public void processVisibilityTrackerImpression() {
            if (this.isImpressionTracked.getAndSet(true)) {
                return;
            }
            final u adResponse = getAdResponse();
            if (adResponse != null) {
                Logger.d(adResponse.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.i0
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        return u.d.lambda$processVisibilityTrackerImpression$7(adResponse);
                    }
                });
                AdObject adObject = adResponse.getAdObject();
                if (adObject != null) {
                    adObject.onImpression();
                }
                adResponse.eventFinish(TrackEventType.Impression);
            }
            executeOnCallback(new Executable() { // from class: io.bidmachine.j0
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    ((AdProcessCallback) obj).processVisibilityTrackerImpression();
                }
            });
        }

        @Override // io.bidmachine.AdProcessCallback
        public boolean processVisibilityTrackerShown() {
            this.isVisibilityTrackerShownTracked.set(true);
            if (!canSendShownCallback()) {
                return false;
            }
            processResultShown();
            return true;
        }

        @VisibleForTesting
        public void removeCallback(@NonNull AdProcessCallback adProcessCallback) {
            synchronized (this.mutexCallback) {
                this.adProcessCallbackMap.remove(adProcessCallback);
            }
        }

        @Override // io.bidmachine.AdProcessCallback
        public void setVisibilitySource(@NonNull VisibilitySource visibilitySource) {
            this.visibilitySource = visibilitySource;
        }

        public d(@NonNull u uVar) {
            this.weakAdResponse = new WeakReference<>(uVar);
        }

        @Override // io.bidmachine.AdProcessCallback
        public void onBrokenCreativeEvent(@Nullable Map<String, Object> map) {
            final u adResponse = getAdResponse();
            if (adResponse != null) {
                Logger.d(adResponse.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.h0
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        return u.d.lambda$onBrokenCreativeEvent$13(adResponse);
                    }
                });
                adResponse.eventFinish(TrackEventType.BrokenCreativeDetector, map);
            }
        }

        @Override // io.bidmachine.AdProcessCallback
        public void processClicked() {
            final u adResponse = getAdResponse();
            if (adResponse != null) {
                Logger.d(adResponse.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.c0
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        return u.d.lambda$processClicked$8(adResponse);
                    }
                });
                AdObject adObject = adResponse.getAdObject();
                if (adObject != null) {
                    adObject.onClicked();
                }
                adResponse.eventFinish(TrackEventType.Click);
            }
            executeOnCallback(new Executable() { // from class: io.bidmachine.d0
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    ((AdProcessCallback) obj).processClicked();
                }
            });
        }

        @Override // io.bidmachine.AdProcessCallback
        public void processClosed() {
            final u adResponse = getAdResponse();
            if (adResponse != null) {
                Logger.d(adResponse.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.o0
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        return this.f59961a.lambda$processClosed$10(adResponse);
                    }
                });
                AdObject adObject = adResponse.getAdObject();
                if (adObject != null) {
                    adObject.onClosed(this.isFinished);
                }
                adResponse.eventFinish(TrackEventType.Close);
            }
            executeOnCallback(new Executable() { // from class: io.bidmachine.p0
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    ((AdProcessCallback) obj).processClosed();
                }
            });
        }

        @Override // io.bidmachine.AdProcessCallback
        public void processExpired() {
            final u adResponse = getAdResponse();
            if (adResponse != null) {
                Logger.d(adResponse.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.w
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        return u.d.lambda$processExpired$11(adResponse);
                    }
                });
                AdObject adObject = adResponse.getAdObject();
                if (adObject != null) {
                    adObject.onExpired();
                    adResponse.eventFinish(TrackEventType.Expired);
                }
            }
            executeOnCallback(new Executable() { // from class: io.bidmachine.x
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    ((AdProcessCallback) obj).processExpired();
                }
            });
            if (adResponse != null) {
                adResponse.notifyExpired(false);
            }
            processDestroy();
        }

        @Override // io.bidmachine.AdProcessCallback
        public void processFillAd() {
            final u adResponse = getAdResponse();
            if (adResponse != null) {
                Logger.d(adResponse.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.a0
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        return u.d.lambda$processFillAd$3(adResponse);
                    }
                });
                if (adResponse.getAdsType().isFullscreen()) {
                    adResponse.onShown();
                }
                adResponse.eventFinish(TrackEventType.FillAd);
            }
            executeOnCallback(new Executable() { // from class: io.bidmachine.b0
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    ((AdProcessCallback) obj).processFillAd();
                }
            });
        }

        @Override // io.bidmachine.AdProcessCallback
        public void processFinished() {
            final u adResponse = getAdResponse();
            if (adResponse != null) {
                Logger.d(adResponse.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.m0
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        return u.d.lambda$processFinished$9(adResponse);
                    }
                });
                AdObject adObject = adResponse.getAdObject();
                if (adObject != null) {
                    adObject.onFinished();
                }
                this.isFinished = true;
            }
            executeOnCallback(new Executable() { // from class: io.bidmachine.n0
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    ((AdProcessCallback) obj).processFinished();
                }
            });
        }

        @Override // io.bidmachine.AdProcessCallback
        public void processShowFail(@NonNull final BMError bMError) {
            u adResponse = getAdResponse();
            if (adResponse != null) {
                Logger.d(adResponse.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.e0
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        return u.d.lambda$processShowFail$4(bMError);
                    }
                });
                AdObject adObject = adResponse.getAdObject();
                if (adObject != null) {
                    adObject.onShowFailed();
                }
                adResponse.eventFinish(TrackEventType.Show, bMError);
            }
            executeOnCallback(new Executable() { // from class: io.bidmachine.f0
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    ((AdProcessCallback) obj).processShowFail(bMError);
                }
            });
        }
    }

    /* JADX INFO: compiled from: AdResponse.java */
    @VisibleForTesting
    public static class e implements ExpirationHandler.Listener {

        @NonNull
        private final AdProcessCallback adProcessCallback;

        @Override // io.bidmachine.ExpirationHandler.Listener
        public void onExpired() {
            this.adProcessCallback.processLoadFail(new BMError(BMError.TimeoutError, -1, "Creative loading timeout reached"));
        }

        public e(@NonNull AdProcessCallback adProcessCallback) {
            this.adProcessCallback = adProcessCallback;
        }
    }

    public u(@NonNull AdRequestParameters adRequestParameters, @NonNull NetworkAdUnitManager networkAdUnitManager, @NonNull Response response, @NonNull Response.Seatbid seatbid, @NonNull Response.Seatbid.Bid bid, @NonNull Ad ad2, @NonNull NetworkAdapter networkAdapter) {
        boolean z10 = false;
        d dVar = new d(this);
        this.adCallbackComposite = dVar;
        this.tag = new Tag("AdResponse");
        this.createTimeMs = System.currentTimeMillis();
        this.adRequestParameters = adRequestParameters;
        this.networkAdUnitManager = networkAdUnitManager;
        this.responseId = response.getId();
        this.seatBidExt = seatbid.getExt();
        this.bidId = bid.getId();
        this.f60968ad = ad2;
        AdExtension adExtensionFindFirstAdExtension = ProtoUtils.findFirstAdExtension(ad2);
        c1 c1Var = new c1(adRequestParameters.getAdsType(), seatbid, bid, ad2, networkAdapter, adExtensionFindFirstAdExtension);
        this.auctionResult = c1Var;
        this.eventConfiguration = findEventConfiguration(adExtensionFindFirstAdExtension);
        this.adCacheControl = findAdCacheControl(adExtensionFindFirstAdExtension);
        long orDefault = Utils.getOrDefault(bid.getExp(), Response.Seatbid.Bid.getDefaultInstance().getExp(), DEF_EXPIRATION_TIME_SEC) * 1000;
        this.expirationTimeMs = orDefault;
        this.trackingObject = new a(c1Var.getId());
        this.winnerNetworkAdUnit = networkAdUnitManager.findOrAddWinnerNetworkAdUnit(networkAdapter, adRequestParameters.getAdsFormat(), c1Var.getNetworkParams());
        this.expirationHandler = new ExpirationHandler(orDefault, this);
        int creativeLoadingTimeout = adExtensionFindFirstAdExtension != null ? adExtensionFindFirstAdExtension.getCreativeLoadingTimeout() : 0;
        this.loadExpirationHandler = creativeLoadingTimeout > 0 ? new ExpirationHandler(creativeLoadingTimeout, new e(dVar)) : null;
        if (adExtensionFindFirstAdExtension != null && adExtensionFindFirstAdExtension.getCridMonitoringEnabled()) {
            z10 = true;
        }
        this.isCridMonitoringEnabled = z10;
        extractTrackUrls(bid);
        subscribeExpireTracker();
    }

    @Nullable
    private AdCacheControl findAdCacheControl(@Nullable AdExtension adExtension) {
        AdCacheControl adCacheControl;
        if (adExtension == null || (adCacheControl = adExtension.getAdCacheControl()) == AdCacheControl.UNRECOGNIZED) {
            return null;
        }
        return adCacheControl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$attachAdRequest$0() {
        return String.format("attachRequest - %s", this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$destroy$3() {
        return String.format("destroy - %s", this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$detachAdRequest$1() {
        return String.format("detachRequest - %s", this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$notifyExpired$4() {
        return String.format("notifyExpired - %s", this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$onAdLoadStart$2() {
        return String.format("onLoadStart - %s", this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$release$5() {
        return String.format("release - %s", this);
    }

    @VisibleForTesting
    public void eventFinish(@NonNull TrackEventType trackEventType) {
        eventFinish(trackEventType, null, null);
    }

    @Nullable
    @VisibleForTesting
    public AdExtension.EventConfiguration findEventConfiguration(@Nullable AdExtension adExtension) {
        AdExtension.EventConfiguration eventConfiguration;
        if (adExtension == null || (eventConfiguration = adExtension.getEventConfiguration()) == AdExtension.EventConfiguration.getDefaultInstance()) {
            return null;
        }
        return eventConfiguration;
    }

    public synchronized AdResponseStatus getStatus() {
        return this.status;
    }

    public synchronized void loadAdObject(@NonNull ContextProvider contextProvider, @NonNull AdRequest adRequest, @NonNull BidMachineAd bidMachineAd, @NonNull AdProcessCallback adProcessCallback) {
        onAdLoadStart(adRequest);
        this.adCallbackComposite.appendCallback(adProcessCallback);
        if (isAdLoaded()) {
            adProcessCallback.processLoadSuccess();
            return;
        }
        if (this.adCallbackComposite.isLoading.getAndSet(true)) {
            return;
        }
        this.trackingObject.eventStart(TrackEventType.Load);
        if (isExpired()) {
            this.adCallbackComposite.processLoadFail(BMError.ResponseExpired);
            return;
        }
        if (wasShown()) {
            this.adCallbackComposite.processLoadFail(BMError.ResponseDuplicated);
            return;
        }
        try {
            NetworkAdapter networkAdapterFindNetworkAdapter = adRequest.getAdsType().findNetworkAdapter(this.f60968ad);
            if (networkAdapterFindNetworkAdapter == null) {
                this.adCallbackComposite.processLoadFail(BMError.incorrectContent("Failed to get adapter by response"));
                return;
            }
            AdObjectParams adObjectParamsCreateAdObjectParams = adRequest.getAdsType().createAdObjectParams(this.f60968ad);
            if (adObjectParamsCreateAdObjectParams != null && adObjectParamsCreateAdObjectParams.isValid()) {
                AdObject adObjectCreateAdObject = bidMachineAd.createAdObject(contextProvider, adRequest, networkAdapterFindNetworkAdapter, adObjectParamsCreateAdObjectParams, this.adCallbackComposite);
                if (adObjectCreateAdObject == null) {
                    this.adCallbackComposite.processLoadFail(BMError.incorrectContent("Failed to create ad object by response"));
                    return;
                }
                this.adObject = adObjectCreateAdObject;
                startCreativeLoadingTimeout();
                adObjectCreateAdObject.load(contextProvider, adRequest.obtainUnifiedRequestParams(), this.winnerNetworkAdUnit);
                return;
            }
            this.adCallbackComposite.processLoadFail(BMError.incorrectContent("Failed to get parameters by response"));
        } catch (Throwable th2) {
            Logger.w(th2);
            this.adCallbackComposite.processLoadFail(BMError.throwable("Exception processing response", th2));
        }
    }

    public synchronized void setStatus(@NonNull AdResponseStatus adResponseStatus) {
        this.status = adResponseStatus;
    }

    /* JADX INFO: compiled from: AdResponse.java */
    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] $SwitchMap$io$bidmachine$core$VisibilitySource;

        static {
            int[] iArr = new int[VisibilitySource.values().length];
            $SwitchMap$io$bidmachine$core$VisibilitySource = iArr;
            try {
                iArr[VisibilitySource.BidMachine.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$bidmachine$core$VisibilitySource[VisibilitySource.Network.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$bidmachine$core$VisibilitySource[VisibilitySource.All.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void extractTrackUrls(@NonNull Response.Seatbid.Bid bid) {
        ProtoUtils.addEvent(this.trackUrlsMap, TrackEventType.MediationWin, bid.getPurl());
        ProtoUtils.addEvent(this.trackUrlsMap, TrackEventType.MediationLoss, bid.getLurl());
    }

    private void subscribeExpireTracker() {
        this.expirationHandler.start();
    }

    public void attachAdRequest(@Nullable AdRequest<?, ?, ?> adRequest) {
        if (adRequest == null) {
            return;
        }
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.n
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return this.f59946a.lambda$attachAdRequest$0();
            }
        });
        this.weakAdRequestList.add(new WeakReference<>(adRequest));
    }

    public long calculateExpirationLeftMs() {
        return this.expirationTimeMs - (System.currentTimeMillis() - this.createTimeMs);
    }

    public boolean canCache() {
        return this.adCacheControl == AdCacheControl.AD_CACHE_CONTROL_ENABLED;
    }

    public void clearAdRequestList() {
        Iterator<WeakReference<AdRequest<?, ?, ?>>> it = this.weakAdRequestList.iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.weakAdRequestList.clear();
    }

    @VisibleForTesting
    public void clearCreativeLoadingTimeout() {
        ExpirationHandler expirationHandler = this.loadExpirationHandler;
        if (expirationHandler != null) {
            expirationHandler.stop();
        }
        this.loadExpirationHandler = null;
    }

    @VisibleForTesting
    public void destroy() {
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.m
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return this.f59760a.lambda$destroy$3();
            }
        });
        w0.get().remove(this);
        clearCreativeLoadingTimeout();
        clearAdRequestList();
        unsubscribeExpireTracker();
        this.adCallbackComposite.destroy();
        this.trackUrlsMap.clear();
        this.networkAdUnitManager.notifyNetworkClearAuction();
        if (this.adCallbackComposite.isLoading()) {
            eventFinish(TrackEventType.Load, BMError.Destroyed);
        }
        if (this.adObject != null) {
            eventFinish(TrackEventType.Destroy);
        }
        this.trackingObject.clear();
        Utils.onUiThread(new b());
    }

    public void detachAdRequest(@Nullable AdRequest<?, ?, ?> adRequest) {
        if (adRequest == null) {
            return;
        }
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.s
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return this.f60955a.lambda$detachAdRequest$1();
            }
        });
        ArrayList arrayList = new ArrayList();
        for (WeakReference<AdRequest<?, ?, ?>> weakReference : this.weakAdRequestList) {
            AdRequest<?, ?, ?> adRequest2 = weakReference.get();
            if (adRequest2 == null || adRequest2 == adRequest) {
                arrayList.add(weakReference);
            }
        }
        this.weakAdRequestList.removeAll(arrayList);
        if (this.weakAdRequestList.isEmpty()) {
            release();
        }
    }

    @VisibleForTesting
    public void eventFinish(@NonNull TrackEventType trackEventType, @Nullable Map<String, Object> map) {
        eventFinish(trackEventType, null, map);
    }

    public void expireAdRequests(@Nullable AdRequest<?, ?, ?> adRequest) {
        Iterator<WeakReference<AdRequest<?, ?, ?>>> it = this.weakAdRequestList.iterator();
        while (it.hasNext()) {
            AdRequest<?, ?, ?> adRequest2 = it.next().get();
            if (adRequest2 != null && adRequest2 != adRequest) {
                adRequest2.processExpired();
            }
        }
    }

    @NonNull
    public Ad getAd() {
        return this.f60968ad;
    }

    @Nullable
    public AdObject getAdObject() {
        return this.adObject;
    }

    @NonNull
    public AdRequestParameters getAdRequestParameters() {
        return this.adRequestParameters;
    }

    @NonNull
    public AdsType getAdsType() {
        return this.adRequestParameters.getAdsType();
    }

    @NonNull
    public AuctionResult getAuctionResult() {
        return this.auctionResult;
    }

    @Nullable
    public CreativeFormat getCreativeFormat() {
        return this.auctionResult.getCreativeFormat();
    }

    @Nullable
    public AdExtension.EventConfiguration getEventConfiguration() {
        return this.eventConfiguration;
    }

    public double getPrice() {
        return this.auctionResult.getPrice();
    }

    @Nullable
    public List<String> getTrackUrlListByEvent(@NonNull TrackEventType trackEventType) {
        return this.trackUrlsMap.get(trackEventType);
    }

    @NonNull
    public NetworkAdUnit getWinnerNetworkAdUnit() {
        return this.winnerNetworkAdUnit;
    }

    public boolean isExpired() {
        return this.isExpired.get();
    }

    public void notifyExpired(boolean z10) {
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.t
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return this.f60962a.lambda$notifyExpired$4();
            }
        });
        this.isExpired.set(true);
        unsubscribeExpireTracker();
        expireAdRequests(null);
        if (z10) {
            destroy();
        }
    }

    public void onAdLoadStart(@Nullable AdRequest<?, ?, ?> adRequest) {
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.o
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return this.f59960a.lambda$onAdLoadStart$2();
            }
        });
        expireAdRequests(adRequest);
    }

    @Override // io.bidmachine.ExpirationHandler.Listener
    public void onExpired() {
        this.adCallbackComposite.processExpired();
    }

    public void release() {
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.p
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return this.f59966a.lambda$release$5();
            }
        });
        w0 w0Var = w0.get();
        if (!canBeUsedInFuture() || !w0Var.contains(this)) {
            destroy();
            return;
        }
        clearAdRequestList();
        setStatus(AdResponseStatus.Idle);
        Utils.onUiThread(new Runnable() { // from class: io.bidmachine.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f59970b.lambda$release$6();
            }
        });
    }

    public void removeCallback(@NonNull AdProcessCallback adProcessCallback) {
        this.adCallbackComposite.removeCallback(adProcessCallback);
    }

    @VisibleForTesting
    public void startCreativeLoadingTimeout() {
        ExpirationHandler expirationHandler = this.loadExpirationHandler;
        if (expirationHandler != null) {
            expirationHandler.start();
        }
    }

    @NonNull
    public String toString() {
        return this.auctionResult.toString();
    }

    @VisibleForTesting
    public void unsubscribeExpireTracker() {
        this.expirationHandler.stop();
    }

    public boolean wasShown() {
        return this.adCallbackComposite.isResultShownTracked.get();
    }

    private boolean canBeUsedInFuture() {
        if (!wasShown() && !isExpired()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$6() {
        try {
            AdObject adObject = getAdObject();
            if (adObject != null) {
                adObject.hide();
            }
        } catch (Throwable th2) {
            Logger.w(th2);
        }
    }

    @NonNull
    public Value createBidCacheExtensionValue() {
        Struct.Builder builderPutFields = Struct.newBuilder().putFields("price", Value.newBuilder().setNumberValue(this.auctionResult.getPrice()).build()).putFields(ImpressionLog.f43649y, Value.newBuilder().setNumberValue(calculateExpirationLeftMs()).build()).putFields(CommonUrlParts.REQUEST_ID, Value.newBuilder().setStringValue(this.responseId).build()).putFields("bid_id", Value.newBuilder().setStringValue(this.bidId).build());
        if (this.seatBidExt.getFieldsCount() > 0) {
            builderPutFields.putFields("seat", Value.newBuilder().setStructValue(this.seatBidExt).build());
        }
        return Value.newBuilder().setStructValue(builderPutFields).build();
    }

    @VisibleForTesting
    public void eventFinish(@NonNull TrackEventType trackEventType, @Nullable BMError bMError) {
        eventFinish(trackEventType, bMError, null);
    }

    @Nullable
    public List<String> getTrackUrls(@NonNull TrackEventType trackEventType) {
        AdObjectParams params;
        AdObject adObject = getAdObject();
        if (adObject != null) {
            params = adObject.getParams();
        } else {
            params = null;
        }
        if (params == null) {
            return null;
        }
        return params.getTrackUrls(trackEventType);
    }

    public boolean isAdLoaded() {
        if (getAdObject() != null && this.adCallbackComposite.isLoaded.get()) {
            return true;
        }
        return false;
    }

    public void onShown() {
        unsubscribeExpireTracker();
        w0.get().remove(this);
    }

    @VisibleForTesting
    public void eventFinish(@NonNull TrackEventType trackEventType, @Nullable BMError bMError, @Nullable Map<String, Object> map) {
        this.trackingObject.eventFinish(trackEventType, getAdsType(), this, bMError, map);
    }
}
