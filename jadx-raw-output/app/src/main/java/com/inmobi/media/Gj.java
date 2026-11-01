package com.inmobi.media;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes5.dex */
public final class Gj implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileInputStream f22749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Charset f22750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f22751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22753e;

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    public final String a() {
        int i10;
        synchronized (this.f22749a) {
            byte[] bArr = this.f22751c;
            if (bArr == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.f22752d >= this.f22753e) {
                int i11 = this.f22749a.read(bArr, 0, bArr.length);
                if (i11 == -1) {
                    throw new EOFException();
                }
                this.f22752d = 0;
                this.f22753e = i11;
            }
            for (int i12 = this.f22752d; i12 != this.f22753e; i12++) {
                byte[] bArr2 = this.f22751c;
                if (bArr2[i12] == 10) {
                    int i13 = this.f22752d;
                    if (i12 != i13) {
                        i10 = i12 - 1;
                        if (bArr2[i10] != 13) {
                            i10 = i12;
                        }
                    } else {
                        i10 = i12;
                    }
                    String str = new String(bArr2, i13, i10 - i13, this.f22750b.name());
                    this.f22752d = i12 + 1;
                    return str;
                }
            }
            Fj fj2 = new Fj(this, (this.f22753e - this.f22752d) + 80);
            while (true) {
                byte[] bArr3 = this.f22751c;
                int i14 = this.f22752d;
                fj2.write(bArr3, i14, this.f22753e - i14);
                this.f22753e = -1;
                FileInputStream fileInputStream = this.f22749a;
                byte[] bArr4 = this.f22751c;
                int i15 = fileInputStream.read(bArr4, 0, bArr4.length);
                if (i15 == -1) {
                    throw new EOFException();
                }
                this.f22752d = 0;
                this.f22753e = i15;
                for (int i16 = 0; i16 != this.f22753e; i16++) {
                    byte[] bArr5 = this.f22751c;
                    if (bArr5[i16] == 10) {
                        int i17 = this.f22752d;
                        if (i16 != i17) {
                            fj2.write(bArr5, i17, i16 - i17);
                        }
                        this.f22752d = i16 + 1;
                        return fj2.toString();
                    }
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f22749a) {
            if (this.f22751c != null) {
                this.f22751c = null;
                this.f22749a.close();
            }
        }
    }

    public Gj(FileInputStream fileInputStream, Charset charset) {
        charset.getClass();
        if (charset.equals(AbstractC2762bl.f24082a)) {
            this.f22749a = fileInputStream;
            this.f22750b = charset;
            this.f22751c = new byte[8192];
            return;
        }
        throw new IllegalArgumentException("Unsupported encoding");
    }
}
