package com.google.android.exoplayer2.upstream.cache;

import e5.h;
import g5.k0;
import g5.m;
import g5.y;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class CacheDataSink implements e5.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cache f20109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f20110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f20112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f20113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public File f20114f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public OutputStream f20115g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f20116h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f20117i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public y f20118j;

    public static class CacheDataSinkException extends Cache.CacheException {
        public CacheDataSinkException(IOException iOException) {
            super(iOException);
        }
    }

    @Override // e5.f
    public void a(h hVar) throws CacheDataSinkException {
        if (hVar.f52380g == -1 && hVar.d(2)) {
            this.f20112d = null;
            return;
        }
        this.f20112d = hVar;
        this.f20113e = hVar.d(4) ? this.f20110b : Long.MAX_VALUE;
        this.f20117i = 0L;
        try {
            c();
        } catch (IOException e10) {
            throw new CacheDataSinkException(e10);
        }
    }

    public final void b() throws IOException {
        OutputStream outputStream = this.f20115g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            k0.n(this.f20115g);
            this.f20115g = null;
            File file = this.f20114f;
            this.f20114f = null;
            this.f20109a.commitFile(file, this.f20116h);
        } catch (Throwable th2) {
            k0.n(this.f20115g);
            this.f20115g = null;
            File file2 = this.f20114f;
            this.f20114f = null;
            file2.delete();
            throw th2;
        }
    }

    public final void c() throws IOException {
        long j10 = this.f20112d.f52380g;
        long jMin = j10 != -1 ? Math.min(j10 - this.f20117i, this.f20113e) : -1L;
        Cache cache = this.f20109a;
        h hVar = this.f20112d;
        this.f20114f = cache.startFile(hVar.f52381h, hVar.f52378e + this.f20117i, jMin);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f20114f);
        if (this.f20111c > 0) {
            y yVar = this.f20118j;
            if (yVar == null) {
                this.f20118j = new y(fileOutputStream, this.f20111c);
            } else {
                yVar.a(fileOutputStream);
            }
            this.f20115g = this.f20118j;
        } else {
            this.f20115g = fileOutputStream;
        }
        this.f20116h = 0L;
    }

    @Override // e5.f
    public void close() throws CacheDataSinkException {
        if (this.f20112d == null) {
            return;
        }
        try {
            b();
        } catch (IOException e10) {
            throw new CacheDataSinkException(e10);
        }
    }

    @Override // e5.f
    public void write(byte[] bArr, int i10, int i11) throws CacheDataSinkException {
        if (this.f20112d == null) {
            return;
        }
        int i12 = 0;
        while (i12 < i11) {
            try {
                if (this.f20116h == this.f20113e) {
                    b();
                    c();
                }
                int iMin = (int) Math.min(i11 - i12, this.f20113e - this.f20116h);
                this.f20115g.write(bArr, i10 + i12, iMin);
                i12 += iMin;
                long j10 = iMin;
                this.f20116h += j10;
                this.f20117i += j10;
            } catch (IOException e10) {
                throw new CacheDataSinkException(e10);
            }
        }
    }

    public CacheDataSink(Cache cache, long j10, int i10) {
        boolean z10;
        if (j10 <= 0 && j10 != -1) {
            z10 = false;
        } else {
            z10 = true;
        }
        g5.a.g(z10, "fragmentSize must be positive or C.LENGTH_UNSET.");
        if (j10 != -1 && j10 < 2097152) {
            m.h("CacheDataSink", "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        this.f20109a = (Cache) g5.a.e(cache);
        this.f20110b = j10 == -1 ? Long.MAX_VALUE : j10;
        this.f20111c = i10;
    }
}
