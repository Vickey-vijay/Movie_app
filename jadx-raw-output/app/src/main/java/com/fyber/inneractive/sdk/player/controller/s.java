package com.fyber.inneractive.sdk.player.controller;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.internal.special.SpecialsBridge;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: classes2.dex */
public class s extends z {
    public float A;
    public float B;
    public boolean C;
    public boolean D;
    public boolean E;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public r f16249z;

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, com.safedk.android.utils.g.f44970p);
        p10.startActivity(p11);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public boolean A() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z, com.fyber.inneractive.sdk.player.ui.n
    public final void a(boolean z10) {
        if (z10) {
            a(this.B);
        }
        super.a(z10);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z, com.fyber.inneractive.sdk.player.controller.b
    public boolean b() {
        return !(this instanceof c0);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final int o() {
        return 0;
    }

    public final void G() {
        if (this.f16264g == null || this.E) {
            return;
        }
        I();
        super.g();
        com.fyber.inneractive.sdk.renderers.o oVar = (com.fyber.inneractive.sdk.renderers.o) ((a0) this.f16264g);
        com.fyber.inneractive.sdk.renderers.p pVar = oVar.f18395a;
        InneractiveUnitController.EventsListener eventsListener = pVar.f15334c;
        if (eventsListener != null) {
            SpecialsBridge.fyberOnAdExpanded((InneractiveAdViewEventsListener) eventsListener, pVar.f15332a);
        }
        ViewGroup viewGroup = oVar.f18395a.f18400p;
        if (viewGroup != null && viewGroup.getContext() != null) {
            com.fyber.inneractive.sdk.renderers.p pVar2 = oVar.f18395a;
            com.fyber.inneractive.sdk.display.a bVar = pVar2.f15333b instanceof com.fyber.inneractive.sdk.dv.a ? new com.fyber.inneractive.sdk.display.b() : new com.fyber.inneractive.sdk.display.c();
            if (bVar instanceof com.fyber.inneractive.sdk.display.c) {
                Context context = pVar2.f18400p.getContext();
                InneractiveAdSpot inneractiveAdSpot = oVar.f18395a.f15332a;
                Intent intent = new Intent(context, (Class<?>) InneractiveFullscreenAdActivity.class);
                intent.putExtra("spotId", inneractiveAdSpot.getLocalUniqueId());
                if (!(context instanceof Activity)) {
                    intent.setFlags(268435456);
                }
                try {
                    IAlog.a("%sIAInterstitialUtil: Opening interstitial for spot id: %s", IAlog.a(context), inneractiveAdSpot.getLocalUniqueId());
                    safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
                } catch (ActivityNotFoundException unused) {
                    IAlog.c("%sIAInterstitialUtil: InneractiveFullscreenAdActivity.class not found. Did you declare InneractiveFullscreenAdActivity in your manifest?", IAlog.a(context));
                }
            }
        }
        IAlog.a("%sopening fullscreen", IAlog.a(this));
        this.E = true;
        com.fyber.inneractive.sdk.player.f fVar = this.f16258a;
        if (fVar != null) {
            com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) fVar;
            nVar.a(nVar.f18025p, VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_FULLSCREEN, com.fyber.inneractive.sdk.model.vast.x.EVENT_EXPAND);
        }
    }

    public void H() {
        com.fyber.inneractive.sdk.player.f fVar;
        q qVar;
        com.fyber.inneractive.sdk.player.ui.s sVar;
        if (this.B < this.A || (fVar = this.f16258a) == null || (qVar = fVar.f17963a) == null || qVar.f16237e == com.fyber.inneractive.sdk.player.enums.b.Completed || (sVar = this.f16261d) == null || sVar.b() || this.f16258a.f17963a.f16242j == null) {
            return;
        }
        if (((r0) this.f16259b).f15149f.f15200a.booleanValue() || this.C) {
            c(IAConfigManager.O.f15014i.f15122a);
        }
    }

    public final void I() {
        if (this.f16249z != null) {
            IAlog.a("%sCancelling play runnable", IAlog.a(this));
            this.f16261d.removeCallbacks(this.f16249z);
            this.f16249z = null;
        }
    }

    public final void J() {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f16258a;
        if (fVar == null || (qVar = fVar.f17963a) == null || qVar.f16246n) {
            return;
        }
        if (((r0) this.f16259b).f15149f.f15203d.booleanValue()) {
            this.f16258a.f17963a.b(false);
        } else {
            if (p()) {
                return;
            }
            this.f16258a.f17963a.d(false);
        }
    }

    public void K() {
        if (((r0) this.f16259b).f15149f.f15208i != TapAction.FULLSCREEN) {
            this.f16261d.n();
        }
        C();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z, com.fyber.inneractive.sdk.player.controller.b
    public final void b(boolean z10) {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f16258a;
        if (fVar != null && (qVar = fVar.f17963a) != null && qVar.f16237e != com.fyber.inneractive.sdk.player.enums.b.Completed) {
            K();
        }
        super.b(z10);
    }

    public final void c(int i10) {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f16258a;
        if (fVar == null || (qVar = fVar.f17963a) == null || qVar.f16237e == com.fyber.inneractive.sdk.player.enums.b.Playing || this.f16249z != null) {
            return;
        }
        IAlog.a("%splayVideo %s", IAlog.a(this), this.f16261d);
        if (i10 == 0) {
            h(false);
            return;
        }
        r rVar = new r(this);
        this.f16249z = rVar;
        this.f16261d.postDelayed(rVar, i10);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void h(boolean z10) {
        com.fyber.inneractive.sdk.player.f fVar = this.f16258a;
        if (fVar == null || fVar.f17963a == null) {
            return;
        }
        J();
        super.h(false);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final int i() {
        return IAConfigManager.O.f15026u.f15195b.a("VideoAdBufferingTimeout", 5, 1) * 1000;
    }

    public final void j(boolean z10) {
        com.fyber.inneractive.sdk.player.f fVar;
        q qVar;
        this.D = z10;
        if (!z10 || (fVar = this.f16258a) == null || (qVar = fVar.f17963a) == null || qVar.f16242j != null || !this.f16261d.f18071e || qVar.f16237e == com.fyber.inneractive.sdk.player.enums.b.Completed) {
            return;
        }
        f();
        a(this.B);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void v() {
        com.fyber.inneractive.sdk.player.f fVar = this.f16258a;
        if (fVar == null || fVar.f17963a == null) {
            return;
        }
        f();
        h(false);
    }

    public s(com.fyber.inneractive.sdk.player.f fVar, com.fyber.inneractive.sdk.player.ui.s sVar, r0 r0Var, com.fyber.inneractive.sdk.config.global.r rVar, boolean z10, String str) {
        super(fVar, sVar, r0Var, rVar, z10, str);
        this.B = 0.0f;
        this.C = false;
        this.D = false;
        this.E = false;
        this.A = ((r0) this.f16259b).f15150g.f15213b.intValue() / 100.0f;
        J();
    }

    public void F() {
        IAlog.a("%s handle buffering timeout: Skipping to end card", IAlog.a(this));
        if (B()) {
            g(false);
        } else {
            d(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.ui.controller.b
    public void a(float f10) {
        q qVar;
        this.B = f10;
        if (IAlog.f18551a >= 3) {
            IAlog.c("%sonVisibilityChanged called with: %s vfpl = %s vfpa = %s", IAlog.a(this), Float.valueOf(f10), Float.valueOf(this.A), Float.valueOf(1.0f - this.A));
        }
        com.fyber.inneractive.sdk.player.f fVar = this.f16258a;
        if (fVar == null || (qVar = fVar.f17963a) == null) {
            return;
        }
        if (qVar.f16237e != com.fyber.inneractive.sdk.player.enums.b.Playing) {
            H();
            return;
        }
        if (f10 <= this.A) {
            IAlog.e("%sonVisibilityChanged pausing player", IAlog.a(this));
            if (this.f16258a.f17963a.f16242j != null) {
                this.C = false;
                I();
                super.z();
                f(false);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z, com.fyber.inneractive.sdk.ui.controller.b
    public final void destroy() {
        I();
        this.f16264g = null;
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void f() {
        super.f();
        com.fyber.inneractive.sdk.player.f fVar = this.f16258a;
        if (fVar != null && fVar.f17963a != null) {
            IAlog.a("%sconnectToTextureView playing state = %s", IAlog.a(this), this.f16258a.f17963a.f16237e);
            if (this.f16258a.f17963a.h()) {
                this.f16261d.e(true ^ this.f16258a.f17969g);
                J();
            }
        }
        a(this.B);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void g() {
        I();
        super.g();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void r() {
        IAlog.a("%s onBufferingTimeout reached", IAlog.a(this));
        if (this.f16261d.f18071e) {
            this.f16275r = true;
            F();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void t() {
        G();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void u() {
        super.u();
        I();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void w() {
        H();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void x() {
        super.x();
        K();
        this.C = true;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void z() {
        I();
        super.z();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public void b(g1 g1Var) {
        q qVar;
        TapAction tapAction = ((r0) this.f16259b).f15149f.f15208i;
        com.fyber.inneractive.sdk.player.f fVar = this.f16258a;
        if (fVar == null || fVar.f17963a == null || this.B >= this.A) {
            if (tapAction == TapAction.CTR) {
                a(false, VideoClickOrigin.CTA, g1Var);
                return;
            }
            if (tapAction == TapAction.FULLSCREEN) {
                G();
                return;
            }
            if (tapAction != TapAction.DO_NOTHING) {
                IAlog.a("%sonVideoClicked called, but we recieved an unknown tap action %s", IAlog.a(this), tapAction);
                return;
            }
            if (fVar == null || (qVar = fVar.f17963a) == null) {
                return;
            }
            com.fyber.inneractive.sdk.player.enums.b bVar = qVar.f16237e;
            if (bVar != com.fyber.inneractive.sdk.player.enums.b.Completed && bVar != com.fyber.inneractive.sdk.player.enums.b.Prepared) {
                qVar.j();
            } else {
                qVar.a(1, true);
            }
        }
    }
}
