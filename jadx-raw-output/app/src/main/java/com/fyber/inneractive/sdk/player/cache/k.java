package com.fyber.inneractive.sdk.player.cache;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f16178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Charset f16179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f16180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16182e;

    public k(FileInputStream fileInputStream) {
        Charset charset = l.f16183a;
        charset.getClass();
        if (!charset.equals(charset)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f16178a = fileInputStream;
        this.f16179b = charset;
        this.f16180c = new byte[8192];
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    public final String a() {
        int i10;
        synchronized (this.f16178a) {
            byte[] bArr = this.f16180c;
            if (bArr == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.f16181d >= this.f16182e) {
                int i11 = this.f16178a.read(bArr, 0, bArr.length);
                if (i11 == -1) {
                    throw new EOFException();
                }
                this.f16181d = 0;
                this.f16182e = i11;
            }
            for (int i12 = this.f16181d; i12 != this.f16182e; i12++) {
                byte[] bArr2 = this.f16180c;
                if (bArr2[i12] == 10) {
                    int i13 = this.f16181d;
                    if (i12 != i13) {
                        i10 = i12 - 1;
                        if (bArr2[i10] != 13) {
                            i10 = i12;
                        }
                    } else {
                        i10 = i12;
                    }
                    String str = new String(bArr2, i13, i10 - i13, this.f16179b.name());
                    this.f16181d = i12 + 1;
                    return str;
                }
            }
            j jVar = new j(this, (this.f16182e - this.f16181d) + 80);
            while (true) {
                byte[] bArr3 = this.f16180c;
                int i14 = this.f16181d;
                jVar.write(bArr3, i14, this.f16182e - i14);
                this.f16182e = -1;
                InputStream inputStream = this.f16178a;
                byte[] bArr4 = this.f16180c;
                int i15 = inputStream.read(bArr4, 0, bArr4.length);
                if (i15 == -1) {
                    throw new EOFException();
                }
                this.f16181d = 0;
                this.f16182e = i15;
                for (int i16 = 0; i16 != this.f16182e; i16++) {
                    byte[] bArr5 = this.f16180c;
                    if (bArr5[i16] == 10) {
                        int i17 = this.f16181d;
                        if (i16 != i17) {
                            jVar.write(bArr5, i17, i16 - i17);
                        }
                        this.f16181d = i16 + 1;
                        return jVar.toString();
                    }
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f16178a) {
            if (this.f16180c != null) {
                this.f16180c = null;
                this.f16178a.close();
            }
        }
    }
}
