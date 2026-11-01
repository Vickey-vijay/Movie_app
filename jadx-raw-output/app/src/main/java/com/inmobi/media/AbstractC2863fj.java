package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.fj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC2863fj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nk.l0 f24380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wk.a f24381b;

    public abstract InterfaceC2786cj a();

    public abstract void a(InterfaceC2786cj interfaceC2786cj);

    public final void a(InterfaceC2786cj interfaceC2786cj, InterfaceC2786cj interfaceC2786cj2) {
        ck.p.j(interfaceC2786cj, "newState");
        ck.p.j(interfaceC2786cj2, "callerState");
        nk.j.d(this.f24380a, null, null, new C2812dj(this, interfaceC2786cj, interfaceC2786cj2, null), 3, null);
    }

    public AbstractC2863fj(nk.l0 l0Var) {
        ck.p.j(l0Var, "coroutineScope");
        this.f24380a = l0Var;
        this.f24381b = wk.g.b(false, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Vc vc2, InterfaceC2786cj interfaceC2786cj, ContinuationImpl continuationImpl) throws Throwable {
        C2837ej c2837ej;
        wk.a aVar;
        InterfaceC2786cj interfaceC2786cj2;
        if (continuationImpl instanceof C2837ej) {
            c2837ej = (C2837ej) continuationImpl;
            int i10 = c2837ej.f24322f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2837ej.f24322f = i10 - Integer.MIN_VALUE;
            } else {
                c2837ej = new C2837ej(this, continuationImpl);
            }
        } else {
            c2837ej = new C2837ej(this, continuationImpl);
        }
        Object obj = c2837ej.f24320d;
        Object objF = sj.a.f();
        int i11 = c2837ej.f24322f;
        if (i11 == 0) {
            kotlin.c.b(obj);
            aVar = this.f24381b;
            c2837ej.f24317a = vc2;
            c2837ej.f24318b = interfaceC2786cj;
            c2837ej.f24319c = aVar;
            c2837ej.f24322f = 1;
            if (aVar.a(null, c2837ej) == objF) {
                interfaceC2786cj2 = vc2;
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wk.a aVar2 = c2837ej.f24319c;
            interfaceC2786cj = c2837ej.f24318b;
            InterfaceC2786cj interfaceC2786cj3 = c2837ej.f24317a;
            kotlin.c.b(obj);
            aVar = aVar2;
            interfaceC2786cj2 = interfaceC2786cj3;
        }
        try {
            interfaceC2786cj2 = vc2;
            b(interfaceC2786cj2, interfaceC2786cj);
            return mj.r.f64562a;
        } finally {
            aVar.b(null);
        }
    }

    public final void b(InterfaceC2786cj interfaceC2786cj, InterfaceC2786cj interfaceC2786cj2) {
        if (!ck.p.e(a(), interfaceC2786cj2) || ck.p.e(a(), interfaceC2786cj)) {
            return;
        }
        ck.p.i(getClass().getSimpleName(), "getSimpleName(...)");
        a().getClass();
        interfaceC2786cj.getClass();
        a().c();
        a(interfaceC2786cj);
        a().a();
    }
}
