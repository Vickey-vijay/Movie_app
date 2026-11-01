package dl;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlinx.serialization.json.internal.WriteMode;

/* JADX INFO: compiled from: WriteMode.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class c1 {
    public static final kotlinx.serialization.descriptors.a a(kotlinx.serialization.descriptors.a aVar, el.c cVar) {
        kotlinx.serialization.descriptors.a aVarA;
        ck.p.j(aVar, "<this>");
        ck.p.j(cVar, "module");
        if (!ck.p.e(aVar.getKind(), zk.g.a.f86475a)) {
            return aVar.isInline() ? a(aVar.d(0), cVar) : aVar;
        }
        kotlinx.serialization.descriptors.a aVarB = zk.b.b(cVar, aVar);
        return (aVarB == null || (aVarA = a(aVarB, cVar)) == null) ? aVar : aVarA;
    }

    public static final WriteMode b(cl.a aVar, kotlinx.serialization.descriptors.a aVar2) {
        ck.p.j(aVar, "<this>");
        ck.p.j(aVar2, CampaignEx.JSON_KEY_DESC);
        zk.g kind = aVar2.getKind();
        if (kind instanceof zk.d) {
            return WriteMode.POLY_OBJ;
        }
        if (ck.p.e(kind, kotlinx.serialization.descriptors.b.C0567b.f63247a)) {
            return WriteMode.LIST;
        }
        if (!ck.p.e(kind, kotlinx.serialization.descriptors.b.c.f63248a)) {
            return WriteMode.OBJ;
        }
        kotlinx.serialization.descriptors.a aVarA = a(aVar2.d(0), aVar.a());
        zk.g kind2 = aVarA.getKind();
        if ((kind2 instanceof zk.e) || ck.p.e(kind2, zk.g.b.f86476a)) {
            return WriteMode.MAP;
        }
        if (aVar.e().b()) {
            return WriteMode.LIST;
        }
        throw f0.d(aVarA);
    }
}
