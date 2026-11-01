package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzpe {
    public final /* synthetic */ zzpf zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzwk zze;
    private boolean zzf;
    private boolean zzg;

    public final boolean zzb(int i10, @Nullable zzwk zzwkVar) {
        if (zzwkVar != null) {
            long j10 = zzwkVar.zzd;
            if (j10 != -1) {
                zzwk zzwkVar2 = this.zze;
                if (zzwkVar2 == null) {
                    return !zzwkVar.zzb() && j10 == this.zzd;
                }
                return j10 == zzwkVar2.zzd && zzwkVar.zzb == zzwkVar2.zzb && zzwkVar.zzc == zzwkVar2.zzc;
            }
        }
        return i10 == this.zzc;
    }

    public final /* synthetic */ String zze() {
        return this.zzb;
    }

    public final /* synthetic */ int zzf() {
        return this.zzc;
    }

    public final /* synthetic */ long zzg() {
        return this.zzd;
    }

    public final /* synthetic */ zzwk zzh() {
        return this.zze;
    }

    public final /* synthetic */ boolean zzi() {
        return this.zzf;
    }

    public final /* synthetic */ void zzj(boolean z10) {
        this.zzf = true;
    }

    public final /* synthetic */ boolean zzk() {
        return this.zzg;
    }

    public final /* synthetic */ void zzl(boolean z10) {
        this.zzg = true;
    }

    public final boolean zza(zzbf zzbfVar, zzbf zzbfVar2) {
        int i10 = this.zzc;
        if (i10 < zzbfVar.zza()) {
            zzpf zzpfVar = this.zza;
            zzbfVar.zzb(i10, zzpfVar.zzj(), 0L);
            int i11 = zzpfVar.zzj().zzn;
            while (true) {
                if (i11 > zzpfVar.zzj().zzo) {
                    i10 = -1;
                    break;
                }
                int iZze = zzbfVar2.zze(zzbfVar.zzf(i11));
                if (iZze != -1) {
                    i10 = zzbfVar2.zzd(iZze, zzpfVar.zzk(), false).zzc;
                    break;
                }
                i11++;
            }
        } else if (i10 >= zzbfVar2.zza()) {
            i10 = -1;
            break;
        }
        this.zzc = i10;
        if (i10 == -1) {
            return false;
        }
        zzwk zzwkVar = this.zze;
        return zzwkVar == null || zzbfVar2.zze(zzwkVar.zza) != -1;
    }

    public final void zzc(int i10, @Nullable zzwk zzwkVar) {
        if (this.zzd == -1 && i10 == this.zzc && zzwkVar != null) {
            zzpf zzpfVar = this.zza;
            long j10 = zzwkVar.zzd;
            if (j10 >= zzpfVar.zzi()) {
                this.zzd = j10;
            }
        }
    }

    public final boolean zzd(zzmy zzmyVar) {
        zzwk zzwkVar = zzmyVar.zzd;
        if (zzwkVar == null) {
            return this.zzc != zzmyVar.zzc;
        }
        long j10 = this.zzd;
        if (j10 == -1) {
            return false;
        }
        long j11 = zzwkVar.zzd;
        if (j11 > j10) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        zzbf zzbfVar = zzmyVar.zzb;
        int iZze = zzbfVar.zze(zzwkVar.zza);
        int iZze2 = zzbfVar.zze(this.zze.zza);
        zzwk zzwkVar2 = this.zze;
        if (j11 < zzwkVar2.zzd || iZze < iZze2) {
            return false;
        }
        if (iZze > iZze2) {
            return true;
        }
        if (!zzwkVar.zzb()) {
            int i10 = zzwkVar.zze;
            return i10 == -1 || i10 > zzwkVar2.zzb;
        }
        int i11 = zzwkVar.zzb;
        int i12 = zzwkVar.zzc;
        int i13 = zzwkVar2.zzb;
        if (i11 <= i13) {
            return i11 == i13 && i12 > zzwkVar2.zzc;
        }
        return true;
    }

    public zzpe(zzpf zzpfVar, String str, @Nullable int i10, zzwk zzwkVar) {
        long j10;
        Objects.requireNonNull(zzpfVar);
        this.zza = zzpfVar;
        this.zzb = str;
        this.zzc = i10;
        if (zzwkVar == null) {
            j10 = -1;
        } else {
            j10 = zzwkVar.zzd;
        }
        this.zzd = j10;
        if (zzwkVar != null && zzwkVar.zzb()) {
            this.zze = zzwkVar;
        }
    }
}
