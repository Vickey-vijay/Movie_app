package cl;

import com.ironsource.C3426d4;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: JsonElementBuilders.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, kotlinx.serialization.json.b> f6119a = new LinkedHashMap();

    public final JsonObject a() {
        return new JsonObject(this.f6119a);
    }

    public final kotlinx.serialization.json.b b(String str, kotlinx.serialization.json.b bVar) {
        ck.p.j(str, C3426d4.i.W);
        ck.p.j(bVar, "element");
        return this.f6119a.put(str, bVar);
    }
}
