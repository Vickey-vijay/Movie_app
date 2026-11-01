package com.ironsource;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3512i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<String> f29111a = new ArrayList<>(new C3494h0().a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final S6 f29112b = new S6();

    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectA = this.f29112b.a(this.f29111a);
        ck.p.i(jSONObjectA, "mGlobalDataReader.getDataByKeys(mAdQualityKeyList)");
        return jSONObjectA;
    }
}
