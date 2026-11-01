package com.fyber.inneractive.sdk.player.exoplayer2.source;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f17563a;

    public j(p pVar) {
        this.f17563a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f17563a;
        if (pVar.G) {
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.l) pVar.f17598p;
        lVar.getClass();
        lVar.f17407f.obtainMessage(9, pVar).sendToTarget();
    }
}
