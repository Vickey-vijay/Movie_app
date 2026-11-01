package com.yandex.div.internal;

import androidx.annotation.NonNull;
import com.yandex.div.logging.Severity;

/* JADX INFO: loaded from: classes6.dex */
public class Log {
    private static volatile boolean sEnabled;
    private static volatile Severity sSeverity = Severity.VERBOSE;

    public static void e(@NonNull String str, @NonNull String str2) {
        if (isAtLeast(Severity.ERROR)) {
            android.util.Log.e(str, str2);
        }
    }

    public static void d(@NonNull String str, @NonNull String str2) {
        if (isAtLeast(Severity.DEBUG)) {
            android.util.Log.d(str, str2);
        }
    }

    public static boolean isEnabled() {
        return sEnabled;
    }

    public static void w(@NonNull String str, @NonNull String str2) {
        if (isAtLeast(Severity.WARNING)) {
            android.util.Log.w(str, str2);
        }
    }

    public static void e(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (isAtLeast(Severity.ERROR)) {
            android.util.Log.e(str, str2, th2);
        }
    }

    public static boolean isAtLeast(Severity severity) {
        if (!isEnabled()) {
            return false;
        }
        return sSeverity.isAtLeast(severity);
    }
}
