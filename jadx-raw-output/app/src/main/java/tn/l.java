package tn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.message.header.UpnpHeader;

/* JADX INFO: compiled from: MANHeader.java */
/* JADX INFO: loaded from: classes11.dex */
public class l extends UpnpHeader<String> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f72471d = Pattern.compile("\"(.+?)\"(;.+?)??");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f72472e = Pattern.compile(";\\s?ns\\s?=\\s?([0-9]{2})");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f72473c;

    public l() {
    }

    public l(String str) {
        e(str);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void d(String str) throws InvalidHeaderException {
        Matcher matcher = f72471d.matcher(str);
        if (!matcher.matches()) {
            throw new InvalidHeaderException("Invalid MAN header value: " + str);
        }
        e(matcher.group(1));
        if (matcher.group(2) != null) {
            Matcher matcher2 = f72472e.matcher(matcher.group(2));
            if (matcher2.matches()) {
                g(matcher2.group(1));
                return;
            }
            throw new InvalidHeaderException("Invalid namespace in MAN header value: " + str);
        }
    }

    public String f() {
        return this.f72473c;
    }

    public void g(String str) {
        this.f72473c = str;
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String a() {
        if (b() == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\"");
        sb2.append(b());
        sb2.append("\"");
        if (f() != null) {
            sb2.append("; ns=");
            sb2.append(f());
        }
        return sb2.toString();
    }
}
