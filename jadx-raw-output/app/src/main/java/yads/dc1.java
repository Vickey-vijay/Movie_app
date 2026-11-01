package yads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class dc1 extends po {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Context f76631w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final yo2 f76632x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Map f76633y;

    @Override // yads.po, yads.po2
    public final im3 a(im3 im3Var) {
        boolean z10 = ad1.f75480a;
        return im3Var;
    }

    @Override // yads.po2
    public final vp2 a(e82 e82Var) {
        if (200 != e82Var.f76976a) {
            return new vp2(new h4(m4.f80062e, e82Var));
        }
        j80 j80Var = (j80) this.f76632x.a(e82Var);
        return j80Var != null ? new vp2(j80Var, v11.a(e82Var)) : new vp2(new h4(m4.f80060c, e82Var));
    }

    @Override // yads.po2
    public final Map d() {
        HashMap map = new HashMap();
        Context context = this.f76631w;
        Object obj = dw2.f76819j;
        nt2 nt2VarA = cw2.a().a(context);
        if (nt2VarA != null && nt2VarA.f80805z) {
            u11 u11Var = u11.f83300c;
            map.put("encrypted-request", "1");
        }
        map.putAll(this.f76633y);
        return map;
    }

    public dc1(Context context, String str, yo2 yo2Var, Map map, c71 c71Var) {
        super(context, str, c71Var);
        this.f76631w = context;
        this.f76632x = yo2Var;
        this.f76633y = map;
    }
}
