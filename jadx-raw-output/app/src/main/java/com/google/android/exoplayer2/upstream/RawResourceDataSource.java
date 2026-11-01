package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import e5.h;
import g5.k0;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public final class RawResourceDataSource extends e5.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Resources f20079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Uri f20080f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public AssetFileDescriptor f20081g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public InputStream f20082h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f20083i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f20084j;

    public static class RawResourceDataSourceException extends IOException {
        public RawResourceDataSourceException(String str) {
            super(str);
        }

        public RawResourceDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.f20079e = context.getResources();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0035 */
    @Override // com.google.android.exoplayer2.upstream.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() throws com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException {
        /*
            r4 = this;
            r0 = 0
            r4.f20080f = r0
            r1 = 0
            java.io.InputStream r2 = r4.f20082h     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L37
            if (r2 == 0) goto Lb
            r2.close()     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L37
        Lb:
            r4.f20082h = r0
            android.content.res.AssetFileDescriptor r2 = r4.f20081g     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L22
            if (r2 == 0) goto L14
            r2.close()     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L22
        L14:
            r4.f20081g = r0
            boolean r0 = r4.f20084j
            if (r0 == 0) goto L1f
            r4.f20084j = r1
            r4.d()
        L1f:
            return
        L20:
            r2 = move-exception
            goto L29
        L22:
            r2 = move-exception
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r3 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> L20
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L20
            throw r3     // Catch: java.lang.Throwable -> L20
        L29:
            r4.f20081g = r0
            boolean r0 = r4.f20084j
            if (r0 == 0) goto L34
            r4.f20084j = r1
            r4.d()
        L34:
            throw r2
        L35:
            r2 = move-exception
            goto L3e
        L37:
            r2 = move-exception
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r3 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> L35
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L35
            throw r3     // Catch: java.lang.Throwable -> L35
        L3e:
            r4.f20082h = r0
            android.content.res.AssetFileDescriptor r3 = r4.f20081g     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
            if (r3 == 0) goto L47
            r3.close()     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
        L47:
            r4.f20081g = r0
            boolean r0 = r4.f20084j
            if (r0 == 0) goto L52
            r4.f20084j = r1
            r4.d()
        L52:
            throw r2
        L53:
            r2 = move-exception
            goto L5c
        L55:
            r2 = move-exception
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r3 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> L53
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L53
            throw r3     // Catch: java.lang.Throwable -> L53
        L5c:
            r4.f20081g = r0
            boolean r0 = r4.f20084j
            if (r0 == 0) goto L67
            r4.f20084j = r1
            r4.d()
        L67:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.RawResourceDataSource.close():void");
    }

    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long a(h hVar) throws RawResourceDataSourceException {
        try {
            Uri uri = hVar.f52374a;
            this.f20080f = uri;
            if (!TextUtils.equals("rawresource", uri.getScheme())) {
                throw new RawResourceDataSourceException("URI must use scheme rawresource");
            }
            try {
                int i10 = Integer.parseInt((String) g5.a.e(uri.getLastPathSegment()));
                e(hVar);
                AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.f20079e.openRawResourceFd(i10);
                this.f20081g = assetFileDescriptorOpenRawResourceFd;
                if (assetFileDescriptorOpenRawResourceFd == null) {
                    throw new RawResourceDataSourceException("Resource is compressed: " + uri);
                }
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenRawResourceFd.getFileDescriptor());
                this.f20082h = fileInputStream;
                fileInputStream.skip(assetFileDescriptorOpenRawResourceFd.getStartOffset());
                if (fileInputStream.skip(hVar.f52379f) < hVar.f52379f) {
                    throw new EOFException();
                }
                long j10 = hVar.f52380g;
                long j11 = -1;
                if (j10 != -1) {
                    this.f20083i = j10;
                } else {
                    long length = assetFileDescriptorOpenRawResourceFd.getLength();
                    if (length != -1) {
                        j11 = length - hVar.f52379f;
                    }
                    this.f20083i = j11;
                }
                this.f20084j = true;
                f(hVar);
                return this.f20083i;
            } catch (NumberFormatException unused) {
                throw new RawResourceDataSourceException("Resource identifier must be an integer.");
            }
        } catch (IOException e10) {
            throw new RawResourceDataSourceException(e10);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    @Nullable
    public Uri getUri() {
        return this.f20080f;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public int read(byte[] bArr, int i10, int i11) throws RawResourceDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f20083i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new RawResourceDataSourceException(e10);
            }
        }
        int i12 = ((InputStream) k0.i(this.f20082h)).read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.f20083i == -1) {
                return -1;
            }
            throw new RawResourceDataSourceException(new EOFException());
        }
        long j11 = this.f20083i;
        if (j11 != -1) {
            this.f20083i = j11 - ((long) i12);
        }
        c(i12);
        return i12;
    }
}
