package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import e5.h;
import e5.q;
import g5.k0;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes7.dex */
public final class FileDataSource extends e5.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public RandomAccessFile f20051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Uri f20052f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f20053g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f20054h;

    public static class FileDataSourceException extends IOException {
        public FileDataSourceException(IOException iOException) {
            super(iOException);
        }

        public FileDataSourceException(String str, IOException iOException) {
            super(str, iOException);
        }
    }

    public static final class a implements com.google.android.exoplayer2.upstream.a.InterfaceC0188a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public q f20055a;

        @Override // com.google.android.exoplayer2.upstream.a.InterfaceC0188a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FileDataSource createDataSource() {
            FileDataSource fileDataSource = new FileDataSource();
            q qVar = this.f20055a;
            if (qVar != null) {
                fileDataSource.b(qVar);
            }
            return fileDataSource;
        }
    }

    public FileDataSource() {
        super(false);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0017 */
    @Override // com.google.android.exoplayer2.upstream.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() throws com.google.android.exoplayer2.upstream.FileDataSource.FileDataSourceException {
        /*
            r4 = this;
            r0 = 0
            r4.f20052f = r0
            r1 = 0
            java.io.RandomAccessFile r2 = r4.f20051e     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            if (r2 == 0) goto Lb
            r2.close()     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
        Lb:
            r4.f20051e = r0
            boolean r0 = r4.f20054h
            if (r0 == 0) goto L16
            r4.f20054h = r1
            r4.d()
        L16:
            return
        L17:
            r2 = move-exception
            goto L20
        L19:
            r2 = move-exception
            com.google.android.exoplayer2.upstream.FileDataSource$FileDataSourceException r3 = new com.google.android.exoplayer2.upstream.FileDataSource$FileDataSourceException     // Catch: java.lang.Throwable -> L17
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L17
            throw r3     // Catch: java.lang.Throwable -> L17
        L20:
            r4.f20051e = r0
            boolean r0 = r4.f20054h
            if (r0 == 0) goto L2b
            r4.f20054h = r1
            r4.d()
        L2b:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.FileDataSource.close():void");
    }

    public static RandomAccessFile g(Uri uri) throws FileDataSourceException {
        try {
            return new RandomAccessFile((String) g5.a.e(uri.getPath()), "r");
        } catch (FileNotFoundException e10) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException(e10);
            }
            throw new FileDataSourceException(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e10);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long a(h hVar) throws FileDataSourceException {
        try {
            Uri uri = hVar.f52374a;
            this.f20052f = uri;
            e(hVar);
            RandomAccessFile randomAccessFileG = g(uri);
            this.f20051e = randomAccessFileG;
            randomAccessFileG.seek(hVar.f52379f);
            long length = hVar.f52380g;
            if (length == -1) {
                length = this.f20051e.length() - hVar.f52379f;
            }
            this.f20053g = length;
            if (length < 0) {
                throw new EOFException();
            }
            this.f20054h = true;
            f(hVar);
            return this.f20053g;
        } catch (IOException e10) {
            throw new FileDataSourceException(e10);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    @Nullable
    public Uri getUri() {
        return this.f20052f;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public int read(byte[] bArr, int i10, int i11) throws FileDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        if (this.f20053g == 0) {
            return -1;
        }
        try {
            int i12 = ((RandomAccessFile) k0.i(this.f20051e)).read(bArr, i10, (int) Math.min(this.f20053g, i11));
            if (i12 > 0) {
                this.f20053g -= (long) i12;
                c(i12);
            }
            return i12;
        } catch (IOException e10) {
            throw new FileDataSourceException(e10);
        }
    }
}
