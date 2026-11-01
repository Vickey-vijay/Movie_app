package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.co, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2791co extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f24206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3028m9 f24207c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2791co(String str, InterfaceC3028m9 interfaceC3028m9, rj.c cVar) {
        super(2, cVar);
        this.f24206b = str;
        this.f24207c = interfaceC3028m9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2791co(this.f24206b, this.f24207c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2791co(this.f24206b, this.f24207c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f24205a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.c.b(obj);
        jo joVar = jo.f24636a;
        String str = this.f24206b;
        InterfaceC3028m9 interfaceC3028m9 = this.f24207c;
        this.f24205a = 1;
        Object objA = joVar.a(str, interfaceC3028m9, this);
        if (objA == objF) {
            return objF;
        }
        return objA;
    }
}
