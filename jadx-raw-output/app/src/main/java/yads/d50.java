package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f76578a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d50) && ck.p.e(this.f76578a, ((d50) obj).f76578a);
    }

    public final int hashCode() {
        return this.f76578a.hashCode();
    }

    public final String toString() {
        return "DebugPanelAdaptersData(adapters=" + this.f76578a + ")";
    }

    public d50(ArrayList arrayList) {
        this.f76578a = arrayList;
    }
}
