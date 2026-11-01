package io.bidmachine.core;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.utils.lazy.LazyValue;
import io.bidmachine.utils.log.DefaultLoggerInstance;
import io.bidmachine.utils.log.EmptyLoggerInstance;
import io.bidmachine.utils.log.LoggerInstance;

/* JADX INFO: loaded from: classes9.dex */
public class Logger {
    private static boolean isLoggingEnabled;

    @NonNull
    private static volatile LoggerInstance enabledInstance = new DefaultLoggerInstance("BidMachineLog");

    @NonNull
    private static volatile LoggerInstance disabledInstance = new EmptyLoggerInstance();

    @NonNull
    @VisibleForTesting
    public static volatile LoggerInstance instance = disabledInstance;

    public static void d(@NonNull Object obj, @NonNull String str) {
        instance.d(obj, str);
    }

    public static void e(@NonNull Object obj, @NonNull String str) {
        instance.e(obj, str);
    }

    public static void w(@NonNull Object obj, @NonNull String str) {
        instance.w(obj, str);
    }

    public static void d(@NonNull String str) {
        instance.d(str);
    }

    public static void e(@NonNull String str) {
        instance.e(str);
    }

    public static boolean isLoggingEnabled() {
        return isLoggingEnabled;
    }

    public static void setDisabledInstance(@NonNull LoggerInstance loggerInstance) {
        disabledInstance = loggerInstance;
        setLoggingEnabled(isLoggingEnabled);
    }

    public static void setEnabledInstance(@NonNull LoggerInstance loggerInstance) {
        enabledInstance = loggerInstance;
        setLoggingEnabled(isLoggingEnabled);
    }

    public static void setLoggingEnabled(boolean z10) {
        isLoggingEnabled = z10;
        instance = z10 ? enabledInstance : disabledInstance;
    }

    public static void w(@NonNull String str) {
        instance.w(str);
    }

    public static void d(@NonNull Object obj, @NonNull LazyValue<String> lazyValue) {
        instance.d(obj, lazyValue);
    }

    public static void e(@NonNull Object obj, @NonNull LazyValue<String> lazyValue) {
        instance.e(obj, lazyValue);
    }

    public static void w(@NonNull Throwable th2) {
        instance.w(th2);
    }

    public static void d(@NonNull LazyValue<String> lazyValue) {
        instance.d(lazyValue);
    }

    public static void e(@NonNull LazyValue<String> lazyValue) {
        instance.e(lazyValue);
    }
}
