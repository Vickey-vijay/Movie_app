package com.inmobi.media;

/* JADX INFO: loaded from: classes7.dex */
public final class K7 extends kotlin.coroutines.a implements nk.i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N7 f23005a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K7(nk.i0.b bVar, N7 n10) {
        super(bVar);
        this.f23005a = n10;
    }

    @Override // nk.i0
    public final void handleException(kotlin.coroutines.d dVar, Throwable th2) {
        InterfaceC3028m9 interfaceC3028m9 = this.f23005a.f23197b;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).b("HtmlMediaPlayer", "Unhandled exception: " + th2.getMessage());
        }
        mj.g gVar = P9.f23321a;
        P9.a(new L2(th2));
    }
}
