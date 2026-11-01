package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.hm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2917hm implements qk.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qk.d f24516a;

    public C2917hm(qk.d dVar) {
        this.f24516a = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qk.d
    public final Object emit(Object obj, rj.c cVar) throws Throwable {
        C2892gm c2892gm;
        if (cVar instanceof C2892gm) {
            c2892gm = (C2892gm) cVar;
            int i10 = c2892gm.f24458b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2892gm.f24458b = i10 - Integer.MIN_VALUE;
            } else {
                c2892gm = new C2892gm(this, cVar);
            }
        } else {
            c2892gm = new C2892gm(this, cVar);
        }
        Object obj2 = c2892gm.f24457a;
        Object objF = sj.a.f();
        int i11 = c2892gm.f24458b;
        if (i11 == 0) {
            kotlin.c.b(obj2);
            qk.d dVar = this.f24516a;
            Rl rl2 = (Rl) obj;
            if (ck.p.e(rl2, C2942in.f24569a) || (rl2 instanceof Pl)) {
                c2892gm.f24458b = 1;
                if (dVar.emit(obj, c2892gm) == objF) {
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
