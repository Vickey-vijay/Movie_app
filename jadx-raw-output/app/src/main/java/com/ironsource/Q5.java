package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class Q5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f27411a;

    public final Boolean a(String str) {
        ck.p.j(str, C3426d4.i.W);
        JSONObject jSONObject = this.f27411a;
        Object objOpt = jSONObject != null ? jSONObject.opt(str) : null;
        if (objOpt instanceof Boolean) {
            return (Boolean) objOpt;
        }
        return null;
    }

    public final Integer b(String str) {
        ck.p.j(str, C3426d4.i.W);
        JSONObject jSONObject = this.f27411a;
        Object objOpt = jSONObject != null ? jSONObject.opt(str) : null;
        if (objOpt instanceof Integer) {
            return (Integer) objOpt;
        }
        return null;
    }

    public final String c(String str) {
        ck.p.j(str, C3426d4.i.W);
        JSONObject jSONObject = this.f27411a;
        Object objOpt = jSONObject != null ? jSONObject.opt(str) : null;
        if (objOpt instanceof String) {
            return (String) objOpt;
        }
        return null;
    }

    public Q5(JSONObject jSONObject) {
        this.f27411a = jSONObject;
    }
}
