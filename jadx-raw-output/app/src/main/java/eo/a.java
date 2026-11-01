package eo;

import java.util.logging.Logger;
import nn.d;
import un.l;

/* JADX INFO: compiled from: Play.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a extends ln.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Logger f52727d = Logger.getLogger(a.class.getName());

    public a(l lVar, String str) {
        this(new org.fourthline.cling.model.types.b(0L), lVar, str);
    }

    public a(org.fourthline.cling.model.types.b bVar, l lVar, String str) {
        super(new d(lVar.a("Play")));
        e().j("InstanceID", bVar);
        e().j("Speed", str);
    }

    @Override // ln.a
    public void h(d dVar) {
        f52727d.fine("Execution successful");
    }
}
