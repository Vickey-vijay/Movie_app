package io.bidmachine;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.protobuf.ListValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import com.explorestack.protobuf.adcom.ConnectionType;
import com.explorestack.protobuf.adcom.DeviceType;
import com.explorestack.protobuf.adcom.OS;
import io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingAdapter;
import io.bidmachine.ads.networks.nast.NastAdapter;
import io.bidmachine.core.Logger;
import io.bidmachine.core.NetworkRequest;
import io.bidmachine.core.Utils;
import io.bidmachine.protobuf.InitRequest;
import io.bidmachine.protobuf.InitResponse;
import io.bidmachine.tracking.TrackingObject;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.DeviceUtils;
import io.bidmachine.utils.ProtoUtils;
import io.bidmachine.utils.lazy.LazyValue;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: InitialRequest.java */
/* JADX INFO: loaded from: classes6.dex */
public class e4 {
    private static final long MAX_INIT_REQUEST_DELAY_MS;
    private static final long MIN_INIT_REQUEST_DELAY_MS;

    @NonNull
    private final Context applicationContext;

    @NonNull
    private final Queue<String> baseUrlQueue;

    @Nullable
    private ApiRequest<InitRequest, InitResponse> currentInitRequest;

    @NonNull
    private final Queue<String> currentUrlQueue;

    @Nullable
    private c listener;

    @NonNull
    private final String sellerId;
    private long initRequestDelayMs = 0;

    @NonNull
    private final TrackingObject trackingObject = new BidMachineTrackingObject();

    @NonNull
    private final Runnable initialRunnable = new b(this);

    /* JADX INFO: compiled from: InitialRequest.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: io.bidmachine.e4$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: InitialRequest.java */
        public class C0497a implements NetworkRequest.Callback<InitResponse, BMError> {
            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ String lambda$onFail$0(long j10) {
                return String.format("reschedule init request (%s)", Long.valueOf(j10));
            }

            public C0497a() {
            }

            @Override // io.bidmachine.core.NetworkRequest.Callback
            public void onFail(@Nullable BMError bMError) {
                final long jCalculateDelay;
                e4.this.currentInitRequest = null;
                if (e4.this.currentUrlQueue.isEmpty()) {
                    jCalculateDelay = e4.this.calculateDelay();
                    Logger.d((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.d4
                        @Override // io.bidmachine.utils.lazy.LazyValue
                        public final Object get() {
                            return e4.a.C0497a.lambda$onFail$0(jCalculateDelay);
                        }
                    });
                    if (e4.this.listener != null) {
                        e4.this.listener.onFail(bMError);
                    }
                } else {
                    jCalculateDelay = 0;
                }
                Utils.onBackgroundThread(e4.this.initialRunnable, jCalculateDelay);
                e4.this.trackingObject.eventFinish(TrackEventType.InitLoading, null, null, bMError);
            }

            @Override // io.bidmachine.core.NetworkRequest.Callback
            public void onSuccess(@Nullable InitResponse initResponse) {
                e4.this.currentInitRequest = null;
                e4.this.initRequestDelayMs = 0L;
                Utils.cancelBackgroundThreadTask(e4.this.initialRunnable);
                if (e4.this.listener != null) {
                    e4.this.listener.onSuccess(initResponse);
                }
                e4.this.trackingObject.eventFinish(TrackEventType.InitLoading, null, null, null);
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e4.this.currentInitRequest = new ApiRequest.Builder().url(e4.this.pollUrl()).setDataBinder(new ApiRequest.ApiInitDataBinder()).setRequestData(e4.this.createInitRequest()).setCallback(new C0497a()).request();
        }
    }

    /* JADX INFO: compiled from: InitialRequest.java */
    public static class b implements Runnable {

        @NonNull
        private final WeakReference<e4> weakInitialRequest;

        @Override // java.lang.Runnable
        public void run() {
            e4 e4Var = this.weakInitialRequest.get();
            if (e4Var != null) {
                e4Var.request();
            }
        }

        public b(@NonNull e4 e4Var) {
            this.weakInitialRequest = new WeakReference<>(e4Var);
        }
    }

    /* JADX INFO: compiled from: InitialRequest.java */
    public interface c extends NetworkRequest.Callback<InitResponse, BMError> {
        @Override // io.bidmachine.core.NetworkRequest.Callback
        /* synthetic */ void onFail(@Nullable BMError bMError);

        @Override // io.bidmachine.core.NetworkRequest.Callback
        /* synthetic */ void onSuccess(@Nullable InitResponse initResponse);
    }

    public void destroy() {
        this.listener = null;
        this.currentInitRequest = null;
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        MIN_INIT_REQUEST_DELAY_MS = timeUnit.toMillis(2L);
        MAX_INIT_REQUEST_DELAY_MS = timeUnit.toMillis(128L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long calculateDelay() {
        long j10 = this.initRequestDelayMs;
        if (j10 <= 0) {
            this.initRequestDelayMs = MIN_INIT_REQUEST_DELAY_MS;
        } else {
            long j11 = j10 * 2;
            this.initRequestDelayMs = j11;
            long j12 = MAX_INIT_REQUEST_DELAY_MS;
            if (j11 >= j12) {
                this.initRequestDelayMs = j12;
            }
        }
        return this.initRequestDelayMs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public InitRequest createInitRequest() throws Throwable {
        ConnectionType connectionType;
        AdvertisingDataManager.updateInfo(this.applicationContext);
        j2 j2Var = j2.get();
        w5 userRestrictionParams = j2Var.getUserRestrictionParams();
        TargetingParams targetingParams = j2Var.getTargetingParams();
        InitRequest.Builder builderNewBuilder = InitRequest.newBuilder();
        String packageName = this.applicationContext.getPackageName();
        if (packageName != null) {
            builderNewBuilder.setBundle(packageName);
        }
        builderNewBuilder.setSellerId(this.sellerId);
        builderNewBuilder.setOs(OS.OS_ANDROID);
        builderNewBuilder.setOsv(DeviceUtils.getOsVersion());
        String appVersion = Utils.getAppVersion(this.applicationContext);
        if (appVersion != null) {
            builderNewBuilder.setAppVer(appVersion);
        }
        builderNewBuilder.setSdk(BidMachine.NAME);
        builderNewBuilder.setSdkver("3.3.0");
        builderNewBuilder.setIfa(AdvertisingDataManager.getAdvertisingId(this.applicationContext, !userRestrictionParams.canSendIfa()));
        String ifv = j2Var.getIFV();
        if (!TextUtils.isEmpty(ifv)) {
            builderNewBuilder.setIfv(ifv);
        }
        builderNewBuilder.setBmIfv(j2Var.obtainBMIFV(this.applicationContext));
        builderNewBuilder.setSessionId(SessionManager.get().getSessionId());
        DeviceInfo deviceInfoObtain = DeviceInfo.obtain(this.applicationContext);
        String str = deviceInfoObtain.manufacturer;
        if (str != null) {
            builderNewBuilder.setMake(str);
        }
        String str2 = deviceInfoObtain.model;
        if (str2 != null) {
            builderNewBuilder.setModel(str2);
        }
        String hwv = deviceInfoObtain.getHWV();
        if (hwv != null) {
            builderNewBuilder.setHwv(hwv);
        }
        builderNewBuilder.setDeviceType(deviceInfoObtain.isTablet ? DeviceType.DEVICE_TYPE_TABLET : DeviceType.DEVICE_TYPE_PHONE_DEVICE);
        if (userRestrictionParams.canSendDeviceInfo()) {
            ConnectionType connectionType2 = DeviceUtils.getConnectionType(this.applicationContext);
            builderNewBuilder.setContype(connectionType2);
            connectionType = connectionType2;
        } else {
            connectionType = null;
        }
        if (userRestrictionParams.canSendGeoPosition()) {
            com.explorestack.protobuf.adcom.Context.Geo.Builder builderCreateGeoBuilderWithLocation = ProtoUtils.createGeoBuilderWithLocation(this.applicationContext, targetingParams.getDeviceLocation(), null, true);
            targetingParams.build(builderCreateGeoBuilderWithLocation);
            builderNewBuilder.setGeo(builderCreateGeoBuilderWithLocation);
        }
        builderNewBuilder.setContext(RequestDataRetriever.collectContext(this.applicationContext, j2Var, userRestrictionParams, targetingParams, null, connectionType, null));
        builderNewBuilder.setAndroid(createPlatformData(this.applicationContext));
        builderNewBuilder.setExt(createExtension(this.applicationContext));
        return builderNewBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String pollUrl() {
        if (this.currentUrlQueue.isEmpty()) {
            this.currentUrlQueue.addAll(this.baseUrlQueue);
        }
        return this.currentUrlQueue.poll();
    }

    public void request() {
        this.trackingObject.eventStart(TrackEventType.InitLoading, null);
        Utils.onBackgroundThread(new a());
    }

    public void setListener(@Nullable c cVar) {
        this.listener = cVar;
    }

    public e4(@NonNull Context context, @NonNull String str, @NonNull Queue<String> queue) {
        this.applicationContext = context;
        this.sellerId = str;
        this.baseUrlQueue = new LinkedList(queue);
        this.currentUrlQueue = new LinkedList(queue);
    }

    @NonNull
    private Struct createExtension(@NonNull Context context) {
        Struct.Builder builderNewBuilder = Struct.newBuilder();
        builderNewBuilder.putFields(ProtoExtConstants.NETWORKS_INFO, Value.newBuilder().setListValue(createNetworkInfoListValue(context)).build());
        return builderNewBuilder.build();
    }

    @NonNull
    private ListValue.Builder createNetworkInfoListValue(@NonNull Context context) {
        ListValue.Builder builderNewBuilder = ListValue.newBuilder();
        for (n4 n4Var : m4.getNetworkAssetParamsMap(context).values()) {
            builderNewBuilder.addValues(createNetworkInfoValue(n4Var.getName(), n4Var.getSdkVersion(), n4Var.getAdapterVersion()));
        }
        builderNewBuilder.addValues(createNetworkInfoValue("mraid", "2.5.2", "3.3.0.1"));
        builderNewBuilder.addValues(createNetworkInfoValue("vast", "2.5.2", "3.3.0.1"));
        builderNewBuilder.addValues(createNetworkInfoValue(NastAdapter.KEY, NastAdapter.ADAPTER_SDK_VERSION_NAME, "3.3.0.1"));
        builderNewBuilder.addValues(createNetworkInfoValue(AdaptiveRenderingAdapter.KEY, "2.5.2", "3.3.0.1"));
        return builderNewBuilder;
    }

    @NonNull
    private Value createNetworkInfoValue(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        Value valueBuild = Value.newBuilder().setStringValue(str).build();
        Value valueBuild2 = Value.newBuilder().setStringValue(str2).build();
        return Value.newBuilder().setStructValue(Struct.newBuilder().putFields("network", valueBuild).putFields(ProtoExtConstants.NETWORK_VERSION, valueBuild2).putFields(ProtoExtConstants.NETWORK_ADAPTER_VERSION, Value.newBuilder().setStringValue(str3).build()).build()).build();
    }

    @NonNull
    private InitRequest.AndroidPlatformData createPlatformData(@NonNull Context context) {
        PlatformData platformData = PlatformData.get(context);
        final InitRequest.AndroidPlatformData.Builder builderNewBuilder = InitRequest.AndroidPlatformData.newBuilder();
        Integer minSdkVersion = platformData.getMinSdkVersion();
        Objects.requireNonNull(builderNewBuilder);
        Utils.ifNotNull(minSdkVersion, new Executable() { // from class: io.bidmachine.b4
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builderNewBuilder.setMinApiLevel(((Integer) obj).intValue());
            }
        });
        Utils.ifNotNull(platformData.kotlinVersion, new Executable() { // from class: io.bidmachine.c4
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builderNewBuilder.setKotlinVersion((String) obj);
            }
        });
        return builderNewBuilder.build();
    }
}
