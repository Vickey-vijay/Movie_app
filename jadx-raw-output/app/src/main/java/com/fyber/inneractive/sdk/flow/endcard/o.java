package com.fyber.inneractive.sdk.flow.endcard;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.x0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.i1;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class o extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f15415g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.fyber.inneractive.sdk.web.a f15416h;

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final void a(ViewGroup viewGroup, com.fyber.inneractive.sdk.player.ui.b bVar) {
        p pVar = (p) f();
        View viewB = pVar.b();
        if (viewB != null) {
            com.fyber.inneractive.sdk.util.v.a(viewB);
            viewGroup.addView(viewB);
            i1 i1Var = pVar.e().f16200a;
            if (i1Var != null) {
                i1Var.a(true);
            }
        }
        a(this.f15361e, this.f15359c);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final n c() {
        return new p(this);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final com.fyber.inneractive.sdk.util.g g() {
        com.fyber.inneractive.sdk.web.a aVar = this.f15416h;
        com.fyber.inneractive.sdk.util.g gVar = com.fyber.inneractive.sdk.util.g.FMP_ENDCARD;
        gVar.a(aVar.f18636a);
        gVar.a(aVar.f18637b);
        return gVar;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final l h() {
        return l.Fmp;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final com.fyber.inneractive.sdk.model.vast.i i() {
        return com.fyber.inneractive.sdk.model.vast.i.FMP_End_Card;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final boolean j() {
        return this.f15361e > 1;
    }

    public o(x0 x0Var, String str, int i10) {
        super(i10, x0Var);
        this.f15416h = new com.fyber.inneractive.sdk.web.a(null, 0);
        this.f15415g = str;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final com.fyber.inneractive.sdk.player.ui.c d() {
        View viewB = f().b();
        com.fyber.inneractive.sdk.player.ui.c cVarD = super.d();
        cVarD.f18060e = viewB;
        return cVarD;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final boolean l() {
        p pVar = (p) f();
        if (pVar.f15430f && pVar.b() != null) {
            return true;
        }
        return false;
    }

    public final String n() {
        q qVar;
        com.fyber.inneractive.sdk.web.b bVar = (com.fyber.inneractive.sdk.web.b) ((p) f()).e().f16200a;
        if (bVar == null || (qVar = bVar.N) == null) {
            return null;
        }
        return qVar.f15422c;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final void a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        if (inneractiveInfrastructureError.isErrorAlreadyReported(com.fyber.inneractive.sdk.network.t.FMP_COMPANION_FAILED_LOADING)) {
            return;
        }
        Throwable cause = inneractiveInfrastructureError.getCause();
        IAlog.a("%s sending FMP_COMPANION_FAILED_LOADING event", this.f15357a);
        JSONObject jSONObject = new JSONObject();
        String strA = com.fyber.inneractive.sdk.util.v.a(cause);
        if (!TextUtils.isEmpty(strA)) {
            try {
                jSONObject.put("error", strA);
            } catch (Exception unused) {
                IAlog.f("Got exception adding param to json object: %s, %s", "error", strA);
            }
        }
        String strN = n();
        if (!TextUtils.isEmpty(strN)) {
            try {
                jSONObject.put("version", strN);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", "version", strN);
            }
        }
        Boolean bool = Boolean.FALSE;
        try {
            jSONObject.put("loaded_from_cache", bool);
        } catch (Exception unused3) {
            IAlog.f("Got exception adding param to json object: %s, %s", "loaded_from_cache", bool);
        }
        x0 x0Var = this.f15359c;
        com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.FMP_COMPANION_FAILED_LOADING;
        InneractiveAdRequest inneractiveAdRequest = x0Var.f15754c;
        com.fyber.inneractive.sdk.response.g gVar = x0Var.f15755d;
        JSONArray jSONArray = x0Var.f15757f;
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(gVar);
        wVar.f16128b = tVar;
        wVar.f16127a = inneractiveAdRequest;
        wVar.f16130d = jSONArray;
        wVar.f16132f.put(jSONObject);
        wVar.a((String) null);
    }

    public final void a(int i10, x0 x0Var) {
        String strN = n();
        this.f15416h = new com.fyber.inneractive.sdk.web.a(strN, i10);
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(strN)) {
            try {
                jSONObject.put("version", strN);
            } catch (Exception unused) {
                IAlog.f("Got exception adding param to json object: %s, %s", "version", strN);
            }
        }
        Boolean boolValueOf = Boolean.valueOf(((p) f()).f15419l);
        try {
            jSONObject.put("loaded_from_cache", boolValueOf);
        } catch (Exception unused2) {
            IAlog.f("Got exception adding param to json object: %s, %s", "loaded_from_cache", boolValueOf);
        }
        com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.FMP_COMPANION_SUCCESSFULLY_SHOWN;
        InneractiveAdRequest inneractiveAdRequest = x0Var.f15754c;
        com.fyber.inneractive.sdk.response.g gVar = x0Var.f15755d;
        JSONArray jSONArray = x0Var.f15757f;
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(gVar);
        wVar.f16129c = uVar;
        wVar.f16127a = inneractiveAdRequest;
        wVar.f16130d = jSONArray;
        wVar.f16132f.put(jSONObject);
        wVar.a((String) null);
    }
}
