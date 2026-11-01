package com.ironsource;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
class Uc extends AbstractC3439e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f27752i = C3471fd.f28905a;

    @Override // com.ironsource.AbstractC3439e
    public String a() {
        return C3471fd.f28905a;
    }

    @Override // com.ironsource.AbstractC3439e
    public String c() {
        return K5.f26927b;
    }

    @Override // com.ironsource.AbstractC3439e
    public String a(ArrayList<C5> arrayList, JSONObject jSONObject) {
        if (jSONObject == null) {
            this.f28715f = IronSourceVideoBridge.jsonObjectInit();
        } else {
            this.f28715f = jSONObject;
        }
        JSONArray jSONArray = new JSONArray();
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<C5> it = arrayList.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectA = a(it.next());
                if (jSONObjectA != null) {
                    jSONArray.put(jSONObjectA);
                }
            }
        }
        return a(jSONArray);
    }

    public Uc(int i10) {
        this.f28716g = i10;
    }
}
