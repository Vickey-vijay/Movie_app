package io.bidmachine;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingConfig;
import io.bidmachine.ads.networks.mraid.MraidConfig;
import io.bidmachine.ads.networks.nast.NastConfig;
import io.bidmachine.ads.networks.vast.VastConfig;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.internal.utils.LogSafeRunnable;
import io.bidmachine.protobuf.AdNetwork;
import io.bidmachine.tracking.EventData;
import io.bidmachine.tracking.TrackEventInfo;
import io.bidmachine.tracking.TrackingObject;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.lazy.LazyValue;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes5.dex */
public class NetworkRegistry {

    @NonNull
    @VisibleForTesting
    public static final Map<String, NetworkAdapter> NETWORK_ADAPTER_MAP = new ConcurrentHashMap();

    @NonNull
    @VisibleForTesting
    public static final Map<String, NetworkConfig> CORE_NETWORK_CONFIG_MAP = new ConcurrentHashMap();

    @NonNull
    @VisibleForTesting
    public static final Map<String, NetworkConfig> FROM_INIT_NETWORK_CONFIG_MAP = new ConcurrentHashMap();

    @NonNull
    @VisibleForTesting
    public static final Map<String, NetworkConfig> PENDING_NETWORK_CONFIG_MAP = new ConcurrentHashMap();

    @NonNull
    @VisibleForTesting
    public static final Map<String, NetworkConfig> INITIALIZING_NETWORK_CONFIG_MAP = new ConcurrentHashMap();

    @NonNull
    @VisibleForTesting
    public static final Map<String, NetworkConfig> INITIALIZED_NETWORK_CONFIG_MAP = new ConcurrentHashMap();

    @NonNull
    @VisibleForTesting
    public static final Map<AdsType, Map<String, NetworkConfig>> INITIALIZED_CORE_NETWORK_CONFIG_TYPED_MAP = new ConcurrentHashMap(AdsType.values().length);

    @NonNull
    @VisibleForTesting
    public static final Map<AdsType, Map<String, NetworkConfig>> INITIALIZED_NETWORK_CONFIG_TYPED_MAP = new ConcurrentHashMap(AdsType.values().length);

    @NonNull
    private static final AtomicBoolean IS_NETWORKS_INITIALIZING_EXECUTED = new AtomicBoolean(false);

    @NonNull
    private static final AtomicBoolean IS_CORE_NETWORKS_INITIALIZING = new AtomicBoolean(false);

    @NonNull
    private static final AtomicBoolean IS_CORE_NETWORKS_INITIALIZED = new AtomicBoolean(false);

    @NonNull
    private static final Object CORE_INITIALIZING_LOCK = new Object();

    @NonNull
    private static final Object INITIALIZING_LOCK = new Object();

    public class a extends Thread {
        public final /* synthetic */ Context val$applicationContext;
        public final /* synthetic */ c val$initializeCallback;

        public a(Context context, c cVar) {
            this.val$applicationContext = context;
            this.val$initializeCallback = cVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            NetworkRegistry.initializeNetworksAwait(this.val$applicationContext);
            c cVar = this.val$initializeCallback;
            if (cVar != null) {
                cVar.onExecuted();
            }
        }
    }

    @VisibleForTesting
    public static final class b implements Runnable {

        @NonNull
        private static final Executor EXECUTOR = Executors.newFixedThreadPool(Math.max(8, Runtime.getRuntime().availableProcessors() * 4));

        @NonNull
        private static final Object INITIALIZED_NETWORK_CONFIG_TYPED_LOCK = new Object();

        @NonNull
        @VisibleForTesting
        public static final List<b> NETWORK_LOAD_TASK_LIST = new CopyOnWriteArrayList();

        @Nullable
        private final c callback;

        @NonNull
        private final ContextProvider contextProvider;

        @NonNull
        private final InitializationParams initializationParams;

        @NonNull
        private final NetworkConfig networkConfig;

        @NonNull
        private final String networkKey;

        @NonNull
        private final TrackingObject trackingObject;

        public static class a implements InternalNetworkInitializationCallback {

            @NonNull
            private final WeakReference<b> weakNetworkLoadTask;

            @Override // io.bidmachine.InternalNetworkInitializationCallback
            public void onFail(@NonNull NetworkAdapter networkAdapter, @NonNull String str) {
                b bVar = this.weakNetworkLoadTask.get();
                if (bVar != null) {
                    bVar.onInitializationFail(str);
                }
            }

            @Override // io.bidmachine.InternalNetworkInitializationCallback
            public void onSuccess(@NonNull NetworkAdapter networkAdapter) {
                b bVar = this.weakNetworkLoadTask.get();
                if (bVar != null) {
                    bVar.onInitializationSuccess(networkAdapter);
                }
            }

            public a(@NonNull b bVar) {
                this.weakNetworkLoadTask = new WeakReference<>(bVar);
            }
        }

        public /* synthetic */ b(ContextProvider contextProvider, InitializationParams initializationParams, NetworkConfig networkConfig, c cVar, a aVar) {
            this(contextProvider, initializationParams, networkConfig, cVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onInitializationFail$1(String str) {
            return String.format("Initialization error: %s", str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onInitializationSuccess$0(NetworkAdapter networkAdapter) {
            return String.format("Initialization completed: %s, %s", networkAdapter.obtainNetworkSdkVersion(), networkAdapter.getAdapterVersion());
        }

        private b(@NonNull ContextProvider contextProvider, @NonNull InitializationParams initializationParams, @NonNull NetworkConfig networkConfig, @Nullable c cVar) {
            this.contextProvider = contextProvider;
            this.initializationParams = initializationParams;
            this.networkConfig = networkConfig;
            this.callback = cVar;
            String networkKey = networkConfig.getNetworkKey();
            this.networkKey = networkKey;
            this.trackingObject = new BidMachineTrackingObject(networkKey + "_initialize");
        }

        public void executeAsync() {
            NETWORK_LOAD_TASK_LIST.add(this);
            try {
                EXECUTOR.execute(this);
            } catch (Throwable th2) {
                Logger.w(th2);
                onInitializationFail("Exception creating network initialization task");
            }
        }

        public void executeSync() {
            NETWORK_LOAD_TASK_LIST.add(this);
            run();
        }

        public void onInitializationFail(@NonNull final String str) {
            Logger.e(this.networkKey, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.x4
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    return NetworkRegistry.b.lambda$onInitializationFail$1(str);
                }
            });
            this.trackingObject.eventFinish(TrackEventType.HeaderBiddingNetworkInitialize, null, new EventData().setNetworkName(this.networkKey), BMError.adapterInitialization(str));
            NETWORK_LOAD_TASK_LIST.remove(this);
        }

        public void onInitializationSuccess(@NonNull final NetworkAdapter networkAdapter) {
            Logger.d(this.networkKey, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.y4
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    return NetworkRegistry.b.lambda$onInitializationSuccess$0(networkAdapter);
                }
            });
            if (networkAdapter instanceof HeaderBiddingAdapter) {
                this.trackingObject.eventFinish(TrackEventType.HeaderBiddingNetworkInitialize, null, new EventData().setNetworkName(this.networkKey), null);
            } else {
                this.trackingObject.clearEvent(TrackEventType.HeaderBiddingNetworkInitialize);
            }
            NETWORK_LOAD_TASK_LIST.remove(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            Logger.d(this.networkKey, "Initialization started");
            try {
                this.trackingObject.eventStart(TrackEventType.HeaderBiddingNetworkInitialize, new TrackEventInfo().withParameter("HB_NETWORK", this.networkKey));
                NetworkAdapter networkAdapterObtainAdapter = NetworkRegistry.obtainAdapter(this.networkConfig);
                networkAdapterObtainAdapter.setLogging(Logger.isLoggingEnabled());
                networkAdapterObtainAdapter.initialize(this.contextProvider, this.initializationParams, this.networkConfig.getNetworkConfigParams(), new a(this));
                Map<String, NetworkConfig> map = NetworkRegistry.INITIALIZED_NETWORK_CONFIG_MAP;
                if (!map.containsKey(this.networkKey)) {
                    map.put(this.networkKey, this.networkConfig);
                }
                for (AdsType adsType : this.networkConfig.getSupportedAdsTypes(networkAdapterObtainAdapter)) {
                    synchronized (INITIALIZED_NETWORK_CONFIG_TYPED_LOCK) {
                        if (NetworkRegistry.CORE_NETWORK_CONFIG_MAP.containsKey(this.networkKey)) {
                            addAdsTypeNetworkConfig(NetworkRegistry.INITIALIZED_CORE_NETWORK_CONFIG_TYPED_MAP, adsType, this.networkKey, this.networkConfig);
                        }
                        addAdsTypeNetworkConfig(NetworkRegistry.INITIALIZED_NETWORK_CONFIG_TYPED_MAP, adsType, this.networkKey, this.networkConfig);
                    }
                }
                NetworkRegistry.PENDING_NETWORK_CONFIG_MAP.remove(this.networkKey);
            } catch (Throwable th2) {
                Logger.w(th2);
                onInitializationFail("Network initialization exception");
            }
            c cVar = this.callback;
            if (cVar != null) {
                cVar.onExecuted();
            }
        }

        private void addAdsTypeNetworkConfig(@NonNull Map<AdsType, Map<String, NetworkConfig>> map, @NonNull AdsType adsType, @NonNull String str, @NonNull NetworkConfig networkConfig) {
            Map<String, NetworkConfig> concurrentHashMap = map.get(adsType);
            if (concurrentHashMap == null) {
                concurrentHashMap = new ConcurrentHashMap<>();
                map.put(adsType, concurrentHashMap);
            }
            concurrentHashMap.put(str, networkConfig);
        }
    }

    public interface c {
        void onExecuted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void initializeNetworksAwait(@NonNull Context context) {
        initializeNetworksAwait(context, getPendingNetworkConfigList());
    }

    public static void registerNetworks(@Nullable NetworkConfig... networkConfigArr) {
        if (networkConfigArr == null) {
            return;
        }
        for (NetworkConfig networkConfig : networkConfigArr) {
            registerNetwork(networkConfig);
        }
    }

    @Nullable
    public static Map<String, NetworkConfig> copyOrNullInitializedCoreNetworkConfigs(@NonNull AdsType adsType) {
        Map<String, NetworkConfig> map = INITIALIZED_CORE_NETWORK_CONFIG_TYPED_MAP.get(adsType);
        if (map == null) {
            return null;
        }
        return new HashMap(map);
    }

    @Nullable
    public static Map<String, NetworkConfig> copyOrNullInitializedNetworkConfigs(@NonNull AdsType adsType) {
        Map<String, NetworkConfig> map = INITIALIZED_NETWORK_CONFIG_TYPED_MAP.get(adsType);
        if (map == null) {
            return null;
        }
        return new HashMap(map);
    }

    @NonNull
    public static Map<String, NetworkConfig> createInitNetworkConfigMap() {
        return new HashMap(FROM_INIT_NETWORK_CONFIG_MAP);
    }

    @Nullable
    public static NetworkConfig getConfig(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return INITIALIZED_NETWORK_CONFIG_MAP.get(str);
    }

    public static Collection<NetworkConfig> getCoreNetworkConfigList() {
        return CORE_NETWORK_CONFIG_MAP.values();
    }

    public static Collection<NetworkConfig> getPendingNetworkConfigList() {
        return PENDING_NETWORK_CONFIG_MAP.values();
    }

    private static void initializeNetwork(@NonNull ContextProvider contextProvider, @NonNull InitializationParams initializationParams, @NonNull NetworkConfig networkConfig, @Nullable c cVar) {
        synchronized (INITIALIZING_LOCK) {
            String networkKey = networkConfig.getNetworkKey();
            Map<String, NetworkConfig> map = INITIALIZING_NETWORK_CONFIG_MAP;
            if (!map.containsKey(networkKey)) {
                map.put(networkKey, networkConfig);
                new b(contextProvider, initializationParams, networkConfig, cVar, null).executeAsync();
            } else {
                PENDING_NETWORK_CONFIG_MAP.remove(networkKey);
                if (cVar != null) {
                    cVar.onExecuted();
                }
            }
        }
    }

    public static void initializeNetworksAsync(@NonNull Context context, @Nullable c cVar) {
        if (IS_NETWORKS_INITIALIZING_EXECUTED.compareAndSet(false, true)) {
            new a(context.getApplicationContext(), cVar).start();
        }
    }

    private static void initializeNetworksAwait(@NonNull Context context, @NonNull Collection<NetworkConfig> collection) {
        j2 j2Var = j2.get();
        initializeNetworksAwait(new SimpleContextProvider(context), new i4(j2Var.getTargetingParams(), j2Var.getUserRestrictionParams()), collection);
    }

    public static void initializeNetworksSync(@NonNull Context context) {
        if (IS_NETWORKS_INITIALIZING_EXECUTED.compareAndSet(false, true)) {
            initializeNetworksAwait(context.getApplicationContext());
        }
    }

    public static boolean isNetworksInitializingExecuted() {
        return IS_NETWORKS_INITIALIZING_EXECUTED.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$registerNetworks$0(NetworkRegistryCallback networkRegistryCallback) {
        if (networkRegistryCallback != null) {
            networkRegistryCallback.onRegistered();
        }
    }

    @NonNull
    public static NetworkAdapter obtainAdapter(@NonNull NetworkConfig networkConfig) {
        synchronized (NetworkRegistry.class) {
            String networkKey = networkConfig.getNetworkKey();
            NetworkAdapter adapter = getAdapter(networkKey);
            if (adapter != null) {
                return adapter;
            }
            NetworkAdapter networkAdapterCreateNetworkAdapter = networkConfig.createNetworkAdapter();
            NETWORK_ADAPTER_MAP.put(networkKey, networkAdapterCreateNetworkAdapter);
            return networkAdapterCreateNetworkAdapter;
        }
    }

    public static void registerAndInitializeCoreNetworks(@NonNull Context context) {
        AtomicBoolean atomicBoolean = IS_CORE_NETWORKS_INITIALIZED;
        if (atomicBoolean.get()) {
            return;
        }
        synchronized (CORE_INITIALIZING_LOCK) {
            if (IS_CORE_NETWORKS_INITIALIZING.compareAndSet(false, true)) {
                registerCoreNetworks();
                initializeNetworksAwait(context, getCoreNetworkConfigList());
                atomicBoolean.set(true);
            }
        }
    }

    public static void registerCoreNetworks() {
        MraidConfig mraidConfig = new MraidConfig();
        AdsFormat adsFormat = AdsFormat.Banner;
        registerCoreNetwork(mraidConfig.withMediationConfig(adsFormat, new HashMap()).withMediationConfig(AdsFormat.InterstitialStatic, new HashMap()).withMediationConfig(AdsFormat.RewardedStatic, new HashMap()));
        registerCoreNetwork(new VastConfig().withMediationConfig(AdsFormat.InterstitialVideo, new HashMap()).withMediationConfig(AdsFormat.RewardedVideo, new HashMap()));
        registerCoreNetwork(new NastConfig().withMediationConfig(AdsFormat.Native, new HashMap()));
        registerCoreNetwork(new AdaptiveRenderingConfig().withMediationConfig(adsFormat, new HashMap()).withMediationConfig(AdsFormat.Interstitial, new HashMap()).withMediationConfig(AdsFormat.Rewarded, new HashMap()));
    }

    public static void registerNetwork(@Nullable NetworkConfig networkConfig) {
        j2 j2Var;
        Context appContext;
        if (networkConfig == null || isNetworkRegistered(networkConfig.getNetworkKey())) {
            return;
        }
        obtainAdapter(networkConfig);
        PENDING_NETWORK_CONFIG_MAP.put(networkConfig.getNetworkKey(), networkConfig);
        if (!isNetworksInitializingExecuted() || (appContext = (j2Var = j2.get()).getAppContext()) == null) {
            return;
        }
        initializeNetwork(new SimpleContextProvider(appContext), new i4(j2Var.getTargetingParams(), j2Var.getUserRestrictionParams()), networkConfig, null);
    }

    @VisibleForTesting
    public static void reset() {
        NETWORK_ADAPTER_MAP.clear();
        CORE_NETWORK_CONFIG_MAP.clear();
        FROM_INIT_NETWORK_CONFIG_MAP.clear();
        PENDING_NETWORK_CONFIG_MAP.clear();
        INITIALIZING_NETWORK_CONFIG_MAP.clear();
        INITIALIZED_NETWORK_CONFIG_MAP.clear();
        INITIALIZED_CORE_NETWORK_CONFIG_TYPED_MAP.clear();
        INITIALIZED_NETWORK_CONFIG_TYPED_MAP.clear();
        IS_NETWORKS_INITIALIZING_EXECUTED.set(false);
        IS_CORE_NETWORKS_INITIALIZING.set(false);
        IS_CORE_NETWORKS_INITIALIZED.set(false);
        b.NETWORK_LOAD_TASK_LIST.clear();
    }

    public static void setLoggingEnabled(boolean z10) {
        Iterator<Map.Entry<String, NetworkAdapter>> it = NETWORK_ADAPTER_MAP.entrySet().iterator();
        while (it.hasNext()) {
            try {
                it.next().getValue().setLogging(z10);
            } catch (Throwable th2) {
                Logger.w(th2);
            }
        }
    }

    @Nullable
    public static String checkAndPutNetwork(@NonNull Context context, @NonNull AdsType adsType, @NonNull NetworkConfig networkConfig, @NonNull Map<String, NetworkConfig> map) {
        NetworkAdapter adapter = getAdapter(networkConfig.getNetworkKey());
        if (adapter == null) {
            return "Network not registered";
        }
        if (!adapter.isAdsTypeSupported(adsType)) {
            return "Network does not support this ad type";
        }
        if (!adapter.isInitialized(context)) {
            return "Network not initialized";
        }
        map.put(networkConfig.getNetworkKey(), networkConfig);
        return null;
    }

    @Nullable
    public static NetworkAdapter getAdapter(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return NETWORK_ADAPTER_MAP.get(str);
    }

    public static boolean isNetworkRegistered(@NonNull String str) {
        if (getAdapter(str) != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$registerNetworks$1(Context context, String str, final NetworkRegistryCallback networkRegistryCallback) throws Throwable {
        registerNetworks(context, str);
        Utils.onUiThread(new Runnable() { // from class: io.bidmachine.w4
            @Override // java.lang.Runnable
            public final void run() {
                NetworkRegistry.lambda$registerNetworks$0(networkRegistryCallback);
            }
        });
    }

    public static void registerCoreNetwork(@NonNull NetworkConfig networkConfig) {
        String networkKey = networkConfig.getNetworkKey();
        Map<String, NetworkConfig> map = CORE_NETWORK_CONFIG_MAP;
        if (map.containsKey(networkKey)) {
            return;
        }
        map.put(networkKey, networkConfig);
        registerNetwork(networkConfig);
    }

    public static void registerInitNetwork(@NonNull Context context, @NonNull AdNetwork adNetwork) {
        NetworkConfig networkConfigCreate;
        if (!isNetworkRegistered(adNetwork.getName()) && (networkConfigCreate = t4.create(context, adNetwork)) != null) {
            FROM_INIT_NETWORK_CONFIG_MAP.put(networkConfigCreate.getNetworkKey(), networkConfigCreate);
            registerNetwork(networkConfigCreate);
        }
    }

    public static void registerNetworks(@NonNull Context context, @Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                NetworkConfig networkConfigCreate = t4.create(context, jSONArray.getJSONObject(i10));
                if (networkConfigCreate != null) {
                    registerNetwork(networkConfigCreate);
                }
            }
        } catch (JSONException e10) {
            Logger.w(e10);
        }
    }

    private static void initializeNetworksAwait(@NonNull ContextProvider contextProvider, @NonNull InitializationParams initializationParams, @NonNull Collection<NetworkConfig> collection) {
        if (collection.isEmpty()) {
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(collection.size());
        Iterator<NetworkConfig> it = collection.iterator();
        while (it.hasNext()) {
            initializeNetwork(contextProvider, initializationParams, it.next(), new c() { // from class: io.bidmachine.v4
                @Override // io.bidmachine.NetworkRegistry.c
                public final void onExecuted() {
                    countDownLatch.countDown();
                }
            });
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e10) {
            Logger.w(e10);
        }
    }

    public static void registerNetworks(@NonNull final Context context, @Nullable final String str, @Nullable final NetworkRegistryCallback networkRegistryCallback) {
        x2.get().execute(new LogSafeRunnable() { // from class: io.bidmachine.u4
            @Override // io.bidmachine.internal.utils.LogSafeRunnable, io.bidmachine.utils.SafeRunnable
            public final void onRun() throws Throwable {
                NetworkRegistry.lambda$registerNetworks$1(context, str, networkRegistryCallback);
            }
        });
    }
}
