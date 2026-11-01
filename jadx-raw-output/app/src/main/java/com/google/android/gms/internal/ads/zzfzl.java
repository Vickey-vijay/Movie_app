package com.google.android.gms.internal.ads;

import bk.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
final class zzfzl extends SuspendLambda implements p {
    public /* synthetic */ Object zza;
    public final /* synthetic */ String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzl(String str, rj.c cVar) {
        super(2, cVar);
        this.zzb = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        zzfzl zzfzlVar = new zzfzl(this.zzb, cVar);
        zzfzlVar.zza = obj;
        return zzfzlVar;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo1invoke(Object obj, Object obj2) {
        return ((zzfzl) create((zzfyy) obj, (rj.c) obj2)).invokeSuspend(r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        zzfza zzfzaVarZza = zzfyz.zza((zzfyw) ((zzfyy) this.zza).zzcc());
        zzfzaVarZza.zzd(zzfzaVarZza.zzb(), this.zzb);
        return zzfzaVarZza.zza();
    }
}
