package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Exception f16224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f16225b;

    public j(q qVar, com.fyber.inneractive.sdk.player.mediaplayer.o oVar) {
        this.f16225b = qVar;
        this.f16224a = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q qVar = this.f16225b;
        if (qVar.f16239g) {
            return;
        }
        try {
            Iterator it = qVar.f16234b.iterator();
            while (it.hasNext()) {
                ((p) it.next()).a((com.fyber.inneractive.sdk.player.mediaplayer.o) this.f16224a);
            }
        } catch (Exception e10) {
            if (IAlog.f18551a <= 3) {
                q qVar2 = this.f16225b;
                qVar2.getClass();
                IAlog.a("%sonPlayerError callback threw an exception!", e10, IAlog.a(qVar2));
            }
        }
    }
}
