package bl;

import java.util.Iterator;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class t<Element, Collection, Builder> extends a<Element, Collection, Builder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xk.b<Element> f5469a;

    public t(xk.b<Element> bVar) {
        super(null);
        this.f5469a = bVar;
    }

    public /* synthetic */ t(xk.b bVar, ck.i iVar) {
        this(bVar);
    }

    @Override // xk.b, xk.g, xk.a
    public abstract kotlinx.serialization.descriptors.a getDescriptor();

    public abstract void insert(Builder builder, int i10, Element element);

    @Override // bl.a
    public final void g(al.c cVar, Builder builder, int i10, int i11) {
        ck.p.j(cVar, "decoder");
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
        }
        for (int i12 = 0; i12 < i11; i12++) {
            h(cVar, i10 + i12, builder, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bl.a
    public void h(al.c cVar, int i10, Builder builder, boolean z10) {
        ck.p.j(cVar, "decoder");
        insert(builder, i10, al.c.a.c(cVar, getDescriptor(), i10, this.f5469a, null, 8, null));
    }

    @Override // xk.g
    public void serialize(al.f fVar, Collection collection) {
        ck.p.j(fVar, "encoder");
        int iE = e(collection);
        kotlinx.serialization.descriptors.a descriptor = getDescriptor();
        al.d dVarY = fVar.y(descriptor, iE);
        Iterator<Element> itD = d(collection);
        for (int i10 = 0; i10 < iE; i10++) {
            dVarY.m(getDescriptor(), i10, this.f5469a, itD.next());
        }
        dVarY.c(descriptor);
    }
}
