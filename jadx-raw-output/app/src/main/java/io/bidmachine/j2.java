package io.bidmachine;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.iab.vast.VastRequest;
import io.bidmachine.internal.KotlinEngine;
import io.bidmachine.protobuf.AdCachePlacementControl;
import io.bidmachine.protobuf.AdNetwork;
import io.bidmachine.protobuf.InitResponse;
import io.bidmachine.rendering.Rendering;
import io.bidmachine.rendering.utils.UserAgentProvider;
import io.bidmachine.tracking.EventTrackerImpl;
import io.bidmachine.tracking.SessionTracker;
import io.bidmachine.utils.BluetoothUtils;
import io.bidmachine.utils.ProtoUtils;
import io.bidmachine.utils.ThrowableRunnable;
import io.bidmachine.utils.lazy.LazyValue;
import io.bidmachine.utils.log.DefaultLoggerInstance;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: BidMachineImpl.java */
/* JADX INFO: loaded from: classes10.dex */
public final class j2 {

    @NonNull
    private static final AtomicBoolean IS_PRE_INITIALIZED = new AtomicBoolean(false);

    @NonNull
    private static final String ZERO_BM_IFV = "00000000-0000-0000-0000-000000000000";

    @Nullable
    private static volatile j2 instance;

    @NonNull
    private final List<AdRequest.AdRequestListener<?>> adRequestListeners;

    @NonNull
    private final w1 analyticsInitializer;

    @Nullable
    @VisibleForTesting
    public Context appContext;

    @NonNull
    private final z0 appIdDataManager;

    @NonNull
    private final a1 appParams;

    @Nullable
    @VisibleForTesting
    public String bmIFV;

    @NonNull
    private CustomParams customParams;

    @NonNull
    private final x3 deviceParams;

    @NonNull
    private final EventTrackerImpl eventTracker;

    @VisibleForTesting
    public long firstLaunchTimeMs;

    @NonNull
    private final z3 iabSharedPreference;

    @NonNull
    private final g4.d initialRequestListener;

    @Nullable
    public g4 initialRequestLoader;
    private boolean isTestMode;
    private int networksLoadingTimeOutSec;

    @NonNull
    private final PriceFloorParams priceFloorParams;

    @Nullable
    private Publisher publisher;

    @VisibleForTesting
    public int requestTimeOutMs;

    @Nullable
    private String sellerId;

    @NonNull
    private final p5 sessionParams;

    @NonNull
    private final SessionTracker sessionTracker;

    @NonNull
    private TargetingParams targetingParams;

    @NonNull
    private final Map<TrackEventType, List<String>> trackingEventTypes;

    @NonNull
    private final w5 userRestrictionParams;

    @NonNull
    private final Set<InitializationCallback> callbackSet = new CopyOnWriteArraySet();

    @NonNull
    private final AtomicBoolean isInitializing = new AtomicBoolean(false);

    @NonNull
    private final AtomicBoolean isInitialized = new AtomicBoolean(false);

    /* JADX INFO: compiled from: BidMachineImpl.java */
    public class b implements g4.d {
        private b() {
        }

        public /* synthetic */ b(j2 j2Var, a aVar) {
            this();
        }

        @Override // io.bidmachine.g4.d
        public void onLoadFromRemoteFailed(@NonNull g4.b bVar) {
            j2 j2Var = j2.this;
            Context context = j2Var.appContext;
            if (context == null) {
                return;
            }
            j2Var.initializeInitNetworks(context, bVar.getResponse().getAdNetworksList());
        }

        @Override // io.bidmachine.g4.d
        public void onLoadFromStoreSuccess(@NonNull g4.b bVar) {
            j2.this.handleInitResponse(SessionManager.get().getSessionId(), bVar.getResponse(), bVar.getSessionId());
        }

        @Override // io.bidmachine.g4.d
        public void onLoadFromRemoteSuccess(@NonNull g4.b bVar) {
            InitResponse response = bVar.getResponse();
            j2.this.handleInitResponse(SessionManager.get().getSessionId(), response, bVar.getSessionId());
            if (j2.this.appContext == null) {
                return;
            }
            ExtraParamsManager.get().setExtras(j2.this.appContext, response.getExtras());
            j2 j2Var = j2.this;
            j2Var.initializeInitNetworks(j2Var.appContext, response.getAdNetworksList());
        }
    }

    /* JADX INFO: compiled from: BidMachineImpl.java */
    @VisibleForTesting
    public static class c implements UserAgentProvider {

        @NonNull
        private final Context applicationContext;

        @Override // io.bidmachine.rendering.utils.UserAgentProvider
        @Nullable
        public String getUserAgent() {
            return UserAgentManager.getUserAgent(this.applicationContext);
        }

        public c(@NonNull Context context) {
            this.applicationContext = context.getApplicationContext();
        }
    }

    /* JADX INFO: compiled from: BidMachineImpl.java */
    public class a extends DefaultLoggerInstance {
        public a(String str) {
            super(str);
        }

        @Override // io.bidmachine.utils.log.DefaultLoggerInstance
        @NonNull
        public String buildMessage(@Nullable Object obj, @Nullable String str, @Nullable LazyValue<String> lazyValue, @Nullable Throwable th2) {
            String strBuildMessage = super.buildMessage(obj, str, lazyValue, th2);
            if (j2.get().isTestMode()) {
                return "(TEST MODE) " + strBuildMessage;
            }
            return strBuildMessage;
        }
    }

    static {
        Logger.setEnabledInstance(new a("BidMachineLog"));
    }

    @NonNull
    public static j2 get() {
        j2 j2Var = instance;
        if (j2Var == null) {
            synchronized (j2.class) {
                j2Var = instance;
                if (j2Var == null) {
                    j2Var = new j2();
                    instance = j2Var;
                }
            }
        }
        return j2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleInitResponse$3(String str, InitResponse initResponse, String str2, Context context) {
        this.analyticsInitializer.configure(context, str, initResponse, str2);
    }

    @UiThread
    public static void preInitialize(@NonNull final Context context) {
        if (IS_PRE_INITIALIZED.compareAndSet(false, true)) {
            Utils.runCatching(new ThrowableRunnable() { // from class: io.bidmachine.h2
                @Override // io.bidmachine.utils.ThrowableRunnable
                public final void run() {
                    n1.initialize(context);
                }
            });
            Utils.runCatching(new ThrowableRunnable() { // from class: io.bidmachine.i2
                @Override // io.bidmachine.utils.ThrowableRunnable
                public final void run() {
                    w1.initialize(context);
                }
            });
        }
    }

    private static void sendOnInitialized(@Nullable final InitializationCallback initializationCallback) {
        if (initializationCallback == null) {
            return;
        }
        Utils.onUiThread(new Runnable() { // from class: io.bidmachine.f2
            @Override // java.lang.Runnable
            public final void run() {
                initializationCallback.onInitialized();
            }
        });
    }

    @NonNull
    public List<AdRequest.AdRequestListener<?>> getAdRequestListeners() {
        return this.adRequestListeners;
    }

    @Nullable
    public Context getAppContext() {
        return this.appContext;
    }

    @NonNull
    public a1 getAppParams() {
        return this.appParams;
    }

    @NonNull
    public CustomParams getCustomParams() {
        return this.customParams;
    }

    @NonNull
    public x3 getDeviceParams() {
        return this.deviceParams;
    }

    @Nullable
    public String getIFV() {
        return this.appIdDataManager.getIfv();
    }

    @NonNull
    public z3 getIabSharedPreference() {
        return this.iabSharedPreference;
    }

    public int getNetworksLoadingTimeOutSec() {
        return this.networksLoadingTimeOutSec;
    }

    @NonNull
    public PriceFloorParams getPriceFloorParams() {
        return this.priceFloorParams;
    }

    @Nullable
    public Publisher getPublisher() {
        return this.publisher;
    }

    public int getRequestTimeOutMs() {
        return this.requestTimeOutMs;
    }

    @Nullable
    public String getSellerId() {
        return this.sellerId;
    }

    @NonNull
    public p5 getSessionParams() {
        return this.sessionParams;
    }

    @NonNull
    public SessionTracker getSessionTracker() {
        return this.sessionTracker;
    }

    @NonNull
    public TargetingParams getTargetingParams() {
        return this.targetingParams;
    }

    @Nullable
    public List<String> getTrackingUrls(@NonNull TrackEventType trackEventType) {
        return this.trackingEventTypes.get(trackEventType);
    }

    @NonNull
    public w5 getUserRestrictionParams() {
        return this.userRestrictionParams;
    }

    @VisibleForTesting
    public void initializeInitNetworks(@NonNull Context context, @Nullable List<AdNetwork> list) {
        if (list == null) {
            return;
        }
        Iterator<AdNetwork> it = list.iterator();
        while (it.hasNext()) {
            NetworkRegistry.registerInitNetwork(context, it.next());
        }
    }

    public boolean isInitialized() {
        return this.isInitialized.get();
    }

    public boolean isInitializing() {
        return this.isInitializing.get();
    }

    public boolean isTestMode() {
        return this.isTestMode;
    }

    @VisibleForTesting
    public void notifyInitializationFinished() {
        Logger.d("Notify initialization finished");
        this.isInitialized.set(true);
        this.isInitializing.set(false);
        Iterator<InitializationCallback> it = this.callbackSet.iterator();
        while (it.hasNext()) {
            sendOnInitialized(it.next());
        }
        this.callbackSet.clear();
    }

    @NonNull
    public String obtainBMIFV(@NonNull Context context) {
        if (!this.userRestrictionParams.canSendBmIfv()) {
            return ZERO_BM_IFV;
        }
        if (!TextUtils.isEmpty(this.bmIFV)) {
            return this.bmIFV;
        }
        String strObtainBMIFV = o2.obtainBMIFV(context);
        this.bmIFV = strObtainBMIFV;
        return strObtainBMIFV;
    }

    public long obtainFirstLaunchTimeMs(@NonNull Context context) {
        long j10 = this.firstLaunchTimeMs;
        if (j10 != 0) {
            return j10;
        }
        long jObtainFirstLaunchTimeMs = o2.obtainFirstLaunchTimeMs(context);
        this.firstLaunchTimeMs = jObtainFirstLaunchTimeMs;
        return jObtainFirstLaunchTimeMs;
    }

    public void registerAdRequestListener(@Nullable AdRequest.AdRequestListener<?> adRequestListener) {
        if (adRequestListener == null) {
            return;
        }
        this.adRequestListeners.add(adRequestListener);
    }

    public void setCustomParams(@Nullable CustomParams customParams) {
        if (customParams == null) {
            customParams = new CustomParams();
        }
        this.customParams = customParams;
    }

    public void setPublisher(@Nullable Publisher publisher) {
        this.publisher = publisher;
    }

    public void setTargetingParams(@Nullable TargetingParams targetingParams) {
        if (targetingParams == null) {
            targetingParams = new TargetingParams();
        }
        this.targetingParams = targetingParams;
    }

    public void setTestMode(boolean z10) {
        this.isTestMode = z10;
    }

    public void unregisterAdRequestListener(@Nullable AdRequest.AdRequestListener<?> adRequestListener) {
        if (adRequestListener == null) {
            return;
        }
        this.adRequestListeners.remove(adRequestListener);
    }

    public j2() {
        EventTrackerImpl eventTrackerImpl = new EventTrackerImpl();
        this.eventTracker = eventTrackerImpl;
        this.sessionTracker = new k2(eventTrackerImpl);
        this.userRestrictionParams = new w5();
        this.priceFloorParams = new PriceFloorParams().addPriceFloor(UUID.randomUUID().toString(), 0.01d);
        this.appParams = new a1(new b1());
        this.deviceParams = new x3(new y2());
        this.sessionParams = new p5();
        this.iabSharedPreference = new a4();
        this.trackingEventTypes = new EnumMap(TrackEventType.class);
        this.adRequestListeners = new CopyOnWriteArrayList();
        this.appIdDataManager = new z0();
        this.analyticsInitializer = new w1();
        this.targetingParams = new TargetingParams();
        this.customParams = new CustomParams();
        this.requestTimeOutMs = 0;
        this.networksLoadingTimeOutSec = 0;
        this.firstLaunchTimeMs = 0L;
        this.initialRequestListener = new b(this, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initialize$2(Context context) {
        try {
            Debugger.setup(context);
            this.iabSharedPreference.initialize(context);
            this.appIdDataManager.updateIfv(context);
            this.initialRequestLoader.loadStored();
            obtainFirstLaunchTimeMs(context);
            k4.initialize(context);
            initializeNetworks(context, null);
            notifyInitializationFinished();
            this.initialRequestLoader.loadRemote();
            KotlinEngine.init();
        } catch (Throwable th2) {
            Logger.w(th2);
        }
    }

    @VisibleForTesting
    public void handleInitResponse(@NonNull final String str, @NonNull final InitResponse initResponse, @NonNull final String str2) {
        UrlProvider.setAuctionUrlFromInit(initResponse.getEndpoint());
        this.trackingEventTypes.clear();
        ProtoUtils.prepareEvents(this.trackingEventTypes, initResponse.getEventList());
        this.eventTracker.setDefaultEventConfiguration(initResponse.getEventConfiguration());
        SessionManager.get().setSessionResetAfter(initResponse.getSessionResetAfter());
        this.requestTimeOutMs = initResponse.getAdRequestTmax();
        this.networksLoadingTimeOutSec = initResponse.getAdNetworksLoadingTimeout();
        l2.setShowWithoutInternet(initResponse.getShowWithoutInternet());
        u2.setupTokenConfigurations(initResponse.getTokenConfigurationsList());
        Map<String, AdCachePlacementControl> adCachePlacementControlMap = initResponse.getAdCachePlacementControlMap();
        if (adCachePlacementControlMap != null) {
            w0.setAdCachePlacementControlMap(adCachePlacementControlMap);
            int maxCacheSize = 0;
            AdCachePlacementControl adCachePlacementControl = adCachePlacementControlMap.get(AdsType.Interstitial.getName());
            if (adCachePlacementControl != null) {
                maxCacheSize = 0 + adCachePlacementControl.getMaxCacheSize();
            }
            AdCachePlacementControl adCachePlacementControl2 = adCachePlacementControlMap.get(AdsType.Rewarded.getName());
            if (adCachePlacementControl2 != null) {
                maxCacheSize += adCachePlacementControl2.getMaxCacheSize();
            }
            if (maxCacheSize > 5) {
                VastRequest.setCacheSize(maxCacheSize);
            }
        }
        Utils.ifNotNull(this.appContext, new Executable() { // from class: io.bidmachine.e2
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                this.f59110a.lambda$handleInitResponse$3(str, initResponse, str2, (Context) obj);
            }
        });
    }

    public void initialize(@NonNull Context context, @NonNull String str, @Nullable InitializationCallback initializationCallback) {
        preInitialize(context);
        if (isInitialized()) {
            sendOnInitialized(initializationCallback);
            return;
        }
        if (context == null) {
            Logger.d("Initialization fail: Context is not provided");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            Logger.d("Initialization fail: Source id is not provided");
            return;
        }
        if (initializationCallback != null) {
            this.callbackSet.add(initializationCallback);
        }
        if (!this.isInitializing.compareAndSet(false, true)) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        SessionManager sessionManager = SessionManager.get();
        sessionManager.attachContext(applicationContext);
        this.appContext = applicationContext;
        this.sellerId = str;
        sessionManager.resume();
        BluetoothUtils.register(applicationContext);
        UserAgentManager.initialize(context);
        Rendering.setUserAgentProvider(new c(applicationContext));
        this.initialRequestLoader = new g4(applicationContext, str, this.initialRequestListener);
        Utils.onBackgroundThread(new Runnable() { // from class: io.bidmachine.g2
            @Override // java.lang.Runnable
            public final void run() {
                this.f59127b.lambda$initialize$2(applicationContext);
            }
        });
    }

    @VisibleForTesting
    public void initializeNetworks(@NonNull Context context, @Nullable NetworkRegistry.c cVar) {
        NetworkRegistry.registerCoreNetworks();
        NetworkRegistry.initializeNetworksAsync(context, cVar);
    }

    public boolean isInitializationStarted() {
        if (!isInitializing() && !isInitialized()) {
            return false;
        }
        return true;
    }
}
