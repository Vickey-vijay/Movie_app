package com.mbridge.msdk.thrid.okhttp;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: RealCall.java */
/* JADX INFO: loaded from: classes7.dex */
final class x implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f37997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okhttp.internal.http.j f37998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okio.a f37999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private o f38000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y f38001e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f38002f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f38003g;

    /* JADX INFO: compiled from: RealCall.java */
    public class a extends com.mbridge.msdk.thrid.okio.a {
        public a() {
        }

        @Override // com.mbridge.msdk.thrid.okio.a
        public void j() {
            x.this.cancel();
        }
    }

    /* JADX INFO: compiled from: RealCall.java */
    public final class b extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ boolean f38005d = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e f38006b;

        public b(e eVar) {
            super("OkHttp %s", x.this.e());
            this.f38006b = eVar;
        }

        public void a(ExecutorService executorService) {
            if (!f38005d && Thread.holdsLock(x.this.f37997a.j())) {
                throw new AssertionError();
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e10) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e10);
                    x.this.f38000d.callFailed(x.this, interruptedIOException);
                    this.f38006b.a(x.this, interruptedIOException);
                    x.this.f37997a.j().b(this);
                }
            } catch (Throwable th2) {
                x.this.f37997a.j().b(this);
                throw th2;
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            x.this.f37999c.h();
            boolean z10 = false;
            try {
                try {
                    try {
                        this.f38006b.a(x.this, x.this.c());
                        x.this.f37997a.j().b(this);
                    } catch (IOException e10) {
                        e = e10;
                        z10 = true;
                        IOException iOExceptionA = x.this.a(e);
                        if (z10) {
                            com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(4, "Callback failure for " + x.this.f(), iOExceptionA);
                        } else {
                            x.this.f38000d.callFailed(x.this, iOExceptionA);
                            this.f38006b.a(x.this, iOExceptionA);
                        }
                        x.this.f37997a.j().b(this);
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = true;
                        x.this.cancel();
                        if (!z10) {
                            this.f38006b.a(x.this, new IOException("canceled due to " + th));
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    x.this.f37997a.j().b(this);
                    throw th3;
                }
            } catch (IOException e11) {
                e = e11;
            } catch (Throwable th4) {
                th = th4;
            }
        }

        public x c() {
            return x.this;
        }

        public String d() {
            return x.this.f38001e.g().g();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.d
    public a0 d() throws IOException {
        synchronized (this) {
            if (this.f38003g) {
                throw new IllegalStateException("Already Executed");
            }
            this.f38003g = true;
        }
        a();
        this.f37999c.h();
        this.f38000d.callStart(this);
        try {
            try {
                this.f37997a.j().a(this);
                a0 a0VarC = c();
                if (a0VarC == null) {
                    throw new IOException("Canceled");
                }
                this.f37997a.j().b(this);
                return a0VarC;
            } catch (IOException e10) {
                IOException iOExceptionA = a(e10);
                this.f38000d.callFailed(this, iOExceptionA);
                throw iOExceptionA;
            }
        } catch (Throwable th2) {
            this.f37997a.j().b(this);
            throw th2;
        }
        this.f37997a.j().b(this);
        throw th2;
    }

    public static x a(v vVar, y yVar, boolean z10) {
        x xVar = new x(vVar, yVar, z10);
        xVar.f38000d = vVar.l().a(xVar);
        return xVar;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public x clone() {
        return a(this.f37997a, this.f38001e, this.f38002f);
    }

    public a0 c() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f37997a.p());
        arrayList.add(this.f37998b);
        arrayList.add(new com.mbridge.msdk.thrid.okhttp.internal.http.a(this.f37997a.i()));
        this.f37997a.q();
        arrayList.add(new com.mbridge.msdk.thrid.okhttp.internal.cache.a(null));
        arrayList.add(new com.mbridge.msdk.thrid.okhttp.internal.connection.a(this.f37997a));
        if (!this.f38002f) {
            arrayList.addAll(this.f37997a.r());
        }
        arrayList.add(new com.mbridge.msdk.thrid.okhttp.internal.http.b(this.f38002f));
        a0 a0VarA = new com.mbridge.msdk.thrid.okhttp.internal.http.g(arrayList, null, null, null, 0, this.f38001e, this, this.f38000d, this.f37997a.e(), this.f37997a.y(), this.f37997a.C()).a(this.f38001e);
        if (!this.f37998b.b()) {
            return a0VarA;
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(a0VarA);
        throw new IOException("Canceled");
    }

    @Override // com.mbridge.msdk.thrid.okhttp.d
    public void cancel() {
        this.f37998b.a();
    }

    public String e() {
        return this.f38001e.g().l();
    }

    public String f() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(h() ? "canceled " : "");
        sb2.append(this.f38002f ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb2.append(" to ");
        sb2.append(e());
        return sb2.toString();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.d
    public boolean h() {
        return this.f37998b.b();
    }

    private x(v vVar, y yVar, boolean z10) {
        this.f37997a = vVar;
        this.f38001e = yVar;
        this.f38002f = z10;
        this.f37998b = new com.mbridge.msdk.thrid.okhttp.internal.http.j(vVar, z10);
        a aVar = new a();
        this.f37999c = aVar;
        aVar.a(vVar.b(), TimeUnit.MILLISECONDS);
    }

    public IOException a(IOException iOException) {
        if (!this.f37999c.i()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    private void a() {
        this.f37998b.a(com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a("response.body().close()"));
    }

    @Override // com.mbridge.msdk.thrid.okhttp.d
    public void a(e eVar) {
        synchronized (this) {
            if (!this.f38003g) {
                this.f38003g = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        a();
        this.f38000d.callStart(this);
        this.f37997a.j().a(new b(eVar));
    }
}
