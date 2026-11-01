package com.inmobi.media;

import android.view.ViewGroup;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class J1 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M1 f22883b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J1(M1 m10, rj.c cVar) {
        super(2, cVar);
        this.f22883b = m10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new J1(this.f22883b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new J1(this.f22883b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f22882a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            M1 m10 = this.f22883b;
            ViewGroup viewGroup = m10.f23123b;
            nk.l0 l0Var = m10.f23122a;
            this.f22882a = 1;
            if (M1.a(m10, viewGroup, l0Var, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
