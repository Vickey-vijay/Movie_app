package com.unity3d.ads.injection;

import ck.p;
import ck.s;
import com.ironsource.C3426d4;
import com.ironsource.C3605n2;
import java.util.Map;
import kotlin.b;
import kotlin.collections.a;
import mj.g;
import mj.h;
import nj.l0;
import qk.l;
import qk.v;

/* JADX INFO: compiled from: Registry.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Registry {
    private final l<Map<EntryKey, g<?>>> _services = v.a(a.j());

    public static /* synthetic */ Object get$default(Registry registry, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        p.j(str, "named");
        p.p(4, "T");
        EntryKey entryKey = new EntryKey(str, s.b(Object.class));
        g<?> gVar = registry.getServices().get(entryKey);
        if (gVar != null) {
            Object value = gVar.getValue();
            p.p(1, "T");
            return value;
        }
        throw new IllegalStateException("No entry found for " + entryKey);
    }

    public static /* synthetic */ Object getOrNull$default(Registry registry, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        p.j(str, "named");
        p.p(4, "T");
        g<?> gVar = registry.getServices().get(new EntryKey(str, s.b(Object.class)));
        if (gVar == null) {
            return null;
        }
        Object value = gVar.getValue();
        p.p(1, "T");
        return value;
    }

    public static /* synthetic */ EntryKey factory$default(Registry registry, String str, bk.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        p.j(str, "named");
        p.j(aVar, C3605n2.f30210p);
        p.p(4, "T");
        EntryKey entryKey = new EntryKey(str, s.b(Object.class));
        registry.add(entryKey, new Factory(aVar));
        return entryKey;
    }

    public static /* synthetic */ EntryKey single$default(Registry registry, String str, bk.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        p.j(str, "named");
        p.j(aVar, C3605n2.f30210p);
        p.p(4, "T");
        EntryKey entryKey = new EntryKey(str, s.b(Object.class));
        registry.add(entryKey, b.a(aVar));
        return entryKey;
    }

    public final <T> void add(EntryKey entryKey, g<? extends T> gVar) {
        Map<EntryKey, g<?>> value;
        p.j(entryKey, C3426d4.i.W);
        p.j(gVar, C3605n2.f30210p);
        if (!(!getServices().containsKey(entryKey))) {
            throw new IllegalStateException("Cannot have identical entries.".toString());
        }
        l<Map<EntryKey, g<?>>> lVar = this._services;
        do {
            value = lVar.getValue();
        } while (!lVar.a(value, a.q(value, l0.g(h.a(entryKey, gVar)))));
    }

    public final /* synthetic */ <T> EntryKey factory(String str, bk.a<? extends T> aVar) {
        p.j(str, "named");
        p.j(aVar, C3605n2.f30210p);
        p.p(4, "T");
        EntryKey entryKey = new EntryKey(str, s.b(Object.class));
        add(entryKey, new Factory(aVar));
        return entryKey;
    }

    public final /* synthetic */ <T> T get(String str) {
        p.j(str, "named");
        p.p(4, "T");
        EntryKey entryKey = new EntryKey(str, s.b(Object.class));
        g<?> gVar = getServices().get(entryKey);
        if (gVar != null) {
            T t10 = (T) gVar.getValue();
            p.p(1, "T");
            return t10;
        }
        throw new IllegalStateException("No entry found for " + entryKey);
    }

    public final /* synthetic */ <T> T getOrNull(String str) {
        p.j(str, "named");
        p.p(4, "T");
        g<?> gVar = getServices().get(new EntryKey(str, s.b(Object.class)));
        if (gVar == null) {
            return null;
        }
        T t10 = (T) gVar.getValue();
        p.p(1, "T");
        return t10;
    }

    public final Map<EntryKey, g<?>> getServices() {
        return this._services.getValue();
    }

    public final /* synthetic */ <T> EntryKey single(String str, bk.a<? extends T> aVar) {
        p.j(str, "named");
        p.j(aVar, C3605n2.f30210p);
        p.p(4, "T");
        EntryKey entryKey = new EntryKey(str, s.b(Object.class));
        add(entryKey, b.a(aVar));
        return entryKey;
    }
}
