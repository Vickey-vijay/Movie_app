package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f17741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f17742b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f17746f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17744d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17745e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f17743c = new byte[1];

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f17743c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return this.f17743c[0] & 255;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f17745e) {
            return;
        }
        this.f17741a.close();
        this.f17745e = true;
    }

    public j(h hVar, k kVar) {
        this.f17741a = hVar;
        this.f17742b = kVar;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        if (!this.f17745e) {
            if (!this.f17744d) {
                this.f17741a.a(this.f17742b);
                this.f17744d = true;
            }
            int i12 = this.f17741a.read(bArr, i10, i11);
            if (i12 == -1) {
                return -1;
            }
            this.f17746f += (long) i12;
            return i12;
        }
        throw new IllegalStateException();
    }
}
