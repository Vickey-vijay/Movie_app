package com.inmobi.media;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C3093p extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3028m9 f25019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f25020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f25021c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3093p(InterfaceC3028m9 interfaceC3028m9, Context context, long j10, rj.c cVar) {
        super(2, cVar);
        this.f25019a = interfaceC3028m9;
        this.f25020b = context;
        this.f25021c = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3093p(this.f25019a, this.f25020b, this.f25021c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((C3093p) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        InterfaceC3028m9 interfaceC3028m9 = this.f25019a;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).c("AdAudioTracker", "Starting audio volume tracking");
        }
        if (C3118q.f25118b == null) {
            Object systemService = this.f25020b.getSystemService("audio");
            ck.p.h(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            C3118q.f25118b = (AudioManager) systemService;
        }
        C3118q c3118q = C3118q.f25117a;
        C3118q.f25122f = F3.a(C3118q.f25123g, 0L, this.f25021c, new C3068o(null));
        C3118q.a(this.f25021c);
        Context context = this.f25020b;
        C3118q.f25119c = new C2968k();
        context.registerReceiver(C3118q.f25119c, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
        C3118q.a(Float.valueOf(c3118q.a()));
        return mj.r.f64562a;
    }
}
