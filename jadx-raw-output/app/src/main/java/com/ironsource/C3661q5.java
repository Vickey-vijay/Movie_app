package com.ironsource;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONException;

/* JADX INFO: renamed from: com.ironsource.q5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3661q5 implements Kb<String, com.ironsource.mediationsdk.d.a> {
    @Override // com.ironsource.Kb
    public com.ironsource.mediationsdk.d.a a(String str) throws JSONException {
        ck.p.j(str, "input");
        com.ironsource.mediationsdk.d.a aVarA = com.ironsource.mediationsdk.d.b().a(IronSourceVideoBridge.jsonObjectInit(str));
        ck.p.i(aVarA, "getInstance().getAuction…sponse(JSONObject(input))");
        return aVarA;
    }
}
