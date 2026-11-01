package dl;

import com.ironsource.C3426d4;
import kotlinx.serialization.json.internal.AbstractJsonTreeEncoder;

/* JADX INFO: compiled from: TreeJsonEncoder.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class i0 extends AbstractJsonTreeEncoder {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public kotlinx.serialization.json.b f52155f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(cl.a aVar, bk.l<? super kotlinx.serialization.json.b, mj.r> lVar) {
        super(aVar, lVar, null);
        ck.p.j(aVar, "json");
        ck.p.j(lVar, "nodeConsumer");
        Z("primitive");
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public kotlinx.serialization.json.b r0() {
        kotlinx.serialization.json.b bVar = this.f52155f;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?".toString());
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public void v0(String str, kotlinx.serialization.json.b bVar) {
        ck.p.j(str, C3426d4.i.W);
        ck.p.j(bVar, "element");
        if (!(str == "primitive")) {
            throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag".toString());
        }
        if (!(this.f52155f == null)) {
            throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?".toString());
        }
        this.f52155f = bVar;
        s0().invoke(bVar);
    }
}
