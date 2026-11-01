package yads;

import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes10.dex */
public final class p80 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public wk.a f81300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q80 f81301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q80 f81302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f81303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f81304f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q80 f81305g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f81306h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p80(q80 q80Var, boolean z10, rj.c cVar) {
        super(2, cVar);
        this.f81305g = q80Var;
        this.f81306h = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new p80(this.f81305g, this.f81306h, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new p80(this.f81305g, this.f81306h, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0074  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        q80 q80Var;
        wk.a aVar;
        boolean z10;
        q80 q80Var2;
        wk.a aVar2;
        Object objM3466unboximpl;
        q80 q80Var3;
        Object objF = sj.a.f();
        int i10 = this.f81304f;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        q80Var2 = this.f81302d;
                        q80Var3 = this.f81301c;
                        aVar2 = this.f81300b;
                        try {
                            kotlin.c.b(obj);
                            objM3466unboximpl = ((Result) obj).m3466unboximpl();
                            if (Result.m3463isFailureimpl(objM3466unboximpl)) {
                                objM3466unboximpl = null;
                            }
                            q80Var2.f81771e = (j80) objM3466unboximpl;
                            q80Var = q80Var3;
                            u50 u50VarA = q80Var.f81769c.a(q80Var.f81767a.a(), q80Var.f81771e);
                            aVar2.b(null);
                            return u50VarA;
                        } catch (Throwable th2) {
                            th = th2;
                            aVar = aVar2;
                            aVar.b(null);
                            throw th;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z10 = this.f81303e;
                q80 q80Var4 = this.f81301c;
                aVar = this.f81300b;
                kotlin.c.b(obj);
                q80Var = q80Var4;
            } else {
                kotlin.c.b(obj);
                q80Var = this.f81305g;
                wk.a aVar3 = q80Var.f81772f;
                boolean z11 = this.f81306h;
                this.f81300b = aVar3;
                this.f81301c = q80Var;
                this.f81303e = z11;
                this.f81304f = 1;
                if (aVar3.a(null, this) == objF) {
                    return objF;
                }
                aVar = aVar3;
                z10 = z11;
            }
            if (q80Var.f81771e != null && !z10) {
                aVar2 = aVar;
            } else {
                cn2 cn2Var = q80Var.f81768b;
                this.f81300b = aVar;
                this.f81301c = q80Var;
                this.f81302d = q80Var;
                this.f81304f = 2;
                Object objA = cn2Var.a(this);
                if (objA == objF) {
                    return objF;
                }
                q80Var2 = q80Var;
                aVar2 = aVar;
                objM3466unboximpl = objA;
                q80Var3 = q80Var2;
                if (Result.m3463isFailureimpl(objM3466unboximpl)) {
                    objM3466unboximpl = null;
                }
                q80Var2.f81771e = (j80) objM3466unboximpl;
                q80Var = q80Var3;
            }
            u50 u50VarA2 = q80Var.f81769c.a(q80Var.f81767a.a(), q80Var.f81771e);
            aVar2.b(null);
            return u50VarA2;
        } catch (Throwable th3) {
            th = th3;
            aVar.b(null);
            throw th;
        }
    }
}
