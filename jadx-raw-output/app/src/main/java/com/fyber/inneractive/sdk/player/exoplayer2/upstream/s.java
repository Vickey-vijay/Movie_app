package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import android.os.SystemClock;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes9.dex */
public final class s implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f17794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RandomAccessFile f17795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f17796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f17797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17798e;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(k kVar) throws r {
        try {
            this.f17796c = kVar.f17747a;
            RandomAccessFile randomAccessFile = new RandomAccessFile(kVar.f17747a.getPath(), "r");
            this.f17795b = randomAccessFile;
            randomAccessFile.seek(kVar.f17749c);
            long length = kVar.f17750d;
            if (length == -1) {
                length = this.f17795b.length() - kVar.f17749c;
            }
            this.f17797d = length;
            if (length < 0) {
                throw new EOFException();
            }
            this.f17798e = true;
            m mVar = this.f17794a;
            if (mVar != null) {
                synchronized (mVar) {
                    if (mVar.f17759b == 0) {
                        mVar.f17760c = SystemClock.elapsedRealtime();
                    }
                    mVar.f17759b++;
                }
            }
            return this.f17797d;
        } catch (IOException e10) {
            throw new r(e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        this.f17796c = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f17795b;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f17795b = null;
                if (this.f17798e) {
                    this.f17798e = false;
                    m mVar = this.f17794a;
                    if (mVar != null) {
                        mVar.a();
                    }
                }
            } catch (IOException e10) {
                throw new r(e10);
            }
        } catch (Throwable th2) {
            this.f17795b = null;
            if (this.f17798e) {
                this.f17798e = false;
                m mVar2 = this.f17794a;
                if (mVar2 != null) {
                    mVar2.a();
                }
            }
            throw th2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i10, int i11) throws r {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f17797d;
        if (j10 == 0) {
            return -1;
        }
        try {
            int i12 = this.f17795b.read(bArr, i10, (int) Math.min(j10, i11));
            if (i12 > 0) {
                long j11 = i12;
                this.f17797d -= j11;
                m mVar = this.f17794a;
                if (mVar != null) {
                    synchronized (mVar) {
                        mVar.f17761d += j11;
                    }
                }
            }
            return i12;
        } catch (IOException e10) {
            throw new r(e10);
        }
    }

    public s(m mVar) {
        this.f17794a = mVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        return this.f17796c;
    }
}
