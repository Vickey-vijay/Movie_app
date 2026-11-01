package cl;

import kotlinx.serialization.json.internal.TreeJsonEncoderKt;

/* JADX INFO: compiled from: JsonTransformingSerializer.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class w<T> implements xk.b<T> {
    private final xk.b<T> tSerializer;

    public kotlinx.serialization.json.b transformDeserialize(kotlinx.serialization.json.b bVar) {
        ck.p.j(bVar, "element");
        return bVar;
    }

    public kotlinx.serialization.json.b transformSerialize(kotlinx.serialization.json.b bVar) {
        ck.p.j(bVar, "element");
        return bVar;
    }

    public w(xk.b<T> bVar) {
        ck.p.j(bVar, "tSerializer");
        this.tSerializer = bVar;
    }

    @Override // xk.a
    public final T deserialize(al.e eVar) {
        ck.p.j(eVar, "decoder");
        g gVarD = j.d(eVar);
        return (T) gVarD.d().d(this.tSerializer, transformDeserialize(gVarD.t()));
    }

    @Override // xk.b, xk.g, xk.a
    public kotlinx.serialization.descriptors.a getDescriptor() {
        return this.tSerializer.getDescriptor();
    }

    @Override // xk.g
    public final void serialize(al.f fVar, T t10) {
        ck.p.j(fVar, "encoder");
        ck.p.j(t10, "value");
        k kVarE = j.e(fVar);
        kVarE.r(transformSerialize(TreeJsonEncoderKt.c(kVarE.d(), t10, this.tSerializer)));
    }
}
