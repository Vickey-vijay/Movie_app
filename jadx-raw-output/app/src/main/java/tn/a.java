package tn;

import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.message.header.UpnpHeader;

/* JADX INFO: compiled from: AVClientInfoHeader.java */
/* JADX INFO: loaded from: classes11.dex */
public class a extends UpnpHeader<String> {
    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String a() {
        return b();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void d(String str) throws InvalidHeaderException {
        e(str);
    }
}
