package com.fyber.inneractive.sdk.renderers;

import com.fyber.inneractive.sdk.flow.w0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes11.dex */
public final class y implements com.fyber.inneractive.sdk.ui.controller.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f18419a;

    public y(a0 a0Var) {
        this.f18419a = a0Var;
    }

    @Override // com.fyber.inneractive.sdk.ui.controller.c
    public final void u() {
        a0 a0Var = this.f18419a;
        boolean z10 = a0Var.f18352m;
        if (z10) {
            return;
        }
        if (a0Var.f15333b != null && !z10) {
            a0Var.f18352m = true;
            IAlog.a("%sTracking impression", IAlog.a(a0Var));
            com.fyber.inneractive.sdk.flow.nativead.trackers.a aVar = new com.fyber.inneractive.sdk.flow.nativead.trackers.a((w0) a0Var.f15333b);
            a0Var.f18353n = aVar;
            aVar.a(a0Var);
        }
        a0Var.G();
    }
}
