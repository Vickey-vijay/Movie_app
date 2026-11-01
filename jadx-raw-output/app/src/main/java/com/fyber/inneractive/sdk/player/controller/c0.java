package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class c0 extends s {
    public final AtomicBoolean F;

    public c0(com.fyber.inneractive.sdk.player.f fVar, com.fyber.inneractive.sdk.player.ui.s sVar, r0 r0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(fVar, sVar, r0Var, rVar, false, null);
        this.F = new AtomicBoolean(false);
        this.A = 0.5f;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final boolean B() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void C() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.s
    public final void K() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z, com.fyber.inneractive.sdk.player.controller.b
    public final void a(com.fyber.inneractive.sdk.flow.endcard.b bVar) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.s, com.fyber.inneractive.sdk.player.controller.z
    public final void b(g1 g1Var) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final boolean e() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void g(boolean z10) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void h() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final com.fyber.inneractive.sdk.web.b0 k() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final com.fyber.inneractive.sdk.flow.storepromo.b n() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void s() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.s
    public final void H() {
        com.fyber.inneractive.sdk.player.ui.s sVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f16258a;
        q qVar = fVar != null ? fVar.f17963a : null;
        if (this.B < this.A || qVar == null || qVar.f16237e == com.fyber.inneractive.sdk.player.enums.b.Completed || qVar.f16242j == null || (sVar = this.f16261d) == null || !sVar.hasWindowFocus()) {
            return;
        }
        c(0);
        i(false);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.s
    public final void F() {
        com.fyber.inneractive.sdk.measurement.f fVar;
        q qVar;
        IAlog.a("%s handle buffering timeout: video paused on last shown frame", IAlog.a(this));
        com.fyber.inneractive.sdk.player.f fVar2 = this.f16258a;
        if (fVar2 != null && (qVar = fVar2.f17963a) != null) {
            qVar.k();
            this.f16258a.f17963a.i();
        }
        com.fyber.inneractive.sdk.player.f fVar3 = this.f16258a;
        if (fVar3 != null && (fVar = fVar3.f17967e) != null && fVar.f15817c != null) {
            IAlog.a("%s pause", "OMVideo");
            try {
                fVar.f15817c.pause();
            } catch (Throwable th2) {
                fVar.a(th2);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.s, com.fyber.inneractive.sdk.ui.controller.b
    public final void a(float f10) {
        boolean z10;
        if (f10 >= 0.01f && this.F.compareAndSet(false, true)) {
            z10 = true;
        } else {
            z10 = false;
        }
        e(z10);
        super.a(f10);
        if (z10) {
            IAlog.a("%sVisibility requirement met. visibleViewArea: %.1f%%", IAlog.a(this), Float.valueOf(f10 * 100.0f));
            ((com.fyber.inneractive.sdk.renderers.o) ((a0) this.f16264g)).f18395a.K();
        }
    }
}
