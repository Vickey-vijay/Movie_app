package tn;

import org.fourthline.cling.model.message.header.InvalidHeaderException;

/* JADX INFO: compiled from: UDAServiceTypeHeader.java */
/* JADX INFO: loaded from: classes5.dex */
public class b0 extends v {
    @Override // tn.v, org.fourthline.cling.model.message.header.UpnpHeader
    public void d(String str) throws InvalidHeaderException {
        try {
            e(yn.y.e(str));
        } catch (Exception e10) {
            throw new InvalidHeaderException("Invalid UDA service type header value, " + e10.getMessage());
        }
    }
}
