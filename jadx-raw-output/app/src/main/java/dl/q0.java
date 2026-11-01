package dl;

import com.ironsource.C3426d4;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: TreeJsonEncoder.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class q0 extends m0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f52188g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f52189h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(cl.a aVar, bk.l<? super kotlinx.serialization.json.b, mj.r> lVar) {
        super(aVar, lVar);
        ck.p.j(aVar, "json");
        ck.p.j(lVar, "nodeConsumer");
        this.f52189h = true;
    }

    @Override // dl.m0, kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public kotlinx.serialization.json.b r0() {
        return new JsonObject(w0());
    }

    @Override // dl.m0, kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public void v0(String str, kotlinx.serialization.json.b bVar) {
        ck.p.j(str, C3426d4.i.W);
        ck.p.j(bVar, "element");
        if (!this.f52189h) {
            Map<String, kotlinx.serialization.json.b> mapW0 = w0();
            String str2 = this.f52188g;
            if (str2 == null) {
                ck.p.B("tag");
                str2 = null;
            }
            mapW0.put(str2, bVar);
            this.f52189h = true;
            return;
        }
        if (bVar instanceof kotlinx.serialization.json.c) {
            this.f52188g = ((kotlinx.serialization.json.c) bVar).e();
            this.f52189h = false;
        } else {
            if (bVar instanceof JsonObject) {
                throw f0.d(cl.t.f6120a.getDescriptor());
            }
            if (!(bVar instanceof kotlinx.serialization.json.a)) {
                throw new NoWhenBranchMatchedException();
            }
            throw f0.d(cl.c.f6078a.getDescriptor());
        }
    }
}
