package x;

import org.fourthline.cling.model.message.UpnpResponse;

/* JADX INFO: compiled from: ServiceExecutor.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class a extends ln.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ln.a f74200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f74201e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ln.a aVar, boolean z10) {
        super(aVar.e());
        ck.p.j(aVar, "actionCallback");
        this.f74200d = aVar;
        this.f74201e = z10;
    }

    @Override // ln.a
    public void d(nn.d<? extends un.l<?, ?>> dVar, UpnpResponse upnpResponse, String str) {
        org.fourthline.cling.model.meta.a<S> aVarA;
        if (this.f74201e) {
            v.b bVar = q.f74239a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append((dVar == null || (aVarA = dVar.a()) == 0) ? null : aVarA.d());
            sb2.append(" [failure] ");
            sb2.append(str);
            v.b.i(bVar, sb2.toString(), null, 2, null);
        }
        this.f74200d.d(dVar, upnpResponse, str);
    }

    @Override // ln.a
    public void h(nn.d<? extends un.l<?, ?>> dVar) {
        Object objH;
        org.fourthline.cling.model.meta.a<S> aVarA;
        if (this.f74201e) {
            v.b bVar = q.f74239a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append((dVar == null || (aVarA = dVar.a()) == 0) ? null : aVarA.d());
            sb2.append(" [success] ");
            sb2.append((dVar == null || (objH = dVar.h()) == null) ? null : objH.toString());
            v.b.f(bVar, sb2.toString(), null, 2, null);
        }
        this.f74200d.h(dVar);
    }
}
