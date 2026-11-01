package ao;

import java.util.logging.Logger;
import org.fourthline.cling.model.types.NotificationSubtype;
import org.fourthline.cling.transport.RouterException;

/* JADX INFO: compiled from: SendingNotificationByebye.java */
/* JADX INFO: loaded from: classes10.dex */
public class f extends d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f4691f = Logger.getLogger(d.class.getName());

    @Override // ao.d, zn.f
    public void a() throws RouterException {
        f4691f.fine("Sending byebye messages (" + g() + " times) for: " + h());
        super.a();
    }

    @Override // ao.d
    public NotificationSubtype i() {
        return NotificationSubtype.BYEBYE;
    }

    public f(fn.b bVar, un.e eVar) {
        super(bVar, eVar);
    }
}
