package rn;

import org.fourthline.cling.model.message.header.UpnpHeader;

/* JADX INFO: compiled from: OutgoingSearchResponseDeviceType.java */
/* JADX INFO: loaded from: classes10.dex */
public class k extends j {
    public k(pn.b bVar, mn.e eVar, un.e eVar2) {
        super(bVar, eVar, eVar2);
        j().n(UpnpHeader.Type.ST, new tn.e(eVar2.getType()));
        j().n(UpnpHeader.Type.USN, new tn.f(eVar2.r().b(), eVar2.getType()));
    }
}
