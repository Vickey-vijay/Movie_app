package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class Fo extends C2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f22690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f22691b;

    public /* synthetic */ Fo(Map map, ArrayList arrayList, int i10) {
        this((i10 & 1) != 0 ? kotlin.collections.a.j() : map, (i10 & 2) != 0 ? nj.s.k() : arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fo)) {
            return false;
        }
        Fo fo2 = (Fo) obj;
        return ck.p.e(this.f22690a, fo2.f22690a) && ck.p.e(this.f22691b, fo2.f22691b);
    }

    public final int hashCode() {
        return this.f22691b.hashCode() + (this.f22690a.hashCode() * 31);
    }

    public final String toString() {
        return "WithExtras(macros=" + this.f22690a + ", trackers=" + this.f22691b + ")";
    }

    public Fo(Map map, List list) {
        ck.p.j(map, "macros");
        ck.p.j(list, "trackers");
        this.f22690a = map;
        this.f22691b = list;
    }
}
