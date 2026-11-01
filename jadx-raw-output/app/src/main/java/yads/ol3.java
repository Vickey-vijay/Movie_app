package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ol3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f81099a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ol3) && ck.p.e(this.f81099a, ((ol3) obj).f81099a);
    }

    public final int hashCode() {
        return this.f81099a.hashCode();
    }

    public final String toString() {
        return "ViewableImpression(viewableUrls=" + this.f81099a + ")";
    }

    public ol3(ArrayList arrayList) {
        this.f81099a = arrayList;
    }
}
