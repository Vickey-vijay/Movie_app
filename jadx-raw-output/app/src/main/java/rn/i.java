package rn;

import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.NotificationSubtype;

/* JADX INFO: compiled from: OutgoingSearchRequest.java */
/* JADX INFO: loaded from: classes10.dex */
public class i extends org.fourthline.cling.model.message.a<UpnpRequest> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public UpnpHeader f66961j;

    public i(UpnpHeader upnpHeader, int i10) {
        super(new UpnpRequest(UpnpRequest.Method.MSEARCH), mn.f.d("239.255.255.250"), 1900);
        this.f66961j = upnpHeader;
        j().n(UpnpHeader.Type.MAN, new tn.l(NotificationSubtype.DISCOVER.getHeaderString()));
        j().n(UpnpHeader.Type.MX, new tn.m(Integer.valueOf(i10)));
        j().n(UpnpHeader.Type.ST, upnpHeader);
        j().n(UpnpHeader.Type.HOST, new tn.i());
    }
}
