package uk;

import nk.h0;
import sk.m;

/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class j extends h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f72910b = new j();

    @Override // nk.h0
    public String toString() {
        return "Dispatchers.IO";
    }

    @Override // nk.h0
    public void dispatch(kotlin.coroutines.d dVar, Runnable runnable) {
        b.f72894h.q(runnable, true, false);
    }

    @Override // nk.h0
    public void dispatchYield(kotlin.coroutines.d dVar, Runnable runnable) {
        b.f72894h.q(runnable, true, true);
    }

    @Override // nk.h0
    public h0 limitedParallelism(int i10, String str) {
        m.a(i10);
        if (i10 >= i.f72907d) {
            return m.b(this, str);
        }
        return super.limitedParallelism(i10, str);
    }
}
