package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeqd {
    private final zzdlu zza;

    public zzeqd(zzdlu zzdluVar) {
        this.zza = zzdluVar;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfjc zzfjcVar, zzfir zzfirVar, View view, zzepz zzepzVar) {
        zzeqb zzeqbVar = new zzeqb(this, new zzeqa(this, zzfirVar));
        zzdko zzdkoVarZzd = this.zza.zzd(new zzcwv(zzfjcVar, zzfirVar, null), zzeqbVar);
        zzepzVar.zzd(new zzeqc(this, zzdkoVarZzd));
        return zzdkoVarZzd.zzh();
    }
}
