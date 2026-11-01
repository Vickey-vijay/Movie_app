package yads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes11.dex */
public final class un extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d4 f83542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f83543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f83544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zn f83545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ra3 f83546f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hp f83547g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un(zn znVar, ra3 ra3Var, hp hpVar, rj.c cVar) {
        super(2, cVar);
        this.f83545e = znVar;
        this.f83546f = ra3Var;
        this.f83547g = hpVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        un unVar = new un(this.f83545e, this.f83546f, this.f83547g, cVar);
        unVar.f83544d = obj;
        return unVar;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((un) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        nk.p0 p0Var;
        d4 d4Var;
        d4 d4Var2;
        zn znVar;
        ra3 ra3Var;
        Object objF = sj.a.f();
        int i10 = this.f83543c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    d4Var2 = (d4) this.f83544d;
                    kotlin.c.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                d4Var = this.f83542b;
                p0Var = (nk.p0) this.f83544d;
                kotlin.c.b(obj);
            }
            d4Var2.f76567i = (String) obj;
            this.f83545e.f85496b.a(v5.f83747g);
            znVar = this.f83545e;
            ra3Var = this.f83546f;
            synchronized (znVar) {
                nk.j.d(znVar.f85499e, null, null, new qn(znVar, ra3Var, null), 3, null);
            }
            return mj.r.f64562a;
        }
        kotlin.c.b(obj);
        nk.l0 l0Var = (nk.l0) this.f83544d;
        nk.p0 p0VarB = nk.j.b(l0Var, null, null, new tn(this.f83545e, this.f83547g, null), 3, null);
        nk.p0 p0VarB2 = nk.j.b(l0Var, null, null, new sn(this.f83545e, this.f83547g, null), 3, null);
        d4 d4Var3 = this.f83545e.f85497c;
        this.f83544d = p0VarB;
        this.f83542b = d4Var3;
        this.f83543c = 1;
        obj = p0VarB2.y(this);
        if (obj == objF) {
            return objF;
        }
        p0Var = p0VarB;
        d4Var = d4Var3;
        d4Var.f76566h = (String) obj;
        d4 d4Var4 = this.f83545e.f85497c;
        this.f83544d = d4Var4;
        this.f83542b = null;
        this.f83543c = 2;
        Object objY = p0Var.y(this);
        if (objY == objF) {
            return objF;
        }
        d4Var2 = d4Var4;
        obj = objY;
        d4Var2.f76567i = (String) obj;
        this.f83545e.f85496b.a(v5.f83747g);
        znVar = this.f83545e;
        ra3Var = this.f83546f;
        synchronized (znVar) {
            nk.j.d(znVar.f85499e, null, null, new qn(znVar, ra3Var, null), 3, null);
            return mj.r.f64562a;
        }
    }
}
