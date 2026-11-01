package sn;

import org.fourthline.cling.model.message.header.UpnpHeader;
import tn.o;
import tn.y;

/* JADX INFO: compiled from: IncomingUnsubscribeRequestMessage.java */
/* JADX INFO: loaded from: classes10.dex */
public class d extends org.fourthline.cling.model.message.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final un.f f72011h;

    public d(org.fourthline.cling.model.message.b bVar, un.f fVar) {
        super(bVar);
        this.f72011h = fVar;
    }

    public boolean A() {
        if (j().s(UpnpHeader.Type.NT, o.class) != null) {
            return true;
        }
        return false;
    }

    public String y() {
        y yVar = (y) j().s(UpnpHeader.Type.SID, y.class);
        if (yVar != null) {
            return yVar.b();
        }
        return null;
    }

    public boolean z() {
        if (j().s(UpnpHeader.Type.CALLBACK, tn.b.class) != null) {
            return true;
        }
        return false;
    }
}
