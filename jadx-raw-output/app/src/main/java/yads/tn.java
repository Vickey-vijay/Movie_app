package yads;

import android.content.Context;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes11.dex */
public final class tn extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f83104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zn f83105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hp f83106d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn(zn znVar, hp hpVar, rj.c cVar) {
        super(2, cVar);
        this.f83105c = znVar;
        this.f83106d = hpVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new tn(this.f83105c, this.f83106d, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new tn(this.f83105c, this.f83106d, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f83104b;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            zn znVar = this.f83105c;
            fh2 fh2Var = znVar.f85507m;
            Context context = znVar.f85495a;
            hp hpVar = this.f83106d;
            this.f83104b = 1;
            obj = fh2Var.a(context, hpVar, this);
            if (obj == objF) {
                return objF;
            }
        }
        return obj;
    }
}
