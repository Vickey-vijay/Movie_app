package io.bidmachine.ads.networks.gam_dynamic;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.UInt32Value;
import com.explorestack.protobuf.UInt64Value;
import io.bidmachine.AdsFormat;
import io.bidmachine.ads.networks.gam_dynamic.a;
import io.bidmachine.ads.networks.gam_dynamic.versions.VersionWrapper;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.protobuf.Waterfall;
import io.bidmachine.util.taskmanager.TaskManager;
import io.bidmachine.util.taskmanager.coroutine.NetworkTaskManager;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.Tag;
import io.bidmachine.utils.lazy.LazyValue;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p001if.g;
import p001if.j;
import p001if.o;

/* JADX INFO: compiled from: WaterfallController.java */
/* JADX INFO: loaded from: classes9.dex */
public class a {

    @NonNull
    private static final TaskManager TASK_MANAGER = new NetworkTaskManager();

    @NonNull
    @VisibleForTesting
    public final AdsFormat adsFormat;

    @NonNull
    private final Context applicationContext;

    @VisibleForTesting
    public int cacheSize;

    @NonNull
    private final g gamAdManager;

    @NonNull
    private final j gamEventTracker;

    @NonNull
    private final o gamNetwork;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Nullable
    @VisibleForTesting
    public String f58582id;

    @VisibleForTesting
    public int maxRetryDegree;

    @NonNull
    private final NetworkParams networkParams;

    @VisibleForTesting
    public long refreshTimeOutMs;

    @Nullable
    @VisibleForTesting
    public String refreshUrl;

    @VisibleForTesting
    public int retryBaseSec;

    @Nullable
    @VisibleForTesting
    public StringValue serverParams;

    @NonNull
    private final Tag tag;

    @NonNull
    private final TaskExecutor taskExecutor;

    @NonNull
    private final VersionWrapper versionWrapper;

    @Nullable
    @VisibleForTesting
    public WaterfallLoader waterfallLoader;

    @NonNull
    @VisibleForTesting
    public final List<Waterfall.Configuration.AdUnit> adUnitList = new LinkedList();

    @NonNull
    @VisibleForTesting
    public final AtomicBoolean isLoading = new AtomicBoolean(false);

    @NonNull
    @VisibleForTesting
    public final AtomicBoolean isPolling = new AtomicBoolean(false);

    @NonNull
    @VisibleForTesting
    public final AtomicBoolean isShouldPollAfter = new AtomicBoolean(false);

    @NonNull
    @VisibleForTesting
    public final AtomicInteger failedWaterfallLoadAttempts = new AtomicInteger(0);

    /* JADX INFO: renamed from: io.bidmachine.ads.networks.gam_dynamic.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: WaterfallController.java */
    @VisibleForTesting
    public class C0492a implements WaterfallNetworkRequest.Callback {
        public C0492a() {
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.WaterfallNetworkRequest.Callback, io.bidmachine.core.NetworkRequest.CancelCallback
        public void onCanceled() {
            a.this.onWaterfallRequestFail("Request is canceled");
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.WaterfallNetworkRequest.Callback, io.bidmachine.core.NetworkRequest.Callback
        public void onFail(@Nullable BMError bMError) {
            a.this.onWaterfallRequestFail(bMError != null ? bMError.getMessage() : "Unknown");
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.WaterfallNetworkRequest.Callback, io.bidmachine.core.NetworkRequest.Callback
        public void onSuccess(@Nullable Waterfall.Configuration configuration) {
            if (configuration != null) {
                a.this.onWaterfallRequestSuccess(configuration);
            } else {
                a.this.onWaterfallRequestFail("Configuration response is null");
            }
        }
    }

    /* JADX INFO: compiled from: WaterfallController.java */
    @VisibleForTesting
    public class b implements WaterfallLoader.Listener {

        @NonNull
        @VisibleForTesting
        public final AtomicBoolean isAdLoaded = new AtomicBoolean(false);

        public b() {
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.WaterfallLoader.Listener
        public void onAdLoaded() {
            this.isAdLoaded.set(true);
            a.this.failedWaterfallLoadAttempts.set(0);
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.WaterfallLoader.Listener
        public void onWaterfallLoadCompleted(@NonNull Queue<Waterfall.Result.AdUnit> queue) {
            a.this.isPolling.set(false);
            if (!this.isAdLoaded.get()) {
                a.this.failedWaterfallLoadAttempts.incrementAndGet();
            }
            a.this.requestNextWaterfall(queue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$loadWaterfall$0(long j10) {
        return String.format("(%s) Execution waterfall load started after - %s ms (failedAttempts - %s, maxRetryDegree - %s, retryBase - %s sec)", this.adsFormat, Long.valueOf(j10), Integer.valueOf(this.failedWaterfallLoadAttempts.get()), Integer.valueOf(this.maxRetryDegree), Integer.valueOf(this.retryBaseSec));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$loadWaterfall$1() {
        return String.format("(%s) Fail to start loading waterfall", this.adsFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$onWaterfallRequestFail$4(String str) {
        return String.format("(%s) onWaterfallRequestFail - %s", this.adsFormat, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$onWaterfallRequestSuccess$3() {
        return String.format("(%s) onWaterfallRequestSuccess", this.adsFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$processLoadCompleted$5() {
        return String.format("(%s) Loading completed", this.adsFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$requestNextWaterfall$2() {
        return String.format("(%s) Request next waterfall", this.adsFormat);
    }

    @VisibleForTesting
    public void clearWaterfall() {
        this.waterfallLoader = null;
    }

    @VisibleForTesting
    public long calculateLoadingDelayMs() {
        return (long) (Math.pow(this.retryBaseSec, Math.min(this.failedWaterfallLoadAttempts.get(), this.maxRetryDegree)) * 1000.0d);
    }

    public void load(boolean z10) {
        if (this.isLoading.compareAndSet(false, true)) {
            this.isPolling.set(true);
            this.failedWaterfallLoadAttempts.set(0);
            loadWaterfall();
        } else {
            if (!z10 || this.isPolling.get()) {
                return;
            }
            this.isShouldPollAfter.set(true);
        }
    }

    @VisibleForTesting
    public void loadWaterfall() {
        this.isShouldPollAfter.set(false);
        this.waterfallLoader = new WaterfallLoader(this.applicationContext, this.networkParams, this.adsFormat, this.versionWrapper, this.gamNetwork, this.gamAdManager, this.gamEventTracker, this.taskExecutor, this.f58582id, this.adUnitList, this.cacheSize, new b());
        final long jCalculateLoadingDelayMs = calculateLoadingDelayMs();
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: if.j0
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return this.f54140a.lambda$loadWaterfall$0(jCalculateLoadingDelayMs);
            }
        });
        if (this.taskExecutor.execute(this.waterfallLoader, jCalculateLoadingDelayMs)) {
            return;
        }
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: if.k0
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return this.f54142a.lambda$loadWaterfall$1();
            }
        });
        processLoadCompleted();
    }

    @VisibleForTesting
    public void onWaterfallRequestFail(@NonNull final String str) {
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: if.p0
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return this.f54147a.lambda$onWaterfallRequestFail$4(str);
            }
        });
        loadWaterfall();
    }

    @VisibleForTesting
    public void onWaterfallRequestSuccess(@NonNull Waterfall.Configuration configuration) {
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: if.m0
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return this.f54143a.lambda$onWaterfallRequestSuccess$3();
            }
        });
        setWaterfallConfiguration(configuration);
        if (this.isShouldPollAfter.get() || !configuration.getShouldBreak()) {
            loadWaterfall();
        } else {
            processLoadCompleted();
        }
    }

    @VisibleForTesting
    public void processLoadCompleted() {
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: if.n0
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return this.f54144a.lambda$processLoadCompleted$5();
            }
        });
        clearWaterfall();
        this.isLoading.set(false);
    }

    @VisibleForTesting
    public void requestNextWaterfall(@NonNull Queue<Waterfall.Result.AdUnit> queue) {
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: if.o0
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return this.f54145a.lambda$requestNextWaterfall$2();
            }
        });
        if (TextUtils.isEmpty(this.refreshUrl) || !Utils.isHttpUrl(this.refreshUrl)) {
            onWaterfallRequestFail("Request next waterfall failed (refreshUrl is null or empty or incorrect)");
            return;
        }
        Waterfall.Result.Builder builderAddAllAdUnitResults = Waterfall.Result.newBuilder().setFormat(StringValue.newBuilder().setValue(this.adsFormat.getRemoteName()).build()).addAllAdUnitResults(queue);
        String str = this.f58582id;
        if (str != null) {
            builderAddAllAdUnitResults.setWaterfallId(str);
        }
        List<Waterfall.Result.CachedAdUnit> cachedAdUnitList = this.gamAdManager.getCachedAdUnitList(this.adsFormat);
        if (cachedAdUnitList != null && !cachedAdUnitList.isEmpty()) {
            builderAddAllAdUnitResults.addAllCachedAdUnits(cachedAdUnitList);
        }
        Struct ext = this.networkParams.getExt(this.applicationContext);
        if (ext != null) {
            builderAddAllAdUnitResults.setExt(ext);
        }
        StringValue stringValue = this.serverParams;
        if (stringValue != null) {
            builderAddAllAdUnitResults.setServerParams(stringValue);
        }
        C0492a c0492a = new C0492a();
        WaterfallNetworkRequest waterfallNetworkRequest = new WaterfallNetworkRequest(this.refreshUrl, builderAddAllAdUnitResults.build(), (int) this.refreshTimeOutMs);
        waterfallNetworkRequest.setCallback(c0492a);
        waterfallNetworkRequest.setCancelCallback(c0492a);
        waterfallNetworkRequest.request(TASK_MANAGER);
    }

    @VisibleForTesting
    public void sortDescByPrice(@NonNull List<Waterfall.Configuration.AdUnit> list) {
        Collections.sort(list, new Comparator() { // from class: if.l0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return a.lambda$sortDescByPrice$6((Waterfall.Configuration.AdUnit) obj, (Waterfall.Configuration.AdUnit) obj2);
            }
        });
    }

    public a(@NonNull Context context, @NonNull NetworkParams networkParams, @NonNull AdsFormat adsFormat, @NonNull Waterfall.Configuration configuration, @NonNull VersionWrapper versionWrapper, @NonNull o oVar, @NonNull g gVar, @NonNull j jVar, @NonNull TaskExecutor taskExecutor) {
        this.tag = new Tag(networkParams.getNetworkName() + "WaterfallController");
        this.applicationContext = context.getApplicationContext();
        this.networkParams = networkParams;
        this.adsFormat = adsFormat;
        this.versionWrapper = versionWrapper;
        this.gamNetwork = oVar;
        this.gamAdManager = gVar;
        this.taskExecutor = taskExecutor;
        this.gamEventTracker = jVar;
        setWaterfallConfiguration(configuration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$sortDescByPrice$6(Waterfall.Configuration.AdUnit adUnit, Waterfall.Configuration.AdUnit adUnit2) {
        return -Double.compare(adUnit.getPrice(), adUnit2.getPrice());
    }

    @VisibleForTesting
    public void setWaterfallConfiguration(@NonNull Waterfall.Configuration configuration) {
        StringValue refreshUrl;
        UInt32Value cacheSize;
        int value;
        UInt32Value retryBase;
        int value2;
        UInt32Value maxRetryDegree;
        int value3;
        UInt64Value refreshTimeout;
        long value4;
        this.f58582id = configuration.getId();
        this.adUnitList.clear();
        List<Waterfall.Configuration.AdUnit> adUnitsList = configuration.getAdUnitsList();
        if (adUnitsList != null && !adUnitsList.isEmpty()) {
            this.adUnitList.addAll(adUnitsList);
            sortDescByPrice(this.adUnitList);
        }
        StringValue serverParams = null;
        if (configuration.hasRefreshUrl()) {
            refreshUrl = configuration.getRefreshUrl();
        } else {
            refreshUrl = null;
        }
        if (refreshUrl != null) {
            String value5 = refreshUrl.getValue();
            if (!TextUtils.isEmpty(value5) && Utils.isHttpUrl(value5)) {
                this.refreshUrl = refreshUrl.getValue();
            }
        }
        if (configuration.hasCacheSize()) {
            cacheSize = configuration.getCacheSize();
        } else {
            cacheSize = null;
        }
        if (cacheSize != null) {
            value = cacheSize.getValue();
        } else {
            value = 1;
        }
        this.cacheSize = value;
        if (configuration.hasRetryBase()) {
            retryBase = configuration.getRetryBase();
        } else {
            retryBase = null;
        }
        if (retryBase != null) {
            value2 = retryBase.getValue();
        } else {
            value2 = 2;
        }
        this.retryBaseSec = value2;
        if (configuration.hasMaxRetryDegree()) {
            maxRetryDegree = configuration.getMaxRetryDegree();
        } else {
            maxRetryDegree = null;
        }
        if (maxRetryDegree != null) {
            value3 = maxRetryDegree.getValue();
        } else {
            value3 = 5;
        }
        this.maxRetryDegree = value3;
        if (configuration.hasRefreshTimeout()) {
            refreshTimeout = configuration.getRefreshTimeout();
        } else {
            refreshTimeout = null;
        }
        if (refreshTimeout != null) {
            value4 = refreshTimeout.getValue();
        } else {
            value4 = 10000;
        }
        this.refreshTimeOutMs = value4;
        if (configuration.hasServerParams()) {
            serverParams = configuration.getServerParams();
        }
        this.serverParams = serverParams;
    }
}
