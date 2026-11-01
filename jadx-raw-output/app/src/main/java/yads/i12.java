package yads;

import com.ironsource.Q6;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class i12 implements fq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f78448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t22 f78449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jr1 f78450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v9 f78451d;

    public /* synthetic */ i12(d4 d4Var) {
        this(d4Var, new f22(), new jr1());
    }

    public final fo2 a() {
        fo2 fo2Var;
        fo2 fo2Var2 = new fo2((Map) null, 3);
        v9 v9Var = this.f78451d;
        if (v9Var == null) {
            return fo2Var2;
        }
        fo2 fo2VarA = go2.a(fo2Var2, this.f78449b.a(v9Var, this.f78448a, (d12) v9Var.f83828t));
        qq1 qq1Var = this.f78448a.f76569k;
        jr1 jr1Var = this.f78450c;
        if (qq1Var != null) {
            jr1Var.getClass();
            fo2Var = jr1.a(qq1Var);
        } else {
            jr1Var.getClass();
            fo2Var = new fo2(new LinkedHashMap(), 2);
            fo2Var.b(bo2.f75924a, Q6.G1);
        }
        return go2.a(fo2VarA, fo2Var);
    }

    public i12(d4 d4Var, t22 t22Var, jr1 jr1Var) {
        this.f78448a = d4Var;
        this.f78449b = t22Var;
        this.f78450c = jr1Var;
    }

    public final void a(v9 v9Var) {
        this.f78451d = v9Var;
    }
}
