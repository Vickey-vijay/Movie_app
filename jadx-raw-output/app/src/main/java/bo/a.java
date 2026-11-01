package bo;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.model.UnsupportedDataException;
import org.fourthline.cling.model.action.ActionCancelledException;
import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.ErrorCode;
import org.fourthline.cling.transport.RouterException;

/* JADX INFO: compiled from: ReceivingAction.java */
/* JADX INFO: loaded from: classes.dex */
public class a extends zn.d<org.fourthline.cling.model.message.b, org.fourthline.cling.model.message.c> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f5520h = Logger.getLogger(a.class.getName());

    public a(fn.b bVar, org.fourthline.cling.model.message.b bVar2) {
        super(bVar, bVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zn.d
    public org.fourthline.cling.model.message.c f() throws RouterException {
        nn.g gVar;
        qn.g gVar2;
        ActionException actionException;
        tn.d dVar = (tn.d) ((org.fourthline.cling.model.message.b) c()).j().s(UpnpHeader.Type.CONTENT_TYPE, tn.d.class);
        if (dVar != null && !dVar.g()) {
            f5520h.warning("Received invalid Content-Type '" + dVar + "': " + c());
            return new org.fourthline.cling.model.message.c(new UpnpResponse(UpnpResponse.Status.UNSUPPORTED_MEDIA_TYPE));
        }
        if (dVar == null) {
            f5520h.warning("Received without Content-Type: " + c());
        }
        wn.d dVar2 = (wn.d) d().getRegistry().A(wn.d.class, ((org.fourthline.cling.model.message.b) c()).v());
        if (dVar2 == null) {
            f5520h.fine("No local resource found: " + c());
            return null;
        }
        Logger logger = f5520h;
        logger.fine("Found local action resource matching relative request URI: " + ((org.fourthline.cling.model.message.b) c()).v());
        try {
            qn.d dVar3 = new qn.d((org.fourthline.cling.model.message.b) c(), dVar2.a());
            logger.finer("Created incoming action request message: " + dVar3);
            gVar = new nn.g(dVar3.y(), h());
            logger.fine("Reading body of request message");
            d().getConfiguration().k().a(dVar3, gVar);
            logger.fine("Executing on local service: " + gVar);
            dVar2.a().p(gVar.a()).a(gVar);
            if (gVar.c() == null) {
                gVar2 = new qn.g(gVar.a());
            } else {
                if (gVar.c() instanceof ActionCancelledException) {
                    logger.fine("Action execution was cancelled, returning 404 to client");
                    return null;
                }
                gVar2 = new qn.g(UpnpResponse.Status.INTERNAL_SERVER_ERROR, gVar.a());
            }
        } catch (UnsupportedDataException e10) {
            f5520h.log(Level.WARNING, "Error reading action request XML body: " + e10.toString(), so.a.a(e10));
            if (so.a.a(e10) instanceof ActionException) {
                actionException = (ActionException) so.a.a(e10);
            } else {
                actionException = new ActionException(ErrorCode.ACTION_FAILED, e10.getMessage());
            }
            gVar = new nn.g(actionException, h());
            gVar2 = new qn.g(UpnpResponse.Status.INTERNAL_SERVER_ERROR);
        } catch (ActionException e11) {
            f5520h.finer("Error executing local action: " + e11);
            gVar = new nn.g(e11, h());
            gVar2 = new qn.g(UpnpResponse.Status.INTERNAL_SERVER_ERROR);
        }
        try {
            Logger logger2 = f5520h;
            logger2.fine("Writing body of response message");
            d().getConfiguration().k().b(gVar2, gVar);
            logger2.fine("Returning finished response message: " + gVar2);
            return gVar2;
        } catch (UnsupportedDataException e12) {
            Logger logger3 = f5520h;
            logger3.warning("Failure writing body of response message, sending '500 Internal Server Error' without body");
            logger3.log(Level.WARNING, "Exception root cause: ", so.a.a(e12));
            return new org.fourthline.cling.model.message.c(UpnpResponse.Status.INTERNAL_SERVER_ERROR);
        }
    }
}
