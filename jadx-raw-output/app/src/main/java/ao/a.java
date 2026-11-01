package ao;

import java.util.Iterator;
import java.util.logging.Logger;
import mn.k;
import org.fourthline.cling.model.ValidationException;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.transport.RouterException;
import un.i;
import un.j;
import yn.z;

/* JADX INFO: compiled from: ReceivingNotification.java */
/* JADX INFO: loaded from: classes10.dex */
public class a extends zn.c<rn.a> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f4683e = Logger.getLogger(a.class.getName());

    public a(fn.b bVar, pn.b<UpnpRequest> bVar2) {
        super(bVar, new rn.a(bVar2));
    }

    @Override // zn.c
    public void a() throws RouterException {
        z zVarA = c().A();
        if (zVarA == null) {
            f4683e.fine("Ignoring notification message without UDN: " + c());
            return;
        }
        j jVar = new j(c());
        Logger logger = f4683e;
        logger.fine("Received device notification: " + jVar);
        try {
            i iVar = new i(jVar);
            if (c().B()) {
                logger.fine("Received device ALIVE advertisement, descriptor location is: " + jVar.d());
                if (jVar.d() == null) {
                    logger.finer("Ignoring message without location URL header: " + c());
                    return;
                }
                if (jVar.a() == null) {
                    logger.finer("Ignoring message without max-age header: " + c());
                    return;
                }
                if (d().getRegistry().update(jVar)) {
                    logger.finer("Remote device was already known: " + zVarA);
                    return;
                }
                d().getConfiguration().f().execute(new zn.e(d(), iVar));
                return;
            }
            if (c().C()) {
                logger.fine("Received device BYEBYE advertisement");
                if (d().getRegistry().q(iVar)) {
                    logger.fine("Removed remote device from registry: " + iVar);
                    return;
                }
                return;
            }
            logger.finer("Ignoring unknown notification message: " + c());
        } catch (ValidationException e10) {
            f4683e.warning("Validation errors of device during discovery: " + jVar);
            Iterator<k> it = e10.getErrors().iterator();
            while (it.hasNext()) {
                f4683e.warning(it.next().toString());
            }
        }
    }
}
