package yads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes11.dex */
public class u extends n implements SortedMap {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SortedSet f83276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a0 f83277g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(a0 a0Var, SortedMap sortedMap) {
        super(a0Var, sortedMap);
        this.f83277g = a0Var;
    }

    public SortedSet a() {
        return new v(this.f83277g, b());
    }

    public SortedMap b() {
        return (SortedMap) this.f80487d;
    }

    public SortedMap headMap(Object obj) {
        return new u(this.f83277g, b().headMap(obj));
    }

    @Override // yads.n, java.util.AbstractMap, java.util.Map
    public SortedSet keySet() {
        SortedSet sortedSet = this.f83276f;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetA = a();
        this.f83276f = sortedSetA;
        return sortedSetA;
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new u(this.f83277g, b().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new u(this.f83277g, b().tailMap(obj));
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return b().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return b().firstKey();
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return b().lastKey();
    }
}
