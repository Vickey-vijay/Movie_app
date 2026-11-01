package tn;

import java.net.MalformedURLException;
import java.net.URL;
import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.message.header.UpnpHeader;

/* JADX INFO: compiled from: LocationHeader.java */
/* JADX INFO: loaded from: classes11.dex */
public class k extends UpnpHeader<URL> {
    public k() {
    }

    public k(URL url) {
        e(url);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void d(String str) throws InvalidHeaderException {
        try {
            e(new URL(str));
        } catch (MalformedURLException e10) {
            throw new InvalidHeaderException("Invalid URI: " + e10.getMessage());
        }
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String a() {
        return b().toString();
    }
}
