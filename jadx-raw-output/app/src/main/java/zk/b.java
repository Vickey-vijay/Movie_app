package zk;

import bl.x1;
import ck.p;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: compiled from: ContextAware.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class b {
    public static final jk.c<?> a(kotlinx.serialization.descriptors.a aVar) {
        p.j(aVar, "<this>");
        if (aVar instanceof c) {
            return ((c) aVar).f86456b;
        }
        if (aVar instanceof x1) {
            return a(((x1) aVar).j());
        }
        return null;
    }

    public static final kotlinx.serialization.descriptors.a b(el.c cVar, kotlinx.serialization.descriptors.a aVar) {
        xk.b bVarC;
        p.j(cVar, "<this>");
        p.j(aVar, "descriptor");
        jk.c<?> cVarA = a(aVar);
        if (cVarA == null || (bVarC = el.c.c(cVar, cVarA, null, 2, null)) == null) {
            return null;
        }
        return bVarC.getDescriptor();
    }

    public static final kotlinx.serialization.descriptors.a c(kotlinx.serialization.descriptors.a aVar, jk.c<?> cVar) {
        p.j(aVar, "<this>");
        p.j(cVar, GAMConfig.KEY_CONTEXT);
        return new c(aVar, cVar);
    }
}
