package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.n3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3047n3 extends SuspendLambda implements bk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f24873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3053n9 f24874c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3047n3(String str, C3053n9 c3053n9, rj.c cVar) {
        super(1, cVar);
        this.f24873b = str;
        this.f24874c = c3053n9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(rj.c cVar) {
        return new C3047n3(this.f24873b, this.f24874c, cVar);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        return new C3047n3(this.f24873b, this.f24874c, (rj.c) obj).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f24872a;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    kotlin.c.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.c.b(obj);
                C3271w3 c3271w3 = C3271w3.f25610a;
                if (C3271w3.e()) {
                    int maxRetries = C3271w3.c().getMaxRetries();
                    String str = this.f24873b;
                    S2 s10 = new S2(str, true, false, maxRetries + 1, 193);
                    C3053n9 c3053n9 = this.f24874c;
                    if (c3053n9 != null) {
                        ck.p.i("w3", "access$getTAG$p(...)");
                        c3053n9.a("w3", "Received click (" + str + ") for pinging over HTTP");
                    }
                    C3053n9 c3053n10 = this.f24874c;
                    this.f24872a = 1;
                    if (c3271w3.a(s10, null, c3053n10, this) == objF) {
                        return objF;
                    }
                }
            }
        } catch (Exception e10) {
            C3053n9 c3053n11 = this.f24874c;
            if (c3053n11 != null) {
                C3271w3 c3271w4 = C3271w3.f25610a;
                ck.p.i("w3", "access$getTAG$p(...)");
                c3053n11.b("w3", "SDK encountered unexpected error in pinging click; " + e10.getMessage());
            }
            mj.g gVar = P9.f23321a;
            AbstractC2929i9.a(e10);
        }
        return mj.r.f64562a;
    }
}
