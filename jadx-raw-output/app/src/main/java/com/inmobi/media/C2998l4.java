package com.inmobi.media;

import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.l4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2998l4 extends AbstractC3277w9 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f24737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f24738d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2998l4(String str, String str2, List list, boolean z10) {
        super(str);
        ck.p.j(str, "url");
        ck.p.j(str2, "accountId");
        ck.p.j(list, "configRequestContexts");
        this.f24736b = str2;
        this.f24737c = list;
        this.f24738d = z10;
    }

    public final Le a() throws JSONException {
        List<C3023m4> list = this.f24737c;
        JSONArray jSONArray = new JSONArray();
        for (C3023m4 c3023m4 : list) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("n", c3023m4.f24802b.getType());
            jSONObject.put("t", c3023m4.f24802b.getLastUpdateTimeStamp());
            jSONArray.put(jSONObject);
        }
        String string = jSONArray.toString();
        ck.p.i(string, "toString(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("im-accid", this.f24736b);
        linkedHashMap.put("p", string);
        ck.p.j(linkedHashMap, "<this>");
        JSONObject jSONObjectB = W6.b();
        if (jSONObjectB != null) {
            String string2 = jSONObjectB.toString();
            ck.p.i(string2, "toString(...)");
            linkedHashMap.put("consentObject", string2);
        }
        ck.p.j(linkedHashMap, "<this>");
        linkedHashMap.putAll(A1.f22337e);
        linkedHashMap.putAll(C3298x5.f25687a.a(false));
        linkedHashMap.putAll(AbstractC3351z8.a());
        ck.p.j(linkedHashMap, "<this>");
        linkedHashMap.put("u-appsecure", String.valueOf((int) A1.f22338f));
        ck.p.j(linkedHashMap, "<this>");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (this.f24738d) {
            linkedHashMap2.put("rip", "true");
        }
        return new Le(this.f25628a, linkedHashMap2, null, new Y6(linkedHashMap), null, 52);
    }
}
