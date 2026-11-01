package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.SystemClock;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentResolver f17733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f17734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f17735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AssetFileDescriptor f17736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FileInputStream f17737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f17738f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f17739g;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(k kVar) throws e {
        try {
            Uri uri = kVar.f17747a;
            this.f17735c = uri;
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.f17733a.openAssetFileDescriptor(uri, "r");
            this.f17736d = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new FileNotFoundException("Could not open file descriptor for: " + this.f17735c);
            }
            this.f17737e = new FileInputStream(this.f17736d.getFileDescriptor());
            long startOffset = this.f17736d.getStartOffset();
            if (this.f17737e.skip(kVar.f17749c + startOffset) - startOffset != kVar.f17749c) {
                throw new EOFException();
            }
            long j10 = kVar.f17750d;
            if (j10 != -1) {
                this.f17738f = j10;
            } else {
                long length = this.f17736d.getLength();
                this.f17738f = length;
                if (length == -1) {
                    long jAvailable = this.f17737e.available();
                    this.f17738f = jAvailable;
                    if (jAvailable == 0) {
                        this.f17738f = -1L;
                    }
                }
            }
            this.f17739g = true;
            m mVar = this.f17734b;
            if (mVar != null) {
                synchronized (mVar) {
                    if (mVar.f17759b == 0) {
                        mVar.f17760c = SystemClock.elapsedRealtime();
                    }
                    mVar.f17759b++;
                }
            }
            return this.f17738f;
        } catch (IOException e10) {
            throw new e(e10);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x003d */
    /* JADX WARN: Bottom block not found for handler: all -> 0x005f */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r4 = this;
            r0 = 0
            r4.f17735c = r0
            r1 = 0
            java.io.FileInputStream r2 = r4.f17737e     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f
            if (r2 == 0) goto Lb
            r2.close()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f
        Lb:
            r4.f17737e = r0
            android.content.res.AssetFileDescriptor r2 = r4.f17736d     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L26
            if (r2 == 0) goto L14
            r2.close()     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L26
        L14:
            r4.f17736d = r0
            boolean r0 = r4.f17739g
            if (r0 == 0) goto L23
            r4.f17739g = r1
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.m r0 = r4.f17734b
            if (r0 == 0) goto L23
            r0.a()
        L23:
            return
        L24:
            r2 = move-exception
            goto L2d
        L26:
            r2 = move-exception
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.e r3 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.e     // Catch: java.lang.Throwable -> L24
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L24
            throw r3     // Catch: java.lang.Throwable -> L24
        L2d:
            r4.f17736d = r0
            boolean r0 = r4.f17739g
            if (r0 == 0) goto L3c
            r4.f17739g = r1
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.m r0 = r4.f17734b
            if (r0 == 0) goto L3c
            r0.a()
        L3c:
            throw r2
        L3d:
            r2 = move-exception
            goto L46
        L3f:
            r2 = move-exception
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.e r3 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.e     // Catch: java.lang.Throwable -> L3d
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L3d
            throw r3     // Catch: java.lang.Throwable -> L3d
        L46:
            r4.f17737e = r0
            android.content.res.AssetFileDescriptor r3 = r4.f17736d     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L61
            if (r3 == 0) goto L4f
            r3.close()     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L61
        L4f:
            r4.f17736d = r0
            boolean r0 = r4.f17739g
            if (r0 == 0) goto L5e
            r4.f17739g = r1
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.m r0 = r4.f17734b
            if (r0 == 0) goto L5e
            r0.a()
        L5e:
            throw r2
        L5f:
            r2 = move-exception
            goto L68
        L61:
            r2 = move-exception
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.e r3 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.e     // Catch: java.lang.Throwable -> L5f
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L5f
            throw r3     // Catch: java.lang.Throwable -> L5f
        L68:
            r4.f17736d = r0
            boolean r0 = r4.f17739g
            if (r0 == 0) goto L77
            r4.f17739g = r1
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.m r0 = r4.f17734b
            if (r0 == 0) goto L77
            r0.a()
        L77:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.upstream.f.close():void");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i10, int i11) throws e {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f17738f;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new e(e10);
            }
        }
        int i12 = this.f17737e.read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.f17738f == -1) {
                return -1;
            }
            throw new e(new EOFException());
        }
        long j11 = this.f17738f;
        if (j11 != -1) {
            this.f17738f = j11 - ((long) i12);
        }
        m mVar = this.f17734b;
        if (mVar != null) {
            synchronized (mVar) {
                mVar.f17761d += (long) i12;
            }
        }
        return i12;
    }

    public f(Context context, m mVar) {
        this.f17733a = context.getContentResolver();
        this.f17734b = mVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        return this.f17735c;
    }
}
