package org.fourthline.cling.model.message;

import org.fourthline.cling.model.message.header.UpnpHeader;
import tn.d;

/* JADX INFO: compiled from: StreamResponseMessage.java */
/* JADX INFO: loaded from: classes11.dex */
public class c extends UpnpMessage<UpnpResponse> {
    public c(c cVar) {
        super(cVar);
    }

    public c(UpnpResponse.Status status) {
        super(new UpnpResponse(status));
    }

    public c(UpnpResponse upnpResponse) {
        super(upnpResponse);
    }

    public c(String str) {
        super(new UpnpResponse(UpnpResponse.Status.OK), UpnpMessage.BodyType.STRING, str);
    }

    public c(byte[] bArr) {
        super(new UpnpResponse(UpnpResponse.Status.OK), UpnpMessage.BodyType.BYTES, bArr);
    }

    public c(String str, d dVar) {
        this(str);
        j().n(UpnpHeader.Type.CONTENT_TYPE, dVar);
    }

    public c(byte[] bArr, d dVar) {
        this(bArr);
        j().n(UpnpHeader.Type.CONTENT_TYPE, dVar);
    }

    public c(byte[] bArr, so.c cVar) {
        this(bArr, new d(cVar));
    }
}
