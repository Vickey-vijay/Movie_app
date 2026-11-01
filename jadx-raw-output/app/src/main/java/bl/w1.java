package bl;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class w1<ElementKlass, Element extends ElementKlass> extends t<Element, Element[], ArrayList<Element>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jk.c<ElementKlass> f5480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.a f5481c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(jk.c<ElementKlass> cVar, xk.b<Element> bVar) {
        super(bVar, null);
        ck.p.j(cVar, "kClass");
        ck.p.j(bVar, "eSerializer");
        this.f5480b = cVar;
        this.f5481c = new d(bVar.getDescriptor());
    }

    @Override // bl.t, xk.b, xk.g, xk.a
    public kotlinx.serialization.descriptors.a getDescriptor() {
        return this.f5481c;
    }

    @Override // bl.t
    public void insert(ArrayList<Element> arrayList, int i10, Element element) {
        ck.p.j(arrayList, "<this>");
        arrayList.add(i10, element);
    }

    @Override // bl.a
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public ArrayList<Element> a() {
        return new ArrayList<>();
    }

    @Override // bl.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public int b(ArrayList<Element> arrayList) {
        ck.p.j(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // bl.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void c(ArrayList<Element> arrayList, int i10) {
        ck.p.j(arrayList, "<this>");
        arrayList.ensureCapacity(i10);
    }

    @Override // bl.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Iterator<Element> d(Element[] elementArr) {
        ck.p.j(elementArr, "<this>");
        return ck.b.a(elementArr);
    }

    @Override // bl.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int e(Element[] elementArr) {
        ck.p.j(elementArr, "<this>");
        return elementArr.length;
    }

    @Override // bl.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public ArrayList<Element> k(Element[] elementArr) {
        ck.p.j(elementArr, "<this>");
        return new ArrayList<>(nj.l.f(elementArr));
    }

    @Override // bl.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Element[] l(ArrayList<Element> arrayList) {
        ck.p.j(arrayList, "<this>");
        return (Element[]) m1.m(arrayList, this.f5480b);
    }
}
