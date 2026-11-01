package com.google.android.gms.internal.ads;

import bk.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
final class zzfzs extends SuspendLambda implements p {
    public /* synthetic */ Object zza;
    public final /* synthetic */ zzfyu zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzs(zzfyu zzfyuVar, rj.c cVar) {
        super(2, cVar);
        this.zzb = zzfyuVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        zzfzs zzfzsVar = new zzfzs(this.zzb, cVar);
        zzfzsVar.zza = obj;
        return zzfzsVar;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo1invoke(Object obj, Object obj2) {
        return ((zzfzs) create((zzfyy) obj, (rj.c) obj2)).invokeSuspend(r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        zzfza zzfzaVarZza = zzfyz.zza((zzfyw) ((zzfyy) this.zza).zzcc());
        zziev zzievVarZzb = zzfzaVarZza.zzb();
        zzfyu zzfyuVar = this.zzb;
        String strZza = zzfyuVar.zza();
        ck.p.i(strZza, "getGwsQueryId(...)");
        zzfzaVarZza.zzc(zzievVarZzb, strZza, zzfyuVar);
        return zzfzaVarZza.zza();
    }
}
