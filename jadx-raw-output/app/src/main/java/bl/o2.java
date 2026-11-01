package bl;

/* JADX INFO: compiled from: ValueClasses.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class o2 implements xk.b<mj.m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o2 f5448a = new o2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.a f5449b = m0.a("kotlin.ULong", yk.a.A(ck.q.f6059a));

    public long a(al.e eVar) {
        ck.p.j(eVar, "decoder");
        return mj.m.b(eVar.y(getDescriptor()).h());
    }

    public void b(al.f fVar, long j10) {
        ck.p.j(fVar, "encoder");
        fVar.g(getDescriptor()).z(j10);
    }

    @Override // xk.b, xk.g, xk.a
    public kotlinx.serialization.descriptors.a getDescriptor() {
        return f5449b;
    }

    @Override // xk.g
    public /* bridge */ /* synthetic */ void serialize(al.f fVar, Object obj) {
        b(fVar, ((mj.m) obj).f());
    }

    @Override // xk.a
    public /* bridge */ /* synthetic */ Object deserialize(al.e eVar) {
        return mj.m.a(a(eVar));
    }
}
