package javax.servlet.http;

import lj.e;

/* JADX INFO: loaded from: classes2.dex */
public class HttpSessionBindingEvent extends HttpSessionEvent {
    private static final long serialVersionUID = 7308000419984825907L;
    private String name;
    private Object value;

    public HttpSessionBindingEvent(e eVar, String str) {
        super(eVar);
        this.name = str;
    }

    public String getName() {
        return this.name;
    }

    public Object getValue() {
        return this.value;
    }

    public HttpSessionBindingEvent(e eVar, String str, Object obj) {
        super(eVar);
        this.name = str;
        this.value = obj;
    }

    @Override // javax.servlet.http.HttpSessionEvent
    public e getSession() {
        return super.getSession();
    }
}
