package yads;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class c80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f76207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f76208b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c80)) {
            return false;
        }
        c80 c80Var = (c80) obj;
        return ck.p.e(this.f76207a, c80Var.f76207a) && ck.p.e(this.f76208b, c80Var.f76208b);
    }

    public final int hashCode() {
        return this.f76208b.hashCode() + (this.f76207a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelLogsData(sdkLogs=" + this.f76207a + ", networkLogs=" + this.f76208b + ")";
    }

    public c80(List list, List list2) {
        this.f76207a = list;
        this.f76208b = list2;
    }
}
