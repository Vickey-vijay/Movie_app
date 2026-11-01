package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSourceException;
import e5.h;
import e5.p;
import e5.q;
import f5.i;
import f5.j;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: CacheDataSource.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a implements com.google.android.exoplayer2.upstream.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cache f20119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.a f20120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final com.google.android.exoplayer2.upstream.a f20121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.a f20122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f5.d f20123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final InterfaceC0189a f20124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f20125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f20126h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f20127i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public com.google.android.exoplayer2.upstream.a f20128j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f20129k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public Uri f20130l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public Uri f20131m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f20132n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public byte[] f20133o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Map<String, String> f20134p = Collections.emptyMap();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f20135q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public String f20136r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f20137s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f20138t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public f5.e f20139u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f20140v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f20141w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f20142x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f20143y;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.cache.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CacheDataSource.java */
    public interface InterfaceC0189a {
        void onCacheIgnored(int i10);

        void onCachedBytesRead(long j10, long j11);
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() throws IOException {
        this.f20130l = null;
        this.f20131m = null;
        this.f20132n = 1;
        this.f20133o = null;
        this.f20134p = Collections.emptyMap();
        this.f20135q = 0;
        this.f20137s = 0L;
        this.f20136r = null;
        j();
        try {
            c();
        } catch (Throwable th2) {
            e(th2);
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        if (this.f20138t == 0) {
            return -1;
        }
        try {
            if (this.f20137s >= this.f20143y) {
                l(true);
            }
            int i12 = this.f20128j.read(bArr, i10, i11);
            if (i12 != -1) {
                if (g()) {
                    this.f20142x += (long) i12;
                }
                long j10 = i12;
                this.f20137s += j10;
                long j11 = this.f20138t;
                if (j11 != -1) {
                    this.f20138t = j11 - j10;
                }
            } else {
                if (!this.f20129k) {
                    long j12 = this.f20138t;
                    if (j12 <= 0) {
                        if (j12 == -1) {
                        }
                    }
                    c();
                    l(false);
                    return read(bArr, i10, i11);
                }
                m();
            }
            return i12;
        } catch (IOException e10) {
            if (this.f20129k && d.c(e10)) {
                m();
                return -1;
            }
            e(e10);
            throw e10;
        } catch (Throwable th2) {
            e(th2);
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long a(h hVar) throws IOException {
        try {
            String strA = this.f20123e.a(hVar);
            this.f20136r = strA;
            Uri uri = hVar.f52374a;
            this.f20130l = uri;
            this.f20131m = d(this.f20119a, strA, uri);
            this.f20132n = hVar.f52375b;
            this.f20133o = hVar.f52376c;
            this.f20134p = hVar.f52377d;
            this.f20135q = hVar.f52382i;
            this.f20137s = hVar.f52379f;
            int iN = n(hVar);
            boolean z10 = iN != -1;
            this.f20141w = z10;
            if (z10) {
                k(iN);
            }
            long j10 = hVar.f52380g;
            if (j10 != -1 || this.f20141w) {
                this.f20138t = j10;
            } else {
                long jA = i.a(this.f20119a.getContentMetadata(this.f20136r));
                this.f20138t = jA;
                if (jA != -1) {
                    long j11 = jA - hVar.f52379f;
                    this.f20138t = j11;
                    if (j11 <= 0) {
                        throw new DataSourceException(0);
                    }
                }
            }
            l(false);
            return this.f20138t;
        } catch (Throwable th2) {
            e(th2);
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void b(q qVar) {
        this.f20120b.b(qVar);
        this.f20122d.b(qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() throws IOException {
        com.google.android.exoplayer2.upstream.a aVar = this.f20128j;
        if (aVar == null) {
            return;
        }
        try {
            aVar.close();
        } finally {
            this.f20128j = null;
            this.f20129k = false;
            f5.e eVar = this.f20139u;
            if (eVar != null) {
                this.f20119a.a(eVar);
                this.f20139u = null;
            }
        }
    }

    public final boolean f() {
        return this.f20128j == this.f20122d;
    }

    public final boolean g() {
        return this.f20128j == this.f20120b;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    @Nullable
    public Uri getUri() {
        return this.f20131m;
    }

    public final boolean i() {
        return this.f20128j == this.f20121c;
    }

    public final void j() {
        InterfaceC0189a interfaceC0189a = this.f20124f;
        if (interfaceC0189a == null || this.f20142x <= 0) {
            return;
        }
        interfaceC0189a.onCachedBytesRead(this.f20119a.getCacheSpace(), this.f20142x);
        this.f20142x = 0L;
    }

    public final void k(int i10) {
        InterfaceC0189a interfaceC0189a = this.f20124f;
        if (interfaceC0189a != null) {
            interfaceC0189a.onCacheIgnored(i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00da  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ee A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x0114  */
    /* JADX WARN: Code duplicated, block: B:57:0x0116  */
    /* JADX WARN: Code duplicated, block: B:65:0x0138  */
    /* JADX WARN: Code duplicated, block: B:67:0x0149  */
    /* JADX WARN: Code duplicated, block: B:71:0x0154  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    public final void l(boolean z10) throws IOException {
        f5.e eVarStartReadWrite;
        long jMin;
        com.google.android.exoplayer2.upstream.a aVar;
        h hVar;
        f5.e eVar;
        h hVar2;
        com.google.android.exoplayer2.upstream.a aVar2;
        long j10;
        boolean z11;
        long jA;
        j jVar;
        if (this.f20141w) {
            eVarStartReadWrite = null;
        } else if (this.f20125g) {
            try {
                eVarStartReadWrite = this.f20119a.startReadWrite(this.f20136r, this.f20137s);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            eVarStartReadWrite = this.f20119a.startReadWriteNonBlocking(this.f20136r, this.f20137s);
        }
        if (eVarStartReadWrite != null) {
            if (eVarStartReadWrite.f52847e) {
                Uri uriFromFile = Uri.fromFile(eVarStartReadWrite.f52848f);
                long j11 = this.f20137s - eVarStartReadWrite.f52845c;
                long jMin2 = eVarStartReadWrite.f52846d - j11;
                long j12 = this.f20138t;
                if (j12 != -1) {
                    jMin2 = Math.min(jMin2, j12);
                }
                hVar2 = new h(uriFromFile, this.f20137s, j11, jMin2, this.f20136r, this.f20135q);
                aVar2 = this.f20120b;
            } else {
                if (eVarStartReadWrite.c()) {
                    jMin = this.f20138t;
                } else {
                    jMin = eVarStartReadWrite.f52846d;
                    long j13 = this.f20138t;
                    if (j13 != -1) {
                        jMin = Math.min(jMin, j13);
                    }
                }
                Uri uri = this.f20130l;
                int i10 = this.f20132n;
                byte[] bArr = this.f20133o;
                long j14 = this.f20137s;
                h hVar3 = new h(uri, i10, bArr, j14, j14, jMin, this.f20136r, this.f20135q, this.f20134p);
                aVar = this.f20121c;
                if (aVar != null) {
                    eVar = eVarStartReadWrite;
                    hVar = hVar3;
                } else {
                    aVar = this.f20122d;
                    this.f20119a.a(eVarStartReadWrite);
                    hVar = hVar3;
                    eVar = null;
                }
            }
            if (this.f20141w && aVar == this.f20122d) {
                j10 = this.f20137s + 102400;
            } else {
                j10 = Long.MAX_VALUE;
            }
            this.f20143y = j10;
            if (z10) {
                g5.a.f(f());
                if (aVar == this.f20122d) {
                    return;
                }
                try {
                    c();
                } catch (Throwable th2) {
                    if (!eVar.b()) {
                        throw th2;
                    }
                    this.f20119a.a(eVar);
                    throw th2;
                }
            }
            if (eVar != null && eVar.b()) {
                this.f20139u = eVar;
            }
            this.f20128j = aVar;
            if (hVar.f52380g == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f20129k = z11;
            jA = aVar.a(hVar);
            jVar = new j();
            if (this.f20129k && jA != -1) {
                this.f20138t = jA;
                j.g(jVar, this.f20137s + jA);
            }
            if (h()) {
                Uri uri2 = this.f20128j.getUri();
                this.f20131m = uri2;
                j.h(jVar, this.f20130l.equals(uri2) ^ true ? this.f20131m : null);
            }
            if (i()) {
                this.f20119a.c(this.f20136r, jVar);
            }
        }
        aVar2 = this.f20122d;
        Uri uri3 = this.f20130l;
        int i11 = this.f20132n;
        byte[] bArr2 = this.f20133o;
        long j15 = this.f20137s;
        hVar2 = new h(uri3, i11, bArr2, j15, j15, this.f20138t, this.f20136r, this.f20135q, this.f20134p);
        aVar = aVar2;
        eVar = eVarStartReadWrite;
        hVar = hVar2;
        if (this.f20141w) {
            j10 = Long.MAX_VALUE;
        } else {
            j10 = Long.MAX_VALUE;
        }
        this.f20143y = j10;
        if (z10) {
            g5.a.f(f());
            if (aVar == this.f20122d) {
                return;
            } else {
                c();
            }
        }
        if (eVar != null) {
            this.f20139u = eVar;
        }
        this.f20128j = aVar;
        if (hVar.f52380g == -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f20129k = z11;
        jA = aVar.a(hVar);
        jVar = new j();
        if (this.f20129k) {
            this.f20138t = jA;
            j.g(jVar, this.f20137s + jA);
        }
        if (h()) {
            Uri uri4 = this.f20128j.getUri();
            this.f20131m = uri4;
            j.h(jVar, this.f20130l.equals(uri4) ^ true ? this.f20131m : null);
        }
        if (i()) {
            this.f20119a.c(this.f20136r, jVar);
        }
    }

    public final void m() throws IOException {
        this.f20138t = 0L;
        if (i()) {
            j jVar = new j();
            j.g(jVar, this.f20137s);
            this.f20119a.c(this.f20136r, jVar);
        }
    }

    public final int n(h hVar) {
        if (this.f20126h && this.f20140v) {
            return 0;
        }
        return (this.f20127i && hVar.f52380g == -1) ? 1 : -1;
    }

    public a(Cache cache, com.google.android.exoplayer2.upstream.a aVar, com.google.android.exoplayer2.upstream.a aVar2, @Nullable e5.f fVar, int i10, @Nullable InterfaceC0189a interfaceC0189a, @Nullable f5.d dVar) {
        boolean z10;
        boolean z11;
        this.f20119a = cache;
        this.f20120b = aVar2;
        this.f20123e = dVar == null ? d.f20151a : dVar;
        if ((i10 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f20125g = z10;
        if ((i10 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f20126h = z11;
        this.f20127i = (i10 & 4) != 0;
        this.f20122d = aVar;
        if (fVar != null) {
            this.f20121c = new p(aVar, fVar);
        } else {
            this.f20121c = null;
        }
        this.f20124f = interfaceC0189a;
    }

    public static Uri d(Cache cache, String str, Uri uri) {
        Uri uriB = i.b(cache.getContentMetadata(str));
        if (uriB != null) {
            return uriB;
        }
        return uri;
    }

    public final void e(Throwable th2) {
        if (g() || (th2 instanceof Cache.CacheException)) {
            this.f20140v = true;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Map<String, List<String>> getResponseHeaders() {
        if (h()) {
            return this.f20122d.getResponseHeaders();
        }
        return Collections.emptyMap();
    }

    public final boolean h() {
        return !g();
    }
}
