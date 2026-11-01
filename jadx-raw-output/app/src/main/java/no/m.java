package no;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.enterprise.inject.Alternative;
import org.fourthline.cling.model.UnsupportedDataException;

/* JADX INFO: compiled from: RecoveringGENAEventProcessorImpl.java */
/* JADX INFO: loaded from: classes10.dex */
@Alternative
public class m extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Logger f64918c = Logger.getLogger(po.e.class.getName());

    public String m(String str) {
        Matcher matcher = Pattern.compile("<LastChange>(.*)</LastChange>", 32).matcher(str);
        if (!matcher.find() || matcher.groupCount() != 1) {
            return str;
        }
        String strGroup = matcher.group(1);
        if (uo.c.d(strGroup)) {
            return str;
        }
        String strTrim = strGroup.trim();
        String strK = strTrim.charAt(0) == '<' ? mn.m.k(strTrim) : strTrim;
        if (strK.equals(strTrim)) {
            return str;
        }
        return "<?xml version=\"1.0\" encoding=\"utf-8\"?><e:propertyset xmlns:e=\"urn:schemas-upnp-org:event-1-0\"><e:property><LastChange>" + strK + "</LastChange></e:property></e:propertyset>";
    }

    @Override // no.k, no.g, po.e
    public void a(sn.a aVar) throws UnsupportedDataException {
        try {
            super.a(aVar);
        } catch (UnsupportedDataException e10) {
            if (aVar.c()) {
                f64918c.warning("Trying to recover from invalid GENA XML event: " + e10);
                aVar.A().clear();
                try {
                    aVar.b(m(uo.c.c(d(aVar))));
                    super.a(aVar);
                    return;
                } catch (UnsupportedDataException unused) {
                    if (!aVar.A().isEmpty()) {
                        f64918c.warning("Partial read of GENA event properties (probably due to truncated XML)");
                        return;
                    }
                    throw e10;
                }
            }
            throw e10;
        }
    }
}
