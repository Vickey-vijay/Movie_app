package tn;

import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.message.header.UpnpHeader;

/* JADX INFO: compiled from: SubscriptionIdHeader.java */
/* JADX INFO: loaded from: classes11.dex */
public class y extends UpnpHeader<String> {
    public y() {
    }

    public y(String str) {
        e(str);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void d(String str) throws InvalidHeaderException {
        if (str.startsWith("uuid:")) {
            e(str);
            return;
        }
        throw new InvalidHeaderException("Invalid subscription ID header value, must start with 'uuid:': " + str);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String a() {
        return b();
    }
}
