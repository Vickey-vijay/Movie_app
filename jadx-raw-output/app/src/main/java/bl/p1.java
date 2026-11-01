package bl;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: PluginGeneratedSerialDescriptor.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class p1 {
    public static final int a(kotlinx.serialization.descriptors.a aVar, kotlinx.serialization.descriptors.a[] aVarArr) {
        ck.p.j(aVar, "<this>");
        ck.p.j(aVarArr, "typeParams");
        int iHashCode = (aVar.h().hashCode() * 31) + Arrays.hashCode(aVarArr);
        Iterable<kotlinx.serialization.descriptors.a> iterableA = zk.f.a(aVar);
        Iterator<kotlinx.serialization.descriptors.a> it = iterableA.iterator();
        int iHashCode2 = 1;
        int i10 = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i11 = i10 * 31;
            String strH = it.next().h();
            if (strH != null) {
                iHashCode3 = strH.hashCode();
            }
            i10 = i11 + iHashCode3;
        }
        Iterator<kotlinx.serialization.descriptors.a> it2 = iterableA.iterator();
        while (it2.hasNext()) {
            int i12 = iHashCode2 * 31;
            zk.g kind = it2.next().getKind();
            iHashCode2 = i12 + (kind != null ? kind.hashCode() : 0);
        }
        return (((iHashCode * 31) + i10) * 31) + iHashCode2;
    }
}
