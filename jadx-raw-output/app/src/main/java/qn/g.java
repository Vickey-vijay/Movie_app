package qn;

import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.message.header.UpnpHeader;
import tn.u;

/* JADX INFO: compiled from: OutgoingActionResponseMessage.java */
/* JADX INFO: loaded from: classes3.dex */
public class g extends org.fourthline.cling.model.message.c implements c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f66634g;

    public g(org.fourthline.cling.model.meta.a aVar) {
        this(UpnpResponse.Status.OK, aVar);
    }

    public g(UpnpResponse.Status status) {
        this(status, null);
    }

    @Override // qn.a
    public String a() {
        return this.f66634g;
    }

    public g(UpnpResponse.Status status, org.fourthline.cling.model.meta.a aVar) {
        super(new UpnpResponse(status));
        if (aVar != null) {
            if (aVar instanceof org.fourthline.cling.model.meta.b) {
                this.f66634g = "urn:schemas-upnp-org:control-1-0";
            } else {
                this.f66634g = aVar.g().g().toString();
            }
        }
        u();
    }

    public void u() {
        j().n(UpnpHeader.Type.CONTENT_TYPE, new tn.d(tn.d.f72468d));
        j().n(UpnpHeader.Type.SERVER, new u());
        j().n(UpnpHeader.Type.EXT, new tn.g());
    }
}
