package yads;

import android.content.Context;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class z51 implements d61, uu1, vh3, nn2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y51 f85218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f5 f85219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b61 f85220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f85221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f85222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j5 f85223f;

    public final void a() {
        f5 f5Var = this.f85219b;
        String str = f5Var.f77302a.f76874a;
        if (str != null && str.length() != 0) {
            e5 e5Var = f5Var.f77303b;
            e5Var.getClass();
            synchronized (e5.f76915c) {
                e5Var.f76918b.remove(str);
                e5Var.f76918b.add(str);
            }
        }
        this.f85218a.a(this.f85223f);
    }

    @Override // yads.nn2
    public final void f() {
    }

    public final boolean i() {
        Object obj = dw2.f76819j;
        nt2 nt2VarA = cw2.a().a(this.f85221d);
        return nt2VarA == null || nt2VarA.f80795u;
    }

    public final boolean j() {
        List list = this.f85222e;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public z51(Context context, uz1 uz1Var, f5 f5Var, b61 b61Var) {
        this.f85218a = uz1Var;
        this.f85219b = f5Var;
        this.f85220c = b61Var;
        this.f85221d = context.getApplicationContext();
    }

    @Override // yads.uu1
    public final void b() {
        if (!j()) {
            b61 b61Var = this.f85220c;
            if (!b61Var.f75743d) {
                b61Var.f75743d = true;
                for (co2 co2Var : b61.f75739f) {
                    c61 c61Var = b61Var.f75740a;
                    Map map = b61Var.f75741b;
                    fo2 fo2VarA = c61Var.a();
                    fo2VarA.f77471a.putAll(map);
                    c61Var.a(co2Var, fo2VarA);
                }
            }
            if (i()) {
                a();
            }
        }
    }

    @Override // yads.d61
    public final void c() {
        if (j() && !i()) {
            a();
        }
    }

    @Override // yads.vh3
    public final void d() {
        if (!j()) {
            b61 b61Var = this.f85220c;
            if (!b61Var.f75742c) {
                b61Var.f75742c = true;
                for (co2 co2Var : b61.f75738e) {
                    c61 c61Var = b61Var.f75740a;
                    Map map = b61Var.f75741b;
                    fo2 fo2VarA = c61Var.a();
                    fo2VarA.f77471a.putAll(map);
                    c61Var.a(co2Var, fo2VarA);
                }
            }
            if (!i()) {
                a();
            }
        }
    }

    @Override // yads.uu1
    public final void e() {
        if (!j()) {
            b61 b61Var = this.f85220c;
            if (!b61Var.f75742c) {
                b61Var.f75742c = true;
                for (co2 co2Var : b61.f75738e) {
                    c61 c61Var = b61Var.f75740a;
                    Map map = b61Var.f75741b;
                    fo2 fo2VarA = c61Var.a();
                    fo2VarA.f77471a.putAll(map);
                    c61Var.a(co2Var, fo2VarA);
                }
            }
            if (!i()) {
                a();
            }
        }
    }

    @Override // yads.d61
    public final void g() {
        if (j() && i()) {
            a();
        }
    }

    @Override // yads.vh3
    public final void h() {
        if (!j()) {
            b61 b61Var = this.f85220c;
            if (!b61Var.f75743d) {
                b61Var.f75743d = true;
                for (co2 co2Var : b61.f75739f) {
                    c61 c61Var = b61Var.f75740a;
                    Map map = b61Var.f75741b;
                    fo2 fo2VarA = c61Var.a();
                    fo2VarA.f77471a.putAll(map);
                    c61Var.a(co2Var, fo2VarA);
                }
            }
            if (i()) {
                a();
            }
        }
    }

    public final void a(List list, j5 j5Var) {
        this.f85222e = list;
        this.f85223f = j5Var;
        b61 b61Var = this.f85220c;
        b61Var.f75742c = false;
        b61Var.f75743d = false;
    }
}
