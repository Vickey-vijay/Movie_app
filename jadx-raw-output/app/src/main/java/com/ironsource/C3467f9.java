package com.ironsource;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.f9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3467f9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<String> f28893a = new ArrayList<>(new C3449e9().a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final S6 f28894b = new S6();

    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectA = this.f28894b.a(this.f28893a);
        ck.p.i(jSONObjectA, "mGlobalDataReader.getDataByKeys(mInitKeyList)");
        return jSONObjectA;
    }
}
