package yn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: compiled from: UDADeviceType.java */
/* JADX INFO: loaded from: classes9.dex */
public class w extends j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f85844f = Pattern.compile("urn:schemas-upnp-org:device:([a-zA-Z_0-9\\-]{1,64}):([0-9]+).*");

    public w(String str) {
        super("schemas-upnp-org", str, 1);
    }

    public w(String str, int i10) {
        super("schemas-upnp-org", str, i10);
    }

    public static w e(String str) throws InvalidValueException {
        Matcher matcher = f85844f.matcher(str);
        try {
            if (matcher.matches()) {
                return new w(matcher.group(1), Integer.valueOf(matcher.group(2)).intValue());
            }
            throw new InvalidValueException("Can't parse UDA device type string (namespace/type/version): " + str);
        } catch (RuntimeException e10) {
            throw new InvalidValueException(String.format("Can't parse UDA device type string (namespace/type/version) '%s': %s", str, e10.toString()));
        }
    }
}
