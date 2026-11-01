package bl;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class f<E> extends u<E, List<? extends E>, ArrayList<E>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.a f5401b;

    @Override // bl.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public List<E> l(ArrayList<E> arrayList) {
        ck.p.j(arrayList, "<this>");
        return arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(xk.b<E> bVar) {
        super(bVar);
        ck.p.j(bVar, "element");
        this.f5401b = new e(bVar.getDescriptor());
    }

    @Override // bl.t, xk.b, xk.g, xk.a
    public kotlinx.serialization.descriptors.a getDescriptor() {
        return this.f5401b;
    }

    @Override // bl.t
    public void insert(ArrayList<E> arrayList, int i10, E e10) {
        ck.p.j(arrayList, "<this>");
        arrayList.add(i10, e10);
    }

    @Override // bl.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public ArrayList<E> a() {
        return new ArrayList<>();
    }

    @Override // bl.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public int b(ArrayList<E> arrayList) {
        ck.p.j(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // bl.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void c(ArrayList<E> arrayList, int i10) {
        ck.p.j(arrayList, "<this>");
        arrayList.ensureCapacity(i10);
    }

    @Override // bl.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public ArrayList<E> k(List<? extends E> list) {
        ck.p.j(list, "<this>");
        ArrayList<E> arrayList = list instanceof ArrayList ? (ArrayList) list : null;
        return arrayList == null ? new ArrayList<>(list) : arrayList;
    }
}
