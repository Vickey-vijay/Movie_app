package sn;

import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.header.UpnpHeader;
import tn.y;
import tn.z;

/* JADX INFO: compiled from: OutgoingRenewalRequestMessage.java */
/* JADX INFO: loaded from: classes10.dex */
public class g extends org.fourthline.cling.model.message.b {
    public g(on.c cVar, pn.c cVar2) {
        super(UpnpRequest.Method.SUBSCRIBE, cVar.S());
        j().n(UpnpHeader.Type.SID, new y(cVar.I()));
        j().n(UpnpHeader.Type.TIMEOUT, new z(cVar.G()));
        if (cVar2 != null) {
            j().putAll(cVar2);
        }
    }
}
