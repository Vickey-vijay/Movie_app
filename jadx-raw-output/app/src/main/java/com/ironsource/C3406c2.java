package com.ironsource;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3406c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Q6.a f28297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<String> f28298b = new ArrayList<>(new C3370a2().a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final S6 f28299c = new S6();

    public final JSONObject a() {
        Q6.a aVar = this.f28297a;
        JSONObject jSONObjectA = aVar != null ? this.f28299c.a(this.f28298b, aVar) : null;
        if (jSONObjectA == null) {
            jSONObjectA = this.f28299c.a(this.f28298b);
            ck.p.i(jSONObjectA, "mGlobalDataReader.getDataByKeys(mAuctionKeyList)");
        }
        return a(jSONObjectA);
    }

    public C3406c2(Q6.a aVar) {
        this.f28297a = aVar;
    }

    private final JSONObject a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectB = T6.b(jSONObject.optJSONObject(Q6.f27472u));
        if (jSONObjectB != null) {
            jSONObject.put(Q6.f27472u, jSONObjectB);
        }
        return jSONObject;
    }
}
