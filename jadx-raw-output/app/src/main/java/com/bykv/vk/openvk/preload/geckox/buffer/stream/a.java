package com.bykv.vk.openvk.preload.geckox.buffer.stream;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: BufferInputStream.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.geckox.buffer.a f10615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f10616b;

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i10) {
        this.f10616b = i10;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return this.f10615a.b(bArr);
    }

    @Override // java.io.InputStream
    public final synchronized void reset() throws IOException {
        this.f10615a.b(this.f10616b);
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        long jB = this.f10615a.b() - this.f10615a.c();
        if (jB > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) jB;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        return this.f10615a.b(bArr, i10, i11);
    }

    @Override // java.io.InputStream
    public final long skip(long j10) throws IOException {
        return this.f10615a.a(j10);
    }

    public a(com.bykv.vk.openvk.preload.geckox.buffer.a aVar) {
        this.f10615a = aVar;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        return this.f10615a.d();
    }
}
