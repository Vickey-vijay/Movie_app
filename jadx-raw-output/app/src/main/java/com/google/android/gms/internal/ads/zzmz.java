package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzmz {
    private final zzs zza;
    private final SparseArray zzb;

    public final zzmy zza(int i10) {
        zzmy zzmyVar = (zzmy) this.zzb.get(i10);
        zzmyVar.getClass();
        return zzmyVar;
    }

    public final boolean zzb(int i10) {
        return this.zza.zza(i10);
    }

    public final int zzc() {
        return this.zza.zzb();
    }

    public final int zzd(int i10) {
        return this.zza.zzc(i10);
    }

    public zzmz(zzs zzsVar, SparseArray sparseArray) {
        this.zza = zzsVar;
        SparseArray sparseArray2 = new SparseArray(zzsVar.zzb());
        for (int i10 = 0; i10 < zzsVar.zzb(); i10++) {
            int iZzc = zzsVar.zzc(i10);
            zzmy zzmyVar = (zzmy) sparseArray.get(iZzc);
            zzmyVar.getClass();
            sparseArray2.append(iZzc, zzmyVar);
        }
        this.zzb = sparseArray2;
    }
}
