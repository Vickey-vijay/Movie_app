package bl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: Platform.common.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.a[] f5444a = new kotlinx.serialization.descriptors.a[0];

    public static final kotlinx.serialization.descriptors.a[] b(List<? extends kotlinx.serialization.descriptors.a> list) {
        kotlinx.serialization.descriptors.a[] aVarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (aVarArr = (kotlinx.serialization.descriptors.a[]) list.toArray(new kotlinx.serialization.descriptors.a[0])) == null) ? f5444a : aVarArr;
    }

    public static final Set<String> a(kotlinx.serialization.descriptors.a aVar) {
        ck.p.j(aVar, "<this>");
        if (aVar instanceof n) {
            return ((n) aVar).a();
        }
        HashSet hashSet = new HashSet(aVar.e());
        int iE = aVar.e();
        for (int i10 = 0; i10 < iE; i10++) {
            hashSet.add(aVar.f(i10));
        }
        return hashSet;
    }

    public static final jk.c<Object> c(jk.n nVar) {
        ck.p.j(nVar, "<this>");
        jk.e eVarH = nVar.h();
        if (eVarH instanceof jk.c) {
            return (jk.c) eVarH;
        }
        throw new IllegalStateException(("Only KClass supported as classifier, got " + eVarH).toString());
    }

    public static final String d(String str) {
        ck.p.j(str, "className");
        return "Serializer for class '" + str + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }

    public static final String e(jk.c<?> cVar) {
        ck.p.j(cVar, "<this>");
        String strI = cVar.i();
        if (strI == null) {
            strI = "<local class name not available>";
        }
        return d(strI);
    }

    public static final Void f(jk.c<?> cVar) {
        ck.p.j(cVar, "<this>");
        throw new SerializationException(e(cVar));
    }
}
