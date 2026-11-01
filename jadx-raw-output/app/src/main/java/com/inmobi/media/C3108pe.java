package com.inmobi.media;

import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.pe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3108pe extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3207te f25077b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3108pe(C3207te c3207te, rj.c cVar) {
        super(2, cVar);
        this.f25077b = c3207te;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3108pe(this.f25077b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3108pe(this.f25077b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f25076a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            InterfaceC3028m9 interfaceC3028m9L = this.f25077b.l();
            if (interfaceC3028m9L != null) {
                ((C3053n9) interfaceC3028m9L).a("NativeRenderedState", "MRC50 Tracking Started");
            }
            qk.c cVarB = ((Fd) this.f25077b.f25388b.f25473k.getValue()).f22640a.b();
            C3083oe c3083oe = new C3083oe(null);
            this.f25076a = 1;
            if (qk.e.q(cVarB, c3083oe, this) == objF) {
                return objF;
            }
        }
        InterfaceC3028m9 interfaceC3028m9L2 = this.f25077b.l();
        if (interfaceC3028m9L2 != null) {
            ((C3053n9) interfaceC3028m9L2).a("NativeRenderedState", "MRC50 Event Occurred");
        }
        C3232ue c3232ue = this.f25077b.f25388b;
        c3232ue.f25464b.f25342d = true;
        Map mapA = AbstractC2939ik.a(((Dc) c3232ue.f25469g.f22588f.getValue()).f22517a);
        Wj wj2 = Wj.f23753a;
        Wj.b("MRCViewable50Rendered", mapA, EnumC2735ak.SDK);
        this.f25077b.f25388b.f25468f.f23238b.f23077g.a(Te.f23560a);
        ((Fd) this.f25077b.f25388b.f25473k.getValue()).f22640a.a();
        return mj.r.f64562a;
    }
}
