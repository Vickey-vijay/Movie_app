package com.google.android.gms.internal.ads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
final class zzfzn extends ContinuationImpl {
    public Object zza;
    public /* synthetic */ Object zzb;
    public final /* synthetic */ zzgaf zzc;
    public int zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzn(zzgaf zzgafVar, rj.c cVar) {
        super(cVar);
        this.zzc = zzgafVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zzt(this);
    }
}
