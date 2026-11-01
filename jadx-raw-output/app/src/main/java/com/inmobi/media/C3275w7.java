package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.w7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3275w7 implements qk.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qk.d f25627a;

    public C3275w7(qk.d dVar) {
        this.f25627a = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qk.d
    public final Object emit(Object obj, rj.c cVar) throws Throwable {
        C3250v7 c3250v7;
        if (cVar instanceof C3250v7) {
            c3250v7 = (C3250v7) cVar;
            int i10 = c3250v7.f25537b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3250v7.f25537b = i10 - Integer.MIN_VALUE;
            } else {
                c3250v7 = new C3250v7(this, cVar);
            }
        } else {
            c3250v7 = new C3250v7(this, cVar);
        }
        Object obj2 = c3250v7.f25536a;
        Object objF = sj.a.f();
        int i11 = c3250v7.f25537b;
        if (i11 == 0) {
            kotlin.c.b(obj2);
            qk.d dVar = this.f25627a;
            if (((Rl) obj) instanceof Pl) {
                c3250v7.f25537b = 1;
                if (dVar.emit(obj, c3250v7) == objF) {
                    return objF;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj2);
        }
        return mj.r.f64562a;
    }
}
