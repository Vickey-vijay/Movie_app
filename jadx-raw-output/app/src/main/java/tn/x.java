package tn;

import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.message.header.UpnpHeader;

/* JADX INFO: compiled from: SoapActionHeader.java */
/* JADX INFO: loaded from: classes11.dex */
public class x extends UpnpHeader<yn.u> {
    public x() {
    }

    public x(yn.u uVar) {
        e(uVar);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String a() {
        return "\"" + b().toString() + "\"";
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void d(String str) throws InvalidHeaderException {
        try {
            if (!str.startsWith("\"") && str.endsWith("\"")) {
                throw new InvalidHeaderException("Invalid SOAP action header, must be enclosed in doublequotes:" + str);
            }
            e(yn.u.f(str.substring(1, str.length() - 1)));
        } catch (RuntimeException e10) {
            throw new InvalidHeaderException("Invalid SOAP action header value, " + e10.getMessage());
        }
    }
}
