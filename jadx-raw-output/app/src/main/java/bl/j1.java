package bl;

/* JADX INFO: compiled from: NullableSerializer.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class j1<T> implements xk.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xk.b<T> f5425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.a f5426b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && j1.class == obj.getClass() && ck.p.e(this.f5425a, ((j1) obj).f5425a);
    }

    public j1(xk.b<T> bVar) {
        ck.p.j(bVar, "serializer");
        this.f5425a = bVar;
        this.f5426b = new x1(bVar.getDescriptor());
    }

    @Override // xk.a
    public T deserialize(al.e eVar) {
        ck.p.j(eVar, "decoder");
        return eVar.E() ? (T) eVar.r(this.f5425a) : (T) eVar.g();
    }

    @Override // xk.b, xk.g, xk.a
    public kotlinx.serialization.descriptors.a getDescriptor() {
        return this.f5426b;
    }

    public int hashCode() {
        return this.f5425a.hashCode();
    }

    @Override // xk.g
    public void serialize(al.f fVar, T t10) {
        ck.p.j(fVar, "encoder");
        if (t10 == null) {
            fVar.A();
        } else {
            fVar.E();
            fVar.F(this.f5425a, t10);
        }
    }
}
