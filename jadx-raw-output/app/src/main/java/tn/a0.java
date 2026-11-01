package tn;

import org.fourthline.cling.model.message.header.InvalidHeaderException;

/* JADX INFO: compiled from: UDADeviceTypeHeader.java */
/* JADX INFO: loaded from: classes5.dex */
public class a0 extends e {
    public a0() {
    }

    public a0(yn.j jVar) {
        super(jVar);
    }

    @Override // tn.e, org.fourthline.cling.model.message.header.UpnpHeader
    public void d(String str) throws InvalidHeaderException {
        try {
            e(yn.w.e(str));
        } catch (Exception e10) {
            throw new InvalidHeaderException("Invalid UDA device type header value, " + e10.getMessage());
        }
    }
}
