package yads;

/* JADX INFO: loaded from: classes11.dex */
public abstract class pm3 {
    public static be3 a(im3 im3Var) {
        if (im3Var instanceof zl0) {
            return ae3.a((zl0) im3Var);
        }
        if (im3Var instanceof lb2) {
            return ae3.a();
        }
        e82 e82Var = im3Var.f78724b;
        if (e82Var == null) {
            return ae3.a(im3Var.getMessage());
        }
        int i10 = e82Var.f76976a;
        if (i10 >= 500) {
            return ae3.b();
        }
        String str = ("Network Error.  Code: " + i10 + ".") + " Data: \n" + new String(e82Var.f76977b, lk.c.f63591b);
        boolean z10 = ad1.f75480a;
        return ae3.b(str);
    }
}
