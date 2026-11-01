package yads;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j30 {
    public static u30 a(lo2 lo2Var, String str, pl2 pl2Var, int i10) {
        t30 t30Var = new t30();
        t30Var.f82872a = pl2Var.a(str);
        t30Var.f82875d = pl2Var.f81455a;
        t30Var.f82876e = pl2Var.f81456b;
        String strC = lo2Var.c();
        if (strC == null) {
            strC = pl2Var.a(((uo) lo2Var.f79869b.get(0)).f83549a).toString();
        }
        return t30Var.a(strC).a(i10).a();
    }

    public static hu a(p30 p30Var, int i10, lo2 lo2Var) {
        mq0 sx0Var;
        if (lo2Var.f79872e == null) {
            return null;
        }
        mx0 mx0Var = lo2Var.f79868a;
        String str = mx0Var.f80428l;
        if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm"))) {
            sx0Var = new zi1();
        } else {
            sx0Var = new sx0();
        }
        ar arVar = new ar(sx0Var, i10, mx0Var);
        try {
            pl2 pl2Var = (pl2) ni.a(lo2Var.f());
            pl2 pl2VarE = lo2Var.e();
            if (pl2VarE != null) {
                pl2 pl2VarA = pl2Var.a(pl2VarE, ((uo) lo2Var.f79869b.get(0)).f83549a);
                if (pl2VarA == null) {
                    new r61(p30Var, a(lo2Var, ((uo) lo2Var.f79869b.get(0)).f83549a, pl2Var, 0), lo2Var.f79868a, 0, null, arVar).a();
                } else {
                    pl2VarE = pl2VarA;
                }
                new r61(p30Var, a(lo2Var, ((uo) lo2Var.f79869b.get(0)).f83549a, pl2VarE, 0), lo2Var.f79868a, 0, null, arVar).a();
            }
            return arVar.b();
        } finally {
            arVar.c();
        }
    }
}
