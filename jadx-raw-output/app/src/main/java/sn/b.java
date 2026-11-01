package sn;

import java.net.URL;
import java.util.List;
import org.fourthline.cling.model.message.header.UpnpHeader;
import tn.o;
import tn.y;
import tn.z;

/* JADX INFO: compiled from: IncomingSubscribeRequestMessage.java */
/* JADX INFO: loaded from: classes10.dex */
public class b extends org.fourthline.cling.model.message.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final un.f f72010h;

    public b(org.fourthline.cling.model.message.b bVar, un.f fVar) {
        super(bVar);
        this.f72010h = fVar;
    }

    public String A() {
        y yVar = (y) j().s(UpnpHeader.Type.SID, y.class);
        if (yVar != null) {
            return yVar.b();
        }
        return null;
    }

    public boolean B() {
        if (j().s(UpnpHeader.Type.NT, o.class) != null) {
            return true;
        }
        return false;
    }

    public List<URL> y() {
        tn.b bVar = (tn.b) j().s(UpnpHeader.Type.CALLBACK, tn.b.class);
        if (bVar != null) {
            return bVar.b();
        }
        return null;
    }

    public Integer z() {
        z zVar = (z) j().s(UpnpHeader.Type.TIMEOUT, z.class);
        if (zVar != null) {
            return zVar.b();
        }
        return null;
    }
}
