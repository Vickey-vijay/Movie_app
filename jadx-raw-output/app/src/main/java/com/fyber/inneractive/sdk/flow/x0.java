package com.fyber.inneractive.sdk.flow;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f15753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InneractiveAdRequest f15754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.g f15755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.model.vast.b f15756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final JSONArray f15757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.features.u f15758g;

    public x0(Context context, t0 t0Var) {
        JSONArray jSONArrayB;
        com.fyber.inneractive.sdk.config.global.r rVar = t0Var.f15748c;
        InneractiveAdRequest inneractiveAdRequest = t0Var.f15746a;
        com.fyber.inneractive.sdk.response.g gVar = (com.fyber.inneractive.sdk.response.g) t0Var.f15747b;
        com.fyber.inneractive.sdk.model.vast.b bVar = gVar.O;
        com.fyber.inneractive.sdk.config.global.features.u uVar = null;
        if (rVar != null) {
            uVar = (com.fyber.inneractive.sdk.config.global.features.u) rVar.a(com.fyber.inneractive.sdk.config.global.features.u.class);
            jSONArrayB = rVar.b();
        } else {
            jSONArrayB = null;
        }
        this.f15752a = context;
        this.f15753b = t0Var;
        this.f15754c = inneractiveAdRequest;
        this.f15755d = gVar;
        this.f15756e = bVar;
        this.f15758g = uVar;
        this.f15757f = jSONArrayB;
    }
}
