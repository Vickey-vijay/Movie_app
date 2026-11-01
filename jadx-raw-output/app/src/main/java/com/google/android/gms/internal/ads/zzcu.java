package com.google.android.gms.internal.ads;

import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcu implements zzco {
    private int zzb;
    private float zzc = 1.0f;
    private float zzd = 1.0f;
    private zzcl zze;
    private zzcl zzf;
    private zzcl zzg;
    private zzcl zzh;
    private boolean zzi;

    @Nullable
    private zzct zzj;
    private ByteBuffer zzk;
    private ByteBuffer zzl;
    private long zzm;
    private long zzn;
    private boolean zzo;

    public final void zzk(@FloatRange(from = 0.0d, fromInclusive = false) float f10) {
        zzgrc.zza(f10 > 0.0f);
        if (this.zzc != f10) {
            this.zzc = f10;
            this.zzi = true;
        }
    }

    public final void zzl(@FloatRange(from = 0.0d, fromInclusive = false) float f10) {
        zzgrc.zza(f10 > 0.0f);
        if (this.zzd != f10) {
            this.zzd = f10;
            this.zzi = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final long zza(long j10) {
        if (this.zzn < 1024) {
            return (long) (j10 / ((double) this.zzc));
        }
        long j11 = this.zzm;
        zzct zzctVar = this.zzj;
        zzctVar.getClass();
        long jZza = j11 - ((long) zzctVar.zza());
        int i10 = this.zzh.zzb;
        int i11 = this.zzg.zzb;
        return i10 == i11 ? zzfj.zzt(j10, this.zzn, jZza, RoundingMode.DOWN) : zzfj.zzt(j10, this.zzn * ((long) i11), jZza * ((long) i10), RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final zzcl zzb(zzcl zzclVar) throws zzcn {
        int i10 = zzclVar.zzd;
        if (i10 != 2 && i10 != 4) {
            throw new zzcn("Unhandled input format:", zzclVar);
        }
        int i11 = this.zzb;
        if (i11 == -1) {
            i11 = zzclVar.zzb;
        }
        this.zze = zzclVar;
        zzcl zzclVar2 = new zzcl(i11, zzclVar.zzc, i10);
        this.zzf = zzclVar2;
        this.zzi = true;
        return zzclVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final boolean zzc() {
        if (this.zzf.zzb != -1) {
            return Math.abs(this.zzc + (-1.0f)) >= 1.0E-4f || Math.abs(this.zzd + (-1.0f)) >= 1.0E-4f || this.zzf.zzb != this.zze.zzb;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zze() {
        zzct zzctVar = this.zzj;
        if (zzctVar != null) {
            zzctVar.zzd();
        }
        this.zzo = true;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final ByteBuffer zzf() {
        int iZzf;
        zzct zzctVar = this.zzj;
        if (zzctVar != null && (iZzf = zzctVar.zzf()) > 0) {
            if (this.zzk.capacity() < iZzf) {
                this.zzk = ByteBuffer.allocateDirect(iZzf).order(ByteOrder.nativeOrder());
            } else {
                this.zzk.clear();
            }
            zzctVar.zzc(this.zzk);
            this.zzk.flip();
            this.zzn += (long) iZzf;
            this.zzl = this.zzk;
        }
        ByteBuffer byteBuffer = this.zzl;
        this.zzl = zzco.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final boolean zzg() {
        zzct zzctVar;
        return this.zzo && ((zzctVar = this.zzj) == null || zzctVar.zzf() == 0);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzj() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        zzcl zzclVar = zzcl.zza;
        this.zze = zzclVar;
        this.zzf = zzclVar;
        this.zzg = zzclVar;
        this.zzh = zzclVar;
        ByteBuffer byteBuffer = zzco.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer;
        this.zzb = -1;
        this.zzi = false;
        this.zzj = null;
        this.zzm = 0L;
        this.zzn = 0L;
        this.zzo = false;
    }

    public final long zzm(long j10) {
        if (this.zzn < 1024) {
            return (long) (((double) this.zzc) * j10);
        }
        long j11 = this.zzm;
        zzct zzctVar = this.zzj;
        zzctVar.getClass();
        long jZza = j11 - ((long) zzctVar.zza());
        int i10 = this.zzh.zzb;
        int i11 = this.zzg.zzb;
        return i10 == i11 ? zzfj.zzt(j10, jZza, this.zzn, RoundingMode.DOWN) : zzfj.zzt(j10, jZza * ((long) i10), this.zzn * ((long) i11), RoundingMode.DOWN);
    }

    public zzcu() {
        zzcl zzclVar = zzcl.zza;
        this.zze = zzclVar;
        this.zzf = zzclVar;
        this.zzg = zzclVar;
        this.zzh = zzclVar;
        ByteBuffer byteBuffer = zzco.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer;
        this.zzb = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzd(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        zzct zzctVar = this.zzj;
        zzctVar.getClass();
        this.zzm += (long) byteBuffer.remaining();
        zzctVar.zzb(byteBuffer);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzi(zzcm zzcmVar) {
        boolean z10;
        if (zzc()) {
            zzcl zzclVar = this.zze;
            this.zzg = zzclVar;
            zzcl zzclVar2 = this.zzf;
            this.zzh = zzclVar2;
            if (this.zzi) {
                int i10 = zzclVar.zzb;
                int i11 = zzclVar.zzc;
                float f10 = this.zzc;
                float f11 = this.zzd;
                int i12 = zzclVar2.zzb;
                if (zzclVar.zzd == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.zzj = new zzct(i10, i11, f10, f11, i12, z10);
            } else {
                zzct zzctVar = this.zzj;
                if (zzctVar != null) {
                    zzctVar.zze();
                }
            }
        }
        this.zzl = zzco.zza;
        this.zzm = 0L;
        this.zzn = 0L;
        this.zzo = false;
    }
}
