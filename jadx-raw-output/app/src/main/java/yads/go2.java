package yads;

/* JADX INFO: loaded from: classes11.dex */
public abstract class go2 {
    public static final fo2 a(fo2 fo2Var, fo2 fo2Var2) {
        if (fo2Var2 == null) {
            return new fo2(fo2Var.f77471a, fo2Var.f77472b);
        }
        c cVar = fo2Var.f77472b;
        if (cVar == null) {
            cVar = fo2Var2.f77472b;
        }
        return new fo2(kotlin.collections.a.q(fo2Var.f77471a, fo2Var2.f77471a), cVar);
    }
}
