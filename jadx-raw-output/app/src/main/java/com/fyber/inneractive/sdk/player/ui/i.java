package com.fyber.inneractive.sdk.player.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.ui.IAsmoothProgressBar;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h1;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends s {
    public final t0 A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final o f18076y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public p f18077z;

    @Override // com.fyber.inneractive.sdk.player.ui.e, com.fyber.inneractive.sdk.player.ui.m
    public final boolean a() {
        p pVar = this.f18077z;
        return pVar != null && pVar.a();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s, com.fyber.inneractive.sdk.player.ui.e, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f44970p, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void f(boolean z10) {
        this.f18076y.f(z10);
        if (a(this.f18077z)) {
            this.f18077z.f(z10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void g(boolean z10) {
        if (a(this.f18077z)) {
            this.f18077z.g(z10);
        } else {
            this.f18076y.g(z10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:63:0x013a  */
    /* JADX WARN: Code duplicated, block: B:68:0x0148  */
    /* JADX WARN: Code duplicated, block: B:74:0x0158  */
    public i(Context context, a aVar, com.fyber.inneractive.sdk.player.n nVar, com.fyber.inneractive.sdk.config.global.r rVar, String str) {
        boolean zA;
        p pVar;
        IAsmoothProgressBar iAsmoothProgressBar;
        boolean z10;
        ImageView imageView;
        boolean z11;
        String str2;
        Boolean boolValueOf;
        t0 t0Var;
        t0 t0Var2;
        super(context, rVar, null);
        this.A = null;
        this.A = nVar != null ? nVar.f17964b : null;
        com.fyber.inneractive.sdk.flow.g gVar = (context == null || nVar == null || (t0Var2 = nVar.f17964b) == null) ? null : new com.fyber.inneractive.sdk.flow.g(context, false, t0Var2.f15746a, t0Var2.f15747b, rVar);
        if (nVar == null || (t0Var = nVar.f17964b) == null) {
            zA = false;
        } else {
            com.fyber.inneractive.sdk.response.e eVar = t0Var.f15747b;
            zA = com.fyber.inneractive.sdk.player.f.a(rVar, eVar != null ? ((com.fyber.inneractive.sdk.response.g) eVar).H : com.fyber.inneractive.sdk.ignite.m.NONE);
        }
        o oVar = new o(context, gVar, aVar, rVar, zA, str);
        this.f18076y = oVar;
        if (nVar != null) {
            com.fyber.inneractive.sdk.model.vast.b bVar = nVar.f18025p;
            if (bVar == null || !(!TextUtils.isEmpty(bVar.f15885n))) {
                IAlog.a("%s : dynamic controls are not available", "IAVideoViewComposition");
            } else {
                com.fyber.inneractive.sdk.player.ui.remote.g gVar2 = nVar.f18030u;
                if ((gVar2 != null ? gVar2.f18119a : null) == null) {
                    IAlog.a("%s : dynamic controls are not available", "IAVideoViewComposition");
                } else {
                    com.fyber.inneractive.sdk.player.ui.remote.d dVar = gVar2 != null ? gVar2.f18119a : null;
                    if (dVar.f18097h) {
                        IAlog.a("%s : dynamic controls are already destroyed", "IAVideoViewComposition");
                    } else if (dVar.f18096g) {
                        IAlog.a("%s : dynamic controls load process timed out", "IAVideoViewComposition");
                        com.fyber.inneractive.sdk.player.ui.remote.g gVar3 = nVar.f18030u;
                        (gVar3 != null ? gVar3.f18119a : null).a(com.fyber.inneractive.sdk.network.events.b.TEMPLATE_LOAD_TIMEOUT, "Template loading is timed out", true, null);
                    } else if (dVar.f18091b.f18751j) {
                        pVar = new p(getContext().getApplicationContext(), aVar, dVar, oVar);
                    } else {
                        IAlog.a("%s : dynamic controls are not ready, yet", "IAVideoViewComposition");
                        com.fyber.inneractive.sdk.player.ui.remote.g gVar4 = nVar.f18030u;
                        (gVar4 != null ? gVar4.f18119a : null).a(com.fyber.inneractive.sdk.network.events.b.TEMPLATE_ERROR, "Template isn't loaded yet", true, null);
                    }
                }
            }
            this.f18077z = pVar;
            this.f18123l = oVar.f18123l;
            this.f18128q = oVar.f18128q;
            this.f18129r = oVar.f18129r;
            this.f18124m = oVar.f18124m;
            TextView textView = oVar.f18132u;
            this.f18132u = textView;
            a(textView, 10);
            a(this.f18124m, 8);
            a(this.f18123l, 7);
            a(this.f18128q, -1);
            if (a()) {
                p pVar2 = this.f18077z;
                iAsmoothProgressBar = oVar.O;
                if (iAsmoothProgressBar == null && iAsmoothProgressBar.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f(z10);
                imageView = oVar.M;
                if (imageView == null && imageView.getVisibility() == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                d(z11);
                oVar.h();
                attachViewToParent(pVar2, 0, new RelativeLayout.LayoutParams(-1, -1));
                u uVar = u.VAST_EVENT_DVC_IMPRESSION;
                InneractiveAdRequest adRequest = getAdRequest();
                com.fyber.inneractive.sdk.response.e adResponse = getAdResponse();
                com.fyber.inneractive.sdk.player.ui.remote.d dVar2 = pVar2.L;
                str2 = dVar2.f18095f;
                boolValueOf = Boolean.valueOf(dVar2.f18098i);
                w wVar = new w(uVar, adRequest, adResponse);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("loaded_from_cache", boolValueOf);
                } catch (Exception unused) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "loaded_from_cache", boolValueOf);
                }
                try {
                    jSONObject.put("templateURL", str2);
                } catch (Exception unused2) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "templateURL", str2);
                }
                wVar.f16132f.put(jSONObject);
                wVar.a((String) null);
            }
            View view = this.f18076y;
            attachViewToParent(view, 0, view.getLayoutParams());
        }
        IAlog.a("%s : flow manager is missing, unexpected and dynamic controls status are unknown", "IAVideoViewComposition");
        com.fyber.inneractive.sdk.network.events.a.a(com.fyber.inneractive.sdk.network.t.VAST_ERROR_DVC_FAILURE, com.fyber.inneractive.sdk.network.events.b.TEMPLATE_CONTENT_ERROR, getAdRequest(), getAdResponse(), "Missing flow manager", "", (Boolean) null);
        pVar = null;
        this.f18077z = pVar;
        this.f18123l = oVar.f18123l;
        this.f18128q = oVar.f18128q;
        this.f18129r = oVar.f18129r;
        this.f18124m = oVar.f18124m;
        TextView textView2 = oVar.f18132u;
        this.f18132u = textView2;
        a(textView2, 10);
        a(this.f18124m, 8);
        a(this.f18123l, 7);
        a(this.f18128q, -1);
        if (a()) {
            p pVar3 = this.f18077z;
            iAsmoothProgressBar = oVar.O;
            if (iAsmoothProgressBar == null) {
                z10 = false;
            } else {
                z10 = false;
            }
            f(z10);
            imageView = oVar.M;
            if (imageView == null) {
                z11 = false;
            } else {
                z11 = false;
            }
            d(z11);
            oVar.h();
            attachViewToParent(pVar3, 0, new RelativeLayout.LayoutParams(-1, -1));
            u uVar2 = u.VAST_EVENT_DVC_IMPRESSION;
            InneractiveAdRequest adRequest2 = getAdRequest();
            com.fyber.inneractive.sdk.response.e adResponse2 = getAdResponse();
            com.fyber.inneractive.sdk.player.ui.remote.d dVar3 = pVar3.L;
            str2 = dVar3.f18095f;
            boolValueOf = Boolean.valueOf(dVar3.f18098i);
            w wVar2 = new w(uVar2, adRequest2, adResponse2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("loaded_from_cache", boolValueOf);
            jSONObject2.put("templateURL", str2);
            wVar2.f16132f.put(jSONObject2);
            wVar2.a((String) null);
        }
        View view2 = this.f18076y;
        attachViewToParent(view2, 0, view2.getLayoutParams());
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(com.fyber.inneractive.sdk.flow.endcard.d dVar, b bVar) {
        ViewGroup viewGroup;
        p pVar;
        this.f18076y.a(dVar, bVar);
        if (!a(this.f18077z) || (viewGroup = this.f18128q) == null || viewGroup.getVisibility() != 0 || (pVar = this.f18077z) == null) {
            return;
        }
        pVar.destroy();
        this.f18077z = null;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void b(boolean z10) {
        this.f18076y.b(z10);
        if (a(this.f18077z)) {
            this.f18077z.b(z10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void c(boolean z10) {
        this.f18076y.c(z10);
        if (a(this.f18077z)) {
            this.f18077z.c(z10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void d(boolean z10) {
        this.f18076y.d(z10);
        if (a(this.f18077z)) {
            this.f18077z.d(z10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void e(boolean z10) {
        if (a(this.f18077z)) {
            this.f18077z.e(z10);
        } else {
            this.f18076y.e(z10);
        }
    }

    public InneractiveAdRequest getAdRequest() {
        t0 t0Var = this.A;
        if (t0Var != null) {
            return t0Var.f15746a;
        }
        return null;
    }

    public com.fyber.inneractive.sdk.response.e getAdResponse() {
        t0 t0Var = this.A;
        if (t0Var != null) {
            return t0Var.f15747b;
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public View getEndCardView() {
        return this.f18076y.getEndCardView();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public View[] getTrackingFriendlyView() {
        return a(this.f18077z) ? this.f18077z.getTrackingFriendlyView() : this.f18076y.getTrackingFriendlyView();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public View[] getTrackingFriendlyViewObstructionPurposeOther() {
        return a(this.f18077z) ? this.f18077z.getTrackingFriendlyViewObstructionPurposeOther() : this.f18076y.getTrackingFriendlyViewObstructionPurposeOther();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void h() {
        this.f18076y.h();
        if (a(this.f18077z)) {
            this.f18077z.h();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final boolean i() {
        return a(this.f18077z) ? this.f18077z.L.f18103n : this.f18076y.i();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void j() {
        this.f18076y.j();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void k() {
        this.f18076y.k();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final boolean l() {
        return a(this.f18077z) ? this.f18077z.L.f18102m : this.f18076y.l();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void m() {
        this.f18076y.m();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void n() {
        this.f18076y.n();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void o() {
        this.f18076y.o();
        this.f18131t = this.f18076y.f18131t;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setAppInfoButtonRound(TextView textView) {
        this.f18076y.setAppInfoButtonRound(textView);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setMuteButtonState(boolean z10) {
        this.f18076y.setMuteButtonState(z10);
        if (a(this.f18077z)) {
            this.f18077z.setMuteButtonState(z10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setRemainingTime(String str) {
        this.f18076y.setRemainingTime(str);
        if (a(this.f18077z)) {
            this.f18077z.setRemainingTime(str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setSkipText(String str) {
        this.f18076y.setSkipText(str);
        if (a(this.f18077z)) {
            this.f18077z.setSkipText(str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e
    public void setListener(n nVar) {
        super.setListener(nVar);
        this.f18076y.setListener(nVar);
        if (a(this.f18077z)) {
            this.f18077z.setListener(nVar);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e
    public void setUnitConfig(s0 s0Var) {
        super.setUnitConfig(s0Var);
        this.f18076y.setUnitConfig(s0Var);
        if (a(this.f18077z)) {
            this.f18077z.setUnitConfig(s0Var);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void f() {
        o oVar = this.f18076y;
        oVar.p();
        oVar.B = true;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void g() {
        this.f18076y.g();
        if (a(this.f18077z)) {
            this.f18077z.g();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z10, com.fyber.inneractive.sdk.ignite.m mVar) {
        if (!a(this.f18077z)) {
            this.f18076y.a(z10, mVar);
        } else {
            this.f18077z.a(z10, mVar);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z10, String str) {
        this.f18076y.a(z10, str);
        if (a(this.f18077z)) {
            this.f18077z.a(z10, str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z10, int i10, int i11) {
        this.f18125n = i10;
        this.f18126o = i11;
        this.f18127p = z10;
        o oVar = this.f18076y;
        oVar.f18125n = i10;
        oVar.f18126o = i11;
        oVar.f18127p = z10;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(com.fyber.inneractive.sdk.flow.endcard.b bVar, b bVar2) {
        this.f18076y.a(bVar, bVar2);
        p pVar = this.f18077z;
        if (pVar != null) {
            pVar.destroy();
            this.f18077z = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z10) {
        if (a(this.f18077z)) {
            this.f18077z.a(z10);
        } else {
            this.f18076y.a(z10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(int i10, int i11) {
        this.f18076y.a(i10, i11);
        if (a(this.f18077z)) {
            this.f18077z.a(i10, i11);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e
    public final void a(h1 h1Var, int i10, int i11) {
        this.f18076y.a(h1Var, i10, i11);
    }

    public static boolean a(p pVar) {
        return (pVar == null || pVar.L.f18097h || !pVar.a()) ? false : true;
    }
}
