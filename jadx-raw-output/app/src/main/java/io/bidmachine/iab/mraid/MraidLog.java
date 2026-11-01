package io.bidmachine.iab.mraid;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.iab.utils.LogListener;
import io.bidmachine.iab.utils.Logger;

/* JADX INFO: loaded from: classes11.dex */
public class MraidLog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f59224a = new Logger("MraidLog");

    public static void addLogListener(@Nullable LogListener logListener) {
        f59224a.addLogListener(logListener);
    }

    public static boolean canSendDLog() {
        return f59224a.canSendDLog();
    }

    public static boolean canSendELog() {
        return f59224a.canSendELog();
    }

    public static boolean canSendWLog() {
        return f59224a.canSendWLog();
    }

    public static void d(@NonNull String str, @Nullable String str2, @Nullable Object... objArr) {
        f59224a.d(str, str2, objArr);
    }

    public static void e(@NonNull String str, @Nullable String str2, @Nullable Object... objArr) {
        f59224a.e(str, str2, objArr);
    }

    @Nullable
    public static Logger.LogLevel getLoggingLevel() {
        return f59224a.getLoggingLevel();
    }

    public static boolean removeLogListener(@Nullable LogListener logListener) {
        return f59224a.removeLogListener(logListener);
    }

    public static void setLoggingLevel(@Nullable Logger.LogLevel logLevel) {
        f59224a.setLoggingLevel(logLevel);
    }

    public static void w(@NonNull String str, @Nullable String str2, @Nullable Object... objArr) {
        f59224a.w(str, str2, objArr);
    }

    public static void e(@NonNull String str, @NonNull Throwable th2) {
        f59224a.e(str, th2);
    }
}
