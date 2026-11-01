package com.ironsource;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class H0 implements Cif<JSONObject>, InterfaceC3491gf<F0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, C3718tc> f26687a = new LinkedHashMap();

    @Override // com.ironsource.InterfaceC3501h7
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(EnumC3509hf enumC3509hf) throws JSONException {
        ck.p.j(enumC3509hf, C3426d4.a.f28427t);
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        for (Map.Entry<String, C3718tc> entry : this.f26687a.entrySet()) {
            String key = entry.getKey();
            JSONObject jSONObjectA = entry.getValue().a(enumC3509hf);
            if (jSONObjectA.length() > 0) {
                jSONObjectJsonObjectInit.put(lk.a0.a1(key, "_", null, 2, null), jSONObjectA);
            }
        }
        return jSONObjectJsonObjectInit;
    }

    @Override // com.ironsource.InterfaceC3491gf
    public void a(F0 f10) {
        ck.p.j(f10, "record");
        String strD = f10.d();
        Map<String, C3718tc> map = this.f26687a;
        C3718tc c3718tc = map.get(strD);
        if (c3718tc == null) {
            c3718tc = new C3718tc();
            map.put(strD, c3718tc);
        }
        c3718tc.a(f10.a(new G0()));
    }
}
