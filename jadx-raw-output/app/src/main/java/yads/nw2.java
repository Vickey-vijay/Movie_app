package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes10.dex */
public final class nw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kb3 f80844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mb3 f80845b;

    public /* synthetic */ nw2(Context context) {
        this(new kb3(context), new mb3(context));
    }

    public final void a() {
        boolean z10;
        mb3 mb3Var = this.f80845b;
        rd3 rd3Var = mb3Var.f80135a;
        Context context = mb3Var.f80137c;
        rd3Var.getClass();
        if (ub.a(context)) {
            lb3 lb3Var = mb3Var.f80136b;
            nt2 nt2VarA = lb3Var.f79742a.a(mb3Var.f80137c);
            if (nt2VarA != null && nt2VarA.f80789r) {
                mb3Var.f80138d.getClass();
                nb3.b();
            }
        }
        kb3 kb3Var = this.f80844a;
        rd3 rd3Var2 = kb3Var.f79364c;
        Context context2 = kb3Var.f79366e;
        rd3Var2.getClass();
        if (ub.a(context2)) {
            dw2 dw2Var = kb3Var.f79363b;
            dw2Var.getClass();
            synchronized (dw2.f76819j) {
                z10 = dw2Var.f76826f;
            }
            if (z10) {
                jb3 jb3Var = kb3Var.f79365d;
                nt2 nt2VarA2 = jb3Var.f78969a.a(kb3Var.f79366e);
                if (nt2VarA2 == null || !nt2VarA2.f80787q) {
                    return;
                }
                kb3Var.f79362a.a();
            }
        }
    }

    public nw2(kb3 kb3Var, mb3 mb3Var) {
        this.f80844a = kb3Var;
        this.f80845b = mb3Var;
    }
}
