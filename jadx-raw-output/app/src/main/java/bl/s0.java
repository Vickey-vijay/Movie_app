package bl;

import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class s0<K, V, R> implements xk.b<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xk.b<K> f5464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xk.b<V> f5465b;

    public s0(xk.b<K> bVar, xk.b<V> bVar2) {
        this.f5464a = bVar;
        this.f5465b = bVar2;
    }

    public /* synthetic */ s0(xk.b bVar, xk.b bVar2, ck.i iVar) {
        this(bVar, bVar2);
    }

    public abstract K a(R r10);

    public abstract V c(R r10);

    public abstract R e(K k10, V v10);

    public final xk.b<K> b() {
        return this.f5464a;
    }

    public final xk.b<V> d() {
        return this.f5465b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xk.a
    public R deserialize(al.e eVar) {
        R r10;
        ck.p.j(eVar, "decoder");
        kotlinx.serialization.descriptors.a descriptor = getDescriptor();
        al.c cVarB = eVar.b(descriptor);
        if (cVarB.j()) {
            r10 = (R) e(al.c.a.c(cVarB, getDescriptor(), 0, b(), null, 8, null), al.c.a.c(cVarB, getDescriptor(), 1, d(), null, 8, null));
        } else {
            Object objC = f2.f5404a;
            Object objC2 = f2.f5404a;
            while (true) {
                int iX = cVarB.x(getDescriptor());
                if (iX == -1) {
                    if (objC == f2.f5404a) {
                        throw new SerializationException("Element 'key' is missing");
                    }
                    if (objC2 == f2.f5404a) {
                        throw new SerializationException("Element 'value' is missing");
                    }
                    r10 = (R) e(objC, objC2);
                    break;
                }
                if (iX == 0) {
                    objC = al.c.a.c(cVarB, getDescriptor(), 0, b(), null, 8, null);
                } else {
                    if (iX != 1) {
                        throw new SerializationException("Invalid index: " + iX);
                    }
                    objC2 = al.c.a.c(cVarB, getDescriptor(), 1, d(), null, 8, null);
                }
            }
        }
        cVarB.c(descriptor);
        return r10;
    }

    @Override // xk.g
    public void serialize(al.f fVar, R r10) {
        ck.p.j(fVar, "encoder");
        al.d dVarB = fVar.b(getDescriptor());
        dVarB.m(getDescriptor(), 0, this.f5464a, a(r10));
        dVarB.m(getDescriptor(), 1, this.f5465b, c(r10));
        dVarB.c(getDescriptor());
    }
}
