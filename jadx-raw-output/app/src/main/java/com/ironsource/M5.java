package com.ironsource;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class M5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<String> f27038a = new ArrayList<>(new L5().a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final S6 f27039b = new S6();

    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectA = this.f27039b.a(this.f27038a);
        ck.p.i(jSONObjectA, "mGlobalDataReader.getDataByKeys(mEventsKeyList)");
        return jSONObjectA;
    }
}
