package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzty implements zzul {

    @GuardedBy("MESSAGE_PARAMS_INSTANCE_POOL")
    private static final ArrayDeque zza = new ArrayDeque();
    private static final Object zzb = new Object();
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf;
    private final zzdq zzg;
    private boolean zzh;

    public zzty(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzdq zzdqVar = new zzdq(zzdn.zza);
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzdqVar;
        this.zzf = new AtomicReference();
    }

    private static zztx zzi() {
        ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new zztx();
            }
            return (zztx) arrayDeque.removeFirst();
        }
    }

    @Nullable
    private static int[] zzj(@Nullable int[] iArr, @Nullable int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    @Nullable
    private static byte[] zzk(@Nullable byte[] bArr, @Nullable byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final void zza() {
        if (this.zzh) {
            return;
        }
        HandlerThread handlerThread = this.zzd;
        handlerThread.start();
        this.zze = new zztw(this, handlerThread.getLooper());
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final void zze() {
        if (this.zzh) {
            try {
                Handler handler = this.zze;
                handler.getClass();
                handler.removeCallbacksAndMessages(null);
                zzdq zzdqVar = this.zzg;
                zzdqVar.zzb();
                Handler handler2 = this.zze;
                handler2.getClass();
                handler2.obtainMessage(3).sendToTarget();
                zzdqVar.zzc();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final void zzf() {
        if (this.zzh) {
            zze();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final void zzg() {
        RuntimeException runtimeException = (RuntimeException) this.zzf.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final /* synthetic */ void zzh(Message message) {
        zztx zztxVar;
        ArrayDeque arrayDeque;
        int i10 = message.what;
        zztx zztxVar2 = null;
        if (i10 != 1) {
            if (i10 == 2) {
                zztxVar = (zztx) message.obj;
                int i11 = zztxVar.zza;
                MediaCodec.CryptoInfo cryptoInfo = zztxVar.zzd;
                long j10 = zztxVar.zze;
                int i12 = zztxVar.zzf;
                try {
                    synchronized (zzb) {
                        this.zzc.queueSecureInputBuffer(i11, 0, cryptoInfo, j10, i12);
                    }
                } catch (RuntimeException e10) {
                    androidx.lifecycle.e.a(this.zzf, null, e10);
                }
            } else if (i10 == 3) {
                this.zzg.zza();
            } else if (i10 != 4) {
                androidx.lifecycle.e.a(this.zzf, null, new IllegalStateException(String.valueOf(message.what)));
            } else {
                try {
                    this.zzc.setParameters((Bundle) message.obj);
                } catch (RuntimeException e11) {
                    androidx.lifecycle.e.a(this.zzf, null, e11);
                }
            }
            if (zztxVar2 != null) {
                arrayDeque = zza;
                synchronized (arrayDeque) {
                    arrayDeque.add(zztxVar2);
                }
            }
        }
        zztxVar = (zztx) message.obj;
        try {
            this.zzc.queueInputBuffer(zztxVar.zza, 0, zztxVar.zzc, zztxVar.zze, zztxVar.zzf);
        } catch (RuntimeException e12) {
            androidx.lifecycle.e.a(this.zzf, null, e12);
        }
        zztxVar2 = zztxVar;
        if (zztxVar2 != null) {
            arrayDeque = zza;
            synchronized (arrayDeque) {
                arrayDeque.add(zztxVar2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final void zzb(int i10, int i11, int i12, long j10, int i13) {
        zzg();
        zztx zztxVarZzi = zzi();
        zztxVarZzi.zza(i10, 0, i12, j10, i13);
        Handler handler = this.zze;
        String str = zzfj.zza;
        handler.obtainMessage(1, zztxVarZzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final void zzc(int i10, int i11, zzie zzieVar, long j10, int i12) {
        zzg();
        zztx zztxVarZzi = zzi();
        zztxVarZzi.zza(i10, 0, 0, j10, i12);
        MediaCodec.CryptoInfo cryptoInfo = zztxVarZzi.zzd;
        cryptoInfo.numSubSamples = zzieVar.zzf;
        cryptoInfo.numBytesOfClearData = zzj(zzieVar.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzj(zzieVar.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] bArrZzk = zzk(zzieVar.zzb, cryptoInfo.key);
        bArrZzk.getClass();
        cryptoInfo.key = bArrZzk;
        byte[] bArrZzk2 = zzk(zzieVar.zza, cryptoInfo.iv);
        bArrZzk2.getClass();
        cryptoInfo.iv = bArrZzk2;
        cryptoInfo.mode = zzieVar.zzc;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(zzieVar.zzg, zzieVar.zzh));
        Handler handler = this.zze;
        String str = zzfj.zza;
        handler.obtainMessage(2, zztxVarZzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final void zzd(Bundle bundle) {
        zzg();
        Handler handler = this.zze;
        String str = zzfj.zza;
        handler.obtainMessage(4, bundle).sendToTarget();
    }
}
