package sn;

import java.util.ArrayList;
import java.util.List;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.NotificationSubtype;
import tn.o;
import tn.p;
import tn.y;
import un.k;

/* JADX INFO: compiled from: IncomingEventRequestMessage.java */
/* JADX INFO: loaded from: classes10.dex */
public class a extends org.fourthline.cling.model.message.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<xn.d> f72008h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k f72009i;

    public List<xn.d> A() {
        return this.f72008h;
    }

    @Override // org.fourthline.cling.model.message.UpnpMessage
    public String toString() {
        return super.toString() + " SEQUENCE: " + y().c();
    }

    public k z() {
        return this.f72009i;
    }

    public a(org.fourthline.cling.model.message.b bVar, k kVar) {
        super(bVar);
        this.f72008h = new ArrayList();
        this.f72009i = kVar;
    }

    public String B() {
        y yVar = (y) j().s(UpnpHeader.Type.SID, y.class);
        if (yVar != null) {
            return yVar.b();
        }
        return null;
    }

    public boolean C() {
        o oVar = (o) j().s(UpnpHeader.Type.NT, o.class);
        p pVar = (p) j().s(UpnpHeader.Type.NTS, p.class);
        if (oVar != null && oVar.b() != null && pVar != null && pVar.b().equals(NotificationSubtype.PROPCHANGE)) {
            return true;
        }
        return false;
    }

    public org.fourthline.cling.model.types.b y() {
        tn.h hVar = (tn.h) j().s(UpnpHeader.Type.SEQ, tn.h.class);
        if (hVar != null) {
            return hVar.b();
        }
        return null;
    }
}
