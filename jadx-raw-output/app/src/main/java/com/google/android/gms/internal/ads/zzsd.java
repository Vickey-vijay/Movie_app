package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzsd implements zzqc {
    private static final Object zza = new Object();

    @Nullable
    @GuardedBy("releaseExecutorLock")
    private static ScheduledExecutorService zzb;

    @GuardedBy("releaseExecutorLock")
    private static int zzc;
    private final AudioTrack zzd;
    private final zzql zze;

    @Nullable
    private zzru zzf;
    private final zzsk zzg;
    private final boolean zzh;
    private final int zzi;

    @Nullable
    private final zzsc zzj;
    private final zzed zzk;
    private boolean zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;

    @Nullable
    private final zzsh zzr;

    public static /* synthetic */ void zzp(AudioTrack audioTrack, Handler handler, final zzed zzedVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzro
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzrm zzrmVar = zzrm.zza;
                        zzed zzedVar2 = zzedVar;
                        zzedVar2.zzd(-1, zzrmVar);
                        zzedVar2.zze();
                    }
                });
            }
            synchronized (zza) {
                int i10 = zzc - 1;
                zzc = i10;
                if (i10 == 0) {
                    ScheduledExecutorService scheduledExecutorService = zzb;
                    scheduledExecutorService.getClass();
                    scheduledExecutorService.shutdown();
                    zzb = null;
                }
            }
        } catch (Throwable th2) {
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrp
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzrm zzrmVar = zzrm.zza;
                        zzed zzedVar2 = zzedVar;
                        zzedVar2.zzd(-1, zzrmVar);
                        zzedVar2.zze();
                    }
                });
            }
            synchronized (zza) {
                int i11 = zzc - 1;
                zzc = i11;
                if (i11 == 0) {
                    ScheduledExecutorService scheduledExecutorService2 = zzb;
                    scheduledExecutorService2.getClass();
                    scheduledExecutorService2.shutdown();
                    zzb = null;
                }
                throw th2;
            }
        }
    }

    public final /* synthetic */ AudioTrack zzr() {
        return this.zzd;
    }

    public final /* synthetic */ zzed zzs() {
        return this.zzk;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzt, reason: merged with bridge method [inline-methods] */
    public final long zzq() {
        if (!this.zzh) {
            return this.zzn;
        }
        long j10 = this.zzm;
        int i10 = this.zzi;
        String str = zzfj.zza;
        long j11 = i10;
        return ((j10 + j11) - 1) / j11;
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zza() {
        this.zzg.zzb();
        if (!this.zzl || zzg()) {
            this.zzd.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzb() {
        this.zzg.zzf();
        if (!this.zzl || zzg()) {
            this.zzd.pause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final boolean zzc(ByteBuffer byteBuffer, int i10, long j10) throws zzqb {
        zzsh zzshVar;
        boolean z10 = this.zzh;
        if (!z10 && this.zzo == 0) {
            this.zzo = zzsw.zzD(this.zze.zza, byteBuffer);
        }
        zzq();
        int underrunCount = this.zzd.getUnderrunCount();
        int i11 = this.zzp;
        this.zzp = underrunCount;
        if (underrunCount > i11) {
            zzed zzedVar = this.zzk;
            zzedVar.zzd(-1, new zzdy() { // from class: com.google.android.gms.internal.ads.zzrn
                @Override // com.google.android.gms.internal.ads.zzdy
                public final /* synthetic */ void zza(Object obj) {
                    ((zzqa) obj).zzd();
                }
            });
            zzedVar.zze();
        }
        int iRemaining = byteBuffer.remaining();
        boolean z11 = true;
        int iWrite = this.zzd.write(byteBuffer, byteBuffer.remaining(), 1);
        if (iWrite >= 0) {
            z11 = iWrite == iRemaining;
            if (z10) {
                this.zzm += (long) iWrite;
            } else if (z11) {
                this.zzn += ((long) this.zzo) * ((long) i10);
            }
            return z11;
        }
        if (iWrite != -6 && iWrite != -32) {
            z11 = false;
        }
        if (z11 && (zzshVar = this.zzr) != null) {
            zzsi zzsiVar = zzshVar.zza;
            if (zzsiVar.zzi() != null) {
                zzps zzpsVar = zzps.zza;
                zzsiVar.zzh(zzpsVar);
                zzsiVar.zzi().zza(zzpsVar);
            }
        }
        throw new zzqb(iWrite, z11);
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzd() {
        if (this.zzl) {
            return;
        }
        this.zzl = true;
        this.zzg.zze(zzq());
        this.zzd.stop();
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zze() {
        if (this.zzg.zzc()) {
            this.zzd.pause();
        }
        if (Build.VERSION.SDK_INT >= 29 && zzg()) {
            zzsc zzscVar = this.zzj;
            zzscVar.getClass();
            zzscVar.zza();
        }
        zzru zzruVar = this.zzf;
        if (zzruVar != null) {
            zzruVar.zzd();
            this.zzf = null;
        }
        final AudioTrack audioTrack = this.zzd;
        final zzed zzedVar = this.zzk;
        final Handler handlerZzc = zzfj.zzc(null);
        synchronized (zza) {
            if (zzb == null) {
                zzb = zzfj.zzg("ExoPlayer:AudioTrackReleaseThread");
            }
            zzc++;
            zzb.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzsd.zzp(audioTrack, handlerZzc, zzedVar);
                }
            }, 20L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzf(float f10) {
        this.zzd.setVolume(f10);
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final boolean zzg() {
        return Build.VERSION.SDK_INT >= 29 && this.zzd.isOffloadedPlayback();
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final int zzh() {
        return this.zzd.getAudioSessionId();
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final int zzi() {
        return this.zzd.getSampleRate();
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final long zzj() {
        return this.zzd.getBufferSizeInFrames();
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final long zzk() {
        return this.zzg.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final boolean zzl() {
        return this.zzg.zzd(zzq());
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzm(zzqa zzqaVar) {
        this.zzk.zzb(zzqaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzn(zzpq zzpqVar) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        LogSessionId logSessionIdZza = zzpqVar.zza();
        if (logSessionIdZza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        this.zzd.setLogSessionId(logSessionIdZza);
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzo(@Nullable AudioDeviceInfo audioDeviceInfo) {
        this.zzd.setPreferredDevice(audioDeviceInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zzsd(AudioTrack audioTrack, zzql zzqlVar, @Nullable zzsh zzshVar, zzdn zzdnVar) {
        this.zzd = audioTrack;
        this.zze = zzqlVar;
        this.zzr = zzshVar;
        zzed zzedVar = new zzed(Thread.currentThread());
        this.zzk = zzedVar;
        zzedVar.zzg(false);
        boolean zZzA = zzfj.zzA(zzqlVar.zza);
        this.zzh = zZzA;
        if (zZzA) {
            this.zzi = zzfj.zzD(zzqlVar.zza) * Integer.bitCount(zzqlVar.zzc);
        } else {
            this.zzi = -1;
        }
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        this.zzg = new zzsk(new zzrw(this, null), zzdnVar, audioTrack, zzqlVar.zza, this.zzi, zzqlVar.zze);
        if (zzshVar != null) {
            this.zzf = new zzru(audioTrack, zzshVar, objArr2 == true ? 1 : 0);
        }
        this.zzj = zzg() ? new zzsc(this, objArr == true ? 1 : 0) : null;
    }
}
