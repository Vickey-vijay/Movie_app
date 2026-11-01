package tn;

import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.message.header.UpnpHeader;

/* JADX INFO: compiled from: USNRootDeviceHeader.java */
/* JADX INFO: loaded from: classes6.dex */
public class d0 extends UpnpHeader<yn.z> {
    public d0() {
    }

    public d0(yn.z zVar) {
        e(zVar);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String a() {
        return b().toString() + "::upnp:rootdevice";
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void d(String str) throws InvalidHeaderException {
        if (str.startsWith("uuid:") && str.endsWith("::upnp:rootdevice")) {
            e(new yn.z(str.substring(5, str.length() - 17)));
            return;
        }
        throw new InvalidHeaderException("Invalid root device USN header value, must start with 'uuid:' and end with '::upnp:rootdevice' but is '" + str + "'");
    }
}
