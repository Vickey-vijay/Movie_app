package tn;

import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.message.header.UpnpHeader;

/* JADX INFO: compiled from: ContentTypeHeader.java */
/* JADX INFO: loaded from: classes11.dex */
public class d extends UpnpHeader<so.c> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final so.c f72467c = so.c.f("text/xml");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final so.c f72468d = so.c.f("text/xml;charset=\"utf-8\"");

    public d() {
        e(f72467c);
    }

    public d(so.c cVar) {
        e(cVar);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String a() {
        return b().toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void d(String str) throws InvalidHeaderException {
        e(so.c.f(str));
    }

    public boolean f() {
        if (b() != null && b().getType().equals(f72467c.getType())) {
            return true;
        }
        return false;
    }

    public boolean g() {
        if (f() && b().c().equals(f72467c.c())) {
            return true;
        }
        return false;
    }
}
