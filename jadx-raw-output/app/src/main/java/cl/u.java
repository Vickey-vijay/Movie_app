package cl;

import dl.f0;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.json.JsonNull;

/* JADX INFO: compiled from: JsonElementSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class u implements xk.b<kotlinx.serialization.json.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f6125a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.a f6126b = SerialDescriptorsKt.d("kotlinx.serialization.json.JsonPrimitive", zk.e.i.f86468a, new kotlinx.serialization.descriptors.a[0], null, 8, null);

    @Override // xk.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public kotlinx.serialization.json.c deserialize(al.e eVar) {
        ck.p.j(eVar, "decoder");
        kotlinx.serialization.json.b bVarT = j.d(eVar).t();
        if (bVarT instanceof kotlinx.serialization.json.c) {
            return (kotlinx.serialization.json.c) bVarT;
        }
        throw f0.f(-1, "Unexpected JSON element, expected JsonPrimitive, had " + ck.s.b(bVarT.getClass()), bVarT.toString());
    }

    @Override // xk.g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(al.f fVar, kotlinx.serialization.json.c cVar) {
        ck.p.j(fVar, "encoder");
        ck.p.j(cVar, "value");
        j.h(fVar);
        if (cVar instanceof JsonNull) {
            fVar.F(r.f6117a, JsonNull.INSTANCE);
        } else {
            fVar.F(o.f6115a, (n) cVar);
        }
    }

    @Override // xk.b, xk.g, xk.a
    public kotlinx.serialization.descriptors.a getDescriptor() {
        return f6126b;
    }
}
