package dl;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import kotlinx.serialization.json.internal.JsonEncodingException;

/* JADX INFO: compiled from: JvmJsonStreams.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class k0 implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputStream f52158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f52159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public char[] f52160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f52161d;

    public final int e(int i10, int i11) {
        int i12 = i11 + i10;
        char[] cArr = this.f52160c;
        if (cArr.length <= i12) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, ik.k.d(i12, i10 * 2));
            ck.p.i(cArrCopyOf, "copyOf(this, newSize)");
            this.f52160c = cArrCopyOf;
        }
        return i10;
    }

    public final void h(char[] cArr, int i10) throws IOException {
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException("count < 0".toString());
        }
        if (!(i10 <= cArr.length)) {
            throw new IllegalArgumentException(("count > string.length: " + i10 + " > " + cArr.length).toString());
        }
        int i11 = 0;
        while (i11 < i10) {
            char c10 = cArr[i11];
            if (c10 < 128) {
                if (this.f52159b.length - this.f52161d < 1) {
                    f();
                }
                byte[] bArr = this.f52159b;
                int i12 = this.f52161d;
                int i13 = i12 + 1;
                this.f52161d = i13;
                bArr[i12] = (byte) c10;
                i11++;
                int iMin = Math.min(i10, (bArr.length - i13) + i11);
                while (i11 < iMin) {
                    char c11 = cArr[i11];
                    if (c11 >= 128) {
                        break;
                    }
                    byte[] bArr2 = this.f52159b;
                    int i14 = this.f52161d;
                    this.f52161d = i14 + 1;
                    bArr2[i14] = (byte) c11;
                    i11++;
                }
            } else {
                if (c10 < 2048) {
                    if (this.f52159b.length - this.f52161d < 2) {
                        f();
                    }
                    byte[] bArr3 = this.f52159b;
                    int i15 = this.f52161d;
                    int i16 = i15 + 1;
                    bArr3[i15] = (byte) ((c10 >> 6) | 192);
                    this.f52161d = i16 + 1;
                    bArr3[i16] = (byte) ((c10 & '?') | 128);
                } else if (c10 < 55296 || c10 > 57343) {
                    if (this.f52159b.length - this.f52161d < 3) {
                        f();
                    }
                    byte[] bArr4 = this.f52159b;
                    int i17 = this.f52161d;
                    int i18 = i17 + 1;
                    bArr4[i17] = (byte) ((c10 >> '\f') | 224);
                    int i19 = i18 + 1;
                    bArr4[i18] = (byte) (((c10 >> 6) & 63) | 128);
                    this.f52161d = i19 + 1;
                    bArr4[i19] = (byte) ((c10 & '?') | 128);
                } else {
                    int i20 = i11 + 1;
                    char c12 = i20 < i10 ? cArr[i20] : (char) 0;
                    if (c10 <= 56319) {
                        if (56320 <= c12 && c12 < 57344) {
                            int i21 = (((c10 & 1023) << 10) | (c12 & 1023)) + 65536;
                            if (this.f52159b.length - this.f52161d < 4) {
                                f();
                            }
                            byte[] bArr5 = this.f52159b;
                            int i22 = this.f52161d;
                            int i23 = i22 + 1;
                            bArr5[i22] = (byte) ((i21 >> 18) | 240);
                            int i24 = i23 + 1;
                            bArr5[i23] = (byte) (((i21 >> 12) & 63) | 128);
                            int i25 = i24 + 1;
                            bArr5[i24] = (byte) (((i21 >> 6) & 63) | 128);
                            this.f52161d = i25 + 1;
                            bArr5[i25] = (byte) ((i21 & 63) | 128);
                            i11 += 2;
                        }
                    }
                    if (this.f52159b.length - this.f52161d < 1) {
                        f();
                    }
                    byte[] bArr6 = this.f52159b;
                    int i26 = this.f52161d;
                    this.f52161d = i26 + 1;
                    bArr6[i26] = (byte) 63;
                    i11 = i20;
                }
                i11++;
            }
        }
    }

    public k0(OutputStream outputStream) {
        ck.p.j(outputStream, "stream");
        this.f52158a = outputStream;
        this.f52159b = k.f52157c.d();
        this.f52160c = m.f52166c.d();
    }

    @Override // dl.r0
    public void b(String str) throws IOException {
        ck.p.j(str, "text");
        e(0, str.length() + 2);
        char[] cArr = this.f52160c;
        cArr[0] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, 1);
        int i10 = length + 1;
        for (int i11 = 1; i11 < i10; i11++) {
            char c10 = cArr[i11];
            if (c10 < a1.a().length && a1.a()[c10] != 0) {
                d(i11, str);
                return;
            }
        }
        cArr[i10] = '\"';
        h(cArr, length + 2);
        f();
    }

    @Override // dl.r0
    public void c(String str) throws IOException {
        ck.p.j(str, "text");
        int length = str.length();
        e(0, length);
        str.getChars(0, length, this.f52160c, 0);
        h(this.f52160c, length);
    }

    public final void d(int i10, String str) throws IOException {
        byte b10;
        int length = str.length();
        for (int i11 = i10 - 1; i11 < length; i11++) {
            int iE = e(i10, 2);
            char cCharAt = str.charAt(i11);
            if (cCharAt >= a1.a().length || (b10 = a1.a()[cCharAt]) == 0) {
                int i12 = iE + 1;
                this.f52160c[iE] = cCharAt;
                i10 = i12;
            } else if (b10 == 1) {
                String str2 = a1.b()[cCharAt];
                ck.p.g(str2);
                int iE2 = e(iE, str2.length());
                str2.getChars(0, str2.length(), this.f52160c, iE2);
                i10 = iE2 + str2.length();
            } else {
                char[] cArr = this.f52160c;
                cArr[iE] = '\\';
                cArr[iE + 1] = (char) b10;
                i10 = iE + 2;
            }
        }
        e(i10, 1);
        char[] cArr2 = this.f52160c;
        cArr2[i10] = '\"';
        h(cArr2, i10 + 1);
        f();
    }

    public final void f() throws IOException {
        this.f52158a.write(this.f52159b, 0, this.f52161d);
        this.f52161d = 0;
    }

    public final void i(int i10) throws IOException {
        if (i10 < 128) {
            if (this.f52159b.length - this.f52161d < 1) {
                f();
            }
            byte[] bArr = this.f52159b;
            int i11 = this.f52161d;
            this.f52161d = i11 + 1;
            bArr[i11] = (byte) i10;
            return;
        }
        if (i10 < 2048) {
            if (this.f52159b.length - this.f52161d < 2) {
                f();
            }
            byte[] bArr2 = this.f52159b;
            int i12 = this.f52161d;
            int i13 = i12 + 1;
            bArr2[i12] = (byte) ((i10 >> 6) | 192);
            this.f52161d = i13 + 1;
            bArr2[i13] = (byte) ((i10 & 63) | 128);
            return;
        }
        boolean z10 = false;
        if (55296 <= i10 && i10 < 57344) {
            z10 = true;
        }
        if (z10) {
            if (this.f52159b.length - this.f52161d < 1) {
                f();
            }
            byte[] bArr3 = this.f52159b;
            int i14 = this.f52161d;
            this.f52161d = i14 + 1;
            bArr3[i14] = (byte) 63;
            return;
        }
        if (i10 < 65536) {
            if (this.f52159b.length - this.f52161d < 3) {
                f();
            }
            byte[] bArr4 = this.f52159b;
            int i15 = this.f52161d;
            int i16 = i15 + 1;
            bArr4[i15] = (byte) ((i10 >> 12) | 224);
            int i17 = i16 + 1;
            bArr4[i16] = (byte) (((i10 >> 6) & 63) | 128);
            this.f52161d = i17 + 1;
            bArr4[i17] = (byte) ((i10 & 63) | 128);
            return;
        }
        if (i10 > 1114111) {
            throw new JsonEncodingException("Unexpected code point: " + i10);
        }
        if (this.f52159b.length - this.f52161d < 4) {
            f();
        }
        byte[] bArr5 = this.f52159b;
        int i18 = this.f52161d;
        int i19 = i18 + 1;
        bArr5[i18] = (byte) ((i10 >> 18) | 240);
        int i20 = i19 + 1;
        bArr5[i19] = (byte) (((i10 >> 12) & 63) | 128);
        int i21 = i20 + 1;
        bArr5[i20] = (byte) (((i10 >> 6) & 63) | 128);
        this.f52161d = i21 + 1;
        bArr5[i21] = (byte) ((i10 & 63) | 128);
    }

    @Override // dl.r0
    public void a(char c10) throws IOException {
        i(c10);
    }

    public void g() throws IOException {
        f();
        m.f52166c.c(this.f52160c);
        k.f52157c.c(this.f52159b);
    }

    @Override // dl.r0
    public void writeLong(long j10) throws IOException {
        c(String.valueOf(j10));
    }
}
