package sn;

import java.net.URL;
import java.util.Collection;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.NotificationSubtype;
import tn.o;
import tn.p;
import tn.y;

/* JADX INFO: compiled from: OutgoingEventRequestMessage.java */
/* JADX INFO: loaded from: classes10.dex */
public class e extends org.fourthline.cling.model.message.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Collection<xn.d> f72012h;

    public e(on.a aVar, URL url, org.fourthline.cling.model.types.b bVar, Collection<xn.d> collection) {
        super(new UpnpRequest(UpnpRequest.Method.NOTIFY, url));
        j().n(UpnpHeader.Type.CONTENT_TYPE, new tn.d());
        j().n(UpnpHeader.Type.NT, new o());
        j().n(UpnpHeader.Type.NTS, new p(NotificationSubtype.PROPCHANGE));
        j().n(UpnpHeader.Type.SID, new y(aVar.I()));
        j().n(UpnpHeader.Type.SEQ, new tn.h(bVar.c().longValue()));
        this.f72012h = collection;
    }

    public Collection<xn.d> y() {
        return this.f72012h;
    }

    public e(on.a aVar, URL url) {
        this(aVar, url, aVar.A(), aVar.E().values());
    }
}
