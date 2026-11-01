package kotlinx.serialization.json;

import ck.i;
import cl.u;
import xk.f;

/* JADX INFO: compiled from: JsonElement.kt */
/* JADX INFO: loaded from: classes.dex */
@f(with = u.class)
public abstract class c extends b {
    public static final a Companion = new a(null);

    /* JADX INFO: compiled from: JsonElement.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final xk.b<c> serializer() {
            return u.f6125a;
        }
    }

    public c() {
        super(null);
    }

    public /* synthetic */ c(i iVar) {
        this();
    }

    public abstract String e();

    public String toString() {
        return e();
    }
}
