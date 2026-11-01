package rn;

import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.NotificationSubtype;
import tn.v;
import tn.w;
import yn.s;

/* JADX INFO: compiled from: OutgoingNotificationRequestServiceType.java */
/* JADX INFO: loaded from: classes10.dex */
public class g extends d {
    public g(mn.e eVar, un.e eVar2, NotificationSubtype notificationSubtype, s sVar) {
        super(eVar, eVar2, notificationSubtype);
        j().n(UpnpHeader.Type.NT, new v(sVar));
        j().n(UpnpHeader.Type.USN, new w(eVar2.r().b(), sVar));
    }
}
