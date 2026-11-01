package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;

/* JADX INFO: loaded from: classes11.dex */
public final class o implements com.fyber.inneractive.sdk.player.controller.a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f18395a;

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(String str, String str2) {
        p pVar = this.f18395a;
        pVar.getClass();
        IAlog.a("%s ad view video ad renderer callback: onSuspiciousNoUserWebActionDetected", IAlog.a(pVar));
        ViewGroup viewGroup = this.f18395a.f18400p;
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        p pVar2 = this.f18395a;
        if (pVar2.f18405u) {
            IAlog.a("%s redirect already reported for this ad", IAlog.a(pVar2));
            return;
        }
        com.fyber.inneractive.sdk.network.b0.a(pVar2.f18400p.getContext(), str, str2, this.f18395a.f15333b);
        p pVar3 = this.f18395a;
        pVar3.f18405u = true;
        IAlog.a("%s reporting auto redirect", IAlog.a(pVar3));
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(boolean z10) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(boolean z10, Orientation orientation) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void d() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void f() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void g() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void j() {
    }

    public o(p pVar) {
        this.f18395a = pVar;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void i() {
        this.f18395a.a(new WebViewRendererProcessHasGoneError());
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void k() {
        this.f18395a.K();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void onCompleted() {
        com.fyber.inneractive.sdk.player.ui.m mVar;
        p pVar = this.f18395a;
        VideoContentListener videoContentListener = pVar.f18398n;
        if (videoContentListener == null || (mVar = pVar.f18397m) == null || !((com.fyber.inneractive.sdk.player.ui.e) mVar).f18071e) {
            return;
        }
        videoContentListener.onCompleted();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void onPlayerError() {
        com.fyber.inneractive.sdk.player.ui.m mVar;
        p pVar = this.f18395a;
        VideoContentListener videoContentListener = pVar.f18398n;
        if (videoContentListener == null || (mVar = pVar.f18397m) == null || !((com.fyber.inneractive.sdk.player.ui.e) mVar).f18071e) {
            return;
        }
        videoContentListener.onPlayerError();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void onProgress(int i10, int i11) {
        com.fyber.inneractive.sdk.player.ui.m mVar;
        p pVar = this.f18395a;
        VideoContentListener videoContentListener = pVar.f18398n;
        if (videoContentListener == null || (mVar = pVar.f18397m) == null || !((com.fyber.inneractive.sdk.player.ui.e) mVar).f18071e) {
            return;
        }
        videoContentListener.onProgress(i10, i11);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final com.fyber.inneractive.sdk.ignite.m p() {
        return com.fyber.inneractive.sdk.ignite.m.NONE;
    }

    @Override // com.fyber.inneractive.sdk.ui.controller.c
    public final void u() {
        this.f18395a.K();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(View view, String str) {
        if (view != null) {
            Context contextC = this.f18395a.c(view);
            InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(contextC, str);
            this.f18395a.a(contextC, false, Float.NaN, Float.NaN);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final com.fyber.inneractive.sdk.util.d0 a(g1 g1Var, com.fyber.inneractive.sdk.util.g gVar) {
        Context context;
        com.fyber.inneractive.sdk.response.e eVar;
        com.fyber.inneractive.sdk.model.vast.b bVar;
        p pVar = this.f18395a;
        if (pVar.f18397m.getContext() == null) {
            context = com.fyber.inneractive.sdk.util.o.f18599a;
        } else {
            context = this.f18395a.f18397m.getContext();
        }
        com.fyber.inneractive.sdk.flow.x xVar = this.f18395a.f15333b;
        return pVar.a(context, (xVar == null || (eVar = ((t0) xVar).f15747b) == null || (bVar = ((com.fyber.inneractive.sdk.response.g) eVar).O) == null) ? null : bVar.f15873b, g1Var, gVar, false, null);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final com.fyber.inneractive.sdk.util.d0 a(String str, g1 g1Var, boolean z10) {
        String str2;
        d0 d0Var;
        com.fyber.inneractive.sdk.flow.x xVar;
        com.fyber.inneractive.sdk.model.vast.b bVar;
        if (TextUtils.isEmpty(str) && (xVar = this.f18395a.f15333b) != null) {
            com.fyber.inneractive.sdk.response.e eVar = ((t0) xVar).f15747b;
            str = (eVar == null || (bVar = ((com.fyber.inneractive.sdk.response.g) eVar).O) == null) ? null : bVar.f15873b;
        }
        p pVar = this.f18395a;
        com.fyber.inneractive.sdk.ui.controller.b bVar2 = (com.fyber.inneractive.sdk.player.controller.b) pVar.f18373k;
        if (bVar2 == null && (d0Var = pVar.f18401q) != null) {
            bVar2 = d0Var.f18370a;
        }
        com.fyber.inneractive.sdk.flow.endcard.k kVarJ = bVar2 != null ? ((com.fyber.inneractive.sdk.player.controller.z) bVar2).j() : null;
        com.fyber.inneractive.sdk.flow.endcard.b bVarA = kVarJ != null ? kVarJ.f15376b.a() : null;
        if (bVarA instanceof com.fyber.inneractive.sdk.flow.endcard.c) {
            String str3 = ((com.fyber.inneractive.sdk.flow.endcard.c) bVarA).f15363g.f15894g;
            if (TextUtils.isEmpty(str3)) {
                str2 = str;
            } else {
                str2 = str3;
            }
        } else {
            str2 = str;
        }
        p pVar2 = this.f18395a;
        return pVar2.a(pVar2.c(pVar2.f18400p), str2, g1Var, z10 ? com.fyber.inneractive.sdk.util.g.DEFAULT_ENDCARD : com.fyber.inneractive.sdk.util.g.VAST_ENDCARD, false, null);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(View view) {
        p pVar = this.f18395a;
        if (pVar.f15334c != null) {
            pVar.a(pVar.c(view), false, Float.NaN, Float.NaN);
        }
    }
}
