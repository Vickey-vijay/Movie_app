package io.bidmachine.rendering.internal;

import androidx.annotation.CallSuper;
import io.bidmachine.rendering.utils.UiUtils;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes11.dex */
public abstract class y implements v, q, t, s, x, w, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.event.b f60648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f60649b = new CopyOnWriteArrayList();

    public class a extends b {
        public a() {
            super(null);
        }

        @Override // io.bidmachine.rendering.internal.y.b, io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public void onRun() {
            y.this.q().j();
            y.this.f60649b.remove(this);
        }

        @Override // io.bidmachine.rendering.internal.y.b, io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
            super.onThrows(th2);
        }

        @Override // io.bidmachine.rendering.internal.y.b, io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
        @CallSuper
        public /* bridge */ /* synthetic */ void run() {
            super.run();
        }
    }

    public static abstract class b implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f60651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f60652b;

        private b() {
        }

        private long c() {
            return Math.max(this.f60652b - System.currentTimeMillis(), 0L);
        }

        public void a() {
            this.f60651a = c();
            UiUtils.cancelOnUiThread(this);
        }

        public void b() {
            long j10 = this.f60651a;
            if (j10 > 0) {
                UiUtils.onUiThread(this, j10);
            } else {
                UiUtils.onUiThread(this);
            }
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public abstract /* synthetic */ void onRun() throws Throwable;

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
            super.onThrows(th2);
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
        @CallSuper
        public /* bridge */ /* synthetic */ void run() {
            super.run();
        }

        public void a(long j10) {
            this.f60651a = j10;
            this.f60652b = System.currentTimeMillis() + j10;
            b();
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public y(io.bidmachine.rendering.internal.event.b bVar) {
        this.f60648a = bVar;
    }

    public void a(long j10, long j11, float f10) {
    }

    public void a(String str) {
    }

    public void b() {
    }

    public void e() {
    }

    public void i() {
    }

    public void l() {
    }

    public void m() {
    }

    @Override // io.bidmachine.rendering.internal.v
    public void n() {
        Iterator it = this.f60649b.iterator();
        while (it.hasNext()) {
            ((b) it.next()).b();
        }
    }

    @Override // io.bidmachine.rendering.internal.v
    public void pause() {
        Iterator it = this.f60649b.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a();
        }
    }

    public io.bidmachine.rendering.internal.event.b q() {
        return this.f60648a;
    }

    public abstract String r();

    public void a() {
        Iterator it = this.f60649b.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a();
        }
        this.f60649b.clear();
    }

    @Override // io.bidmachine.rendering.internal.v
    public void a(long j10) {
        a aVar = new a();
        this.f60649b.add(aVar);
        aVar.a(j10);
    }
}
