package qn;

import java.net.URL;
import java.util.logging.Logger;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.header.UpnpHeader;
import tn.e0;
import tn.x;
import yn.u;

/* JADX INFO: compiled from: OutgoingActionRequestMessage.java */
/* JADX INFO: loaded from: classes3.dex */
public class f extends org.fourthline.cling.model.message.b implements b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Logger f66632i = Logger.getLogger(f.class.getName());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f66633h;

    public f(nn.d dVar, URL url) {
        this(dVar.a(), new UpnpRequest(UpnpRequest.Method.POST, url));
        if (!(dVar instanceof nn.g)) {
            if (dVar.b() != null) {
                j().putAll(dVar.b().a());
            }
        } else {
            nn.g gVar = (nn.g) dVar;
            if (gVar.o() == null || gVar.o().b() == null) {
                return;
            }
            j().n(UpnpHeader.Type.USER_AGENT, new e0(gVar.o().b()));
        }
    }

    @Override // qn.a
    public String a() {
        return this.f66633h;
    }

    public f(org.fourthline.cling.model.meta.a aVar, UpnpRequest upnpRequest) {
        x xVar;
        super(upnpRequest);
        j().n(UpnpHeader.Type.CONTENT_TYPE, new tn.d(tn.d.f72468d));
        if (aVar instanceof org.fourthline.cling.model.meta.b) {
            f66632i.fine("Adding magic control SOAP action header for state variable query action");
            xVar = new x(new u("schemas-upnp-org", "control-1-0", null, aVar.d()));
        } else {
            xVar = new x(new u(aVar.g().g(), aVar.d()));
        }
        this.f66633h = xVar.b().d();
        if (k().d().equals(UpnpRequest.Method.POST)) {
            j().n(UpnpHeader.Type.SOAPACTION, xVar);
            f66632i.fine("Added SOAP action header: " + xVar);
            return;
        }
        throw new IllegalArgumentException("Can't send action with request method: " + k().d());
    }
}
