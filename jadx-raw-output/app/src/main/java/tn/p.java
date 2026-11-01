package tn;

import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.NotificationSubtype;

/* JADX INFO: compiled from: NTSHeader.java */
/* JADX INFO: loaded from: classes11.dex */
public class p extends UpnpHeader<NotificationSubtype> {
    public p() {
    }

    public p(NotificationSubtype notificationSubtype) {
        e(notificationSubtype);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String a() {
        return b().getHeaderString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void d(String str) throws InvalidHeaderException {
        for (NotificationSubtype notificationSubtype : NotificationSubtype.values()) {
            if (str.equals(notificationSubtype.getHeaderString())) {
                e(notificationSubtype);
                break;
            }
        }
        if (b() != null) {
            return;
        }
        throw new InvalidHeaderException("Invalid NTS header value: " + str);
    }
}
