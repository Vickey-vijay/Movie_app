package com.fyber.inneractive.sdk.player.cache;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f16148a;

    public a(g gVar) {
        this.f16148a = gVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.f16148a) {
            g gVar = this.f16148a;
            if (gVar.f16169i == null) {
                return null;
            }
            gVar.d();
            g gVar2 = this.f16148a;
            int i10 = gVar2.f16171k;
            if (i10 >= 2000 && i10 >= gVar2.f16170j.size()) {
                this.f16148a.c();
                this.f16148a.f16171k = 0;
            }
            return null;
        }
    }
}
