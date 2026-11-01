package po;

import java.util.logging.Logger;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.protocol.ProtocolCreationException;

/* JADX INFO: compiled from: UpnpStream.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class m implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Logger f66247d = Logger.getLogger(m.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zn.a f66248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zn.d f66249c;

    public org.fourthline.cling.model.message.c G(org.fourthline.cling.model.message.b bVar) {
        f66247d.fine("Processing stream request message: " + bVar);
        try {
            this.f66249c = h().i(bVar);
            f66247d.fine("Running protocol for synchronous message processing: " + this.f66249c);
            this.f66249c.run();
            org.fourthline.cling.model.message.c cVarG = this.f66249c.g();
            if (cVarG == null) {
                f66247d.finer("Protocol did not return any response message");
                return null;
            }
            f66247d.finer("Protocol returned response: " + cVarG);
            return cVarG;
        } catch (ProtocolCreationException e10) {
            f66247d.warning("Processing stream request failed - " + so.a.a(e10).toString());
            return new org.fourthline.cling.model.message.c(UpnpResponse.Status.NOT_IMPLEMENTED);
        }
    }

    public void H(Throwable th2) {
        zn.d dVar = this.f66249c;
        if (dVar != null) {
            dVar.i(th2);
        }
    }

    public void I(org.fourthline.cling.model.message.c cVar) {
        zn.d dVar = this.f66249c;
        if (dVar != null) {
            dVar.j(cVar);
        }
    }

    public zn.a h() {
        return this.f66248b;
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ")";
    }

    public m(zn.a aVar) {
        this.f66248b = aVar;
    }
}
