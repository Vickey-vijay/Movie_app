package bo;

import java.util.logging.Logger;
import org.fourthline.cling.model.gena.CancelReason;
import org.fourthline.cling.transport.RouterException;

/* JADX INFO: compiled from: SendingUnsubscribe.java */
/* JADX INFO: loaded from: classes.dex */
public class j extends zn.g<sn.j, org.fourthline.cling.model.message.c> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f5555g = Logger.getLogger(j.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final on.c f5556f;

    /* JADX INFO: compiled from: SendingUnsubscribe.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ org.fourthline.cling.model.message.c f5557b;

        public a(org.fourthline.cling.model.message.c cVar) {
            this.f5557b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            org.fourthline.cling.model.message.c cVar = this.f5557b;
            if (cVar == null) {
                j.f5555g.fine("Unsubscribe failed, no response received");
                j.this.f5556f.L(CancelReason.UNSUBSCRIBE_FAILED, null);
                return;
            }
            if (cVar.k().f()) {
                j.f5555g.fine("Unsubscribe failed, response was: " + this.f5557b);
                j.this.f5556f.L(CancelReason.UNSUBSCRIBE_FAILED, this.f5557b.k());
                return;
            }
            j.f5555g.fine("Unsubscribe successful, response was: " + this.f5557b);
            j.this.f5556f.L(null, this.f5557b.k());
        }
    }

    public j(fn.b bVar, on.c cVar) {
        super(bVar, new sn.j(cVar, bVar.getConfiguration().e(cVar.H())));
        this.f5556f = cVar;
    }

    @Override // zn.g
    public org.fourthline.cling.model.message.c d() throws RouterException {
        f5555g.fine("Sending unsubscribe request: " + e());
        try {
            org.fourthline.cling.model.message.c cVarC = c().c().c(e());
            h(cVarC);
            return cVarC;
        } catch (Throwable th2) {
            h(null);
            throw th2;
        }
    }

    public void h(org.fourthline.cling.model.message.c cVar) {
        c().getRegistry().z(this.f5556f);
        c().getConfiguration().p().execute(new a(cVar));
    }
}
