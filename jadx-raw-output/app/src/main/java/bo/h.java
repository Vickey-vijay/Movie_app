package bo;

import java.util.logging.Logger;
import org.fourthline.cling.model.gena.CancelReason;
import org.fourthline.cling.transport.RouterException;

/* JADX INFO: compiled from: SendingRenewal.java */
/* JADX INFO: loaded from: classes.dex */
public class h extends zn.g<sn.g, sn.c> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f5539g = Logger.getLogger(h.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final on.c f5540f;

    /* JADX INFO: compiled from: SendingRenewal.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ sn.c f5541b;

        public a(sn.c cVar) {
            this.f5541b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.f5540f.L(CancelReason.RENEWAL_FAILED, this.f5541b.k());
        }
    }

    /* JADX INFO: compiled from: SendingRenewal.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ sn.c f5543b;

        public b(sn.c cVar) {
            this.f5543b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.f5540f.L(CancelReason.RENEWAL_FAILED, this.f5543b.k());
        }
    }

    /* JADX INFO: compiled from: SendingRenewal.java */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.f5540f.L(CancelReason.RENEWAL_FAILED, null);
        }
    }

    public h(fn.b bVar, on.c cVar) {
        super(bVar, new sn.g(cVar, bVar.getConfiguration().e(cVar.H())));
        this.f5540f = cVar;
    }

    @Override // zn.g
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public sn.c d() throws RouterException {
        Logger logger = f5539g;
        logger.fine("Sending subscription renewal request: " + e());
        try {
            org.fourthline.cling.model.message.c cVarC = c().c().c(e());
            if (cVarC == null) {
                h();
                return null;
            }
            sn.c cVar = new sn.c(cVarC);
            if (cVarC.k().f()) {
                logger.fine("Subscription renewal failed, response was: " + cVarC);
                c().getRegistry().z(this.f5540f);
                c().getConfiguration().p().execute(new a(cVar));
            } else if (cVar.w()) {
                logger.fine("Subscription renewed, updating in registry, response was: " + cVarC);
                this.f5540f.J(cVar.u());
                c().getRegistry().r(this.f5540f);
            } else {
                logger.severe("Subscription renewal failed, invalid or missing (SID, Timeout) response headers");
                c().getConfiguration().p().execute(new b(cVar));
            }
            return cVar;
        } catch (RouterException e10) {
            h();
            throw e10;
        }
    }

    public void h() {
        f5539g.fine("Subscription renewal failed, removing subscription from registry");
        c().getRegistry().z(this.f5540f);
        c().getConfiguration().p().execute(new c());
    }
}
