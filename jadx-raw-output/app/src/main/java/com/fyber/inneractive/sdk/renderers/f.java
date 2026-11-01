package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.flow.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends d0 {
    @Override // com.fyber.inneractive.sdk.renderers.d0
    public final com.fyber.inneractive.sdk.player.ui.m a(Context context, com.fyber.inneractive.sdk.config.global.r rVar) {
        if (this.f18371b == null) {
            this.f18371b = new com.fyber.inneractive.sdk.player.ui.i(context, new com.fyber.inneractive.sdk.player.ui.f(), this.f18372c, rVar, a());
        }
        return this.f18371b;
    }

    @Override // com.fyber.inneractive.sdk.renderers.d0
    public final void b() {
        this.f18372c.getClass();
    }

    public f(com.fyber.inneractive.sdk.player.t tVar) {
        super(tVar);
    }

    @Override // com.fyber.inneractive.sdk.renderers.d0
    public final com.fyber.inneractive.sdk.player.controller.b a(InneractiveAdSpot inneractiveAdSpot, t0 t0Var) {
        if (this.f18370a == null) {
            Object selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
            this.f18370a = new com.fyber.inneractive.sdk.player.controller.g(this.f18372c, this.f18371b, inneractiveAdSpot.getAdContent().f15749d, t0Var.f15748c, selectedUnitController instanceof u0 ? ((u0) selectedUnitController).isOverlayOutside() : false, IAConfigManager.O.f15016k || t0Var.f15751f, a());
        }
        return this.f18370a;
    }

    @Override // com.fyber.inneractive.sdk.renderers.d0
    public final void a(com.fyber.inneractive.sdk.player.e eVar) {
        this.f18372c.getClass();
        eVar.a();
    }
}
