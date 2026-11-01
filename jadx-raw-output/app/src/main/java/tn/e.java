package tn;

import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.message.header.UpnpHeader;

/* JADX INFO: compiled from: DeviceTypeHeader.java */
/* JADX INFO: loaded from: classes11.dex */
public class e extends UpnpHeader<yn.j> {
    public e() {
    }

    public e(yn.j jVar) {
        e(jVar);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String a() {
        return b().toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void d(String str) throws InvalidHeaderException {
        try {
            e(yn.j.d(str));
        } catch (RuntimeException e10) {
            throw new InvalidHeaderException("Invalid device type header value, " + e10.getMessage());
        }
    }
}
