package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class bq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f75927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io2 f75928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ij f75929c;

    public /* synthetic */ bq(o5 o5Var, e00 e00Var, v9 v9Var, String str, at1 at1Var) {
        this(v9Var, at1Var, new ij(o5Var, e00Var, str));
    }

    public final void a(String str) {
        fo2 fo2VarA = this.f75929c.a();
        fo2VarA.b("no_view_for_asset", "reason");
        fo2VarA.b(str, "asset_name");
        Map map = this.f75927a.f83829u;
        if (map != null) {
            fo2VarA.f77471a.putAll(map);
        }
        c cVar = this.f75927a.f83817i;
        fo2VarA.f77472b = cVar;
        this.f75928b.a(new eo2(co2.A.a(), kotlin.collections.a.B(fo2VarA.f77471a), cVar));
    }

    public bq(v9 v9Var, at1 at1Var, ij ijVar) {
        this.f75927a = v9Var;
        this.f75928b = at1Var;
        this.f75929c = ijVar;
    }
}
