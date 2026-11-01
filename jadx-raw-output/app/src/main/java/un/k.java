package un;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import org.fourthline.cling.model.ValidationException;
import yn.r;
import yn.s;

/* JADX INFO: compiled from: RemoteService.java */
/* JADX INFO: loaded from: classes11.dex */
public class k extends l<i, k> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final URI f72964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final URI f72965h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final URI f72966i;

    public URI n() {
        return this.f72965h;
    }

    public URI o() {
        return this.f72964g;
    }

    public URI p() {
        return this.f72966i;
    }

    public List<mn.k> q() {
        ArrayList arrayList = new ArrayList();
        if (o() == null) {
            arrayList.add(new mn.k(getClass(), "descriptorURI", "Descriptor location (SCPDURL) is required"));
        }
        if (n() == null) {
            arrayList.add(new mn.k(getClass(), "controlURI", "Control URL is required"));
        }
        if (p() == null) {
            arrayList.add(new mn.k(getClass(), "eventSubscriptionURI", "Event subscription URL is required"));
        }
        return arrayList;
    }

    @Override // un.l
    public String toString() {
        return "(" + getClass().getSimpleName() + ") Descriptor: " + o();
    }

    public k(s sVar, r rVar, URI uri, URI uri2, URI uri3, org.fourthline.cling.model.meta.a<k>[] aVarArr, m<k>[] mVarArr) throws ValidationException {
        super(sVar, rVar, aVarArr, mVarArr);
        this.f72964g = uri;
        this.f72965h = uri2;
        this.f72966i = uri3;
        List<mn.k> listQ = q();
        if (listQ.size() <= 0) {
        } else {
            throw new ValidationException("Validation of device graph failed, call getErrors() on exception", listQ);
        }
    }
}
