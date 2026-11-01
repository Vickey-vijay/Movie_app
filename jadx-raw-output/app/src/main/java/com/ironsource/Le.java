package com.ironsource;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class Le {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f27008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3787xd f27009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, C3719td> f27010c;

    public final JSONObject a() {
        return this.f27008a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Le)) {
            return false;
        }
        Le le2 = (Le) obj;
        return ck.p.e(this.f27008a, le2.f27008a) && ck.p.e(this.f27009b, le2.f27009b) && ck.p.e(this.f27010c, le2.f27010c);
    }

    public Le(JSONObject jSONObject, C3787xd c3787xd, Map<String, C3719td> map) {
        ck.p.j(jSONObject, "configurations");
        ck.p.j(c3787xd, "providerOrder");
        ck.p.j(map, "providerSettings");
        this.f27008a = jSONObject;
        this.f27009b = c3787xd;
        this.f27010c = map;
    }

    public final Le a(JSONObject jSONObject, C3787xd c3787xd, Map<String, C3719td> map) {
        ck.p.j(jSONObject, "configurations");
        ck.p.j(c3787xd, "providerOrder");
        ck.p.j(map, "providerSettings");
        return new Le(jSONObject, c3787xd, map);
    }

    public final C3787xd b() {
        return this.f27009b;
    }

    public final Map<String, C3719td> c() {
        return this.f27010c;
    }

    public final JSONObject d() {
        return this.f27008a;
    }

    public final C3787xd e() {
        return this.f27009b;
    }

    public final Map<String, C3719td> f() {
        return this.f27010c;
    }

    public int hashCode() {
        return (((this.f27008a.hashCode() * 31) + this.f27009b.hashCode()) * 31) + this.f27010c.hashCode();
    }

    public String toString() {
        return "ServerResponse2(configurations=" + this.f27008a + ", providerOrder=" + this.f27009b + ", providerSettings=" + this.f27010c + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Le a(Le le2, JSONObject jSONObject, C3787xd c3787xd, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jSONObject = le2.f27008a;
        }
        if ((i10 & 2) != 0) {
            c3787xd = le2.f27009b;
        }
        if ((i10 & 4) != 0) {
            map = le2.f27010c;
        }
        return le2.a(jSONObject, c3787xd, map);
    }
}
