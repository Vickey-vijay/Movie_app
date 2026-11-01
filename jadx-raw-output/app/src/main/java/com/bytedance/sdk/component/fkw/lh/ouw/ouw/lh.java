package com.bytedance.sdk.component.fkw.lh.ouw.ouw;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes10.dex */
final class lh implements Closeable {
    private int fkw;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final InputStream f11703lh;
    public final Charset ouw;
    public int vt;
    private byte[] yu;

    public lh(InputStream inputStream, Charset charset) {
        this(inputStream, charset, (byte) 0);
    }

    private lh(InputStream inputStream, Charset charset, byte b10) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (!charset.equals(yu.ouw)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f11703lh = inputStream;
        this.ouw = charset;
        this.yu = new byte[8192];
    }

    private void vt() throws IOException {
        InputStream inputStream = this.f11703lh;
        byte[] bArr = this.yu;
        int i10 = inputStream.read(bArr, 0, bArr.length);
        if (i10 == -1) {
            throw new EOFException();
        }
        this.fkw = 0;
        this.vt = i10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this.f11703lh) {
            if (this.yu != null) {
                this.yu = null;
                this.f11703lh.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002b  */
    public final String ouw() throws IOException {
        int i10;
        byte[] bArr;
        int i11;
        synchronized (this.f11703lh) {
            if (this.yu == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.fkw >= this.vt) {
                vt();
            }
            for (int i12 = this.fkw; i12 != this.vt; i12++) {
                byte[] bArr2 = this.yu;
                if (bArr2[i12] == 10) {
                    int i13 = this.fkw;
                    if (i12 != i13) {
                        i11 = i12 - 1;
                        if (bArr2[i11] != 13) {
                            i11 = i12;
                        }
                    } else {
                        i11 = i12;
                    }
                    String str = new String(bArr2, i13, i11 - i13, this.ouw.name());
                    this.fkw = i12 + 1;
                    return str;
                }
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((this.vt - this.fkw) + 80) { // from class: com.bytedance.sdk.component.fkw.lh.ouw.ouw.lh.1
                @Override // java.io.ByteArrayOutputStream
                public final String toString() {
                    int i14 = ((ByteArrayOutputStream) this).count;
                    if (i14 > 0 && ((ByteArrayOutputStream) this).buf[i14 - 1] == 13) {
                        i14--;
                    }
                    try {
                        return new String(((ByteArrayOutputStream) this).buf, 0, i14, lh.this.ouw.name());
                    } catch (UnsupportedEncodingException e10) {
                        throw new AssertionError(e10);
                    }
                }
            };
            loop1: while (true) {
                byte[] bArr3 = this.yu;
                int i14 = this.fkw;
                byteArrayOutputStream.write(bArr3, i14, this.vt - i14);
                this.vt = -1;
                vt();
                i10 = this.fkw;
                while (i10 != this.vt) {
                    bArr = this.yu;
                    if (bArr[i10] == 10) {
                        break loop1;
                    }
                    i10++;
                }
            }
            int i15 = this.fkw;
            if (i10 != i15) {
                byteArrayOutputStream.write(bArr, i15, i10 - i15);
            }
            this.fkw = i10 + 1;
            return byteArrayOutputStream.toString();
        }
    }
}
