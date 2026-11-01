package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h0 f15351a;

    public d0(h0 h0Var) {
        this.f15351a = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h0 h0Var = this.f15351a;
        h0Var.f15460m.set(true);
        Iterator it = h0Var.f15454g.iterator();
        while (it.hasNext()) {
            ((InneractiveUnitController) it.next()).destroy();
        }
        h0Var.f15454g.clear();
        h0Var.a((x) null);
        h0Var.f15449b = null;
        h0Var.a();
        InneractiveAdSpotManager.get().removeSpot(h0Var);
    }
}
