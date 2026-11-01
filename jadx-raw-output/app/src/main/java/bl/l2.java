package bl;

/* JADX INFO: compiled from: ValueClasses.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class l2 implements xk.b<mj.k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l2 f5436a = new l2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.a f5437b = m0.a("kotlin.UInt", yk.a.z(ck.o.f6058a));

    public int a(al.e eVar) {
        ck.p.j(eVar, "decoder");
        return mj.k.b(eVar.y(getDescriptor()).u());
    }

    public void b(al.f fVar, int i10) {
        ck.p.j(fVar, "encoder");
        fVar.g(getDescriptor()).s(i10);
    }

    @Override // xk.b, xk.g, xk.a
    public kotlinx.serialization.descriptors.a getDescriptor() {
        return f5437b;
    }

    @Override // xk.g
    public /* bridge */ /* synthetic */ void serialize(al.f fVar, Object obj) {
        b(fVar, ((mj.k) obj).f());
    }

    @Override // xk.a
    public /* bridge */ /* synthetic */ Object deserialize(al.e eVar) {
        return mj.k.a(a(eVar));
    }
}
