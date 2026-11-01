package com.inmobi.media;

import com.inmobi.media.C2781ce;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.ce, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2781ce extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3207te f24131a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2781ce(C3207te c3207te, rj.c cVar) {
        super(2, cVar);
        this.f24131a = c3207te;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2781ce(this.f24131a, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2781ce(this.f24131a, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    public static final mj.r a(C3207te c3207te, short s10) {
        InterfaceC3028m9 interfaceC3028m9L = c3207te.l();
        if (interfaceC3028m9L != null) {
            ((C3053n9) interfaceC3028m9L).a("NativeRenderedState", "onAssetClickEvent " + ((int) s10));
        }
        ((Sc) c3207te.f25388b.f25475m.getValue()).a(s10);
        return mj.r.f64562a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        Ug ug2 = (Ug) this.f24131a.f25388b.f25477o.getValue();
        final C3207te c3207te = this.f24131a;
        Sg sg2 = c3207te.f25388b.f25465c;
        bk.l lVar = new bk.l() { // from class: b7.x5
            @Override // bk.l
            public final Object invoke(Object obj2) {
                return C2781ce.a(c3207te, ((Short) obj2).shortValue());
            }
        };
        ug2.getClass();
        Ug.a(sg2, lVar);
        return mj.r.f64562a;
    }
}
