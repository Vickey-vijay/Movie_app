package org.fourthline.cling.model.message;

import java.net.URI;
import java.net.URL;

/* JADX INFO: compiled from: StreamRequestMessage.java */
/* JADX INFO: loaded from: classes11.dex */
public class b extends UpnpMessage<UpnpRequest> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public pn.a f65774g;

    public b(b bVar) {
        super(bVar);
        this.f65774g = bVar.u();
    }

    public pn.a u() {
        return this.f65774g;
    }

    public void w(pn.a aVar) {
        this.f65774g = aVar;
    }

    public b(UpnpRequest upnpRequest) {
        super(upnpRequest);
    }

    public URI v() {
        return k().e();
    }

    public void x(URI uri) {
        k().f(uri);
    }

    public b(UpnpRequest.Method method, URI uri) {
        super(new UpnpRequest(method, uri));
    }

    public b(UpnpRequest.Method method, URL url) {
        super(new UpnpRequest(method, url));
    }
}
