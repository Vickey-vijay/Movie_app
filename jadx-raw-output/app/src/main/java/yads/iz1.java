package yads;

import android.content.Context;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
public final class iz1 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mz1 f78853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ry1 f78854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi2 f78855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kz1 f78856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jz1 f78857f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz1(mz1 mz1Var, ry1 ry1Var, mi2 mi2Var, kz1 kz1Var, jz1 jz1Var, rj.c cVar) {
        super(2, cVar);
        this.f78853b = mz1Var;
        this.f78854c = ry1Var;
        this.f78855d = mi2Var;
        this.f78856e = kz1Var;
        this.f78857f = jz1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new iz1(this.f78853b, this.f78854c, this.f78855d, this.f78856e, this.f78857f, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((iz1) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        mz1 mz1Var = this.f78853b;
        oz1 oz1Var = mz1Var.f80483f;
        Context context = mz1Var.f80482e;
        ry1 ry1Var = this.f78854c;
        mi2 mi2Var = this.f78855d;
        xz1 xz1Var = this.f78856e.f79627d;
        hz1 hz1Var = this.f78857f.f79249a;
        sy1 sy1Var = (sy1) oz1Var.f81179d.f83241a.get(oz1Var.f81176a.f76564f);
        if (sy1Var != null) {
            sy1Var.a(context, ry1Var, mi2Var, oz1Var.f81178c, xz1Var, oz1Var.f81177b, hz1Var);
        } else {
            hz1Var.a(h9.f78101a);
        }
        return mj.r.f64562a;
    }
}
