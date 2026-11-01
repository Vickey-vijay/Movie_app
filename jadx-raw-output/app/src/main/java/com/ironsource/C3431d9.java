package com.ironsource;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.d9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3431d9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<String> f28683a = new ArrayList<>(new C3413c9().a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final S6 f28684b = new S6();

    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectA = this.f28684b.a(this.f28683a);
        ck.p.i(jSONObjectA, "mGlobalDataReader.getDat…mInitDeferredDataKeyList)");
        return jSONObjectA;
    }
}
