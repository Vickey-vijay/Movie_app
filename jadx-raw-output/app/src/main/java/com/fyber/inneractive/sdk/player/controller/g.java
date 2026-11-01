package com.fyber.inneractive.sdk.player.controller;

import android.media.AudioManager;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.config.t0;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends z implements com.fyber.inneractive.sdk.flow.storepromo.loader.b {
    public boolean A;
    public final boolean B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f16221z;

    public g(com.fyber.inneractive.sdk.player.f fVar, com.fyber.inneractive.sdk.player.ui.s sVar, s0 s0Var, com.fyber.inneractive.sdk.config.global.r rVar, boolean z10, boolean z11, String str) {
        com.fyber.inneractive.sdk.flow.storepromo.b bVar;
        super(fVar, sVar, s0Var, rVar, z10, str);
        this.f16221z = false;
        this.A = false;
        com.fyber.inneractive.sdk.player.f fVar2 = this.f16258a;
        if (fVar2 != null && (bVar = ((com.fyber.inneractive.sdk.player.n) fVar2).f18031v) != null) {
            bVar.f15588e = this;
        }
        this.f16221z = false;
        this.B = z11;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z, com.fyber.inneractive.sdk.player.ui.n
    public final void a() {
        if (!this.f16265h) {
            f();
            return;
        }
        if (this.f16261d.b()) {
            return;
        }
        this.f16261d.a(false);
        Runnable runnable = this.f16267j;
        if (runnable != null) {
            this.f16261d.removeCallbacks(runnable);
            this.f16267j = null;
        }
        E();
        D();
        this.f16268k = false;
        this.f16265h = true;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z, com.fyber.inneractive.sdk.player.controller.b
    public final void b(boolean z10) {
        super.b(z10);
        if (this.f16221z) {
            this.f16261d.m();
            this.f16261d.g(false);
            this.f16263f = 0;
        }
        C();
        this.f16261d.e(false);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void r() {
        this.f16275r = true;
        IAlog.a("%s onBufferingTimeout reached. Skipping to end card", IAlog.a(this));
        if (B()) {
            g(false);
        } else {
            d(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final boolean A() {
        return !this.f16221z;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final int i() {
        return IAConfigManager.O.f15026u.f15195b.a("VideoFullscreenBufferingTimeout", 12, 1) * 1000;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0029  */
    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final int o() {
        com.fyber.inneractive.sdk.config.global.features.c cVar;
        int iIntValue;
        int i10;
        t0 t0Var;
        com.fyber.inneractive.sdk.config.global.r rVar = this.f16260c;
        if (rVar != null) {
            com.fyber.inneractive.sdk.config.global.features.c cVar2 = (com.fyber.inneractive.sdk.config.global.features.c) rVar.a(com.fyber.inneractive.sdk.config.global.features.c.class);
            cVar2.getClass();
            if (new ArrayList(cVar2.f15091c.values()).size() > 0) {
                cVar = (com.fyber.inneractive.sdk.config.global.features.c) this.f16260c.a(com.fyber.inneractive.sdk.config.global.features.c.class);
            } else {
                cVar = null;
            }
        } else {
            cVar = null;
        }
        if (cVar != null) {
            Integer numA = cVar.a("skip_time_sec");
            iIntValue = numA != null ? numA.intValue() : 5;
            if (iIntValue < 0 || iIntValue > 8) {
                iIntValue = 5;
            }
        } else {
            iIntValue = -1;
        }
        com.fyber.inneractive.sdk.config.o oVar = IAConfigManager.O.f15026u.f15195b;
        s0 s0Var = this.f16259b;
        Skip skip = this.f16281x;
        boolean zIsCurrentUserAChild = InneractiveAdManager.isCurrentUserAChild();
        com.fyber.inneractive.sdk.config.l lVarA = oVar.a("vast_configuration");
        lVarA.getClass();
        try {
            i10 = lVarA.f15129a.containsKey("skip_d") ? Integer.parseInt((String) lVarA.f15129a.get("skip_d")) : -1;
        } catch (Exception unused) {
        }
        int iMax = Math.max(i10, -1);
        if (skip == null && s0Var != null && (t0Var = ((r0) s0Var).f15149f) != null) {
            skip = t0Var.f15207h;
        }
        if (zIsCurrentUserAChild) {
            if (iIntValue > -1 && iIntValue <= 8) {
                return iIntValue;
            }
            if (iMax <= -1 || iMax > 8) {
                int iIntValue2 = skip.value().intValue();
                if (iIntValue2 <= -1 || iIntValue2 > 8) {
                    return 5;
                }
                return skip.value().intValue();
            }
        } else if (iMax <= -1 || iMax > 5) {
            if (skip == Skip.DEFAULT) {
                return 99999;
            }
            return skip.value().intValue();
        }
        return iMax;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void t() {
        g0 g0Var = this.f16264g;
        if (g0Var != null) {
            g0Var.j();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void v() {
        this.f16261d.g(true);
        C();
        h();
        f();
        h(true);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void E() {
        q qVar;
        super.E();
        com.fyber.inneractive.sdk.player.f fVar = this.f16258a;
        if (fVar != null && (qVar = fVar.f17963a) != null && qVar.f16237e == com.fyber.inneractive.sdk.player.enums.b.Completed && this.f16221z) {
            this.f16261d.m();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void f() {
        int ringerMode;
        int streamVolume;
        super.f();
        com.fyber.inneractive.sdk.player.f fVar = this.f16258a;
        if (fVar != null && fVar.f17963a != null && !this.A) {
            try {
                AudioManager audioManager = (AudioManager) this.f16261d.getContext().getSystemService("audio");
                ringerMode = audioManager.getRingerMode();
                try {
                    streamVolume = audioManager.getStreamVolume(2);
                } catch (Throwable unused) {
                    streamVolume = 0;
                }
            } catch (Throwable unused2) {
                ringerMode = 0;
            }
            if ((this.f16221z || !((r0) this.f16259b).f15149f.f15203d.booleanValue()) && !this.B && !p()) {
                if (streamVolume > 0 && ringerMode == 2) {
                    IAlog.a("%s setting default volume. unmuting player", IAlog.a(this));
                    i(false);
                }
            } else {
                f(false);
            }
            this.f16261d.setMuteButtonState(p());
            this.A = true;
        }
        h(false);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void x() {
        super.x();
        if (this.f16221z) {
            this.f16261d.m();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void b(g1 g1Var) {
        com.fyber.inneractive.sdk.player.ui.s sVar;
        TapAction tapAction = ((r0) this.f16259b).f15149f.f15208i;
        if (tapAction == TapAction.CTR) {
            a(false, VideoClickOrigin.VIDEO, g1Var);
            return;
        }
        if (tapAction != TapAction.FULLSCREEN && tapAction != TapAction.DO_NOTHING) {
            IAlog.a("% sonVideoClicked called, but we recieved an unknown tap action %s", IAlog.a(this), tapAction);
            return;
        }
        if (((com.fyber.inneractive.sdk.config.global.features.u) this.f16260c.a(com.fyber.inneractive.sdk.config.global.features.u.class)).c().equals(com.fyber.inneractive.sdk.config.global.features.t.OPEN) || ((this.f16277t != com.fyber.inneractive.sdk.ignite.m.NONE && IAConfigManager.O.E.n()) || ((sVar = this.f16261d) != null && sVar.a()))) {
            a(false, VideoClickOrigin.VIDEO, g1Var);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z, com.fyber.inneractive.sdk.player.ui.n
    public final void a(boolean z10) {
        e(z10);
        super.a(z10);
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.loader.b
    public final void a(g1 g1Var) {
        a(11, g1Var);
    }
}
