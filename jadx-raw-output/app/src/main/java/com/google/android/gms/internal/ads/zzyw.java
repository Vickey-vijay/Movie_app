package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public class zzyw implements zzaac {
    public final zzbg zza;
    public final int zzb;
    public final int[] zzc;
    private final zzv[] zzd;
    private int zze;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzyw zzywVar = (zzyw) obj;
            if (this.zza.equals(zzywVar.zza) && Arrays.equals(this.zzc, zzywVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final zzbg zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final int zze() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final int zzg(int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            if (this.zzc[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public final int hashCode() {
        int i10 = this.zze;
        if (i10 != 0) {
            return i10;
        }
        int iIdentityHashCode = (System.identityHashCode(this.zza) * 31) + Arrays.hashCode(this.zzc);
        this.zze = iIdentityHashCode;
        return iIdentityHashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final zzv zzb(int i10) {
        return this.zzd[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzaac
    public final zzv zzc() {
        return this.zzd[0];
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final int zzf(int i10) {
        return this.zzc[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzaac
    public final int zzh() {
        return this.zzc[0];
    }

    public zzyw(zzbg zzbgVar, int[] iArr, int i10) {
        boolean z10;
        int length = iArr.length;
        if (length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzgrc.zzi(z10);
        zzbgVar.getClass();
        this.zza = zzbgVar;
        this.zzb = length;
        this.zzd = new zzv[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.zzd[i11] = zzbgVar.zza(iArr[i11]);
        }
        Arrays.sort(this.zzd, new Comparator() { // from class: com.google.android.gms.internal.ads.zzyv
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                return ((zzv) obj2).zzj - ((zzv) obj).zzj;
            }
        });
        this.zzc = new int[this.zzb];
        for (int i12 = 0; i12 < this.zzb; i12++) {
            this.zzc[i12] = zzbgVar.zzb(this.zzd[i12]);
        }
    }
}
