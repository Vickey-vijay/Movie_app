package bl;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class z implements xk.b<Double> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f5492a = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.a f5493b = new u1("kotlin.Double", zk.e.d.f86463a);

    @Override // xk.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Double deserialize(al.e eVar) {
        ck.p.j(eVar, "decoder");
        return Double.valueOf(eVar.m());
    }

    public void b(al.f fVar, double d10) {
        ck.p.j(fVar, "encoder");
        fVar.x(d10);
    }

    @Override // xk.b, xk.g, xk.a
    public kotlinx.serialization.descriptors.a getDescriptor() {
        return f5493b;
    }

    @Override // xk.g
    public /* bridge */ /* synthetic */ void serialize(al.f fVar, Object obj) {
        b(fVar, ((Number) obj).doubleValue());
    }
}
