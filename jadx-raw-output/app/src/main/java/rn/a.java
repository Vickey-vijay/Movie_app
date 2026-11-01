package rn;

import java.net.URL;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.NotificationSubtype;
import tn.c0;
import tn.d0;
import tn.w;
import yn.o;
import yn.p;
import yn.z;

/* JADX INFO: compiled from: IncomingNotificationRequest.java */
/* JADX INFO: loaded from: classes10.dex */
public class a extends pn.b<UpnpRequest> {
    public a(pn.b<UpnpRequest> bVar) {
        super(bVar);
    }

    public z A() {
        pn.c cVarJ = j();
        UpnpHeader.Type type = UpnpHeader.Type.USN;
        UpnpHeader upnpHeaderS = cVarJ.s(type, d0.class);
        if (upnpHeaderS != null) {
            return (z) upnpHeaderS.b();
        }
        UpnpHeader upnpHeaderS2 = j().s(type, c0.class);
        if (upnpHeaderS2 != null) {
            return (z) upnpHeaderS2.b();
        }
        UpnpHeader upnpHeaderS3 = j().s(type, tn.f.class);
        if (upnpHeaderS3 != null) {
            return ((o) upnpHeaderS3.b()).b();
        }
        UpnpHeader upnpHeaderS4 = j().s(type, w.class);
        if (upnpHeaderS4 != null) {
            return ((p) upnpHeaderS4.b()).b();
        }
        return null;
    }

    public boolean B() {
        tn.p pVar = (tn.p) j().s(UpnpHeader.Type.NTS, tn.p.class);
        if (pVar != null && pVar.b().equals(NotificationSubtype.ALIVE)) {
            return true;
        }
        return false;
    }

    public boolean C() {
        tn.p pVar = (tn.p) j().s(UpnpHeader.Type.NTS, tn.p.class);
        if (pVar != null && pVar.b().equals(NotificationSubtype.BYEBYE)) {
            return true;
        }
        return false;
    }

    public byte[] x() {
        tn.j jVar = (tn.j) j().s(UpnpHeader.Type.EXT_IFACE_MAC, tn.j.class);
        if (jVar != null) {
            return jVar.b();
        }
        return null;
    }

    public URL y() {
        tn.k kVar = (tn.k) j().s(UpnpHeader.Type.LOCATION, tn.k.class);
        if (kVar != null) {
            return kVar.b();
        }
        return null;
    }

    public Integer z() {
        tn.n nVar = (tn.n) j().s(UpnpHeader.Type.MAX_AGE, tn.n.class);
        if (nVar != null) {
            return nVar.b();
        }
        return null;
    }
}
