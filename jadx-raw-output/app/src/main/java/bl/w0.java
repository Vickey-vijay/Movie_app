package bl;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class w0<E> extends u<E, Set<? extends E>, LinkedHashSet<E>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.a f5479b;

    @Override // bl.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void c(LinkedHashSet<E> linkedHashSet, int i10) {
        ck.p.j(linkedHashSet, "<this>");
    }

    @Override // bl.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Set<E> l(LinkedHashSet<E> linkedHashSet) {
        ck.p.j(linkedHashSet, "<this>");
        return linkedHashSet;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(xk.b<E> bVar) {
        super(bVar);
        ck.p.j(bVar, "eSerializer");
        this.f5479b = new v0(bVar.getDescriptor());
    }

    @Override // bl.t, xk.b, xk.g, xk.a
    public kotlinx.serialization.descriptors.a getDescriptor() {
        return this.f5479b;
    }

    @Override // bl.t
    public void insert(LinkedHashSet<E> linkedHashSet, int i10, E e10) {
        ck.p.j(linkedHashSet, "<this>");
        linkedHashSet.add(e10);
    }

    @Override // bl.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet<E> a() {
        return new LinkedHashSet<>();
    }

    @Override // bl.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public int b(LinkedHashSet<E> linkedHashSet) {
        ck.p.j(linkedHashSet, "<this>");
        return linkedHashSet.size();
    }

    @Override // bl.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet<E> k(Set<? extends E> set) {
        ck.p.j(set, "<this>");
        LinkedHashSet<E> linkedHashSet = set instanceof LinkedHashSet ? (LinkedHashSet) set : null;
        return linkedHashSet == null ? new LinkedHashSet<>(set) : linkedHashSet;
    }
}
