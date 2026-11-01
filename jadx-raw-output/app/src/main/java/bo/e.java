package bo;

import java.util.logging.Logger;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.transport.RouterException;

/* JADX INFO: compiled from: ReceivingUnsubscribe.java */
/* JADX INFO: loaded from: classes.dex */
public class e extends zn.d<org.fourthline.cling.model.message.b, org.fourthline.cling.model.message.c> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f5532h = Logger.getLogger(e.class.getName());

    public e(fn.b bVar, org.fourthline.cling.model.message.b bVar2) {
        super(bVar, bVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zn.d
    public org.fourthline.cling.model.message.c f() throws RouterException {
        wn.g gVar = (wn.g) d().getRegistry().A(wn.g.class, ((org.fourthline.cling.model.message.b) c()).v());
        if (gVar == null) {
            f5532h.fine("No local resource found: " + c());
            return null;
        }
        Logger logger = f5532h;
        logger.fine("Found local event subscription matching relative request URI: " + ((org.fourthline.cling.model.message.b) c()).v());
        sn.d dVar = new sn.d((org.fourthline.cling.model.message.b) c(), gVar.a());
        if (dVar.y() != null && (dVar.A() || dVar.z())) {
            logger.fine("Subscription ID and NT or Callback in unsubcribe request: " + c());
            return new org.fourthline.cling.model.message.c(UpnpResponse.Status.BAD_REQUEST);
        }
        on.b bVarB = d().getRegistry().b(dVar.y());
        if (bVarB == null) {
            logger.fine("Invalid subscription ID for unsubscribe request: " + c());
            return new org.fourthline.cling.model.message.c(UpnpResponse.Status.PRECONDITION_FAILED);
        }
        logger.fine("Unregistering subscription: " + bVarB);
        if (d().getRegistry().g(bVarB)) {
            bVarB.L(null);
        } else {
            logger.fine("Subscription was already removed from registry");
        }
        return new org.fourthline.cling.model.message.c(UpnpResponse.Status.OK);
    }
}
