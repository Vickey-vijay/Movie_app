package m7;

import com.liulishuo.filedownloader.event.DownloadServiceConnectChangedEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: LostServiceConnectedHandler.java */
/* JADX INFO: loaded from: classes2.dex */
public class a0 extends e implements w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<a.b> f64166b = new ArrayList<>();

    @Override // m7.w
    public boolean b(a.b bVar) {
        return !this.f64166b.isEmpty() && this.f64166b.contains(bVar);
    }

    @Override // m7.w
    public void c(a.b bVar) {
        if (this.f64166b.isEmpty()) {
            return;
        }
        synchronized (this.f64166b) {
            this.f64166b.remove(bVar);
        }
    }

    @Override // m7.w
    public boolean a(a.b bVar) {
        if (!r.c().f()) {
            synchronized (this.f64166b) {
                if (!r.c().f()) {
                    if (w7.d.f73535a) {
                        w7.d.a(this, "Waiting for connecting with the downloader service... %d", Integer.valueOf(bVar.getOrigin().getId()));
                    }
                    n.f().o(w7.c.a());
                    if (!this.f64166b.contains(bVar)) {
                        bVar.free();
                        this.f64166b.add(bVar);
                    }
                    return true;
                }
            }
        }
        c(bVar);
        return false;
    }

    @Override // m7.e
    public void e() {
        x xVarE = r.c().e();
        if (w7.d.f73535a) {
            w7.d.a(this, "The downloader service is connected.", new Object[0]);
        }
        synchronized (this.f64166b) {
            List<a.b> list = (List) this.f64166b.clone();
            this.f64166b.clear();
            ArrayList arrayList = new ArrayList(xVarE.b());
            for (a.b bVar : list) {
                int iE = bVar.e();
                if (xVarE.a(iE)) {
                    bVar.getOrigin().f().a();
                    if (!arrayList.contains(Integer.valueOf(iE))) {
                        arrayList.add(Integer.valueOf(iE));
                    }
                } else {
                    bVar.o();
                }
            }
            xVarE.d(arrayList);
        }
    }

    @Override // m7.e
    public void f() {
        if (g() == DownloadServiceConnectChangedEvent.ConnectStatus.lost) {
            x xVarE = r.c().e();
            if (w7.d.f73535a) {
                w7.d.a(this, "lost the connection to the file download service, and current active task size is %d", Integer.valueOf(h.e().i()));
            }
            if (h.e().i() > 0) {
                synchronized (this.f64166b) {
                    h.e().d(this.f64166b);
                    Iterator<a.b> it = this.f64166b.iterator();
                    while (it.hasNext()) {
                        it.next().free();
                    }
                    xVarE.c();
                }
                try {
                    r.c().bindService();
                    return;
                } catch (IllegalStateException unused) {
                    w7.d.i(this, "restart service failed, you may need to restart downloading manually when the app comes back to foreground", new Object[0]);
                    return;
                }
            }
            return;
        }
        if (h.e().i() > 0) {
            w7.d.i(this, "file download service has be unbound but the size of active tasks are not empty %d ", Integer.valueOf(h.e().i()));
        }
    }
}
