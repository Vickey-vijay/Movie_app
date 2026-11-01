package yn;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: compiled from: UDAServiceId.java */
/* JADX INFO: loaded from: classes9.dex */
public class x extends r {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Logger f85845f = Logger.getLogger(x.class.getName());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f85846g = Pattern.compile("urn:upnp-org:serviceId:([a-zA-Z_0-9\\-:\\.]{1,64})");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f85847h = Pattern.compile("urn:schemas-upnp-org:service:([a-zA-Z_0-9\\-:\\.]{1,64})");

    public x(String str) {
        super("upnp-org", str);
    }

    public static x d(String str) throws InvalidValueException {
        Matcher matcher = f85846g.matcher(str);
        if (matcher.matches() && matcher.groupCount() >= 1) {
            return new x(matcher.group(1));
        }
        Matcher matcher2 = f85847h.matcher(str);
        if (matcher2.matches() && matcher2.groupCount() >= 1) {
            return new x(matcher2.group(1));
        }
        Matcher matcher3 = Pattern.compile("urn:upnp-orgerviceId:urnchemas-upnp-orgervice:([a-zA-Z_0-9\\-:\\.]{1,64})").matcher(str);
        if (matcher3.matches()) {
            f85845f.warning("UPnP specification violation, recovering from Eyecon garbage: " + str);
            return new x(matcher3.group(1));
        }
        if (!"ContentDirectory".equals(str) && !"ConnectionManager".equals(str) && !"RenderingControl".equals(str) && !"AVTransport".equals(str)) {
            throw new InvalidValueException("Can't parse UDA service ID string (upnp-org/id): " + str);
        }
        f85845f.warning("UPnP specification violation, fixing broken Service ID: " + str);
        return new x(str);
    }
}
