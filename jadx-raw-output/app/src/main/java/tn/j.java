package tn;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.message.header.UpnpHeader;

/* JADX INFO: compiled from: InterfaceMacHeader.java */
/* JADX INFO: loaded from: classes11.dex */
public class j extends UpnpHeader<byte[]> {
    public j() {
    }

    public j(byte[] bArr) {
        e(bArr);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void d(String str) throws InvalidHeaderException {
        byte[] bArrG = to.b.g(str, StringUtils.PROCESS_POSTFIX_DELIMITER);
        e(bArrG);
        if (bArrG.length == 6) {
            return;
        }
        throw new InvalidHeaderException("Invalid MAC address: " + str);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String toString() {
        return "(" + getClass().getSimpleName() + ") '" + a() + "'";
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String a() {
        return to.b.b(b(), StringUtils.PROCESS_POSTFIX_DELIMITER);
    }
}
