package com.unity3d.ads.adplayer;

import ck.p;
import kotlin.coroutines.d;
import nk.h0;
import nk.i0;
import nk.l0;

/* JADX INFO: compiled from: AdPlayerScope.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class AdPlayerScope implements l0 {
    private final /* synthetic */ l0 $$delegate_0;
    private final h0 defaultDispatcher;
    private final i0 sdkErrorHandler;

    @Override // nk.l0
    public d getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    public AdPlayerScope(h0 h0Var, i0 i0Var) {
        p.j(h0Var, "defaultDispatcher");
        p.j(i0Var, "sdkErrorHandler");
        this.defaultDispatcher = h0Var;
        this.sdkErrorHandler = i0Var;
        this.$$delegate_0 = kotlinx.coroutines.d.a(h0Var.plus(i0Var));
    }
}
