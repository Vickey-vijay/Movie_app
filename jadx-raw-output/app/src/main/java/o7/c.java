package o7;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;
import w7.f;

/* JADX INFO: compiled from: RemitDatabase.java */
/* JADX INFO: loaded from: classes9.dex */
public class c implements o7.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f65119c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile Thread f65123g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<Integer> f65121e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AtomicInteger f65122f = new AtomicInteger();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f65117a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f65118b = new d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f65120d = w7.e.a().f73537b;

    /* JADX INFO: compiled from: RemitDatabase.java */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                if (c.this.f65123g != null) {
                    LockSupport.unpark(c.this.f65123g);
                    c.this.f65123g = null;
                }
                return false;
            }
            try {
                c.this.f65122f.set(i10);
                c.this.x(i10);
                c.this.f65121e.add(Integer.valueOf(i10));
                return false;
            } finally {
                c.this.f65122f.set(0);
                if (c.this.f65123g != null) {
                    LockSupport.unpark(c.this.f65123g);
                    c.this.f65123g = null;
                }
            }
        }
    }

    @Override // o7.a
    public void b(int i10, String str, long j10, long j11, int i11) {
        this.f65117a.b(i10, str, j10, j11, i11);
        if (w(i10)) {
            return;
        }
        this.f65118b.b(i10, str, j10, j11, i11);
    }

    @Override // o7.a
    public void a(int i10, Throwable th2) {
        this.f65117a.a(i10, th2);
        if (w(i10)) {
            return;
        }
        this.f65118b.a(i10, th2);
    }

    @Override // o7.a
    public void c(int i10, int i11, long j10) {
        this.f65117a.c(i10, i11, j10);
        if (w(i10)) {
            return;
        }
        this.f65118b.c(i10, i11, j10);
    }

    @Override // o7.a
    public void clear() {
        this.f65117a.clear();
        this.f65118b.clear();
    }

    @Override // o7.a
    public void d(int i10) {
        this.f65117a.d(i10);
        if (w(i10)) {
            return;
        }
        this.f65118b.d(i10);
    }

    @Override // o7.a
    public void e(t7.a aVar) {
        this.f65117a.e(aVar);
        if (w(aVar.c())) {
            return;
        }
        this.f65118b.e(aVar);
    }

    @Override // o7.a
    public void f(int i10) {
        this.f65117a.f(i10);
        if (w(i10)) {
            return;
        }
        this.f65118b.f(i10);
    }

    @Override // o7.a
    public o7.a.InterfaceC0597a g() {
        d dVar = this.f65118b;
        b bVar = this.f65117a;
        return dVar.t(bVar.f65113a, bVar.f65114b);
    }

    @Override // o7.a
    public void h(int i10, long j10) {
        this.f65117a.h(i10, j10);
        if (w(i10)) {
            this.f65119c.removeMessages(i10);
            if (this.f65122f.get() == i10) {
                this.f65123g = Thread.currentThread();
                this.f65119c.sendEmptyMessage(0);
                LockSupport.park();
                this.f65118b.h(i10, j10);
            }
        } else {
            this.f65118b.h(i10, j10);
        }
        this.f65121e.remove(Integer.valueOf(i10));
    }

    @Override // o7.a
    public void i(int i10) {
        this.f65119c.sendEmptyMessageDelayed(i10, this.f65120d);
    }

    @Override // o7.a
    public void insert(FileDownloadModel fileDownloadModel) {
        this.f65117a.insert(fileDownloadModel);
        if (w(fileDownloadModel.g())) {
            return;
        }
        this.f65118b.insert(fileDownloadModel);
    }

    @Override // o7.a
    public void j(int i10, Throwable th2, long j10) {
        this.f65117a.j(i10, th2, j10);
        if (w(i10)) {
            v(i10);
        }
        this.f65118b.j(i10, th2, j10);
        this.f65121e.remove(Integer.valueOf(i10));
    }

    @Override // o7.a
    public void k(int i10, long j10) {
        this.f65117a.k(i10, j10);
        if (w(i10)) {
            return;
        }
        this.f65118b.k(i10, j10);
    }

    @Override // o7.a
    public void l(int i10, long j10, String str, String str2) {
        this.f65117a.l(i10, j10, str, str2);
        if (w(i10)) {
            return;
        }
        this.f65118b.l(i10, j10, str, str2);
    }

    @Override // o7.a
    public List<t7.a> m(int i10) {
        return this.f65117a.m(i10);
    }

    @Override // o7.a
    public FileDownloadModel n(int i10) {
        return this.f65117a.n(i10);
    }

    @Override // o7.a
    public void o(int i10, int i11) {
        this.f65117a.o(i10, i11);
        if (w(i10)) {
            return;
        }
        this.f65118b.o(i10, i11);
    }

    @Override // o7.a
    public void p(int i10, long j10) {
        this.f65117a.p(i10, j10);
        if (w(i10)) {
            v(i10);
        }
        this.f65118b.p(i10, j10);
        this.f65121e.remove(Integer.valueOf(i10));
    }

    @Override // o7.a
    public boolean remove(int i10) {
        this.f65118b.remove(i10);
        return this.f65117a.remove(i10);
    }

    @Override // o7.a
    public void update(FileDownloadModel fileDownloadModel) {
        this.f65117a.update(fileDownloadModel);
        if (w(fileDownloadModel.g())) {
            return;
        }
        this.f65118b.update(fileDownloadModel);
    }

    public final void v(int i10) {
        this.f65119c.removeMessages(i10);
        if (this.f65122f.get() != i10) {
            x(i10);
            return;
        }
        this.f65123g = Thread.currentThread();
        this.f65119c.sendEmptyMessage(0);
        LockSupport.park();
    }

    public final boolean w(int i10) {
        return !this.f65121e.contains(Integer.valueOf(i10));
    }

    public final void x(int i10) {
        if (w7.d.f73535a) {
            w7.d.a(this, "sync cache to db %d", Integer.valueOf(i10));
        }
        this.f65118b.update(this.f65117a.n(i10));
        List<t7.a> listM = this.f65117a.m(i10);
        this.f65118b.d(i10);
        Iterator<t7.a> it = listM.iterator();
        while (it.hasNext()) {
            this.f65118b.e(it.next());
        }
    }

    public c() {
        HandlerThread handlerThread = new HandlerThread(f.D("RemitHandoverToDB"));
        handlerThread.start();
        this.f65119c = new Handler(handlerThread.getLooper(), new a());
    }
}
