package sn;

import java.net.URL;
import java.util.List;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.header.UpnpHeader;
import tn.o;
import tn.z;

/* JADX INFO: compiled from: OutgoingSubscribeRequestMessage.java */
/* JADX INFO: loaded from: classes10.dex */
public class h extends org.fourthline.cling.model.message.b {
    public h(on.c cVar, List<URL> list, pn.c cVar2) {
        super(UpnpRequest.Method.SUBSCRIBE, cVar.S());
        j().n(UpnpHeader.Type.CALLBACK, new tn.b(list));
        j().n(UpnpHeader.Type.NT, new o());
        j().n(UpnpHeader.Type.TIMEOUT, new z(cVar.G()));
        if (cVar2 != null) {
            j().putAll(cVar2);
        }
    }

    public boolean y() {
        if (((tn.b) j().s(UpnpHeader.Type.CALLBACK, tn.b.class)).b().size() > 0) {
            return true;
        }
        return false;
    }
}
