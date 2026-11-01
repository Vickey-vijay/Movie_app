package w;

import android.os.Handler;
import android.os.Looper;
import ck.p;
import com.ironsource.C3426d4;
import lk.a0;
import nj.b0;

/* JADX INFO: compiled from: DeviceRegistryImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends co.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f73264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v.b f73265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f73266c;

    public d(e eVar) {
        p.j(eVar, "deviceRegistryListener");
        this.f73264a = eVar;
        this.f73265b = v.b.f73000b.a("DeviceRegistry");
        this.f73266c = new Handler(Looper.getMainLooper());
    }

    public static final void n(d dVar, un.a aVar) {
        dVar.f73264a.a(aVar);
    }

    public static final void o(d dVar, un.a aVar) {
        dVar.f73264a.b(aVar);
    }

    @Override // co.a
    public void j(co.c cVar, final un.a<?, ?, ?> aVar) {
        p.j(cVar, "registry");
        p.j(aVar, C3426d4.i.G);
        v.b.f(this.f73265b, "deviceAdded: " + p(aVar), null, 2, null);
        this.f73266c.post(new Runnable() { // from class: w.b
            @Override // java.lang.Runnable
            public final void run() {
                d.n(this.f73260b, aVar);
            }
        });
    }

    @Override // co.a
    public void k(co.c cVar, final un.a<?, ?, ?> aVar) {
        p.j(cVar, "registry");
        p.j(aVar, C3426d4.i.G);
        v.b.i(this.f73265b, "deviceRemoved: " + p(aVar), null, 2, null);
        this.f73266c.post(new Runnable() { // from class: w.c
            @Override // java.lang.Runnable
            public final void run() {
                d.o(this.f73262b, aVar);
            }
        });
    }

    public final String p(un.a<?, ?, ?> aVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        sb2.append(aVar.getType().getType());
        sb2.append("][");
        sb2.append(aVar.m().d());
        sb2.append("][");
        String strA = aVar.r().b().a();
        p.i(strA, "getIdentifierString(...)");
        sb2.append((String) b0.r0(a0.N0(strA, new String[]{"-"}, false, 0, 6, null)));
        sb2.append(']');
        return sb2.toString();
    }
}
