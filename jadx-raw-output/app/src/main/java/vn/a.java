package vn;

import org.fourthline.cling.model.message.header.UpnpHeader;

/* JADX INFO: compiled from: ClientInfo.java */
/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pn.c f73242a;

    public pn.c a() {
        return this.f73242a;
    }

    public a(pn.c cVar) {
        this.f73242a = cVar;
    }

    public String b() {
        return a().t(UpnpHeader.Type.USER_AGENT);
    }
}
