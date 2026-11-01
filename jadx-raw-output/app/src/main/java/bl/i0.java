package bl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class i0<K, V> extends c1<K, V, Map<K, ? extends V>, HashMap<K, V>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.a f5418c;

    @Override // bl.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(HashMap<K, V> map, int i10) {
        ck.p.j(map, "<this>");
    }

    @Override // bl.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public Map<K, V> l(HashMap<K, V> map) {
        ck.p.j(map, "<this>");
        return map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(xk.b<K> bVar, xk.b<V> bVar2) {
        super(bVar, bVar2, null);
        ck.p.j(bVar, "kSerializer");
        ck.p.j(bVar2, "vSerializer");
        this.f5418c = new h0(bVar.getDescriptor(), bVar2.getDescriptor());
    }

    @Override // bl.c1, xk.b, xk.g, xk.a
    public kotlinx.serialization.descriptors.a getDescriptor() {
        return this.f5418c;
    }

    @Override // bl.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public HashMap<K, V> a() {
        return new HashMap<>();
    }

    @Override // bl.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int b(HashMap<K, V> map) {
        ck.p.j(map, "<this>");
        return map.size() * 2;
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
    public HashMap<K, V> k(Map<K, ? extends V> map) {
        ck.p.j(map, "<this>");
        HashMap<K, V> map2 = map instanceof HashMap ? (HashMap) map : null;
        return map2 == null ? new HashMap<>(map) : map2;
    }
}
