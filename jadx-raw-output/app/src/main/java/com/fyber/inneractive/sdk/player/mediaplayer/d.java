package com.fyber.inneractive.sdk.player.mediaplayer;

import com.fyber.inneractive.sdk.player.controller.q;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.enums.b f17990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f17991b;

    public d(p pVar, com.fyber.inneractive.sdk.player.enums.b bVar) {
        this.f17991b = pVar;
        this.f17990a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar = this.f17991b.f18012i;
        if (nVar != null) {
            ((q) nVar).a(this.f17990a);
        }
    }
}
