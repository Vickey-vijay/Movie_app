package yads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class tj {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ArrayDeque f83063g = new ArrayDeque();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f83064h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f83065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f83066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public rj f83067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f83068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vy f83069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f83070f;

    public tj(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new vy());
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    public final void a(Message message) {
        sj sjVar;
        int i10 = message.what;
        sj sjVar2 = null;
        if (i10 != 0) {
            if (i10 == 1) {
                sjVar = (sj) message.obj;
                int i11 = sjVar.f82662a;
                int i12 = sjVar.f82663b;
                MediaCodec.CryptoInfo cryptoInfo = sjVar.f82665d;
                long j10 = sjVar.f82666e;
                int i13 = sjVar.f82667f;
                try {
                    synchronized (f83064h) {
                        this.f83065a.queueSecureInputBuffer(i11, i12, cryptoInfo, j10, i13);
                    }
                } catch (RuntimeException e10) {
                    androidx.lifecycle.e.a(this.f83068d, null, e10);
                }
            } else if (i10 != 2) {
                androidx.lifecycle.e.a(this.f83068d, null, new IllegalStateException(String.valueOf(message.what)));
            } else {
                this.f83069e.d();
            }
            if (sjVar2 != null) {
                a(sjVar2);
            }
        }
        sjVar = (sj) message.obj;
        try {
            this.f83065a.queueInputBuffer(sjVar.f82662a, sjVar.f82663b, sjVar.f82664c, sjVar.f82666e, sjVar.f82667f);
        } catch (RuntimeException e11) {
            androidx.lifecycle.e.a(this.f83068d, null, e11);
        }
        sjVar2 = sjVar;
        if (sjVar2 != null) {
            a(sjVar2);
        }
    }

    public tj(MediaCodec mediaCodec, HandlerThread handlerThread, vy vyVar) {
        this.f83065a = mediaCodec;
        this.f83066b = handlerThread;
        this.f83069e = vyVar;
        this.f83068d = new AtomicReference();
    }

    public static sj b() {
        ArrayDeque arrayDeque = f83063g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new sj();
            }
            return (sj) arrayDeque.removeFirst();
        }
    }

    public final void a() {
        if (this.f83070f) {
            try {
                rj rjVar = this.f83067c;
                rjVar.getClass();
                rjVar.removeCallbacksAndMessages(null);
                vy vyVar = this.f83069e;
                synchronized (vyVar) {
                    vyVar.f84041a = false;
                }
                rj rjVar2 = this.f83067c;
                rjVar2.getClass();
                rjVar2.obtainMessage(2).sendToTarget();
                this.f83069e.a();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public final void a(int i10, m20 m20Var, long j10) {
        RuntimeException runtimeException = (RuntimeException) this.f83068d.getAndSet(null);
        if (runtimeException == null) {
            sj sjVarB = b();
            sjVarB.f82662a = i10;
            sjVarB.f82663b = 0;
            sjVarB.f82664c = 0;
            sjVarB.f82666e = j10;
            sjVarB.f82667f = 0;
            MediaCodec.CryptoInfo cryptoInfo = sjVarB.f82665d;
            cryptoInfo.numSubSamples = m20Var.f80038f;
            int[] iArr = m20Var.f80036d;
            int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
            if (iArr != null) {
                if (iArrCopyOf != null && iArrCopyOf.length >= iArr.length) {
                    System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
                } else {
                    iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
                }
            }
            cryptoInfo.numBytesOfClearData = iArrCopyOf;
            int[] iArr2 = m20Var.f80037e;
            int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
            if (iArr2 != null) {
                if (iArrCopyOf2 != null && iArrCopyOf2.length >= iArr2.length) {
                    System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
                } else {
                    iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
                }
            }
            cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
            byte[] bArr = m20Var.f80034b;
            byte[] bArrCopyOf = cryptoInfo.key;
            if (bArr != null) {
                if (bArrCopyOf != null && bArrCopyOf.length >= bArr.length) {
                    System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
                } else {
                    bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                }
            }
            bArrCopyOf.getClass();
            cryptoInfo.key = bArrCopyOf;
            byte[] bArr2 = m20Var.f80033a;
            byte[] bArrCopyOf2 = cryptoInfo.iv;
            if (bArr2 != null) {
                if (bArrCopyOf2 != null && bArrCopyOf2.length >= bArr2.length) {
                    System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
                } else {
                    bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
                }
            }
            bArrCopyOf2.getClass();
            cryptoInfo.iv = bArrCopyOf2;
            cryptoInfo.mode = m20Var.f80035c;
            if (ib3.f78556a >= 24) {
                cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(m20Var.f80039g, m20Var.f80040h));
            }
            this.f83067c.obtainMessage(1, sjVarB).sendToTarget();
            return;
        }
        throw runtimeException;
    }

    public static void a(sj sjVar) {
        ArrayDeque arrayDeque = f83063g;
        synchronized (arrayDeque) {
            arrayDeque.add(sjVar);
        }
    }
}
