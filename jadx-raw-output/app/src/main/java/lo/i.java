package lo;

import java.util.Set;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import org.fourthline.cling.support.lastchange.LastChangeParser;
import org.fourthline.cling.support.renderingcontrol.lastchange.RenderingControlVariable;

/* JADX INFO: compiled from: RenderingControlLastChangeParser.java */
/* JADX INFO: loaded from: classes3.dex */
public class i extends LastChangeParser {
    @Override // org.fourthline.cling.support.lastchange.LastChangeParser
    public String o() {
        return "urn:schemas-upnp-org:metadata-1-0/RCS/";
    }

    @Override // org.seamless.xml.SAXParser
    public Source[] e() {
        if (mn.f.f64631a) {
            return null;
        }
        return new Source[]{new StreamSource(Thread.currentThread().getContextClassLoader().getResourceAsStream("org/fourthline/cling/support/renderingcontrol/metadata-1.0-rcs.xsd"))};
    }

    @Override // org.fourthline.cling.support.lastchange.LastChangeParser
    public Set<Class<? extends ho.b>> n() {
        return RenderingControlVariable.f65823a;
    }
}
