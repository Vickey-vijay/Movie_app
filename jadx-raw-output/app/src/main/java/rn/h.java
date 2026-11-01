package rn;

import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.NotificationSubtype;
import tn.c0;

/* JADX INFO: compiled from: OutgoingNotificationRequestUDN.java */
/* JADX INFO: loaded from: classes10.dex */
public class h extends d {
    public h(mn.e eVar, un.e eVar2, NotificationSubtype notificationSubtype) {
        super(eVar, eVar2, notificationSubtype);
        j().n(UpnpHeader.Type.NT, new c0(eVar2.r().b()));
        j().n(UpnpHeader.Type.USN, new c0(eVar2.r().b()));
    }
}
