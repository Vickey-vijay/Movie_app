package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes5.dex */
public final class E7 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N7 f22573a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E7(rj.c cVar, N7 n10) {
        super(2, cVar);
        this.f22573a = n10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new E7(cVar, this.f22573a);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new E7((rj.c) obj2, this.f22573a).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        if (this.f22573a.b() == EnumC3184sg.STATE_PLAYBACK_COMPLETED) {
            this.f22573a.f23211p.seekTo(0L);
            N7 n10 = this.f22573a;
            n10.f23207l.set(EnumC3184sg.STATE_PREPARED);
        }
        S7 s10 = this.f22573a.f23220y;
        if (s10.f23493e) {
            s10.a();
            s10.f23492d.a();
        } else {
            P4.a(s10.f23489a, new R7(s10, null));
        }
        C3224u6 c3224u6 = this.f22573a.f23219x;
        if (!c3224u6.f25435d.getAndSet(true)) {
            nk.l0 l0Var = c3224u6.f25433b;
            long j10 = c3224u6.f25442k;
            C3174s6 c3174s6 = new C3174s6(c3224u6, null);
            ck.p.j(l0Var, "<this>");
            ck.p.j(c3174s6, "action");
            c3224u6.f25436e = nk.j.d(l0Var, nk.w0.c().n(), null, new C3(j10, null, c3174s6), 2, null);
            nk.l0 l0Var2 = c3224u6.f25433b;
            long j11 = c3224u6.f25443l;
            C3199t6 c3199t6 = new C3199t6(c3224u6, null);
            ck.p.j(l0Var2, "<this>");
            ck.p.j(c3199t6, "action");
            c3224u6.f25437f = nk.j.d(l0Var2, nk.w0.c().n(), null, new C3(j11, null, c3199t6), 2, null);
        }
        this.f22573a.f23211p.play();
        N7 n11 = this.f22573a;
        n11.f23207l.set(EnumC3184sg.STATE_PLAYING);
        N7 n12 = this.f22573a;
        n12.a(new C2918hn(n12.f23211p.getCurrentPosition()));
        return mj.r.f64562a;
    }
}
