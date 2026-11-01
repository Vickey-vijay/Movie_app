package rn;

import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.NotificationSubtype;
import tn.d0;
import tn.s;

/* JADX INFO: compiled from: OutgoingNotificationRequestRootDevice.java */
/* JADX INFO: loaded from: classes10.dex */
public class f extends d {
    public f(mn.e eVar, un.e eVar2, NotificationSubtype notificationSubtype) {
        super(eVar, eVar2, notificationSubtype);
        j().n(UpnpHeader.Type.NT, new s());
        j().n(UpnpHeader.Type.USN, new d0(eVar2.r().b()));
        if ("true".equals(System.getProperty("org.fourthline.cling.network.announceMACAddress")) && eVar.b().b() != null) {
            j().n(UpnpHeader.Type.EXT_IFACE_MAC, new tn.j(eVar.b().b()));
        }
    }
}
