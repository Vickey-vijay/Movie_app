package bl;

/* JADX INFO: compiled from: ValueClasses.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class r2 implements xk.b<mj.p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r2 f5462a = new r2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.a f5463b = m0.a("kotlin.UShort", yk.a.B(ck.u.f6064a));

    public short a(al.e eVar) {
        ck.p.j(eVar, "decoder");
        return mj.p.b(eVar.y(getDescriptor()).l());
    }

    public void b(al.f fVar, short s10) {
        ck.p.j(fVar, "encoder");
        fVar.g(getDescriptor()).j(s10);
    }

    @Override // xk.b, xk.g, xk.a
    public kotlinx.serialization.descriptors.a getDescriptor() {
        return f5463b;
    }

    @Override // xk.g
    public /* bridge */ /* synthetic */ void serialize(al.f fVar, Object obj) {
        b(fVar, ((mj.p) obj).f());
    }

    @Override // xk.a
    public /* bridge */ /* synthetic */ Object deserialize(al.e eVar) {
        return mj.p.a(a(eVar));
    }
}
