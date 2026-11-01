package tn;

import java.util.Locale;
import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.message.header.UpnpHeader;

/* JADX INFO: compiled from: NTEventHeader.java */
/* JADX INFO: loaded from: classes11.dex */
public class o extends UpnpHeader<String> {
    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void d(String str) throws InvalidHeaderException {
        if (str.toLowerCase(Locale.ROOT).equals(b())) {
            return;
        }
        throw new InvalidHeaderException("Invalid event NT header value: " + str);
    }

    public o() {
        e("upnp:event");
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String a() {
        return b();
    }
}
