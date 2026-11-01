package dl;

import com.ironsource.C3426d4;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.internal.AbstractJsonTreeEncoder;

/* JADX INFO: compiled from: TreeJsonEncoder.kt */
/* JADX INFO: loaded from: classes2.dex */
public class m0 extends AbstractJsonTreeEncoder {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<String, kotlinx.serialization.json.b> f52167f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(cl.a aVar, bk.l<? super kotlinx.serialization.json.b, mj.r> lVar) {
        super(aVar, lVar, null);
        ck.p.j(aVar, "json");
        ck.p.j(lVar, "nodeConsumer");
        this.f52167f = new LinkedHashMap();
    }

    @Override // bl.e2, al.d
    public <T> void C(kotlinx.serialization.descriptors.a aVar, int i10, xk.g<? super T> gVar, T t10) {
        ck.p.j(aVar, "descriptor");
        ck.p.j(gVar, "serializer");
        if (t10 != null || this.f63292d.f()) {
            super.C(aVar, i10, gVar, t10);
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public kotlinx.serialization.json.b r0() {
        return new JsonObject(this.f52167f);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public void v0(String str, kotlinx.serialization.json.b bVar) {
        ck.p.j(str, C3426d4.i.W);
        ck.p.j(bVar, "element");
        this.f52167f.put(str, bVar);
    }

    public final Map<String, kotlinx.serialization.json.b> w0() {
        return this.f52167f;
    }
}
