package rn;

import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.NotificationSubtype;
import tn.p;
import tn.u;

/* JADX INFO: compiled from: OutgoingNotificationRequest.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class d extends org.fourthline.cling.model.message.a<UpnpRequest> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public NotificationSubtype f66960j;

    public d(mn.e eVar, un.e eVar2, NotificationSubtype notificationSubtype) {
        super(new UpnpRequest(UpnpRequest.Method.NOTIFY), mn.f.d("239.255.255.250"), 1900);
        this.f66960j = notificationSubtype;
        j().n(UpnpHeader.Type.MAX_AGE, new tn.n(eVar2.r().a()));
        j().n(UpnpHeader.Type.LOCATION, new tn.k(eVar.c()));
        j().n(UpnpHeader.Type.SERVER, new u());
        j().n(UpnpHeader.Type.HOST, new tn.i());
        j().n(UpnpHeader.Type.NTS, new p(notificationSubtype));
    }

    public NotificationSubtype getType() {
        return this.f66960j;
    }
}
