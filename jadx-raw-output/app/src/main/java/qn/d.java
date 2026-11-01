package qn;

import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.ErrorCode;
import tn.x;
import yn.u;

/* JADX INFO: compiled from: IncomingActionRequestMessage.java */
/* JADX INFO: loaded from: classes3.dex */
public class d extends org.fourthline.cling.model.message.b implements b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final org.fourthline.cling.model.meta.a f66630h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f66631i;

    @Override // qn.a
    public String a() {
        return this.f66631i;
    }

    public org.fourthline.cling.model.meta.a y() {
        return this.f66630h;
    }

    public d(org.fourthline.cling.model.message.b bVar, un.f fVar) throws ActionException {
        super(bVar);
        x xVar = (x) j().s(UpnpHeader.Type.SOAPACTION, x.class);
        if (xVar != null) {
            u uVarB = xVar.b();
            org.fourthline.cling.model.meta.a<un.f> aVarA = fVar.a(uVarB.a());
            this.f66630h = aVarA;
            if (aVarA != null) {
                if (!"QueryStateVariable".equals(uVarB.a()) && !fVar.g().c(uVarB.c())) {
                    throw new ActionException(ErrorCode.INVALID_ACTION, "Service doesn't support the requested service version");
                }
                this.f66631i = uVarB.d();
                return;
            }
            throw new ActionException(ErrorCode.INVALID_ACTION, "Service doesn't implement action: " + uVarB.a());
        }
        throw new ActionException(ErrorCode.INVALID_ACTION, "Missing SOAP action header");
    }
}
