package sn;

import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.message.header.UpnpHeader;
import tn.u;
import tn.y;
import tn.z;

/* JADX INFO: compiled from: OutgoingSubscribeResponseMessage.java */
/* JADX INFO: loaded from: classes10.dex */
public class i extends org.fourthline.cling.model.message.c {
    public i(UpnpResponse.Status status) {
        super(status);
    }

    public i(on.b bVar) {
        super(new UpnpResponse(UpnpResponse.Status.OK));
        j().n(UpnpHeader.Type.SERVER, new u());
        j().n(UpnpHeader.Type.SID, new y(bVar.I()));
        j().n(UpnpHeader.Type.TIMEOUT, new z(bVar.t()));
    }
}
