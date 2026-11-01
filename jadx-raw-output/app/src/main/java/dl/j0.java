package dl;

import kotlinx.serialization.json.internal.WriteMode;

/* JADX INFO: compiled from: JsonStreams.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class j0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T a(cl.a aVar, xk.a<? extends T> aVar2, v0 v0Var) {
        ck.p.j(aVar, "<this>");
        ck.p.j(aVar2, "deserializer");
        ck.p.j(v0Var, "reader");
        u0 u0Var = new u0(v0Var, null, 2, 0 == true ? 1 : 0);
        try {
            T t10 = (T) new w0(aVar, WriteMode.OBJ, u0Var, aVar2.getDescriptor(), null).r(aVar2);
            u0Var.w();
            return t10;
        } finally {
            u0Var.U();
        }
    }

    public static final <T> void b(cl.a aVar, r0 r0Var, xk.g<? super T> gVar, T t10) {
        ck.p.j(aVar, "<this>");
        ck.p.j(r0Var, "writer");
        ck.p.j(gVar, "serializer");
        new x0(r0Var, aVar, WriteMode.OBJ, new cl.k[WriteMode.values().length]).F(gVar, t10);
    }
}
