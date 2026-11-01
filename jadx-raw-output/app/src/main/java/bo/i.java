package bo;

import java.util.List;
import java.util.logging.Logger;
import org.fourthline.cling.transport.RouterException;

/* JADX INFO: compiled from: SendingSubscribe.java */
/* JADX INFO: loaded from: classes.dex */
public class i extends zn.g<sn.h, sn.c> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f5546g = Logger.getLogger(i.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final on.c f5547f;

    /* JADX INFO: compiled from: SendingSubscribe.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.f5547f.P(null);
        }
    }

    /* JADX INFO: compiled from: SendingSubscribe.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ sn.c f5549b;

        public b(sn.c cVar) {
            this.f5549b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.f5547f.P(this.f5549b.k());
        }
    }

    /* JADX INFO: compiled from: SendingSubscribe.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ sn.c f5551b;

        public c(sn.c cVar) {
            this.f5551b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.f5547f.P(this.f5551b.k());
        }
    }

    /* JADX INFO: compiled from: SendingSubscribe.java */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.f5547f.N();
        }
    }

    /* JADX INFO: compiled from: SendingSubscribe.java */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.f5547f.P(null);
        }
    }

    public i(fn.b bVar, on.c cVar, List<mn.h> list) {
        super(bVar, new sn.h(cVar, cVar.R(list, bVar.getConfiguration().getNamespace()), bVar.getConfiguration().e(cVar.H())));
        this.f5547f = cVar;
    }

    public void h() {
        f5546g.fine("Subscription failed");
        c().getConfiguration().p().execute(new e());
    }

    @Override // zn.g
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public sn.c d() throws RouterException {
        if (!e().y()) {
            f5546g.fine("Subscription failed, no active local callback URLs available (network disabled?)");
            c().getConfiguration().p().execute(new a());
            return null;
        }
        Logger logger = f5546g;
        logger.fine("Sending subscription request: " + e());
        try {
            c().getRegistry().l(this.f5547f);
            try {
                org.fourthline.cling.model.message.c cVarC = c().c().c(e());
                if (cVarC == null) {
                    h();
                    c().getRegistry().e(this.f5547f);
                    return null;
                }
                sn.c cVar = new sn.c(cVarC);
                if (cVarC.k().f()) {
                    logger.fine("Subscription failed, response was: " + cVar);
                    c().getConfiguration().p().execute(new b(cVar));
                } else if (!cVar.w()) {
                    logger.severe("Subscription failed, invalid or missing (SID, Timeout) response headers");
                    c().getConfiguration().p().execute(new c(cVar));
                } else {
                    logger.fine("Subscription established, adding to registry, response was: " + cVarC);
                    this.f5547f.K(cVar.v());
                    this.f5547f.J(cVar.u());
                    c().getRegistry().i(this.f5547f);
                    c().getConfiguration().p().execute(new d());
                }
                c().getRegistry().e(this.f5547f);
                return cVar;
            } catch (RouterException unused) {
                h();
                c().getRegistry().e(this.f5547f);
                return null;
            }
        } catch (Throwable th2) {
            c().getRegistry().e(this.f5547f);
            throw th2;
        }
    }
}
