package tn;

import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: compiled from: PragmaHeader.java */
/* JADX INFO: loaded from: classes11.dex */
public class q extends UpnpHeader<yn.q> {
    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String a() {
        return b().a();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void d(String str) throws InvalidHeaderException {
        try {
            e(yn.q.b(str));
        } catch (InvalidValueException e10) {
            throw new InvalidHeaderException("Invalid Range Header: " + e10.getMessage());
        }
    }
}
