package io.bidmachine.iab.vast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.iab.utils.LogListener;
import io.bidmachine.iab.utils.Logger;

/* JADX INFO: loaded from: classes2.dex */
public class VastLog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f59431a = new Logger("VastLog");

    public static void addLogListener(@Nullable LogListener logListener) {
        f59431a.addLogListener(logListener);
    }

    public static boolean canSendDLog() {
        return f59431a.canSendDLog();
    }

    public static boolean canSendELog() {
        return f59431a.canSendELog();
    }

    public static boolean canSendWLog() {
        return f59431a.canSendWLog();
    }

    public static void d(@NonNull String str, @Nullable String str2, @Nullable Object... objArr) {
        f59431a.d(str, str2, objArr);
    }

    public static void e(@NonNull String str, @Nullable String str2, @Nullable Object... objArr) {
        f59431a.e(str, str2, objArr);
    }

    public static boolean removeLogListener(@Nullable LogListener logListener) {
        return f59431a.removeLogListener(logListener);
    }

    public static void setLoggingLevel(@Nullable Logger.LogLevel logLevel) {
        f59431a.setLoggingLevel(logLevel);
    }

    public static void e(@NonNull String str, @NonNull Throwable th2) {
        f59431a.e(str, th2);
    }
}
