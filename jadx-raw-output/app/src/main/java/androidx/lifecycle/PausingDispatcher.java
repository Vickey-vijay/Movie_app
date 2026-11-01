package androidx.lifecycle;

import ck.p;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import nk.h0;
import nk.w0;

/* JADX INFO: compiled from: PausingDispatcher.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class PausingDispatcher extends h0 {
    public final DispatchQueue dispatchQueue = new DispatchQueue();

    @Override // nk.h0
    public void dispatch(kotlin.coroutines.d dVar, Runnable runnable) {
        p.j(dVar, GAMConfig.KEY_CONTEXT);
        p.j(runnable, "block");
        this.dispatchQueue.dispatchAndEnqueue(dVar, runnable);
    }

    @Override // nk.h0
    public boolean isDispatchNeeded(kotlin.coroutines.d dVar) {
        p.j(dVar, GAMConfig.KEY_CONTEXT);
        if (w0.c().n().isDispatchNeeded(dVar)) {
            return true;
        }
        return !this.dispatchQueue.canRun();
    }
}
