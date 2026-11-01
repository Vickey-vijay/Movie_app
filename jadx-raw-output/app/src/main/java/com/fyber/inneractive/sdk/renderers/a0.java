package com.fyber.inneractive.sdk.renderers;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.external.MediaView;
import com.fyber.inneractive.sdk.flow.w0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.util.l0;
import com.fyber.inneractive.sdk.util.m0;
import com.fyber.inneractive.sdk.util.n0;

/* JADX INFO: loaded from: classes10.dex */
public final class a0 extends e implements w, m0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ViewGroup f18351l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.nativead.trackers.a f18353n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView f18354o;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f18352m = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f18355p = new y(this);

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final boolean E() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.util.m0
    public final void a(float f10, Rect rect) {
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f18373k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.ui.controller.a) bVar).a(f10);
        }
    }

    @Override // com.fyber.inneractive.sdk.renderers.w
    public final void b(ViewGroup viewGroup) {
        if (this.f15332a == null) {
            IAlog.f("%sYou must set the spot to render before calling renderAd", IAlog.a(this));
            return;
        }
        this.f18351l = viewGroup;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ImageView imageView = new ImageView(this.f18351l.getContext());
        this.f18354o = imageView;
        imageView.setImageURI(((w0) this.f15333b).f15734m);
        this.f18354o.getViewTreeObserver().addOnWindowFocusChangeListener(this);
        this.f18351l.setLayoutParams(layoutParams);
        this.f18351l.addView(this.f18354o, layoutParams);
        com.fyber.inneractive.sdk.ui.controller.a aVar = new com.fyber.inneractive.sdk.ui.controller.a();
        this.f18373k = aVar;
        aVar.f18541a = this.f18355p;
        n0 n0Var = l0.f18590a;
        ViewGroup viewGroup2 = this.f18351l;
        n0Var.getClass();
        n0Var.a(viewGroup2.getContext(), viewGroup2, this);
    }

    static {
        IAlog.a(a0.class);
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        com.fyber.inneractive.sdk.flow.nativead.trackers.a aVar = this.f18353n;
        if (aVar != null) {
            aVar.a();
            this.f18353n = null;
        }
        ImageView imageView = this.f18354o;
        if (imageView != null) {
            imageView.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
            this.f18354o = null;
        }
        l0.f18590a.a(this.f18351l);
        com.fyber.inneractive.sdk.util.v.a(this.f18351l);
        this.f18351l = null;
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f18373k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.ui.controller.a) bVar).f18541a = null;
        }
        super.destroy();
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z10) {
        l0.f18590a.a(com.fyber.inneractive.sdk.util.o.a(z()).getApplicationContext());
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final View z() {
        MediaView mediaView;
        com.fyber.inneractive.sdk.flow.x xVar = this.f15333b;
        return (xVar == null || (mediaView = ((w0) xVar).f15735n) == null) ? this.f18351l : mediaView;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.k
    public final void a(String str, boolean z10, com.fyber.inneractive.sdk.util.g gVar, com.fyber.inneractive.sdk.click.o oVar) {
        if (!this.f18352m) {
            com.fyber.inneractive.sdk.util.r.f18607b.post(new z(this));
            com.fyber.inneractive.sdk.ui.controller.b bVar = this.f18373k;
            if (bVar instanceof com.fyber.inneractive.sdk.ui.controller.a) {
                ((com.fyber.inneractive.sdk.ui.controller.a) bVar).f18542b.set(true);
            }
        }
        com.fyber.inneractive.sdk.util.r.f18607b.post(new com.fyber.inneractive.sdk.flow.y(this, com.fyber.inneractive.sdk.util.o.a(z()), str, new g1(), gVar, z10, oVar));
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.trackers.c
    public final void b() {
        com.fyber.inneractive.sdk.flow.nativead.trackers.a aVar = this.f18353n;
        if (aVar != null) {
            aVar.a();
        }
    }
}
