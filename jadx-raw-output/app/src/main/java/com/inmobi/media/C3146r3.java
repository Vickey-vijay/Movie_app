package com.inmobi.media;

import android.os.SystemClock;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.r3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3146r3 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S2 f25230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3028m9 f25231c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3146r3(S2 s10, InterfaceC3028m9 interfaceC3028m9, rj.c cVar) {
        super(2, cVar);
        this.f25230b = s10;
        this.f25231c = interfaceC3028m9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3146r3(this.f25230b, this.f25231c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3146r3(this.f25230b, this.f25231c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f25229a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            C3271w3 c3271w3 = C3271w3.f25610a;
            SystemClock.elapsedRealtime();
            if (this.f25230b.f23482e) {
                InterfaceC3028m9 interfaceC3028m9 = this.f25231c;
                if (interfaceC3028m9 != null) {
                    ck.p.i("w3", "access$getTAG$p(...)");
                    ((C3053n9) interfaceC3028m9).c("w3", "ping in web view");
                }
                new C2923i3(C3271w3.f25621l).a(this.f25230b);
            } else {
                InterfaceC3028m9 interfaceC3028m10 = this.f25231c;
                if (interfaceC3028m10 != null) {
                    ck.p.i("w3", "access$getTAG$p(...)");
                    ((C3053n9) interfaceC3028m10).c("w3", "ping in http executor");
                }
                C2972k3 c2972k3 = new C2972k3();
                S2 s10 = this.f25230b;
                this.f25229a = 1;
                obj = c2972k3.a(s10, this);
                if (obj == objF) {
                    return objF;
                }
            }
            return mj.r.f64562a;
        }
        EnumC2721a6 enumC2721a6 = (EnumC2721a6) obj;
        if (enumC2721a6 != null) {
            C3271w3.f25621l.a(this.f25230b, enumC2721a6);
        } else {
            C3271w3.f25621l.a(this.f25230b);
        }
        return mj.r.f64562a;
    }
}
