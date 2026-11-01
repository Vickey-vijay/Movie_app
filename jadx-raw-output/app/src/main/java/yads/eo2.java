package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class eo2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f77159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f77160c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eo2)) {
            return false;
        }
        eo2 eo2Var = (eo2) obj;
        return ck.p.e(this.f77158a, eo2Var.f77158a) && ck.p.e(this.f77159b, eo2Var.f77159b) && ck.p.e(this.f77160c, eo2Var.f77160c);
    }

    public final c a() {
        return this.f77160c;
    }

    public final Map b() {
        return this.f77159b;
    }

    public final int hashCode() {
        int iHashCode = (this.f77159b.hashCode() + (this.f77158a.hashCode() * 31)) * 31;
        c cVar = this.f77160c;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        return "Report(eventName=" + this.f77158a + ", data=" + this.f77159b + ", abExperiments=" + this.f77160c + ")";
    }

    public eo2(String str, Map map, c cVar) {
        this.f77158a = str;
        this.f77159b = map;
        this.f77160c = cVar;
        map.put("sdk_version", "7.18.1");
    }
}
