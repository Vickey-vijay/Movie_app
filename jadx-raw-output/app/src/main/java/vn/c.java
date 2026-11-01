package vn;

import java.net.InetAddress;

/* JADX INFO: compiled from: RemoteClientInfo.java */
/* JADX INFO: loaded from: classes11.dex */
public class c extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pn.a f73243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pn.c f73244c;

    public c() {
        this(null);
    }

    public c(org.fourthline.cling.model.message.b bVar) {
        this(bVar != null ? bVar.u() : null, bVar != null ? bVar.j() : new pn.c());
    }

    public pn.a c() {
        return this.f73243b;
    }

    public pn.c d() {
        return this.f73244c;
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ") Remote Address: " + e();
    }

    public InetAddress e() {
        return c().a();
    }

    public c(pn.a aVar, pn.c cVar) {
        super(cVar);
        this.f73244c = new pn.c();
        this.f73243b = aVar;
    }
}
