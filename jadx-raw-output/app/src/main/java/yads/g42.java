package yads;

import android.content.Context;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
public final class g42 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f77628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j42 f77629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f77630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ry1 f77631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z30 f77632f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g42(j42 j42Var, Context context, ry1 ry1Var, z30 z30Var, rj.c cVar) {
        super(2, cVar);
        this.f77629c = j42Var;
        this.f77630d = context;
        this.f77631e = ry1Var;
        this.f77632f = z30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new g42(this.f77629c, this.f77630d, this.f77631e, this.f77632f, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((g42) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f77628b;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            h62 h62Var = this.f77629c.f78914c;
            Context context = this.f77630d;
            ry1 ry1Var = this.f77631e;
            z30 z30Var = this.f77632f;
            this.f77628b = 1;
            obj = h62Var.a(true, context, ry1Var, z30Var, (rj.c) this);
            if (obj == objF) {
                return objF;
            }
        }
        return obj;
    }
}
