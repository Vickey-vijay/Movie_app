package yads;

import android.content.Context;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes10.dex */
public final class qn extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zn f81905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ra3 f81906c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn(zn znVar, ra3 ra3Var, rj.c cVar) {
        super(2, cVar);
        this.f81905b = znVar;
        this.f81906c = ra3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new qn(this.f81905b, this.f81906c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new qn(this.f81905b, this.f81906c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z10;
        sj.a.f();
        kotlin.c.b(obj);
        zn znVar = this.f81905b;
        synchronized (znVar) {
            z10 = znVar.f85513s;
        }
        if (!z10) {
            String strA = this.f81906c.a(this.f81905b.f85497c);
            if (strA != null && strA.length() != 0) {
                this.f81905b.f85496b.a(v5.f83758r, null);
                this.f81905b.f85497c.f76565g = this.f81906c.a();
                zn znVar2 = this.f81905b;
                d4 d4Var = znVar2.f85497c;
                sp2 sp2Var = znVar2.f85509o;
                Context context = znVar2.f85495a;
                sp2Var.getClass();
                d4Var.f76572n = context.getResources().getConfiguration().orientation;
                ra3 ra3Var = this.f81906c;
                zn znVar3 = this.f81905b;
                this.f81905b.f85511q.a(this.f81905b.a(strA, ra3Var.a(znVar3.f85495a, znVar3.f85497c, znVar3.f85503i)));
            } else {
                this.f81905b.b(h9.f78110j);
            }
        }
        return mj.r.f64562a;
    }
}
