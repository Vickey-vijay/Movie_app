package za;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: StrictLineReader.java */
/* JADX INFO: loaded from: classes10.dex */
public class g implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputStream f86380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Charset f86381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f86382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f86383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f86384f;

    /* JADX INFO: compiled from: StrictLineReader.java */
    public class a extends ByteArrayOutputStream {
        public a(int i10) {
            super(i10);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i10 = ((ByteArrayOutputStream) this).count;
            if (i10 > 0 && ((ByteArrayOutputStream) this).buf[i10 - 1] == 13) {
                i10--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i10, g.this.f86381c.name());
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public g(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    public g(InputStream inputStream, int i10, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(h.f86386a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f86380b = inputStream;
        this.f86381c = charset;
        this.f86382d = new byte[i10];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f86380b) {
            if (this.f86382d != null) {
                this.f86382d = null;
                this.f86380b.close();
            }
        }
    }

    public final void d() throws IOException {
        InputStream inputStream = this.f86380b;
        byte[] bArr = this.f86382d;
        int i10 = inputStream.read(bArr, 0, bArr.length);
        if (i10 == -1) {
            throw new EOFException();
        }
        this.f86383e = 0;
        this.f86384f = i10;
    }

    public boolean h() {
        return this.f86384f == -1;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002b  */
    public String k() throws IOException {
        int i10;
        byte[] bArr;
        int i11;
        synchronized (this.f86380b) {
            if (this.f86382d == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.f86383e >= this.f86384f) {
                d();
            }
            for (int i12 = this.f86383e; i12 != this.f86384f; i12++) {
                byte[] bArr2 = this.f86382d;
                if (bArr2[i12] == 10) {
                    int i13 = this.f86383e;
                    if (i12 != i13) {
                        i11 = i12 - 1;
                        if (bArr2[i11] != 13) {
                            i11 = i12;
                        }
                    } else {
                        i11 = i12;
                    }
                    String str = new String(bArr2, i13, i11 - i13, this.f86381c.name());
                    this.f86383e = i12 + 1;
                    return str;
                }
            }
            a aVar = new a((this.f86384f - this.f86383e) + 80);
            loop1: while (true) {
                byte[] bArr3 = this.f86382d;
                int i14 = this.f86383e;
                aVar.write(bArr3, i14, this.f86384f - i14);
                this.f86384f = -1;
                d();
                i10 = this.f86383e;
                while (i10 != this.f86384f) {
                    bArr = this.f86382d;
                    if (bArr[i10] == 10) {
                        break loop1;
                    }
                    i10++;
                }
            }
            int i15 = this.f86383e;
            if (i10 != i15) {
                aVar.write(bArr, i15, i10 - i15);
            }
            this.f86383e = i10 + 1;
            return aVar.toString();
        }
    }
}
