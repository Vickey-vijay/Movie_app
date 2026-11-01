package com.google.android.exoplayer2.drm;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Map;
import p3.i;

/* JADX INFO: loaded from: classes8.dex */
public interface DrmSession<T extends i> {
    void acquire();

    @Nullable
    DrmSessionException getError();

    @Nullable
    T getMediaCrypto();

    int getState();

    default boolean playClearSamplesWithoutKeys() {
        return false;
    }

    @Nullable
    Map<String, String> queryKeyStatus();

    void release();

    public static class DrmSessionException extends IOException {
        public DrmSessionException(Throwable th2) {
            super(th2);
        }
    }

    static <T extends i> void a(@Nullable DrmSession<T> drmSession, @Nullable DrmSession<T> drmSession2) {
        if (drmSession == drmSession2) {
            return;
        }
        if (drmSession2 != null) {
            drmSession2.acquire();
        }
        if (drmSession != null) {
            drmSession.release();
        }
    }
}
