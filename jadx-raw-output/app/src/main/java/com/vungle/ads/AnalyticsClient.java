package com.vungle.ads;

import android.os.Build;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import ck.i;
import ck.p;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.events.CrashEvent;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.network.VungleHeader;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.ActivityManager;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: compiled from: AnalyticsClient.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002klB\t\b\u0002¢\u0006\u0004\bj\u0010=J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J2\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0002J2\u0010\u0014\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\u0015\u001a\u00020\nH\u0002J\b\u0010\u0016\u001a\u00020\nH\u0003J\b\u0010\u0017\u001a\u00020\nH\u0003J/\u0010\"\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0000¢\u0006\u0004\b \u0010!J+\u0010%\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b#\u0010$J9\u0010(\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b&\u0010'J/\u0010(\u001a\u00020\n2\u0006\u0010*\u001a\u00020)2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b&\u0010+J/\u0010(\u001a\u00020\n2\u0006\u0010-\u001a\u00020,2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b&\u0010.J/\u0010(\u001a\u00020\n2\u0006\u00100\u001a\u00020/2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b&\u00101J/\u0010(\u001a\u00020\n2\u0006\u00103\u001a\u0002022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b&\u00104R\u0014\u00105\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u00106R&\u00108\u001a\b\u0012\u0004\u0012\u00020\b078\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b8\u00109\u0012\u0004\b<\u0010=\u001a\u0004\b:\u0010;R&\u0010>\u001a\b\u0012\u0004\u0012\u00020\u0012078\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b>\u00109\u0012\u0004\b@\u0010=\u001a\u0004\b?\u0010;R&\u0010A\u001a\b\u0012\u0004\u0012\u00020\b078\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bA\u00109\u0012\u0004\bC\u0010=\u001a\u0004\bB\u0010;R&\u0010D\u001a\b\u0012\u0004\u0012\u00020\u0012078\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bD\u00109\u0012\u0004\bF\u0010=\u001a\u0004\bE\u0010;R\u0014\u0010G\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\bI\u0010JR*\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0019\u0010K\u0012\u0004\bP\u0010=\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR*\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001b\u0010Q\u0012\u0004\bV\u0010=\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR(\u0010\u001f\u001a\u00020\u001e8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001f\u0010W\u0012\u0004\b\\\u0010=\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u0016\u0010^\u001a\u00020]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R(\u0010`\u001a\u00020\u001e8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b`\u0010W\u0012\u0004\bc\u0010=\u001a\u0004\ba\u0010Y\"\u0004\bb\u0010[R \u0010e\u001a\u00020d8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\be\u0010f\u0012\u0004\bi\u0010=\u001a\u0004\bg\u0010h¨\u0006m"}, d2 = {"Lcom/vungle/ads/AnalyticsClient;", "", "Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;", "reason", "", "message", "Lcom/vungle/ads/internal/util/LogEntry;", "entry", "Lcom/vungle/ads/internal/protos/Sdk$SDKError$Builder;", "genSDKError", "Lmj/r;", "logErrorInSameThread", "Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;", "metricType", "", "metricValue", "logEntry", "metaData", "Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$Builder;", "genMetric", "logMetricInSameThread", CrashEvent.f44624e, "flushMetrics", "flushErrors", "Lcom/vungle/ads/internal/network/VungleApiClient;", "vungleApiClient", "Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;", "executor", "", "errorLogLevel", "", "metricsEnabled", "initOrUpdate$vungle_ads_release", "(Lcom/vungle/ads/internal/network/VungleApiClient;Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;IZ)V", "initOrUpdate", "logError$vungle_ads_release", "(Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;Ljava/lang/String;Lcom/vungle/ads/internal/util/LogEntry;)V", "logError", "logMetric$vungle_ads_release", "(Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;JLcom/vungle/ads/internal/util/LogEntry;Ljava/lang/String;)V", "logMetric", "Lcom/vungle/ads/SingleValueMetric;", "singleValueMetric", "(Lcom/vungle/ads/SingleValueMetric;Lcom/vungle/ads/internal/util/LogEntry;Ljava/lang/String;)V", "Lcom/vungle/ads/OneShotSingleValueMetric;", "oneShotSingleValueMetric", "(Lcom/vungle/ads/OneShotSingleValueMetric;Lcom/vungle/ads/internal/util/LogEntry;Ljava/lang/String;)V", "Lcom/vungle/ads/TimeIntervalMetric;", "timeIntervalMetric", "(Lcom/vungle/ads/TimeIntervalMetric;Lcom/vungle/ads/internal/util/LogEntry;Ljava/lang/String;)V", "Lcom/vungle/ads/OneShotTimeIntervalMetric;", "oneShotTimeIntervalMetric", "(Lcom/vungle/ads/OneShotTimeIntervalMetric;Lcom/vungle/ads/internal/util/LogEntry;Ljava/lang/String;)V", "TAG", "Ljava/lang/String;", "Ljava/util/concurrent/BlockingQueue;", "errors", "Ljava/util/concurrent/BlockingQueue;", "getErrors$vungle_ads_release", "()Ljava/util/concurrent/BlockingQueue;", "getErrors$vungle_ads_release$annotations", "()V", "metrics", "getMetrics$vungle_ads_release", "getMetrics$vungle_ads_release$annotations", "pendingErrors", "getPendingErrors$vungle_ads_release", "getPendingErrors$vungle_ads_release$annotations", "pendingMetrics", "getPendingMetrics$vungle_ads_release", "getPendingMetrics$vungle_ads_release$annotations", "REFRESH_TIME_MILLIS", "J", "MAX_BATCH_SIZE", "I", "Lcom/vungle/ads/internal/network/VungleApiClient;", "getVungleApiClient$vungle_ads_release", "()Lcom/vungle/ads/internal/network/VungleApiClient;", "setVungleApiClient$vungle_ads_release", "(Lcom/vungle/ads/internal/network/VungleApiClient;)V", "getVungleApiClient$vungle_ads_release$annotations", "Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;", "getExecutor$vungle_ads_release", "()Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;", "setExecutor$vungle_ads_release", "(Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;)V", "getExecutor$vungle_ads_release$annotations", "Z", "getMetricsEnabled$vungle_ads_release", "()Z", "setMetricsEnabled$vungle_ads_release", "(Z)V", "getMetricsEnabled$vungle_ads_release$annotations", "Lcom/vungle/ads/AnalyticsClient$LogLevel;", "logLevel", "Lcom/vungle/ads/AnalyticsClient$LogLevel;", "refreshEnabled", "getRefreshEnabled$vungle_ads_release", "setRefreshEnabled$vungle_ads_release", "getRefreshEnabled$vungle_ads_release$annotations", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isInitialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isInitialized$vungle_ads_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "isInitialized$vungle_ads_release$annotations", "<init>", "LogLevel", "RequestListener", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class AnalyticsClient {
    private static final int MAX_BATCH_SIZE = 20;
    private static final long REFRESH_TIME_MILLIS = 5000;
    private static final String TAG = "AnalyticsClient";
    private static VungleThreadPoolExecutor executor;
    private static boolean metricsEnabled;
    private static VungleApiClient vungleApiClient;
    public static final AnalyticsClient INSTANCE = new AnalyticsClient();
    private static final BlockingQueue<Sdk.SDKError.Builder> errors = new LinkedBlockingQueue();
    private static final BlockingQueue<Sdk.SDKMetric.Builder> metrics = new LinkedBlockingQueue();
    private static final BlockingQueue<Sdk.SDKError.Builder> pendingErrors = new LinkedBlockingQueue();
    private static final BlockingQueue<Sdk.SDKMetric.Builder> pendingMetrics = new LinkedBlockingQueue();
    private static LogLevel logLevel = LogLevel.ERROR_LOG_LEVEL_ERROR;
    private static boolean refreshEnabled = true;
    private static final AtomicBoolean isInitialized = new AtomicBoolean(false);

    /* JADX INFO: compiled from: AnalyticsClient.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/vungle/ads/AnalyticsClient$LogLevel;", "", AppLovinEventTypes.USER_COMPLETED_LEVEL, "", "(Ljava/lang/String;II)V", "getLevel", "()I", "ERROR_LOG_LEVEL_OFF", "ERROR_LOG_LEVEL_ERROR", "ERROR_LOG_LEVEL_DEBUG", VastTagName.COMPANION, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum LogLevel {
        ERROR_LOG_LEVEL_OFF(0),
        ERROR_LOG_LEVEL_ERROR(1),
        ERROR_LOG_LEVEL_DEBUG(2);


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final int level;

        /* JADX INFO: compiled from: AnalyticsClient.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/AnalyticsClient$LogLevel$Companion;", "", "()V", "fromValue", "Lcom/vungle/ads/AnalyticsClient$LogLevel;", "logLevel", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final LogLevel fromValue(int logLevel) {
                LogLevel logLevel2 = LogLevel.ERROR_LOG_LEVEL_DEBUG;
                if (logLevel == logLevel2.getLevel()) {
                    return logLevel2;
                }
                LogLevel logLevel3 = LogLevel.ERROR_LOG_LEVEL_ERROR;
                if (logLevel == logLevel3.getLevel()) {
                    return logLevel3;
                }
                LogLevel logLevel4 = LogLevel.ERROR_LOG_LEVEL_OFF;
                return logLevel == logLevel4.getLevel() ? logLevel4 : logLevel3;
            }
        }

        public final int getLevel() {
            return this.level;
        }

        LogLevel(int i10) {
            this.level = i10;
        }
    }

    /* JADX INFO: compiled from: AnalyticsClient.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/AnalyticsClient$RequestListener;", "", "Lmj/r;", "onSuccess", "onFailure", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public interface RequestListener {
        void onFailure();

        void onSuccess();
    }

    private AnalyticsClient() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getErrors$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getExecutor$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getMetrics$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getMetricsEnabled$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getPendingErrors$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getPendingMetrics$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getRefreshEnabled$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getVungleApiClient$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void isInitialized$vungle_ads_release$annotations() {
    }

    private final synchronized void logErrorInSameThread(final Sdk.SDKError.Reason reason, final String str, LogEntry logEntry) {
        if (logLevel == LogLevel.ERROR_LOG_LEVEL_OFF) {
            return;
        }
        try {
            final Sdk.SDKError.Builder builderGenSDKError = genSDKError(reason, str, logEntry);
            BlockingQueue<Sdk.SDKError.Builder> blockingQueue = errors;
            blockingQueue.put(builderGenSDKError);
            Logger.INSTANCE.w(TAG, new bk.a<String>() { // from class: com.vungle.ads.AnalyticsClient.logErrorInSameThread.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // bk.a
                public final String invoke() {
                    return "Logging error: " + reason + " with message: " + str + ", mediation: " + builderGenSDKError.getMediationName();
                }
            });
            if (blockingQueue.size() >= 20) {
                report();
            }
        } catch (Exception e10) {
            Logger.INSTANCE.e(TAG, "Cannot logError", e10);
        }
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(AnalyticsClient analyticsClient, Sdk.SDKMetric.SDKMetricType sDKMetricType, long j10, LogEntry logEntry, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        analyticsClient.logMetric$vungle_ads_release(sDKMetricType, j10, (i10 & 4) != 0 ? null : logEntry, (i10 & 8) != 0 ? null : str);
    }

    private final synchronized void logMetricInSameThread(final Sdk.SDKMetric.SDKMetricType sDKMetricType, final long j10, final LogEntry logEntry, String str) {
        if (metricsEnabled) {
            try {
                final Sdk.SDKMetric.Builder builderGenMetric = genMetric(sDKMetricType, j10, logEntry, str);
                BlockingQueue<Sdk.SDKMetric.Builder> blockingQueue = metrics;
                blockingQueue.put(builderGenMetric);
                Logger.INSTANCE.w(TAG, new bk.a<String>() { // from class: com.vungle.ads.AnalyticsClient.logMetricInSameThread.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // bk.a
                    public final String invoke() {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Logging Metric ");
                        sb2.append(sDKMetricType);
                        sb2.append(" with value ");
                        sb2.append(j10);
                        sb2.append(" for placement ");
                        LogEntry logEntry2 = logEntry;
                        sb2.append(logEntry2 != null ? logEntry2.getPlacementRefId() : null);
                        sb2.append(" mediation:");
                        sb2.append(builderGenMetric.getMediationName());
                        return sb2.toString();
                    }
                });
                if (blockingQueue.size() >= 20) {
                    report();
                }
            } catch (Exception e10) {
                Logger.INSTANCE.e(TAG, "Cannot logMetrics", e10);
            }
        }
    }

    private final synchronized void report() {
        if (logLevel != LogLevel.ERROR_LOG_LEVEL_OFF && errors.size() > 0) {
            flushErrors();
        }
        if (metricsEnabled && metrics.size() > 0) {
            flushMetrics();
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007a A[Catch: Exception -> 0x0080, all -> 0x00a2, TRY_LEAVE, TryCatch #0 {Exception -> 0x0080, blocks: (B:24:0x0071, B:26:0x007a), top: B:38:0x0071, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008e A[Catch: all -> 0x00a2, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x001f, B:12:0x0041, B:14:0x0049, B:17:0x0054, B:18:0x0058, B:20:0x0061, B:24:0x0071, B:26:0x007a, B:30:0x008a, B:32:0x008e, B:29:0x0081, B:23:0x0068, B:6:0x0025, B:8:0x002e, B:9:0x0034, B:11:0x003c), top: B:40:0x0001, inners: #0, #2 }] */
    public final synchronized void initOrUpdate$vungle_ads_release(VungleApiClient vungleApiClient2, final VungleThreadPoolExecutor executor2, int errorLogLevel, boolean metricsEnabled2) {
        BlockingQueue<Sdk.SDKMetric.Builder> blockingQueue;
        p.j(vungleApiClient2, "vungleApiClient");
        p.j(executor2, "executor");
        logLevel = LogLevel.INSTANCE.fromValue(errorLogLevel);
        metricsEnabled = metricsEnabled2;
        if (errorLogLevel == LogLevel.ERROR_LOG_LEVEL_DEBUG.getLevel()) {
            Logger.INSTANCE.enable(true);
        } else if (errorLogLevel == LogLevel.ERROR_LOG_LEVEL_ERROR.getLevel() || errorLogLevel == LogLevel.ERROR_LOG_LEVEL_OFF.getLevel()) {
            Logger.INSTANCE.enable(false);
        }
        if (isInitialized.getAndSet(true)) {
            Logger.INSTANCE.d(TAG, "AnalyticsClient already initialized");
            return;
        }
        executor = executor2;
        vungleApiClient = vungleApiClient2;
        try {
            BlockingQueue<Sdk.SDKError.Builder> blockingQueue2 = pendingErrors;
            if (!(!blockingQueue2.isEmpty())) {
                blockingQueue = pendingMetrics;
                if (!blockingQueue.isEmpty()) {
                    blockingQueue.drainTo(metrics);
                }
                if (refreshEnabled) {
                    Executors.newSingleThreadScheduledExecutor().scheduleWithFixedDelay(new Runnable() { // from class: com.vungle.ads.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            AnalyticsClient.m3196initOrUpdate$lambda1(executor2);
                        }
                    }, 5000L, 5000L, TimeUnit.MILLISECONDS);
                }
                return;
            }
            blockingQueue2.drainTo(errors);
            try {
                blockingQueue = pendingMetrics;
                if (!blockingQueue.isEmpty()) {
                    blockingQueue.drainTo(metrics);
                }
            } catch (Exception e10) {
                Logger.INSTANCE.e(TAG, "Failed to add pendingMetrics to metrics queue.", e10);
            }
            if (refreshEnabled) {
                Executors.newSingleThreadScheduledExecutor().scheduleWithFixedDelay(new Runnable() { // from class: com.vungle.ads.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnalyticsClient.m3196initOrUpdate$lambda1(executor2);
                    }
                }, 5000L, 5000L, TimeUnit.MILLISECONDS);
            }
            return;
        } catch (Exception e11) {
            Logger.INSTANCE.e(TAG, "Failed to add pendingErrors to errors queue.", e11);
        }
        throw th;
    }

    public final synchronized void logError$vungle_ads_release(final Sdk.SDKError.Reason reason, final String message, final LogEntry entry) {
        try {
            p.j(reason, "reason");
            p.j(message, "message");
            try {
                VungleThreadPoolExecutor vungleThreadPoolExecutor = executor;
                if (vungleThreadPoolExecutor == null) {
                    pendingErrors.put(genSDKError(reason, message, entry));
                } else {
                    if (vungleThreadPoolExecutor != null) {
                        vungleThreadPoolExecutor.execute(new Runnable() { // from class: com.vungle.ads.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                AnalyticsClient.m3198logError$lambda2(reason, message, entry);
                            }
                        });
                    }
                }
            } catch (Exception e10) {
                Logger.INSTANCE.e(TAG, "Cannot logError " + reason + ", " + message + ", " + entry, e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void logMetric$vungle_ads_release(final Sdk.SDKMetric.SDKMetricType metricType, final long metricValue, final LogEntry logEntry, final String metaData) {
        p.j(metricType, "metricType");
        try {
            VungleThreadPoolExecutor vungleThreadPoolExecutor = executor;
            if (vungleThreadPoolExecutor == null) {
                pendingMetrics.put(genMetric(metricType, metricValue, logEntry, metaData));
            } else {
                if (vungleThreadPoolExecutor != null) {
                    vungleThreadPoolExecutor.execute(new Runnable() { // from class: com.vungle.ads.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            AnalyticsClient.m3199logMetric$lambda6(metricType, metricValue, logEntry, metaData);
                        }
                    });
                }
            }
        } catch (Exception e10) {
            Logger.INSTANCE.e(TAG, "Cannot logMetric " + metricType + ", " + metricValue + ", " + logEntry + ", " + metaData, e10);
        }
    }

    @WorkerThread
    private final void flushErrors() {
        VungleApiClient vungleApiClient2;
        Logger.Companion companion = Logger.INSTANCE;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Sending ");
        BlockingQueue<Sdk.SDKError.Builder> blockingQueue = errors;
        sb2.append(blockingQueue.size());
        sb2.append(" errors");
        companion.d(TAG, sb2.toString());
        final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        blockingQueue.drainTo(linkedBlockingQueue);
        if (linkedBlockingQueue.isEmpty() || (vungleApiClient2 = vungleApiClient) == null) {
            return;
        }
        vungleApiClient2.reportErrors(linkedBlockingQueue, new RequestListener() { // from class: com.vungle.ads.AnalyticsClient.flushErrors.1
            @Override // com.vungle.ads.AnalyticsClient.RequestListener
            public void onFailure() {
                Logger.INSTANCE.d(AnalyticsClient.TAG, "Failed to send " + linkedBlockingQueue.size() + " errors");
                AnalyticsClient.INSTANCE.getErrors$vungle_ads_release().addAll(linkedBlockingQueue);
            }

            @Override // com.vungle.ads.AnalyticsClient.RequestListener
            public void onSuccess() {
                Logger.INSTANCE.d(AnalyticsClient.TAG, "Sent " + linkedBlockingQueue.size() + " errors");
            }
        });
    }

    @WorkerThread
    private final void flushMetrics() {
        VungleApiClient vungleApiClient2;
        Logger.Companion companion = Logger.INSTANCE;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Sending ");
        BlockingQueue<Sdk.SDKMetric.Builder> blockingQueue = metrics;
        sb2.append(blockingQueue.size());
        sb2.append(" metrics");
        companion.d(TAG, sb2.toString());
        final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        blockingQueue.drainTo(linkedBlockingQueue);
        if (linkedBlockingQueue.isEmpty() || (vungleApiClient2 = vungleApiClient) == null) {
            return;
        }
        vungleApiClient2.reportMetrics(linkedBlockingQueue, new RequestListener() { // from class: com.vungle.ads.AnalyticsClient.flushMetrics.1
            @Override // com.vungle.ads.AnalyticsClient.RequestListener
            public void onFailure() {
                Logger.INSTANCE.d(AnalyticsClient.TAG, "Failed to send " + linkedBlockingQueue.size() + " metrics");
                AnalyticsClient.INSTANCE.getMetrics$vungle_ads_release().addAll(linkedBlockingQueue);
            }

            @Override // com.vungle.ads.AnalyticsClient.RequestListener
            public void onSuccess() {
                Logger.INSTANCE.d(AnalyticsClient.TAG, "Sent " + linkedBlockingQueue.size() + " metrics");
            }
        });
    }

    public static /* synthetic */ Sdk.SDKMetric.Builder genMetric$default(AnalyticsClient analyticsClient, Sdk.SDKMetric.SDKMetricType sDKMetricType, long j10, LogEntry logEntry, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        return analyticsClient.genMetric(sDKMetricType, j10, (i10 & 4) != 0 ? null : logEntry, (i10 & 8) != 0 ? null : str);
    }

    public static /* synthetic */ Sdk.SDKError.Builder genSDKError$default(AnalyticsClient analyticsClient, Sdk.SDKError.Reason reason, String str, LogEntry logEntry, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            logEntry = null;
        }
        return analyticsClient.genSDKError(reason, str, logEntry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initOrUpdate$lambda-1, reason: not valid java name */
    public static final void m3196initOrUpdate$lambda1(VungleThreadPoolExecutor vungleThreadPoolExecutor) {
        p.j(vungleThreadPoolExecutor, "$executor");
        vungleThreadPoolExecutor.execute(new Runnable() { // from class: com.vungle.ads.c
            @Override // java.lang.Runnable
            public final void run() {
                AnalyticsClient.m3197initOrUpdate$lambda1$lambda0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initOrUpdate$lambda-1$lambda-0, reason: not valid java name */
    public static final void m3197initOrUpdate$lambda1$lambda0() {
        INSTANCE.report();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: logError$lambda-2, reason: not valid java name */
    public static final void m3198logError$lambda2(Sdk.SDKError.Reason reason, String str, LogEntry logEntry) {
        p.j(reason, "$reason");
        p.j(str, "$message");
        INSTANCE.logErrorInSameThread(reason, str, logEntry);
    }

    public static /* synthetic */ void logError$vungle_ads_release$default(AnalyticsClient analyticsClient, Sdk.SDKError.Reason reason, String str, LogEntry logEntry, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            logEntry = null;
        }
        analyticsClient.logError$vungle_ads_release(reason, str, logEntry);
    }

    public static /* synthetic */ void logErrorInSameThread$default(AnalyticsClient analyticsClient, Sdk.SDKError.Reason reason, String str, LogEntry logEntry, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            logEntry = null;
        }
        analyticsClient.logErrorInSameThread(reason, str, logEntry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: logMetric$lambda-6, reason: not valid java name */
    public static final void m3199logMetric$lambda6(Sdk.SDKMetric.SDKMetricType sDKMetricType, long j10, LogEntry logEntry, String str) {
        p.j(sDKMetricType, "$metricType");
        INSTANCE.logMetricInSameThread(sDKMetricType, j10, logEntry, str);
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(AnalyticsClient analyticsClient, SingleValueMetric singleValueMetric, LogEntry logEntry, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            logEntry = null;
        }
        if ((i10 & 4) != 0) {
            str = singleValueMetric.getMeta();
        }
        analyticsClient.logMetric$vungle_ads_release(singleValueMetric, logEntry, str);
    }

    public static /* synthetic */ void logMetricInSameThread$default(AnalyticsClient analyticsClient, Sdk.SDKMetric.SDKMetricType sDKMetricType, long j10, LogEntry logEntry, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        analyticsClient.logMetricInSameThread(sDKMetricType, j10, (i10 & 4) != 0 ? null : logEntry, (i10 & 8) != 0 ? null : str);
    }

    public final BlockingQueue<Sdk.SDKError.Builder> getErrors$vungle_ads_release() {
        return errors;
    }

    public final VungleThreadPoolExecutor getExecutor$vungle_ads_release() {
        return executor;
    }

    public final BlockingQueue<Sdk.SDKMetric.Builder> getMetrics$vungle_ads_release() {
        return metrics;
    }

    public final boolean getMetricsEnabled$vungle_ads_release() {
        return metricsEnabled;
    }

    public final BlockingQueue<Sdk.SDKError.Builder> getPendingErrors$vungle_ads_release() {
        return pendingErrors;
    }

    public final BlockingQueue<Sdk.SDKMetric.Builder> getPendingMetrics$vungle_ads_release() {
        return pendingMetrics;
    }

    public final boolean getRefreshEnabled$vungle_ads_release() {
        return refreshEnabled;
    }

    public final VungleApiClient getVungleApiClient$vungle_ads_release() {
        return vungleApiClient;
    }

    public final AtomicBoolean isInitialized$vungle_ads_release() {
        return isInitialized;
    }

    public final void setExecutor$vungle_ads_release(VungleThreadPoolExecutor vungleThreadPoolExecutor) {
        executor = vungleThreadPoolExecutor;
    }

    public final void setMetricsEnabled$vungle_ads_release(boolean z10) {
        metricsEnabled = z10;
    }

    public final void setRefreshEnabled$vungle_ads_release(boolean z10) {
        refreshEnabled = z10;
    }

    public final void setVungleApiClient$vungle_ads_release(VungleApiClient vungleApiClient2) {
        vungleApiClient = vungleApiClient2;
    }

    private final Sdk.SDKMetric.Builder genMetric(Sdk.SDKMetric.SDKMetricType metricType, long metricValue, LogEntry logEntry, String metaData) {
        String str;
        String placementRefId;
        String creativeId;
        String eventId;
        String headerUa;
        String adSource;
        long j10;
        Boolean adoEnabled;
        Boolean partialDownloadEnabled;
        String vmVersion;
        Sdk.SDKMetric.Builder value = Sdk.SDKMetric.newBuilder().setType(metricType).setValue(metricValue);
        String str2 = Build.MANUFACTURER;
        Sdk.SDKMetric.Builder model = value.setMake(str2).setModel(Build.MODEL);
        if (p.e("Amazon", str2)) {
            str = "amazon";
        } else {
            str = "android";
        }
        Sdk.SDKMetric.Builder osVersion = model.setOs(str).setOsVersion(String.valueOf(Build.VERSION.SDK_INT));
        String str3 = "";
        if (logEntry == null || (placementRefId = logEntry.getPlacementRefId()) == null) {
            placementRefId = "";
        }
        Sdk.SDKMetric.Builder placementReferenceId = osVersion.setPlacementReferenceId(placementRefId);
        if (logEntry == null || (creativeId = logEntry.getCreativeId()) == null) {
            creativeId = "";
        }
        Sdk.SDKMetric.Builder creativeId2 = placementReferenceId.setCreativeId(creativeId);
        if (logEntry == null || (eventId = logEntry.getEventId()) == null) {
            eventId = "";
        }
        Sdk.SDKMetric.Builder eventId2 = creativeId2.setEventId(eventId);
        if (metaData == null) {
            metaData = "";
        }
        Sdk.SDKMetric.Builder meta = eventId2.setMeta(metaData);
        if (logEntry == null || (headerUa = logEntry.getMediationName()) == null) {
            headerUa = VungleHeader.INSTANCE.getHeaderUa();
        }
        Sdk.SDKMetric.Builder mediationName = meta.setMediationName(headerUa);
        if (logEntry == null || (adSource = logEntry.getAdSource()) == null) {
            adSource = "";
        }
        Sdk.SDKMetric.Builder adSource2 = mediationName.setAdSource(adSource);
        if (logEntry != null && (vmVersion = logEntry.getVmVersion()) != null) {
            str3 = vmVersion;
        }
        Sdk.SDKMetric.Builder vmVersion2 = adSource2.setVmVersion(str3);
        if (ActivityManager.INSTANCE.isForeground()) {
            j10 = 0;
        } else {
            j10 = 2;
        }
        Sdk.SDKMetric.Builder appState = vmVersion2.setAppState(j10);
        if (logEntry != null && (partialDownloadEnabled = logEntry.getPartialDownloadEnabled()) != null) {
            appState.setIsPartialDownloadEnabled(partialDownloadEnabled.booleanValue());
        }
        if (logEntry != null && (adoEnabled = logEntry.getAdoEnabled()) != null) {
            appState.setIsAdoEnabled(adoEnabled.booleanValue());
        }
        p.i(appState, "newBuilder()\n           …abled(it) }\n            }");
        return appState;
    }

    private final Sdk.SDKError.Builder genSDKError(Sdk.SDKError.Reason reason, String message, LogEntry entry) {
        String str;
        String placementRefId;
        String creativeId;
        String eventId;
        String adSource;
        String headerUa;
        long j10;
        Boolean adoEnabled;
        Boolean partialDownloadEnabled;
        String vmVersion;
        Sdk.SDKError.Builder builderNewBuilder = Sdk.SDKError.newBuilder();
        String str2 = Build.MANUFACTURER;
        if (p.e("Amazon", str2)) {
            str = "amazon";
        } else {
            str = "android";
        }
        Sdk.SDKError.Builder at = builderNewBuilder.setOs(str).setOsVersion(String.valueOf(Build.VERSION.SDK_INT)).setMake(str2).setModel(Build.MODEL).setReason(reason).setMessage(message).setAt(System.currentTimeMillis());
        String str3 = "";
        if (entry == null || (placementRefId = entry.getPlacementRefId()) == null) {
            placementRefId = "";
        }
        Sdk.SDKError.Builder placementReferenceId = at.setPlacementReferenceId(placementRefId);
        if (entry == null || (creativeId = entry.getCreativeId()) == null) {
            creativeId = "";
        }
        Sdk.SDKError.Builder creativeId2 = placementReferenceId.setCreativeId(creativeId);
        if (entry == null || (eventId = entry.getEventId()) == null) {
            eventId = "";
        }
        Sdk.SDKError.Builder eventId2 = creativeId2.setEventId(eventId);
        if (entry == null || (adSource = entry.getAdSource()) == null) {
            adSource = "";
        }
        Sdk.SDKError.Builder adSource2 = eventId2.setAdSource(adSource);
        if (entry != null && (vmVersion = entry.getVmVersion()) != null) {
            str3 = vmVersion;
        }
        Sdk.SDKError.Builder vmVersion2 = adSource2.setVmVersion(str3);
        if (entry == null || (headerUa = entry.getMediationName()) == null) {
            headerUa = VungleHeader.INSTANCE.getHeaderUa();
        }
        Sdk.SDKError.Builder mediationName = vmVersion2.setMediationName(headerUa);
        if (ActivityManager.INSTANCE.isForeground()) {
            j10 = 0;
        } else {
            j10 = 2;
        }
        Sdk.SDKError.Builder appState = mediationName.setAppState(j10);
        if (entry != null && (partialDownloadEnabled = entry.getPartialDownloadEnabled()) != null) {
            appState.setIsPartialDownloadEnabled(partialDownloadEnabled.booleanValue());
        }
        if (entry != null && (adoEnabled = entry.getAdoEnabled()) != null) {
            appState.setIsAdoEnabled(adoEnabled.booleanValue());
        }
        p.i(appState, "newBuilder()\n           …abled(it) }\n            }");
        return appState;
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(AnalyticsClient analyticsClient, OneShotSingleValueMetric oneShotSingleValueMetric, LogEntry logEntry, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            logEntry = null;
        }
        if ((i10 & 4) != 0) {
            str = oneShotSingleValueMetric.getMeta();
        }
        analyticsClient.logMetric$vungle_ads_release(oneShotSingleValueMetric, logEntry, str);
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(AnalyticsClient analyticsClient, TimeIntervalMetric timeIntervalMetric, LogEntry logEntry, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            logEntry = null;
        }
        if ((i10 & 4) != 0) {
            str = timeIntervalMetric.getMeta();
        }
        analyticsClient.logMetric$vungle_ads_release(timeIntervalMetric, logEntry, str);
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(AnalyticsClient analyticsClient, OneShotTimeIntervalMetric oneShotTimeIntervalMetric, LogEntry logEntry, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            logEntry = null;
        }
        if ((i10 & 4) != 0) {
            str = oneShotTimeIntervalMetric.getMeta();
        }
        analyticsClient.logMetric$vungle_ads_release(oneShotTimeIntervalMetric, logEntry, str);
    }

    public final synchronized void logMetric$vungle_ads_release(SingleValueMetric singleValueMetric, LogEntry logEntry, String metaData) {
        p.j(singleValueMetric, "singleValueMetric");
        logMetric$vungle_ads_release(singleValueMetric.getMetricType(), singleValueMetric.getValue(), logEntry, metaData);
    }

    public final synchronized void logMetric$vungle_ads_release(OneShotSingleValueMetric oneShotSingleValueMetric, LogEntry logEntry, String metaData) {
        p.j(oneShotSingleValueMetric, "oneShotSingleValueMetric");
        if (!oneShotSingleValueMetric.getAlreadyLogged()) {
            logMetric$vungle_ads_release((SingleValueMetric) oneShotSingleValueMetric, logEntry, metaData);
            oneShotSingleValueMetric.markLogged();
        }
    }

    public final synchronized void logMetric$vungle_ads_release(TimeIntervalMetric timeIntervalMetric, LogEntry logEntry, String metaData) {
        p.j(timeIntervalMetric, "timeIntervalMetric");
        logMetric$vungle_ads_release(timeIntervalMetric.getMetricType(), timeIntervalMetric.getValue(), logEntry, metaData);
    }

    public final synchronized void logMetric$vungle_ads_release(OneShotTimeIntervalMetric oneShotTimeIntervalMetric, LogEntry logEntry, String metaData) {
        p.j(oneShotTimeIntervalMetric, "oneShotTimeIntervalMetric");
        if (!oneShotTimeIntervalMetric.getAlreadyLogged()) {
            logMetric$vungle_ads_release((TimeIntervalMetric) oneShotTimeIntervalMetric, logEntry, metaData);
            oneShotTimeIntervalMetric.markLogged();
        }
    }
}
