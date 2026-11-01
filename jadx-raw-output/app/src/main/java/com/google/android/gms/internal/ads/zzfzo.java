package com.google.android.gms.internal.ads;

import bk.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
final class zzfzo extends SuspendLambda implements p {
    public zzfzo(rj.c cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new zzfzo(cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo1invoke(Object obj, Object obj2) {
        return ((zzfzo) create((zzfyy) obj, (rj.c) obj2)).invokeSuspend(r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        zzfyy zzfyyVarZzd = zzfyy.zzd();
        ck.p.i(zzfyyVarZzd, "getDefaultInstance(...)");
        return zzfyyVarZzd;
    }
}
