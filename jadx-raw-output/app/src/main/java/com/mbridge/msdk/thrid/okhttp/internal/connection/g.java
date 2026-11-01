package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.c0;
import com.mbridge.msdk.thrid.okhttp.i;
import com.mbridge.msdk.thrid.okhttp.internal.http2.n;
import com.mbridge.msdk.thrid.okhttp.o;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.v;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.List;

/* JADX INFO: compiled from: StreamAllocation.java */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ boolean f37572o = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okhttp.a f37573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f.a f37574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c0 f37575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f37576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okhttp.d f37577e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o f37578f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f37579g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f f37580h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f37581i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c f37582j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f37583k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f37584l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f37585m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.mbridge.msdk.thrid.okhttp.internal.http.c f37586n;

    public com.mbridge.msdk.thrid.okhttp.internal.http.c a(v vVar, t.a aVar, boolean z10) {
        try {
            com.mbridge.msdk.thrid.okhttp.internal.http.c cVarA = a(aVar.a(), aVar.b(), aVar.c(), vVar.t(), vVar.z(), z10).a(vVar, aVar, this);
            synchronized (this.f37576d) {
                this.f37586n = cVarA;
            }
            return cVarA;
        } catch (IOException e10) {
            throw new e(e10);
        }
    }

    public com.mbridge.msdk.thrid.okhttp.internal.http.c b() {
        com.mbridge.msdk.thrid.okhttp.internal.http.c cVar;
        synchronized (this.f37576d) {
            cVar = this.f37586n;
        }
        return cVar;
    }

    public synchronized c c() {
        return this.f37582j;
    }

    /* JADX INFO: compiled from: StreamAllocation.java */
    public static final class a extends WeakReference<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f37587a;

        public a(g gVar, Object obj) {
            super(gVar);
            this.f37587a = obj;
        }
    }

    private Socket g() {
        if (!f37572o && !Thread.holdsLock(this.f37576d)) {
            throw new AssertionError();
        }
        c cVar = this.f37582j;
        if (cVar == null || !cVar.f37554k) {
            return null;
        }
        return a(false, false, true);
    }

    private d i() {
        return com.mbridge.msdk.thrid.okhttp.internal.a.f37503a.a(this.f37576d);
    }

    public boolean d() {
        f.a aVar;
        return this.f37575c != null || ((aVar = this.f37574b) != null && aVar.b()) || this.f37580h.a();
    }

    public void e() {
        c cVar;
        Socket socketA;
        synchronized (this.f37576d) {
            cVar = this.f37582j;
            socketA = a(true, false, false);
            if (this.f37582j != null) {
                cVar = null;
            }
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socketA);
        if (cVar != null) {
            this.f37578f.connectionReleased(this.f37577e, cVar);
        }
    }

    public void f() {
        c cVar;
        Socket socketA;
        synchronized (this.f37576d) {
            cVar = this.f37582j;
            socketA = a(false, true, false);
            if (this.f37582j != null) {
                cVar = null;
            }
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socketA);
        if (cVar != null) {
            com.mbridge.msdk.thrid.okhttp.internal.a.f37503a.a(this.f37577e, (IOException) null);
            this.f37578f.connectionReleased(this.f37577e, cVar);
            this.f37578f.callEnd(this.f37577e);
        }
    }

    public c0 h() {
        return this.f37575c;
    }

    public g(i iVar, com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.d dVar, o oVar, Object obj) {
        this.f37576d = iVar;
        this.f37573a = aVar;
        this.f37577e = dVar;
        this.f37578f = oVar;
        this.f37580h = new f(aVar, i(), dVar, oVar);
        this.f37579g = obj;
    }

    public String toString() {
        c cVarC = c();
        if (cVarC != null) {
            return cVarC.toString();
        }
        return this.f37573a.toString();
    }

    public Socket b(c cVar) {
        if (!f37572o && !Thread.holdsLock(this.f37576d)) {
            throw new AssertionError();
        }
        if (this.f37586n == null && this.f37582j.f37557n.size() == 1) {
            Reference<g> reference = this.f37582j.f37557n.get(0);
            Socket socketA = a(true, false, false);
            this.f37582j = cVar;
            cVar.f37557n.add(reference);
            return socketA;
        }
        throw new IllegalStateException();
    }

    private c a(int i10, int i11, int i12, int i13, boolean z10, boolean z11) throws Throwable {
        while (true) {
            c cVarA = a(i10, i11, i12, i13, z10);
            synchronized (this.f37576d) {
                if (cVarA.f37555l == 0 && !cVarA.f()) {
                    return cVarA;
                }
                if (cVarA.a(z11)) {
                    return cVarA;
                }
                e();
            }
        }
    }

    private c a(int i10, int i11, int i12, int i13, boolean z10) throws Throwable {
        c cVar;
        Socket socketG;
        c cVar2;
        Socket socketA;
        c0 c0VarC;
        boolean z11;
        boolean z12;
        f.a aVar;
        synchronized (this.f37576d) {
            if (!this.f37584l) {
                if (this.f37586n == null) {
                    if (!this.f37585m) {
                        cVar = this.f37582j;
                        socketG = g();
                        cVar2 = this.f37582j;
                        socketA = null;
                        if (cVar2 != null) {
                            cVar = null;
                        } else {
                            cVar2 = null;
                        }
                        if (!this.f37583k) {
                            cVar = null;
                        }
                        if (cVar2 == null) {
                            com.mbridge.msdk.thrid.okhttp.internal.a.f37503a.a(this.f37576d, this.f37573a, this, null);
                            c cVar3 = this.f37582j;
                            if (cVar3 != null) {
                                z11 = true;
                                cVar2 = cVar3;
                                c0VarC = null;
                            } else {
                                c0VarC = this.f37575c;
                            }
                        } else {
                            c0VarC = null;
                        }
                        z11 = false;
                    } else {
                        throw new IOException("Canceled");
                    }
                } else {
                    throw new IllegalStateException("codec != null");
                }
            } else {
                throw new IllegalStateException("released");
            }
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socketG);
        if (cVar != null) {
            this.f37578f.connectionReleased(this.f37577e, cVar);
        }
        if (z11) {
            this.f37578f.connectionAcquired(this.f37577e, cVar2);
        }
        if (cVar2 != null) {
            this.f37575c = this.f37582j.c();
            return cVar2;
        }
        if (c0VarC != null || ((aVar = this.f37574b) != null && aVar.b())) {
            z12 = false;
        } else {
            this.f37574b = this.f37580h.c();
            z12 = true;
        }
        synchronized (this.f37576d) {
            if (this.f37585m) {
                throw new IOException("Canceled");
            }
            if (z12) {
                List<c0> listA = this.f37574b.a();
                int size = listA.size();
                for (int i14 = 0; i14 < size; i14++) {
                    c0 c0Var = listA.get(i14);
                    com.mbridge.msdk.thrid.okhttp.internal.a.f37503a.a(this.f37576d, this.f37573a, this, c0Var);
                    c cVar4 = this.f37582j;
                    if (cVar4 != null) {
                        this.f37575c = c0Var;
                        z11 = true;
                        cVar2 = cVar4;
                        break;
                    }
                }
            }
            if (!z11) {
                if (c0VarC == null) {
                    c0VarC = this.f37574b.c();
                }
                this.f37575c = c0VarC;
                this.f37581i = 0;
                cVar2 = new c(this.f37576d, c0VarC);
                a(cVar2, false);
            }
        }
        if (z11) {
            this.f37578f.connectionAcquired(this.f37577e, cVar2);
            return cVar2;
        }
        cVar2.a(i10, i11, i12, i13, z10, this.f37577e, this.f37578f);
        i().a(cVar2.c());
        synchronized (this.f37576d) {
            this.f37583k = true;
            com.mbridge.msdk.thrid.okhttp.internal.a.f37503a.b(this.f37576d, cVar2);
            if (cVar2.f()) {
                socketA = com.mbridge.msdk.thrid.okhttp.internal.a.f37503a.a(this.f37576d, this.f37573a, this);
                cVar2 = this.f37582j;
            }
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socketA);
        this.f37578f.connectionAcquired(this.f37577e, cVar2);
        return cVar2;
    }

    public void a(boolean z10, com.mbridge.msdk.thrid.okhttp.internal.http.c cVar, long j10, IOException iOException) {
        c cVar2;
        Socket socketA;
        boolean z11;
        this.f37578f.responseBodyEnd(this.f37577e, j10);
        synchronized (this.f37576d) {
            if (cVar != null) {
                if (cVar == this.f37586n) {
                    if (!z10) {
                        this.f37582j.f37555l++;
                    }
                    cVar2 = this.f37582j;
                    socketA = a(z10, false, true);
                    if (this.f37582j != null) {
                        cVar2 = null;
                    }
                    z11 = this.f37584l;
                }
            }
            throw new IllegalStateException("expected " + this.f37586n + " but was " + cVar);
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socketA);
        if (cVar2 != null) {
            this.f37578f.connectionReleased(this.f37577e, cVar2);
        }
        if (iOException != null) {
            this.f37578f.callFailed(this.f37577e, com.mbridge.msdk.thrid.okhttp.internal.a.f37503a.a(this.f37577e, iOException));
        } else if (z11) {
            com.mbridge.msdk.thrid.okhttp.internal.a.f37503a.a(this.f37577e, (IOException) null);
            this.f37578f.callEnd(this.f37577e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    private Socket a(boolean z10, boolean z11, boolean z12) {
        Socket socketG;
        if (!f37572o && !Thread.holdsLock(this.f37576d)) {
            throw new AssertionError();
        }
        if (z12) {
            this.f37586n = null;
        }
        if (z11) {
            this.f37584l = true;
        }
        c cVar = this.f37582j;
        if (cVar == null) {
            return null;
        }
        if (z10) {
            cVar.f37554k = true;
        }
        if (this.f37586n != null) {
            return null;
        }
        if (!this.f37584l && !cVar.f37554k) {
            return null;
        }
        a(cVar);
        if (this.f37582j.f37557n.isEmpty()) {
            this.f37582j.f37558o = System.nanoTime();
            if (com.mbridge.msdk.thrid.okhttp.internal.a.f37503a.a(this.f37576d, this.f37582j)) {
                socketG = this.f37582j.g();
            } else {
                socketG = null;
            }
        } else {
            socketG = null;
        }
        this.f37582j = null;
        return socketG;
    }

    public void a() {
        com.mbridge.msdk.thrid.okhttp.internal.http.c cVar;
        c cVar2;
        synchronized (this.f37576d) {
            this.f37585m = true;
            cVar = this.f37586n;
            cVar2 = this.f37582j;
        }
        if (cVar != null) {
            cVar.cancel();
        } else if (cVar2 != null) {
            cVar2.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0046  */
    public void a(IOException iOException) {
        c cVar;
        boolean z10;
        Socket socketA;
        synchronized (this.f37576d) {
            cVar = null;
            if (iOException instanceof n) {
                com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar = ((n) iOException).f37823a;
                if (bVar == com.mbridge.msdk.thrid.okhttp.internal.http2.b.REFUSED_STREAM) {
                    int i10 = this.f37581i + 1;
                    this.f37581i = i10;
                    if (i10 > 1) {
                        this.f37575c = null;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else if (bVar != com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL) {
                    this.f37575c = null;
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                c cVar2 = this.f37582j;
                if (cVar2 == null || (cVar2.f() && !(iOException instanceof com.mbridge.msdk.thrid.okhttp.internal.http2.a))) {
                    z10 = false;
                } else {
                    if (this.f37582j.f37555l == 0) {
                        c0 c0Var = this.f37575c;
                        if (c0Var != null && iOException != null) {
                            this.f37580h.a(c0Var, iOException);
                        }
                        this.f37575c = null;
                    }
                    z10 = true;
                }
            }
            c cVar3 = this.f37582j;
            socketA = a(z10, false, true);
            if (this.f37582j == null && this.f37583k) {
                cVar = cVar3;
            }
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socketA);
        if (cVar != null) {
            this.f37578f.connectionReleased(this.f37577e, cVar);
        }
    }

    public void a(c cVar, boolean z10) {
        if (!f37572o && !Thread.holdsLock(this.f37576d)) {
            throw new AssertionError();
        }
        if (this.f37582j == null) {
            this.f37582j = cVar;
            this.f37583k = z10;
            cVar.f37557n.add(new a(this, this.f37579g));
            return;
        }
        throw new IllegalStateException();
    }

    private void a(c cVar) {
        int size = cVar.f37557n.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (cVar.f37557n.get(i10).get() == this) {
                cVar.f37557n.remove(i10);
                return;
            }
        }
        throw new IllegalStateException();
    }
}
