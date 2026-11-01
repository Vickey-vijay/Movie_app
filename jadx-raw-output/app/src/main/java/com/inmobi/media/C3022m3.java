package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.m3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3022m3 extends SuspendLambda implements bk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f24798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f24799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3028m9 f24800d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3022m3(String str, boolean z10, InterfaceC3028m9 interfaceC3028m9, rj.c cVar) {
        super(1, cVar);
        this.f24798b = str;
        this.f24799c = z10;
        this.f24800d = interfaceC3028m9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(rj.c cVar) {
        return new C3022m3(this.f24798b, this.f24799c, this.f24800d, cVar);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        return ((C3022m3) create((rj.c) obj)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f24797a;
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
                ck.p.i("w3", "access$getTAG$p(...)");
                C3271w3 c3271w4 = C3271w3.f25610a;
                if (C3271w3.e()) {
                    int maxRetries = C3271w3.c().getMaxRetries();
                    String str = this.f24798b;
                    S2 s10 = new S2(str, this.f24799c, false, maxRetries + 1, 197);
                    InterfaceC3028m9 interfaceC3028m9 = this.f24800d;
                    if (interfaceC3028m9 != null) {
                        ck.p.i("w3", "access$getTAG$p(...)");
                        ((C3053n9) interfaceC3028m9).a("w3", "Received click (" + str + ") for pinging over HTTP");
                    }
                    InterfaceC3028m9 interfaceC3028m10 = this.f24800d;
                    this.f24797a = 1;
                    if (c3271w4.a(s10, null, interfaceC3028m10, this) == objF) {
                        return objF;
                    }
                }
            }
        } catch (Exception e10) {
            InterfaceC3028m9 interfaceC3028m11 = this.f24800d;
            if (interfaceC3028m11 != null) {
                C3271w3 c3271w5 = C3271w3.f25610a;
                ck.p.i("w3", "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m11).b("w3", "SDK encountered unexpected error in pinging click; " + e10.getMessage());
            }
        }
        return mj.r.f64562a;
    }
}
