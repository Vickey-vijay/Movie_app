package com.fyber.inneractive.sdk.player.controller;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f16206a;

    public e(f fVar) {
        this.f16206a = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = this.f16206a.f16211s;
        if (gVar != null) {
            gVar.a(gVar.a(), -9223372036854775807L);
            this.f16206a.f16211s.f17357d.f17407f.sendEmptyMessage(5);
            com.fyber.inneractive.sdk.player.exoplayer2.g gVar2 = this.f16206a.f16211s;
            gVar2.f17357d.d();
            gVar2.f17356c.removeCallbacksAndMessages(null);
            this.f16206a.f16211s = null;
        }
    }
}
