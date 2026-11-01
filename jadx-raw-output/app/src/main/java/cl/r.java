package cl;

import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.internal.JsonDecodingException;

/* JADX INFO: compiled from: JsonElementSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class r implements xk.b<JsonNull> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f6117a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.a f6118b = SerialDescriptorsKt.d("kotlinx.serialization.json.JsonNull", zk.g.b.f86476a, new kotlinx.serialization.descriptors.a[0], null, 8, null);

    @Override // xk.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public JsonNull deserialize(al.e eVar) {
        ck.p.j(eVar, "decoder");
        j.g(eVar);
        if (eVar.E()) {
            throw new JsonDecodingException("Expected 'null' literal");
        }
        eVar.g();
        return JsonNull.INSTANCE;
    }

    @Override // xk.g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(al.f fVar, JsonNull jsonNull) {
        ck.p.j(fVar, "encoder");
        ck.p.j(jsonNull, "value");
        j.h(fVar);
        fVar.A();
    }

    @Override // xk.b, xk.g, xk.a
    public kotlinx.serialization.descriptors.a getDescriptor() {
        return f6118b;
    }
}
