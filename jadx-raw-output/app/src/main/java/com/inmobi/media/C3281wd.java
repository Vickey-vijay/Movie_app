package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.wd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3281wd implements qk.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qk.d f25639a;

    public C3281wd(qk.d dVar) {
        this.f25639a = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qk.d
    public final Object emit(Object obj, rj.c cVar) throws Throwable {
        C3256vd c3256vd;
        if (cVar instanceof C3256vd) {
            c3256vd = (C3256vd) cVar;
            int i10 = c3256vd.f25566b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3256vd.f25566b = i10 - Integer.MIN_VALUE;
            } else {
                c3256vd = new C3256vd(this, cVar);
            }
        } else {
            c3256vd = new C3256vd(this, cVar);
        }
        Object obj2 = c3256vd.f25565a;
        Object objF = sj.a.f();
        int i11 = c3256vd.f25566b;
        if (i11 == 0) {
            kotlin.c.b(obj2);
            qk.d dVar = this.f25639a;
            if (((AbstractC2753bc) obj) instanceof Rl) {
                c3256vd.f25566b = 1;
                if (dVar.emit(obj, c3256vd) == objF) {
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
