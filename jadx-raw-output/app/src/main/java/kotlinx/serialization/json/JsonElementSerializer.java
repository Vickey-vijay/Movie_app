package kotlinx.serialization.json;

import al.e;
import al.f;
import bk.l;
import ck.p;
import cl.j;
import cl.o;
import cl.t;
import cl.u;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import mj.r;
import zk.d;

/* JADX INFO: compiled from: JsonElementSerializers.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class JsonElementSerializer implements xk.b<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonElementSerializer f63284a = new JsonElementSerializer();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.a f63285b = SerialDescriptorsKt.c("kotlinx.serialization.json.JsonElement", d.b.f86459a, new kotlinx.serialization.descriptors.a[0], new l<zk.a, r>() { // from class: kotlinx.serialization.json.JsonElementSerializer$descriptor$1
        @Override // bk.l
        public /* bridge */ /* synthetic */ r invoke(zk.a aVar) {
            invoke2(aVar);
            return r.f64562a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(zk.a aVar) {
            p.j(aVar, "$this$buildSerialDescriptor");
            zk.a.b(aVar, "JsonPrimitive", j.f(new bk.a<kotlinx.serialization.descriptors.a>() { // from class: kotlinx.serialization.json.JsonElementSerializer$descriptor$1.1
                @Override // bk.a
                public final kotlinx.serialization.descriptors.a invoke() {
                    return u.f6125a.getDescriptor();
                }
            }), null, false, 12, null);
            zk.a.b(aVar, "JsonNull", j.f(new bk.a<kotlinx.serialization.descriptors.a>() { // from class: kotlinx.serialization.json.JsonElementSerializer$descriptor$1.2
                @Override // bk.a
                public final kotlinx.serialization.descriptors.a invoke() {
                    return cl.r.f6117a.getDescriptor();
                }
            }), null, false, 12, null);
            zk.a.b(aVar, "JsonLiteral", j.f(new bk.a<kotlinx.serialization.descriptors.a>() { // from class: kotlinx.serialization.json.JsonElementSerializer$descriptor$1.3
                @Override // bk.a
                public final kotlinx.serialization.descriptors.a invoke() {
                    return o.f6115a.getDescriptor();
                }
            }), null, false, 12, null);
            zk.a.b(aVar, "JsonObject", j.f(new bk.a<kotlinx.serialization.descriptors.a>() { // from class: kotlinx.serialization.json.JsonElementSerializer$descriptor$1.4
                @Override // bk.a
                public final kotlinx.serialization.descriptors.a invoke() {
                    return t.f6120a.getDescriptor();
                }
            }), null, false, 12, null);
            zk.a.b(aVar, "JsonArray", j.f(new bk.a<kotlinx.serialization.descriptors.a>() { // from class: kotlinx.serialization.json.JsonElementSerializer$descriptor$1.5
                @Override // bk.a
                public final kotlinx.serialization.descriptors.a invoke() {
                    return cl.c.f6078a.getDescriptor();
                }
            }), null, false, 12, null);
        }
    });

    @Override // xk.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public b deserialize(e eVar) {
        p.j(eVar, "decoder");
        return j.d(eVar).t();
    }

    @Override // xk.g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(f fVar, b bVar) {
        p.j(fVar, "encoder");
        p.j(bVar, "value");
        j.h(fVar);
        if (bVar instanceof c) {
            fVar.F(u.f6125a, bVar);
        } else if (bVar instanceof JsonObject) {
            fVar.F(t.f6120a, bVar);
        } else if (bVar instanceof a) {
            fVar.F(cl.c.f6078a, bVar);
        }
    }

    @Override // xk.b, xk.g, xk.a
    public kotlinx.serialization.descriptors.a getDescriptor() {
        return f63285b;
    }
}
