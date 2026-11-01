package bl;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements xk.b<Byte> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f5433a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.a f5434b = new u1("kotlin.Byte", zk.e.b.f86461a);

    @Override // xk.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Byte deserialize(al.e eVar) {
        ck.p.j(eVar, "decoder");
        return Byte.valueOf(eVar.H());
    }

    public void b(al.f fVar, byte b10) {
        ck.p.j(fVar, "encoder");
        fVar.e(b10);
    }

    @Override // xk.b, xk.g, xk.a
    public kotlinx.serialization.descriptors.a getDescriptor() {
        return f5434b;
    }

    @Override // xk.g
    public /* bridge */ /* synthetic */ void serialize(al.f fVar, Object obj) {
        b(fVar, ((Number) obj).byteValue());
    }
}
