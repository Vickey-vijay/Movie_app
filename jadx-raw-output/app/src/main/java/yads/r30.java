package yads;

import java.io.InputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class r30 extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p30 f82087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u30 f82088b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f82090d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f82091e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f82089c = new byte[1];

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f82089c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return this.f82089c[0] & 255;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f82091e) {
            return;
        }
        this.f82087a.close();
        this.f82091e = true;
    }

    public r30(r33 r33Var, u30 u30Var) {
        this.f82087a = r33Var;
        this.f82088b = u30Var;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        if (!this.f82091e) {
            if (!this.f82090d) {
                this.f82087a.a(this.f82088b);
                this.f82090d = true;
            }
            int i12 = this.f82087a.read(bArr, i10, i11);
            if (i12 == -1) {
                return -1;
            }
            return i12;
        }
        throw new IllegalStateException();
    }
}
