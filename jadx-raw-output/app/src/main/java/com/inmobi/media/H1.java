package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes5.dex */
public final class H1 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I1 f22768a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H1(I1 i10, rj.c cVar) {
        super(2, cVar);
        this.f22768a = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new H1(this.f22768a, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new H1(this.f22768a, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, mj.r] */
    /* JADX WARN: Type inference failed for: r3v4 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        I1 i10;
        sj.a.f();
        kotlin.c.b(obj);
        boolean z10 = 0;
        z10 = 0;
        try {
            try {
                I1 i11 = this.f22768a;
                i11.f22836c = i11.f22834a.invoke();
                i10 = this.f22768a;
            } catch (Exception e10) {
                e10.getMessage();
                i10 = this.f22768a;
            }
            i10.f22837d.set(false);
            z10 = mj.r.f64562a;
            return z10;
        } catch (Throwable th2) {
            this.f22768a.f22837d.set(z10);
            throw th2;
        }
    }
}
