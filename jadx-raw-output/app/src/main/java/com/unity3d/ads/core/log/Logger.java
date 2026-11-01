package com.unity3d.ads.core.log;

import bk.a;

/* JADX INFO: compiled from: Logger.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface Logger {

    /* JADX INFO: compiled from: Logger.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ void error$default(Logger logger, String str, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
            }
            if ((i10 & 2) != 0) {
                th2 = null;
            }
            logger.error(str, th2);
        }

        public static /* synthetic */ void trace$default(Logger logger, String str, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trace");
            }
            if ((i10 & 2) != 0) {
                th2 = null;
            }
            logger.trace(str, th2);
        }
    }

    void debug(a<String> aVar);

    void debug(String str);

    void error(String str, Throwable th2);

    LogLevel getLogLevel();

    void info(String str);

    void setLogLevel(LogLevel logLevel);

    void trace(String str, Throwable th2);
}
