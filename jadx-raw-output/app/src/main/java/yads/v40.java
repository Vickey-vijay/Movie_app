package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class v40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f83736a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v40) && ck.p.e(this.f83736a, ((v40) obj).f83736a);
    }

    public final int hashCode() {
        return this.f83736a.hashCode();
    }

    public final String toString() {
        return "DebugPanelAdUnitsData(adUnits=" + this.f83736a + ")";
    }

    public v40(ArrayList arrayList) {
        this.f83736a = arrayList;
    }
}
