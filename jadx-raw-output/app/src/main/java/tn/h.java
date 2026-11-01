package tn;

import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.message.header.UpnpHeader;

/* JADX INFO: compiled from: EventSequenceHeader.java */
/* JADX INFO: loaded from: classes11.dex */
public class h extends UpnpHeader<org.fourthline.cling.model.types.b> {
    public h() {
    }

    public h(long j10) {
        e(new org.fourthline.cling.model.types.b(j10));
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void d(String str) throws InvalidHeaderException {
        if (!"0".equals(str)) {
            while (str.startsWith("0")) {
                str = str.substring(1);
            }
        }
        try {
            e(new org.fourthline.cling.model.types.b(str));
        } catch (NumberFormatException e10) {
            throw new InvalidHeaderException("Invalid event sequence, " + e10.getMessage());
        }
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String a() {
        return b().toString();
    }
}
