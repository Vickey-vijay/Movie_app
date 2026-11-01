package rn;

import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.NotificationSubtype;

/* JADX INFO: compiled from: IncomingSearchRequest.java */
/* JADX INFO: loaded from: classes10.dex */
public class b extends pn.b<UpnpRequest> {
    public b(pn.b<UpnpRequest> bVar) {
        super(bVar);
    }

    public Integer x() {
        tn.m mVar = (tn.m) j().s(UpnpHeader.Type.MX, tn.m.class);
        if (mVar != null) {
            return mVar.b();
        }
        return null;
    }

    public UpnpHeader y() {
        return j().r(UpnpHeader.Type.ST);
    }

    public boolean z() {
        tn.l lVar = (tn.l) j().s(UpnpHeader.Type.MAN, tn.l.class);
        if (lVar != null && lVar.b().equals(NotificationSubtype.DISCOVER.getHeaderString())) {
            return true;
        }
        return false;
    }
}
