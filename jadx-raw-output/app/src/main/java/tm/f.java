package tm;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import javax.servlet.ServletException;
import org.eclipse.jetty.util.LazyList;
import org.eclipse.jetty.util.MultiException;
import rm.i;
import rm.n;
import rm.p;

/* JADX INFO: compiled from: HandlerCollection.java */
/* JADX INFO: loaded from: classes11.dex */
public class f extends b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f72454p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile i[] f72455q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f72456r;

    /* JADX INFO: compiled from: HandlerCollection.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ClassLoader f72457b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f72458c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MultiException f72459d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f72460e;

        public a(ClassLoader classLoader, int i10, MultiException multiException, CountDownLatch countDownLatch) {
            this.f72457b = classLoader;
            this.f72458c = i10;
            this.f72459d = multiException;
            this.f72460e = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            try {
                Thread.currentThread().setContextClassLoader(this.f72457b);
                f.this.f72455q[this.f72458c].start();
            } catch (Throwable th2) {
                try {
                    this.f72459d.add(th2);
                } finally {
                    Thread.currentThread().setContextClassLoader(contextClassLoader);
                    this.f72460e.countDown();
                }
            }
        }
    }

    public f() {
        this.f72456r = false;
        this.f72454p = false;
    }

    public void C0(i[] iVarArr) {
        if (!this.f72454p && isStarted()) {
            throw new IllegalStateException("STARTED");
        }
        i[] iVarArr2 = this.f72455q == null ? null : (i[]) this.f72455q.clone();
        this.f72455q = iVarArr;
        p pVarB = b();
        MultiException multiException = new MultiException();
        for (int i10 = 0; iVarArr != null && i10 < iVarArr.length; i10++) {
            if (iVarArr[i10].b() != pVarB) {
                iVarArr[i10].f(pVarB);
            }
        }
        if (b() != null) {
            b().E0().update((Object) this, (Object[]) iVarArr2, (Object[]) iVarArr, "handler");
        }
        for (int i11 = 0; iVarArr2 != null && i11 < iVarArr2.length; i11++) {
            i iVar = iVarArr2[i11];
            if (iVar != null) {
                try {
                    if (iVar.isStarted()) {
                        iVarArr2[i11].stop();
                    }
                } catch (Throwable th2) {
                    multiException.add(th2);
                }
            }
        }
        multiException.ifExceptionThrowRuntime();
    }

    @Override // rm.j
    public i[] P() {
        return this.f72455q;
    }

    @Override // tm.a, ym.b, ym.a
    public void d0() throws Exception {
        MultiException multiException = new MultiException();
        if (this.f72455q != null) {
            if (this.f72456r) {
                CountDownLatch countDownLatch = new CountDownLatch(this.f72455q.length);
                ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
                for (int i10 = 0; i10 < this.f72455q.length; i10++) {
                    b().J0().Z(new a(contextClassLoader, i10, multiException, countDownLatch));
                }
                countDownLatch.await();
            } else {
                for (int i11 = 0; i11 < this.f72455q.length; i11++) {
                    try {
                        this.f72455q[i11].start();
                    } catch (Throwable th2) {
                        multiException.add(th2);
                    }
                }
            }
        }
        super.d0();
        multiException.ifExceptionThrow();
    }

    @Override // tm.a, ym.b, ym.a
    public void e0() throws Exception {
        MultiException multiException = new MultiException();
        try {
            super.e0();
        } catch (Throwable th2) {
            multiException.add(th2);
        }
        if (this.f72455q != null) {
            int length = this.f72455q.length;
            while (true) {
                int i10 = length - 1;
                if (length <= 0) {
                    break;
                }
                try {
                    this.f72455q[i10].stop();
                } catch (Throwable th3) {
                    multiException.add(th3);
                }
                length = i10;
            }
        }
        multiException.ifExceptionThrow();
    }

    public void v(String str, n nVar, lj.a aVar, lj.c cVar) throws ServletException, IOException {
        if (this.f72455q == null || !isStarted()) {
            return;
        }
        MultiException multiException = null;
        for (int i10 = 0; i10 < this.f72455q.length; i10++) {
            try {
                this.f72455q[i10].v(str, nVar, aVar, cVar);
            } catch (IOException e10) {
                throw e10;
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception e12) {
                if (multiException == null) {
                    multiException = new MultiException();
                }
                multiException.add(e12);
            }
        }
        if (multiException != null) {
            if (multiException.size() != 1) {
                throw new ServletException(multiException);
            }
            throw new ServletException(multiException.getThrowable(0));
        }
    }

    public void B0(i iVar) {
        C0((i[]) LazyList.addToArray(P(), iVar, i.class));
    }

    @Override // tm.a, ym.b, ym.d
    public void destroy() {
        if (isStopped()) {
            i[] iVarArrR = r();
            C0(null);
            for (i iVar : iVarArrR) {
                iVar.destroy();
            }
            super.destroy();
            return;
        }
        throw new IllegalStateException("!STOPPED");
    }

    @Override // tm.a, rm.i
    public void f(p pVar) {
        if (!isStarted()) {
            p pVarB = b();
            super.f(pVar);
            i[] iVarArrP = P();
            for (int i10 = 0; iVarArrP != null && i10 < iVarArrP.length; i10++) {
                iVarArrP[i10].f(pVar);
            }
            if (pVar != null && pVar != pVarB) {
                pVar.E0().update((Object) this, (Object[]) null, (Object[]) this.f72455q, "handler");
                return;
            }
            return;
        }
        throw new IllegalStateException("STARTED");
    }

    @Override // tm.b
    public Object x0(Object obj, Class cls) {
        i[] iVarArrP = P();
        for (int i10 = 0; iVarArrP != null && i10 < iVarArrP.length; i10++) {
            obj = y0(iVarArrP[i10], obj, cls);
        }
        return obj;
    }

    public f(boolean z10) {
        this.f72456r = false;
        this.f72454p = z10;
    }
}
