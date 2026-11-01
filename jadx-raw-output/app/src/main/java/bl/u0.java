package bl;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class u0<K, V> extends c1<K, V, Map<K, ? extends V>, LinkedHashMap<K, V>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.a f5471c;

    @Override // bl.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(LinkedHashMap<K, V> linkedHashMap, int i10) {
        ck.p.j(linkedHashMap, "<this>");
    }

    @Override // bl.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public Map<K, V> l(LinkedHashMap<K, V> linkedHashMap) {
        ck.p.j(linkedHashMap, "<this>");
        return linkedHashMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(xk.b<K> bVar, xk.b<V> bVar2) {
        super(bVar, bVar2, null);
        ck.p.j(bVar, "kSerializer");
        ck.p.j(bVar2, "vSerializer");
        this.f5471c = new t0(bVar.getDescriptor(), bVar2.getDescriptor());
    }

    @Override // bl.c1, xk.b, xk.g, xk.a
    public kotlinx.serialization.descriptors.a getDescriptor() {
        return this.f5471c;
    }

    @Override // bl.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap<K, V> a() {
        return new LinkedHashMap<>();
    }

    @Override // bl.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int b(LinkedHashMap<K, V> linkedHashMap) {
        ck.p.j(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    @Override // bl.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Iterator<Map.Entry<K, V>> d(Map<K, ? extends V> map) {
        ck.p.j(map, "<this>");
        return map.entrySet().iterator();
    }

    @Override // bl.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public int e(Map<K, ? extends V> map) {
        ck.p.j(map, "<this>");
        return map.size();
    }

    @Override // bl.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap<K, V> k(Map<K, ? extends V> map) {
        ck.p.j(map, "<this>");
        LinkedHashMap<K, V> linkedHashMap = map instanceof LinkedHashMap ? (LinkedHashMap) map : null;
        return linkedHashMap == null ? new LinkedHashMap<>(map) : linkedHashMap;
    }
}
