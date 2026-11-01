package com.fyber.inneractive.sdk.config.global;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f15079c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f15080d = new ArrayList();

    public static void a(b bVar, JSONObject jSONObject, boolean z10) {
        d cVar;
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                next.getClass();
                switch (next) {
                    case "demand":
                        cVar = new c(jSONObject.getJSONArray(next), z10);
                        break;
                    case "pub_id":
                        cVar = new i(jSONObject.getJSONArray(next), z10);
                        break;
                    case "placement_type":
                        cVar = new h(jSONObject.getJSONArray(next), z10);
                        break;
                    case "os":
                        cVar = new f(z10, jSONObject.getString(next));
                        break;
                    case "sdk":
                        cVar = new j(z10, jSONObject.getString(next));
                        break;
                    default:
                        cVar = null;
                        break;
                }
                if (cVar != null) {
                    bVar.f15080d.add(cVar);
                } else {
                    IAlog.a("b: Unsupported filter type: " + next, new Object[0]);
                }
            }
        }
    }

    public final String toString() {
        return String.format("experiment: id=%s, variants=%s, filters=%s", this.f15077a, this.f15079c, this.f15080d);
    }
}
