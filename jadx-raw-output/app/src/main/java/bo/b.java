package bo;

import java.util.logging.Logger;
import org.fourthline.cling.model.UnsupportedDataException;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.transport.RouterException;

/* JADX INFO: compiled from: ReceivingEvent.java */
/* JADX INFO: loaded from: classes.dex */
public class b extends zn.d<org.fourthline.cling.model.message.b, sn.f> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f5521h = Logger.getLogger(b.class.getName());

    /* JADX INFO: compiled from: ReceivingEvent.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ on.c f5522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ UnsupportedDataException f5523c;

        public a(on.c cVar, UnsupportedDataException unsupportedDataException) {
            this.f5522b = cVar;
            this.f5523c = unsupportedDataException;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5522b.T(this.f5523c);
        }
    }

    /* JADX INFO: renamed from: bo.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ReceivingEvent.java */
    public class RunnableC0020b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ on.c f5525b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ sn.a f5526c;

        public RunnableC0020b(on.c cVar, sn.a aVar) {
            this.f5525b = cVar;
            this.f5526c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.f5521h.fine("Calling active subscription with event state variable values");
            this.f5525b.U(this.f5526c.y(), this.f5526c.A());
        }
    }

    public b(fn.b bVar, org.fourthline.cling.model.message.b bVar2) {
        super(bVar, bVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zn.d
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public sn.f f() throws RouterException {
        if (!((org.fourthline.cling.model.message.b) c()).q()) {
            f5521h.warning("Received without or with invalid Content-Type: " + c());
        }
        wn.f fVar = (wn.f) d().getRegistry().A(wn.f.class, ((org.fourthline.cling.model.message.b) c()).v());
        if (fVar == null) {
            f5521h.fine("No local resource found: " + c());
            return new sn.f(new UpnpResponse(UpnpResponse.Status.NOT_FOUND));
        }
        sn.a aVar = new sn.a((org.fourthline.cling.model.message.b) c(), fVar.a());
        if (aVar.B() == null) {
            f5521h.fine("Subscription ID missing in event request: " + c());
            return new sn.f(new UpnpResponse(UpnpResponse.Status.PRECONDITION_FAILED));
        }
        if (!aVar.C()) {
            f5521h.fine("Missing NT and/or NTS headers in event request: " + c());
            return new sn.f(new UpnpResponse(UpnpResponse.Status.BAD_REQUEST));
        }
        if (!aVar.C()) {
            f5521h.fine("Invalid NT and/or NTS headers in event request: " + c());
            return new sn.f(new UpnpResponse(UpnpResponse.Status.PRECONDITION_FAILED));
        }
        if (aVar.y() == null) {
            f5521h.fine("Sequence missing in event request: " + c());
            return new sn.f(new UpnpResponse(UpnpResponse.Status.PRECONDITION_FAILED));
        }
        try {
            d().getConfiguration().r().a(aVar);
            on.c cVarH = d().getRegistry().h(aVar.B());
            if (cVarH == null) {
                f5521h.severe("Invalid subscription ID, no active subscription: " + aVar);
                return new sn.f(new UpnpResponse(UpnpResponse.Status.PRECONDITION_FAILED));
            }
            d().getConfiguration().p().execute(new RunnableC0020b(cVarH, aVar));
            return new sn.f();
        } catch (UnsupportedDataException e10) {
            f5521h.fine("Can't read event message request body, " + e10);
            on.c cVarP = d().getRegistry().p(aVar.B());
            if (cVarP != null) {
                d().getConfiguration().p().execute(new a(cVarP, e10));
            }
            return new sn.f(new UpnpResponse(UpnpResponse.Status.INTERNAL_SERVER_ERROR));
        }
    }
}
