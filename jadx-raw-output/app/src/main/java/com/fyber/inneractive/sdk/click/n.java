package com.fyber.inneractive.sdk.click;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f14991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f14992b;

    public n(r rVar, b bVar) {
        this.f14992b = rVar;
        this.f14991a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o oVar = this.f14992b.f14996d;
        if (oVar != null) {
            oVar.a(this.f14991a);
        }
    }
}
