package bl;

/* JADX INFO: compiled from: ValueClasses.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class i2 implements xk.b<mj.i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i2 f5421a = new i2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.a f5422b = m0.a("kotlin.UByte", yk.a.v(ck.d.f6046a));

    public byte a(al.e eVar) {
        ck.p.j(eVar, "decoder");
        return mj.i.b(eVar.y(getDescriptor()).H());
    }

    public void b(al.f fVar, byte b10) {
        ck.p.j(fVar, "encoder");
        fVar.g(getDescriptor()).e(b10);
    }

    @Override // xk.b, xk.g, xk.a
    public kotlinx.serialization.descriptors.a getDescriptor() {
        return f5422b;
    }

    @Override // xk.g
    public /* bridge */ /* synthetic */ void serialize(al.f fVar, Object obj) {
        b(fVar, ((mj.i) obj).f());
    }

    @Override // xk.a
    public /* bridge */ /* synthetic */ Object deserialize(al.e eVar) {
        return mj.i.a(a(eVar));
    }
}
