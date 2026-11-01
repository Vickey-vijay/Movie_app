package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Build;
import androidx.annotation.Nullable;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzsk {
    private boolean zzA;
    private long zzB;
    private final zzsj zza;
    private final zzdn zzb;
    private final long[] zzc;
    private final AudioTrack zzd;
    private final int zze;
    private final long zzf;
    private final boolean zzg;
    private final zzrl zzh;
    private float zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    @Nullable
    private Method zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private int zzs;
    private int zzt;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    private final void zzi() {
        this.zzk = 0L;
        this.zzt = 0;
        this.zzs = 0;
        this.zzl = 0L;
        this.zzy = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
    }

    private final void zzg(long j10) {
        long j11 = this.zzj;
        if (j11 == -9223372036854775807L || j10 < j11) {
            return;
        }
        long jZzw = zzfj.zzw(j10 - j11, this.zzi);
        zzdn zzdnVar = this.zzb;
        long jZza = zzdnVar.zza() - zzfj.zzp(jZzw);
        this.zzj = -9223372036854775807L;
        this.zza.zzb(jZza);
    }

    private final long zzh(long j10) {
        long jZzv;
        if (this.zzt == 0) {
            jZzv = this.zzu != -9223372036854775807L ? zzfj.zzr(zzl(), this.zze) : zzj();
        } else {
            jZzv = zzfj.zzv(j10 + this.zzk, this.zzi);
        }
        long jMax = Math.max(0L, jZzv - this.zzn);
        return this.zzu != -9223372036854775807L ? Math.min(zzfj.zzr(this.zzx, this.zze), jMax) : jMax;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    private final long zzk() {
        if (this.zzu != -9223372036854775807L) {
            return Math.min(this.zzx, zzl());
        }
        long jZzb = this.zzb.zzb();
        if (jZzb - this.zzp >= 5) {
            AudioTrack audioTrack = this.zzd;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
                if (Build.VERSION.SDK_INT > 29) {
                    if (this.zzq > playbackHeadPosition) {
                        this.zzr++;
                    }
                    this.zzq = playbackHeadPosition;
                } else if (playbackHeadPosition != 0 || this.zzq <= 0 || playState != 3) {
                    this.zzv = -9223372036854775807L;
                    if (this.zzq > playbackHeadPosition) {
                        this.zzr++;
                    }
                    this.zzq = playbackHeadPosition;
                } else if (this.zzv == -9223372036854775807L) {
                    this.zzv = jZzb;
                }
            }
            this.zzp = jZzb;
        }
        return this.zzq + this.zzB + (this.zzr << 32);
    }

    private final long zzl() {
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.zzw;
        }
        return this.zzw + zzfj.zzs(zzfj.zzv(zzfj.zzq(this.zzb.zzb()) - this.zzu, this.zzi), this.zze);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009d A[Catch: Exception -> 0x00a5, TRY_LEAVE, TryCatch #0 {Exception -> 0x00a5, blocks: (B:22:0x0079, B:24:0x009d), top: B:52:0x0079 }] */
    public final long zza() {
        Method method;
        long jMax;
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            long jZzc = this.zzb.zzc() / 1000;
            if (jZzc - this.zzl >= 30000) {
                long jZzj = zzj();
                if (jZzj != 0) {
                    long[] jArr = this.zzc;
                    jArr[this.zzs] = zzfj.zzw(jZzj, this.zzi) - jZzc;
                    this.zzs = (this.zzs + 1) % 10;
                    int i10 = this.zzt;
                    if (i10 < 10) {
                        this.zzt = i10 + 1;
                    }
                    this.zzl = jZzc;
                    this.zzk = 0L;
                    int i11 = 0;
                    while (true) {
                        int i12 = this.zzt;
                        if (i11 >= i12) {
                            break;
                        }
                        this.zzk += jArr[i11] / ((long) i12);
                        i11++;
                    }
                    if (this.zzg && (method = this.zzm) != null && jZzc - this.zzo >= 500000) {
                        try {
                            Integer num = (Integer) method.invoke(audioTrack, new Object[0]);
                            String str = zzfj.zza;
                            long jIntValue = (((long) num.intValue()) * 1000) - this.zzf;
                            this.zzn = jIntValue;
                            jMax = Math.max(jIntValue, 0L);
                            this.zzn = jMax;
                            if (jMax > 5000000) {
                                this.zza.zza(jMax);
                                this.zzn = 0L;
                            }
                        } catch (Exception unused) {
                            this.zzm = null;
                        }
                        this.zzo = jZzc;
                    }
                    this.zzh.zza(jZzc, this.zzi, zzh(jZzc));
                }
            } else {
                if (this.zzg) {
                    Integer num2 = (Integer) method.invoke(audioTrack, new Object[0]);
                    String str2 = zzfj.zza;
                    long jIntValue2 = (((long) num2.intValue()) * 1000) - this.zzf;
                    this.zzn = jIntValue2;
                    jMax = Math.max(jIntValue2, 0L);
                    this.zzn = jMax;
                    if (jMax > 5000000) {
                        this.zza.zza(jMax);
                        this.zzn = 0L;
                    }
                    this.zzo = jZzc;
                }
                this.zzh.zza(jZzc, this.zzi, zzh(jZzc));
            }
        }
        long jZzc2 = this.zzb.zzc() / 1000;
        zzrl zzrlVar = this.zzh;
        boolean zZzb = zzrlVar.zzb();
        long jZze = zZzb ? zzrlVar.zze(jZzc2, this.zzi) : zzh(jZzc2);
        int playState = audioTrack.getPlayState();
        if (playState == 3) {
            if (zZzb || !zzrlVar.zzc()) {
                zzg(jZze);
            }
            long j10 = this.zzz;
            if (j10 != -9223372036854775807L) {
                long j11 = jZze - this.zzy;
                long jZzv = zzfj.zzv(jZzc2 - j10, this.zzi);
                long j12 = this.zzy + jZzv;
                long jAbs = Math.abs(j12 - jZze);
                if (j11 != 0 && jAbs < 1000000) {
                    long j13 = (jZzv * 10) / 100;
                    jZze = Math.max(j12 - j13, Math.min(jZze, j12 + j13));
                }
            }
            this.zzz = jZzc2;
            this.zzy = jZze;
        } else if (playState == 1) {
            zzg(jZze);
            return jZze;
        }
        return jZze;
    }

    public final void zzb() {
        if (this.zzu != -9223372036854775807L) {
            this.zzu = zzfj.zzq(this.zzb.zzb());
        }
        this.zzj = zzj();
        this.zzh.zzd();
    }

    public final boolean zzc() {
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzd(long j10) {
        return this.zzv != -9223372036854775807L && j10 > 0 && this.zzb.zzb() - this.zzv >= 200;
    }

    public zzsk(zzsj zzsjVar, zzdn zzdnVar, AudioTrack audioTrack, int i10, int i11, int i12) {
        long jZzr;
        this.zza = zzsjVar;
        this.zzb = zzdnVar;
        this.zzd = audioTrack;
        try {
            this.zzm = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzc = new long[10];
        this.zzz = -9223372036854775807L;
        this.zzy = -9223372036854775807L;
        this.zzh = new zzrl(audioTrack, zzsjVar);
        int sampleRate = audioTrack.getSampleRate();
        this.zze = sampleRate;
        boolean zZzA = zzfj.zzA(i10);
        this.zzg = zZzA;
        if (zZzA) {
            jZzr = zzfj.zzr(i12 / i11, sampleRate);
        } else {
            jZzr = -9223372036854775807L;
        }
        this.zzf = jZzr;
        this.zzq = 0L;
        this.zzr = 0L;
        this.zzA = false;
        this.zzB = 0L;
        this.zzu = -9223372036854775807L;
        this.zzv = -9223372036854775807L;
        this.zzo = 0L;
        this.zzn = 0L;
        this.zzi = 1.0f;
        this.zzj = -9223372036854775807L;
    }

    private final long zzj() {
        return zzfj.zzr(zzk(), this.zze);
    }

    public final void zze(long j10) {
        this.zzw = zzk();
        this.zzu = zzfj.zzq(this.zzb.zzb());
        this.zzx = j10;
    }

    public final void zzf() {
        zzi();
        if (this.zzu == -9223372036854775807L) {
            this.zzh.zzd();
        }
        this.zzw = zzk();
    }
}
