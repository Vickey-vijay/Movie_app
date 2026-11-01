package dl;

import com.ironsource.C3426d4;
import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonTreeEncoder;

/* JADX INFO: compiled from: TreeJsonEncoder.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class o0 extends AbstractJsonTreeEncoder {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList<kotlinx.serialization.json.b> f52174f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(cl.a aVar, bk.l<? super kotlinx.serialization.json.b, mj.r> lVar) {
        super(aVar, lVar, null);
        ck.p.j(aVar, "json");
        ck.p.j(lVar, "nodeConsumer");
        this.f52174f = new ArrayList<>();
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder, bl.f1
    public String b0(kotlinx.serialization.descriptors.a aVar, int i10) {
        ck.p.j(aVar, "descriptor");
        return String.valueOf(i10);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public kotlinx.serialization.json.b r0() {
        return new kotlinx.serialization.json.a(this.f52174f);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public void v0(String str, kotlinx.serialization.json.b bVar) {
        ck.p.j(str, C3426d4.i.W);
        ck.p.j(bVar, "element");
        this.f52174f.add(Integer.parseInt(str), bVar);
    }
}
