package yads;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class vv2 implements zp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f84019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f84020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xv2 f84021c;

    @Override // yads.zp2
    public final void a() {
        v9 v9Var = this.f84019a;
        d4 d4Var = this.f84021c.f84714f;
        f22 f22Var = new f22();
        xv2 xv2Var = this.f84021c;
        xv2Var.f84712d.a(this.f84020b, this.f84019a, xv2Var.f84715g);
        zs2 zs2Var = this.f84021c.f84712d;
        Context context = this.f84020b;
        v9 v9Var2 = this.f84019a;
        zs2Var.getClass();
        new fo2((Map) null, 3);
        fo2 fo2VarA = f22Var.a(v9Var, d4Var, null);
        do2 do2Var = do2.f76756c;
        fo2VarA.b("success", "status");
        zs2Var.a(context, v9Var2, co2.f76357h, fo2VarA);
    }

    public vv2(xv2 xv2Var, Context context, v9 v9Var) {
        this.f84021c = xv2Var;
        this.f84019a = v9Var;
        this.f84020b = context.getApplicationContext();
    }

    @Override // yads.zp2
    public final void a(d12 d12Var) {
        v9 v9Var = this.f84019a;
        d4 d4Var = this.f84021c.f84714f;
        f22 f22Var = new f22();
        xv2 xv2Var = this.f84021c;
        xv2Var.f84712d.a(this.f84020b, this.f84019a, xv2Var.f84715g);
        zs2 zs2Var = this.f84021c.f84712d;
        Context context = this.f84020b;
        v9 v9Var2 = this.f84019a;
        zs2Var.getClass();
        new fo2((Map) null, 3);
        fo2 fo2VarA = f22Var.a(v9Var, d4Var, d12Var);
        do2 do2Var = do2.f76756c;
        fo2VarA.b("success", "status");
        zs2Var.a(context, v9Var2, co2.f76357h, fo2VarA);
    }
}
