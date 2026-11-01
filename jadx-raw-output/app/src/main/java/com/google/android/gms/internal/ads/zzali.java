package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzali implements zzalp {
    private final zzalo zza;
    private final long zzb;
    private final long zzc;
    private final zzalt zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public final /* synthetic */ long zzd() {
        return this.zzb;
    }

    public final /* synthetic */ long zze() {
        return this.zzc;
    }

    public final /* synthetic */ zzalt zzf() {
        return this.zzd;
    }

    public final /* synthetic */ long zzg() {
        return this.zzf;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    @Override // com.google.android.gms.internal.ads.zzalp
    public final long zza(zzaev zzaevVar) throws IOException {
        long jMax;
        int i10 = this.zze;
        if (i10 == 0) {
            long jZzn = zzaevVar.zzn();
            this.zzg = jZzn;
            this.zze = 1;
            long j10 = this.zzc - 65307;
            if (j10 > jZzn) {
                return j10;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long j11 = this.zzi;
                long j12 = this.zzj;
                if (j11 == j12) {
                    jMax = -1;
                } else {
                    long jZzn2 = zzaevVar.zzn();
                    zzalo zzaloVar = this.zza;
                    if (zzaloVar.zzb(zzaevVar, j12)) {
                        zzaloVar.zzc(zzaevVar, false);
                        zzaevVar.zzl();
                        long j13 = this.zzh;
                        long j14 = zzaloVar.zzb;
                        long j15 = j13 - j14;
                        int i11 = zzaloVar.zzd + zzaloVar.zze;
                        if (j15 < 0 || j15 >= 72000) {
                            if (j15 < 0) {
                                this.zzj = jZzn2;
                                this.zzl = j14;
                            } else {
                                this.zzi = ((long) i11) + zzaevVar.zzn();
                                this.zzk = j14;
                            }
                            long j16 = this.zzj;
                            long j17 = this.zzi;
                            long j18 = j16 - j17;
                            if (j18 < 100000) {
                                this.zzj = j17;
                                jMax = j17;
                            } else {
                                long j19 = i11;
                                long j20 = j15 <= 0 ? 2L : 1L;
                                String str = zzfj.zza;
                                jMax = Math.max(j17, Math.min((zzaevVar.zzn() - (j19 * j20)) + ((j15 * j18) / (this.zzl - this.zzk)), j16 - 1));
                            }
                        } else {
                            jMax = -1;
                        }
                    } else {
                        jMax = this.zzi;
                        if (jMax == jZzn2) {
                            throw new IOException("No ogg page can be found.");
                        }
                    }
                }
                if (jMax != -1) {
                    return jMax;
                }
                this.zze = 3;
            } else if (i10 != 3) {
                return -1L;
            }
            while (true) {
                zzalo zzaloVar2 = this.zza;
                zzaloVar2.zzb(zzaevVar, -1L);
                zzaloVar2.zzc(zzaevVar, false);
                if (zzaloVar2.zzb > this.zzh) {
                    zzaevVar.zzl();
                    this.zze = 4;
                    return -(this.zzk + 2);
                }
                zzaevVar.zzf(zzaloVar2.zzd + zzaloVar2.zze);
                this.zzi = zzaevVar.zzn();
                this.zzk = zzaloVar2.zzb;
            }
        }
        zzalo zzaloVar3 = this.zza;
        zzaloVar3.zza();
        if (!zzaloVar3.zzb(zzaevVar, -1L)) {
            throw new EOFException();
        }
        zzaloVar3.zzc(zzaevVar, false);
        zzaevVar.zzf(zzaloVar3.zzd + zzaloVar3.zze);
        long j21 = zzaloVar3.zzb;
        while ((zzaloVar3.zza & 4) != 4 && zzaloVar3.zzb(zzaevVar, -1L) && zzaevVar.zzn() < this.zzc && zzaloVar3.zzc(zzaevVar, true) && zzaey.zzd(zzaevVar, zzaloVar3.zzd + zzaloVar3.zze)) {
            j21 = zzaloVar3.zzb;
        }
        this.zzf = j21;
        this.zze = 4;
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final void zzb(long j10) {
        long j11 = this.zzf - 1;
        String str = zzfj.zza;
        this.zzh = Math.max(0L, Math.min(j10, j11));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    @Nullable
    public final /* bridge */ /* synthetic */ zzafy zzc() {
        byte[] bArr = null;
        if (this.zzf != 0) {
            return new zzalh(this, bArr);
        }
        return null;
    }

    public zzali(zzalt zzaltVar, long j10, long j11, long j12, long j13, boolean z10) {
        boolean z11;
        if (j10 >= 0 && j11 > j10) {
            z11 = true;
        } else {
            z11 = false;
        }
        zzgrc.zza(z11);
        this.zzd = zzaltVar;
        this.zzb = j10;
        this.zzc = j11;
        if (j12 != j11 - j10 && !z10) {
            this.zze = 0;
        } else {
            this.zzf = j13;
            this.zze = 4;
        }
        this.zza = new zzalo();
    }
}
