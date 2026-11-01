package yads;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class r40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f82099a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r40) && ck.p.e(this.f82099a, ((r40) obj).f82099a);
    }

    public final int hashCode() {
        return this.f82099a.hashCode();
    }

    public final String toString() {
        return "DebugPanelAdUnitMediationData(adapters=" + this.f82099a + ")";
    }

    public r40(List list) {
        this.f82099a = list;
    }
}
