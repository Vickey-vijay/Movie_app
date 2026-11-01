package yn;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: compiled from: ServiceId.java */
/* JADX INFO: loaded from: classes8.dex */
public class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f85827c = Logger.getLogger(r.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f85828d = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):serviceId:([a-zA-Z_0-9\\-:\\.]{1,64})");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f85829e = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):service:([a-zA-Z_0-9\\-:\\.]{1,64})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f85830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f85831b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f85831b.equals(rVar.f85831b) && this.f85830a.equals(rVar.f85830a);
    }

    public String a() {
        return this.f85831b;
    }

    public String b() {
        return this.f85830a;
    }

    public int hashCode() {
        return (this.f85830a.hashCode() * 31) + this.f85831b.hashCode();
    }

    public String toString() {
        return "urn:" + b() + ":serviceId:" + a();
    }

    public r(String str, String str2) {
        if (str != null && !str.matches("[a-zA-Z0-9\\-\\.]+")) {
            throw new IllegalArgumentException("Service ID namespace contains illegal characters");
        }
        this.f85830a = str;
        if (str2 != null && !str2.matches("[a-zA-Z_0-9\\-:\\.]{1,64}")) {
            throw new IllegalArgumentException("Service ID suffix too long (64) or contains illegal characters");
        }
        this.f85831b = str2;
    }

    public static r c(String str) throws InvalidValueException {
        x xVarD;
        try {
            xVarD = x.d(str);
        } catch (Exception unused) {
            xVarD = null;
        }
        if (xVarD != null) {
            return xVarD;
        }
        Matcher matcher = f85828d.matcher(str);
        if (matcher.matches() && matcher.groupCount() >= 2) {
            return new r(matcher.group(1), matcher.group(2));
        }
        Matcher matcher2 = f85829e.matcher(str);
        if (matcher2.matches() && matcher2.groupCount() >= 2) {
            return new r(matcher2.group(1), matcher2.group(2));
        }
        Matcher matcher3 = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):serviceId:").matcher(str);
        if (matcher3.matches() && matcher3.groupCount() >= 1) {
            f85827c.warning("UPnP specification violation, no service ID token, defaulting to UNKNOWN: " + str);
            return new r(matcher3.group(1), "UNKNOWN");
        }
        String[] strArrSplit = str.split("[:]");
        if (strArrSplit.length == 4) {
            f85827c.warning("UPnP specification violation, trying a simple colon-split of: " + str);
            return new r(strArrSplit[1], strArrSplit[3]);
        }
        throw new InvalidValueException("Can't parse service ID string (namespace/id): " + str);
    }
}
