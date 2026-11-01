package qn;

import org.fourthline.cling.model.message.UpnpResponse;

/* JADX INFO: compiled from: IncomingActionResponseMessage.java */
/* JADX INFO: loaded from: classes3.dex */
public class e extends org.fourthline.cling.model.message.c implements c {
    public e(org.fourthline.cling.model.message.c cVar) {
        super(cVar);
    }

    @Override // qn.a
    public String a() {
        return null;
    }

    public e(UpnpResponse upnpResponse) {
        super(upnpResponse);
    }

    public boolean u() {
        int iD = k().d();
        if (k().f() && iD != UpnpResponse.Status.METHOD_NOT_SUPPORTED.getStatusCode() && (iD != UpnpResponse.Status.INTERNAL_SERVER_ERROR.getStatusCode() || !n())) {
            return true;
        }
        return false;
    }

    public boolean v() {
        if (n() && k().d() == UpnpResponse.Status.INTERNAL_SERVER_ERROR.getStatusCode()) {
            return true;
        }
        return false;
    }
}
