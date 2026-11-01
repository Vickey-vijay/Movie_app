package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class A implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54849a = "request_state";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54850b = "type";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f54851c = "last_attempt";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f54852d = "prev_attempt_result";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String fromModel(List<z> list) throws JSONException {
        ?? K;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        String str = this.f54849a;
        if (list != null) {
            K = new ArrayList(nj.t.v(list, 10));
            for (z zVar : list) {
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put(this.f54850b, zVar.f54925a);
                    jSONObject.put(this.f54851c, zVar.f54926b);
                    jSONObject.put(this.f54852d, u.a(zVar.f54927c));
                } catch (Throwable unused) {
                    jSONObject = new JSONObject();
                }
                K.add(jSONObject);
            }
        } else {
            K = nj.s.k();
        }
        jSONObject2.put(str, new JSONArray((Collection) K));
        return jSONObject2.toString();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<z> toModel(String str) {
        JSONArray jSONArrayOptJSONArray;
        z zVar;
        int i10;
        try {
            ArrayList arrayList = new ArrayList();
            if (str == null || (jSONArrayOptJSONArray = new JSONObject(str).optJSONArray(this.f54849a)) == null) {
                return arrayList;
            }
            int length = jSONArrayOptJSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i11);
                if (jSONObjectOptJSONObject != null) {
                    try {
                        String string = jSONObjectOptJSONObject.getString(this.f54850b);
                        long j10 = jSONObjectOptJSONObject.getLong(this.f54851c);
                        String string2 = jSONObjectOptJSONObject.getString(this.f54852d);
                        int[] iArrB = v.b(4);
                        int length2 = iArrB.length;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= length2) {
                                i10 = 0;
                                break;
                            }
                            i10 = iArrB[i12];
                            if (ck.p.e(u.a(i10), string2)) {
                                break;
                            }
                            i12++;
                        }
                        if (i10 == 0) {
                            i10 = 1;
                        }
                        zVar = new z(string, j10, i10);
                    } catch (Throwable unused) {
                        zVar = null;
                    }
                    if (zVar != null) {
                        arrayList.add(zVar);
                    } else {
                        continue;
                    }
                }
            }
            return arrayList;
        } catch (Throwable unused2) {
            return nj.s.k();
        }
    }
}
