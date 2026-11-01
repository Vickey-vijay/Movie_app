package m7;

import android.text.TextUtils;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: compiled from: DownloadTask.java */
/* JADX INFO: loaded from: classes6.dex */
public class c implements m7.a, m7.a.b, d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f64173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y.a f64174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f64175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<m7.a.InterfaceC0584a> f64176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f64177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f64178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f64179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f64180h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public FileDownloadHeader f64181i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i f64182j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f64183k;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f64192t;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f64184l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f64185m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f64186n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f64187o = 100;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f64188p = 10;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f64189q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile int f64190r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f64191s = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f64193u = new Object();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile boolean f64194v = false;

    /* JADX INFO: compiled from: DownloadTask.java */
    public static final class b implements m7.a.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f64195a;

        public b(c cVar) {
            this.f64195a = cVar;
            cVar.f64191s = true;
        }

        @Override // m7.a.c
        public int a() {
            int id2 = this.f64195a.getId();
            if (w7.d.f73535a) {
                w7.d.a(this, "add the task[%d] to the queue", Integer.valueOf(id2));
            }
            h.e().b(this.f64195a);
            return id2;
        }
    }

    @Override // m7.a.b
    public void A() {
        this.f64194v = true;
    }

    @Override // m7.a
    public m7.a B(String str) {
        return M(str, false);
    }

    @Override // m7.a.b
    public m7.a getOrigin() {
        return this;
    }

    @Override // m7.d.a
    public m7.a.b h() {
        return this;
    }

    public String toString() {
        return w7.f.o("%d@%s", Integer.valueOf(getId()), super.toString());
    }

    @Override // m7.a.b
    public y.a D() {
        return this.f64174b;
    }

    @Override // m7.a
    public m7.a E(i iVar) {
        this.f64182j = iVar;
        if (w7.d.f73535a) {
            w7.d.a(this, "setListener %s", iVar);
        }
        return this;
    }

    @Override // m7.a.b
    public boolean G() {
        return this.f64194v;
    }

    @Override // m7.a
    public boolean H() {
        return this.f64189q;
    }

    @Override // m7.a.b
    public boolean I() {
        ArrayList<m7.a.InterfaceC0584a> arrayList = this.f64176d;
        return arrayList != null && arrayList.size() > 0;
    }

    public boolean L() {
        return this.f64173a.getStatus() != 0;
    }

    public m7.a M(String str, boolean z10) {
        this.f64178f = str;
        if (w7.d.f73535a) {
            w7.d.a(this, "setPath %s", str);
        }
        this.f64180h = z10;
        if (z10) {
            this.f64179g = null;
        } else {
            this.f64179g = new File(str).getName();
        }
        return this;
    }

    @Override // m7.a
    public Throwable a() {
        return this.f64173a.a();
    }

    @Override // m7.d.a
    public FileDownloadHeader b() {
        return this.f64181i;
    }

    @Override // m7.a
    public m7.a c(int i10) {
        this.f64173a.c(i10);
        return this;
    }

    @Override // m7.a
    public int d() {
        return this.f64173a.d();
    }

    @Override // m7.a.b
    public int e() {
        return this.f64190r;
    }

    @Override // m7.a
    public m7.a.c f() {
        return new b();
    }

    @Override // m7.a.b
    public void free() {
        this.f64173a.free();
        if (h.e().g(this)) {
            this.f64194v = false;
        }
    }

    @Override // m7.a
    public int g() {
        return this.f64188p;
    }

    @Override // m7.a
    public int getId() {
        int i10 = this.f64175c;
        if (i10 != 0) {
            return i10;
        }
        if (TextUtils.isEmpty(this.f64178f) || TextUtils.isEmpty(this.f64177e)) {
            return 0;
        }
        int iS = w7.f.s(this.f64177e, this.f64178f, this.f64180h);
        this.f64175c = iS;
        return iS;
    }

    @Override // m7.a
    public i getListener() {
        return this.f64182j;
    }

    @Override // m7.a
    public String getPath() {
        return this.f64178f;
    }

    @Override // m7.a
    public byte getStatus() {
        return this.f64173a.getStatus();
    }

    @Override // m7.a
    public Object getTag() {
        return this.f64183k;
    }

    @Override // m7.a
    public String getUrl() {
        return this.f64177e;
    }

    @Override // m7.a
    public int j() {
        return this.f64184l;
    }

    @Override // m7.a.b
    public Object k() {
        return this.f64192t;
    }

    @Override // m7.a
    public int l() {
        return this.f64187o;
    }

    @Override // m7.a
    public m7.a m(int i10) {
        this.f64187o = i10;
        return this;
    }

    @Override // m7.a
    public String n() {
        return this.f64179g;
    }

    @Override // m7.a
    public long p() {
        return this.f64173a.j();
    }

    @Override // m7.d.a
    public ArrayList<m7.a.InterfaceC0584a> q() {
        return this.f64176d;
    }

    @Override // m7.a
    public long r() {
        return this.f64173a.m();
    }

    @Override // m7.a
    public int start() {
        if (this.f64191s) {
            throw new IllegalStateException("If you start the task manually, it means this task doesn't belong to a queue, so you must not invoke BaseDownloadTask#ready() or InQueueTask#enqueue() before you start() this method. For detail: If this task doesn't belong to a queue, what is just an isolated task, you just need to invoke BaseDownloadTask#start() to start this task, that's all. In other words, If this task doesn't belong to a queue, you must not invoke BaseDownloadTask#ready() method or InQueueTask#enqueue() method before invoke BaseDownloadTask#start(), If you do that and if there is the same listener object to start a queue in another thread, this task may be assembled by the queue, in that case, when you invoke BaseDownloadTask#start() manually to start this task or this task is started by the queue, there is an exception buried in there, because this task object is started two times without declare BaseDownloadTask#reuse() : 1. you invoke BaseDownloadTask#start() manually;  2. the queue start this task automatically.");
        }
        return N();
    }

    @Override // m7.a
    public boolean t() {
        return this.f64185m;
    }

    @Override // m7.a
    public int u() {
        if (this.f64173a.m() > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) this.f64173a.m();
    }

    @Override // m7.d.a
    public void v(String str) {
        this.f64179g = str;
    }

    @Override // m7.a
    public boolean w() {
        return this.f64190r != 0;
    }

    @Override // m7.a
    public boolean x() {
        return this.f64186n;
    }

    @Override // m7.a
    public int y() {
        if (this.f64173a.j() > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) this.f64173a.j();
    }

    @Override // m7.a
    public boolean z() {
        return this.f64180h;
    }

    public c(String str) {
        this.f64177e = str;
        Object obj = new Object();
        this.f64192t = obj;
        d dVar = new d(this, obj);
        this.f64173a = dVar;
        this.f64174b = dVar;
    }

    @Override // m7.a
    public String C() {
        return w7.f.B(getPath(), z(), n());
    }

    @Override // m7.a.b
    public void F() {
        int iHashCode;
        if (getListener() != null) {
            iHashCode = getListener().hashCode();
        } else {
            iHashCode = hashCode();
        }
        this.f64190r = iHashCode;
    }

    public boolean K() {
        if (r.c().d().b(this)) {
            return true;
        }
        return t7.b.a(getStatus());
    }

    public final int N() {
        if (L()) {
            if (K()) {
                throw new IllegalStateException(w7.f.o("This task is running %d, if you want to start the same task, please create a new one by FileDownloader.create", Integer.valueOf(getId())));
            }
            throw new IllegalStateException("This task is dirty to restart, If you want to reuse this task, please invoke #reuse method manually and retry to restart again." + this.f64173a.toString());
        }
        if (!w()) {
            F();
        }
        this.f64173a.f();
        return getId();
    }

    @Override // m7.a.b
    public boolean i(int i10) {
        if (getId() == i10) {
            return true;
        }
        return false;
    }

    @Override // m7.a.b
    public void o() {
        N();
    }

    @Override // m7.a.b
    public boolean s() {
        return t7.b.e(getStatus());
    }
}
