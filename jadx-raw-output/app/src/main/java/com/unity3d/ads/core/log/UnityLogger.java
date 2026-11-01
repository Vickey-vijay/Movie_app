package com.unity3d.ads.core.log;

import android.util.Log;
import bk.a;
import ck.i;
import ck.p;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.CreateFile;
import java.io.File;

/* JADX INFO: compiled from: UnityLogger.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class UnityLogger implements Logger {
    public static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "UnityAds";
    private final boolean isForced;
    private LogLevel logLevel;

    /* JADX INFO: compiled from: UnityLogger.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void debug(String str) {
        p.j(str, "message");
        if (canLog(3)) {
            Log.d("UnityAds", str);
        }
    }

    public UnityLogger(SessionRepository sessionRepository, CreateFile createFile) {
        p.j(sessionRepository, "sessionRepository");
        p.j(createFile, "createFile");
        this.logLevel = LogLevel.INFO;
        File fileInvoke = createFile.invoke("/data/local/tmp/UnityAdsForceDebugMode");
        boolean z10 = true;
        try {
            try {
                boolean enableTracing = sessionRepository.getNativeConfiguration().getDebugSettings().getEnableTracing();
                if (fileInvoke.exists() || enableTracing) {
                    setLogLevel(LogLevel.TRACE);
                    debug("Unity logger initialized in TRACE mode");
                }
                if (getLogLevel() != LogLevel.TRACE) {
                }
            } catch (Throwable unused) {
                Log.w("UnityAds", "An issue occurred while initializing the logger");
            }
        } finally {
            this.isForced = getLogLevel() == LogLevel.TRACE;
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void error(String str, Throwable th2) {
        p.j(str, "message");
        if (canLog(6)) {
            Log.e("UnityAds", str, th2);
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    public LogLevel getLogLevel() {
        return this.logLevel;
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void info(String str) {
        p.j(str, "message");
        if (canLog(4)) {
            Log.i("UnityAds", str);
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void trace(String str, Throwable th2) {
        p.j(str, "message");
        if (canLog(2)) {
            Log.v("UnityAds", str, th2);
        }
    }

    private final boolean canLog(int i10) {
        if (i10 >= getLogLevel().toAndroidLogLevel()) {
            return true;
        }
        return false;
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void debug(a<String> aVar) {
        p.j(aVar, "fb");
        if (canLog(3)) {
            debug(aVar.invoke());
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void setLogLevel(LogLevel logLevel) {
        p.j(logLevel, "value");
        if (!this.isForced) {
            this.logLevel = logLevel;
        }
    }
}
