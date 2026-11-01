package bl;

/* JADX INFO: compiled from: BuiltInSerializers.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class a0 implements xk.b<mk.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f5373a = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.a f5374b = new u1("kotlin.time.Duration", zk.e.i.f86468a);

    public long a(al.e eVar) {
        ck.p.j(eVar, "decoder");
        return mk.b.f64563c.d(eVar.o());
    }

    public void b(al.f fVar, long j10) {
        ck.p.j(fVar, "encoder");
        fVar.v(mk.b.I(j10));
    }

    @Override // xk.b, xk.g, xk.a
    public kotlinx.serialization.descriptors.a getDescriptor() {
        return f5374b;
    }

    @Override // xk.g
    public /* bridge */ /* synthetic */ void serialize(al.f fVar, Object obj) {
        b(fVar, ((mk.b) obj).M());
    }

    @Override // xk.a
    public /* bridge */ /* synthetic */ Object deserialize(al.e eVar) {
        return mk.b.f(a(eVar));
    }
}
