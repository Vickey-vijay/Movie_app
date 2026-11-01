package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.flow.t0;

/* JADX INFO: loaded from: classes11.dex */
public final class x extends a {
    @Override // com.fyber.inneractive.sdk.renderers.a, com.fyber.inneractive.sdk.renderers.d0
    public final com.fyber.inneractive.sdk.player.ui.m a(Context context, com.fyber.inneractive.sdk.config.global.r rVar) {
        if (this.f18371b == null) {
            this.f18371b = new com.fyber.inneractive.sdk.player.ui.t(context, new com.fyber.inneractive.sdk.player.ui.h(), rVar);
        }
        return this.f18371b;
    }

    @Override // com.fyber.inneractive.sdk.renderers.d0
    public final String a() {
        return null;
    }

    public x(com.fyber.inneractive.sdk.player.t tVar) {
        super(tVar);
    }

    @Override // com.fyber.inneractive.sdk.renderers.a, com.fyber.inneractive.sdk.renderers.d0
    public final com.fyber.inneractive.sdk.player.controller.b a(InneractiveAdSpot inneractiveAdSpot, t0 t0Var) {
        com.fyber.inneractive.sdk.player.controller.z zVar = this.f18370a;
        if (zVar != null) {
            return zVar;
        }
        this.f18370a = new com.fyber.inneractive.sdk.player.controller.c0(this.f18372c, (com.fyber.inneractive.sdk.player.ui.t) this.f18371b, com.fyber.inneractive.sdk.config.a.a(inneractiveAdSpot.getAdContent().b().f18446o), t0Var.f15748c);
        return super.a(inneractiveAdSpot, t0Var);
    }
}
