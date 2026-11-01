package yads;

import android.content.Context;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes2.dex */
public final class th2 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f83046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xh2 f83047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f83048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e00 f83049e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a03 f83050f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f83051g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f83052h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th2(long j10, Context context, e00 e00Var, a03 a03Var, xh2 xh2Var, List list, rj.c cVar) {
        super(2, cVar);
        this.f83047c = xh2Var;
        this.f83048d = context;
        this.f83049e = e00Var;
        this.f83050f = a03Var;
        this.f83051g = list;
        this.f83052h = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        xh2 xh2Var = this.f83047c;
        return new th2(this.f83052h, this.f83048d, this.f83049e, this.f83050f, xh2Var, this.f83051g, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((th2) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f83046b;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            xh2 xh2Var = this.f83047c;
            Context context = this.f83048d;
            e00 e00Var = this.f83049e;
            a03 a03Var = this.f83050f;
            List list = this.f83051g;
            long j10 = this.f83052h;
            this.f83046b = 1;
            obj = xh2.a(j10, context, e00Var, a03Var, xh2Var, list, this);
            if (obj == objF) {
                return objF;
            }
        }
        return obj;
    }
}
