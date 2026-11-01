package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.Nullable;
import e5.h;
import g5.k0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class AssetDataSource extends e5.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AssetManager f20040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Uri f20041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public InputStream f20042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f20043h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f20044i;

    public AssetDataSource(Context context) {
        super(false);
        this.f20040e = context.getAssets();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0017 */
    @Override // com.google.android.exoplayer2.upstream.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() throws com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException {
        /*
            r4 = this;
            r0 = 0
            r4.f20041f = r0
            r1 = 0
            java.io.InputStream r2 = r4.f20042g     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            if (r2 == 0) goto Lb
            r2.close()     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
        Lb:
            r4.f20042g = r0
            boolean r0 = r4.f20044i
            if (r0 == 0) goto L16
            r4.f20044i = r1
            r4.d()
        L16:
            return
        L17:
            r2 = move-exception
            goto L20
        L19:
            r2 = move-exception
            com.google.android.exoplayer2.upstream.AssetDataSource$AssetDataSourceException r3 = new com.google.android.exoplayer2.upstream.AssetDataSource$AssetDataSourceException     // Catch: java.lang.Throwable -> L17
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L17
            throw r3     // Catch: java.lang.Throwable -> L17
        L20:
            r4.f20042g = r0
            boolean r0 = r4.f20044i
            if (r0 == 0) goto L2b
            r4.f20044i = r1
            r4.d()
        L2b:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.AssetDataSource.close():void");
    }

    public static final class AssetDataSourceException extends IOException {
        public AssetDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long a(h hVar) throws AssetDataSourceException {
        try {
            Uri uri = hVar.f52374a;
            this.f20041f = uri;
            String strSubstring = (String) g5.a.e(uri.getPath());
            if (strSubstring.startsWith("/android_asset/")) {
                strSubstring = strSubstring.substring(15);
            } else if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            e(hVar);
            InputStream inputStreamOpen = this.f20040e.open(strSubstring, 1);
            this.f20042g = inputStreamOpen;
            if (inputStreamOpen.skip(hVar.f52379f) < hVar.f52379f) {
                throw new EOFException();
            }
            long j10 = hVar.f52380g;
            if (j10 != -1) {
                this.f20043h = j10;
            } else {
                long jAvailable = this.f20042g.available();
                this.f20043h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f20043h = -1L;
                }
            }
            this.f20044i = true;
            f(hVar);
            return this.f20043h;
        } catch (IOException e10) {
            throw new AssetDataSourceException(e10);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    @Nullable
    public Uri getUri() {
        return this.f20041f;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public int read(byte[] bArr, int i10, int i11) throws AssetDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f20043h;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new AssetDataSourceException(e10);
            }
        }
        int i12 = ((InputStream) k0.i(this.f20042g)).read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.f20043h == -1) {
                return -1;
            }
            throw new AssetDataSourceException(new EOFException());
        }
        long j11 = this.f20043h;
        if (j11 != -1) {
            this.f20043h = j11 - ((long) i12);
        }
        c(i12);
        return i12;
    }
}
