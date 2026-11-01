package com.fyber.inneractive.sdk.renderers;

/* JADX INFO: loaded from: classes11.dex */
public final class m implements com.fyber.inneractive.sdk.player.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f18393a;

    public m(p pVar) {
        this.f18393a = pVar;
    }

    @Override // com.fyber.inneractive.sdk.player.e
    public final void a() {
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f18393a.f18373k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.player.controller.s) bVar).b(false);
            ((com.fyber.inneractive.sdk.player.controller.s) this.f18393a.f18373k).y();
        }
    }
}
