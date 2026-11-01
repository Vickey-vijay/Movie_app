package com.mbridge.msdk.thrid.okio;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: RealBufferedSink.java */
/* JADX INFO: loaded from: classes11.dex */
final class m implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f38062a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f38063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f38064c;

    @Override // com.mbridge.msdk.thrid.okio.d
    public c a() {
        return this.f38062a;
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d write(byte[] bArr) throws IOException {
        if (this.f38064c) {
            throw new IllegalStateException("closed");
        }
        this.f38062a.write(bArr);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public void a(c cVar, long j10) throws IOException {
        if (this.f38064c) {
            throw new IllegalStateException("closed");
        }
        this.f38062a.a(cVar, j10);
        d();
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public t b() {
        return this.f38063b.b();
    }

    @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f38064c) {
            return;
        }
        Throwable th2 = null;
        try {
            c cVar = this.f38062a;
            long j10 = cVar.f38037b;
            if (j10 > 0) {
                this.f38063b.a(cVar, j10);
            }
        } catch (Throwable th3) {
            th2 = th3;
        }
        try {
            this.f38063b.close();
        } catch (Throwable th4) {
            if (th2 == null) {
                th2 = th4;
            }
        }
        this.f38064c = true;
        if (th2 != null) {
            u.a(th2);
        }
    }

    public d d() throws IOException {
        if (this.f38064c) {
            throw new IllegalStateException("closed");
        }
        long jM = this.f38062a.m();
        if (jM > 0) {
            this.f38063b.a(this.f38062a, jM);
        }
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.d, com.mbridge.msdk.thrid.okio.r, java.io.Flushable
    public void flush() throws IOException {
        if (this.f38064c) {
            throw new IllegalStateException("closed");
        }
        c cVar = this.f38062a;
        long j10 = cVar.f38037b;
        if (j10 > 0) {
            this.f38063b.a(cVar, j10);
        }
        this.f38063b.flush();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f38064c;
    }

    public String toString() {
        return "buffer(" + this.f38063b + ")";
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d writeByte(int i10) throws IOException {
        if (this.f38064c) {
            throw new IllegalStateException("closed");
        }
        this.f38062a.writeByte(i10);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d writeInt(int i10) throws IOException {
        if (this.f38064c) {
            throw new IllegalStateException("closed");
        }
        this.f38062a.writeInt(i10);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d writeShort(int i10) throws IOException {
        if (this.f38064c) {
            throw new IllegalStateException("closed");
        }
        this.f38062a.writeShort(i10);
        return d();
    }

    public m(r rVar) {
        if (rVar != null) {
            this.f38063b = rVar;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d write(byte[] bArr, int i10, int i11) throws IOException {
        if (!this.f38064c) {
            this.f38062a.write(bArr, i10, i11);
            return d();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d a(String str) throws IOException {
        if (!this.f38064c) {
            this.f38062a.a(str);
            return d();
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!this.f38064c) {
            int iWrite = this.f38062a.write(byteBuffer);
            d();
            return iWrite;
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d a(long j10) throws IOException {
        if (!this.f38064c) {
            this.f38062a.a(j10);
            return d();
        }
        throw new IllegalStateException("closed");
    }
}
