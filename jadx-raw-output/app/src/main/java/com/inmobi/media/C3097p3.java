package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.p3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3097p3 extends SuspendLambda implements bk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f25034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f25035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3028m9 f25036d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3097p3(String str, boolean z10, InterfaceC3028m9 interfaceC3028m9, rj.c cVar) {
        super(1, cVar);
        this.f25034b = str;
        this.f25035c = z10;
        this.f25036d = interfaceC3028m9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(rj.c cVar) {
        return new C3097p3(this.f25034b, this.f25035c, this.f25036d, cVar);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        return ((C3097p3) create((rj.c) obj)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f25033a;
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
                    String str = this.f25034b;
                    S2 s10 = new S2(str, this.f25035c, true, maxRetries + 1, 197);
                    InterfaceC3028m9 interfaceC3028m9 = this.f25036d;
                    if (interfaceC3028m9 != null) {
                        ck.p.i("w3", "access$getTAG$p(...)");
                        ((C3053n9) interfaceC3028m9).c("w3", "Received click (" + str + ") for pinging in WebView");
                    }
                    InterfaceC3028m9 interfaceC3028m10 = this.f25036d;
                    this.f25033a = 1;
                    if (c3271w3.a(s10, null, interfaceC3028m10, this) == objF) {
                        return objF;
                    }
                }
            }
        } catch (Exception e10) {
            InterfaceC3028m9 interfaceC3028m11 = this.f25036d;
            if (interfaceC3028m11 != null) {
                C3271w3 c3271w4 = C3271w3.f25610a;
                ck.p.i("w3", "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m11).b("w3", "SDK encountered unexpected error in pinging click over WebView; " + e10.getMessage());
            }
        }
        return mj.r.f64562a;
    }
}
