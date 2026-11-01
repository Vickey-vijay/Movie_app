package tn;

import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.message.header.UpnpHeader;

/* JADX INFO: compiled from: ServiceUSNHeader.java */
/* JADX INFO: loaded from: classes11.dex */
public class w extends UpnpHeader<yn.p> {
    public w() {
    }

    public w(yn.z zVar, yn.s sVar) {
        e(new yn.p(zVar, sVar));
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String a() {
        return b().toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void d(String str) throws InvalidHeaderException {
        try {
            e(yn.p.c(str));
        } catch (Exception e10) {
            throw new InvalidHeaderException("Invalid service USN header value, " + e10.getMessage());
        }
    }
}
