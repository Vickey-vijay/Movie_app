package com.vungle.ads.internal;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import bk.l;
import ck.p;
import com.ironsource.C3426d4;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.InvalidAppId;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.SdkNotInitialized;
import com.vungle.ads.SdkVersionTooLow;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.TimeIntervalMetric;
import com.vungle.ads.VungleError;
import com.vungle.ads.VungleWrapperFramework;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.model.ConfigPayload;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.network.VungleHeader;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.task.CleanupJob;
import com.vungle.ads.internal.task.JobRunner;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.ThreadUtil;
import com.vungle.ads.internal.util.Utils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import lk.a0;
import mj.g;
import mj.r;

/* JADX INFO: compiled from: VungleInitializer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 .2\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b-\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\tH\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u001e\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0014\u001a\u00020\u0004J\u000f\u0010\u0017\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0006R(\u0010\u0014\u001a\u00020\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010\u001d\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010#\u001a\u00020\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b#\u0010\u001d\u0012\u0004\b&\u0010\u0016\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00110'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u00067²\u0006\f\u00100\u001a\u00020/8\nX\u008a\u0084\u0002²\u0006\f\u00102\u001a\u0002018\nX\u008a\u0084\u0002²\u0006\f\u00104\u001a\u0002038\nX\u008a\u0084\u0002²\u0006\f\u00106\u001a\u0002058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/VungleInitializer;", "", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "", "hasRequiredNetworkPermissions", "", "appId", "isAppIdInvalid", "Lmj/r;", "configure", "Lcom/vungle/ads/VungleError;", "exception", "onInitError", "onInitSuccess", "value", "hasInvalidChar", "Lcom/vungle/ads/InitializationListener;", "initializationCallback", C3426d4.a.f28413f, "isInitialized", "deInit$vungle_ads_release", "()V", "deInit", "Lcom/vungle/ads/VungleWrapperFramework;", "wrapperFramework", "wrapperFrameworkVersion", "setIntegrationName", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isInitialized$vungle_ads_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "setInitialized$vungle_ads_release", "(Ljava/util/concurrent/atomic/AtomicBoolean;)V", "isInitialized$vungle_ads_release$annotations", "isInitializing", "isInitializing$vungle_ads_release", "setInitializing$vungle_ads_release", "isInitializing$vungle_ads_release$annotations", "Ljava/util/concurrent/CopyOnWriteArrayList;", "initializationCallbackArray", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/vungle/ads/TimeIntervalMetric;", "initDurationMetric", "Lcom/vungle/ads/TimeIntervalMetric;", "<init>", VastTagName.COMPANION, "Lcom/vungle/ads/internal/executor/Executors;", "sdkExecutors", "Lcom/vungle/ads/internal/network/VungleApiClient;", "vungleApiClient", "Lcom/vungle/ads/internal/persistence/FilePreferences;", "filePreferences", "Lcom/vungle/ads/internal/task/JobRunner;", "jobRunner", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class VungleInitializer {
    private static final String TAG = "VungleInitializer";
    private AtomicBoolean isInitialized = new AtomicBoolean(false);
    private AtomicBoolean isInitializing = new AtomicBoolean(false);
    private final CopyOnWriteArrayList<InitializationListener> initializationCallbackArray = new CopyOnWriteArrayList<>();
    private final TimeIntervalMetric initDurationMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.INIT_TO_SUCCESS_CALLBACK_DURATION_MS);

    private final boolean hasInvalidChar(String value) {
        for (int i10 = 0; i10 < value.length(); i10++) {
            char cCharAt = value.charAt(i10);
            if ((Character.isLetterOrDigit(cCharAt) || cCharAt == '.') ? false : true) {
                return true;
            }
        }
        return false;
    }

    @VisibleForTesting
    public static /* synthetic */ void isInitialized$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void isInitializing$vungle_ads_release$annotations() {
    }

    private final void configure(final Context context, String str) {
        boolean z10 = false;
        try {
            ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
            g gVarB = kotlin.b.b(lazyThreadSafetyMode, new bk.a<FilePreferences>() { // from class: com.vungle.ads.internal.VungleInitializer$configure$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.persistence.FilePreferences, java.lang.Object] */
                @Override // bk.a
                public final FilePreferences invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context).getService(FilePreferences.class);
                }
            });
            ConfigManager configManager = ConfigManager.INSTANCE;
            ConfigPayload cachedConfig = configManager.getCachedConfig(m3223configure$lambda4(gVarB), str);
            if (cachedConfig != null) {
                ConfigManager.initWithConfig$vungle_ads_release$default(configManager, context, cachedConfig, true, null, 8, null);
                z10 = true;
            }
            this.isInitialized.set(true);
            onInitSuccess();
            Logger.INSTANCE.d(TAG, "Running cleanup jobs. " + Thread.currentThread().getId());
            m3224configure$lambda5(kotlin.b.b(lazyThreadSafetyMode, new bk.a<JobRunner>() { // from class: com.vungle.ads.internal.VungleInitializer$configure$$inlined$inject$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.task.JobRunner, java.lang.Object] */
                @Override // bk.a
                public final JobRunner invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context).getService(JobRunner.class);
                }
            })).execute(CleanupJob.Companion.makeJobInfo$default(CleanupJob.INSTANCE, null, 1, null));
            if (z10) {
                return;
            }
            configManager.fetchConfigAsync$vungle_ads_release(context, new l<Boolean, r>() { // from class: com.vungle.ads.internal.VungleInitializer.configure.1
                @Override // bk.l
                public /* bridge */ /* synthetic */ r invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return r.f64562a;
                }

                public final void invoke(boolean z11) {
                    Logger.INSTANCE.d(VungleInitializer.TAG, "Config fetch result: " + z11);
                }
            });
        } catch (Throwable th2) {
            Logger.INSTANCE.e(TAG, "Cannot get config", th2);
        }
    }

    private final boolean hasRequiredNetworkPermissions(Context context) {
        return (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0) && (ContextCompat.checkSelfPermission(context, "android.permission.INTERNET") == 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onInitError(final VungleError vungleError) {
        this.isInitializing.set(false);
        String localizedMessage = vungleError.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "Exception code is " + vungleError.getCode();
        }
        this.initDurationMetric.setMetricType(Sdk.SDKMetric.SDKMetricType.INIT_TO_FAIL_CALLBACK_DURATION_MS);
        this.initDurationMetric.markEnd();
        AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(this.initDurationMetric, (LogEntry) null, localizedMessage);
        ThreadUtil.INSTANCE.runOnUiThread(new bk.a<r>() { // from class: com.vungle.ads.internal.VungleInitializer.onInitError.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // bk.a
            public /* bridge */ /* synthetic */ r invoke() {
                invoke2();
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Logger.INSTANCE.e(VungleInitializer.TAG, "onError");
                CopyOnWriteArrayList copyOnWriteArrayList = VungleInitializer.this.initializationCallbackArray;
                VungleError vungleError2 = vungleError;
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((InitializationListener) it.next()).onError(vungleError2);
                }
                VungleInitializer.this.initializationCallbackArray.clear();
            }
        });
        Logger.INSTANCE.e(TAG, localizedMessage);
    }

    private final void onInitSuccess() {
        this.isInitializing.set(false);
        this.initDurationMetric.setMetricType(Sdk.SDKMetric.SDKMetricType.INIT_TO_SUCCESS_CALLBACK_DURATION_MS);
        this.initDurationMetric.markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.initDurationMetric, (LogEntry) null, (String) null, 6, (Object) null);
        Logger.INSTANCE.d(TAG, "onSuccess " + Thread.currentThread().getId());
        ThreadUtil.INSTANCE.runOnUiThread(new bk.a<r>() { // from class: com.vungle.ads.internal.VungleInitializer.onInitSuccess.1
            {
                super(0);
            }

            @Override // bk.a
            public /* bridge */ /* synthetic */ r invoke() {
                invoke2();
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Iterator it = VungleInitializer.this.initializationCallbackArray.iterator();
                while (it.hasNext()) {
                    ((InitializationListener) it.next()).onSuccess();
                }
                VungleInitializer.this.initializationCallbackArray.clear();
            }
        });
    }

    public final void deInit$vungle_ads_release() {
        ServiceLocator.INSTANCE.deInit();
        VungleApiClient.INSTANCE.reset$vungle_ads_release();
        this.isInitialized.set(false);
        this.isInitializing.set(false);
        this.initializationCallbackArray.clear();
    }

    public final void init(final String str, final Context context, InitializationListener initializationListener) {
        p.j(str, "appId");
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(initializationListener, "initializationCallback");
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.SDK_INIT_API), (LogEntry) null, (String) null, 6, (Object) null);
        this.initDurationMetric.markStart();
        this.initializationCallbackArray.add(initializationListener);
        if (isAppIdInvalid(str)) {
            onInitError(new InvalidAppId("App id invalid: " + str + ", package name: " + context.getPackageName()).logError$vungle_ads_release());
            return;
        }
        if (Utils.INSTANCE.isOSVersionInvalid()) {
            Logger.INSTANCE.e(TAG, "Init: SDK is supported only for API versions 25 and above.");
            onInitError(new SdkVersionTooLow("Init: SDK is supported only for API versions 25 and above.").logError$vungle_ads_release());
            return;
        }
        ConfigManager.INSTANCE.setAppId$vungle_ads_release(str);
        if (this.isInitialized.get()) {
            Logger.INSTANCE.d(TAG, "init already complete");
            onInitSuccess();
        } else {
            if (this.isInitializing.getAndSet(true)) {
                Logger.INSTANCE.d(TAG, "init already in progress");
                return;
            }
            ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
            g gVarB = kotlin.b.b(lazyThreadSafetyMode, new bk.a<Executors>() { // from class: com.vungle.ads.internal.VungleInitializer$init$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.Executors, java.lang.Object] */
                @Override // bk.a
                public final Executors invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context).getService(Executors.class);
                }
            });
            final g gVarB2 = kotlin.b.b(lazyThreadSafetyMode, new bk.a<VungleApiClient>() { // from class: com.vungle.ads.internal.VungleInitializer$init$$inlined$inject$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.VungleApiClient, java.lang.Object] */
                @Override // bk.a
                public final VungleApiClient invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context).getService(VungleApiClient.class);
                }
            });
            m3225init$lambda0(gVarB).getBACKGROUND_EXECUTOR().execute(new Runnable() { // from class: com.vungle.ads.internal.b
                @Override // java.lang.Runnable
                public final void run() {
                    VungleInitializer.m3227init$lambda2(this.f45425b, context, str, gVarB2);
                }
            }, new Runnable() { // from class: com.vungle.ads.internal.c
                @Override // java.lang.Runnable
                public final void run() {
                    VungleInitializer.m3228init$lambda3(this.f45429b);
                }
            });
        }
    }

    public final boolean isInitialized() {
        return this.isInitialized.get();
    }

    /* JADX INFO: renamed from: isInitialized$vungle_ads_release, reason: from getter */
    public final AtomicBoolean getIsInitialized() {
        return this.isInitialized;
    }

    /* JADX INFO: renamed from: isInitializing$vungle_ads_release, reason: from getter */
    public final AtomicBoolean getIsInitializing() {
        return this.isInitializing;
    }

    public final void setInitialized$vungle_ads_release(AtomicBoolean atomicBoolean) {
        p.j(atomicBoolean, "<set-?>");
        this.isInitialized = atomicBoolean;
    }

    public final void setInitializing$vungle_ads_release(AtomicBoolean atomicBoolean) {
        p.j(atomicBoolean, "<set-?>");
        this.isInitializing = atomicBoolean;
    }

    /* JADX INFO: renamed from: configure$lambda-4, reason: not valid java name */
    private static final FilePreferences m3223configure$lambda4(g<FilePreferences> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: renamed from: configure$lambda-5, reason: not valid java name */
    private static final JobRunner m3224configure$lambda5(g<? extends JobRunner> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: renamed from: init$lambda-0, reason: not valid java name */
    private static final Executors m3225init$lambda0(g<? extends Executors> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: renamed from: init$lambda-1, reason: not valid java name */
    private static final VungleApiClient m3226init$lambda1(g<VungleApiClient> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-2, reason: not valid java name */
    public static final void m3227init$lambda2(final VungleInitializer vungleInitializer, Context context, String str, g gVar) {
        p.j(vungleInitializer, "this$0");
        p.j(context, "$context");
        p.j(str, "$appId");
        p.j(gVar, "$vungleApiClient$delegate");
        if (!vungleInitializer.hasRequiredNetworkPermissions(context)) {
            Logger.INSTANCE.e(TAG, "Network permissions not granted");
            ThreadUtil.INSTANCE.runOnUiThread(new bk.a<r>() { // from class: com.vungle.ads.internal.VungleInitializer$init$1$1
                {
                    super(0);
                }

                @Override // bk.a
                public /* bridge */ /* synthetic */ r invoke() {
                    invoke2();
                    return r.f64562a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.onInitError(new SdkNotInitialized("Network permissions not granted").logError$vungle_ads_release());
                }
            });
        } else {
            PrivacyManager.INSTANCE.init(context);
            m3226init$lambda1(gVar).initialize(str);
            vungleInitializer.configure(context, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-3, reason: not valid java name */
    public static final void m3228init$lambda3(VungleInitializer vungleInitializer) {
        p.j(vungleInitializer, "this$0");
        vungleInitializer.onInitError(new OutOfMemory("Config: Out of Memory").logError$vungle_ads_release());
    }

    private final boolean isAppIdInvalid(String appId) {
        if (!a0.n0(appId) && !hasInvalidChar(appId)) {
            return false;
        }
        return true;
    }

    public final void setIntegrationName(VungleWrapperFramework vungleWrapperFramework, String str) {
        boolean z10;
        String str2;
        p.j(vungleWrapperFramework, "wrapperFramework");
        p.j(str, "wrapperFrameworkVersion");
        if (vungleWrapperFramework == VungleWrapperFramework.none) {
            Logger.INSTANCE.e(TAG, "Wrapper is null or is none");
            return;
        }
        VungleHeader vungleHeader = VungleHeader.INSTANCE;
        String headerUa = vungleHeader.getHeaderUa();
        if (str.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            str2 = '/' + str;
        } else {
            str2 = "";
        }
        String str3 = vungleWrapperFramework.name() + str2;
        if (a0.X(headerUa, str3, false, 2, null)) {
            Logger.INSTANCE.w(TAG, "Wrapper info already set");
            return;
        }
        vungleHeader.setHeaderUa(headerUa + ';' + str3);
        if (isInitialized()) {
            Logger.INSTANCE.w(TAG, "VUNGLE WARNING: SDK already initialized, you should've set wrapper info before");
        }
    }
}
