package yads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a0 extends e0 implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient Map f75344f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient int f75345g;

    public static Iterator a(Collection collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public final n b() {
        Map map = this.f75344f;
        if (map instanceof NavigableMap) {
            return new r(this, (NavigableMap) this.f75344f);
        }
        return map instanceof SortedMap ? new u(this, (SortedMap) this.f75344f) : new n(this, this.f75344f);
    }

    public final q c() {
        Map map = this.f75344f;
        if (map instanceof NavigableMap) {
            return new s(this, (NavigableMap) this.f75344f);
        }
        return map instanceof SortedMap ? new v(this, (SortedMap) this.f75344f) : new q(this, this.f75344f);
    }

    public a0(Map map) {
        ng2.a(map.isEmpty());
        this.f75344f = map;
    }
}
