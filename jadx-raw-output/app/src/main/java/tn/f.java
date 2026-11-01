package tn;

import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.message.header.UpnpHeader;

/* JADX INFO: compiled from: DeviceUSNHeader.java */
/* JADX INFO: loaded from: classes11.dex */
public class f extends UpnpHeader<yn.o> {
    public f() {
    }

    public f(yn.z zVar, yn.j jVar) {
        e(new yn.o(zVar, jVar));
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String a() {
        return b().toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void d(String str) throws InvalidHeaderException {
        try {
            e(yn.o.c(str));
        } catch (Exception e10) {
            throw new InvalidHeaderException("Invalid device USN header value, " + e10.getMessage());
        }
    }
}
