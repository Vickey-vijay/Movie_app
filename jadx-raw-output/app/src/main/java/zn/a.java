package zn;

import bo.h;
import bo.i;
import bo.j;
import java.net.URL;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.protocol.ProtocolCreationException;

/* JADX INFO: compiled from: ProtocolFactory.java */
/* JADX INFO: loaded from: classes9.dex */
public interface a {
    bo.f a(nn.d dVar, URL url);

    ao.f b(un.e eVar);

    bo.g c(on.b bVar);

    ao.e d(un.e eVar);

    c e(pn.b bVar) throws ProtocolCreationException;

    ao.g f(UpnpHeader upnpHeader, int i10);

    h g(on.c cVar);

    j h(on.c cVar);

    d i(org.fourthline.cling.model.message.b bVar) throws ProtocolCreationException;

    i j(on.c cVar) throws ProtocolCreationException;
}
