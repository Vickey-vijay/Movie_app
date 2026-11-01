package com.inmobi.media;

import android.content.Context;
import java.util.Calendar;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class Ib extends SuspendLambda implements bk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Jb f22857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f22858c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ib(Jb jb2, Context context, rj.c cVar) {
        super(1, cVar);
        this.f22857b = jb2;
        this.f22858c = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(rj.c cVar) {
        return new Ib(this.f22857b, this.f22858c, cVar);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        return new Ib(this.f22857b, this.f22858c, (rj.c) obj).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f22856a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            if (this.f22857b.f22923g.get()) {
                return mj.r.f64562a;
            }
            Jb jb2 = this.f22857b;
            Context context = this.f22858c;
            this.f22856a = 1;
            if (jb2.a(context, this) == objF) {
                return objF;
            }
        }
        nk.l0 l0Var = Sb.f23496a;
        C3304xb c3304xb = (C3304xb) AbstractC3329yb.f25781a.getValue();
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        Jb jb3 = this.f22857b;
        long j10 = timeInMillis - jb3.f22919c;
        int i11 = jb3.f22921e;
        ck.p.j(c3304xb, "dao");
        if (!Sb.f23498c.getAndSet(true)) {
            Qb qb2 = new Qb(c3304xb, j10, i11, null);
            nk.l0 l0Var2 = AbstractC2940il.f24565a;
            ck.p.j(qb2, "runnable");
            nk.j.d(AbstractC2940il.f24565a, null, null, new C2865fl(10000L, null, qb2), 3, null);
        }
        return mj.r.f64562a;
    }
}
