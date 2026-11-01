package tn;

import java.util.Locale;
import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.message.header.UpnpHeader;

/* JADX INFO: compiled from: RootDeviceHeader.java */
/* JADX INFO: loaded from: classes11.dex */
public class s extends UpnpHeader<String> {
    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void d(String str) throws InvalidHeaderException {
        if (str.toLowerCase(Locale.ROOT).equals(b())) {
            return;
        }
        throw new InvalidHeaderException("Invalid root device NT header value: " + str);
    }

    public s() {
        e("upnp:rootdevice");
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String a() {
        return b();
    }
}
