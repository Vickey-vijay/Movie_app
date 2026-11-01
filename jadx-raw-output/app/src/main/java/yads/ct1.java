package yads;

import android.content.Context;
import io.appmetrica.analytics.AppMetrica;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ct1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dw2 f76419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile at1 f76420b;

    static {
        Object obj = dw2.f76819j;
        f76419a = cw2.a();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0071 A[Catch: all -> 0x007a, TryCatch #2 {, blocks: (B:22:0x0069, B:24:0x0071, B:25:0x0076), top: B:35:0x0069 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static at1 a(Context context, nt2 nt2Var, cq3 cq3Var) {
        gh ghVar;
        ot2 ot2Var;
        xt2 xt2VarA;
        pu3 pu3Var = pu3.f81606a;
        bh bhVar = new bh();
        fh fhVarA = pg.a(context);
        String str = ub.a(context) ? "322a737a-a0ca-44e0-bc85-649b1c7c1db6" : "478cb909-6ad1-4e12-84cc-b3629a789f93";
        boolean z10 = false;
        if (fhVarA.f77399a.a()) {
            try {
                ghVar = new gh(kotlin.b.a(new eh(cq3Var, context, fhVarA, str)), fhVarA.f77399a);
            } catch (Throwable unused) {
                boolean z11 = ad1.f75480a;
                ghVar = null;
            }
            mj.g gVarA = kotlin.b.a(new bt1(context));
            if (nt2Var != null && nt2Var.f80764e0) {
                z10 = true;
            }
            Object obj = og1.f81031d;
            at1 at1Var = new at1(ghVar, gVarA, z10, ng1.a().a());
            ot2Var = new ot2(context, bhVar);
            Object obj2 = xt2.f84686b;
            xt2VarA = wt2.a();
            synchronized (xt2.f84686b) {
                if (!xt2VarA.f84688a.containsKey(ot2Var)) {
                    xt2VarA.f84688a.put(ot2Var, null);
                }
                mj.r rVar = mj.r.f64562a;
            }
            return at1Var;
        }
        try {
            AppMetrica.setDataSendingEnabled(false);
        } catch (Throwable unused2) {
            boolean z12 = ad1.f75480a;
        }
        ghVar = null;
        mj.g gVarA2 = kotlin.b.a(new bt1(context));
        if (nt2Var != null) {
            z10 = true;
        }
        Object obj3 = og1.f81031d;
        at1 at1Var2 = new at1(ghVar, gVarA2, z10, ng1.a().a());
        ot2Var = new ot2(context, bhVar);
        Object obj4 = xt2.f84686b;
        xt2VarA = wt2.a();
        synchronized (xt2.f84686b) {
            if (!xt2VarA.f84688a.containsKey(ot2Var)) {
                xt2VarA.f84688a.put(ot2Var, null);
            }
            mj.r rVar2 = mj.r.f64562a;
            return at1Var2;
        }
    }
}
