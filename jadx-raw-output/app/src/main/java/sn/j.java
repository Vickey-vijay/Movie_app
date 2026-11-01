package sn;

import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.header.UpnpHeader;
import tn.y;

/* JADX INFO: compiled from: OutgoingUnsubscribeRequestMessage.java */
/* JADX INFO: loaded from: classes10.dex */
public class j extends org.fourthline.cling.model.message.b {
    public j(on.c cVar, pn.c cVar2) {
        super(UpnpRequest.Method.UNSUBSCRIBE, cVar.S());
        j().n(UpnpHeader.Type.SID, new y(cVar.I()));
        if (cVar2 != null) {
            j().putAll(cVar2);
        }
    }
}
