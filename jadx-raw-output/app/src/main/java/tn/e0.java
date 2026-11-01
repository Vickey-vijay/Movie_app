package tn;

import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.message.header.UpnpHeader;

/* JADX INFO: compiled from: UserAgentHeader.java */
/* JADX INFO: loaded from: classes6.dex */
public class e0 extends UpnpHeader<String> {
    public e0() {
    }

    public e0(String str) {
        e(str);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String a() {
        return b();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void d(String str) throws InvalidHeaderException {
        e(str);
    }
}
