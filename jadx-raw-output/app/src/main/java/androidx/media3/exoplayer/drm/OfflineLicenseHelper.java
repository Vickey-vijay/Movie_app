package androidx.media3.exoplayer.drm;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSource;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes11.dex */
@UnstableApi
public final class OfflineLicenseHelper {
    private static final Format FORMAT_WITH_EMPTY_DRM_INIT_DATA = new Format.Builder().setDrmInitData(new DrmInitData(new DrmInitData.SchemeData[0])).build();
    private final ConditionVariable drmListenerConditionVariable;
    private final DefaultDrmSessionManager drmSessionManager;
    private final DrmSessionEventListener.EventDispatcher eventDispatcher;
    private final Handler handler;
    private final HandlerThread handlerThread;

    public static OfflineLicenseHelper newWidevineInstance(String str, DataSource.Factory factory, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return newWidevineInstance(str, false, factory, eventDispatcher);
    }

    public synchronized byte[] downloadLicense(Format format) throws DrmSession.DrmSessionException {
        Assertions.checkArgument(format.drmInitData != null);
        return acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(2, null, format);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized Pair<Long, Long> getLicenseDurationRemainingSec(byte[] bArr) throws DrmSession.DrmSessionException {
        Pair<Long, Long> pair;
        Assertions.checkNotNull(bArr);
        try {
            final DrmSession drmSessionAcquireFirstSessionOnHandlerThread = acquireFirstSessionOnHandlerThread(1, bArr, FORMAT_WITH_EMPTY_DRM_INIT_DATA);
            final com.google.common.util.concurrent.d dVarI = com.google.common.util.concurrent.d.I();
            this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.drm.a0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4307b.lambda$getLicenseDurationRemainingSec$0(dVarI, drmSessionAcquireFirstSessionOnHandlerThread);
                }
            });
            try {
                try {
                    pair = (Pair) dVarI.get();
                    releaseManagerOnHandlerThread();
                } catch (Throwable th2) {
                    releaseManagerOnHandlerThread();
                    throw th2;
                }
            } catch (InterruptedException | ExecutionException e10) {
                throw new IllegalStateException(e10);
            }
        } catch (DrmSession.DrmSessionException e11) {
            if (e11.getCause() instanceof KeysExpiredException) {
                return Pair.create(0L, 0L);
            }
            throw e11;
        }
        return pair;
    }

    public synchronized void releaseLicense(byte[] bArr) throws DrmSession.DrmSessionException {
        Assertions.checkNotNull(bArr);
        acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(3, bArr, FORMAT_WITH_EMPTY_DRM_INIT_DATA);
    }

    public synchronized byte[] renewLicense(byte[] bArr) throws DrmSession.DrmSessionException {
        Assertions.checkNotNull(bArr);
        return acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(2, bArr, FORMAT_WITH_EMPTY_DRM_INIT_DATA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DrmSession acquireFirstSessionOnHandlerThread(final int i10, @Nullable final byte[] bArr, final Format format) throws DrmSession.DrmSessionException {
        Assertions.checkNotNull(format.drmInitData);
        final com.google.common.util.concurrent.d dVarI = com.google.common.util.concurrent.d.I();
        this.drmListenerConditionVariable.close();
        this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.drm.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f4340b.lambda$acquireFirstSessionOnHandlerThread$2(i10, bArr, dVarI, format);
            }
        });
        try {
            final DrmSession drmSession = (DrmSession) dVarI.get();
            this.drmListenerConditionVariable.block();
            final com.google.common.util.concurrent.d dVarI2 = com.google.common.util.concurrent.d.I();
            this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.drm.z
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4345b.lambda$acquireFirstSessionOnHandlerThread$3(drmSession, dVarI2);
                }
            });
            try {
                if (dVarI2.get() == 0) {
                    return drmSession;
                }
                throw ((DrmSession.DrmSessionException) dVarI2.get());
            } catch (InterruptedException | ExecutionException e10) {
                throw new IllegalStateException(e10);
            }
        } catch (InterruptedException | ExecutionException e11) {
            throw new IllegalStateException(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$acquireFirstSessionOnHandlerThread$2(int i10, byte[] bArr, com.google.common.util.concurrent.d dVar, Format format) {
        try {
            this.drmSessionManager.setPlayer((Looper) Assertions.checkNotNull(Looper.myLooper()), PlayerId.UNSET);
            this.drmSessionManager.prepare();
            try {
                this.drmSessionManager.setMode(i10, bArr);
                dVar.D((DrmSession) Assertions.checkNotNull(this.drmSessionManager.acquireSession(this.eventDispatcher, format)));
            } catch (Throwable th2) {
                this.drmSessionManager.release();
                throw th2;
            }
        } catch (Throwable th3) {
            dVar.F(th3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releaseManagerOnHandlerThread$4(com.google.common.util.concurrent.d dVar) {
        try {
            this.drmSessionManager.release();
            dVar.D(null);
        } catch (Throwable th2) {
            dVar.F(th2);
        }
    }

    public static OfflineLicenseHelper newWidevineInstance(String str, boolean z10, DataSource.Factory factory, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return newWidevineInstance(str, z10, factory, null, eventDispatcher);
    }

    public void release() {
        this.handlerThread.quit();
    }

    public OfflineLicenseHelper(DefaultDrmSessionManager defaultDrmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        this.drmSessionManager = defaultDrmSessionManager;
        this.eventDispatcher = eventDispatcher;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:OfflineLicenseHelper");
        this.handlerThread = handlerThread;
        handlerThread.start();
        this.handler = new Handler(handlerThread.getLooper());
        this.drmListenerConditionVariable = new ConditionVariable();
        eventDispatcher.addEventListener(new Handler(handlerThread.getLooper()), new DrmSessionEventListener() { // from class: androidx.media3.exoplayer.drm.OfflineLicenseHelper.1
            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void onDrmKeysLoaded(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
                OfflineLicenseHelper.this.drmListenerConditionVariable.open();
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void onDrmKeysRemoved(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
                OfflineLicenseHelper.this.drmListenerConditionVariable.open();
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void onDrmKeysRestored(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
                OfflineLicenseHelper.this.drmListenerConditionVariable.open();
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void onDrmSessionManagerError(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
                OfflineLicenseHelper.this.drmListenerConditionVariable.open();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private byte[] acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(int i10, @Nullable byte[] bArr, Format format) throws DrmSession.DrmSessionException {
        final DrmSession drmSessionAcquireFirstSessionOnHandlerThread = acquireFirstSessionOnHandlerThread(i10, bArr, format);
        final com.google.common.util.concurrent.d dVarI = com.google.common.util.concurrent.d.I();
        this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.drm.c0
            @Override // java.lang.Runnable
            public final void run() {
                this.f4313b.lambda$acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread$1(dVarI, drmSessionAcquireFirstSessionOnHandlerThread);
            }
        });
        try {
            try {
                byte[] bArr2 = (byte[]) Assertions.checkNotNull((byte[]) dVarI.get());
                releaseManagerOnHandlerThread();
                return bArr2;
            } catch (Throwable th2) {
                releaseManagerOnHandlerThread();
                throw th2;
            }
        } catch (InterruptedException | ExecutionException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$acquireFirstSessionOnHandlerThread$3(DrmSession drmSession, com.google.common.util.concurrent.d dVar) {
        try {
            DrmSession.DrmSessionException error = drmSession.getError();
            if (drmSession.getState() == 1) {
                drmSession.release(this.eventDispatcher);
                this.drmSessionManager.release();
            }
            dVar.D(error);
        } catch (Throwable th2) {
            dVar.F(th2);
            drmSession.release(this.eventDispatcher);
            this.drmSessionManager.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread$1(com.google.common.util.concurrent.d dVar, DrmSession drmSession) {
        try {
            dVar.D(drmSession.getOfflineLicenseKeySetId());
        } catch (Throwable th2) {
            try {
                dVar.F(th2);
            } finally {
                drmSession.release(this.eventDispatcher);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getLicenseDurationRemainingSec$0(com.google.common.util.concurrent.d dVar, DrmSession drmSession) {
        try {
            dVar.D((Pair) Assertions.checkNotNull(WidevineUtil.getLicenseDurationRemainingSec(drmSession)));
        } catch (Throwable th2) {
            try {
                dVar.F(th2);
            } finally {
                drmSession.release(this.eventDispatcher);
            }
        }
    }

    public static OfflineLicenseHelper newWidevineInstance(String str, boolean z10, DataSource.Factory factory, @Nullable Map<String, String> map, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return new OfflineLicenseHelper(new DefaultDrmSessionManager.Builder().setKeyRequestParameters(map).build(new HttpMediaDrmCallback(str, z10, factory)), eventDispatcher);
    }

    private void releaseManagerOnHandlerThread() {
        final com.google.common.util.concurrent.d dVarI = com.google.common.util.concurrent.d.I();
        this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.drm.b0
            @Override // java.lang.Runnable
            public final void run() {
                this.f4311b.lambda$releaseManagerOnHandlerThread$4(dVarI);
            }
        });
        try {
            dVarI.get();
        } catch (InterruptedException | ExecutionException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
