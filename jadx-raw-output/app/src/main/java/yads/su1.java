package yads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes9.dex */
public final class su1 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f82749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lu2 f82750c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su1(Context context, lu2 lu2Var, rj.c cVar) {
        super(2, cVar);
        this.f82749b = context;
        this.f82750c = lu2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new su1(this.f82749b, this.f82750c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new su1(this.f82749b, this.f82750c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        boolean z10 = ha3.f78156a;
        ha3.a(this.f82749b, ((iu3) this.f82750c).a());
        xf.a(this.f82749b, ((iu3) this.f82750c).a());
        AtomicBoolean atomicBoolean = ji.f79048a;
        ji.a(this.f82749b, ((iu3) this.f82750c).a());
        return mj.r.f64562a;
    }
}
