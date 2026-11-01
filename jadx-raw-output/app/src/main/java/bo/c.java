package bo;

import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.binding.xml.DescriptorBindingException;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.transport.RouterException;
import tn.u;

/* JADX INFO: compiled from: ReceivingRetrieval.java */
/* JADX INFO: loaded from: classes.dex */
public class c extends zn.d<org.fourthline.cling.model.message.b, org.fourthline.cling.model.message.c> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f5528h = Logger.getLogger(c.class.getName());

    public wn.c l(URI uri) {
        return null;
    }

    public org.fourthline.cling.model.message.c k(URI uri, wn.c cVar) {
        org.fourthline.cling.model.message.c cVar2;
        try {
            if (wn.a.class.isAssignableFrom(cVar.getClass())) {
                f5528h.fine("Found local device matching relative request URI: " + uri);
                cVar2 = new org.fourthline.cling.model.message.c(d().getConfiguration().l().b((un.e) cVar.a(), h(), d().getConfiguration().getNamespace()), new tn.d(tn.d.f72467c));
            } else if (wn.e.class.isAssignableFrom(cVar.getClass())) {
                f5528h.fine("Found local service matching relative request URI: " + uri);
                cVar2 = new org.fourthline.cling.model.message.c(d().getConfiguration().c().a((un.f) cVar.a()), new tn.d(tn.d.f72467c));
            } else {
                if (!wn.b.class.isAssignableFrom(cVar.getClass())) {
                    f5528h.fine("Ignoring GET for found local resource: " + cVar);
                    return null;
                }
                f5528h.fine("Found local icon matching relative request URI: " + uri);
                un.d dVar = (un.d) cVar.a();
                cVar2 = new org.fourthline.cling.model.message.c(dVar.b(), dVar.f());
            }
        } catch (DescriptorBindingException e10) {
            Logger logger = f5528h;
            logger.warning("Error generating requested device/service descriptor: " + e10.toString());
            logger.log(Level.WARNING, "Exception root cause: ", so.a.a(e10));
            cVar2 = new org.fourthline.cling.model.message.c(UpnpResponse.Status.INTERNAL_SERVER_ERROR);
        }
        cVar2.j().n(UpnpHeader.Type.SERVER, new u());
        return cVar2;
    }

    public c(fn.b bVar, org.fourthline.cling.model.message.b bVar2) {
        super(bVar, bVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zn.d
    public org.fourthline.cling.model.message.c f() throws RouterException {
        if (!((org.fourthline.cling.model.message.b) c()).o()) {
            f5528h.fine("Ignoring message, missing HOST header: " + c());
            return new org.fourthline.cling.model.message.c(new UpnpResponse(UpnpResponse.Status.PRECONDITION_FAILED));
        }
        URI uriE = ((org.fourthline.cling.model.message.b) c()).k().e();
        wn.c cVarD = d().getRegistry().d(uriE);
        if (cVarD == null && (cVarD = l(uriE)) == null) {
            f5528h.fine("No local resource found: " + c());
            return null;
        }
        return k(uriE, cVarD);
    }
}
