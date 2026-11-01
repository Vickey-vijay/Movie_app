package rn;

import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.NotificationSubtype;

/* JADX INFO: compiled from: OutgoingNotificationRequestDeviceType.java */
/* JADX INFO: loaded from: classes10.dex */
public class e extends d {
    public e(mn.e eVar, un.e eVar2, NotificationSubtype notificationSubtype) {
        super(eVar, eVar2, notificationSubtype);
        j().n(UpnpHeader.Type.NT, new tn.e(eVar2.getType()));
        j().n(UpnpHeader.Type.USN, new tn.f(eVar2.r().b(), eVar2.getType()));
    }
}
