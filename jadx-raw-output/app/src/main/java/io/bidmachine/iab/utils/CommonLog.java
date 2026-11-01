package io.bidmachine.iab.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class CommonLog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f59358a = new Logger("CommonLog");

    public static boolean canSendDLog() {
        return f59358a.canSendDLog();
    }

    public static boolean canSendELog() {
        return f59358a.canSendELog();
    }

    public static boolean canSendWLog() {
        return f59358a.canSendWLog();
    }

    public static void d(@NonNull String str, @Nullable String str2, @Nullable Object... objArr) {
        f59358a.d(str, str2, objArr);
    }

    public static void e(@NonNull String str, @Nullable String str2, @Nullable Object... objArr) {
        f59358a.e(str, str2, objArr);
    }

    public static void setLoggingLevel(@Nullable Logger.LogLevel logLevel) {
        f59358a.setLoggingLevel(logLevel);
    }

    public static void e(@NonNull String str, @NonNull Throwable th2) {
        f59358a.e(str, th2);
    }
}
