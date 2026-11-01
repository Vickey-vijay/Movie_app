package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f16232a;

    public n(q qVar) {
        this.f16232a = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Iterator it = this.f16232a.f16234b.iterator();
            while (it.hasNext()) {
                ((p) it.next()).d();
            }
        } catch (Exception e10) {
            if (IAlog.f18551a <= 3) {
                q qVar = this.f16232a;
                qVar.getClass();
                IAlog.a("%sonDrawnToSurface callback threw an exception!", e10, IAlog.a(qVar));
            }
        }
    }
}
