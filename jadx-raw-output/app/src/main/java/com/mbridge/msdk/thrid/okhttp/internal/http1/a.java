package com.mbridge.msdk.thrid.okhttp.internal.http1;

import android.support.v4.media.session.PlaybackStateCompat;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.internal.http.h;
import com.mbridge.msdk.thrid.okhttp.internal.http.k;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okio.i;
import com.mbridge.msdk.thrid.okio.l;
import com.mbridge.msdk.thrid.okio.r;
import com.mbridge.msdk.thrid.okio.s;
import com.mbridge.msdk.thrid.okio.t;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Http1Codec.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a implements com.mbridge.msdk.thrid.okhttp.internal.http.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f37619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okhttp.internal.connection.g f37620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okio.e f37621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okio.d f37622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37623e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f37624f = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;

    /* JADX INFO: compiled from: Http1Codec.java */
    public abstract class b implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f37625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f37626b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f37627c;

        private b() {
            this.f37625a = new i(a.this.f37621c.b());
            this.f37627c = 0L;
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public t b() {
            return this.f37625a;
        }

        public final void a(boolean z10, IOException iOException) throws IOException {
            a aVar = a.this;
            int i10 = aVar.f37623e;
            if (i10 == 6) {
                return;
            }
            if (i10 != 5) {
                throw new IllegalStateException("state: " + a.this.f37623e);
            }
            aVar.a(this.f37625a);
            a aVar2 = a.this;
            aVar2.f37623e = 6;
            com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar = aVar2.f37620b;
            if (gVar != null) {
                gVar.a(!z10, aVar2, this.f37627c, iOException);
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            try {
                long jB = a.this.f37621c.b(cVar, j10);
                if (jB > 0) {
                    this.f37627c += jB;
                }
                return jB;
            } catch (IOException e10) {
                a(false, e10);
                throw e10;
            }
        }
    }

    /* JADX INFO: compiled from: Http1Codec.java */
    public final class c implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i f37629a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f37630b;

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() throws IOException {
            if (this.f37630b) {
                return;
            }
            this.f37630b = true;
            a.this.f37622d.a("0\r\n\r\n");
            a.this.a(this.f37629a);
            a.this.f37623e = 3;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
        public synchronized void flush() throws IOException {
            if (this.f37630b) {
                return;
            }
            a.this.f37622d.flush();
        }

        public c() {
            this.f37629a = new i(a.this.f37622d.b());
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (this.f37630b) {
                throw new IllegalStateException("closed");
            }
            if (j10 == 0) {
                return;
            }
            a.this.f37622d.a(j10);
            a.this.f37622d.a("\r\n");
            a.this.f37622d.a(cVar, j10);
            a.this.f37622d.a("\r\n");
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public t b() {
            return this.f37629a;
        }
    }

    /* JADX INFO: compiled from: Http1Codec.java */
    public class d extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okhttp.s f37632e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f37633f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f37634g;

        public d(com.mbridge.msdk.thrid.okhttp.s sVar) {
            super();
            this.f37633f = -1L;
            this.f37634g = true;
            this.f37632e = sVar;
        }

        private void d() throws IOException {
            if (this.f37633f != -1) {
                a.this.f37621c.c();
            }
            try {
                this.f37633f = a.this.f37621c.i();
                String strTrim = a.this.f37621c.c().trim();
                if (this.f37633f < 0 || !(strTrim.isEmpty() || strTrim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f37633f + strTrim + "\"");
                }
                if (this.f37633f == 0) {
                    this.f37634g = false;
                    com.mbridge.msdk.thrid.okhttp.internal.http.e.a(a.this.f37619a.i(), this.f37632e, a.this.f());
                    a(true, null);
                }
            } catch (NumberFormatException e10) {
                throw new ProtocolException(e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http1.a.b, com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            }
            if (this.f37626b) {
                throw new IllegalStateException("closed");
            }
            if (!this.f37634g) {
                return -1L;
            }
            long j11 = this.f37633f;
            if (j11 == 0 || j11 == -1) {
                d();
                if (!this.f37634g) {
                    return -1L;
                }
            }
            long jB = super.b(cVar, Math.min(j10, this.f37633f));
            if (jB != -1) {
                this.f37633f -= jB;
                return jB;
            }
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a(false, protocolException);
            throw protocolException;
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f37626b) {
                return;
            }
            if (this.f37634g && !com.mbridge.msdk.thrid.okhttp.internal.c.a(this, 100, TimeUnit.MILLISECONDS)) {
                a(false, null);
            }
            this.f37626b = true;
        }
    }

    /* JADX INFO: compiled from: Http1Codec.java */
    public final class e implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i f37636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f37637b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f37638c;

        public e(long j10) {
            this.f37636a = new i(a.this.f37622d.b());
            this.f37638c = j10;
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (this.f37637b) {
                throw new IllegalStateException("closed");
            }
            com.mbridge.msdk.thrid.okhttp.internal.c.a(cVar.size(), 0L, j10);
            if (j10 <= this.f37638c) {
                a.this.f37622d.a(cVar, j10);
                this.f37638c -= j10;
                return;
            }
            throw new ProtocolException("expected " + this.f37638c + " bytes but received " + j10);
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public t b() {
            return this.f37636a;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f37637b) {
                return;
            }
            this.f37637b = true;
            if (this.f37638c > 0) {
                throw new ProtocolException("unexpected end of stream");
            }
            a.this.a(this.f37636a);
            a.this.f37623e = 3;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
        public void flush() throws IOException {
            if (this.f37637b) {
                return;
            }
            a.this.f37622d.flush();
        }
    }

    /* JADX INFO: compiled from: Http1Codec.java */
    public class f extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f37640e;

        public f(long j10) throws IOException {
            super();
            this.f37640e = j10;
            if (j10 == 0) {
                a(true, null);
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http1.a.b, com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            }
            if (this.f37626b) {
                throw new IllegalStateException("closed");
            }
            long j11 = this.f37640e;
            if (j11 == 0) {
                return -1L;
            }
            long jB = super.b(cVar, Math.min(j11, j10));
            if (jB == -1) {
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a(false, protocolException);
                throw protocolException;
            }
            long j12 = this.f37640e - jB;
            this.f37640e = j12;
            if (j12 == 0) {
                a(true, null);
            }
            return jB;
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f37626b) {
                return;
            }
            if (this.f37640e != 0 && !com.mbridge.msdk.thrid.okhttp.internal.c.a(this, 100, TimeUnit.MILLISECONDS)) {
                a(false, null);
            }
            this.f37626b = true;
        }
    }

    /* JADX INFO: compiled from: Http1Codec.java */
    public class g extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f37642e;

        public g() {
            super();
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http1.a.b, com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            }
            if (this.f37626b) {
                throw new IllegalStateException("closed");
            }
            if (this.f37642e) {
                return -1L;
            }
            long jB = super.b(cVar, j10);
            if (jB != -1) {
                return jB;
            }
            this.f37642e = true;
            a(true, null);
            return -1L;
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f37626b) {
                return;
            }
            if (!this.f37642e) {
                a(false, null);
            }
            this.f37626b = true;
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public r a(y yVar, long j10) {
        if ("chunked".equalsIgnoreCase(yVar.a("Transfer-Encoding"))) {
            return c();
        }
        if (j10 != -1) {
            return a(j10);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void b() throws IOException {
        this.f37622d.flush();
    }

    private String e() throws IOException {
        String strD = this.f37621c.d(this.f37624f);
        this.f37624f -= (long) strD.length();
        return strD;
    }

    public s b(long j10) throws IOException {
        if (this.f37623e == 4) {
            this.f37623e = 5;
            return new f(j10);
        }
        throw new IllegalStateException("state: " + this.f37623e);
    }

    public r c() {
        if (this.f37623e == 1) {
            this.f37623e = 2;
            return new c();
        }
        throw new IllegalStateException("state: " + this.f37623e);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void cancel() {
        com.mbridge.msdk.thrid.okhttp.internal.connection.c cVarC = this.f37620b.c();
        if (cVarC != null) {
            cVarC.d();
        }
    }

    public s d() throws IOException {
        if (this.f37623e != 4) {
            throw new IllegalStateException("state: " + this.f37623e);
        }
        com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar = this.f37620b;
        if (gVar == null) {
            throw new IllegalStateException("streamAllocation == null");
        }
        this.f37623e = 5;
        gVar.e();
        return new g();
    }

    public com.mbridge.msdk.thrid.okhttp.r f() throws IOException {
        com.mbridge.msdk.thrid.okhttp.r.a aVar = new com.mbridge.msdk.thrid.okhttp.r.a();
        while (true) {
            String strE = e();
            if (strE.length() == 0) {
                return aVar.a();
            }
            com.mbridge.msdk.thrid.okhttp.internal.a.f37503a.a(aVar, strE);
        }
    }

    public a(v vVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, com.mbridge.msdk.thrid.okio.e eVar, com.mbridge.msdk.thrid.okio.d dVar) {
        this.f37619a = vVar;
        this.f37620b = gVar;
        this.f37621c = eVar;
        this.f37622d = dVar;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void a(y yVar) throws IOException {
        a(yVar.c(), com.mbridge.msdk.thrid.okhttp.internal.http.i.a(yVar, this.f37620b.c().c().b().type()));
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public b0 a(a0 a0Var) throws IOException {
        com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar = this.f37620b;
        gVar.f37578f.responseBodyStart(gVar.f37577e);
        String strB = a0Var.b("Content-Type");
        if (!com.mbridge.msdk.thrid.okhttp.internal.http.e.b(a0Var)) {
            return new h(strB, 0L, l.a(b(0L)));
        }
        if ("chunked".equalsIgnoreCase(a0Var.b("Transfer-Encoding"))) {
            return new h(strB, -1L, l.a(a(a0Var.s().g())));
        }
        long jA = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(a0Var);
        if (jA != -1) {
            return new h(strB, jA, l.a(b(jA)));
        }
        return new h(strB, -1L, l.a(d()));
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void a() throws IOException {
        this.f37622d.flush();
    }

    public void a(com.mbridge.msdk.thrid.okhttp.r rVar, String str) throws IOException {
        if (this.f37623e == 0) {
            this.f37622d.a(str).a("\r\n");
            int iB = rVar.b();
            for (int i10 = 0; i10 < iB; i10++) {
                this.f37622d.a(rVar.a(i10)).a(": ").a(rVar.b(i10)).a("\r\n");
            }
            this.f37622d.a("\r\n");
            this.f37623e = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.f37623e);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public a0.a a(boolean z10) throws IOException {
        int i10 = this.f37623e;
        if (i10 != 1 && i10 != 3) {
            throw new IllegalStateException("state: " + this.f37623e);
        }
        try {
            k kVarA = k.a(e());
            a0.a aVarA = new a0.a().a(kVarA.f37616a).a(kVarA.f37617b).a(kVarA.f37618c).a(f());
            if (z10 && kVarA.f37617b == 100) {
                return null;
            }
            if (kVarA.f37617b == 100) {
                this.f37623e = 3;
                return aVarA;
            }
            this.f37623e = 4;
            return aVarA;
        } catch (EOFException e10) {
            IOException iOException = new IOException("unexpected end of stream on " + this.f37620b);
            iOException.initCause(e10);
            throw iOException;
        }
    }

    public r a(long j10) {
        if (this.f37623e == 1) {
            this.f37623e = 2;
            return new e(j10);
        }
        throw new IllegalStateException("state: " + this.f37623e);
    }

    public s a(com.mbridge.msdk.thrid.okhttp.s sVar) throws IOException {
        if (this.f37623e == 4) {
            this.f37623e = 5;
            return new d(sVar);
        }
        throw new IllegalStateException("state: " + this.f37623e);
    }

    public void a(i iVar) {
        t tVarG = iVar.g();
        iVar.a(t.f38080d);
        tVarG.a();
        tVarG.b();
    }
}
