package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzql {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final boolean zzd = false;
    public final int zze;
    public final zzd zzf;
    public final int zzg;
    public final int zzh;

    public /* synthetic */ zzql(zzqk zzqkVar, byte[] bArr) {
        this.zza = zzqkVar.zzi();
        this.zzb = zzqkVar.zzj();
        this.zzc = zzqkVar.zzk();
        this.zze = zzqkVar.zzl();
        this.zzf = zzqkVar.zzm();
        this.zzg = zzqkVar.zzn();
        this.zzh = zzqkVar.zzo();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzql.class == obj.getClass()) {
            zzql zzqlVar = (zzql) obj;
            if (this.zza == zzqlVar.zza && this.zzb == zzqlVar.zzb && this.zzc == zzqlVar.zzc && this.zze == zzqlVar.zze && this.zzg == zzqlVar.zzg && this.zzh == zzqlVar.zzh && this.zzf.equals(zzqlVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.FALSE;
        return Objects.hash(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), bool, bool, Integer.valueOf(this.zze), this.zzf, Integer.valueOf(this.zzg), Integer.valueOf(this.zzh), bool, bool);
    }
}
