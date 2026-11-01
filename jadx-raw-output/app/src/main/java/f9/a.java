package f9;

import android.util.Log;
import co.c;
import un.e;
import un.i;

/* JADX INFO: compiled from: BrowseRegistryListener.java */
/* JADX INFO: loaded from: classes9.dex */
public class a extends co.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f52883b = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f52884a;

    @Override // co.a, co.g
    public void e(c cVar, e eVar) {
    }

    @Override // co.a, co.g
    public void g(c cVar, i iVar) {
    }

    @Override // co.a, co.g
    public void h(c cVar, e eVar) {
    }

    @Override // co.a, co.g
    public void i(c cVar, i iVar, Exception exc) {
        Log.e(f52883b, "remoteDeviceDiscoveryFailed device: " + iVar.o());
        m(iVar);
    }

    public final void l(un.a aVar) {
        String str = f52883b;
        Log.e(str, "deviceAdded");
        if (!aVar.getType().equals(g9.a.f53196e)) {
            Log.e(str, "deviceAdded called, but not match");
        } else if (h9.c.a(this.f52884a)) {
            e9.b bVar = new e9.b(aVar);
            e9.c.e().a(bVar);
            this.f52884a.b(bVar);
        }
    }

    public void m(un.a aVar) {
        e9.b bVarC;
        Log.e(f52883b, "deviceRemoved");
        if (!h9.c.a(this.f52884a) || (bVarC = e9.c.e().c(aVar)) == null) {
            return;
        }
        e9.c.e().f(bVarC);
        this.f52884a.a(bVarC);
    }

    @Override // co.a, co.g
    public void a(c cVar, i iVar) {
        l(iVar);
    }

    @Override // co.a, co.g
    public void d(c cVar, i iVar) {
        m(iVar);
    }
}
