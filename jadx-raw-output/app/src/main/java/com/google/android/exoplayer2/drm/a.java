package com.google.android.exoplayer2.drm;

import android.os.Looper;
import androidx.annotation.Nullable;
import p3.i;

/* JADX INFO: compiled from: DrmSessionManager.java */
/* JADX INFO: loaded from: classes6.dex */
public interface a<T extends i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a<i> f19177a = new C0176a();

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DrmSessionManager.java */
    public class C0176a implements a<i> {
        @Override // com.google.android.exoplayer2.drm.a
        public boolean b(DrmInitData drmInitData) {
            return false;
        }

        @Override // com.google.android.exoplayer2.drm.a
        @Nullable
        public Class<i> c(DrmInitData drmInitData) {
            return null;
        }

        @Override // com.google.android.exoplayer2.drm.a
        public DrmSession<i> e(Looper looper, DrmInitData drmInitData) {
            return new b(new DrmSession.DrmSessionException(new UnsupportedDrmException(1)));
        }
    }

    boolean b(DrmInitData drmInitData);

    @Nullable
    Class<? extends i> c(DrmInitData drmInitData);

    @Nullable
    default DrmSession<T> d(Looper looper, int i10) {
        return null;
    }

    DrmSession<T> e(Looper looper, DrmInitData drmInitData);

    default void prepare() {
    }

    default void release() {
    }

    static <T extends i> a<T> a() {
        return (a<T>) f19177a;
    }
}
