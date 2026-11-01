package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.dj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2812dj extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wk.a f24250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC2863fj f24251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC2786cj f24252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC2786cj f24253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC2863fj f24255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2786cj f24256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2786cj f24257h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2812dj(AbstractC2863fj abstractC2863fj, InterfaceC2786cj interfaceC2786cj, InterfaceC2786cj interfaceC2786cj2, rj.c cVar) {
        super(2, cVar);
        this.f24255f = abstractC2863fj;
        this.f24256g = interfaceC2786cj;
        this.f24257h = interfaceC2786cj2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2812dj(this.f24255f, this.f24256g, this.f24257h, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((C2812dj) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        wk.a aVar;
        InterfaceC2786cj interfaceC2786cj;
        AbstractC2863fj abstractC2863fj;
        InterfaceC2786cj interfaceC2786cj2;
        Object objF = sj.a.f();
        int i10 = this.f24254e;
        if (i10 != 0) {
            if (i10 == 1) {
                interfaceC2786cj2 = this.f24253d;
                interfaceC2786cj = this.f24252c;
                abstractC2863fj = this.f24251b;
                aVar = this.f24250a;
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            AbstractC2863fj abstractC2863fj2 = this.f24255f;
            aVar = abstractC2863fj2.f24381b;
            interfaceC2786cj = this.f24256g;
            InterfaceC2786cj interfaceC2786cj3 = this.f24257h;
            this.f24250a = aVar;
            this.f24251b = abstractC2863fj2;
            this.f24252c = interfaceC2786cj;
            this.f24253d = interfaceC2786cj3;
            this.f24254e = 1;
            if (aVar.a(null, this) == objF) {
                return objF;
            }
            abstractC2863fj = abstractC2863fj2;
            interfaceC2786cj2 = interfaceC2786cj3;
        }
        try {
            abstractC2863fj.b(interfaceC2786cj, interfaceC2786cj2);
            return mj.r.f64562a;
        } finally {
            aVar.b(null);
        }
    }
}
