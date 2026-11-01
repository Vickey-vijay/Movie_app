package com.fyber.inneractive.sdk.dv.banner;

import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.l0;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.dv.i;
import com.fyber.inneractive.sdk.flow.b0;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.interfaces.d;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.o;
import com.google.android.gms.ads.AdView;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends b0 implements d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ViewGroup f15237k;

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void a(int i10) {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void a(ViewGroup viewGroup) {
        x xVar;
        if (this.f15332a == null) {
            IAlog.f("%sYou must set the spot to render before calling renderAd", IAlog.a(this));
            return;
        }
        if (viewGroup == null || (xVar = this.f15333b) == null) {
            return;
        }
        b bVar = (b) xVar;
        if (bVar.f15231i != null) {
            bVar.f15230h = this;
            if (bVar.f15234j) {
                w();
                bVar.f15234j = false;
            }
            this.f15237k = viewGroup;
            viewGroup.addView((View) ((b) this.f15333b).f15231i);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void m() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void q() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void r() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final boolean b(View view) {
        ViewGroup viewGroup = this.f15237k;
        return viewGroup != null && viewGroup.equals(view);
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        x xVar = this.f15333b;
        if (xVar != null) {
            Object obj = ((b) xVar).f15231i;
            if (obj != null) {
                ((AdView) obj).destroy();
            }
            b bVar = (b) this.f15333b;
            bVar.f15229g = null;
            bVar.f15231i = null;
        }
        ViewGroup viewGroup = this.f15237k;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f15237k = null;
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final int e() {
        Object obj;
        x xVar = this.f15333b;
        if (xVar == null || (obj = ((b) xVar).f15231i) == null || ((AdView) obj).getAdSize() == null) {
            return 0;
        }
        return o.b(((AdView) ((b) this.f15333b).f15231i).getAdSize().getWidth());
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final int o() {
        Object obj;
        x xVar = this.f15333b;
        if (xVar == null || (obj = ((b) xVar).f15231i) == null || ((AdView) obj).getAdSize() == null) {
            return 0;
        }
        return o.b(((AdView) ((b) this.f15333b).f15231i).getAdSize().getHeight());
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void t() {
        ViewGroup viewGroup = this.f15237k;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f15237k = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final View z() {
        return this.f15237k;
    }

    public final void w() {
        i iVar;
        l0 l0Var;
        com.fyber.inneractive.sdk.cache.session.enums.c cVar;
        G();
        x xVar = this.f15333b;
        if (xVar != null && (iVar = (i) ((b) xVar).f15747b) != null) {
            b(iVar);
            s0 s0Var = ((b) this.f15333b).f15749d;
            if (s0Var != null && (l0Var = ((r0) s0Var).f15146c) != null) {
                com.fyber.inneractive.sdk.cache.session.enums.a aVar = com.fyber.inneractive.sdk.cache.session.enums.a.IMPRESSION;
                if (l0Var.f15131b == UnitDisplayType.MRECT) {
                    cVar = com.fyber.inneractive.sdk.cache.session.enums.c.RECTANGLE_DISPLAY;
                } else {
                    cVar = com.fyber.inneractive.sdk.cache.session.enums.c.BANNER_DISPLAY;
                }
                b0.a(aVar, cVar);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final boolean a(x xVar) {
        return xVar instanceof com.fyber.inneractive.sdk.dv.a;
    }
}
