package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSession;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C2742b1 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC2819e1 f24030a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2742b1(AbstractC2819e1 abstractC2819e1, rj.c cVar) {
        super(2, cVar);
        this.f24030a = abstractC2819e1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2742b1(this.f24030a, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2742b1(this.f24030a, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        try {
            AdSession adSession = this.f24030a.f24279c;
            if (adSession != null) {
                adSession.start();
            }
        } catch (Exception e10) {
            AbstractC2819e1 abstractC2819e1 = this.f24030a;
            abstractC2819e1.f24279c = null;
            InterfaceC3028m9 interfaceC3028m9 = abstractC2819e1.f24278b;
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).a(AbstractC2819e1.f24276f, "AdSession start error " + e10);
            }
        }
        return mj.r.f64562a;
    }
}
