package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.util.c1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class r0 implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l0 f15146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o0 f15147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p0 f15148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t0 f15149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u0 f15150g;

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        c1.a(jSONObject, "id", this.f15144a);
        c1.a(jSONObject, "spotId", this.f15145b);
        c1.a(jSONObject, "display", this.f15146c);
        c1.a(jSONObject, "monitor", this.f15147d);
        c1.a(jSONObject, "native", this.f15148e);
        c1.a(jSONObject, "video", this.f15149f);
        c1.a(jSONObject, "viewability", this.f15150g);
        return jSONObject.toString();
    }
}
