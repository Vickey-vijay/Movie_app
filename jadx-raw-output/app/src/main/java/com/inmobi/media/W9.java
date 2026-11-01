package com.inmobi.media;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class W9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f23732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONArray f23733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3130qb f23734c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W9)) {
            return false;
        }
        W9 w10 = (W9) obj;
        return ck.p.e(this.f23732a, w10.f23732a) && ck.p.e(this.f23733b, w10.f23733b) && ck.p.e(this.f23734c, w10.f23734c);
    }

    public W9(JSONObject jSONObject, JSONArray jSONArray, C3130qb c3130qb) {
        ck.p.j(jSONObject, "vitals");
        ck.p.j(jSONArray, "logs");
        ck.p.j(c3130qb, "data");
        this.f23732a = jSONObject;
        this.f23733b = jSONArray;
        this.f23734c = c3130qb;
    }

    public final int hashCode() {
        return this.f23734c.hashCode() + ((this.f23733b.hashCode() + (this.f23732a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "IncompleteLogData(vitals=" + this.f23732a + ", logs=" + this.f23733b + ", data=" + this.f23734c + ")";
    }
}
