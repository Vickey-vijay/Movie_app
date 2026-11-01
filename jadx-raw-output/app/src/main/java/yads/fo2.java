package yads;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class fo2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f77471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f77472b;

    public /* synthetic */ fo2(Map map, int i10) {
        this((i10 & 1) != 0 ? kotlin.collections.a.j() : map, (c) null);
    }

    public final void a(Object obj, String str) {
        if (obj != null) {
            this.f77471a.put(str, obj);
        }
    }

    public final void b(Object obj, String str) {
        if (obj == null) {
            this.f77471a.put(str, "undefined");
        } else {
            this.f77471a.put(str, obj);
        }
    }

    public fo2(Map map, c cVar) {
        map = ck.x.m(map) ? map : null;
        this.f77471a = map == null ? new LinkedHashMap() : map;
        this.f77472b = cVar;
    }
}
