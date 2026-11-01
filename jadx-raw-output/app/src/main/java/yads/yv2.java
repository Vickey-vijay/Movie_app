package yads;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class yv2 implements zp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f85126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f85127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ aw2 f85128c;

    @Override // yads.zp2
    public final void a() {
        v9 v9Var = this.f85126a;
        d4 d4Var = this.f85128c.f75644f;
        f22 f22Var = new f22();
        aw2 aw2Var = this.f85128c;
        aw2Var.f75642d.a(this.f85127b, this.f85126a, aw2Var.f75645g);
        zs2 zs2Var = this.f85128c.f75642d;
        Context context = this.f85127b;
        v9 v9Var2 = this.f85126a;
        zs2Var.getClass();
        new fo2((Map) null, 3);
        fo2 fo2VarA = f22Var.a(v9Var, d4Var, null);
        do2 do2Var = do2.f76756c;
        fo2VarA.b("success", "status");
        zs2Var.a(context, v9Var2, co2.f76357h, fo2VarA);
    }

    public yv2(aw2 aw2Var, Context context, v9 v9Var) {
        this.f85128c = aw2Var;
        this.f85126a = v9Var;
        this.f85127b = context.getApplicationContext();
    }

    @Override // yads.zp2
    public final void a(d12 d12Var) {
        v9 v9Var = this.f85126a;
        d4 d4Var = this.f85128c.f75644f;
        f22 f22Var = new f22();
        aw2 aw2Var = this.f85128c;
        aw2Var.f75642d.a(this.f85127b, this.f85126a, aw2Var.f75645g);
        zs2 zs2Var = this.f85128c.f75642d;
        Context context = this.f85127b;
        v9 v9Var2 = this.f85126a;
        zs2Var.getClass();
        new fo2((Map) null, 3);
        fo2 fo2VarA = f22Var.a(v9Var, d4Var, d12Var);
        do2 do2Var = do2.f76756c;
        fo2VarA.b("success", "status");
        zs2Var.a(context, v9Var2, co2.f76357h, fo2VarA);
    }
}
