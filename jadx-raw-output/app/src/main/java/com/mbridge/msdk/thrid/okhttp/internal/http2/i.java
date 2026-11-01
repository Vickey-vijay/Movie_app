package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.mbridge.msdk.thrid.okhttp.r;
import com.mbridge.msdk.thrid.okio.s;
import com.mbridge.msdk.thrid.okio.t;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* JADX INFO: compiled from: Http2Stream.java */
/* JADX INFO: loaded from: classes8.dex */
public final class i {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ boolean f37781l = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f37782a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f37783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f37785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Deque<r> f37786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f37787f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f37788g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f37789h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f37790i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f37791j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.mbridge.msdk.thrid.okhttp.internal.http2.b f37792k;

    /* JADX INFO: compiled from: Http2Stream.java */
    public final class a implements com.mbridge.msdk.thrid.okio.r {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ boolean f37793e = true;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okio.c f37794a = new com.mbridge.msdk.thrid.okio.c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f37795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f37796c;

        @Override // com.mbridge.msdk.thrid.okio.r
        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (!f37793e && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            this.f37794a.a(cVar, j10);
            while (this.f37794a.size() >= 16384) {
                a(false);
            }
        }

        public a() {
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public t b() {
            return i.this.f37791j;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!f37793e && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            synchronized (i.this) {
                if (this.f37795b) {
                    return;
                }
                if (!i.this.f37789h.f37796c) {
                    if (this.f37794a.size() > 0) {
                        while (this.f37794a.size() > 0) {
                            a(true);
                        }
                    } else {
                        i iVar = i.this;
                        iVar.f37785d.a(iVar.f37784c, true, (com.mbridge.msdk.thrid.okio.c) null, 0L);
                    }
                }
                synchronized (i.this) {
                    this.f37795b = true;
                }
                i.this.f37785d.flush();
                i.this.a();
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
        public void flush() throws IOException {
            if (!f37793e && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            synchronized (i.this) {
                i.this.b();
            }
            while (this.f37794a.size() > 0) {
                a(false);
                i.this.f37785d.flush();
            }
        }

        private void a(boolean z10) throws IOException {
            i iVar;
            long jMin;
            i iVar2;
            synchronized (i.this) {
                i.this.f37791j.h();
                while (true) {
                    try {
                        iVar = i.this;
                        if (iVar.f37783b > 0 || this.f37796c || this.f37795b || iVar.f37792k != null) {
                            break;
                        } else {
                            iVar.k();
                        }
                    } catch (Throwable th2) {
                        i.this.f37791j.k();
                        throw th2;
                    }
                }
                iVar.f37791j.k();
                i.this.b();
                jMin = Math.min(i.this.f37783b, this.f37794a.size());
                iVar2 = i.this;
                iVar2.f37783b -= jMin;
            }
            iVar2.f37791j.h();
            try {
                i iVar3 = i.this;
                iVar3.f37785d.a(iVar3.f37784c, z10 && jMin == this.f37794a.size(), this.f37794a, jMin);
            } finally {
                i.this.f37791j.k();
            }
        }
    }

    /* JADX INFO: compiled from: Http2Stream.java */
    public final class b implements s {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ boolean f37798g = true;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okio.c f37799a = new com.mbridge.msdk.thrid.okio.c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okio.c f37800b = new com.mbridge.msdk.thrid.okio.c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f37801c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f37802d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f37803e;

        /* JADX WARN: Code duplicated, block: B:34:0x008e  */
        /* JADX WARN: Code duplicated, block: B:36:0x0092 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:37:0x0094 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:38:0x0095  */
        @Override // com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar;
            long jB;
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            }
            while (true) {
                synchronized (i.this) {
                    i.this.f37790i.h();
                    try {
                        i iVar = i.this;
                        com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar2 = iVar.f37792k;
                        bVar = bVar2 != null ? bVar2 : null;
                        if (this.f37802d) {
                            throw new IOException("stream closed");
                        }
                        if (!iVar.f37786e.isEmpty()) {
                            i.b(i.this);
                        }
                        if (this.f37800b.size() > 0) {
                            com.mbridge.msdk.thrid.okio.c cVar2 = this.f37800b;
                            jB = cVar2.b(cVar, Math.min(j10, cVar2.size()));
                            i iVar2 = i.this;
                            long j11 = iVar2.f37782a + jB;
                            iVar2.f37782a = j11;
                            if (bVar != null || j11 < iVar2.f37785d.f37720t.c() / 2) {
                                break;
                                break;
                            }
                            i iVar3 = i.this;
                            iVar3.f37785d.a(iVar3.f37784c, iVar3.f37782a);
                            i.this.f37782a = 0L;
                            break;
                        }
                        if (this.f37803e || bVar != null) {
                            jB = -1;
                            break;
                        }
                        i.this.k();
                        i.this.f37790i.k();
                    } catch (Throwable th2) {
                        i.this.f37790i.k();
                        throw th2;
                    }
                }
                if (jB != -1) {
                    f(jB);
                    return jB;
                }
                if (bVar == null) {
                    return -1L;
                }
                throw new n(bVar);
            }
            i.this.f37790i.k();
            if (jB != -1) {
                f(jB);
                return jB;
            }
            if (bVar == null) {
                return -1L;
            }
            throw new n(bVar);
        }

        public b(long j10) {
            this.f37801c = j10;
        }

        private void f(long j10) {
            if (!f37798g && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            i.this.f37785d.g(j10);
        }

        public void a(com.mbridge.msdk.thrid.okio.e eVar, long j10) throws IOException {
            boolean z10;
            boolean z11;
            boolean z12;
            long size;
            if (!f37798g && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            while (j10 > 0) {
                synchronized (i.this) {
                    z10 = this.f37803e;
                    z11 = true;
                    z12 = this.f37800b.size() + j10 > this.f37801c;
                }
                if (z12) {
                    eVar.skip(j10);
                    i.this.c(com.mbridge.msdk.thrid.okhttp.internal.http2.b.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z10) {
                    eVar.skip(j10);
                    return;
                }
                long jB = eVar.b(this.f37799a, j10);
                if (jB == -1) {
                    throw new EOFException();
                }
                j10 -= jB;
                synchronized (i.this) {
                    if (this.f37802d) {
                        size = this.f37799a.size();
                        this.f37799a.k();
                    } else {
                        if (this.f37800b.size() != 0) {
                            z11 = false;
                        }
                        this.f37800b.a(this.f37799a);
                        if (z11) {
                            i.this.notifyAll();
                        }
                        size = 0;
                    }
                }
                if (size > 0) {
                    f(size);
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long size;
            synchronized (i.this) {
                this.f37802d = true;
                size = this.f37800b.size();
                this.f37800b.k();
                if (!i.this.f37786e.isEmpty()) {
                    i.b(i.this);
                }
                i.this.notifyAll();
            }
            if (size > 0) {
                f(size);
            }
            i.this.a();
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public t b() {
            return i.this.f37790i;
        }
    }

    /* JADX INFO: compiled from: Http2Stream.java */
    public class c extends com.mbridge.msdk.thrid.okio.a {
        public c() {
        }

        @Override // com.mbridge.msdk.thrid.okio.a
        public IOException b(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // com.mbridge.msdk.thrid.okio.a
        public void j() {
            i.this.c(com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
            i.this.f37785d.l();
        }

        public void k() throws IOException {
            if (!i()) {
            } else {
                throw b((IOException) null);
            }
        }
    }

    public static /* synthetic */ com.mbridge.msdk.thrid.okhttp.internal.http2.c.a b(i iVar) {
        iVar.getClass();
        return null;
    }

    public int c() {
        return this.f37784c;
    }

    public com.mbridge.msdk.thrid.okio.r d() {
        synchronized (this) {
            if (!this.f37787f && !f()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f37789h;
    }

    public synchronized boolean g() {
        if (this.f37792k != null) {
            return false;
        }
        b bVar = this.f37788g;
        if (bVar.f37803e || bVar.f37802d) {
            a aVar = this.f37789h;
            if ((aVar.f37796c || aVar.f37795b) && this.f37787f) {
                return false;
            }
        }
        return true;
    }

    public synchronized r j() throws IOException {
        this.f37790i.h();
        while (this.f37786e.isEmpty() && this.f37792k == null) {
            try {
                k();
            } catch (Throwable th2) {
                this.f37790i.k();
                throw th2;
            }
        }
        this.f37790i.k();
        if (this.f37786e.isEmpty()) {
            throw new n(this.f37792k);
        }
        return this.f37786e.removeFirst();
    }

    private boolean b(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
        if (!f37781l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            if (this.f37792k != null) {
                return false;
            }
            if (this.f37788g.f37803e && this.f37789h.f37796c) {
                return false;
            }
            this.f37792k = bVar;
            notifyAll();
            this.f37785d.c(this.f37784c);
            return true;
        }
    }

    public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) throws IOException {
        if (b(bVar)) {
            this.f37785d.b(this.f37784c, bVar);
        }
    }

    public void c(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
        if (b(bVar)) {
            this.f37785d.c(this.f37784c, bVar);
        }
    }

    public s e() {
        return this.f37788g;
    }

    public boolean f() {
        return this.f37785d.f37701a == ((this.f37784c & 1) == 1);
    }

    public t h() {
        return this.f37790i;
    }

    public void i() {
        boolean zG;
        if (!f37781l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            this.f37788g.f37803e = true;
            zG = g();
            notifyAll();
        }
        if (zG) {
            return;
        }
        this.f37785d.c(this.f37784c);
    }

    public t l() {
        return this.f37791j;
    }

    public i(int i10, g gVar, boolean z10, boolean z11, r rVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f37786e = arrayDeque;
        this.f37790i = new c();
        this.f37791j = new c();
        this.f37792k = null;
        if (gVar != null) {
            this.f37784c = i10;
            this.f37785d = gVar;
            this.f37783b = gVar.f37721u.c();
            b bVar = new b(gVar.f37720t.c());
            this.f37788g = bVar;
            a aVar = new a();
            this.f37789h = aVar;
            bVar.f37803e = z11;
            aVar.f37796c = z10;
            if (rVar != null) {
                arrayDeque.add(rVar);
            }
            if (f() && rVar != null) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            if (!f() && rVar == null) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
            return;
        }
        throw new NullPointerException("connection == null");
    }

    public void k() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public void a(List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list) {
        boolean zG;
        if (!f37781l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            this.f37787f = true;
            this.f37786e.add(com.mbridge.msdk.thrid.okhttp.internal.c.b(list));
            zG = g();
            notifyAll();
        }
        if (zG) {
            return;
        }
        this.f37785d.c(this.f37784c);
    }

    public synchronized void d(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
        if (this.f37792k == null) {
            this.f37792k = bVar;
            notifyAll();
        }
    }

    public void a(com.mbridge.msdk.thrid.okio.e eVar, int i10) throws IOException {
        if (!f37781l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        this.f37788g.a(eVar, i10);
    }

    public void b() throws IOException {
        a aVar = this.f37789h;
        if (!aVar.f37795b) {
            if (!aVar.f37796c) {
                if (this.f37792k != null) {
                    throw new n(this.f37792k);
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0028  */
    public void a() throws IOException {
        boolean z10;
        boolean zG;
        if (!f37781l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            b bVar = this.f37788g;
            if (bVar.f37803e || !bVar.f37802d) {
                z10 = false;
            } else {
                a aVar = this.f37789h;
                if (aVar.f37796c || aVar.f37795b) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            zG = g();
        }
        if (z10) {
            a(com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
        } else {
            if (zG) {
                return;
            }
            this.f37785d.c(this.f37784c);
        }
    }

    public void a(long j10) {
        this.f37783b += j10;
        if (j10 > 0) {
            notifyAll();
        }
    }
}
