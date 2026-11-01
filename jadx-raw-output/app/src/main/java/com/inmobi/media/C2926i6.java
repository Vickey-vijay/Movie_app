package com.inmobi.media;

import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.i6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2926i6 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3000l6 f24543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2824e6 f24544c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2926i6(C3000l6 c3000l6, C2824e6 c2824e6, rj.c cVar) {
        super(2, cVar);
        this.f24543b = c3000l6;
        this.f24544c = c2824e6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2926i6(this.f24543b, this.f24544c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2926i6(this.f24543b, this.f24544c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f24542a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            AbstractC2799d6 abstractC2799d6 = this.f24543b.f24740b;
            ArrayList arrayList = this.f24544c.f24296a;
            this.f24542a = 1;
            if (abstractC2799d6.a(arrayList, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
