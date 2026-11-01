package tn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.message.header.UpnpHeader;

/* JADX INFO: compiled from: TimeoutHeader.java */
/* JADX INFO: loaded from: classes11.dex */
public class z extends UpnpHeader<Integer> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Integer f72476c = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f72477d = Pattern.compile("Second-(?:([0-9]+)|infinite)");

    public z() {
        e(1800);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Second-");
        sb2.append(b().equals(f72476c) ? "infinite" : b());
        return sb2.toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void d(String str) throws InvalidHeaderException {
        Matcher matcher = f72477d.matcher(str);
        if (!matcher.matches()) {
            throw new InvalidHeaderException("Can't parse timeout seconds integer from: " + str);
        }
        if (matcher.group(1) != null) {
            e(Integer.valueOf(Integer.parseInt(matcher.group(1))));
        } else {
            e(f72476c);
        }
    }

    public z(int i10) {
        e(Integer.valueOf(i10));
    }
}
