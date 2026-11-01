package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveAdViewVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveNativeVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.l0;
import com.fyber.inneractive.sdk.util.m0;
import com.fyber.inneractive.sdk.util.n0;

/* JADX INFO: loaded from: classes11.dex */
public class p extends e implements com.fyber.inneractive.sdk.interfaces.d, InneractiveNativeVideoContentController.Renderer, m0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public FrameLayout f18396l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.ui.m f18397m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public VideoContentListener f18398n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ViewGroup f18400p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public d0 f18401q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public n f18404t;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final m f18399o = new m(this);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f18402r = 0.0f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Rect f18403s = new Rect();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f18405u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final o f18406v = new o(this);

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void a(int i10) {
    }

    public boolean a(com.fyber.inneractive.sdk.flow.x xVar) {
        return xVar instanceof t0;
    }

    public void b(ViewGroup viewGroup) {
        a(viewGroup);
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        this.f18398n = null;
        t();
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final int e() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final int o() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void q() {
    }

    public void K() {
        com.fyber.inneractive.sdk.flow.x xVar = this.f15333b;
        if (xVar != null) {
            t0 t0Var = (t0) xVar;
            if (t0Var.f15695j) {
                return;
            }
            t0Var.f15695j = true;
            G();
        }
    }

    public void a(ViewGroup viewGroup) {
        InneractiveAdSpot inneractiveAdSpot = this.f15332a;
        if (inneractiveAdSpot == null) {
            IAlog.f("%sYou must set the spot to render before calling renderAd", IAlog.a(this));
            return;
        }
        this.f18400p = viewGroup;
        InneractiveUnitController selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
        if (a(selectedUnitController)) {
            this.f18398n = a(selectedUnitController.getSelectedContentController());
        } else {
            IAlog.f("%sWrong type of unit controller found. Expecting InneractiveAdViewUnitController", IAlog.a(this));
        }
        this.f18405u = false;
        this.f18396l = new FrameLayout(viewGroup.getContext());
        com.fyber.inneractive.sdk.flow.x xVar = this.f15333b;
        com.fyber.inneractive.sdk.player.t tVar = xVar != null ? ((t0) xVar).f15694i : null;
        Context context = viewGroup.getContext();
        d0 d0VarA = a(tVar);
        this.f18401q = d0VarA;
        if (d0VarA != null) {
            this.f18397m = d0VarA.a(context, ((t0) this.f15333b).f15748c);
            this.f18373k = (com.fyber.inneractive.sdk.player.controller.s) this.f18401q.a(this.f15332a, (t0) this.f15333b);
            this.f18400p.addView(this.f18396l, new ViewGroup.LayoutParams(-1, -2));
            this.f18400p.setLayoutTransition(null);
            this.f18396l.addView((View) this.f18397m, new FrameLayout.LayoutParams(-2, -2, 17));
            com.fyber.inneractive.sdk.player.controller.s sVar = (com.fyber.inneractive.sdk.player.controller.s) this.f18373k;
            o oVar = this.f18406v;
            sVar.getClass();
            sVar.f16264g = oVar;
            com.fyber.inneractive.sdk.player.controller.s sVar2 = (com.fyber.inneractive.sdk.player.controller.s) this.f18373k;
            this.f18401q.b();
            sVar2.b(false);
            this.f18401q.a(this.f18399o);
            n0 n0Var = l0.f18590a;
            ViewGroup viewGroup2 = this.f18400p;
            n0Var.getClass();
            n0Var.a(viewGroup2.getContext(), viewGroup2, this);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final boolean b(View view) {
        return view != null && view.equals(this.f18400p);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void m() {
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f18373k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.player.controller.s) bVar).b(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveNativeVideoContentController.Renderer
    public final void pauseVideo() {
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f18373k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.player.controller.s) bVar).z();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveNativeVideoContentController.Renderer
    public final void playVideo() {
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f18373k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.player.controller.s) bVar).c(0);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void r() {
        com.fyber.inneractive.sdk.player.controller.q qVar;
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f18373k;
        if (bVar != null) {
            com.fyber.inneractive.sdk.player.controller.s sVar = (com.fyber.inneractive.sdk.player.controller.s) bVar;
            IAlog.a("%sfullscreenExited called", IAlog.a(sVar));
            sVar.E = false;
            sVar.j(sVar.D);
            com.fyber.inneractive.sdk.player.f fVar = sVar.f16258a;
            if (fVar == null || (qVar = fVar.f17963a) == null) {
                return;
            }
            sVar.a(qVar.f16237e);
            sVar.a(sVar.f16258a.f17963a.b());
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void t() {
        ViewGroup viewGroup;
        n nVar = this.f18404t;
        if (nVar != null && (viewGroup = this.f18400p) != null) {
            viewGroup.removeCallbacks(nVar);
            this.f18404t = null;
        }
        l0.f18590a.a(this.f18400p);
        IAlog.a("%sunbind called. root is %s", IAlog.a(this), this.f18400p);
        if (this.f18373k != null) {
            IAlog.a("%sdestroying video ui controller", IAlog.a(this));
            com.fyber.inneractive.sdk.player.controller.s sVar = (com.fyber.inneractive.sdk.player.controller.s) this.f18373k;
            sVar.getClass();
            sVar.f16264g = null;
            ((com.fyber.inneractive.sdk.player.controller.s) this.f18373k).destroy();
            this.f18373k = null;
        }
        if (this.f18397m != null) {
            this.f18400p.setLayoutTransition(null);
            this.f18400p.removeView(this.f18396l);
            this.f18397m.destroy();
            this.f18397m = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final Context y() {
        return c(this.f18400p);
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public View z() {
        return this.f18396l;
    }

    public boolean a(InneractiveUnitController inneractiveUnitController) {
        return inneractiveUnitController instanceof InneractiveAdViewUnitController;
    }

    public VideoContentListener a(InneractiveContentController inneractiveContentController) {
        if (!(inneractiveContentController instanceof InneractiveAdViewVideoContentController)) {
            IAlog.f("%sContent controller expected to be InneractiveFullscreenVideoContentController and is %s", IAlog.a(this), inneractiveContentController.getClass().getSimpleName());
            return null;
        }
        return (VideoContentListener) ((InneractiveAdViewVideoContentController) inneractiveContentController).getEventsListener();
    }

    @Override // com.fyber.inneractive.sdk.util.m0
    public final void a(float f10, Rect rect) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (this.f18402r == f10 && this.f18403s.equals(rect)) {
            return;
        }
        this.f18402r = f10;
        this.f18403s.set(rect);
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f18373k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.player.controller.s) bVar).D = false;
            ((com.fyber.inneractive.sdk.player.ui.e) this.f18397m).e();
            ((com.fyber.inneractive.sdk.player.controller.s) this.f18373k).a(f10);
        }
        if (f10 > 0.0f) {
            n nVar = this.f18404t;
            if (nVar != null && (viewGroup2 = this.f18400p) != null) {
                viewGroup2.removeCallbacks(nVar);
                this.f18404t = null;
            }
            n nVar2 = new n(this);
            this.f18404t = nVar2;
            this.f18400p.postDelayed(nVar2, 100L);
            return;
        }
        n nVar3 = this.f18404t;
        if (nVar3 == null || (viewGroup = this.f18400p) == null) {
            return;
        }
        viewGroup.removeCallbacks(nVar3);
        this.f18404t = null;
    }

    public d0 a(com.fyber.inneractive.sdk.player.t tVar) {
        if (tVar == null || tVar.f18044f == null) {
            return null;
        }
        return new a(tVar);
    }
}
