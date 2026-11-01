package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.u8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3226u8 extends kotlin.coroutines.a implements nk.i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3251v8 f25448a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3226u8(nk.i0.b bVar, C3251v8 c3251v8) {
        super(bVar);
        this.f25448a = c3251v8;
    }

    @Override // nk.i0
    public final void handleException(kotlin.coroutines.d dVar, Throwable th2) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25448a.f25541c;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).b("HybridVideoPlayerHandler", "Unhandled exception: " + th2.getMessage());
        }
        mj.g gVar = P9.f23321a;
        P9.a(new L2(th2));
    }
}
