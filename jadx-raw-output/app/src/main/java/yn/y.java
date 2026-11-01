package yn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: compiled from: UDAServiceType.java */
/* JADX INFO: loaded from: classes9.dex */
public class y extends s {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f85848g = Pattern.compile("urn:schemas-upnp-org:service:([a-zA-Z_0-9\\-]{1,64}):([0-9]+).*");

    public y(String str) {
        this(str, 1);
    }

    public y(String str, int i10) {
        super("schemas-upnp-org", str, i10);
    }

    public static y e(String str) throws InvalidValueException {
        Matcher matcher = f85848g.matcher(str);
        try {
            if (matcher.matches()) {
                return new y(matcher.group(1), Integer.valueOf(matcher.group(2)).intValue());
            }
            throw new InvalidValueException("Can't parse UDA service type string (namespace/type/version): " + str);
        } catch (RuntimeException e10) {
            throw new InvalidValueException(String.format("Can't parse UDA service type string (namespace/type/version) '%s': %s", str, e10.toString()));
        }
    }
}
