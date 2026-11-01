package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: renamed from: com.inmobi.media.sa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3178sa extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC3079oa f25312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref$IntRef f25313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ref$IntRef f25314d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3178sa(ViewTreeObserverOnGlobalLayoutListenerC3079oa viewTreeObserverOnGlobalLayoutListenerC3079oa, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, rj.c cVar) {
        super(2, cVar);
        this.f25312b = viewTreeObserverOnGlobalLayoutListenerC3079oa;
        this.f25313c = ref$IntRef;
        this.f25314d = ref$IntRef2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3178sa(this.f25312b, this.f25313c, this.f25314d, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((C3178sa) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f25311a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            nk.u uVar = this.f25312b.f24975e;
            this.f25311a = 1;
            if (uVar.y(this) == objF) {
                return objF;
            }
        }
        Ref$IntRef ref$IntRef = this.f25313c;
        ViewTreeObserverOnGlobalLayoutListenerC3079oa viewTreeObserverOnGlobalLayoutListenerC3079oa = this.f25312b;
        ref$IntRef.element = viewTreeObserverOnGlobalLayoutListenerC3079oa.f24973c;
        this.f25314d.element = viewTreeObserverOnGlobalLayoutListenerC3079oa.f24974d;
        return mj.r.f64562a;
    }
}
