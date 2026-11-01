package bo;

import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.model.UnsupportedDataException;
import org.fourthline.cling.model.action.ActionCancelledException;
import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.types.ErrorCode;
import org.fourthline.cling.transport.RouterException;

/* JADX INFO: compiled from: SendingAction.java */
/* JADX INFO: loaded from: classes.dex */
public class f extends zn.g<qn.f, qn.e> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f5533g = Logger.getLogger(f.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final nn.d f5534f;

    public f(fn.b bVar, nn.d dVar, URL url) {
        super(bVar, new qn.f(dVar, url));
        this.f5534f = dVar;
    }

    public void h(qn.e eVar) throws ActionException {
        try {
            f5533g.fine("Received response for outgoing call, reading SOAP response body: " + eVar);
            c().getConfiguration().k().c(eVar, this.f5534f);
        } catch (UnsupportedDataException e10) {
            Logger logger = f5533g;
            logger.fine("Error reading SOAP body: " + e10);
            logger.log(Level.FINE, "Exception root cause: ", so.a.a(e10));
            throw new ActionException(ErrorCode.ACTION_FAILED, "Error reading SOAP response message. " + e10.getMessage(), false);
        }
    }

    public void i(qn.e eVar) throws ActionException {
        try {
            f5533g.fine("Received response with Internal Server Error, reading SOAP failure message");
            c().getConfiguration().k().c(eVar, this.f5534f);
        } catch (UnsupportedDataException e10) {
            Logger logger = f5533g;
            logger.fine("Error reading SOAP body: " + e10);
            logger.log(Level.FINE, "Exception root cause: ", so.a.a(e10));
            throw new ActionException(ErrorCode.ACTION_FAILED, "Error reading SOAP response failure message. " + e10.getMessage(), false);
        }
    }

    public qn.e j(qn.f fVar) throws RouterException {
        un.a aVarD = this.f5534f.a().g().d();
        Logger logger = f5533g;
        logger.fine("Sending outgoing action call '" + this.f5534f.a().d() + "' to remote service of: " + aVarD);
        qn.e eVar = null;
        try {
            org.fourthline.cling.model.message.c cVarK = k(fVar);
            if (cVarK == null) {
                logger.fine("No connection or no no response received, returning null");
                this.f5534f.i(new ActionException(ErrorCode.ACTION_FAILED, "Connection error or no response received"));
                return null;
            }
            qn.e eVar2 = new qn.e(cVarK);
            try {
                if (!eVar2.u()) {
                    if (eVar2.v()) {
                        i(eVar2);
                    } else {
                        h(eVar2);
                    }
                    return eVar2;
                }
                logger.fine("Response was a non-recoverable failure: " + eVar2);
                throw new ActionException(ErrorCode.ACTION_FAILED, "Non-recoverable remote execution failure: " + eVar2.k().c());
            } catch (ActionException e10) {
                e = e10;
                eVar = eVar2;
                f5533g.fine("Remote action invocation failed, returning Internal Server Error message: " + e.getMessage());
                this.f5534f.i(e);
                return (eVar == null || !eVar.k().f()) ? new qn.e(new UpnpResponse(UpnpResponse.Status.INTERNAL_SERVER_ERROR)) : eVar;
            }
        } catch (ActionException e11) {
            e = e11;
        }
    }

    public org.fourthline.cling.model.message.c k(qn.f fVar) throws ActionException, RouterException {
        try {
            Logger logger = f5533g;
            logger.fine("Writing SOAP request body of: " + fVar);
            c().getConfiguration().k().d(fVar, this.f5534f);
            logger.fine("Sending SOAP body of message as stream to remote device");
            return c().c().c(fVar);
        } catch (UnsupportedDataException e10) {
            Logger logger2 = f5533g;
            Level level = Level.FINE;
            if (logger2.isLoggable(level)) {
                logger2.fine("Error writing SOAP body: " + e10);
                logger2.log(level, "Exception root cause: ", so.a.a(e10));
            }
            throw new ActionException(ErrorCode.ACTION_FAILED, "Error writing request message. " + e10.getMessage());
        } catch (RouterException e11) {
            Throwable thA = so.a.a(e11);
            if (!(thA instanceof InterruptedException)) {
                throw e11;
            }
            Logger logger3 = f5533g;
            if (logger3.isLoggable(Level.FINE)) {
                logger3.fine("Sending action request message was interrupted: " + thA);
            }
            throw new ActionCancelledException((InterruptedException) thA);
        }
    }

    @Override // zn.g
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public qn.e d() throws RouterException {
        return j(e());
    }
}
