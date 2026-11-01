package tn;

import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: compiled from: ContentRangeHeader.java */
/* JADX INFO: loaded from: classes11.dex */
public class c extends UpnpHeader<yn.d> {
    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void d(String str) throws InvalidHeaderException {
        try {
            e(yn.d.d(str, "bytes "));
        } catch (InvalidValueException e10) {
            throw new InvalidHeaderException("Invalid Range Header: " + e10.getMessage());
        }
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String a() {
        return b().b(true, "bytes ");
    }
}
