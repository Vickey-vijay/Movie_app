package yads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes11.dex */
public final class d10 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g10 f76505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g9 f76506c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d10(g10 g10Var, g9 g9Var, rj.c cVar) {
        super(2, cVar);
        this.f76505b = g10Var;
        this.f76506c = g9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new d10(this.f76505b, this.f76506c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new d10(this.f76505b, this.f76506c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        g10 g10Var = this.f76505b;
        b12 b12Var = new b12(g10Var.f77582b, ((iu3) g10Var.f77581a).a());
        o02 o02Var = this.f76505b.f77584d;
        g9 g9Var = this.f76506c;
        v42 v42Var = v42.f83737c;
        o02Var.getClass();
        p02 p02Var = new p02(o02Var.f80881a, o02Var.f80882b, new a12(g9Var, v42Var, b12Var, 1), o02Var, o02Var.f80883c, 464);
        o02Var.f80884d.add(p02Var);
        c10 c10Var = o02Var.f80886f;
        v02 v02Var = p02Var.f81196b.f80020x;
        v02Var.f83720d = c10Var;
        v02Var.f83719c.a(c10Var, null, null);
        p02Var.a();
        return mj.r.f64562a;
    }
}
