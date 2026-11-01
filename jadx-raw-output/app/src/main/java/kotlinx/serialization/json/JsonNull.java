package kotlinx.serialization.json;

import cl.r;
import kotlin.LazyThreadSafetyMode;
import mj.g;
import xk.f;

/* JADX INFO: compiled from: JsonElement.kt */
/* JADX INFO: loaded from: classes11.dex */
@f(with = r.class)
public final class JsonNull extends c {
    public static final JsonNull INSTANCE = new JsonNull();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f63286b = "null";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ g<xk.b<Object>> f63287c = kotlin.b.b(LazyThreadSafetyMode.PUBLICATION, new bk.a<xk.b<Object>>() { // from class: kotlinx.serialization.json.JsonNull.1
        @Override // bk.a
        public final xk.b<Object> invoke() {
            return r.f6117a;
        }
    });

    public JsonNull() {
        super(null);
    }

    private final /* synthetic */ xk.b f() {
        return f63287c.getValue();
    }

    @Override // kotlinx.serialization.json.c
    public String e() {
        return f63286b;
    }

    public final xk.b<JsonNull> serializer() {
        return f();
    }
}
