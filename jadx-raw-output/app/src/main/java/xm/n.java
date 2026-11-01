package xm;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: ReadLineInputStream.java */
/* JADX INFO: loaded from: classes10.dex */
public class n extends BufferedInputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f75057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f75058c;

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        int i10;
        i10 = super.read();
        if (this.f75058c) {
            this.f75058c = false;
            if (this.f75057b && i10 == 10) {
                i10 = super.read();
            }
        }
        return i10;
    }

    public String d() throws IOException {
        mark(((BufferedInputStream) this).buf.length);
        while (true) {
            int i10 = super.read();
            int i11 = ((BufferedInputStream) this).markpos;
            if (i11 < 0) {
                throw new IOException("Buffer size exceeded: no line terminator");
            }
            if (i10 == -1) {
                ((BufferedInputStream) this).markpos = -1;
                if (((BufferedInputStream) this).pos > i11) {
                    return new String(((BufferedInputStream) this).buf, i11, ((BufferedInputStream) this).pos - i11, o.f75061c);
                }
                return null;
            }
            if (i10 == 13) {
                int i12 = ((BufferedInputStream) this).pos;
                if (!this.f75057b || i12 >= ((BufferedInputStream) this).count) {
                    this.f75058c = true;
                } else {
                    byte[] bArr = ((BufferedInputStream) this).buf;
                    int i13 = ((BufferedInputStream) this).pos;
                    if (bArr[i13] == 10) {
                        ((BufferedInputStream) this).pos = i13 + 1;
                    }
                }
                int i14 = ((BufferedInputStream) this).markpos;
                ((BufferedInputStream) this).markpos = -1;
                return new String(((BufferedInputStream) this).buf, i14, (i12 - i14) - 1, o.f75061c);
            }
            if (i10 == 10) {
                if (!this.f75058c) {
                    ((BufferedInputStream) this).markpos = -1;
                    return new String(((BufferedInputStream) this).buf, i11, (((BufferedInputStream) this).pos - i11) - 1, o.f75061c);
                }
                this.f75058c = false;
                this.f75057b = true;
                ((BufferedInputStream) this).markpos = i11 + 1;
            }
        }
    }

    public n(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f75058c && i11 > 0) {
            this.f75058c = false;
            if (this.f75057b) {
                int i12 = super.read();
                if (i12 == -1) {
                    return -1;
                }
                if (i12 != 10) {
                    bArr[i10] = (byte) (i12 & 255);
                    return super.read(bArr, i10 + 1, i11 - 1) + 1;
                }
            }
        }
        return super.read(bArr, i10, i11);
    }
}
