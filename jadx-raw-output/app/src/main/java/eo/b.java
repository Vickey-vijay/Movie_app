package eo;

import java.util.logging.Logger;
import nn.d;
import un.l;

/* JADX INFO: compiled from: SetAVTransportURI.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b extends ln.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Logger f52728d = Logger.getLogger(b.class.getName());

    public b(l lVar, String str, String str2) {
        this(new org.fourthline.cling.model.types.b(0L), lVar, str, str2);
    }

    public b(org.fourthline.cling.model.types.b bVar, l lVar, String str, String str2) {
        super(new d(lVar.a("SetAVTransportURI")));
        f52728d.fine("Creating SetAVTransportURI action for URI: " + str);
        e().j("InstanceID", bVar);
        e().j("CurrentURI", str);
        e().j("CurrentURIMetaData", str2);
    }

    @Override // ln.a
    public void h(d dVar) {
        f52728d.fine("Execution successful");
    }
}
