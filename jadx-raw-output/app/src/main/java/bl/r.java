package bl;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class r implements xk.b<Character> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f5459a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.a f5460b = new u1("kotlin.Char", zk.e.c.f86462a);

    @Override // xk.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Character deserialize(al.e eVar) {
        ck.p.j(eVar, "decoder");
        return Character.valueOf(eVar.n());
    }

    public void b(al.f fVar, char c10) {
        ck.p.j(fVar, "encoder");
        fVar.D(c10);
    }

    @Override // xk.b, xk.g, xk.a
    public kotlinx.serialization.descriptors.a getDescriptor() {
        return f5460b;
    }

    @Override // xk.g
    public /* bridge */ /* synthetic */ void serialize(al.f fVar, Object obj) {
        b(fVar, ((Character) obj).charValue());
    }
}
