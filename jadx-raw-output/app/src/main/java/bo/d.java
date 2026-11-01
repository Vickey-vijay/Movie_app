package bo;

import java.net.URL;
import java.util.List;
import java.util.logging.Logger;
import org.fourthline.cling.model.gena.CancelReason;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.transport.RouterException;

/* JADX INFO: compiled from: ReceivingSubscribe.java */
/* JADX INFO: loaded from: classes.dex */
public class d extends zn.d<org.fourthline.cling.model.message.b, sn.i> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Logger f5529i = Logger.getLogger(d.class.getName());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public on.b f5530h;

    /* JADX INFO: compiled from: ReceivingSubscribe.java */
    public class a extends on.b {
        @Override // on.b
        public void M(CancelReason cancelReason) {
        }

        @Override // on.a
        public void b() {
        }

        public a(un.f fVar, Integer num, List list) {
            super(fVar, num, list);
        }

        @Override // on.a
        public void h() {
            d.this.d().getConfiguration().h().execute(d.this.d().a().c(this));
        }
    }

    @Override // zn.d
    public void i(Throwable th2) {
        if (this.f5530h == null) {
            return;
        }
        f5529i.fine("Response could not be send to subscriber, removing local GENA subscription: " + this.f5530h);
        d().getRegistry().g(this.f5530h);
    }

    @Override // zn.d
    public void j(org.fourthline.cling.model.message.c cVar) {
        if (this.f5530h == null) {
            return;
        }
        if (cVar != null && !cVar.k().f() && this.f5530h.A().c().longValue() == 0) {
            Logger logger = f5529i;
            logger.fine("Establishing subscription");
            this.f5530h.R();
            this.f5530h.N();
            logger.fine("Response to subscription sent successfully, now sending initial event asynchronously");
            d().getConfiguration().f().execute(d().a().c(this.f5530h));
            return;
        }
        if (this.f5530h.A().c().longValue() == 0) {
            Logger logger2 = f5529i;
            logger2.fine("Subscription request's response aborted, not sending initial event");
            if (cVar == null) {
                logger2.fine("Reason: No response at all from subscriber");
            } else {
                logger2.fine("Reason: " + cVar.k());
            }
            logger2.fine("Removing subscription from registry: " + this.f5530h);
            d().getRegistry().g(this.f5530h);
        }
    }

    public d(fn.b bVar, org.fourthline.cling.model.message.b bVar2) {
        super(bVar, bVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zn.d
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public sn.i f() throws RouterException {
        wn.g gVar = (wn.g) d().getRegistry().A(wn.g.class, ((org.fourthline.cling.model.message.b) c()).v());
        if (gVar == null) {
            f5529i.fine("No local resource found: " + c());
            return null;
        }
        Logger logger = f5529i;
        logger.fine("Found local event subscription matching relative request URI: " + ((org.fourthline.cling.model.message.b) c()).v());
        sn.b bVar = new sn.b((org.fourthline.cling.model.message.b) c(), gVar.a());
        if (bVar.A() != null && (bVar.B() || bVar.y() != null)) {
            logger.fine("Subscription ID and NT or Callback in subscribe request: " + c());
            return new sn.i(UpnpResponse.Status.BAD_REQUEST);
        }
        if (bVar.A() != null) {
            return m(gVar.a(), bVar);
        }
        if (bVar.B() && bVar.y() != null) {
            return l(gVar.a(), bVar);
        }
        logger.fine("No subscription ID, no NT or Callback, neither subscription or renewal: " + c());
        return new sn.i(UpnpResponse.Status.PRECONDITION_FAILED);
    }

    public sn.i l(un.f fVar, sn.b bVar) {
        Integer numZ;
        List<URL> listY = bVar.y();
        if (listY != null && listY.size() != 0) {
            if (!bVar.B()) {
                f5529i.fine("Missing or invalid NT header in subscribe request: " + c());
                return new sn.i(UpnpResponse.Status.PRECONDITION_FAILED);
            }
            if (d().getConfiguration().t()) {
                numZ = null;
            } else {
                numZ = bVar.z();
            }
            try {
                this.f5530h = new a(fVar, numZ, listY);
                Logger logger = f5529i;
                logger.fine("Adding subscription to registry: " + this.f5530h);
                d().getRegistry().x(this.f5530h);
                logger.fine("Returning subscription response, waiting to send initial event");
                return new sn.i(this.f5530h);
            } catch (Exception e10) {
                f5529i.warning("Couldn't create local subscription to service: " + so.a.a(e10));
                return new sn.i(UpnpResponse.Status.INTERNAL_SERVER_ERROR);
            }
        }
        f5529i.fine("Missing or invalid Callback URLs in subscribe request: " + c());
        return new sn.i(UpnpResponse.Status.PRECONDITION_FAILED);
    }

    public sn.i m(un.f fVar, sn.b bVar) {
        on.b bVarB = d().getRegistry().b(bVar.A());
        this.f5530h = bVarB;
        if (bVarB == null) {
            f5529i.fine("Invalid subscription ID for renewal request: " + c());
            return new sn.i(UpnpResponse.Status.PRECONDITION_FAILED);
        }
        Logger logger = f5529i;
        logger.fine("Renewing subscription: " + this.f5530h);
        this.f5530h.S(bVar.z());
        if (d().getRegistry().C(this.f5530h)) {
            return new sn.i(this.f5530h);
        }
        logger.fine("Subscription went away before it could be renewed: " + c());
        return new sn.i(UpnpResponse.Status.PRECONDITION_FAILED);
    }
}
