package com.inmobi.media.core.config.models;

import androidx.annotation.Keep;
import ck.p;
import com.inmobi.media.C2773c6;
import com.inmobi.media.H6;
import com.inmobi.media.Q4;
import com.inmobi.media.Qe;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class CrashConfig extends Config {
    public static final Q4 Companion = new Q4();
    public static final long DEFAULT_ANR_WATCHDOG_INTERVAL = 4500;
    public static final long DEFAULT_APP_EXIT_REASON_WAIT_INTERVAL = 1000;
    public static final double DEFAULT_APP_EXIT_SAMPLING_PERCENT = 0.0d;
    public static final boolean DEFAULT_CATCH_ENABLED = false;
    public static final double DEFAULT_CATCH_SAMPLING_PERCENT = 0.0d;
    public static final boolean DEFAULT_CRASH_ENABLED = true;
    public static final double DEFAULT_CRASH_SAMPLING_PERCENT = 1.0d;
    public static final long DEFAULT_EVENT_TTL_SEC = 259200;
    public static final long DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL = 30000;
    public static final long DEFAULT_INGESTION_LATENCY_SEC = 86400;
    public static final int DEFAULT_MAX_BATCH_SIZE = 2;
    public static final int DEFAULT_MAX_EVENTS_TO_PERSIST = 50;
    public static final int DEFAULT_MAX_NO_OF_LINES = 200;
    public static final int DEFAULT_MAX_RETRIES = 3;
    public static final int DEFAULT_MIN_BATCH_SIZE = 1;
    public static final long DEFAULT_PROCESSING_INTERVAL_SEC = 60;
    public static final long DEFAULT_RETRY_INTERVAL_SEC = 10;
    public static final String DEFAULT_URL = "https://crash-metrics.sdk.inmobi.com/trace";
    public static final double DEFAULT_WATCHDOG_SAMPLING_PERCENT = 0.0d;
    private String url = DEFAULT_URL;
    private long processingInterval = 60;
    private int maxRetryCount = 3;
    private int maxEventsToPersist = 50;
    private long eventTTL = DEFAULT_EVENT_TTL_SEC;
    private long txLatency = 86400;
    private Qe networkType = new Qe();
    private ANRConfig anr = new ANRConfig();
    private CrashIncidentConfig crashConfig = new CrashIncidentConfig();
    private CatchConfig catchConfig = new CatchConfig();

    @Keep
    public static final class ANRConfig {
        private AppExitReasonConfig appExitReason = new AppExitReasonConfig();
        private WatchDogConfig watchdog = new WatchDogConfig();

        public final AppExitReasonConfig getAppExitReason() {
            return this.appExitReason;
        }

        public final WatchDogConfig getWatchdog() {
            return this.watchdog;
        }
    }

    @Keep
    public static final class AppExitReasonConfig {
        private boolean enabled;
        private long incidentWaitInterval = 1000;
        private long incompleteLogThresholdTime = 30000;
        private int maxNumberOfLines = 200;
        private boolean reportToLogs;
        private double samplingPercent;
        private boolean useForReporting;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final long getIncidentWaitInterval() {
            return this.incidentWaitInterval;
        }

        public final long getIncompleteLogThresholdTime() {
            return this.incompleteLogThresholdTime;
        }

        public final int getMaxNumberOfLines() {
            return this.maxNumberOfLines;
        }

        public final boolean getReportToLogs() {
            return this.reportToLogs;
        }

        public final double getSamplingPercent() {
            return this.samplingPercent;
        }

        public final boolean getUseForReporting() {
            return this.useForReporting;
        }
    }

    @Keep
    public static final class CatchConfig {
        private boolean enabled;
        private double samplingPercent;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final double getSamplingPercent() {
            return this.samplingPercent;
        }
    }

    @Keep
    public static final class CrashIncidentConfig {
        private boolean reportOOMInfo;
        private boolean reportSessionInfo;
        private boolean enabled = true;
        private double samplingPercent = 1.0d;
        private int maxLengthOfStackTrace = Integer.MAX_VALUE;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final int getMaxLengthOfStackTrace() {
            return this.maxLengthOfStackTrace;
        }

        public final boolean getReportOOMInfo() {
            return this.reportOOMInfo;
        }

        public final boolean getReportSessionInfo() {
            return this.reportSessionInfo;
        }

        public final double getSamplingPercent() {
            return this.samplingPercent;
        }
    }

    @Keep
    public static final class WatchDogConfig {
        private boolean enabled;
        private long interval = CrashConfig.DEFAULT_ANR_WATCHDOG_INTERVAL;
        private double samplingPercent;
        private boolean useForReporting;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final long getInterval() {
            return this.interval;
        }

        public final double getSamplingPercent() {
            return this.samplingPercent;
        }

        public final boolean getUseForReporting() {
            return this.useForReporting;
        }
    }

    @Override // com.inmobi.media.core.config.models.Config
    public String getType() {
        return "crashReporting";
    }

    private final void setDefaultNetworkConfig() {
        Qe qe2 = this.networkType;
        Qe.a aVar = new Qe.a();
        aVar.a(10L);
        aVar.c(1);
        aVar.b(2);
        qe2.getClass();
        p.j(aVar, "<set-?>");
        qe2.wifi = aVar;
        Qe qe3 = this.networkType;
        Qe.a aVar2 = new Qe.a();
        aVar2.a(10L);
        aVar2.c(1);
        aVar2.b(2);
        qe3.getClass();
        p.j(aVar2, "<set-?>");
        qe3.others = aVar2;
    }

    public final ANRConfig getANRConfig() {
        return this.anr;
    }

    public final CatchConfig getCatchConfig() {
        return this.catchConfig;
    }

    public final CrashIncidentConfig getCrashConfig() {
        return this.crashConfig;
    }

    public final C2773c6 getEventConfig() {
        return new C2773c6(this.maxRetryCount, this.eventTTL, this.processingInterval, this.txLatency, getWifiConfig().b(), getWifiConfig().a(), getMobileConfig().b(), getMobileConfig().a(), getWifiConfig().c(), getMobileConfig().c());
    }

    public final long getEventTTL() {
        return this.eventTTL;
    }

    public final int getMaxEventsToPersist() {
        return this.maxEventsToPersist;
    }

    public final Qe.a getMobileConfig() {
        Qe.a aVar = this.networkType.others;
        if (aVar != null) {
            return aVar;
        }
        p.B("others");
        return null;
    }

    public final String getUrl() {
        return this.url;
    }

    public final Qe.a getWifiConfig() {
        Qe.a aVar = this.networkType.wifi;
        if (aVar != null) {
            return aVar;
        }
        p.B("wifi");
        return null;
    }

    @Override // com.inmobi.media.core.config.models.Config
    public boolean isValid() {
        if (H6.a(this.url)) {
            return false;
        }
        long j10 = this.txLatency;
        if (j10 >= this.processingInterval && j10 <= this.eventTTL) {
            Qe qe2 = this.networkType;
            int i10 = this.maxEventsToPersist;
            Qe.a aVar = qe2.wifi;
            Qe.a aVar2 = null;
            if (aVar == null) {
                p.B("wifi");
                aVar = null;
            }
            if (aVar.a(i10)) {
                Qe.a aVar3 = qe2.others;
                if (aVar3 != null) {
                    aVar2 = aVar3;
                } else {
                    p.B("others");
                }
                if (aVar2.a(i10) && this.processingInterval > 0 && this.maxRetryCount >= 0 && this.txLatency > 0 && this.eventTTL > 0 && this.maxEventsToPersist > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public CrashConfig() {
        setDefaultNetworkConfig();
    }
}
