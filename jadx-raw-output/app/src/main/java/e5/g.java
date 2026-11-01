package e5;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: DataSourceInputStream.java */
/* JADX INFO: loaded from: classes10.dex */
public final class g extends InputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.a f52368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f52369c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f52373g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f52371e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f52372f = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f52370d = new byte[1];

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f52370d) == -1) {
            return -1;
        }
        return this.f52370d[0] & 255;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f52372f) {
            return;
        }
        this.f52368b.close();
        this.f52372f = true;
    }

    public final void d() throws IOException {
        if (this.f52371e) {
            return;
        }
        this.f52368b.a(this.f52369c);
        this.f52371e = true;
    }

    public g(com.google.android.exoplayer2.upstream.a aVar, h hVar) {
        this.f52368b = aVar;
        this.f52369c = hVar;
    }

    public void h() throws IOException {
        d();
    }

    @Override // java.io.InputStream
    public int read(@NonNull byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(@NonNull byte[] bArr, int i10, int i11) throws IOException {
        g5.a.f(!this.f52372f);
        d();
        int i12 = this.f52368b.read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        this.f52373g += (long) i12;
        return i12;
    }
}
