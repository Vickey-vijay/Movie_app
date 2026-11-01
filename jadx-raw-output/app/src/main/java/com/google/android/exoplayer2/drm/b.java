package com.google.android.exoplayer2.drm;

import androidx.annotation.Nullable;
import java.util.Map;
import p3.i;

/* JADX INFO: compiled from: ErrorStateDrmSession.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b<T extends i> implements DrmSession<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DrmSession.DrmSessionException f19178a;

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void acquire() {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    public T getMediaCrypto() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public int getState() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean playClearSamplesWithoutKeys() {
        return false;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    public Map<String, String> queryKeyStatus() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void release() {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    public DrmSession.DrmSessionException getError() {
        return this.f19178a;
    }

    public b(DrmSession.DrmSessionException drmSessionException) {
        this.f19178a = (DrmSession.DrmSessionException) g5.a.e(drmSessionException);
    }
}
