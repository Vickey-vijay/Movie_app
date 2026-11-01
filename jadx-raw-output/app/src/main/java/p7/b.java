package p7;

import android.database.sqlite.SQLiteFullException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import com.liulishuo.filedownloader.exception.FileDownloadGiveUpRetryException;
import com.liulishuo.filedownloader.exception.FileDownloadOutOfSpaceException;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.LockSupport;
import w7.d;
import w7.e;
import w7.f;

/* JADX INFO: compiled from: DownloadStatusCallback.java */
/* JADX INFO: loaded from: classes9.dex */
public class b implements Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FileDownloadModel f66031b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f66033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f66034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f66035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f66036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f66037h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Handler f66038i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public HandlerThread f66039j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile Thread f66041l;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile boolean f66040k = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile long f66042m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AtomicLong f66043n = new AtomicLong();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AtomicBoolean f66044o = new AtomicBoolean(false);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f66045p = new AtomicBoolean(false);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AtomicBoolean f66046q = new AtomicBoolean(true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o7.a f66032c = p7.a.j().f();

    /* JADX INFO: compiled from: DownloadStatusCallback.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f66047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Exception f66048b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f66049c;

        public Exception a() {
            return this.f66048b;
        }

        public int b() {
            return this.f66049c;
        }

        public boolean c() {
            return this.f66047a;
        }

        public void d(Exception exc) {
            this.f66048b = exc;
        }

        public void e(boolean z10) {
            this.f66047a = z10;
        }

        public void f(int i10) {
            this.f66049c = i10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        this.f66040k = true;
        int i10 = message.what;
        try {
            if (i10 != 3) {
                if (i10 == 5) {
                    h((Exception) message.obj, message.arg1);
                }
                this.f66040k = false;
                if (this.f66041l != null) {
                    LockSupport.unpark(this.f66041l);
                }
                return true;
            }
            g();
            this.f66040k = false;
            if (this.f66041l != null) {
                LockSupport.unpark(this.f66041l);
            }
            return true;
        } catch (Throwable th2) {
            this.f66040k = false;
            if (this.f66041l != null) {
                LockSupport.unpark(this.f66041l);
            }
            throw th2;
        }
    }

    public final void v(byte b10) {
        if (b10 != -2) {
            s7.c.a().b(com.liulishuo.filedownloader.message.a.d(b10, this.f66031b, this.f66033d));
        } else if (d.f73535a) {
            d.a(this, "High concurrent cause, Already paused and we don't need to call-back to Task in here, %d", Integer.valueOf(this.f66031b.g()));
        }
    }

    public final synchronized void x(Message message) {
        if (!this.f66039j.isAlive()) {
            if (d.f73535a) {
                d.a(this, "require callback %d but the host thread of the flow has already dead, what is occurred because of there are several reason can final this flow on different thread.", Integer.valueOf(message.what));
            }
            return;
        }
        try {
            this.f66038i.sendMessage(message);
        } catch (IllegalStateException e10) {
            if (this.f66039j.isAlive()) {
                throw e10;
            }
            if (d.f73535a) {
                d.a(this, "require callback %d but the host thread of the flow has already dead, what is occurred because of there are several reason can final this flow on different thread.", Integer.valueOf(message.what));
            }
        }
    }

    public static long a(long j10, long j11) {
        if (j11 <= 0) {
            return -1L;
        }
        if (j10 == -1) {
            return 1L;
        }
        long j12 = j10 / j11;
        if (j12 <= 0) {
            return 1L;
        }
        return j12;
    }

    public void b() {
        Handler handler = this.f66038i;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f66039j.quit();
            this.f66041l = Thread.currentThread();
            while (this.f66040k) {
                LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(100L));
            }
            this.f66041l = null;
        }
    }

    public final Exception c(Exception exc) {
        long length;
        String strL = this.f66031b.l();
        if ((!this.f66031b.p() && !e.a().f73541f) || !(exc instanceof IOException) || !new File(strL).exists()) {
            return exc;
        }
        long jX = f.x(strL);
        if (jX > PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            return exc;
        }
        File file = new File(strL);
        if (file.exists()) {
            length = file.length();
        } else {
            d.c(this, exc, "Exception with: free space isn't enough, and the target file not exist.", new Object[0]);
            length = 0;
        }
        return new FileDownloadOutOfSpaceException(jX, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM, length, exc);
    }

    public final void f() {
        this.f66031b.A((byte) -2);
        this.f66032c.p(this.f66031b.g(), this.f66031b.i());
        v((byte) -2);
    }

    public final void g() {
        if (this.f66031b.i() == this.f66031b.m()) {
            this.f66032c.k(this.f66031b.g(), this.f66031b.i());
            return;
        }
        if (this.f66045p.compareAndSet(true, false)) {
            if (d.f73535a) {
                d.e(this, "handleProgress update model's status with progress", new Object[0]);
            }
            this.f66031b.A((byte) 3);
        }
        if (this.f66044o.compareAndSet(true, false)) {
            if (d.f73535a) {
                d.e(this, "handleProgress notify user progress status", new Object[0]);
            }
            v((byte) 3);
        }
    }

    public final void i(SQLiteFullException sQLiteFullException) {
        int iG = this.f66031b.g();
        if (d.f73535a) {
            d.a(this, "the data of the task[%d] is dirty, because the SQLite full exception[%s], so remove it from the database directly.", Integer.valueOf(iG), sQLiteFullException.toString());
        }
        this.f66031b.v(sQLiteFullException.toString());
        this.f66031b.A((byte) -1);
        this.f66032c.remove(iG);
        this.f66032c.d(iG);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    public final void j(long j10) {
        boolean z10;
        if (this.f66046q.compareAndSet(true, false)) {
            z10 = true;
        } else {
            long j11 = j10 - this.f66042m;
            if (this.f66037h == -1 || this.f66043n.get() < this.f66037h || j11 < this.f66035f) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        if (z10 && this.f66044o.compareAndSet(false, true)) {
            if (d.f73535a) {
                d.e(this, "inspectNeedCallbackToUser need callback to user", new Object[0]);
            }
            this.f66042m = j10;
            this.f66043n.set(0L);
        }
    }

    public final boolean k() {
        if (this.f66031b.p()) {
            FileDownloadModel fileDownloadModel = this.f66031b;
            fileDownloadModel.B(fileDownloadModel.i());
        } else if (this.f66031b.i() != this.f66031b.m()) {
            o(new FileDownloadGiveUpRetryException(f.o("sofar[%d] not equal total[%d]", Long.valueOf(this.f66031b.i()), Long.valueOf(this.f66031b.m()))));
            return true;
        }
        return false;
    }

    public boolean l() {
        HandlerThread handlerThread = this.f66039j;
        return handlerThread != null && handlerThread.isAlive();
    }

    public void n(boolean z10, long j10, String str, String str2) throws IllegalArgumentException {
        String strD = this.f66031b.d();
        if (strD != null && !strD.equals(str)) {
            throw new IllegalArgumentException(f.o("callback onConnected must with precondition succeed, but the etag is changes(%s != %s)", str, strD));
        }
        this.f66033d.e(z10);
        this.f66031b.A((byte) 2);
        this.f66031b.B(j10);
        this.f66031b.u(str);
        this.f66031b.w(str2);
        this.f66032c.l(this.f66031b.g(), j10, str, str2);
        v((byte) 2);
        this.f66037h = a(j10, this.f66036g);
        this.f66045p.compareAndSet(false, true);
    }

    public void p() {
        HandlerThread handlerThread = new HandlerThread("source-status-callback");
        this.f66039j = handlerThread;
        handlerThread.start();
        this.f66038i = new Handler(this.f66039j.getLooper(), this);
    }

    public void r() {
        this.f66031b.A((byte) 1);
        this.f66032c.f(this.f66031b.g());
        v((byte) 1);
    }

    public void s(long j10) {
        this.f66043n.addAndGet(j10);
        this.f66031b.o(j10);
        j(SystemClock.elapsedRealtime());
        if (this.f66038i == null) {
            g();
        } else if (this.f66044o.get()) {
            x(this.f66038i.obtainMessage(3));
        }
    }

    public void t(Exception exc, int i10) {
        this.f66043n.set(0L);
        Handler handler = this.f66038i;
        if (handler == null) {
            h(exc, i10);
        } else {
            x(handler.obtainMessage(5, i10, 0, exc));
        }
    }

    public void u() {
        this.f66031b.A((byte) 6);
        v((byte) 6);
        this.f66032c.i(this.f66031b.g());
    }

    public final void w() throws Throwable {
        boolean z10;
        String strL = this.f66031b.l();
        String strK = this.f66031b.k();
        File file = new File(strL);
        try {
            File file2 = new File(strK);
            if (file2.exists()) {
                long length = file2.length();
                if (!file2.delete()) {
                    throw new IOException(f.o("Can't delete the old file([%s], [%d]), so can't replace it with the new downloaded one.", strK, Long.valueOf(length)));
                }
                d.i(this, "The target file([%s], [%d]) will be replaced with the new downloaded file[%d]", strK, Long.valueOf(length), Long.valueOf(file.length()));
            }
            z10 = !file.renameTo(file2);
            if (!z10) {
                if (z10 && file.exists() && !file.delete()) {
                    d.i(this, "delete the temp file(%s) failed, on completed downloading.", strL);
                    return;
                }
                return;
            }
            try {
                throw new IOException(f.o("Can't rename the  temp downloaded file(%s) to the target file(%s)", strL, strK));
            } catch (Throwable th2) {
                th = th2;
                if (z10 && file.exists() && !file.delete()) {
                    d.i(this, "delete the temp file(%s) failed, on completed downloading.", strL);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            z10 = true;
        }
    }

    public b(FileDownloadModel fileDownloadModel, int i10, int i11, int i12) {
        this.f66031b = fileDownloadModel;
        this.f66035f = i11 < 5 ? 5 : i11;
        this.f66036g = i12;
        this.f66033d = new a();
        this.f66034e = i10;
    }

    public final void d() throws Throwable {
        w();
        this.f66031b.A((byte) -3);
        this.f66032c.h(this.f66031b.g(), this.f66031b.m());
        this.f66032c.d(this.f66031b.g());
        v((byte) -3);
        if (e.a().f73542g) {
            u7.f.a(this.f66031b);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void e(Exception exc) {
        SQLiteFullException sQLiteFullException;
        Exception excC = c(exc);
        if (excC instanceof SQLiteFullException) {
            i((SQLiteFullException) excC);
            sQLiteFullException = excC;
        } else {
            try {
                this.f66031b.A((byte) -1);
                this.f66031b.v(exc.toString());
                this.f66032c.j(this.f66031b.g(), excC, this.f66031b.i());
                sQLiteFullException = excC;
            } catch (SQLiteFullException e10) {
                SQLiteFullException sQLiteFullException2 = e10;
                i(sQLiteFullException2);
                sQLiteFullException = sQLiteFullException2;
            }
        }
        this.f66033d.d(sQLiteFullException);
        v((byte) -1);
    }

    public final void h(Exception exc, int i10) {
        Exception excC = c(exc);
        this.f66033d.d(excC);
        this.f66033d.f(this.f66034e - i10);
        this.f66031b.A((byte) 5);
        this.f66031b.v(excC.toString());
        this.f66032c.a(this.f66031b.g(), excC);
        v((byte) 5);
    }

    public void m() throws Throwable {
        if (k()) {
            return;
        }
        d();
    }

    public void o(Exception exc) {
        e(exc);
    }

    public void q() {
        f();
    }
}
