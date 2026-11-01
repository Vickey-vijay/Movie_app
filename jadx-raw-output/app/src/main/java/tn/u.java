package tn;

import com.ironsource.Z7;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.message.header.UpnpHeader;

/* JADX INFO: compiled from: ServerHeader.java */
/* JADX INFO: loaded from: classes11.dex */
public class u extends UpnpHeader<mn.i> {
    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void d(String str) throws InvalidHeaderException {
        String[] strArrSplit;
        String[] strArrSplit2;
        mn.i iVar = new mn.i();
        iVar.i("UNKNOWN");
        iVar.j("UNKNOWN");
        iVar.k("UNKNOWN");
        iVar.l("UNKNOWN");
        if (str.contains("UPnP/1.1")) {
            iVar.h(1);
        } else if (!str.contains("UPnP/1.")) {
            throw new InvalidHeaderException("Missing 'UPnP/1.' in server information: " + str);
        }
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            try {
                if (str.charAt(i11) == ' ') {
                    i10++;
                }
            } catch (Exception unused) {
                iVar.i("UNKNOWN");
                iVar.j("UNKNOWN");
                iVar.k("UNKNOWN");
                iVar.l("UNKNOWN");
            }
        }
        if (str.contains(StringUtils.COMMA)) {
            String[] strArrSplit3 = str.split(StringUtils.COMMA);
            strArrSplit = strArrSplit3[0].split("/");
            strArrSplit2 = strArrSplit3[2].split("/");
        } else if (i10 > 2) {
            String strTrim = str.substring(0, str.indexOf("UPnP/1.")).trim();
            String strTrim2 = str.substring(str.indexOf("UPnP/1.") + 8).trim();
            strArrSplit = strTrim.split("/");
            strArrSplit2 = strTrim2.split("/");
        } else {
            String[] strArrSplit4 = str.split(Z7.f27998r);
            strArrSplit = strArrSplit4[0].split("/");
            strArrSplit2 = strArrSplit4[2].split("/");
        }
        iVar.i(strArrSplit[0].trim());
        if (strArrSplit.length > 1) {
            iVar.j(strArrSplit[1].trim());
        }
        iVar.k(strArrSplit2[0].trim());
        if (strArrSplit2.length > 1) {
            iVar.l(strArrSplit2[1].trim());
        }
        e(iVar);
    }

    public u() {
        e(new mn.i());
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String a() {
        return b().a();
    }
}
