package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzgyl extends zzgyn {
    @Override // com.google.android.gms.internal.ads.zzgyn
    public final /* synthetic */ void zze(Object obj) {
        zzk((q5.i) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgyn
    public final /* bridge */ /* synthetic */ Object zzf(Object obj, Object obj2) throws Exception {
        zzgyw zzgywVar = (zzgyw) obj;
        q5.i iVarZza = zzgywVar.zza(obj2);
        zzgrc.zzl(iVarZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgywVar);
        return iVarZza;
    }

    public zzgyl(q5.i iVar, zzgyw zzgywVar) {
        super(iVar, zzgywVar);
    }
}
