package com.unity3d.services.core.di;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import bk.a;
import bk.l;
import ck.p;
import com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.model.ByteStringSerializer;
import com.unity3d.ads.core.data.model.WebViewConfigurationStoreSerializer;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.extensions.ContextExtensionsKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.ads.measurements.MeasurementsService;
import com.unity3d.services.ads.token.AsyncTokenStorage;
import com.unity3d.services.ads.token.InMemoryAsyncTokenStorage;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.ads.topics.TopicsService;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.device.VolumeChange;
import com.unity3d.services.core.device.VolumeChangeMonitor;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.SDKDispatchers;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.metrics.SDKMetrics;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import gatewayprotocol.v1.AdOperationsConfigurationKt;
import gatewayprotocol.v1.DiagnosticEventsConfigurationKt;
import gatewayprotocol.v1.FeatureFlagsKt;
import gatewayprotocol.v1.NativeConfigurationKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.RequestPolicyKt;
import gatewayprotocol.v1.RequestRetryPolicyKt;
import gatewayprotocol.v1.RequestTimeoutPolicyKt;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.io.File;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.d;
import kotlinx.coroutines.g;
import nj.r;
import nk.h0;
import nk.i0;
import nk.j2;
import nk.k0;
import nk.l0;
import nk.w0;
import nk.x;

/* JADX INFO: compiled from: UnityAdsModule.kt */
/* JADX INFO: loaded from: classes.dex */
public final class UnityAdsModule {
    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> glInfoDataStore(final Context context, h0 h0Var, DataMigration<ByteStringStoreOuterClass.ByteStringStore> dataMigration) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(h0Var, "dispatcher");
        p.j(dataMigration, "fetchGLInfo");
        return DataStoreFactory.create$default(DataStoreFactory.INSTANCE, new ByteStringSerializer(), null, r.e(dataMigration), d.a(h0Var.plus(j2.b(null, 1, null))), new a<File>() { // from class: com.unity3d.services.core.di.UnityAdsModule.glInfoDataStore.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final File invoke() {
                return ContextExtensionsKt.unityAdsDataStoreFile(context, ServiceProvider.DATA_STORE_GL_INFO);
            }
        }, 2, null);
    }

    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> iapTransactionDataStore(Context context, h0 h0Var) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(h0Var, "dispatcher");
        return provideByteStringDataStore(context, h0Var, ServiceProvider.DATA_STORE_IAP_TRANSACTION);
    }

    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> nativeConfigurationDataStore(Context context, h0 h0Var) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(h0Var, "dispatcher");
        return provideByteStringDataStore(context, h0Var, ServiceProvider.DATA_STORE_NATIVE_CONFIG);
    }

    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> privacyDataStore(Context context, h0 h0Var) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(h0Var, "dispatcher");
        return provideByteStringDataStore(context, h0Var, ServiceProvider.DATA_STORE_PRIVACY);
    }

    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> privacyFsmDataStore(Context context, h0 h0Var) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(h0Var, "dispatcher");
        return provideByteStringDataStore(context, h0Var, ServiceProvider.DATA_STORE_PRIVACY_FSM);
    }

    private final NativeConfigurationOuterClass.AdOperationsConfiguration getDefaultAdOperations() {
        AdOperationsConfigurationKt.Dsl.Companion companion = AdOperationsConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.AdOperationsConfiguration.Builder builderNewBuilder = NativeConfigurationOuterClass.AdOperationsConfiguration.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        AdOperationsConfigurationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setLoadTimeoutMs(30000);
        dsl_create.setShowTimeoutMs(10000);
        dsl_create.setGetTokenTimeoutMs(UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS);
        return dsl_create._build();
    }

    private final NativeConfigurationOuterClass.RequestPolicy getDefaultRequestPolicy() {
        RequestPolicyKt.Dsl.Companion companion = RequestPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestPolicy.Builder builderNewBuilder = NativeConfigurationOuterClass.RequestPolicy.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        RequestPolicyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setRetryPolicy(getDefaultRequestRetryPolicy());
        dsl_create.setTimeoutPolicy(getDefaultRequestTimeoutPolicy());
        return dsl_create._build();
    }

    private final NativeConfigurationOuterClass.RequestRetryPolicy getDefaultRequestRetryPolicy() {
        RequestRetryPolicyKt.Dsl.Companion companion = RequestRetryPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestRetryPolicy.Builder builderNewBuilder = NativeConfigurationOuterClass.RequestRetryPolicy.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        RequestRetryPolicyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setMaxDuration(120000);
        dsl_create.setRetryWaitBase(500);
        dsl_create.setRetryJitterPct(0.1f);
        dsl_create.setShouldStoreLocally(false);
        dsl_create.setRetryMaxInterval(2500);
        dsl_create.setRetryScalingFactor(2.0f);
        return dsl_create._build();
    }

    private final NativeConfigurationOuterClass.RequestTimeoutPolicy getDefaultRequestTimeoutPolicy() {
        RequestTimeoutPolicyKt.Dsl.Companion companion = RequestTimeoutPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder builderNewBuilder = NativeConfigurationOuterClass.RequestTimeoutPolicy.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        RequestTimeoutPolicyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setConnectTimeoutMs(30000);
        dsl_create.setReadTimeoutMs(30000);
        dsl_create.setWriteTimeoutMs(30000);
        dsl_create.setOverallTimeoutMs(30000);
        return dsl_create._build();
    }

    private final ByteStringDataSource provideByteStringDataSource(DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        return new AndroidByteStringDataSource(dataStore);
    }

    private final DataStore<ByteStringStoreOuterClass.ByteStringStore> provideByteStringDataStore(final Context context, h0 h0Var, final String str) {
        return DataStoreFactory.create$default(DataStoreFactory.INSTANCE, new ByteStringSerializer(), null, null, d.a(h0Var.plus(j2.b(null, 1, null))), new a<File>() { // from class: com.unity3d.services.core.di.UnityAdsModule.provideByteStringDataStore.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final File invoke() {
                return ContextExtensionsKt.unityAdsDataStoreFile(context, str);
            }
        }, 4, null);
    }

    public final ByteStringDataSource auidDataStore(DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        p.j(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final NativeConfigurationOuterClass.NativeConfiguration defaultNativeConfiguration() {
        NativeConfigurationKt.Dsl.Companion companion = NativeConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.NativeConfiguration.Builder builderNewBuilder = NativeConfigurationOuterClass.NativeConfiguration.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        NativeConfigurationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setAdOperations(getDefaultAdOperations());
        dsl_create.setInitPolicy(getDefaultRequestPolicy());
        dsl_create.setAdPolicy(getDefaultRequestPolicy());
        dsl_create.setOtherPolicy(getDefaultRequestPolicy());
        dsl_create.setOperativeEventPolicy(getDefaultRequestPolicy());
        DiagnosticEventsConfigurationKt.Dsl.Companion companion2 = DiagnosticEventsConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder builderNewBuilder2 = NativeConfigurationOuterClass.DiagnosticEventsConfiguration.newBuilder();
        p.i(builderNewBuilder2, "newBuilder()");
        DiagnosticEventsConfigurationKt.Dsl dsl_create2 = companion2._create(builderNewBuilder2);
        dsl_create2.setEnabled(true);
        dsl_create2.setMaxBatchSize(10);
        dsl_create2.setMaxBatchIntervalMs(30000);
        dsl_create2.setTtmEnabled(false);
        dsl_create.setDiagnosticEvents(dsl_create2._build());
        FeatureFlagsKt.Dsl.Companion companion3 = FeatureFlagsKt.Dsl.Companion;
        NativeConfigurationOuterClass.FeatureFlags.Builder builderNewBuilder3 = NativeConfigurationOuterClass.FeatureFlags.newBuilder();
        p.i(builderNewBuilder3, "newBuilder()");
        FeatureFlagsKt.Dsl dsl_create3 = companion3._create(builderNewBuilder3);
        dsl_create3.setBoldSdkNextSessionEnabled(true);
        dsl_create.setFeatureFlags(dsl_create3._build());
        return dsl_create._build();
    }

    public final ByteStringDataSource gatewayCacheDataStore(DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        p.j(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> gatewayDataStore(Context context, h0 h0Var) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(h0Var, "dispatcher");
        return provideByteStringDataStore(context, h0Var, ServiceProvider.DATA_STORE_GATEWAY_CACHE);
    }

    public final l0 getTokenCoroutineScope(ISDKDispatchers iSDKDispatchers, i0 i0Var, g gVar) {
        p.j(iSDKDispatchers, "dispatchers");
        p.j(i0Var, "errorHandler");
        p.j(gVar, "parentJob");
        return d.a(gVar.plus(iSDKDispatchers.getDefault()).plus(new k0(ServiceProvider.NAMED_GET_TOKEN_SCOPE)).plus(i0Var));
    }

    public final ByteStringDataSource iapTransactionDataStore(DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        p.j(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final ByteStringDataSource idfiDataStore(DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        p.j(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final l0 initCoroutineScope(ISDKDispatchers iSDKDispatchers, i0 i0Var, g gVar) {
        p.j(iSDKDispatchers, "dispatchers");
        p.j(i0Var, "errorHandler");
        p.j(gVar, "parentJob");
        return d.a(gVar.plus(iSDKDispatchers.getDefault()).plus(new k0(ServiceProvider.NAMED_INIT_SCOPE)).plus(i0Var));
    }

    public final l0 loadCoroutineScope(ISDKDispatchers iSDKDispatchers, i0 i0Var, g gVar) {
        p.j(iSDKDispatchers, "dispatchers");
        p.j(i0Var, "errorHandler");
        p.j(gVar, "parentJob");
        return d.a(gVar.plus(iSDKDispatchers.getDefault()).plus(new k0(ServiceProvider.NAMED_LOAD_SCOPE)).plus(i0Var));
    }

    public final MeasurementsService measurementService(Context context, ISDKDispatchers iSDKDispatchers) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(iSDKDispatchers, "dispatchers");
        return new MeasurementsService(context, iSDKDispatchers, SharedInstances.INSTANCE.getWebViewEventSender());
    }

    public final JsonStorage memoryJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.MEMORY);
    }

    public final ByteStringDataSource nativeConfigurationDataStore(DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        p.j(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final l0 offerwallSignalsCoroutineScope(ISDKDispatchers iSDKDispatchers, i0 i0Var, g gVar) {
        p.j(iSDKDispatchers, "dispatchers");
        p.j(i0Var, "errorHandler");
        p.j(gVar, "parentJob");
        return d.a(gVar.plus(iSDKDispatchers.getDefault()).plus(new k0(ServiceProvider.NAMED_OFFERWALL_SCOPE)).plus(i0Var));
    }

    public final l0 omidCoroutineScope(ISDKDispatchers iSDKDispatchers, i0 i0Var, g gVar) {
        p.j(iSDKDispatchers, "dispatchers");
        p.j(i0Var, "errorHandler");
        p.j(gVar, "parentJob");
        return d.a(gVar.plus(iSDKDispatchers.getDefault()).plus(new k0(ServiceProvider.NAMED_OMID_SCOPE)).plus(i0Var));
    }

    public final ByteStringDataSource privacyDataStore(DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        p.j(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final ByteStringDataSource privacyFsmDataStore(DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        p.j(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final JsonStorage privateJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.PRIVATE);
    }

    public final g publicApiJob(final DiagnosticEventRepository diagnosticEventRepository) {
        p.j(diagnosticEventRepository, "diagnosticEventRepository");
        x xVarB = JobKt__JobKt.b(null, 1, null);
        xVarB.F(new l<Throwable, mj.r>() { // from class: com.unity3d.services.core.di.UnityAdsModule$publicApiJob$1$1
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ mj.r invoke(Throwable th2) {
                invoke2(th2);
                return mj.r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th2) {
                diagnosticEventRepository.flush();
            }
        });
        return xVarB;
    }

    public final JsonStorage publicJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.PUBLIC);
    }

    public final l0 scarSignalsCoroutineScope(ISDKDispatchers iSDKDispatchers, i0 i0Var, g gVar) {
        p.j(iSDKDispatchers, "dispatchers");
        p.j(i0Var, "errorHandler");
        p.j(gVar, "parentJob");
        return d.a(gVar.plus(iSDKDispatchers.getDefault()).plus(new k0(ServiceProvider.NAMED_SCAR_SCOPE)).plus(i0Var));
    }

    public final ISDKDispatchers sdkDispatchers() {
        return new SDKDispatchers();
    }

    public final l0 showCoroutineScope(ISDKDispatchers iSDKDispatchers, i0 i0Var, g gVar) {
        p.j(iSDKDispatchers, "dispatchers");
        p.j(i0Var, "errorHandler");
        p.j(gVar, "parentJob");
        return d.a(gVar.plus(iSDKDispatchers.getDefault()).plus(new k0(ServiceProvider.NAMED_SHOW_SCOPE)).plus(i0Var));
    }

    public final TopicsService topicsService(Context context, ISDKDispatchers iSDKDispatchers) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(iSDKDispatchers, "dispatchers");
        return new TopicsService(context, iSDKDispatchers, SharedInstances.INSTANCE.getWebViewEventSender());
    }

    public final l0 transactionCoroutineScope(ISDKDispatchers iSDKDispatchers, i0 i0Var, g gVar) {
        p.j(iSDKDispatchers, "dispatchers");
        p.j(i0Var, "errorHandler");
        p.j(gVar, "parentJob");
        return d.a(gVar.plus(iSDKDispatchers.getDefault()).plus(new k0(ServiceProvider.NAMED_TRANSACTION_SCOPE)).plus(i0Var));
    }

    public final DataStore<WebviewConfigurationStore.WebViewConfigurationStore> webViewConfigurationDataStore(final Context context, h0 h0Var) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(h0Var, "dispatcher");
        return DataStoreFactory.create$default(DataStoreFactory.INSTANCE, new WebViewConfigurationStoreSerializer(), null, null, d.a(h0Var.plus(j2.b(null, 1, null))), new a<File>() { // from class: com.unity3d.services.core.di.UnityAdsModule.webViewConfigurationDataStore.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final File invoke() {
                return ContextExtensionsKt.unityAdsDataStoreFile(context, ServiceProvider.DATA_STORE_WEBVIEW_CONFIG);
            }
        }, 4, null);
    }

    private final JsonStorage provideJsonStorage(StorageManager.StorageType storageType) {
        if (StorageManager.init(ClientProperties.getApplicationContext())) {
            Storage storage = StorageManager.getStorage(storageType);
            p.i(storage, "getStorage(storageType)");
            return storage;
        }
        throw new IllegalStateException("StorageManager failed to initialize".toString());
    }

    public final Context androidContext() {
        Context applicationContext = ClientProperties.getApplicationContext();
        p.i(applicationContext, "getApplicationContext()");
        return applicationContext;
    }

    public final AsyncTokenStorage asyncTokenStorage(TokenStorage tokenStorage, SDKMetricsSender sDKMetricsSender) {
        p.j(tokenStorage, "tokenStorage");
        p.j(sDKMetricsSender, "sdkMetricsSender");
        return new InMemoryAsyncTokenStorage(null, new Handler(Looper.getMainLooper()), sDKMetricsSender, tokenStorage);
    }

    public final h0 defaultDispatcher() {
        return w0.a();
    }

    public final h0 ioDispatcher() {
        return w0.b();
    }

    public final h0 mainDispatcher() {
        return w0.c();
    }

    public final SDKMetricsSender sdkMetrics() {
        SDKMetricsSender sDKMetrics = SDKMetrics.getInstance();
        p.i(sDKMetrics, "getInstance()");
        return sDKMetrics;
    }

    public final VolumeChangeMonitor volumeChangeMonitor(VolumeChange volumeChange) {
        p.j(volumeChange, "volumeChange");
        return new VolumeChangeMonitor(SharedInstances.INSTANCE.getWebViewEventSender(), volumeChange);
    }

    public final ByteStringDataSource glInfoDataStore(DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        p.j(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }
}
