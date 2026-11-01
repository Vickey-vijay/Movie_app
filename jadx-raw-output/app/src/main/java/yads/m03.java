package yads;

import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class m03 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashSet f80023b = new HashSet(nj.s.n(g63.f77644c, g63.f77643b));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i63 f80024a;

    public /* synthetic */ m03() {
        this(new i63(f80023b));
    }

    public final gg3 a(b20 b20Var) {
        int i10 = b20Var.f75707i;
        n03 n03Var = b20Var.f75705g;
        if (n03Var != null) {
            xc3 xc3VarA = this.f80024a.a(n03Var.f80505a);
            if (xc3VarA != null) {
                float f10 = xc3VarA.f84531c;
                if (wc3.f84169c == xc3VarA.f84530b) {
                    f10 = (long) ((f10 / 100) * i10);
                }
                return new gg3((long) Math.min(f10, i10));
            }
        }
        return null;
    }

    public m03(i63 i63Var) {
        this.f80024a = i63Var;
    }
}
