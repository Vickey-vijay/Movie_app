package yads;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class km2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f79473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io2 f79474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ij f79475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f79476d;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ km2(Context context, lu2 lu2Var, o5 o5Var, e00 e00Var, v9 v9Var, String str) {
        iu3 iu3Var = (iu3) lu2Var;
        iu3Var.d();
        pu3 pu3Var = pu3.f81606a;
        this(o5Var, e00Var, v9Var, str, cf.a(context, iu3Var.b()));
    }

    public final void a() {
        if (this.f79476d) {
            this.f79476d = false;
            return;
        }
        fo2 fo2VarA = this.f79475c.a();
        Map map = this.f79473a.f83829u;
        if (map != null) {
            fo2VarA.f77471a.putAll(map);
        }
        c cVar = this.f79473a.f83817i;
        fo2VarA.f77472b = cVar;
        this.f79474b.a(new eo2(co2.f76375z.a(), kotlin.collections.a.B(fo2VarA.f77471a), cVar));
    }

    public km2(o5 o5Var, e00 e00Var, v9 v9Var, String str, io2 io2Var) {
        this.f79473a = v9Var;
        this.f79474b = io2Var;
        this.f79475c = new ij(o5Var, e00Var, str);
        this.f79476d = true;
    }
}
