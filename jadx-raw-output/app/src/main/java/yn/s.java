package yn;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: compiled from: ServiceType.java */
/* JADX INFO: loaded from: classes8.dex */
public class s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f85832d = Logger.getLogger(s.class.getName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f85833e = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):service:([a-zA-Z_0-9\\-]{1,64}):([0-9]+).*");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f85834f = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):serviceId:([a-zA-Z_0-9\\-]{1,64}):([0-9]+).*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f85835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f85836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f85837c;

    public boolean c(s sVar) {
        return sVar != null && this.f85835a.equals(sVar.f85835a) && this.f85836b.equals(sVar.f85836b) && this.f85837c >= sVar.f85837c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f85837c == sVar.f85837c && this.f85835a.equals(sVar.f85835a) && this.f85836b.equals(sVar.f85836b);
    }

    public static s d(String str) throws InvalidValueException {
        if (str == null) {
            throw new InvalidValueException("Can't parse null string");
        }
        y yVarE = null;
        String strReplaceAll = str.replaceAll("\\s", "");
        try {
            yVarE = y.e(strReplaceAll);
        } catch (Exception unused) {
        }
        if (yVarE != null) {
            return yVarE;
        }
        try {
            Matcher matcher = f85833e.matcher(strReplaceAll);
            if (matcher.matches() && matcher.groupCount() >= 3) {
                return new s(matcher.group(1), matcher.group(2), Integer.valueOf(matcher.group(3)).intValue());
            }
            Matcher matcher2 = f85834f.matcher(strReplaceAll);
            if (matcher2.matches() && matcher2.groupCount() >= 3) {
                return new s(matcher2.group(1), matcher2.group(2), Integer.valueOf(matcher2.group(3)).intValue());
            }
            Matcher matcher3 = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):service:(.+?):([0-9]+).*").matcher(strReplaceAll);
            if (matcher3.matches() && matcher3.groupCount() >= 3) {
                String strReplaceAll2 = matcher3.group(2).replaceAll("[^a-zA-Z_0-9\\-]", "-");
                f85832d.warning("UPnP specification violation, replacing invalid service type token '" + matcher3.group(2) + "' with: " + strReplaceAll2);
                return new s(matcher3.group(1), strReplaceAll2, Integer.valueOf(matcher3.group(3)).intValue());
            }
            Matcher matcher4 = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):serviceId:(.+?):([0-9]+).*").matcher(strReplaceAll);
            if (!matcher4.matches() || matcher4.groupCount() < 3) {
                throw new InvalidValueException("Can't parse service type string (namespace/type/version): " + strReplaceAll);
            }
            String strReplaceAll3 = matcher4.group(2).replaceAll("[^a-zA-Z_0-9\\-]", "-");
            f85832d.warning("UPnP specification violation, replacing invalid service type token '" + matcher4.group(2) + "' with: " + strReplaceAll3);
            return new s(matcher4.group(1), strReplaceAll3, Integer.valueOf(matcher4.group(3)).intValue());
        } catch (RuntimeException e10) {
            throw new InvalidValueException(String.format("Can't parse service type string (namespace/type/version) '%s': %s", strReplaceAll, e10.toString()));
        }
    }

    public String a() {
        return this.f85835a;
    }

    public int b() {
        return this.f85837c;
    }

    public String getType() {
        return this.f85836b;
    }

    public int hashCode() {
        return (((this.f85835a.hashCode() * 31) + this.f85836b.hashCode()) * 31) + this.f85837c;
    }

    public String toString() {
        return "urn:" + a() + ":service:" + getType() + StringUtils.PROCESS_POSTFIX_DELIMITER + b();
    }

    public s(String str, String str2, int i10) {
        this.f85837c = 1;
        if (str != null && !str.matches("[a-zA-Z0-9\\-\\.]+")) {
            throw new IllegalArgumentException("Service type namespace contains illegal characters");
        }
        this.f85835a = str;
        if (str2 != null && !str2.matches("[a-zA-Z_0-9\\-]{1,64}")) {
            throw new IllegalArgumentException("Service type suffix too long (64) or contains illegal characters");
        }
        this.f85836b = str2;
        this.f85837c = i10;
    }
}
