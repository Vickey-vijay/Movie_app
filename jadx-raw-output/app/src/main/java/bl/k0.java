package bl;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class k0<E> extends u<E, Set<? extends E>, HashSet<E>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.a f5430b;

    @Override // bl.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void c(HashSet<E> hashSet, int i10) {
        ck.p.j(hashSet, "<this>");
    }

    @Override // bl.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Set<E> l(HashSet<E> hashSet) {
        ck.p.j(hashSet, "<this>");
        return hashSet;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(xk.b<E> bVar) {
        super(bVar);
        ck.p.j(bVar, "eSerializer");
        this.f5430b = new j0(bVar.getDescriptor());
    }

    @Override // bl.t, xk.b, xk.g, xk.a
    public kotlinx.serialization.descriptors.a getDescriptor() {
        return this.f5430b;
    }

    @Override // bl.t
    public void insert(HashSet<E> hashSet, int i10, E e10) {
        ck.p.j(hashSet, "<this>");
        hashSet.add(e10);
    }

    @Override // bl.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public HashSet<E> a() {
        return new HashSet<>();
    }

    @Override // bl.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public int b(HashSet<E> hashSet) {
        ck.p.j(hashSet, "<this>");
        return hashSet.size();
    }

    @Override // bl.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public HashSet<E> k(Set<? extends E> set) {
        ck.p.j(set, "<this>");
        HashSet<E> hashSet = set instanceof HashSet ? (HashSet) set : null;
        return hashSet == null ? new HashSet<>(set) : hashSet;
    }
}
