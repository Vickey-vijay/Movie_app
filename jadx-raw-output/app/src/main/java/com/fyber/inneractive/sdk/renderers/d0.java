package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.flow.t0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.controller.z f18370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.ui.s f18371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.n f18372c;

    public abstract com.fyber.inneractive.sdk.player.controller.b a(InneractiveAdSpot inneractiveAdSpot, t0 t0Var);

    public abstract com.fyber.inneractive.sdk.player.ui.m a(Context context, com.fyber.inneractive.sdk.config.global.r rVar);

    public abstract void a(com.fyber.inneractive.sdk.player.e eVar);

    public abstract void b();

    public String a() {
        t0 t0Var;
        com.fyber.inneractive.sdk.player.n nVar = this.f18372c;
        com.fyber.inneractive.sdk.response.e eVar = (nVar == null || (t0Var = nVar.f17964b) == null) ? null : t0Var.f15747b;
        if (eVar != null) {
            return eVar.F;
        }
        return null;
    }

    public d0(com.fyber.inneractive.sdk.player.t tVar) {
        this.f18372c = (com.fyber.inneractive.sdk.player.n) tVar.f18044f;
    }
}
