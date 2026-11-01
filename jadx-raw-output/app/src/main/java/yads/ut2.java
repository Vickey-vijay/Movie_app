package yads;

import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes2.dex */
public final class ut2 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public wk.a f83608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public vt2 f83609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q61 f83610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f83611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vt2 f83612f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q61 f83613g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ut2(vt2 vt2Var, q61 q61Var, rj.c cVar) {
        super(2, cVar);
        this.f83612f = vt2Var;
        this.f83613g = q61Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new ut2(this.f83612f, this.f83613g, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new ut2(this.f83612f, this.f83613g, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        wk.a aVar;
        vt2 vt2Var;
        q61 q61Var;
        wk.a aVar2;
        Object objF = sj.a.f();
        int i10 = this.f83611e;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        aVar2 = this.f83608b;
                        try {
                            kotlin.c.b(obj);
                            iu2 iu2Var = (iu2) obj;
                            aVar2.b(null);
                            return iu2Var;
                        } catch (Throwable th2) {
                            th = th2;
                            aVar = aVar2;
                            aVar.b(null);
                            throw th;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q61Var = this.f83610d;
                vt2Var = this.f83609c;
                aVar = this.f83608b;
                kotlin.c.b(obj);
            } else {
                kotlin.c.b(obj);
                this.f83612f.f84006a.a(v5.f83750j, null);
                aVar = vt2.f84005d;
                vt2Var = this.f83612f;
                q61Var = this.f83613g;
                this.f83608b = aVar;
                this.f83609c = vt2Var;
                this.f83610d = q61Var;
                this.f83611e = 1;
                if (aVar.a(null, this) == objF) {
                    return objF;
                }
            }
            vt2Var.f84006a.a(v5.f83750j);
            this.f83608b = aVar;
            this.f83609c = vt2Var;
            this.f83610d = q61Var;
            this.f83611e = 2;
            kotlinx.coroutines.c cVar = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(this), 1);
            cVar.J();
            cVar.p(new st2(vt2Var));
            vt2Var.f84008c.a(vt2Var.f84007b, q61Var, new tt2(cVar));
            obj = cVar.B();
            if (obj == sj.a.f()) {
                tj.f.c(this);
            }
            if (obj == objF) {
                return objF;
            }
            aVar2 = aVar;
            iu2 iu2Var2 = (iu2) obj;
            aVar2.b(null);
            return iu2Var2;
        } catch (Throwable th3) {
            th = th3;
            aVar.b(null);
            throw th;
        }
    }
}
