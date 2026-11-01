package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f16229b;

    public l(q qVar, int i10) {
        this.f16229b = qVar;
        this.f16228a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Iterator it = this.f16229b.f16235c.iterator();
            while (it.hasNext()) {
                ((o) it.next()).a(this.f16228a);
            }
        } catch (Exception e10) {
            if (IAlog.f18551a <= 3) {
                q qVar = this.f16229b;
                qVar.getClass();
                IAlog.a("%sonPlayerProgress callback threw an exception!", e10, IAlog.a(qVar));
            }
        }
    }
}
