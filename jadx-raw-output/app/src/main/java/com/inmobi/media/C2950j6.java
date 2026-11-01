package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: renamed from: com.inmobi.media.j6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2950j6 extends SuspendLambda implements bk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3000l6 f24589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f24590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f24591d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2950j6(C3000l6 c3000l6, boolean z10, Ref$ObjectRef ref$ObjectRef, rj.c cVar) {
        super(1, cVar);
        this.f24589b = c3000l6;
        this.f24590c = z10;
        this.f24591d = ref$ObjectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(rj.c cVar) {
        return new C2950j6(this.f24589b, this.f24590c, this.f24591d, cVar);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        return ((C2950j6) create((rj.c) obj)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f24588a;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    kotlin.c.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.c.b(obj);
                C3000l6 c3000l6 = this.f24589b;
                boolean z10 = this.f24590c;
                this.f24588a = 1;
                if (C3000l6.a(c3000l6, z10, this) == objF) {
                    return objF;
                }
            }
        } catch (Exception unused) {
            kotlinx.coroutines.g gVar = (kotlinx.coroutines.g) this.f24591d.element;
            if (gVar != null) {
                kotlinx.coroutines.g.a.a(gVar, null, 1, null);
            }
        }
        return mj.r.f64562a;
    }
}
