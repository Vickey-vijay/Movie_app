package eo;

import java.util.logging.Logger;
import nn.d;
import un.l;

/* JADX INFO: compiled from: Stop.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c extends ln.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Logger f52729d = Logger.getLogger(c.class.getName());

    public c(l lVar) {
        this(new org.fourthline.cling.model.types.b(0L), lVar);
    }

    public c(org.fourthline.cling.model.types.b bVar, l lVar) {
        super(new d(lVar.a("Stop")));
        e().j("InstanceID", bVar);
    }

    @Override // ln.a
    public void h(d dVar) {
        f52729d.fine("Execution successful");
    }
}
