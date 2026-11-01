package m7;

import com.liulishuo.filedownloader.message.MessageSnapshot;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import java.io.File;
import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.ArrayList;

/* JADX INFO: compiled from: DownloadTaskHunter.java */
/* JADX INFO: loaded from: classes8.dex */
public class d implements y, y.b, y.a, m7.a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u f64201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f64202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f64203c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f64206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s f64207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f64208h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f64209i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f64210j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f64211k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f64212l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f64213m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile byte f64204d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Throwable f64205e = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f64214n = false;

    /* JADX INFO: compiled from: DownloadTaskHunter.java */
    public interface a {
        FileDownloadHeader b();

        m7.a.b h();

        ArrayList<m7.a.InterfaceC0584a> q();

        void v(String str);
    }

    @Override // m7.y.a
    public MessageSnapshot e(Throwable th2) {
        this.f64204d = (byte) -1;
        this.f64205e = th2;
        return com.liulishuo.filedownloader.message.a.b(o(), j(), th2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void update(MessageSnapshot messageSnapshot) {
        m7.a origin = this.f64203c.h().getOrigin();
        byte status = messageSnapshot.getStatus();
        this.f64204d = status;
        this.f64211k = messageSnapshot.n();
        if (status == -4) {
            this.f64206f.reset();
            int iC = h.e().c(origin.getId());
            if (iC + ((iC > 1 || !origin.z()) ? 0 : h.e().c(w7.f.r(origin.getUrl(), origin.C()))) <= 1) {
                byte bC = n.f().c(origin.getId());
                w7.d.i(this, "warn, but no mListener to receive, switch to pending %d %d", Integer.valueOf(origin.getId()), Integer.valueOf(bC));
                if (t7.b.a(bC)) {
                    this.f64204d = (byte) 1;
                    this.f64209i = messageSnapshot.i();
                    long jH = messageSnapshot.h();
                    this.f64208h = jH;
                    this.f64206f.b(jH);
                    this.f64201a.a(((MessageSnapshot.b) messageSnapshot).c());
                    return;
                }
            }
            h.e().h(this.f64203c.h(), messageSnapshot);
            return;
        }
        if (status == -3) {
            this.f64214n = messageSnapshot.p();
            this.f64208h = messageSnapshot.i();
            this.f64209i = messageSnapshot.i();
            h.e().h(this.f64203c.h(), messageSnapshot);
            return;
        }
        if (status == -1) {
            this.f64205e = messageSnapshot.m();
            this.f64208h = messageSnapshot.h();
            h.e().h(this.f64203c.h(), messageSnapshot);
            return;
        }
        if (status == 1) {
            this.f64208h = messageSnapshot.h();
            this.f64209i = messageSnapshot.i();
            this.f64201a.a(messageSnapshot);
            return;
        }
        if (status == 2) {
            this.f64209i = messageSnapshot.i();
            this.f64212l = messageSnapshot.o();
            this.f64213m = messageSnapshot.e();
            String strF = messageSnapshot.f();
            if (strF != null) {
                if (origin.n() != null) {
                    w7.d.i(this, "already has mFilename[%s], but assign mFilename[%s] again", origin.n(), strF);
                }
                this.f64203c.v(strF);
            }
            this.f64206f.b(this.f64208h);
            this.f64201a.j(messageSnapshot);
            return;
        }
        if (status == 3) {
            this.f64208h = messageSnapshot.h();
            this.f64206f.update(messageSnapshot.h());
            this.f64201a.d(messageSnapshot);
        } else if (status != 5) {
            if (status != 6) {
                return;
            }
            this.f64201a.b(messageSnapshot);
        } else {
            this.f64208h = messageSnapshot.h();
            this.f64205e = messageSnapshot.m();
            this.f64210j = messageSnapshot.j();
            this.f64206f.reset();
            this.f64201a.i(messageSnapshot);
        }
    }

    @Override // m7.y
    public Throwable a() {
        return this.f64205e;
    }

    @Override // m7.y.a
    public u b() {
        return this.f64201a;
    }

    @Override // m7.s
    public void c(int i10) {
        this.f64207g.c(i10);
    }

    @Override // m7.y
    public int d() {
        return this.f64210j;
    }

    @Override // m7.y
    public void f() {
        boolean z10;
        synchronized (this.f64202b) {
            if (this.f64204d != 0) {
                w7.d.i(this, "High concurrent cause, this task %d will not input to launch pool, because of the status isn't idle : %d", Integer.valueOf(o()), Byte.valueOf(this.f64204d));
                return;
            }
            this.f64204d = (byte) 10;
            m7.a.b bVarH = this.f64203c.h();
            m7.a origin = bVarH.getOrigin();
            if (l.b()) {
                l.a().b(origin);
            }
            if (w7.d.f73535a) {
                w7.d.h(this, "call start Url[%s], Path[%s] Listener[%s], Tag[%s]", origin.getUrl(), origin.getPath(), origin.getListener(), origin.getTag());
            }
            try {
                p();
                z10 = true;
            } catch (Throwable th2) {
                h.e().a(bVarH);
                h.e().h(bVarH, e(th2));
                z10 = false;
            }
            if (z10) {
                q.a().b(this);
            }
            if (w7.d.f73535a) {
                w7.d.h(this, "the task[%d] has been into the launch pool.", Integer.valueOf(o()));
            }
        }
    }

    @Override // m7.y
    public void free() {
        if (w7.d.f73535a) {
            w7.d.a(this, "free the task %d, when the status is %d", Integer.valueOf(o()), Byte.valueOf(this.f64204d));
        }
        this.f64204d = (byte) 0;
    }

    @Override // m7.y
    public byte getStatus() {
        return this.f64204d;
    }

    @Override // m7.a.d
    public void h() {
        m7.a origin = this.f64203c.h().getOrigin();
        if (l.b()) {
            l.a().a(origin);
        }
        if (w7.d.f73535a) {
            w7.d.h(this, "filedownloader:lifecycle:over %s by %d ", toString(), Byte.valueOf(getStatus()));
        }
        this.f64206f.e(this.f64208h);
        if (this.f64203c.q() != null) {
            ArrayList arrayList = (ArrayList) this.f64203c.q().clone();
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((m7.a.InterfaceC0584a) arrayList.get(i10)).a(origin);
            }
        }
        r.c().d().c(this.f64203c.h());
    }

    @Override // m7.y
    public long j() {
        return this.f64208h;
    }

    @Override // m7.y.a
    public boolean l(MessageSnapshot messageSnapshot) {
        if (!this.f64203c.h().getOrigin().z() || messageSnapshot.getStatus() != -4 || getStatus() != 2) {
            return false;
        }
        update(messageSnapshot);
        return true;
    }

    @Override // m7.y
    public long m() {
        return this.f64209i;
    }

    @Override // m7.y.a
    public boolean n(MessageSnapshot messageSnapshot) {
        if (!t7.b.d(this.f64203c.h().getOrigin())) {
            return false;
        }
        update(messageSnapshot);
        return true;
    }

    public final int o() {
        return this.f64203c.h().getOrigin().getId();
    }

    public final void p() throws IOException {
        File file;
        m7.a origin = this.f64203c.h().getOrigin();
        if (origin.getPath() == null) {
            origin.B(w7.f.v(origin.getUrl()));
            if (w7.d.f73535a) {
                w7.d.a(this, "save Path is null to %s", origin.getPath());
            }
        }
        if (origin.z()) {
            file = new File(origin.getPath());
        } else {
            String strA = w7.f.A(origin.getPath());
            if (strA == null) {
                throw new InvalidParameterException(w7.f.o("the provided mPath[%s] is invalid, can't find its directory", origin.getPath()));
            }
            file = new File(strA);
        }
        if (!file.exists() && !file.mkdirs() && !file.exists()) {
            throw new IOException(w7.f.o("Create parent directory failed, please make sure you have permission to create file or directory on the path: %s", file.getAbsolutePath()));
        }
    }

    @Override // m7.y.b
    public void start() {
        if (this.f64204d != 10) {
            w7.d.i(this, "High concurrent cause, this task %d will not start, because the of status isn't toLaunchPool: %d", Integer.valueOf(o()), Byte.valueOf(this.f64204d));
            return;
        }
        m7.a.b bVarH = this.f64203c.h();
        m7.a origin = bVarH.getOrigin();
        w wVarD = r.c().d();
        try {
            if (wVarD.a(bVarH)) {
                return;
            }
            synchronized (this.f64202b) {
                if (this.f64204d != 10) {
                    w7.d.i(this, "High concurrent cause, this task %d will not start, the status can't assign to toFileDownloadService, because the status isn't toLaunchPool: %d", Integer.valueOf(o()), Byte.valueOf(this.f64204d));
                    return;
                }
                this.f64204d = (byte) 11;
                h.e().a(bVarH);
                if (w7.c.d(origin.getId(), origin.C(), origin.H(), true)) {
                    return;
                }
                boolean zD = n.f().d(origin.getUrl(), origin.getPath(), origin.z(), origin.l(), origin.g(), origin.j(), origin.H(), this.f64203c.b(), origin.x());
                if (this.f64204d == -2) {
                    w7.d.i(this, "High concurrent cause, this task %d will be paused,because of the status is paused, so the pause action must be applied", Integer.valueOf(o()));
                    if (zD) {
                        n.f().a(o());
                        return;
                    }
                    return;
                }
                if (zD) {
                    wVarD.c(bVarH);
                    return;
                }
                if (wVarD.a(bVarH)) {
                    return;
                }
                MessageSnapshot messageSnapshotE = e(new RuntimeException("Occur Unknown Error, when request to start maybe some problem in binder, maybe the process was killed in unexpected."));
                if (h.e().g(bVarH)) {
                    wVarD.c(bVarH);
                    h.e().a(bVarH);
                }
                h.e().h(bVarH, messageSnapshotE);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
            h.e().h(bVarH, e(th2));
        }
    }

    public d(a aVar, Object obj) {
        this.f64202b = obj;
        this.f64203c = aVar;
        b bVar = new b();
        this.f64206f = bVar;
        this.f64207g = bVar;
        this.f64201a = new k(aVar.h(), this);
    }

    @Override // m7.a.d
    public void g() {
        if (l.b() && getStatus() == 6) {
            l.a().c(this.f64203c.h().getOrigin());
        }
    }

    @Override // m7.y.a
    public boolean i(MessageSnapshot messageSnapshot) {
        if (!t7.b.b(getStatus(), messageSnapshot.getStatus())) {
            if (w7.d.f73535a) {
                w7.d.a(this, "can't update mStatus change by keep ahead, %d, but the current mStatus is %d, %d", Byte.valueOf(this.f64204d), Byte.valueOf(getStatus()), Integer.valueOf(o()));
            }
            return false;
        }
        update(messageSnapshot);
        return true;
    }

    @Override // m7.y.a
    public boolean k(MessageSnapshot messageSnapshot) {
        byte status = getStatus();
        byte status2 = messageSnapshot.getStatus();
        if (-2 == status && t7.b.a(status2)) {
            if (w7.d.f73535a) {
                w7.d.a(this, "High concurrent cause, callback pending, but has already be paused %d", Integer.valueOf(o()));
            }
            return true;
        }
        if (!t7.b.c(status, status2)) {
            if (w7.d.f73535a) {
                w7.d.a(this, "can't update mStatus change by keep flow, %d, but the current mStatus is %d, %d", Byte.valueOf(this.f64204d), Byte.valueOf(getStatus()), Integer.valueOf(o()));
            }
            return false;
        }
        update(messageSnapshot);
        return true;
    }

    @Override // m7.a.d
    public void onBegin() {
        if (l.b()) {
            l.a().d(this.f64203c.h().getOrigin());
        }
        if (w7.d.f73535a) {
            w7.d.h(this, "filedownloader:lifecycle:start %s by %d ", toString(), Byte.valueOf(getStatus()));
        }
    }
}
