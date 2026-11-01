package bl;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class d2 implements xk.b<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d2 f5397a = new d2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.a f5398b = new u1("kotlin.String", zk.e.i.f86468a);

    @Override // xk.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String deserialize(al.e eVar) {
        ck.p.j(eVar, "decoder");
        return eVar.o();
    }

    @Override // xk.g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(al.f fVar, String str) {
        ck.p.j(fVar, "encoder");
        ck.p.j(str, "value");
        fVar.v(str);
    }

    @Override // xk.b, xk.g, xk.a
    public kotlinx.serialization.descriptors.a getDescriptor() {
        return f5398b;
    }
}
