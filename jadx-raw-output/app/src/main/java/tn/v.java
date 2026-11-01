package tn;

import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.message.header.UpnpHeader;

/* JADX INFO: compiled from: ServiceTypeHeader.java */
/* JADX INFO: loaded from: classes11.dex */
public class v extends UpnpHeader<yn.s> {
    public v() {
    }

    public v(yn.s sVar) {
        e(sVar);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String a() {
        return b().toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void d(String str) throws InvalidHeaderException {
        try {
            e(yn.s.d(str));
        } catch (RuntimeException e10) {
            throw new InvalidHeaderException("Invalid service type header value, " + e10.getMessage());
        }
    }
}
