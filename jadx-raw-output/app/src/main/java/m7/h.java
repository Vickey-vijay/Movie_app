package m7;

import com.liulishuo.filedownloader.message.MessageSnapshot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: FileDownloadList.java */
/* JADX INFO: loaded from: classes8.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<m7.a.b> f64218a;

    /* JADX INFO: compiled from: FileDownloadList.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f64219a = new h();
    }

    public h() {
        this.f64218a = new ArrayList<>();
    }

    public int c(int i10) {
        int i11;
        synchronized (this.f64218a) {
            Iterator<m7.a.b> it = this.f64218a.iterator();
            i11 = 0;
            while (it.hasNext()) {
                if (it.next().i(i10)) {
                    i11++;
                }
            }
        }
        return i11;
    }

    public void d(List<m7.a.b> list) {
        synchronized (this.f64218a) {
            for (m7.a.b bVar : this.f64218a) {
                if (!list.contains(bVar)) {
                    list.add(bVar);
                }
            }
            this.f64218a.clear();
        }
    }

    public List<m7.a.b> f(int i10) {
        byte status;
        ArrayList arrayList = new ArrayList();
        synchronized (this.f64218a) {
            for (m7.a.b bVar : this.f64218a) {
                if (bVar.i(i10) && !bVar.s() && (status = bVar.getOrigin().getStatus()) != 0 && status != 10) {
                    arrayList.add(bVar);
                }
            }
        }
        return arrayList;
    }

    public boolean g(m7.a.b bVar) {
        return this.f64218a.isEmpty() || !this.f64218a.contains(bVar);
    }

    public int i() {
        return this.f64218a.size();
    }

    public static h e() {
        return b.f64219a;
    }

    public void a(m7.a.b bVar) {
        if (!bVar.getOrigin().w()) {
            bVar.F();
        }
        if (bVar.D().b().k()) {
            b(bVar);
        }
    }

    public void b(m7.a.b bVar) {
        if (bVar.G()) {
            return;
        }
        synchronized (this.f64218a) {
            if (this.f64218a.contains(bVar)) {
                w7.d.i(this, "already has %s", bVar);
            } else {
                bVar.A();
                this.f64218a.add(bVar);
                if (w7.d.f73535a) {
                    w7.d.h(this, "add list in all %s %d %d", bVar, Byte.valueOf(bVar.getOrigin().getStatus()), Integer.valueOf(this.f64218a.size()));
                }
            }
        }
    }

    public boolean h(m7.a.b bVar, MessageSnapshot messageSnapshot) {
        boolean zRemove;
        byte status = messageSnapshot.getStatus();
        synchronized (this.f64218a) {
            zRemove = this.f64218a.remove(bVar);
            if (zRemove && this.f64218a.size() == 0 && n.f().m()) {
                r.c().h(true);
            }
        }
        if (w7.d.f73535a && this.f64218a.size() == 0) {
            w7.d.h(this, "remove %s left %d %d", bVar, Byte.valueOf(status), Integer.valueOf(this.f64218a.size()));
        }
        if (zRemove) {
            u uVarB = bVar.D().b();
            if (status != -4) {
                if (status != -3) {
                    if (status != -2) {
                        if (status == -1) {
                            uVarB.h(messageSnapshot);
                        }
                    } else {
                        uVarB.c(messageSnapshot);
                    }
                } else {
                    uVarB.m(com.liulishuo.filedownloader.message.a.e(messageSnapshot));
                }
            } else {
                uVarB.l(messageSnapshot);
            }
        } else {
            w7.d.b(this, "remove error, not exist: %s %d", bVar, Byte.valueOf(status));
        }
        return zRemove;
    }
}
