package bo;

import java.net.URL;
import java.util.Iterator;
import java.util.logging.Logger;
import org.fourthline.cling.transport.RouterException;

/* JADX INFO: compiled from: SendingEvent.java */
/* JADX INFO: loaded from: classes.dex */
public class g extends zn.g<sn.e, org.fourthline.cling.model.message.c> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Logger f5535i = Logger.getLogger(g.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f5536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final sn.e[] f5537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final org.fourthline.cling.model.types.b f5538h;

    public g(fn.b bVar, on.b bVar2) {
        super(bVar, null);
        this.f5536f = bVar2.I();
        this.f5537g = new sn.e[bVar2.O().size()];
        Iterator<URL> it = bVar2.O().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            this.f5537g[i10] = new sn.e(bVar2, it.next());
            c().getConfiguration().r().b(this.f5537g[i10]);
            i10++;
        }
        this.f5538h = bVar2.A();
        bVar2.P();
    }

    @Override // zn.g
    public org.fourthline.cling.model.message.c d() throws RouterException {
        f5535i.fine("Sending event for subscription: " + this.f5536f);
        org.fourthline.cling.model.message.c cVarC = null;
        for (sn.e eVar : this.f5537g) {
            if (this.f5538h.c().longValue() == 0) {
                f5535i.fine("Sending initial event message to callback URL: " + eVar.v());
            } else {
                f5535i.fine("Sending event message '" + this.f5538h + "' to callback URL: " + eVar.v());
            }
            cVarC = c().c().c(eVar);
            f5535i.fine("Received event callback response: " + cVarC);
        }
        return cVarC;
    }
}
