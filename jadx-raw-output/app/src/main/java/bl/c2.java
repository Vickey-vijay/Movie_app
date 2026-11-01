package bl;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class c2 implements xk.b<Short> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c2 f5392a = new c2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.a f5393b = new u1("kotlin.Short", zk.e.h.f86467a);

    @Override // xk.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Short deserialize(al.e eVar) {
        ck.p.j(eVar, "decoder");
        return Short.valueOf(eVar.l());
    }

    public void b(al.f fVar, short s10) {
        ck.p.j(fVar, "encoder");
        fVar.j(s10);
    }

    @Override // xk.b, xk.g, xk.a
    public kotlinx.serialization.descriptors.a getDescriptor() {
        return f5393b;
    }

    @Override // xk.g
    public /* bridge */ /* synthetic */ void serialize(al.f fVar, Object obj) {
        b(fVar, ((Number) obj).shortValue());
    }
}
