package io.bidmachine.media3.exoplayer.drm;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.decoder.CryptoConfig;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
@UnstableApi
public final class ErrorStateDrmSession implements DrmSession {
    private final DrmSession.DrmSessionException error;

    @Override // io.bidmachine.media3.exoplayer.drm.DrmSession
    public void acquire(@Nullable DrmSessionEventListener.EventDispatcher eventDispatcher) {
    }

    @Override // io.bidmachine.media3.exoplayer.drm.DrmSession
    @Nullable
    public CryptoConfig getCryptoConfig() {
        return null;
    }

    @Override // io.bidmachine.media3.exoplayer.drm.DrmSession
    @Nullable
    public byte[] getOfflineLicenseKeySetId() {
        return null;
    }

    @Override // io.bidmachine.media3.exoplayer.drm.DrmSession
    public int getState() {
        return 1;
    }

    @Override // io.bidmachine.media3.exoplayer.drm.DrmSession
    public boolean playClearSamplesWithoutKeys() {
        return false;
    }

    @Override // io.bidmachine.media3.exoplayer.drm.DrmSession
    @Nullable
    public Map<String, String> queryKeyStatus() {
        return null;
    }

    @Override // io.bidmachine.media3.exoplayer.drm.DrmSession
    public void release(@Nullable DrmSessionEventListener.EventDispatcher eventDispatcher) {
    }

    @Override // io.bidmachine.media3.exoplayer.drm.DrmSession
    public boolean requiresSecureDecoder(String str) {
        return false;
    }

    @Override // io.bidmachine.media3.exoplayer.drm.DrmSession
    @Nullable
    public DrmSession.DrmSessionException getError() {
        return this.error;
    }

    @Override // io.bidmachine.media3.exoplayer.drm.DrmSession
    public final UUID getSchemeUuid() {
        return C.UUID_NIL;
    }

    public ErrorStateDrmSession(DrmSession.DrmSessionException drmSessionException) {
        this.error = (DrmSession.DrmSessionException) Assertions.checkNotNull(drmSessionException);
    }
}
