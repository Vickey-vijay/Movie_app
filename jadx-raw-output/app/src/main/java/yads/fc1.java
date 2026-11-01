package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class fc1 implements rm3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dq2 f77346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cl.a f77347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mm3 f77348c;

    @Override // yads.rm3
    public final Object a(e82 e82Var) {
        this.f77348c.getClass();
        int i10 = e82Var.f76976a;
        xp2 xp2Var = new xp2(e82Var.f76977b);
        Map mapJ = e82Var.f76978c;
        if (mapJ == null) {
            mapJ = kotlin.collections.a.j();
        }
        String str = (String) this.f77346a.a(new wp2(i10, xp2Var, mapJ));
        if (str == null || lk.a0.n0(str)) {
            return null;
        }
        cl.a aVar = this.f77347b;
        aVar.a();
        return (j80) aVar.b(j80.Companion.serializer(), str);
    }

    public fc1(i43 i43Var, cl.a aVar, mm3 mm3Var) {
        this.f77346a = i43Var;
        this.f77347b = aVar;
        this.f77348c = mm3Var;
    }
}
