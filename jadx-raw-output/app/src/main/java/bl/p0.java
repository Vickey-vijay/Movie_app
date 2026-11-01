package bl;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class p0 implements xk.b<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p0 f5452a = new p0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.a f5453b = new u1("kotlin.Int", zk.e.f.f86465a);

    @Override // xk.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer deserialize(al.e eVar) {
        ck.p.j(eVar, "decoder");
        return Integer.valueOf(eVar.u());
    }

    public void b(al.f fVar, int i10) {
        ck.p.j(fVar, "encoder");
        fVar.s(i10);
    }

    @Override // xk.b, xk.g, xk.a
    public kotlinx.serialization.descriptors.a getDescriptor() {
        return f5453b;
    }

    @Override // xk.g
    public /* bridge */ /* synthetic */ void serialize(al.f fVar, Object obj) {
        b(fVar, ((Number) obj).intValue());
    }
}
