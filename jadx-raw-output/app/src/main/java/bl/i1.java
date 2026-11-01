package bl;

import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: BuiltInSerializers.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class i1 implements xk.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i1 f5419a = new i1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.a f5420b = h1.f5412a;

    @Override // xk.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void deserialize(al.e eVar) {
        ck.p.j(eVar, "decoder");
        throw new SerializationException("'kotlin.Nothing' does not have instances");
    }

    @Override // xk.g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(al.f fVar, Void r10) {
        ck.p.j(fVar, "encoder");
        ck.p.j(r10, "value");
        throw new SerializationException("'kotlin.Nothing' cannot be serialized");
    }

    @Override // xk.b, xk.g, xk.a
    public kotlinx.serialization.descriptors.a getDescriptor() {
        return f5420b;
    }
}
