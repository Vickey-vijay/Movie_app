package m7;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: FileDownloadMessageStation.java */
/* JADX INFO: loaded from: classes8.dex */
public class j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Executor f64220e = w7.b.a(5, "BlockCompleted");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f64221f = 10;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f64222g = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f64223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedBlockingQueue<u> f64224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f64225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<u> f64226d;

    /* JADX INFO: compiled from: FileDownloadMessageStation.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ u f64227b;

        public a(u uVar) {
            this.f64227b = uVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f64227b.f();
        }
    }

    /* JADX INFO: compiled from: FileDownloadMessageStation.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f64228a = new j(null);
    }

    /* JADX INFO: compiled from: FileDownloadMessageStation.java */
    public static class c implements Handler.Callback {
        public c() {
        }

        public /* synthetic */ c(a aVar) {
            this();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                ((u) message.obj).f();
            } else if (i10 == 2) {
                a((ArrayList) message.obj);
                j.d().h();
            }
            return true;
        }

        public final void a(ArrayList<u> arrayList) {
            for (u uVar : arrayList) {
                if (!j.f(uVar)) {
                    uVar.f();
                }
            }
            arrayList.clear();
        }
    }

    public /* synthetic */ j(a aVar) {
        this();
    }

    public void i(u uVar) {
        j(uVar, false);
    }

    public j() {
        this.f64225c = new Object();
        this.f64226d = new ArrayList<>();
        this.f64223a = new Handler(Looper.getMainLooper(), new c(null));
        this.f64224b = new LinkedBlockingQueue<>();
    }

    public static boolean g() {
        return f64221f > 0;
    }

    public final void c(u uVar) {
        synchronized (this.f64225c) {
            this.f64224b.offer(uVar);
        }
        h();
    }

    public final void e(u uVar) {
        Handler handler = this.f64223a;
        handler.sendMessage(handler.obtainMessage(1, uVar));
    }

    public final void h() {
        synchronized (this.f64225c) {
            if (this.f64226d.isEmpty()) {
                if (this.f64224b.isEmpty()) {
                    return;
                }
                int i10 = 0;
                if (g()) {
                    int i11 = f64221f;
                    int iMin = Math.min(this.f64224b.size(), f64222g);
                    while (i10 < iMin) {
                        this.f64226d.add(this.f64224b.remove());
                        i10++;
                    }
                    i10 = i11;
                } else {
                    this.f64224b.drainTo(this.f64226d);
                }
                Handler handler = this.f64223a;
                handler.sendMessageDelayed(handler.obtainMessage(2, this.f64226d), i10);
            }
        }
    }

    public static j d() {
        return b.f64228a;
    }

    public static boolean f(u uVar) {
        if (uVar.e()) {
            f64220e.execute(new a(uVar));
            return true;
        }
        return false;
    }

    public void j(u uVar, boolean z10) {
        if (uVar.g()) {
            uVar.f();
            return;
        }
        if (f(uVar)) {
            return;
        }
        if (!g() && !this.f64224b.isEmpty()) {
            synchronized (this.f64225c) {
                if (!this.f64224b.isEmpty()) {
                    Iterator<u> it = this.f64224b.iterator();
                    while (it.hasNext()) {
                        e(it.next());
                    }
                }
                this.f64224b.clear();
            }
        }
        if (g() && !z10) {
            c(uVar);
        } else {
            e(uVar);
        }
    }
}
