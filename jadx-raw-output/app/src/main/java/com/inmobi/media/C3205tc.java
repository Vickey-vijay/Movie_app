package com.inmobi.media;

import android.content.Context;
import android.media.AudioManager;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.tc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3205tc extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3230uc f25384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3280wc f25385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f25386c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3205tc(C3230uc c3230uc, C3280wc c3280wc, boolean z10, rj.c cVar) {
        super(2, cVar);
        this.f25384a = c3230uc;
        this.f25385b = c3280wc;
        this.f25386c = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3205tc(this.f25384a, this.f25385b, this.f25386c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((C3205tc) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        Context context = this.f25384a.f25457b;
        if (context != null) {
            Object systemService = context.getSystemService("audio");
            AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
            if (audioManager != null) {
                try {
                    int streamVolume = audioManager.getStreamVolume(3);
                    C3230uc c3230uc = this.f25384a;
                    if (streamVolume != c3230uc.f25458c) {
                        c3230uc.f25458c = streamVolume;
                        InterfaceC3028m9 interfaceC3028m9 = this.f25385b.f25634b;
                        if (interfaceC3028m9 != null) {
                            ((C3053n9) interfaceC3028m9).a("MraidMediaProcessor", "volume change detected - " + this.f25386c);
                        }
                        this.f25385b.a(this.f25384a.f25456a, streamVolume);
                    }
                } catch (Exception e10) {
                    InterfaceC3028m9 interfaceC3028m10 = this.f25385b.f25634b;
                    if (interfaceC3028m10 != null) {
                        ((C3053n9) interfaceC3028m10).a("MraidMediaProcessor", "Unexpected error in volume listener", e10);
                    }
                }
            }
        }
        return mj.r.f64562a;
    }
}
