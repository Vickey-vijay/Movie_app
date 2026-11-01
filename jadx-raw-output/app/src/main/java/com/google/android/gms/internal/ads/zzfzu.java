package com.google.android.gms.internal.ads;

import bk.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.l0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
final class zzfzu extends SuspendLambda implements p {
    public int zza;
    public final /* synthetic */ zzgaf zzb;
    public final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzu(zzgaf zzgafVar, String str, rj.c cVar) {
        super(2, cVar);
        this.zzb = zzgafVar;
        this.zzc = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new zzfzu(this.zzb, this.zzc, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo1invoke(Object obj, Object obj2) {
        return ((zzfzu) create((l0) obj, (rj.c) obj2)).invokeSuspend(r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.zza;
        kotlin.c.b(obj);
        if (i10 == 0) {
            zzgaf zzgafVar = this.zzb;
            String str = this.zzc;
            this.zza = 1;
            if (zzgafVar.zzi(str, this) == objF) {
                return objF;
            }
        }
        return r.f64562a;
    }
}
