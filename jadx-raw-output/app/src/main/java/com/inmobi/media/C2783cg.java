package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.cg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2783cg extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2834eg f24135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f24136c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2783cg(C2834eg c2834eg, String str, rj.c cVar) {
        super(2, cVar);
        this.f24135b = c2834eg;
        this.f24136c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2783cg(this.f24135b, this.f24136c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2783cg(this.f24135b, this.f24136c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f24134a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            C2834eg c2834eg = this.f24135b;
            String str = this.f24136c;
            this.f24134a = 1;
            if (c2834eg.a(str, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
