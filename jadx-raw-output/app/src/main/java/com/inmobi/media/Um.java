package com.inmobi.media;

/* JADX INFO: loaded from: classes7.dex */
public final class Um implements qk.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qk.d f23662a;

    public Um(qk.d dVar) {
        this.f23662a = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qk.d
    public final Object emit(Object obj, rj.c cVar) throws Throwable {
        Tm tm2;
        if (cVar instanceof Tm) {
            tm2 = (Tm) cVar;
            int i10 = tm2.f23591b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                tm2.f23591b = i10 - Integer.MIN_VALUE;
            } else {
                tm2 = new Tm(this, cVar);
            }
        } else {
            tm2 = new Tm(this, cVar);
        }
        Object obj2 = tm2.f23590a;
        Object objF = sj.a.f();
        int i11 = tm2.f23591b;
        if (i11 == 0) {
            kotlin.c.b(obj2);
            qk.d dVar = this.f23662a;
            Boolean boolA = tj.a.a(((Mn) obj) == Mn.VISIBLE);
            tm2.f23591b = 1;
            if (dVar.emit(boolA, tm2) == objF) {
                return objF;
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
