package com.inmobi.media;

import java.util.Collection;
import java.util.LinkedList;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes5.dex */
public final class F4 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22618a;

    public F4(rj.c cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new F4(cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new F4((rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f22618a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            C4 c10 = (C4) K4.f22997b.getValue();
            this.f22618a = 1;
            obj = c10.a(this);
            if (obj == objF) {
                return objF;
            }
        }
        LinkedList linkedList = new LinkedList((Collection) obj);
        K4.f22998c = linkedList;
        Object objClone = linkedList.clone();
        ck.p.h(objClone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
        K4.f22999d = (LinkedList) objClone;
        return mj.r.f64562a;
    }
}
