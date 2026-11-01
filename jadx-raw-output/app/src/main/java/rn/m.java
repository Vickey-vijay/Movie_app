package rn;

import org.fourthline.cling.model.message.header.UpnpHeader;
import tn.v;
import tn.w;
import yn.s;

/* JADX INFO: compiled from: OutgoingSearchResponseServiceType.java */
/* JADX INFO: loaded from: classes10.dex */
public class m extends j {
    public m(pn.b bVar, mn.e eVar, un.e eVar2, s sVar) {
        super(bVar, eVar, eVar2);
        j().n(UpnpHeader.Type.ST, new v(sVar));
        j().n(UpnpHeader.Type.USN, new w(eVar2.r().b(), sVar));
    }
}
