package com.google.android.gms.internal.ads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
final class zzfzt extends ContinuationImpl {
    public Object zza;
    public long zzb;
    public /* synthetic */ Object zzc;
    public final /* synthetic */ zzgaf zzd;
    public int zze;
    public String zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzt(zzgaf zzgafVar, rj.c cVar) {
        super(cVar);
        this.zzd = zzgafVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.zzc = obj;
        this.zze |= Integer.MIN_VALUE;
        return this.zzd.zzi(null, this);
    }
}
