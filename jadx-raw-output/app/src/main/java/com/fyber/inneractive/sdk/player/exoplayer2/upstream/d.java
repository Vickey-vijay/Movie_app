package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.SystemClock;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AssetManager f17719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f17720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f17721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InputStream f17722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f17723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f17724f;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(k kVar) throws c {
        try {
            Uri uri = kVar.f17747a;
            this.f17721c = uri;
            String path = uri.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            InputStream inputStreamOpen = this.f17719a.open(path, 1);
            this.f17722d = inputStreamOpen;
            if (inputStreamOpen.skip(kVar.f17749c) < kVar.f17749c) {
                throw new EOFException();
            }
            long j10 = kVar.f17750d;
            if (j10 != -1) {
                this.f17723e = j10;
            } else {
                long jAvailable = this.f17722d.available();
                this.f17723e = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f17723e = -1L;
                }
            }
            this.f17724f = true;
            m mVar = this.f17720b;
            if (mVar != null) {
                synchronized (mVar) {
                    if (mVar.f17759b == 0) {
                        mVar.f17760c = SystemClock.elapsedRealtime();
                    }
                    mVar.f17759b++;
                }
            }
            return this.f17723e;
        } catch (IOException e10) {
            throw new c(e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        this.f17721c = null;
        try {
            try {
                InputStream inputStream = this.f17722d;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f17722d = null;
                if (this.f17724f) {
                    this.f17724f = false;
                    m mVar = this.f17720b;
                    if (mVar != null) {
                        mVar.a();
                    }
                }
            } catch (IOException e10) {
                throw new c(e10);
            }
        } catch (Throwable th2) {
            this.f17722d = null;
            if (this.f17724f) {
                this.f17724f = false;
                m mVar2 = this.f17720b;
                if (mVar2 != null) {
                    mVar2.a();
                }
            }
            throw th2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i10, int i11) throws c {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f17723e;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new c(e10);
            }
        }
        int i12 = this.f17722d.read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.f17723e == -1) {
                return -1;
            }
            throw new c(new EOFException());
        }
        long j11 = this.f17723e;
        if (j11 != -1) {
            this.f17723e = j11 - ((long) i12);
        }
        m mVar = this.f17720b;
        if (mVar != null) {
            synchronized (mVar) {
                mVar.f17761d += (long) i12;
            }
        }
        return i12;
    }

    public d(Context context, m mVar) {
        this.f17719a = context.getAssets();
        this.f17720b = mVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        return this.f17721c;
    }
}
