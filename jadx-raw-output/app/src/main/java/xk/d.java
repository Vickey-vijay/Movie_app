package xk;

import ck.p;
import ck.s;
import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: PolymorphicSerializer.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class d {
    public static final <T> a<T> a(bl.b<T> bVar, al.c cVar, String str) {
        p.j(bVar, "<this>");
        p.j(cVar, "decoder");
        a<T> aVarC = bVar.c(cVar, str);
        if (aVarC != null) {
            return aVarC;
        }
        bl.c.a(str, bVar.e());
        throw new KotlinNothingValueException();
    }

    public static final <T> g<T> b(bl.b<T> bVar, al.f fVar, T t10) {
        p.j(bVar, "<this>");
        p.j(fVar, "encoder");
        p.j(t10, "value");
        g<T> gVarD = bVar.d(fVar, t10);
        if (gVarD != null) {
            return gVarD;
        }
        bl.c.b(s.b(t10.getClass()), bVar.e());
        throw new KotlinNothingValueException();
    }
}
