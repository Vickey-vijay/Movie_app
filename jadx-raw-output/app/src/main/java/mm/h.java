package mm;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import xm.o;

/* JADX INFO: compiled from: ByteArrayBuffer.java */
/* JADX INFO: loaded from: classes5.dex */
public class h extends mm.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f64607o = Integer.getInteger("org.eclipse.jetty.io.ByteArrayBuffer.MAX_WRITE", 131072).intValue();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final byte[] f64608n;

    /* JADX INFO: compiled from: ByteArrayBuffer.java */
    public static class a extends h implements d.a {
        public a(String str) {
            super(str);
        }

        public a(byte[] bArr, int i10, int i11, int i12) {
            super(bArr, i10, i11, i12);
        }

        @Override // mm.h, mm.a
        public boolean equals(Object obj) {
            return (obj instanceof d) && j0((d) obj);
        }
    }

    public h(int i10, int i11, boolean z10) {
        this(new byte[i10], 0, 0, i11, z10);
    }

    @Override // mm.a, mm.d
    public int M(int i10, byte[] bArr, int i11, int i12) {
        this.f64587f = 0;
        if (i10 + i12 > e0()) {
            i12 = e0() - i10;
        }
        System.arraycopy(bArr, i11, this.f64608n, i10, i12);
        return i12;
    }

    @Override // mm.a
    public boolean equals(Object obj) {
        int i10;
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        if (obj instanceof d.a) {
            return j0((d) obj);
        }
        d dVar = (d) obj;
        if (dVar.length() != length()) {
            return false;
        }
        int i11 = this.f64587f;
        if (i11 != 0 && (obj instanceof mm.a) && (i10 = ((mm.a) obj).f64587f) != 0 && i11 != i10) {
            return false;
        }
        int index = getIndex();
        int iT = dVar.T();
        int iT2 = T();
        while (true) {
            int i12 = iT2 - 1;
            if (iT2 <= index) {
                return true;
            }
            iT--;
            if (this.f64608n[i12] != dVar.Q(iT)) {
                return false;
            }
            iT2 = i12;
        }
    }

    @Override // mm.a, mm.d
    public int g0(int i10, d dVar) {
        int i11 = 0;
        this.f64587f = 0;
        int length = dVar.length();
        if (i10 + length > e0()) {
            length = e0() - i10;
        }
        byte[] bArrV = dVar.V();
        if (bArrV != null) {
            System.arraycopy(bArrV, dVar.getIndex(), this.f64608n, i10, length);
        } else {
            int index = dVar.getIndex();
            while (i11 < length) {
                this.f64608n[i10] = dVar.Q(index);
                i11++;
                i10++;
                index++;
            }
        }
        return length;
    }

    @Override // mm.a, mm.d
    public boolean j0(d dVar) {
        int i10;
        if (dVar == this) {
            return true;
        }
        if (dVar == null || dVar.length() != length()) {
            return false;
        }
        int i11 = this.f64587f;
        if (i11 != 0 && (dVar instanceof mm.a) && (i10 = ((mm.a) dVar).f64587f) != 0 && i11 != i10) {
            return false;
        }
        int index = getIndex();
        int iT = dVar.T();
        byte[] bArrV = dVar.V();
        if (bArrV != null) {
            int iT2 = T();
            while (true) {
                int i12 = iT2 - 1;
                if (iT2 <= index) {
                    break;
                }
                byte b10 = this.f64608n[i12];
                iT--;
                byte b11 = bArrV[iT];
                if (b10 != b11) {
                    if (97 <= b10 && b10 <= 122) {
                        b10 = (byte) ((b10 - 97) + 65);
                    }
                    if (97 <= b11 && b11 <= 122) {
                        b11 = (byte) ((b11 - 97) + 65);
                    }
                    if (b10 != b11) {
                        return false;
                    }
                }
                iT2 = i12;
            }
        } else {
            int iT3 = T();
            while (true) {
                int i13 = iT3 - 1;
                if (iT3 <= index) {
                    break;
                }
                byte b12 = this.f64608n[i13];
                iT--;
                byte bQ = dVar.Q(iT);
                if (b12 != bQ) {
                    if (97 <= b12 && b12 <= 122) {
                        b12 = (byte) ((b12 - 97) + 65);
                    }
                    if (97 <= bQ && bQ <= 122) {
                        bQ = (byte) ((bQ - 97) + 65);
                    }
                    if (b12 != bQ) {
                        return false;
                    }
                }
                iT3 = i13;
            }
        }
        return true;
    }

    public h(byte[] bArr) {
        this(bArr, 0, bArr.length, 2);
    }

    @Override // mm.d
    public void I(int i10, byte b10) {
        this.f64608n[i10] = b10;
    }

    @Override // mm.d
    public int J(int i10, byte[] bArr, int i11, int i12) {
        if ((i10 + i12 > e0() && (i12 = e0() - i10) == 0) || i12 < 0) {
            return -1;
        }
        System.arraycopy(this.f64608n, i10, bArr, i11, i12);
        return i12;
    }

    @Override // mm.a, mm.d
    public int K(InputStream inputStream, int i10) throws IOException {
        if (i10 < 0 || i10 > L()) {
            i10 = L();
        }
        int iT = T();
        int i11 = 0;
        int i12 = i10;
        int i13 = 0;
        while (i11 < i10) {
            i13 = inputStream.read(this.f64608n, iT, i12);
            if (i13 < 0) {
                break;
            }
            if (i13 > 0) {
                iT += i13;
                i11 += i13;
                i12 -= i13;
                W(iT);
            }
            if (inputStream.available() <= 0) {
                break;
            }
        }
        if (i13 >= 0 || i11 != 0) {
            return i11;
        }
        return -1;
    }

    @Override // mm.a, mm.d
    public int L() {
        return this.f64608n.length - this.f64586e;
    }

    @Override // mm.d
    public byte Q(int i10) {
        return this.f64608n[i10];
    }

    @Override // mm.d
    public byte[] V() {
        return this.f64608n;
    }

    @Override // mm.d
    public int e0() {
        return this.f64608n.length;
    }

    @Override // mm.a, mm.d
    public byte get() {
        byte[] bArr = this.f64608n;
        int i10 = this.f64585d;
        this.f64585d = i10 + 1;
        return bArr[i10];
    }

    @Override // mm.a
    public int hashCode() {
        if (this.f64587f == 0 || this.f64588g != this.f64585d || this.f64589h != this.f64586e) {
            int index = getIndex();
            int iT = T();
            while (true) {
                int i10 = iT - 1;
                if (iT <= index) {
                    break;
                }
                byte b10 = this.f64608n[i10];
                if (97 <= b10 && b10 <= 122) {
                    b10 = (byte) ((b10 - 97) + 65);
                }
                this.f64587f = (this.f64587f * 31) + b10;
                iT = i10;
            }
            if (this.f64587f == 0) {
                this.f64587f = -1;
            }
            this.f64588g = this.f64585d;
            this.f64589h = this.f64586e;
        }
        return this.f64587f;
    }

    public h(byte[] bArr, int i10, int i11) {
        this(bArr, i10, i11, 2);
    }

    @Override // mm.a, mm.d
    public void b0() {
        int index;
        if (!isReadOnly()) {
            if (f0() >= 0) {
                index = f0();
            } else {
                index = getIndex();
            }
            if (index > 0) {
                int iT = T() - index;
                if (iT > 0) {
                    byte[] bArr = this.f64608n;
                    System.arraycopy(bArr, index, bArr, 0, iT);
                }
                if (f0() > 0) {
                    U(f0() - index);
                }
                i0(getIndex() - index);
                W(T() - index);
                return;
            }
            return;
        }
        throw new IllegalStateException("READONLY");
    }

    @Override // mm.a, mm.d
    public void writeTo(OutputStream outputStream) throws IOException {
        int length = length();
        int i10 = f64607o;
        if (i10 > 0 && length > i10) {
            int index = getIndex();
            while (length > 0) {
                int i11 = f64607o;
                if (length <= i11) {
                    i11 = length;
                }
                outputStream.write(this.f64608n, index, i11);
                index += i11;
                length -= i11;
            }
        } else {
            outputStream.write(this.f64608n, getIndex(), length);
        }
        if (!Y()) {
            clear();
        }
    }

    public h(byte[] bArr, int i10, int i11, int i12) {
        super(2, false);
        this.f64608n = bArr;
        W(i11 + i10);
        i0(i10);
        this.f64583b = i12;
    }

    public h(byte[] bArr, int i10, int i11, int i12, boolean z10) {
        super(2, z10);
        this.f64608n = bArr;
        W(i11 + i10);
        i0(i10);
        this.f64583b = i12;
    }

    public h(int i10) {
        this(new byte[i10], 0, 0, 2);
        W(0);
    }

    public h(String str) {
        super(2, false);
        byte[] bArrC = o.c(str);
        this.f64608n = bArrC;
        i0(0);
        W(bArrC.length);
        this.f64583b = 0;
        this.f64591j = str;
    }

    public h(String str, String str2) throws UnsupportedEncodingException {
        super(2, false);
        byte[] bytes = str.getBytes(str2);
        this.f64608n = bytes;
        i0(0);
        W(bytes.length);
        this.f64583b = 0;
        this.f64591j = str;
    }
}
