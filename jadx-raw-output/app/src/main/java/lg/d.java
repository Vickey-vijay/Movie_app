package lg;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.ConditionVariable;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.decoder.CryptoInfo;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
/* JADX INFO: loaded from: classes10.dex */
@RequiresApi(23)
public class d implements g {
    private static final int MSG_OPEN_CV = 3;
    private static final int MSG_QUEUE_INPUT_BUFFER = 1;
    private static final int MSG_QUEUE_SECURE_INPUT_BUFFER = 2;
    private static final int MSG_SET_PARAMETERS = 4;
    private final MediaCodec codec;
    private final ConditionVariable conditionVariable;
    private Handler handler;
    private final HandlerThread handlerThread;
    private final AtomicReference<RuntimeException> pendingRuntimeException;
    private boolean started;

    @GuardedBy("MESSAGE_PARAMS_INSTANCE_POOL")
    private static final ArrayDeque<b> MESSAGE_PARAMS_INSTANCE_POOL = new ArrayDeque<>();
    private static final Object QUEUE_SECURE_LOCK = new Object();

    /* JADX INFO: compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            d.this.doHandleMessage(message);
        }
    }

    /* JADX INFO: compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
    public static class b {
        public final MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        public int flags;
        public int index;
        public int offset;
        public long presentationTimeUs;
        public int size;

        public void setQueueParams(int i10, int i11, int i12, long j10, int i13) {
            this.index = i10;
            this.offset = i11;
            this.size = i12;
            this.presentationTimeUs = j10;
            this.flags = i13;
        }
    }

    public d(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new ConditionVariable());
    }

    private static void copy(CryptoInfo cryptoInfo, MediaCodec.CryptoInfo cryptoInfo2) {
        cryptoInfo2.numSubSamples = cryptoInfo.numSubSamples;
        cryptoInfo2.numBytesOfClearData = copy(cryptoInfo.numBytesOfClearData, cryptoInfo2.numBytesOfClearData);
        cryptoInfo2.numBytesOfEncryptedData = copy(cryptoInfo.numBytesOfEncryptedData, cryptoInfo2.numBytesOfEncryptedData);
        cryptoInfo2.key = (byte[]) Assertions.checkNotNull(copy(cryptoInfo.key, cryptoInfo2.key));
        cryptoInfo2.iv = (byte[]) Assertions.checkNotNull(copy(cryptoInfo.iv, cryptoInfo2.iv));
        cryptoInfo2.mode = cryptoInfo.mode;
        if (Util.SDK_INT >= 24) {
            cryptoInfo2.setPattern(new MediaCodec.CryptoInfo.Pattern(cryptoInfo.encryptedBlocks, cryptoInfo.clearBlocks));
        }
    }

    @VisibleForTesting
    public d(MediaCodec mediaCodec, HandlerThread handlerThread, ConditionVariable conditionVariable) {
        this.codec = mediaCodec;
        this.handlerThread = handlerThread;
        this.conditionVariable = conditionVariable;
        this.pendingRuntimeException = new AtomicReference<>();
    }

    private void blockUntilHandlerThreadIsIdle() throws InterruptedException {
        this.conditionVariable.close();
        ((Handler) Assertions.checkNotNull(this.handler)).obtainMessage(3).sendToTarget();
        this.conditionVariable.block();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doHandleMessage(Message message) {
        int i10 = message.what;
        b bVar = null;
        if (i10 == 1) {
            bVar = (b) message.obj;
            doQueueInputBuffer(bVar.index, bVar.offset, bVar.size, bVar.presentationTimeUs, bVar.flags);
        } else if (i10 == 2) {
            bVar = (b) message.obj;
            doQueueSecureInputBuffer(bVar.index, bVar.offset, bVar.cryptoInfo, bVar.presentationTimeUs, bVar.flags);
        } else if (i10 == 3) {
            this.conditionVariable.open();
        } else if (i10 != 4) {
            androidx.lifecycle.e.a(this.pendingRuntimeException, null, new IllegalStateException(String.valueOf(message.what)));
        } else {
            doSetParameters((Bundle) message.obj);
        }
        if (bVar != null) {
            recycleMessageParams(bVar);
        }
    }

    private void doQueueInputBuffer(int i10, int i11, int i12, long j10, int i13) {
        try {
            this.codec.queueInputBuffer(i10, i11, i12, j10, i13);
        } catch (RuntimeException e10) {
            androidx.lifecycle.e.a(this.pendingRuntimeException, null, e10);
        }
    }

    private void doQueueSecureInputBuffer(int i10, int i11, MediaCodec.CryptoInfo cryptoInfo, long j10, int i12) {
        try {
            synchronized (QUEUE_SECURE_LOCK) {
                this.codec.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
            }
        } catch (RuntimeException e10) {
            androidx.lifecycle.e.a(this.pendingRuntimeException, null, e10);
        }
    }

    private void doSetParameters(Bundle bundle) {
        try {
            this.codec.setParameters(bundle);
        } catch (RuntimeException e10) {
            androidx.lifecycle.e.a(this.pendingRuntimeException, null, e10);
        }
    }

    private void flushHandlerThread() throws InterruptedException {
        ((Handler) Assertions.checkNotNull(this.handler)).removeCallbacksAndMessages(null);
        blockUntilHandlerThreadIsIdle();
    }

    private static b getMessageParams() {
        ArrayDeque<b> arrayDeque = MESSAGE_PARAMS_INSTANCE_POOL;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new b();
            }
            return arrayDeque.removeFirst();
        }
    }

    private static void recycleMessageParams(b bVar) {
        ArrayDeque<b> arrayDeque = MESSAGE_PARAMS_INSTANCE_POOL;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    @Override // lg.g
    public void flush() {
        if (this.started) {
            try {
                flushHandlerThread();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // lg.g
    public void maybeThrowException() {
        RuntimeException andSet = this.pendingRuntimeException.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    @VisibleForTesting(otherwise = 5)
    public void setPendingRuntimeException(RuntimeException runtimeException) {
        this.pendingRuntimeException.set(runtimeException);
    }

    @Override // lg.g
    public void shutdown() {
        if (this.started) {
            flush();
            this.handlerThread.quit();
        }
        this.started = false;
    }

    @Override // lg.g
    public void start() {
        if (this.started) {
            return;
        }
        this.handlerThread.start();
        this.handler = new a(this.handlerThread.getLooper());
        this.started = true;
    }

    @Override // lg.g
    public void queueInputBuffer(int i10, int i11, int i12, long j10, int i13) {
        maybeThrowException();
        b messageParams = getMessageParams();
        messageParams.setQueueParams(i10, i11, i12, j10, i13);
        ((Handler) Util.castNonNull(this.handler)).obtainMessage(1, messageParams).sendToTarget();
    }

    @Override // lg.g
    public void queueSecureInputBuffer(int i10, int i11, CryptoInfo cryptoInfo, long j10, int i12) {
        maybeThrowException();
        b messageParams = getMessageParams();
        messageParams.setQueueParams(i10, i11, 0, j10, i12);
        copy(cryptoInfo, messageParams.cryptoInfo);
        ((Handler) Util.castNonNull(this.handler)).obtainMessage(2, messageParams).sendToTarget();
    }

    @Override // lg.g
    public void setParameters(Bundle bundle) {
        maybeThrowException();
        ((Handler) Util.castNonNull(this.handler)).obtainMessage(4, bundle).sendToTarget();
    }

    @Override // lg.g
    public void waitUntilQueueingComplete() throws InterruptedException {
        blockUntilHandlerThreadIsIdle();
    }

    @Nullable
    private static int[] copy(@Nullable int[] iArr, @Nullable int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 != null && iArr2.length >= iArr.length) {
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            return iArr2;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    @Nullable
    private static byte[] copy(@Nullable byte[] bArr, @Nullable byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 != null && bArr2.length >= bArr.length) {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
