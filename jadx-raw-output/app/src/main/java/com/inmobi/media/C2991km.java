package com.inmobi.media;

import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.km, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2991km extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3091om f24702c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2991km(C3091om c3091om, rj.c cVar) {
        super(2, cVar);
        this.f24702c = c3091om;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        C2991km c2991km = new C2991km(this.f24702c, cVar);
        c2991km.f24701b = obj;
        return c2991km;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        C2991km c2991km = new C2991km(this.f24702c, (rj.c) obj2);
        c2991km.f24701b = (Rl) obj;
        return c2991km.invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z10;
        Object objG;
        Object objF = sj.a.f();
        int i10 = this.f24700a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            Rl rl2 = (Rl) this.f24701b;
            C3091om c3091om = this.f24702c;
            this.f24700a = 1;
            if (c3091om.f25010c.f25097b.isEmpty()) {
                C3053n9 c3053n9 = c3091om.f25012e;
                if (c3053n9 != null) {
                    c3053n9.a("VideoExperienceManager", "Companion Ads are Empty");
                }
                objG = mj.r.f64562a;
            } else {
                if (c3091om.f25016i == null) {
                    c3091om.f25016i = new K3(c3091om.f24579a, c3091om.f25009b, c3091om.f25010c.f25103h, c3091om.f25012e);
                }
                K3 k10 = c3091om.f25016i;
                if (k10 != null && ck.p.e(k10.f22994i, M3.f23133a)) {
                    z10 = rl2 instanceof C2942in;
                } else {
                    z10 = false;
                }
                if (z10) {
                    K3 k11 = c3091om.f25016i;
                    if (k11 != null) {
                        k11.a(c3091om.f25010c.f25097b);
                    }
                } else if (rl2 instanceof Pl) {
                    K3 k12 = c3091om.f25016i;
                    if (k12 != null) {
                        if (!ck.p.e(k12.f22994i, L3.f23048a)) {
                            C3053n9 c3053n10 = c3091om.f25012e;
                            if (c3053n10 != null) {
                                c3053n10.a("VideoExperienceManager", "Companion Ad is not Available");
                            }
                            Map mapA = AbstractC2939ik.a(c3091om.f25010c.f25103h.f23673a);
                            Wj wj2 = Wj.f23753a;
                            Wj.b("CompanionAdDropped", mapA, EnumC2735ak.SDK);
                            objG = nk.h.g(nk.w0.c(), new C3016lm(k12, null), this);
                            if (objG != sj.a.f()) {
                                objG = mj.r.f64562a;
                            }
                        } else {
                            objG = nk.h.g(nk.w0.c(), new C3041mm(c3091om, k12, null), this);
                            if (objG != sj.a.f()) {
                                objG = mj.r.f64562a;
                            }
                        }
                    } else {
                        objG = mj.r.f64562a;
                    }
                    if (objG != sj.a.f()) {
                        objG = mj.r.f64562a;
                    }
                }
                objG = mj.r.f64562a;
            }
            if (objG == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
