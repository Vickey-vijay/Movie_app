package o3;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import java.lang.Exception;
import java.util.ArrayDeque;
import o3.e;
import o3.f;

/* JADX INFO: compiled from: SimpleDecoder.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class g<I extends e, O extends f, E extends Exception> implements c<I, O, E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Thread f64974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f64975b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque<I> f64976c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque<O> f64977d = new ArrayDeque<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final I[] f64978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final O[] f64979f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f64980g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f64981h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public I f64982i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public E f64983j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f64984k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f64985l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f64986m;

    /* JADX INFO: compiled from: SimpleDecoder.java */
    public class a extends Thread {
        public a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            g.this.p();
        }
    }

    public abstract I c();

    public abstract O d();

    public abstract E e(Throwable th2);

    @Nullable
    public abstract E f(I i10, O o10, boolean z10);

    public final boolean b() {
        return !this.f64976c.isEmpty() && this.f64981h > 0;
    }

    @Override // o3.c
    public final void flush() {
        synchronized (this.f64975b) {
            this.f64984k = true;
            this.f64986m = 0;
            I i10 = this.f64982i;
            if (i10 != null) {
                m(i10);
                this.f64982i = null;
            }
            while (!this.f64976c.isEmpty()) {
                m(this.f64976c.removeFirst());
            }
            while (!this.f64977d.isEmpty()) {
                this.f64977d.removeFirst().release();
            }
            this.f64983j = null;
        }
    }

    public final boolean g() throws InterruptedException {
        E e10;
        synchronized (this.f64975b) {
            while (!this.f64985l && !b()) {
                this.f64975b.wait();
            }
            if (this.f64985l) {
                return false;
            }
            I iRemoveFirst = this.f64976c.removeFirst();
            O[] oArr = this.f64979f;
            int i10 = this.f64981h - 1;
            this.f64981h = i10;
            O o10 = oArr[i10];
            boolean z10 = this.f64984k;
            this.f64984k = false;
            if (iRemoveFirst.isEndOfStream()) {
                o10.addFlag(4);
            } else {
                if (iRemoveFirst.isDecodeOnly()) {
                    o10.addFlag(Integer.MIN_VALUE);
                }
                try {
                    e10 = (E) f(iRemoveFirst, o10, z10);
                } catch (OutOfMemoryError e11) {
                    e10 = (E) e(e11);
                } catch (RuntimeException e12) {
                    e10 = (E) e(e12);
                }
                if (e10 != null) {
                    synchronized (this.f64975b) {
                        this.f64983j = e10;
                    }
                    return false;
                }
            }
            synchronized (this.f64975b) {
                if (this.f64984k) {
                    o10.release();
                } else if (o10.isDecodeOnly()) {
                    this.f64986m++;
                    o10.release();
                } else {
                    o10.skippedOutputBufferCount = this.f64986m;
                    this.f64986m = 0;
                    this.f64977d.addLast(o10);
                }
                m(iRemoveFirst);
            }
            return true;
        }
    }

    @Override // o3.c
    @Nullable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final I dequeueInputBuffer() throws Exception {
        I i10;
        synchronized (this.f64975b) {
            k();
            g5.a.f(this.f64982i == null);
            int i11 = this.f64980g;
            if (i11 == 0) {
                i10 = null;
            } else {
                I[] iArr = this.f64978e;
                int i12 = i11 - 1;
                this.f64980g = i12;
                i10 = iArr[i12];
            }
            this.f64982i = i10;
        }
        return i10;
    }

    @Override // o3.c
    @Nullable
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final O dequeueOutputBuffer() throws Exception {
        synchronized (this.f64975b) {
            k();
            if (this.f64977d.isEmpty()) {
                return null;
            }
            return this.f64977d.removeFirst();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends java.lang.Exception */
    public final void k() throws Exception {
        E e10 = this.f64983j;
        if (e10 != null) {
            throw e10;
        }
    }

    @Override // o3.c
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void queueInputBuffer(I i10) throws Exception {
        synchronized (this.f64975b) {
            k();
            g5.a.a(i10 == this.f64982i);
            this.f64976c.addLast(i10);
            j();
            this.f64982i = null;
        }
    }

    @CallSuper
    public void n(O o10) {
        synchronized (this.f64975b) {
            o(o10);
            j();
        }
    }

    public final void q(int i10) {
        g5.a.f(this.f64980g == this.f64978e.length);
        for (I i11 : this.f64978e) {
            i11.b(i10);
        }
    }

    @Override // o3.c
    @CallSuper
    public void release() {
        synchronized (this.f64975b) {
            this.f64985l = true;
            this.f64975b.notify();
        }
        try {
            this.f64974a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public g(I[] iArr, O[] oArr) {
        this.f64978e = iArr;
        this.f64980g = iArr.length;
        for (int i10 = 0; i10 < this.f64980g; i10++) {
            ((I[]) this.f64978e)[i10] = c();
        }
        this.f64979f = oArr;
        this.f64981h = oArr.length;
        for (int i11 = 0; i11 < this.f64981h; i11++) {
            ((O[]) this.f64979f)[i11] = d();
        }
        a aVar = new a();
        this.f64974a = aVar;
        aVar.start();
    }

    public final void j() {
        if (b()) {
            this.f64975b.notify();
        }
    }

    public final void m(I i10) {
        i10.clear();
        I[] iArr = this.f64978e;
        int i11 = this.f64980g;
        this.f64980g = i11 + 1;
        iArr[i11] = i10;
    }

    public final void o(O o10) {
        o10.clear();
        O[] oArr = this.f64979f;
        int i10 = this.f64981h;
        this.f64981h = i10 + 1;
        oArr[i10] = o10;
    }

    public final void p() {
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (g());
    }
}
