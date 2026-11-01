package ao;

import java.util.logging.Logger;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.transport.RouterException;
import rn.i;

/* JADX INFO: compiled from: SendingSearch.java */
/* JADX INFO: loaded from: classes10.dex */
public class g extends zn.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f4692f = Logger.getLogger(g.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final UpnpHeader f4693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4694e;

    public int d() {
        return 500;
    }

    public int e() {
        return 5;
    }

    public void g(i iVar) {
    }

    @Override // zn.f
    public void a() throws RouterException {
        f4692f.fine("Executing search for target: " + this.f4693d.a() + " with MX seconds: " + f());
        i iVar = new i(this.f4693d, f());
        g(iVar);
        for (int i10 = 0; i10 < e(); i10++) {
            try {
                c().c().b(iVar);
                f4692f.finer("Sleeping " + d() + " milliseconds");
                Thread.sleep((long) d());
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    public int f() {
        return this.f4694e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(fn.b bVar, UpnpHeader upnpHeader, int i10) {
        super(bVar);
        if (UpnpHeader.Type.ST.isValidHeaderType(upnpHeader.getClass())) {
            this.f4693d = upnpHeader;
            this.f4694e = i10;
        } else {
            throw new IllegalArgumentException("Given search target instance is not a valid header class for type ST: " + upnpHeader.getClass());
        }
    }
}
