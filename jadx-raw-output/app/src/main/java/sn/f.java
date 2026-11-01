package sn;

import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.message.header.UpnpHeader;

/* JADX INFO: compiled from: OutgoingEventResponseMessage.java */
/* JADX INFO: loaded from: classes10.dex */
public class f extends org.fourthline.cling.model.message.c {
    public f() {
        super(new UpnpResponse(UpnpResponse.Status.OK));
        j().n(UpnpHeader.Type.CONTENT_TYPE, new tn.d());
    }

    public f(UpnpResponse upnpResponse) {
        super(upnpResponse);
        j().n(UpnpHeader.Type.CONTENT_TYPE, new tn.d());
    }
}
