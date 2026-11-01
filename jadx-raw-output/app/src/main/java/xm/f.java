package xm;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/* JADX INFO: compiled from: ByteArrayISO8859Writer.java */
/* JADX INFO: loaded from: classes10.dex */
public class f extends Writer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f74993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f74994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f74995d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OutputStreamWriter f74996e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f74997f = false;

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public void d() {
        this.f74993b = null;
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    public void i(char c10) throws IOException {
        e(1);
        if (c10 < 0 || c10 > 127) {
            j(new char[]{c10}, 0, 1);
            return;
        }
        byte[] bArr = this.f74993b;
        int i10 = this.f74994c;
        this.f74994c = i10 + 1;
        bArr[i10] = (byte) c10;
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        e(cArr.length);
        for (int i10 = 0; i10 < cArr.length; i10++) {
            char c10 = cArr[i10];
            if (c10 < 0 || c10 > 127) {
                j(cArr, i10, cArr.length - i10);
                return;
            }
            byte[] bArr = this.f74993b;
            int i11 = this.f74994c;
            this.f74994c = i11 + 1;
            bArr[i11] = (byte) c10;
        }
    }

    public void e(int i10) throws IOException {
        int i11 = this.f74994c;
        int i12 = i11 + i10;
        byte[] bArr = this.f74993b;
        if (i12 > bArr.length) {
            if (this.f74997f) {
                throw new IOException("Buffer overflow: " + this.f74993b.length);
            }
            byte[] bArr2 = new byte[((bArr.length + i10) * 4) / 3];
            System.arraycopy(bArr, 0, bArr2, 0, i11);
            this.f74993b = bArr2;
        }
    }

    public int h() {
        return this.f74994c;
    }

    public final void j(char[] cArr, int i10, int i11) throws IOException {
        g gVar = this.f74995d;
        if (gVar == null) {
            this.f74995d = new g(i11 * 2);
            this.f74996e = new OutputStreamWriter(this.f74995d, "ISO-8859-1");
        } else {
            gVar.reset();
        }
        this.f74996e.write(cArr, i10, i11);
        this.f74996e.flush();
        e(this.f74995d.getCount());
        System.arraycopy(this.f74995d.d(), 0, this.f74993b, this.f74994c, this.f74995d.getCount());
        this.f74994c += this.f74995d.getCount();
    }

    public void k(OutputStream outputStream) throws IOException {
        outputStream.write(this.f74993b, 0, this.f74994c);
    }

    public f(int i10) {
        this.f74993b = new byte[i10];
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) throws IOException {
        e(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i10 + i12;
            char c10 = cArr[i13];
            if (c10 >= 0 && c10 <= 127) {
                byte[] bArr = this.f74993b;
                int i14 = this.f74994c;
                this.f74994c = i14 + 1;
                bArr[i14] = (byte) c10;
            } else {
                j(cArr, i13, i11 - i12);
                return;
            }
        }
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        if (str == null) {
            write("null", 0, 4);
            return;
        }
        int length = str.length();
        e(length);
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= 0 && cCharAt <= 127) {
                byte[] bArr = this.f74993b;
                int i11 = this.f74994c;
                this.f74994c = i11 + 1;
                bArr[i11] = (byte) cCharAt;
            } else {
                j(str.toCharArray(), i10, length - i10);
                return;
            }
        }
    }

    @Override // java.io.Writer
    public void write(String str, int i10, int i11) throws IOException {
        e(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i10 + i12;
            char cCharAt = str.charAt(i13);
            if (cCharAt >= 0 && cCharAt <= 127) {
                byte[] bArr = this.f74993b;
                int i14 = this.f74994c;
                this.f74994c = i14 + 1;
                bArr[i14] = (byte) cCharAt;
            } else {
                j(str.toCharArray(), i13, i11 - i12);
                return;
            }
        }
    }
}
