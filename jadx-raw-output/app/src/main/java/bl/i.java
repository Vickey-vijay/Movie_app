package bl;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements xk.b<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f5416a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.a f5417b = new u1("kotlin.Boolean", zk.e.a.f86460a);

    @Override // xk.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean deserialize(al.e eVar) {
        ck.p.j(eVar, "decoder");
        return Boolean.valueOf(eVar.B());
    }

    public void b(al.f fVar, boolean z10) {
        ck.p.j(fVar, "encoder");
        fVar.k(z10);
    }

    @Override // xk.b, xk.g, xk.a
    public kotlinx.serialization.descriptors.a getDescriptor() {
        return f5417b;
    }

    @Override // xk.g
    public /* bridge */ /* synthetic */ void serialize(al.f fVar, Object obj) {
        b(fVar, ((Boolean) obj).booleanValue());
    }
}
