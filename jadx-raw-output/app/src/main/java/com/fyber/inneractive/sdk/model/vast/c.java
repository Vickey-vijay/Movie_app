package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements com.fyber.inneractive.sdk.response.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f15888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f15889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f15893f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f15894g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f15895h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f15896i = new HashMap();

    public final void a(x xVar, String str) {
        List arrayList = (List) this.f15896i.get(xVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f15896i.put(xVar, arrayList);
        }
        if (arrayList.contains(str)) {
            return;
        }
        arrayList.add(str);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Companion:  w:");
        sb2.append(this.f15890c);
        sb2.append(" h:");
        sb2.append(this.f15891d);
        sb2.append(" type:");
        sb2.append(this.f15888a.toString());
        sb2.append(" creativeType: ");
        k kVar = this.f15889b;
        sb2.append(kVar != null ? kVar.mimeType : "none");
        sb2.append(" ctr:");
        sb2.append(this.f15894g);
        sb2.append(" events:");
        sb2.append(this.f15896i);
        return sb2.toString();
    }

    public c(i iVar, int i10, int i11, String str, int i12) {
        this.f15888a = iVar;
        this.f15890c = i10;
        this.f15891d = i11;
        this.f15892e = str;
        this.f15895h = i12;
    }

    @Override // com.fyber.inneractive.sdk.response.i
    public final List a(x xVar) {
        if (xVar == null || this.f15896i.isEmpty()) {
            return null;
        }
        return (List) this.f15896i.get(xVar);
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("w", this.f15890c);
            jSONObject.put("h", this.f15891d);
            jSONObject.put("type", this.f15888a.toString());
            k kVar = this.f15889b;
            jSONObject.put("creativeType", kVar != null ? kVar.mimeType : "none");
            jSONObject.put("content", this.f15893f);
        } catch (JSONException e10) {
            IAlog.a("Vast Parser: Failed creating Companion json object: %s", e10.getMessage());
        }
        return jSONObject;
    }
}
