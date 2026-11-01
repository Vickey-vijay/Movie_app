package rn;

import org.fourthline.cling.model.message.header.UpnpHeader;
import tn.d0;
import tn.s;

/* JADX INFO: compiled from: OutgoingSearchResponseRootDevice.java */
/* JADX INFO: loaded from: classes10.dex */
public class l extends j {
    public l(pn.b bVar, mn.e eVar, un.e eVar2) {
        super(bVar, eVar, eVar2);
        j().n(UpnpHeader.Type.ST, new s());
        j().n(UpnpHeader.Type.USN, new d0(eVar2.r().b()));
    }
}
