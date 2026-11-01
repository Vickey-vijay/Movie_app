package yads;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class n43 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile n43 f80556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f80557c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f80558a = new LinkedHashMap();

    public final void a(ie1 ie1Var, Object obj) {
        synchronized (f80557c) {
            Set set = (Set) this.f80558a.get(ie1Var);
            if (set != null) {
                set.remove(obj);
            }
        }
    }

    public final void b(ie1 ie1Var, Object obj) {
        synchronized (f80557c) {
            Set linkedHashSet = (Set) this.f80558a.get(ie1Var);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                this.f80558a.put(ie1Var, linkedHashSet);
            }
            linkedHashSet.add(obj);
        }
    }
}
