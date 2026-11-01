package sg.bigo.ads.common.n;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import sg.bigo.ads.common.utils.t;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static List<sg.bigo.ads.common.n.a> f69765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static HandlerThread f69766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static b f69767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static HandlerThread f69768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static b f69769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static HandlerThread f69770f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static b f69771g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static b f69772h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static b f69773i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final WeakHashMap<Object, a> f69774j = new WeakHashMap<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static boolean f69775k = false;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f69789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f69790b;

        public a(Runnable runnable, Integer num) {
            this.f69789a = runnable;
            this.f69790b = num;
        }
    }

    static {
        t.a();
    }

    public static void a(int i10, Runnable runnable) {
        b(i10, runnable, 0L);
    }

    public static void a(int i10, Runnable runnable, long j10) {
        b(i10, runnable, j10);
    }

    public static synchronized void a(Runnable runnable) {
        b bVar;
        if (runnable == null) {
            return;
        }
        WeakHashMap<Object, a> weakHashMap = f69774j;
        a aVar = weakHashMap.get(runnable);
        if (aVar == null) {
            return;
        }
        Runnable runnable2 = aVar.f69789a;
        if (runnable2 != null) {
            int iIntValue = aVar.f69790b.intValue();
            if (iIntValue == 0) {
                bVar = f69767c;
                if (bVar != null) {
                    bVar.removeCallbacks(runnable2);
                }
                throw th;
            }
            if (iIntValue == 1) {
                bVar = f69769e;
                if (bVar != null) {
                    bVar.removeCallbacks(runnable2);
                }
                throw th;
            }
            if (iIntValue == 2) {
                bVar = f69772h;
                if (bVar != null) {
                    bVar.removeCallbacks(runnable2);
                }
                throw th;
            }
            if (iIntValue == 3) {
                bVar = f69771g;
                if (bVar != null) {
                    bVar.removeCallbacks(runnable2);
                }
            } else if (iIntValue == 1024) {
                runnable2.run();
            }
            synchronized (weakHashMap) {
                weakHashMap.remove(runnable);
            }
        }
    }

    public static synchronized void a(@NonNull sg.bigo.ads.common.n.a aVar) {
        if (f69765a == null) {
            f69765a = new ArrayList();
        }
        f69765a.add(aVar);
    }

    public static boolean a() {
        return f69768d == Thread.currentThread();
    }

    private static synchronized void b(int i10, final Runnable runnable, long j10) {
        final b bVar;
        if (runnable == null) {
            return;
        }
        if (f69772h == null) {
            j();
        }
        if (i10 == 0) {
            if (f69766b == null) {
                g();
            }
            bVar = f69767c;
        } else if (i10 == 1) {
            if (f69768d == null) {
                h();
            }
            bVar = f69769e;
        } else if (i10 != 3) {
            bVar = f69772h;
        } else {
            if (f69770f == null) {
                i();
            }
            bVar = f69771g;
        }
        if (bVar == null) {
            return;
        }
        final Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = f69772h.getLooper();
        }
        final Runnable runnable2 = new Runnable() { // from class: sg.bigo.ads.common.n.d.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Runnable f69777b = null;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f69778c = false;

            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable3 = d.f69773i != null ? new Runnable() { // from class: sg.bigo.ads.common.n.d.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.f69772h.post(new Runnable() { // from class: sg.bigo.ads.common.n.d.1.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                sg.bigo.ads.common.t.a.a(0, "ThreadManager", "这里使用了ThreadManager.post函数运行了一个超过30s的任务");
                            }
                        });
                    }
                } : null;
                if (d.f69773i != null) {
                    d.f69773i.postDelayed(runnable3, 30000L);
                }
                synchronized (d.f69774j) {
                    d.f69774j.remove(runnable);
                }
                if (d.f69775k) {
                    runnable.run();
                } else {
                    try {
                        runnable.run();
                    } catch (Throwable th2) {
                        sg.bigo.ads.common.t.a.a(2, "ThreadManager", "An error occurred while running a task: \n" + Log.getStackTraceString(th2));
                        List<sg.bigo.ads.common.n.a> list = d.f69765a;
                        if (list != null) {
                            Iterator<sg.bigo.ads.common.n.a> it = list.iterator();
                            while (it.hasNext()) {
                                it.next().a(th2);
                            }
                        }
                    }
                }
                if (d.f69773i != null) {
                    d.f69773i.removeCallbacks(runnable3);
                }
                if (this.f69777b != null) {
                    if (this.f69778c || looperMyLooper == d.f69772h.getLooper()) {
                        d.f69772h.post(this.f69777b);
                    } else {
                        new Handler(looperMyLooper).post(this.f69777b);
                    }
                }
            }
        };
        Runnable runnable3 = new Runnable() { // from class: sg.bigo.ads.common.n.d.2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Runnable f69782a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ boolean f69783b = false;

            @Override // java.lang.Runnable
            public final void run() {
                if (this.f69782a == null) {
                    runnable2.run();
                } else if (this.f69783b || looperMyLooper == d.f69772h.getLooper()) {
                    d.f69772h.post(new Runnable() { // from class: sg.bigo.ads.common.n.d.2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            AnonymousClass2.this.f69782a.run();
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            bVar.post(runnable2);
                        }
                    });
                } else {
                    new Handler(looperMyLooper).post(new Runnable() { // from class: sg.bigo.ads.common.n.d.2.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            AnonymousClass2.this.f69782a.run();
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            bVar.post(runnable2);
                        }
                    });
                }
            }
        };
        WeakHashMap<Object, a> weakHashMap = f69774j;
        synchronized (weakHashMap) {
            weakHashMap.put(runnable, new a(runnable3, Integer.valueOf(i10)));
        }
        bVar.postDelayed(runnable3, j10);
    }

    public static void b(Runnable runnable) {
        if (b()) {
            runnable.run();
        } else {
            b(2, runnable, 0L);
        }
    }

    public static boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    private static synchronized void g() {
        if (f69766b == null) {
            HandlerThread handlerThread = new HandlerThread("BGAd-Background", 10);
            f69766b = handlerThread;
            handlerThread.start();
            f69767c = new b("BGAd-Background", f69766b.getLooper());
        }
    }

    private static synchronized void h() {
        if (f69768d == null) {
            HandlerThread handlerThread = new HandlerThread("BGAd-Work", 5);
            f69768d = handlerThread;
            handlerThread.start();
            f69769e = new b("BGAd-Work", f69768d.getLooper());
        }
    }

    private static synchronized void i() {
        if (f69770f == null) {
            HandlerThread handlerThread = new HandlerThread("BGAd-Normal", 0);
            f69770f = handlerThread;
            handlerThread.start();
            f69771g = new b("BGAd-Normal", f69770f.getLooper());
        }
    }

    private static synchronized void j() {
        if (f69772h == null) {
            f69772h = new b("BGAd-Background.Main + 38", Looper.getMainLooper());
        }
    }
}
