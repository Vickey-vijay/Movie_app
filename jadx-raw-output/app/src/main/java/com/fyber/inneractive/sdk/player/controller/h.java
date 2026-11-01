package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f16222a;

    public h(i iVar) {
        this.f16222a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x xVar = this.f16222a.f16223a.f16236d;
        if (xVar != null) {
            z zVar = xVar.f16255a;
            zVar.getClass();
            IAlog.a("%s onTextureViewDestroyed", IAlog.a(zVar));
        }
    }
}
