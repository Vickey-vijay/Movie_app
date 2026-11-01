package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzbm {
    public final int zza;
    private final zzbg zzb;
    private final boolean zzc;
    private final int[] zzd;
    private final boolean[] zze;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbm.class == obj.getClass()) {
            zzbm zzbmVar = (zzbm) obj;
            if (this.zzc == zzbmVar.zzc && this.zzb.equals(zzbmVar.zzb) && Arrays.equals(this.zzd, zzbmVar.zzd) && Arrays.equals(this.zze, zzbmVar.zze)) {
                return true;
            }
        }
        return false;
    }

    static {
        String str = zzfj.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public final int hashCode() {
        return (((((this.zzb.hashCode() * 31) + (this.zzc ? 1 : 0)) * 31) + Arrays.hashCode(this.zzd)) * 31) + Arrays.hashCode(this.zze);
    }

    public final zzv zza(int i10) {
        return this.zzb.zza(i10);
    }

    public final boolean zzb() {
        for (boolean z10 : this.zze) {
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzc(int i10) {
        return this.zze[i10];
    }

    public final int zzd() {
        return this.zzb.zzc;
    }

    public zzbm(zzbg zzbgVar, boolean z10, int[] iArr, boolean[] zArr) {
        boolean z11;
        int i10 = zzbgVar.zza;
        this.zza = i10;
        if (i10 == iArr.length && i10 == zArr.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        zzgrc.zza(z11);
        this.zzb = zzbgVar;
        this.zzc = z10 && i10 > 1;
        this.zzd = (int[]) iArr.clone();
        this.zze = (boolean[]) zArr.clone();
    }
}
