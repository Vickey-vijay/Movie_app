package dl;

import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: TreeJsonDecoder.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class b1 {
    public static final <T> T a(cl.a aVar, kotlinx.serialization.json.b bVar, xk.a<? extends T> aVar2) {
        al.e h0Var;
        ck.p.j(aVar, "<this>");
        ck.p.j(bVar, "element");
        ck.p.j(aVar2, "deserializer");
        if (bVar instanceof JsonObject) {
            h0Var = new kotlinx.serialization.json.internal.b(aVar, (JsonObject) bVar, null, null, 12, null);
        } else if (bVar instanceof kotlinx.serialization.json.a) {
            h0Var = new n0(aVar, (kotlinx.serialization.json.a) bVar);
        } else {
            if (!(bVar instanceof cl.n ? true : ck.p.e(bVar, JsonNull.INSTANCE))) {
                throw new NoWhenBranchMatchedException();
            }
            h0Var = new h0(aVar, (kotlinx.serialization.json.c) bVar);
        }
        return (T) h0Var.r(aVar2);
    }

    public static final <T> T b(cl.a aVar, String str, JsonObject jsonObject, xk.a<? extends T> aVar2) {
        ck.p.j(aVar, "<this>");
        ck.p.j(str, "discriminator");
        ck.p.j(jsonObject, "element");
        ck.p.j(aVar2, "deserializer");
        return (T) new kotlinx.serialization.json.internal.b(aVar, jsonObject, str, aVar2.getDescriptor()).r(aVar2);
    }
}
