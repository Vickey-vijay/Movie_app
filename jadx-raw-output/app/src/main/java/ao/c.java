package ao;

import java.util.Iterator;
import java.util.logging.Logger;
import mn.k;
import org.fourthline.cling.model.ValidationException;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.transport.RouterException;
import un.i;
import un.j;
import yn.z;

/* JADX INFO: compiled from: ReceivingSearchResponse.java */
/* JADX INFO: loaded from: classes10.dex */
public class c extends zn.c<rn.c> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f4687e = Logger.getLogger(c.class.getName());

    public c(fn.b bVar, pn.b<UpnpResponse> bVar2) {
        super(bVar, new rn.c(bVar2));
    }

    @Override // zn.c
    public void a() throws RouterException {
        if (!c().B()) {
            f4687e.fine("Ignoring invalid search response message: " + c());
            return;
        }
        z zVarA = c().A();
        if (zVarA == null) {
            f4687e.fine("Ignoring search response message without UDN: " + c());
            return;
        }
        j jVar = new j(c());
        Logger logger = f4687e;
        logger.fine("Received device search response: " + jVar);
        if (d().getRegistry().update(jVar)) {
            logger.fine("Remote device was already known: " + zVarA);
            return;
        }
        try {
            i iVar = new i(jVar);
            if (jVar.d() == null) {
                logger.finer("Ignoring message without location URL header: " + c());
                return;
            }
            if (jVar.a() == null) {
                logger.finer("Ignoring message without max-age header: " + c());
                return;
            }
            d().getConfiguration().f().execute(new zn.e(d(), iVar));
        } catch (ValidationException e10) {
            f4687e.warning("Validation errors of device during discovery: " + jVar);
            Iterator<k> it = e10.getErrors().iterator();
            while (it.hasNext()) {
                f4687e.warning(it.next().toString());
            }
        }
    }
}
