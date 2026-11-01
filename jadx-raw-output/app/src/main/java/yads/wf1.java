package yads;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f84186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4 f84187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ah f84188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cu1 f84189d;

    public /* synthetic */ wf1(Context context, d4 d4Var) {
        this(context, d4Var, new ah(context), cu1.f76433e.a());
    }

    public final List a() {
        l4 l4VarA;
        l4 l4VarA2;
        l4[] l4VarArr = new l4[4];
        try {
            this.f84188c.a();
            l4VarA = null;
        } catch (ub1 e10) {
            l4 l4Var = h9.f78101a;
            l4VarA = h9.a(1, e10.getMessage(), e10.f83412c);
        }
        l4VarArr[0] = l4VarA;
        try {
            cu1 cu1Var = this.f84189d;
            Context context = this.f84186a;
            if (cu1Var.f76436b) {
                synchronized (cu1Var.f76435a) {
                    if (cu1Var.f76436b) {
                        if (ub.a(context)) {
                            cu1Var.f76437c.a(context);
                            cu1Var.f76438d.getClass();
                            hc2.a(context);
                        }
                        cu1Var.f76436b = false;
                    }
                    mj.r rVar = mj.r.f64562a;
                }
            }
            l4VarA2 = null;
        } catch (ub1 e11) {
            l4 l4Var2 = h9.f78101a;
            l4VarA2 = h9.a(1, e11.getMessage(), e11.f83412c);
        }
        l4VarArr[1] = l4VarA2;
        d4 d4Var = this.f84187b;
        l4VarArr[2] = d4Var.f76561c.f78158a == null ? h9.f78112l : null;
        l4VarArr[3] = d4Var.f76563e == null ? h9.f78109i : null;
        return nj.s.p(l4VarArr);
    }

    public wf1(Context context, d4 d4Var, ah ahVar, cu1 cu1Var) {
        this.f84186a = context;
        this.f84187b = d4Var;
        this.f84188c = ahVar;
        this.f84189d = cu1Var;
    }
}
