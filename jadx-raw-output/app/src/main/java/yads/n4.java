package yads;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class n4 {
    public static l4 a(d4 d4Var, m4 m4Var) {
        String str;
        switch (m4Var.ordinal()) {
            case 0:
            case 5:
                l4 l4Var = h9.f78101a;
                if (d4Var != null) {
                    str = d4Var.f76561c.f78158a;
                } else {
                    str = null;
                }
                return h9.a(str);
            case 1:
                return h9.f78103c;
            case 2:
                return h9.f78108h;
            case 3:
                return h9.f78104d;
            case 4:
                return h9.f78105e;
            case 6:
                return h9.f78114n;
            case 7:
                return h9.f78107g;
            case 8:
                return h9.f78110j;
            case 9:
                return h9.f78111k;
            case 10:
                return h9.f78118r;
            case 11:
                return h9.f78119s;
            case 12:
                return h9.f78120t;
            case 13:
                return h9.f78121u;
            case 14:
                return h9.f78122v;
            case 15:
                return h9.f78117q;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
