package yads;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class nv2 implements zp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f80832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9 f80833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qv2 f80834c;

    @Override // yads.zp2
    public final void a() {
        qv2 qv2Var = this.f80834c;
        qv2Var.f81988e.a(this.f80832a, this.f80833b, qv2Var.f81987d);
        this.f80834c.f81988e.a(this.f80832a, this.f80833b, (e22) null);
    }

    public nv2(qv2 qv2Var, Context context, v9 v9Var) {
        this.f80834c = qv2Var;
        this.f80832a = context;
        this.f80833b = v9Var;
    }

    @Override // yads.zp2
    public final void a(d12 d12Var) {
        v9 v9Var = this.f80833b;
        d4 d4Var = this.f80834c.f81984a.f85497c;
        f22 f22Var = new f22();
        qv2 qv2Var = this.f80834c;
        qv2Var.f81988e.a(this.f80832a, this.f80833b, qv2Var.f81987d);
        zs2 zs2Var = this.f80834c.f81988e;
        Context context = this.f80832a;
        v9 v9Var2 = this.f80833b;
        zs2Var.getClass();
        new fo2((Map) null, 3);
        fo2 fo2VarA = f22Var.a(v9Var, d4Var, d12Var);
        do2 do2Var = do2.f76756c;
        fo2VarA.b("success", "status");
        zs2Var.a(context, v9Var2, co2.f76357h, fo2VarA);
    }
}
