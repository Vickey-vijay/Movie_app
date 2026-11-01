package com.luck.picture.lib.thread;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import com.ironsource.C3702sd;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes8.dex */
public final class PictureThreadUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Handler f32404a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<Integer, Map<Integer, ExecutorService>> f32405b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map<e, ExecutorService> f32406c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f32407d = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Timer f32408e = new Timer();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Executor f32409f;

    public static final class LinkedBlockingQueue4Util extends LinkedBlockingQueue<Runnable> {
        private int mCapacity;
        private volatile f mPool;

        public LinkedBlockingQueue4Util() {
            this.mCapacity = Integer.MAX_VALUE;
        }

        @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
        public boolean offer(@NonNull Runnable runnable) {
            if (this.mCapacity > size() || this.mPool == null || this.mPool.getPoolSize() >= this.mPool.getMaximumPoolSize()) {
                return super.offer(runnable);
            }
            return false;
        }

        public LinkedBlockingQueue4Util(boolean z10) {
            this.mCapacity = Integer.MAX_VALUE;
            if (z10) {
                this.mCapacity = 0;
            }
        }

        public LinkedBlockingQueue4Util(int i10) {
            this.mCapacity = i10;
        }
    }

    public static final class UtilsThreadFactory extends AtomicLong implements ThreadFactory {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final AtomicInteger f32410b = new AtomicInteger(1);
        private static final long serialVersionUID = -9209200509960368598L;
        private final boolean isDaemon;
        private final String namePrefix;
        private final int priority;

        public class a extends Thread {
            public a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    super.run();
                } catch (Throwable th2) {
                    Log.e("ThreadUtils", "Request threw uncaught throwable", th2);
                }
            }
        }

        public class b implements Thread.UncaughtExceptionHandler {
            public b() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th2) {
                System.out.println(th2);
            }
        }

        public UtilsThreadFactory(String str, int i10) {
            this(str, i10, false);
        }

        public UtilsThreadFactory(String str, int i10, boolean z10) {
            this.namePrefix = str + "-pool-" + f32410b.getAndIncrement() + "-thread-";
            this.priority = i10;
            this.isDaemon = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            a aVar = new a(runnable, this.namePrefix + getAndIncrement());
            aVar.setDaemon(this.isDaemon);
            aVar.setUncaughtExceptionHandler(new b());
            aVar.setPriority(this.priority);
            return aVar;
        }
    }

    public class a extends TimerTask {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ExecutorService f32413b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f32414c;

        public a(ExecutorService executorService, e eVar) {
            this.f32413b = executorService;
            this.f32414c = eVar;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.f32413b.execute(this.f32414c);
        }
    }

    public class b extends TimerTask {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ExecutorService f32415b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f32416c;

        public b(ExecutorService executorService, e eVar) {
            this.f32415b = executorService;
            this.f32416c = eVar;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.f32415b.execute(this.f32416c);
        }
    }

    public static abstract class d<T> extends e<T> {
        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        public void j() {
            Log.e("ThreadUtils", "onCancel: " + Thread.currentThread());
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        public void l(Throwable th2) {
            Log.e("ThreadUtils", "onFail: ", th2);
        }
    }

    public static abstract class e<T> implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicInteger f32417b = new AtomicInteger(0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile boolean f32418c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile Thread f32419d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Timer f32420e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f32421f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public f f32422g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Executor f32423h;

        public class a extends TimerTask {
            public a() {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                if (e.this.i() || e.this.f32422g == null) {
                    return;
                }
                e.this.o();
                e.this.f32422g.onTimeout();
                e.this.k();
            }
        }

        public class b implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Object f32425b;

            public b(Object obj) {
                this.f32425b = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                e.this.m(this.f32425b);
            }
        }

        public class c implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Object f32427b;

            public c(Object obj) {
                this.f32427b = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                e.this.m(this.f32427b);
                e.this.k();
            }
        }

        public class d implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Throwable f32429b;

            public d(Throwable th2) {
                this.f32429b = th2;
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.l(this.f32429b);
                e.this.k();
            }
        }

        /* JADX INFO: renamed from: com.luck.picture.lib.thread.PictureThreadUtils$e$e, reason: collision with other inner class name */
        public class RunnableC0295e implements Runnable {
            public RunnableC0295e() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.j();
                e.this.k();
            }
        }

        public interface f {
            void onTimeout();
        }

        public void e() {
            f(true);
        }

        public abstract T g() throws Throwable;

        public abstract void j();

        public abstract void l(Throwable th2);

        public abstract void m(T t10);

        public void f(boolean z10) {
            synchronized (this.f32417b) {
                if (this.f32417b.get() > 1) {
                    return;
                }
                this.f32417b.set(4);
                if (z10 && this.f32419d != null) {
                    this.f32419d.interrupt();
                }
                h().execute(new RunnableC0295e());
            }
        }

        public final Executor h() {
            Executor executor = this.f32423h;
            return executor == null ? PictureThreadUtils.i() : executor;
        }

        public boolean i() {
            return this.f32417b.get() > 1;
        }

        public final void n(boolean z10) {
            this.f32418c = z10;
        }

        public final void o() {
            synchronized (this.f32417b) {
                if (this.f32417b.get() > 1) {
                    return;
                }
                this.f32417b.set(6);
                if (this.f32419d != null) {
                    this.f32419d.interrupt();
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f32418c) {
                if (this.f32419d == null) {
                    if (!this.f32417b.compareAndSet(0, 1)) {
                        return;
                    }
                    this.f32419d = Thread.currentThread();
                    if (this.f32422g != null) {
                        Log.w("ThreadUtils", "Scheduled task doesn't support timeout.");
                    }
                } else if (this.f32417b.get() != 1) {
                    return;
                }
            } else {
                if (!this.f32417b.compareAndSet(0, 1)) {
                    return;
                }
                this.f32419d = Thread.currentThread();
                if (this.f32422g != null) {
                    Timer timer = new Timer();
                    this.f32420e = timer;
                    timer.schedule(new a(), this.f32421f);
                }
            }
            try {
                T tG = g();
                if (this.f32418c) {
                    if (this.f32417b.get() != 1) {
                        return;
                    }
                    h().execute(new b(tG));
                } else if (this.f32417b.compareAndSet(1, 3)) {
                    h().execute(new c(tG));
                }
            } catch (InterruptedException unused) {
                this.f32417b.compareAndSet(4, 5);
            } catch (Throwable th2) {
                if (this.f32417b.compareAndSet(1, 2)) {
                    h().execute(new d(th2));
                }
            }
        }

        @CallSuper
        public void k() {
            PictureThreadUtils.f32406c.remove(this);
            Timer timer = this.f32420e;
            if (timer != null) {
                timer.cancel();
                this.f32420e = null;
                this.f32422g = null;
            }
        }
    }

    public static final class f extends ThreadPoolExecutor {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicInteger f32432b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public LinkedBlockingQueue4Util f32433c;

        public static ExecutorService b(int i10, int i11) {
            if (i10 == -8) {
                return new f(PictureThreadUtils.f32407d + 1, (PictureThreadUtils.f32407d * 2) + 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue4Util(true), new UtilsThreadFactory("cpu", i11));
            }
            if (i10 == -4) {
                return new f((PictureThreadUtils.f32407d * 2) + 1, (PictureThreadUtils.f32407d * 2) + 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue4Util(), new UtilsThreadFactory("io", i11));
            }
            if (i10 == -2) {
                return new f(0, 128, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue4Util(true), new UtilsThreadFactory("cached", i11));
            }
            if (i10 == -1) {
                return new f(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue4Util(), new UtilsThreadFactory(C3702sd.f30729d, i11));
            }
            return new f(i10, i10, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue4Util(), new UtilsThreadFactory("fixed(" + i10 + ")", i11));
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        public void afterExecute(Runnable runnable, Throwable th2) {
            this.f32432b.decrementAndGet();
            super.afterExecute(runnable, th2);
        }

        public f(int i10, int i11, long j10, TimeUnit timeUnit, LinkedBlockingQueue4Util linkedBlockingQueue4Util, ThreadFactory threadFactory) {
            super(i10, i11, j10, timeUnit, linkedBlockingQueue4Util, threadFactory);
            this.f32432b = new AtomicInteger();
            linkedBlockingQueue4Util.mPool = this;
            this.f32433c = linkedBlockingQueue4Util;
        }

        @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            if (isShutdown()) {
                return;
            }
            this.f32432b.incrementAndGet();
            try {
                super.execute(runnable);
            } catch (RejectedExecutionException unused) {
                Log.e("ThreadUtils", "This will not happen!");
                this.f32433c.offer(runnable);
            } catch (Throwable unused2) {
                this.f32432b.decrementAndGet();
            }
        }
    }

    public static <T> void h(e<T> eVar) {
        f(k(-4), eVar);
    }

    public static ExecutorService j() {
        return k(-4);
    }

    public static ExecutorService k(int i10) {
        return l(i10, 5);
    }

    public class c implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            PictureThreadUtils.n(runnable);
        }
    }

    public static void d(e eVar) {
        if (eVar == null) {
            return;
        }
        eVar.e();
    }

    public static void e(ExecutorService executorService) {
        if (!(executorService instanceof f)) {
            Log.e("ThreadUtils", "The executorService is not ThreadUtils's pool.");
            return;
        }
        for (Map.Entry<e, ExecutorService> entry : f32406c.entrySet()) {
            if (entry.getValue() == executorService) {
                d(entry.getKey());
            }
        }
    }

    public static <T> void f(ExecutorService executorService, e<T> eVar) {
        g(executorService, eVar, 0L, 0L, null);
    }

    public static <T> void g(ExecutorService executorService, e<T> eVar, long j10, long j11, TimeUnit timeUnit) {
        Map<e, ExecutorService> map = f32406c;
        synchronized (map) {
            if (map.get(eVar) != null) {
                Log.e("ThreadUtils", "Task can only be executed once.");
                return;
            }
            map.put(eVar, executorService);
            if (j11 != 0) {
                eVar.n(true);
                f32408e.scheduleAtFixedRate(new b(executorService, eVar), timeUnit.toMillis(j10), timeUnit.toMillis(j11));
            } else if (j10 == 0) {
                executorService.execute(eVar);
            } else {
                f32408e.schedule(new a(executorService, eVar), timeUnit.toMillis(j10));
            }
        }
    }

    public static Executor i() {
        if (f32409f == null) {
            f32409f = new c();
        }
        return f32409f;
    }

    public static ExecutorService l(int i10, int i11) {
        ExecutorService executorServiceB;
        Map<Integer, Map<Integer, ExecutorService>> map = f32405b;
        synchronized (map) {
            Map<Integer, ExecutorService> map2 = map.get(Integer.valueOf(i10));
            if (map2 == null) {
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                executorServiceB = f.b(i10, i11);
                concurrentHashMap.put(Integer.valueOf(i11), executorServiceB);
                map.put(Integer.valueOf(i10), concurrentHashMap);
            } else {
                executorServiceB = map2.get(Integer.valueOf(i11));
                if (executorServiceB == null) {
                    executorServiceB = f.b(i10, i11);
                    map2.put(Integer.valueOf(i11), executorServiceB);
                }
            }
        }
        return executorServiceB;
    }

    public static boolean m() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    public static void n(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            f32404a.post(runnable);
        }
    }
}
