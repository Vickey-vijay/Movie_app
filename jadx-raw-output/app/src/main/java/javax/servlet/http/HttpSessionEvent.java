package javax.servlet.http;

import java.util.EventObject;
import lj.e;

/* JADX INFO: loaded from: classes11.dex */
public class HttpSessionEvent extends EventObject {
    private static final long serialVersionUID = -7622791603672342895L;

    public HttpSessionEvent(e eVar) {
        super(eVar);
    }

    public e getSession() {
        return (e) super.getSource();
    }
}
