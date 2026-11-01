package com.fyber.inneractive.sdk.player.ui.remote;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.r;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f18088a;

    @Override // java.lang.Runnable
    public final void run() {
        IAlog.a("%s : remote UI load timeout task executed", "RemoteUIWebviewController");
        d dVar = this.f18088a;
        dVar.f18096g = true;
        IAlog.a("%s : UI load timed out", "RemoteUIWebviewController");
        r.f18607b.post(dVar.f18101l);
    }

    public b(d dVar) {
        this.f18088a = dVar;
    }
}
