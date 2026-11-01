package com.inmobi.media;

/* JADX INFO: loaded from: classes6.dex */
public final class Nd implements qk.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qk.d f23239a;

    public Nd(qk.d dVar) {
        this.f23239a = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qk.d
    public final Object emit(Object obj, rj.c cVar) throws Throwable {
        Md md2;
        if (cVar instanceof Md) {
            md2 = (Md) cVar;
            int i10 = md2.f23161b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                md2.f23161b = i10 - Integer.MIN_VALUE;
            } else {
                md2 = new Md(this, cVar);
            }
        } else {
            md2 = new Md(this, cVar);
        }
        Object obj2 = md2.f23160a;
        Object objF = sj.a.f();
        int i11 = md2.f23161b;
        if (i11 == 0) {
            kotlin.c.b(obj2);
            qk.d dVar = this.f23239a;
            if (((Rl) obj) instanceof Pl) {
                md2.f23161b = 1;
                if (dVar.emit(obj, md2) == objF) {
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
