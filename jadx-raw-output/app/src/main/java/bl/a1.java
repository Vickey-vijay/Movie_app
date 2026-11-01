package bl;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class a1 implements xk.b<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a1 f5375a = new a1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.a f5376b = new u1("kotlin.Long", zk.e.g.f86466a);

    @Override // xk.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Long deserialize(al.e eVar) {
        ck.p.j(eVar, "decoder");
        return Long.valueOf(eVar.h());
    }

    public void b(al.f fVar, long j10) {
        ck.p.j(fVar, "encoder");
        fVar.z(j10);
    }

    @Override // xk.b, xk.g, xk.a
    public kotlinx.serialization.descriptors.a getDescriptor() {
        return f5376b;
    }

    @Override // xk.g
    public /* bridge */ /* synthetic */ void serialize(al.f fVar, Object obj) {
        b(fVar, ((Number) obj).longValue());
    }
}
