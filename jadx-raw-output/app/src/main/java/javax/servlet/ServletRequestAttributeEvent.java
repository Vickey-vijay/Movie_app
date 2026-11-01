package javax.servlet;

import kj.k;
import kj.p;

/* JADX INFO: loaded from: classes3.dex */
public class ServletRequestAttributeEvent extends ServletRequestEvent {
    private static final long serialVersionUID = -1466635426192317793L;
    private String name;
    private Object value;

    public String getName() {
        return this.name;
    }

    public Object getValue() {
        return this.value;
    }

    public ServletRequestAttributeEvent(k kVar, p pVar, String str, Object obj) {
        super(kVar, pVar);
        this.name = str;
        this.value = obj;
    }
}
