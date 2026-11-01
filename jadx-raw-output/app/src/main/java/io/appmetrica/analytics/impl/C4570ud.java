package io.appmetrica.analytics.impl;

import com.ironsource.C3426d4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ud, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4570ud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f57766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f57767b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4570ud)) {
            return false;
        }
        C4570ud c4570ud = (C4570ud) obj;
        return ck.p.e(this.f57766a, c4570ud.f57766a) && this.f57767b == c4570ud.f57767b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f57767b) + (this.f57766a.hashCode() * 31);
    }

    public final String toString() {
        return "ModulesStatus(modulesStatus=" + this.f57766a + ", lastSendTime=" + this.f57767b + ')';
    }

    public final String a() {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject();
            List<C4114cd> list = this.f57766a;
            ArrayList arrayList = new ArrayList(nj.t.v(list, 10));
            for (C4114cd c4114cd : list) {
                c4114cd.getClass();
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("moduleName", c4114cd.f56512a);
                    jSONObject.put(C3426d4.i.f28562r, c4114cd.f56513b);
                } catch (Throwable unused) {
                    jSONObject = new JSONObject();
                }
                arrayList.add(jSONObject);
            }
            jSONObject2.put("modulesStatus", new JSONArray((Collection) arrayList));
            jSONObject2.put("lastSendTime", this.f57767b);
            return jSONObject2.toString();
        } catch (Throwable unused2) {
            return "";
        }
    }

    public C4570ud(List list, long j10) {
        this.f57766a = list;
        this.f57767b = j10;
    }
}
