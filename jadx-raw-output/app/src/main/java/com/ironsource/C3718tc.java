package com.ironsource;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.tc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3718tc implements Cif<JSONObject>, InterfaceC3491gf<C3684rc> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, C3495h1> f31307a = new LinkedHashMap();

    @Override // com.ironsource.InterfaceC3501h7
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(EnumC3509hf enumC3509hf) throws JSONException {
        ck.p.j(enumC3509hf, C3426d4.a.f28427t);
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        for (Map.Entry<String, C3495h1> entry : this.f31307a.entrySet()) {
            String key = entry.getKey();
            JSONArray jSONArrayA = entry.getValue().a(enumC3509hf);
            if (jSONArrayA.length() > 0) {
                jSONObjectJsonObjectInit.put(key, jSONArrayA);
            }
        }
        return jSONObjectJsonObjectInit;
    }

    @Override // com.ironsource.InterfaceC3491gf
    public void a(C3684rc c3684rc) {
        ck.p.j(c3684rc, "record");
        String strC = c3684rc.c();
        Map<String, C3495h1> map = this.f31307a;
        C3495h1 c3495h1 = map.get(strC);
        if (c3495h1 == null) {
            c3495h1 = new C3495h1();
            map.put(strC, c3495h1);
        }
        c3495h1.a(c3684rc.a(new C3701sc()));
    }
}
