package bl;

import bl.r1;
import java.util.Iterator;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class t1<Element, Array, Builder extends r1<Array>> extends t<Element, Array, Builder> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.a f5470b;

    public abstract Array q();

    public abstract void s(al.d dVar, Array array, int i10);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(xk.b<Element> bVar) {
        super(bVar, null);
        ck.p.j(bVar, "primitiveSerializer");
        this.f5470b = new s1(bVar.getDescriptor());
    }

    @Override // bl.a
    public final Iterator<Element> d(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead".toString());
    }

    @Override // bl.a, xk.a
    public final Array deserialize(al.e eVar) {
        ck.p.j(eVar, "decoder");
        return f(eVar, null);
    }

    @Override // bl.t, xk.b, xk.g, xk.a
    public final kotlinx.serialization.descriptors.a getDescriptor() {
        return this.f5470b;
    }

    @Override // bl.t
    public final void insert(Builder builder, int i10, Element element) {
        ck.p.j(builder, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead".toString());
    }

    @Override // bl.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final int b(Builder builder) {
        ck.p.j(builder, "<this>");
        return builder.d();
    }

    @Override // bl.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void c(Builder builder, int i10) {
        ck.p.j(builder, "<this>");
        builder.b(i10);
    }

    @Override // bl.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Array l(Builder builder) {
        ck.p.j(builder, "<this>");
        return (Array) builder.a();
    }

    @Override // bl.t, xk.g
    public final void serialize(al.f fVar, Array array) {
        ck.p.j(fVar, "encoder");
        int iE = e(array);
        kotlinx.serialization.descriptors.a aVar = this.f5470b;
        al.d dVarY = fVar.y(aVar, iE);
        s(dVarY, array, iE);
        dVarY.c(aVar);
    }

    @Override // bl.a
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Builder a() {
        return k(q());
    }
}
