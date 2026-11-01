package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.e0;
import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f17668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f17669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f17670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f17671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f17672e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f17673f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f17674g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f17675h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f17676i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Uri f17677j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17678k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f17679l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f17680m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f17681n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public m f17682o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f17683p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f17684q;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar) throws IOException {
        try {
            Uri uri = kVar.f17747a;
            this.f17677j = uri;
            this.f17678k = kVar.f17752f;
            String string = kVar.f17751e;
            if (string == null) {
                string = uri.toString();
            }
            this.f17679l = string;
            this.f17680m = kVar.f17749c;
            boolean z10 = (this.f17673f && this.f17683p) || (kVar.f17750d == -1 && this.f17674g);
            this.f17684q = z10;
            long j10 = kVar.f17750d;
            if (j10 != -1 || z10) {
                this.f17681n = j10;
            } else {
                long jA = this.f17668a.a(string);
                this.f17681n = jA;
                if (jA != -1) {
                    long j11 = jA - kVar.f17749c;
                    this.f17681n = j11;
                    if (j11 <= 0) {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.i();
                    }
                }
            }
            a(true);
            return this.f17681n;
        } catch (IOException e10) {
            if (this.f17675h == this.f17669b || (e10 instanceof a)) {
                this.f17683p = true;
            }
            throw e10;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() throws IOException {
        this.f17677j = null;
        try {
            b();
        } catch (IOException e10) {
            if (this.f17675h == this.f17669b || (e10 instanceof a)) {
                this.f17683p = true;
            }
            throw e10;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        if (this.f17681n == 0) {
            return -1;
        }
        try {
            int i12 = this.f17675h.read(bArr, i10, i11);
            if (i12 >= 0) {
                long j10 = i12;
                this.f17680m += j10;
                long j11 = this.f17681n;
                if (j11 != -1) {
                    this.f17681n = j11 - j10;
                }
            } else {
                if (this.f17676i) {
                    a(this.f17680m);
                    this.f17681n = 0L;
                }
                b();
                long j12 = this.f17681n;
                if ((j12 > 0 || j12 == -1) && a(false)) {
                    return read(bArr, i10, i11);
                }
            }
            return i12;
        } catch (IOException e10) {
            if (this.f17675h == this.f17669b || (e10 instanceof a)) {
                this.f17683p = true;
            }
            throw e10;
        }
    }

    public final void b() {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar = this.f17675h;
        if (hVar == null) {
            return;
        }
        try {
            hVar.close();
            this.f17675h = null;
            this.f17676i = false;
            m mVar = this.f17682o;
            if (mVar != null) {
                l lVar = this.f17668a;
                synchronized (lVar) {
                    if (mVar != lVar.f17712c.remove(mVar.f17689a)) {
                        throw new IllegalStateException();
                    }
                    lVar.notifyAll();
                }
                this.f17682o = null;
            }
        } catch (Throwable th2) {
            m mVar2 = this.f17682o;
            if (mVar2 != null) {
                this.f17668a.b(mVar2);
                this.f17682o = null;
            }
            throw th2;
        }
    }

    public e(l lVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar2, c cVar) {
        this.f17668a = lVar;
        this.f17669b = hVar2;
        this.f17671d = hVar;
        if (cVar != null) {
            this.f17670c = new e0(hVar, cVar);
        } else {
            this.f17670c = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar = this.f17675h;
        return hVar == this.f17671d ? hVar.a() : this.f17677j;
    }

    public final boolean a(boolean z10) throws IOException {
        m mVarA;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar2;
        IOException iOException = null;
        if (this.f17684q) {
            mVarA = null;
        } else if (this.f17672e) {
            try {
                l lVar = this.f17668a;
                String str = this.f17679l;
                long j10 = this.f17680m;
                synchronized (lVar) {
                    while (true) {
                        mVarA = lVar.a(str, j10);
                        if (mVarA != null) {
                            break;
                        }
                        lVar.wait();
                    }
                }
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        } else {
            mVarA = this.f17668a.a(this.f17679l, this.f17680m);
        }
        if (mVarA == null) {
            this.f17675h = this.f17671d;
            Uri uri = this.f17677j;
            long j11 = this.f17680m;
            kVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.k(uri, j11, j11, this.f17681n, this.f17679l, this.f17678k);
        } else {
            if (mVarA.f17692d) {
                Uri uriFromFile = Uri.fromFile(mVarA.f17693e);
                long j12 = this.f17680m - mVarA.f17690b;
                long jMin = mVarA.f17691c - j12;
                long j13 = this.f17681n;
                if (j13 != -1) {
                    jMin = Math.min(jMin, j13);
                }
                kVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.k(uriFromFile, this.f17680m, j12, jMin, this.f17679l, this.f17678k);
                this.f17675h = this.f17669b;
            } else {
                long jMin2 = mVarA.f17691c;
                if (jMin2 == -1) {
                    jMin2 = this.f17681n;
                } else {
                    long j14 = this.f17681n;
                    if (j14 != -1) {
                        jMin2 = Math.min(jMin2, j14);
                    }
                }
                Uri uri2 = this.f17677j;
                long j15 = this.f17680m;
                kVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.k(uri2, j15, j15, jMin2, this.f17679l, this.f17678k);
                e0 e0Var = this.f17670c;
                if (e0Var != null) {
                    this.f17675h = e0Var;
                    this.f17682o = mVarA;
                } else {
                    this.f17675h = this.f17671d;
                    this.f17668a.b(mVarA);
                }
            }
            kVar2 = kVar;
        }
        boolean z11 = true;
        this.f17676i = kVar2.f17750d == -1;
        long jA = 0;
        try {
            jA = this.f17675h.a(kVar2);
        } catch (IOException e10) {
            if (!z10 && this.f17676i) {
                Throwable cause = e10;
                while (true) {
                    if (cause == null) {
                        iOException = e10;
                        break;
                    }
                    if ((cause instanceof com.fyber.inneractive.sdk.player.exoplayer2.upstream.i) && ((com.fyber.inneractive.sdk.player.exoplayer2.upstream.i) cause).f17740a == 0) {
                        break;
                    }
                    cause = cause.getCause();
                }
            } else {
                iOException = e10;
                break;
            }
            if (iOException != null) {
                throw iOException;
            }
            z11 = false;
        }
        if (this.f17676i && jA != -1) {
            this.f17681n = jA;
            a(kVar2.f17749c + jA);
        }
        return z11;
    }

    public final void a(long j10) {
        if (this.f17675h == this.f17670c) {
            l lVar = this.f17668a;
            String str = this.f17679l;
            synchronized (lVar) {
                i iVar = lVar.f17713d;
                h hVar = (h) iVar.f17699a.get(str);
                if (hVar == null) {
                    iVar.a(str, j10);
                } else if (hVar.f17698d != j10) {
                    hVar.f17698d = j10;
                    iVar.f17704f = true;
                }
                lVar.f17713d.b();
            }
        }
    }
}
