package bl;

import kotlinx.serialization.internal.ObjectSerializer;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class s2 implements xk.b<mj.r> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s2 f5467b = new s2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ObjectSerializer<mj.r> f5468a = new ObjectSerializer<>("kotlin.Unit", mj.r.f64562a);

    public void a(al.e eVar) {
        ck.p.j(eVar, "decoder");
        this.f5468a.deserialize(eVar);
    }

    @Override // xk.g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(al.f fVar, mj.r rVar) {
        ck.p.j(fVar, "encoder");
        ck.p.j(rVar, "value");
        this.f5468a.serialize(fVar, rVar);
    }

    @Override // xk.b, xk.g, xk.a
    public kotlinx.serialization.descriptors.a getDescriptor() {
        return this.f5468a.getDescriptor();
    }

    @Override // xk.a
    public /* bridge */ /* synthetic */ Object deserialize(al.e eVar) {
        a(eVar);
        return mj.r.f64562a;
    }
}
