package yads;

import android.content.Context;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class f62 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f77311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h62 f77312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f77313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v9 f77314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ry1 f77315f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z30 f77316g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f62(h62 h62Var, Context context, v9 v9Var, ry1 ry1Var, z30 z30Var, rj.c cVar) {
        super(2, cVar);
        this.f77312c = h62Var;
        this.f77313d = context;
        this.f77314e = v9Var;
        this.f77315f = ry1Var;
        this.f77316g = z30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new f62(this.f77312c, this.f77313d, this.f77314e, this.f77315f, this.f77316g, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((f62) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f77311b;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            h62 h62Var = this.f77312c;
            Context context = this.f77313d;
            v9 v9Var = this.f77314e;
            ry1 ry1Var = this.f77315f;
            z30 z30Var = this.f77316g;
            this.f77311b = 1;
            if (h62Var.a(context, v9Var, ry1Var, z30Var, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
