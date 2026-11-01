package yn;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: compiled from: DeviceType.java */
/* JADX INFO: loaded from: classes8.dex */
public class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f85812d = Logger.getLogger(j.class.getName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f85813e = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):device:([a-zA-Z_0-9\\-]{1,64}):([0-9]+).*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f85814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f85815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f85816c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f85816c == jVar.f85816c && this.f85814a.equals(jVar.f85814a) && this.f85815b.equals(jVar.f85815b);
    }

    public static j d(String str) throws InvalidValueException {
        w wVarE;
        String strReplaceAll = str.replaceAll("\\s", "");
        try {
            wVarE = w.e(strReplaceAll);
        } catch (Exception unused) {
            wVarE = null;
        }
        if (wVarE != null) {
            return wVarE;
        }
        try {
            Matcher matcher = f85813e.matcher(strReplaceAll);
            if (matcher.matches()) {
                return new j(matcher.group(1), matcher.group(2), Integer.valueOf(matcher.group(3)).intValue());
            }
            Matcher matcher2 = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):device::([0-9]+).*").matcher(strReplaceAll);
            if (matcher2.matches() && matcher2.groupCount() >= 2) {
                f85812d.warning("UPnP specification violation, no device type token, defaulting to UNKNOWN: " + strReplaceAll);
                return new j(matcher2.group(1), "UNKNOWN", Integer.valueOf(matcher2.group(2)).intValue());
            }
            Matcher matcher3 = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):device:(.+?):([0-9]+).*").matcher(strReplaceAll);
            if (!matcher3.matches() || matcher3.groupCount() < 3) {
                throw new InvalidValueException("Can't parse device type string (namespace/type/version): " + strReplaceAll);
            }
            String strReplaceAll2 = matcher3.group(2).replaceAll("[^a-zA-Z_0-9\\-]", "-");
            f85812d.warning("UPnP specification violation, replacing invalid device type token '" + matcher3.group(2) + "' with: " + strReplaceAll2);
            return new j(matcher3.group(1), strReplaceAll2, Integer.valueOf(matcher3.group(3)).intValue());
        } catch (RuntimeException e10) {
            throw new InvalidValueException(String.format("Can't parse device type string (namespace/type/version) '%s': %s", strReplaceAll, e10.toString()));
        }
    }

    public String a() {
        return this.f85814a;
    }

    public int b() {
        return this.f85816c;
    }

    public boolean c(j jVar) {
        return this.f85814a.equals(jVar.f85814a) && this.f85815b.equals(jVar.f85815b) && this.f85816c >= jVar.f85816c;
    }

    public String getType() {
        return this.f85815b;
    }

    public int hashCode() {
        return (((this.f85814a.hashCode() * 31) + this.f85815b.hashCode()) * 31) + this.f85816c;
    }

    public String toString() {
        return "urn:" + a() + ":device:" + getType() + StringUtils.PROCESS_POSTFIX_DELIMITER + b();
    }

    public j(String str, String str2, int i10) {
        this.f85816c = 1;
        if (str != null && !str.matches("[a-zA-Z0-9\\-\\.]+")) {
            throw new IllegalArgumentException("Device type namespace contains illegal characters");
        }
        this.f85814a = str;
        if (str2 != null && !str2.matches("[a-zA-Z_0-9\\-]{1,64}")) {
            throw new IllegalArgumentException("Device type suffix too long (64) or contains illegal characters");
        }
        this.f85815b = str2;
        this.f85816c = i10;
    }
}
