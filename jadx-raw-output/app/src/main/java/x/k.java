package x;

import java.util.List;
import lk.a0;
import nj.b0;
import org.fourthline.cling.model.gena.CancelReason;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.support.lastchange.LastChangeParser;

/* JADX INFO: compiled from: CastSubscriptionCallback.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class k extends ln.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LastChangeParser f74234g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f74235h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v.b f74236i;

    public /* synthetic */ k(un.l lVar, int i10, LastChangeParser lastChangeParser, r rVar, int i11, ck.i iVar) {
        this(lVar, (i11 & 2) != 0 ? 1800 : i10, lastChangeParser, rVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(un.l<?, ?> lVar, int i10, LastChangeParser lastChangeParser, r rVar) {
        super(lVar, i10);
        ck.p.j(lastChangeParser, "lastChangeParser");
        ck.p.j(rVar, "callback");
        this.f74234g = lastChangeParser;
        this.f74235h = rVar;
        this.f74236i = v.b.f73000b.a("SubscriptionCallback");
    }

    public static final void u(k kVar, on.a aVar) {
        kVar.f74235h.c(aVar.I());
    }

    public static final void v(k kVar, on.a aVar) {
        kVar.f74235h.b(aVar.I());
    }

    public static final void w(k kVar, on.a aVar, ho.b bVar) {
        r rVar = kVar.f74235h;
        String strI = aVar.I();
        ck.p.g(bVar);
        rVar.d(strI, bVar);
    }

    public static final void x(k kVar, on.a aVar) {
        kVar.f74235h.a(aVar.I());
    }

    public final String y(on.a<?> aVar) {
        List listN0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        sb2.append(aVar.H().g().getType());
        sb2.append("](");
        String strI = aVar.I();
        sb2.append((strI == null || (listN0 = a0.N0(strI, new String[]{"-"}, false, 0, 6, null)) == null) ? null : (String) b0.r0(listN0));
        sb2.append(')');
        return sb2.toString();
    }

    @Override // ln.d
    public void c(final on.a<?> aVar, CancelReason cancelReason, UpnpResponse upnpResponse) {
        ck.p.j(aVar, "subscription");
        v.b.i(this.f74236i, y(aVar) + " ended: " + cancelReason + ", " + upnpResponse, null, 2, null);
        s.a(new Runnable() { // from class: x.h
            @Override // java.lang.Runnable
            public final void run() {
                k.u(this.f74228b, aVar);
            }
        });
    }

    @Override // ln.d
    public void f(final on.a<?> aVar) {
        ck.p.j(aVar, "subscription");
        v.b.f(this.f74236i, y(aVar) + " established", null, 2, null);
        s.a(new Runnable() { // from class: x.j
            @Override // java.lang.Runnable
            public final void run() {
                k.v(this.f74232b, aVar);
            }
        });
    }

    @Override // ln.d
    public void g(final on.a<?> aVar) {
        String string;
        boolean z10;
        List<ho.b> listB;
        List<ho.j> listA;
        ho.j jVar;
        Object objB;
        ck.p.j(aVar, "subscription");
        xn.d dVar = (xn.d) aVar.E().get("LastChange");
        if (dVar != null && (objB = dVar.b()) != null) {
            string = objB.toString();
        } else {
            string = null;
        }
        if (string != null && !a0.n0(string)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return;
        }
        v.b.f(this.f74236i, y(aVar) + " eventReceived: " + aVar.E().keySet(), null, 2, null);
        try {
            ho.a aVarP = this.f74234g.p(string);
            if (aVarP != null && (listA = aVarP.a()) != null && (jVar = (ho.j) b0.h0(listA)) != null) {
                listB = jVar.b();
            } else {
                listB = null;
            }
            if (listB != null) {
                for (final ho.b bVar : listB) {
                    v.b.f(this.f74236i, "    value: [" + bVar.getClass().getSimpleName() + "] " + bVar, null, 2, null);
                    s.a(new Runnable() { // from class: x.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            k.w(this.f74225b, aVar, bVar);
                        }
                    });
                }
            }
        } catch (Exception e10) {
            v.b.i(this.f74236i, y(aVar) + " currentValues: " + aVar.E(), null, 2, null);
            e10.printStackTrace();
        }
    }

    @Override // ln.d
    public void h(on.a<?> aVar, int i10) {
        ck.p.j(aVar, "subscription");
        v.b.i(this.f74236i, y(aVar) + " eventsMissed: " + i10, null, 2, null);
    }

    @Override // ln.d
    public void j(final on.a<?> aVar, UpnpResponse upnpResponse, Exception exc, String str) {
        ck.p.j(aVar, "subscription");
        v.b.c(this.f74236i, y(aVar) + " failed:" + upnpResponse + ", " + exc + ", " + str, null, 2, null);
        s.a(new Runnable() { // from class: x.i
            @Override // java.lang.Runnable
            public final void run() {
                k.x(this.f74230b, aVar);
            }
        });
    }
}
