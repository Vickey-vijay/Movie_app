package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C2993l extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3028m9 f24706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2943j f24707b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2993l(InterfaceC3028m9 interfaceC3028m9, InterfaceC2943j interfaceC2943j, rj.c cVar) {
        super(2, cVar);
        this.f24706a = interfaceC3028m9;
        this.f24707b = interfaceC2943j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2993l(this.f24706a, this.f24707b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2993l(this.f24706a, this.f24707b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Float fC;
        sj.a.f();
        kotlin.c.b(obj);
        InterfaceC3028m9 interfaceC3028m9 = this.f24706a;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).c("AdAudioTracker", "Adding audio volume change listener. Existing listeners - " + C3118q.f25124h.size());
        }
        for (WeakReference weakReference : C3118q.f25124h) {
            if (weakReference.get() == null) {
                C3118q.f25124h.remove(weakReference);
            }
        }
        CopyOnWriteArraySet copyOnWriteArraySet = C3118q.f25124h;
        boolean zIsEmpty = copyOnWriteArraySet.isEmpty();
        copyOnWriteArraySet.add(new WeakReference(this.f24707b));
        InterfaceC2943j interfaceC2943j = this.f24707b;
        Float f10 = (Float) C3118q.f25121e.get();
        if (f10 != null) {
            fC = tj.a.c(F3.a(f10.floatValue() * 100.0f));
        } else {
            fC = null;
        }
        ((Ph) interfaceC2943j).a(fC);
        if (zIsEmpty) {
            InterfaceC3028m9 interfaceC3028m10 = this.f24706a;
            if (interfaceC3028m10 != null) {
                ((C3053n9) interfaceC3028m10).c("AdAudioTracker", "Starting audio volume change listener");
            }
            C3118q.a(this.f24706a);
        } else {
            InterfaceC3028m9 interfaceC3028m11 = this.f24706a;
            if (interfaceC3028m11 != null) {
                ((C3053n9) interfaceC3028m11).c("AdAudioTracker", "Resuming audio volume change listener");
            }
        }
        return mj.r.f64562a;
    }
}
