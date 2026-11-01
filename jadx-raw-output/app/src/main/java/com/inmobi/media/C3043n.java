package com.inmobi.media;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C3043n extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3028m9 f24857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2943j f24858b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3043n(InterfaceC3028m9 interfaceC3028m9, InterfaceC2943j interfaceC2943j, rj.c cVar) {
        super(2, cVar);
        this.f24857a = interfaceC3028m9;
        this.f24858b = interfaceC2943j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3043n(this.f24857a, this.f24858b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3043n(this.f24857a, this.f24858b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        InterfaceC3028m9 interfaceC3028m9 = this.f24857a;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).c("AdAudioTracker", "Removing audio volume change listener");
        }
        CopyOnWriteArraySet<WeakReference> copyOnWriteArraySet = C3118q.f25124h;
        InterfaceC2943j interfaceC2943j = this.f24858b;
        for (WeakReference weakReference : copyOnWriteArraySet) {
            if (ck.p.e(weakReference.get(), interfaceC2943j)) {
                C3118q.f25124h.remove(weakReference);
            }
        }
        if (C3118q.f25124h.isEmpty()) {
            InterfaceC3028m9 interfaceC3028m10 = this.f24857a;
            if (interfaceC3028m10 != null) {
                ((C3053n9) interfaceC3028m10).c("AdAudioTracker", "Stopping audio volume change listener");
            }
            InterfaceC3028m9 interfaceC3028m11 = this.f24857a;
            Context context = Ji.f22951a;
            if (context == null) {
                if (interfaceC3028m11 != null) {
                    ((C3053n9) interfaceC3028m11).b("AdAudioTracker", "Context is null. Cannot stop audio volume tracking");
                }
                C3118q.a((Float) null);
            } else if (C3118q.f25120d.compareAndSet(true, false)) {
                if (interfaceC3028m11 != null) {
                    ((C3053n9) interfaceC3028m11).c("AdAudioTracker", "Stopping audio volume tracking");
                }
                C3118q.a(context, interfaceC3028m11);
            } else if (interfaceC3028m11 != null) {
                ((C3053n9) interfaceC3028m11).c("AdAudioTracker", "Audio volume tracking is already stopped");
            }
        }
        return mj.r.f64562a;
    }
}
