package bl;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class f0 implements xk.b<Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f5402a = new f0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.a f5403b = new u1("kotlin.Float", zk.e.C0810e.f86464a);

    @Override // xk.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float deserialize(al.e eVar) {
        ck.p.j(eVar, "decoder");
        return Float.valueOf(eVar.z());
    }

    public void b(al.f fVar, float f10) {
        ck.p.j(fVar, "encoder");
        fVar.l(f10);
    }

    @Override // xk.b, xk.g, xk.a
    public kotlinx.serialization.descriptors.a getDescriptor() {
        return f5403b;
    }

    @Override // xk.g
    public /* bridge */ /* synthetic */ void serialize(al.f fVar, Object obj) {
        b(fVar, ((Number) obj).floatValue());
    }
}
