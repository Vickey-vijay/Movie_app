package tn;

import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.message.header.UpnpHeader;

/* JADX INFO: compiled from: UDNHeader.java */
/* JADX INFO: loaded from: classes5.dex */
public class c0 extends UpnpHeader<yn.z> {
    public c0() {
    }

    public c0(yn.z zVar) {
        e(zVar);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void d(String str) throws InvalidHeaderException {
        if (!str.startsWith("uuid:")) {
            throw new InvalidHeaderException("Invalid UDA header value, must start with 'uuid:': " + str);
        }
        if (!str.contains("::urn")) {
            e(new yn.z(str.substring(5)));
            return;
        }
        throw new InvalidHeaderException("Invalid UDA header value, must not contain '::urn': " + str);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String a() {
        return b().toString();
    }
}
