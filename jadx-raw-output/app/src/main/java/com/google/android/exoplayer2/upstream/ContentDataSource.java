package com.google.android.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.annotation.Nullable;
import e5.h;
import g5.k0;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes11.dex */
public final class ContentDataSource extends e5.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ContentResolver f20045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Uri f20046f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public AssetFileDescriptor f20047g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public FileInputStream f20048h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f20049i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f20050j;

    public ContentDataSource(Context context) {
        super(false);
        this.f20045e = context.getContentResolver();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0035 */
    @Override // com.google.android.exoplayer2.upstream.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() throws com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException {
        /*
            r4 = this;
            r0 = 0
            r4.f20046f = r0
            r1 = 0
            java.io.FileInputStream r2 = r4.f20048h     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L37
            if (r2 == 0) goto Lb
            r2.close()     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L37
        Lb:
            r4.f20048h = r0
            android.content.res.AssetFileDescriptor r2 = r4.f20047g     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L22
            if (r2 == 0) goto L14
            r2.close()     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L22
        L14:
            r4.f20047g = r0
            boolean r0 = r4.f20050j
            if (r0 == 0) goto L1f
            r4.f20050j = r1
            r4.d()
        L1f:
            return
        L20:
            r2 = move-exception
            goto L29
        L22:
            r2 = move-exception
            com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException r3 = new com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> L20
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L20
            throw r3     // Catch: java.lang.Throwable -> L20
        L29:
            r4.f20047g = r0
            boolean r0 = r4.f20050j
            if (r0 == 0) goto L34
            r4.f20050j = r1
            r4.d()
        L34:
            throw r2
        L35:
            r2 = move-exception
            goto L3e
        L37:
            r2 = move-exception
            com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException r3 = new com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> L35
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L35
            throw r3     // Catch: java.lang.Throwable -> L35
        L3e:
            r4.f20048h = r0
            android.content.res.AssetFileDescriptor r3 = r4.f20047g     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
            if (r3 == 0) goto L47
            r3.close()     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
        L47:
            r4.f20047g = r0
            boolean r0 = r4.f20050j
            if (r0 == 0) goto L52
            r4.f20050j = r1
            r4.d()
        L52:
            throw r2
        L53:
            r2 = move-exception
            goto L5c
        L55:
            r2 = move-exception
            com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException r3 = new com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> L53
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L53
            throw r3     // Catch: java.lang.Throwable -> L53
        L5c:
            r4.f20047g = r0
            boolean r0 = r4.f20050j
            if (r0 == 0) goto L67
            r4.f20050j = r1
            r4.d()
        L67:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.ContentDataSource.close():void");
    }

    public static class ContentDataSourceException extends IOException {
        public ContentDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long a(h hVar) throws ContentDataSourceException {
        try {
            Uri uri = hVar.f52374a;
            this.f20046f = uri;
            e(hVar);
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.f20045e.openAssetFileDescriptor(uri, "r");
            this.f20047g = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new FileNotFoundException("Could not open file descriptor for: " + uri);
            }
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f20048h = fileInputStream;
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(hVar.f52379f + startOffset) - startOffset;
            if (jSkip != hVar.f52379f) {
                throw new EOFException();
            }
            long j10 = hVar.f52380g;
            long jPosition = -1;
            if (j10 != -1) {
                this.f20049i = j10;
            } else {
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size != 0) {
                        jPosition = size - channel.position();
                    }
                    this.f20049i = jPosition;
                } else {
                    this.f20049i = length - jSkip;
                }
            }
            this.f20050j = true;
            f(hVar);
            return this.f20049i;
        } catch (IOException e10) {
            throw new ContentDataSourceException(e10);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    @Nullable
    public Uri getUri() {
        return this.f20046f;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public int read(byte[] bArr, int i10, int i11) throws ContentDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f20049i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new ContentDataSourceException(e10);
            }
        }
        int i12 = ((FileInputStream) k0.i(this.f20048h)).read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.f20049i == -1) {
                return -1;
            }
            throw new ContentDataSourceException(new EOFException());
        }
        long j11 = this.f20049i;
        if (j11 != -1) {
            this.f20049i = j11 - ((long) i12);
        }
        c(i12);
        return i12;
    }
}
