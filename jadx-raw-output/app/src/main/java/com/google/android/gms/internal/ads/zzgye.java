package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzgye extends zzgyg {
    @Override // com.google.android.gms.internal.ads.zzgyg
    public final /* synthetic */ void zze(Object obj) {
        zzk((q5.i) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgyg
    public final /* bridge */ /* synthetic */ Object zzf(Object obj, Throwable th2) throws Exception {
        zzgyw zzgywVar = (zzgyw) obj;
        q5.i iVarZza = zzgywVar.zza(th2);
        zzgrc.zzl(iVarZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgywVar);
        return iVarZza;
    }

    public zzgye(q5.i iVar, Class cls, zzgyw zzgywVar) {
        super(iVar, cls, zzgywVar);
    }
}
