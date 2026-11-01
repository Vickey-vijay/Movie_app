package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
abstract class zzahm {
    public final zzagh zza;

    public zzahm(zzagh zzaghVar) {
        this.zza = zzaghVar;
    }

    public abstract boolean zza(zzer zzerVar) throws zzat;

    public abstract boolean zzb(zzer zzerVar, long j10) throws zzat;

    public final boolean zzf(zzer zzerVar, long j10) throws zzat {
        if (zza(zzerVar) && zzb(zzerVar, j10)) {
            return true;
        }
        return false;
    }
}
