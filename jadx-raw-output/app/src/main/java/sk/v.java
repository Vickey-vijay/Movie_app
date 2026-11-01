package sk;

import nk.r0;
import nk.y0;

/* JADX INFO: compiled from: NamedDispatcher.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class v extends nk.h0 implements r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f71991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nk.h0 f71992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f71993d;

    @Override // nk.r0
    public void e(long j10, nk.l<? super mj.r> lVar) {
        this.f71991b.e(j10, lVar);
    }

    @Override // nk.r0
    public y0 j(long j10, Runnable runnable, kotlin.coroutines.d dVar) {
        return this.f71991b.j(j10, runnable, dVar);
    }

    @Override // nk.h0
    public void dispatch(kotlin.coroutines.d dVar, Runnable runnable) {
        this.f71992c.dispatch(dVar, runnable);
    }

    @Override // nk.h0
    public void dispatchYield(kotlin.coroutines.d dVar, Runnable runnable) {
        this.f71992c.dispatchYield(dVar, runnable);
    }

    @Override // nk.h0
    public boolean isDispatchNeeded(kotlin.coroutines.d dVar) {
        return this.f71992c.isDispatchNeeded(dVar);
    }

    @Override // nk.h0
    public String toString() {
        return this.f71993d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v(nk.h0 h0Var, String str) {
        r0 r0Var;
        if (h0Var instanceof r0) {
            r0Var = (r0) h0Var;
        } else {
            r0Var = null;
        }
        this.f71991b = r0Var == null ? nk.o0.a() : r0Var;
        this.f71992c = h0Var;
        this.f71993d = str;
    }
}
