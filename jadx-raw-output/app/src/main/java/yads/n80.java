package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes2.dex */
public final class n80 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b80 f80592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c80 f80593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f80594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o80 f80595e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n80(o80 o80Var, rj.c cVar) {
        super(2, cVar);
        this.f80595e = o80Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new n80(this.f80595e, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new n80(this.f80595e, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        b80 b80VarA;
        c80 c80Var;
        Object objM3466unboximpl;
        List listK;
        List list;
        Object objF = sj.a.f();
        int i10 = this.f80594d;
        if (i10 != 0) {
            if (i10 == 1) {
                c80Var = this.f80593c;
                b80VarA = this.f80592b;
                kotlin.c.b(obj);
                objM3466unboximpl = ((Result) obj).m3466unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            b80VarA = this.f80595e.f80961a.a();
            c80 c80Var2 = b80VarA.f75764f;
            if (c80Var2 == null) {
                return y61.f84831a;
            }
            cn2 cn2Var = this.f80595e.f80962b;
            this.f80592b = b80VarA;
            this.f80593c = c80Var2;
            this.f80594d = 1;
            Object objA = cn2Var.a(this);
            if (objA == objF) {
                return objF;
            }
            c80Var = c80Var2;
            objM3466unboximpl = objA;
        }
        if (Result.m3463isFailureimpl(objM3466unboximpl)) {
            objM3466unboximpl = null;
        }
        j80 j80Var = (j80) objM3466unboximpl;
        if (j80Var == null || (listK = j80Var.f78944g) == null) {
            listK = nj.s.k();
        }
        List list2 = b80VarA.f75761c;
        ArrayList arrayListA = this.f80595e.f80963c.a(listK);
        if (arrayListA.isEmpty()) {
            list = list2;
        } else {
            list = arrayListA;
        }
        return this.f80595e.f80965e.a(this.f80595e.f80964d.a(new m80(b80VarA.f75759a, b80VarA.f75760b, list, b80VarA.f75762d, c80Var.f76207a, c80Var.f76208b)));
    }
}
