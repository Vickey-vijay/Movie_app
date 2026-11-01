package io.appmetrica.analytics.coreutils.internal.logger;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public abstract class LoggerStorage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HashMap f54733a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f54734b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile PublicLogger f54735c = PublicLogger.getAnonymousInstance();

    @NonNull
    public static PublicLogger getMainPublicOrAnonymousLogger() {
        return f54735c;
    }

    @VisibleForTesting(otherwise = 5)
    public static void unsetPublicLoggers() {
        f54733a = new HashMap();
        f54735c = PublicLogger.getAnonymousInstance();
    }

    @NonNull
    public static PublicLogger getOrCreateMainPublicLogger(@NonNull String str) {
        f54735c = getOrCreatePublicLogger(str);
        return f54735c;
    }

    @NonNull
    public static PublicLogger getOrCreatePublicLogger(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return PublicLogger.getAnonymousInstance();
        }
        PublicLogger publicLogger = (PublicLogger) f54733a.get(str);
        if (publicLogger == null) {
            synchronized (f54734b) {
                publicLogger = (PublicLogger) f54733a.get(str);
                if (publicLogger == null) {
                    publicLogger = new PublicLogger(ApiKeyUtils.createPartialApiKey(str));
                    f54733a.put(str, publicLogger);
                }
            }
        }
        return publicLogger;
    }
}
