package tn;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.message.header.UpnpHeader;

/* JADX INFO: compiled from: HostHeader.java */
/* JADX INFO: loaded from: classes11.dex */
public class i extends UpnpHeader<yn.m> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f72469c = 1900;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f72470d = "239.255.255.250";

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void d(String str) throws InvalidHeaderException {
        if (!str.contains(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
            this.f72470d = str;
            e(new yn.m(str, this.f72469c));
            return;
        }
        try {
            this.f72469c = Integer.valueOf(str.substring(str.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER) + 1)).intValue();
            String strSubstring = str.substring(0, str.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER));
            this.f72470d = strSubstring;
            e(new yn.m(strSubstring, this.f72469c));
        } catch (NumberFormatException e10) {
            throw new InvalidHeaderException("Invalid HOST header value, can't parse port: " + str + " - " + e10.getMessage());
        }
    }

    public i() {
        e(new yn.m("239.255.255.250", 1900));
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String a() {
        return b().toString();
    }
}
