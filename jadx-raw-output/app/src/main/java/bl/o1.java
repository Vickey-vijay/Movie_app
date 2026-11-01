package bl;

import java.util.ArrayList;
import kotlinx.serialization.MissingFieldException;

/* JADX INFO: compiled from: PluginExceptions.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class o1 {
    public static final void a(int i10, int i11, kotlinx.serialization.descriptors.a aVar) {
        ck.p.j(aVar, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i12 = (~i10) & i11;
        for (int i13 = 0; i13 < 32; i13++) {
            if ((i12 & 1) != 0) {
                arrayList.add(aVar.f(i13));
            }
            i12 >>>= 1;
        }
        throw new MissingFieldException(arrayList, aVar.h());
    }
}
