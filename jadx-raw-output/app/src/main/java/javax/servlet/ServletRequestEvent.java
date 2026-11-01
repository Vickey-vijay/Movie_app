package javax.servlet;

import java.util.EventObject;
import kj.k;
import kj.p;

/* JADX INFO: loaded from: classes2.dex */
public class ServletRequestEvent extends EventObject {
    private static final long serialVersionUID = -7467864054698729101L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient p f61729b;

    public p getServletRequest() {
        return this.f61729b;
    }

    public ServletRequestEvent(k kVar, p pVar) {
        super(kVar);
        this.f61729b = pVar;
    }

    public k getServletContext() {
        return (k) super.getSource();
    }
}
