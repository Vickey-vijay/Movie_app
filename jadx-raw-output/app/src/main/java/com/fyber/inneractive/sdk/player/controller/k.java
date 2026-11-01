package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f16226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f16227b;

    public k(f fVar, boolean z10) {
        this.f16227b = fVar;
        this.f16226a = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q qVar = this.f16227b;
        if (qVar.f16239g) {
            return;
        }
        try {
            Iterator it = qVar.f16234b.iterator();
            while (it.hasNext()) {
                ((p) it.next()).c(this.f16226a);
            }
        } catch (Exception e10) {
            if (IAlog.f18551a <= 3) {
                q qVar2 = this.f16227b;
                qVar2.getClass();
                IAlog.a("%sonPlayerError callback threw an exception!", e10, IAlog.a(qVar2));
            }
        }
    }
}
