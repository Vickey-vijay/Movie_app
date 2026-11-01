package en;

import com.ironsource.C3426d4;
import com.ironsource.Z7;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import xm.h;

/* JADX INFO: compiled from: QueuedThreadPool.java */
/* JADX INFO: loaded from: classes9.dex */
public class b extends ym.a implements d, Executor, ym.e {
    public static final zm.c A = zm.b.a(b.class);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public BlockingQueue<Runnable> f52695p;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f52690k = new AtomicInteger();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicInteger f52691l = new AtomicInteger();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AtomicLong f52692m = new AtomicLong();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h<Thread> f52693n = new h<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f52694o = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f52697r = 60000;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f52698s = 254;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f52699t = 8;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f52700u = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f52701v = 5;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f52702w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f52703x = 100;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f52704y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Runnable f52705z = new c();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f52696q = "qtp" + super.hashCode();

    /* JADX INFO: compiled from: QueuedThreadPool.java */
    public class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: en.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: QueuedThreadPool.java */
    public class C0467b implements ym.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Thread f52707b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f52708c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ StackTraceElement[] f52709d;

        public C0467b(Thread thread, boolean z10, StackTraceElement[] stackTraceElementArr) {
            this.f52707b = thread;
            this.f52708c = z10;
            this.f52709d = stackTraceElementArr;
        }

        @Override // ym.e
        public void z(Appendable appendable, String str) throws IOException {
            appendable.append(String.valueOf(this.f52707b.getId())).append(' ').append(this.f52707b.getName()).append(' ').append(this.f52707b.getState().toString()).append(this.f52708c ? " IDLE" : "").append('\n');
            if (this.f52708c) {
                return;
            }
            ym.b.p0(appendable, str, Arrays.asList(this.f52709d));
        }
    }

    /* JADX INFO: compiled from: QueuedThreadPool.java */
    public class c implements Runnable {
        /* JADX WARN: Code duplicated, block: B:67:0x011b  */
        @Override // java.lang.Runnable
        public void run() throws Throwable {
            boolean z10;
            Throwable th2;
            boolean z11;
            Exception e10;
            InterruptedException e11;
            try {
                try {
                    Runnable runnableZ0 = (Runnable) b.this.f52695p.poll();
                    z11 = false;
                    while (b.this.isRunning()) {
                        try {
                            while (runnableZ0 != null && b.this.isRunning()) {
                                b.this.B0(runnableZ0);
                                runnableZ0 = (Runnable) b.this.f52695p.poll();
                            }
                            try {
                                b.this.f52691l.incrementAndGet();
                                while (b.this.isRunning() && runnableZ0 == null) {
                                    if (b.this.f52697r <= 0) {
                                        runnableZ0 = (Runnable) b.this.f52695p.take();
                                    } else {
                                        int i10 = b.this.f52690k.get();
                                        if (i10 > b.this.f52699t) {
                                            long j10 = b.this.f52692m.get();
                                            long jCurrentTimeMillis = System.currentTimeMillis();
                                            if (j10 == 0 || jCurrentTimeMillis - j10 > b.this.f52697r) {
                                                boolean z12 = b.this.f52692m.compareAndSet(j10, jCurrentTimeMillis) && b.this.f52690k.compareAndSet(i10, i10 + (-1));
                                                if (z12) {
                                                    try {
                                                        b.this.f52691l.decrementAndGet();
                                                        if (!z12) {
                                                            b.this.f52690k.decrementAndGet();
                                                        }
                                                        b.this.f52693n.remove(Thread.currentThread());
                                                        return;
                                                    } catch (InterruptedException e12) {
                                                        e11 = e12;
                                                        z11 = z12;
                                                        b.A.h(e11);
                                                        if (!z11) {
                                                            b.this.f52690k.decrementAndGet();
                                                        }
                                                        b.this.f52693n.remove(Thread.currentThread());
                                                    } catch (Exception e13) {
                                                        e10 = e13;
                                                        z11 = z12;
                                                        b.A.e(e10);
                                                        if (!z11) {
                                                            b.this.f52690k.decrementAndGet();
                                                        }
                                                        b.this.f52693n.remove(Thread.currentThread());
                                                    } catch (Throwable th3) {
                                                        th2 = th3;
                                                        z10 = z12;
                                                        if (!z10) {
                                                            b.this.f52690k.decrementAndGet();
                                                        }
                                                        b.this.f52693n.remove(Thread.currentThread());
                                                        throw th2;
                                                    }
                                                }
                                                z11 = z12;
                                            }
                                        }
                                        runnableZ0 = b.this.z0();
                                    }
                                }
                                b.this.f52691l.decrementAndGet();
                            } catch (Throwable th4) {
                                b.this.f52691l.decrementAndGet();
                                throw th4;
                            }
                        } catch (InterruptedException e14) {
                            e11 = e14;
                        } catch (Exception e15) {
                            e10 = e15;
                        }
                    }
                    if (!z11) {
                        b.this.f52690k.decrementAndGet();
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                }
            } catch (InterruptedException e16) {
                z11 = false;
                e11 = e16;
            } catch (Exception e17) {
                z11 = false;
                e10 = e17;
            } catch (Throwable th6) {
                z10 = false;
                th2 = th6;
            }
            b.this.f52693n.remove(Thread.currentThread());
        }

        public c() {
        }
    }

    public Thread A0(Runnable runnable) {
        return new Thread(runnable);
    }

    public void C0(boolean z10) {
        this.f52702w = z10;
    }

    public void D0(int i10) {
        this.f52698s = i10;
        if (this.f52699t > i10) {
            this.f52699t = i10;
        }
    }

    public final boolean F0(int i10) {
        if (!this.f52690k.compareAndSet(i10, i10 + 1)) {
            return false;
        }
        try {
            Thread threadA0 = A0(this.f52705z);
            threadA0.setDaemon(this.f52702w);
            threadA0.setPriority(this.f52701v);
            threadA0.setName(this.f52696q + "-" + threadA0.getId());
            this.f52693n.add(threadA0);
            threadA0.start();
            return true;
        } catch (Throwable th2) {
            this.f52690k.decrementAndGet();
            throw th2;
        }
    }

    @Override // en.d
    public boolean G() {
        return this.f52690k.get() == this.f52698s && this.f52695p.size() >= this.f52691l.get();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f52696q);
        sb2.append(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44171d);
        sb2.append(x0());
        sb2.append("<=");
        sb2.append(v0());
        sb2.append("<=");
        sb2.append(y0());
        sb2.append("/");
        sb2.append(w0());
        sb2.append(StringUtils.COMMA);
        BlockingQueue<Runnable> blockingQueue = this.f52695p;
        sb2.append(blockingQueue == null ? -1 : blockingQueue.size());
        sb2.append(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e);
        return sb2.toString();
    }

    public int v0() {
        return this.f52691l.get();
    }

    public int w0() {
        return this.f52698s;
    }

    public int x0() {
        return this.f52699t;
    }

    public int y0() {
        return this.f52690k.get();
    }

    @Override // ym.e
    public void z(Appendable appendable, String str) throws IOException {
        ArrayList arrayList = new ArrayList(w0());
        Iterator<Thread> it = this.f52693n.iterator();
        while (true) {
            boolean z10 = true;
            if (!it.hasNext()) {
                ym.b.q0(appendable, this);
                ym.b.p0(appendable, str, arrayList);
                return;
            }
            Thread next = it.next();
            StackTraceElement[] stackTrace = next.getStackTrace();
            if (stackTrace == null) {
                z10 = false;
                break;
            }
            int length = stackTrace.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    z10 = false;
                    break;
                } else if ("idleJobPoll".equals(stackTrace[i10].getMethodName())) {
                    break;
                } else {
                    i10++;
                }
            }
            if (this.f52704y) {
                arrayList.add(new C0467b(next, z10, stackTrace));
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(next.getId());
                sb2.append(Z7.f27998r);
                sb2.append(next.getName());
                sb2.append(Z7.f27998r);
                sb2.append(next.getState());
                sb2.append(" @ ");
                sb2.append(stackTrace.length > 0 ? stackTrace[0] : "???");
                sb2.append(z10 ? " IDLE" : "");
                arrayList.add(sb2.toString());
            }
        }
    }

    public final Runnable z0() throws InterruptedException {
        return this.f52695p.poll(this.f52697r, TimeUnit.MILLISECONDS);
    }

    public void B0(Runnable runnable) {
        runnable.run();
    }

    public void E0(String str) {
        if (!isRunning()) {
            this.f52696q = str;
            return;
        }
        throw new IllegalStateException(C3426d4.i.f28535d0);
    }

    @Override // en.d
    public boolean Z(Runnable runnable) {
        int i10;
        if (isRunning()) {
            int size = this.f52695p.size();
            int iV0 = v0();
            if (this.f52695p.offer(runnable)) {
                if ((iV0 == 0 || size > iV0) && (i10 = this.f52690k.get()) < this.f52698s) {
                    F0(i10);
                }
                return true;
            }
        }
        A.i("Dispatched {} to stopped {}", runnable, this);
        return false;
    }

    @Override // ym.a
    public void d0() throws Exception {
        BlockingQueue<Runnable> eVar;
        super.d0();
        this.f52690k.set(0);
        if (this.f52695p == null) {
            if (this.f52700u > 0) {
                eVar = new ArrayBlockingQueue<>(this.f52700u);
            } else {
                int i10 = this.f52699t;
                eVar = new xm.e<>(i10, i10);
            }
            this.f52695p = eVar;
        }
        int i11 = this.f52690k.get();
        while (isRunning() && i11 < this.f52699t) {
            F0(i11);
            i11 = this.f52690k.get();
        }
    }

    @Override // ym.a
    public void e0() throws Exception {
        super.e0();
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (this.f52690k.get() > 0 && System.currentTimeMillis() - jCurrentTimeMillis < this.f52703x / 2) {
            Thread.sleep(1L);
        }
        this.f52695p.clear();
        a aVar = new a();
        int i10 = this.f52691l.get();
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                break;
            }
            this.f52695p.offer(aVar);
            i10 = i11;
        }
        Thread.yield();
        if (this.f52690k.get() > 0) {
            Iterator<Thread> it = this.f52693n.iterator();
            while (it.hasNext()) {
                it.next().interrupt();
            }
        }
        while (this.f52690k.get() > 0 && System.currentTimeMillis() - jCurrentTimeMillis < this.f52703x) {
            Thread.sleep(1L);
        }
        Thread.yield();
        int size = this.f52693n.size();
        if (size > 0) {
            zm.c cVar = A;
            cVar.g(size + " threads could not be stopped", new Object[0]);
            if (size == 1 || cVar.f()) {
                for (Thread thread : this.f52693n) {
                    A.k("Couldn't stop " + thread, new Object[0]);
                    StackTraceElement[] stackTrace = thread.getStackTrace();
                    int length = stackTrace.length;
                    for (int i12 = 0; i12 < length; i12++) {
                        StackTraceElement stackTraceElement = stackTrace[i12];
                        A.k(" at " + stackTraceElement, new Object[0]);
                    }
                }
            }
        }
        synchronized (this.f52694o) {
            this.f52694o.notifyAll();
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (Z(runnable)) {
        } else {
            throw new RejectedExecutionException();
        }
    }
}
