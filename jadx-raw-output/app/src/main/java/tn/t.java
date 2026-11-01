package tn;

import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.NotificationSubtype;

/* JADX INFO: compiled from: STAllHeader.java */
/* JADX INFO: loaded from: classes11.dex */
public class t extends UpnpHeader<NotificationSubtype> {
    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void d(String str) throws InvalidHeaderException {
        NotificationSubtype notificationSubtype = NotificationSubtype.ALL;
        if (str.equals(notificationSubtype.getHeaderString())) {
            return;
        }
        throw new InvalidHeaderException("Invalid ST header value (not " + notificationSubtype + "): " + str);
    }

    public t() {
        e(NotificationSubtype.ALL);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String a() {
        return b().getHeaderString();
    }
}
