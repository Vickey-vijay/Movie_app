package mm;

import com.ironsource.C3426d4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import xm.p;

/* JADX INFO: compiled from: AbstractBuffer.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a implements d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final zm.c f64581l = zm.b.a(a.class);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final boolean f64582m = Boolean.getBoolean("org.eclipse.jetty.io.AbstractBuffer.boundsChecking");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f64583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f64584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f64585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f64586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f64587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f64588g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f64589h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f64590i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f64591j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public m f64592k;

    @Override // mm.d
    public int M(int i10, byte[] bArr, int i11, int i12) {
        int i13 = 0;
        this.f64587f = 0;
        if (i10 + i12 > e0()) {
            i12 = e0() - i10;
        }
        byte[] bArrV = V();
        if (bArrV != null) {
            System.arraycopy(bArr, i11, bArrV, i10, i12);
        } else {
            while (i13 < i12) {
                I(i10, bArr[i11]);
                i13++;
                i10++;
                i11++;
            }
        }
        return i12;
    }

    @Override // mm.d
    public String P(Charset charset) {
        try {
            byte[] bArrV = V();
            return bArrV != null ? new String(bArrV, getIndex(), length(), charset) : new String(H(), 0, length(), charset);
        } catch (Exception e10) {
            f64581l.e(e10);
            return new String(H(), 0, length());
        }
    }

    @Override // mm.d
    public d buffer() {
        return this;
    }

    @Override // mm.d
    public void clear() {
        U(-1);
        i0(0);
        W(0);
    }

    public boolean equals(Object obj) {
        int i10;
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if ((this instanceof d.a) || (dVar instanceof d.a)) {
            return j0(dVar);
        }
        if (dVar.length() != length()) {
            return false;
        }
        int i11 = this.f64587f;
        if (i11 != 0 && (obj instanceof a) && (i10 = ((a) obj).f64587f) != 0 && i11 != i10) {
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
            if (Q(i12) != dVar.Q(iT)) {
                return false;
            }
            iT2 = i12;
        }
    }

    @Override // mm.d
    public int g0(int i10, d dVar) {
        int i11 = 0;
        this.f64587f = 0;
        int length = dVar.length();
        if (i10 + length > e0()) {
            length = e0() - i10;
        }
        byte[] bArrV = dVar.V();
        byte[] bArrV2 = V();
        if (bArrV != null && bArrV2 != null) {
            System.arraycopy(bArrV, dVar.getIndex(), bArrV2, i10, length);
        } else if (bArrV != null) {
            int index = dVar.getIndex();
            while (i11 < length) {
                I(i10, bArrV[index]);
                i11++;
                i10++;
                index++;
            }
        } else if (bArrV2 != null) {
            int index2 = dVar.getIndex();
            while (i11 < length) {
                bArrV2[i10] = dVar.Q(index2);
                i11++;
                i10++;
                index2++;
            }
        } else {
            int index3 = dVar.getIndex();
            while (i11 < length) {
                I(i10, dVar.Q(index3));
                i11++;
                i10++;
                index3++;
            }
        }
        return length;
    }

    @Override // mm.d
    public byte get() {
        int i10 = this.f64585d;
        this.f64585d = i10 + 1;
        return Q(i10);
    }

    @Override // mm.d
    public boolean j0(d dVar) {
        int i10;
        if (dVar == this) {
            return true;
        }
        if (dVar.length() != length()) {
            return false;
        }
        int i11 = this.f64587f;
        if (i11 != 0 && (dVar instanceof a) && (i10 = ((a) dVar).f64587f) != 0 && i11 != i10) {
            return false;
        }
        int index = getIndex();
        int iT = dVar.T();
        byte[] bArrV = V();
        byte[] bArrV2 = dVar.V();
        if (bArrV != null && bArrV2 != null) {
            int iT2 = T();
            while (true) {
                int i12 = iT2 - 1;
                if (iT2 <= index) {
                    break;
                }
                byte b10 = bArrV[i12];
                iT--;
                byte b11 = bArrV2[iT];
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
                byte bQ = Q(i13);
                iT--;
                byte bQ2 = dVar.Q(iT);
                if (bQ != bQ2) {
                    if (97 <= bQ && bQ <= 122) {
                        bQ = (byte) ((bQ - 97) + 65);
                    }
                    if (97 <= bQ2 && bQ2 <= 122) {
                        bQ2 = (byte) ((bQ2 - 97) + 65);
                    }
                    if (bQ != bQ2) {
                        return false;
                    }
                }
                iT3 = i13;
            }
        }
        return true;
    }

    public String toString() {
        if (!Y()) {
            return new String(H(), 0, length());
        }
        if (this.f64591j == null) {
            this.f64591j = new String(H(), 0, length());
        }
        return this.f64591j;
    }

    @Override // mm.d
    public d N(int i10, int i11) {
        m mVar = this.f64592k;
        if (mVar == null) {
            this.f64592k = new m(this, -1, i10, i10 + i11, isReadOnly() ? 1 : 2);
        } else {
            mVar.update(buffer());
            this.f64592k.U(-1);
            this.f64592k.i0(0);
            this.f64592k.W(i11 + i10);
            this.f64592k.i0(i10);
        }
        return this.f64592k;
    }

    @Override // mm.d
    public String O() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C3426d4.j.f28586d);
        sb2.append(super.hashCode());
        sb2.append(StringUtils.COMMA);
        sb2.append(buffer().hashCode());
        sb2.append(",m=");
        sb2.append(f0());
        sb2.append(",g=");
        sb2.append(getIndex());
        sb2.append(",p=");
        sb2.append(T());
        sb2.append(",c=");
        sb2.append(e0());
        sb2.append("]={");
        if (f0() >= 0) {
            for (int iF0 = f0(); iF0 < getIndex(); iF0++) {
                p.g(Q(iF0), sb2);
            }
            sb2.append("}{");
        }
        int i10 = 0;
        int index = getIndex();
        while (index < T()) {
            p.g(Q(index), sb2);
            int i11 = i10 + 1;
            if (i10 == 50 && T() - index > 20) {
                sb2.append(" ... ");
                index = T() - 20;
            }
            index++;
            i10 = i11;
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // mm.d
    public void R() {
        U(this.f64585d - 1);
    }

    @Override // mm.d
    public final int T() {
        return this.f64586e;
    }

    @Override // mm.d
    public void U(int i10) {
        this.f64590i = i10;
    }

    @Override // mm.d
    public void W(int i10) {
        this.f64586e = i10;
        this.f64587f = 0;
    }

    @Override // mm.d
    public boolean Y() {
        return this.f64583b <= 0;
    }

    @Override // mm.d
    public int f0() {
        return this.f64590i;
    }

    @Override // mm.d
    public d get(int i10) {
        int index = getIndex();
        d dVarN = N(index, i10);
        i0(index + i10);
        return dVarN;
    }

    @Override // mm.d
    public final int getIndex() {
        return this.f64585d;
    }

    @Override // mm.d
    public boolean h0() {
        return this.f64584c;
    }

    @Override // mm.d
    public boolean hasContent() {
        return this.f64586e > this.f64585d;
    }

    public int hashCode() {
        if (this.f64587f == 0 || this.f64588g != this.f64585d || this.f64589h != this.f64586e) {
            int index = getIndex();
            byte[] bArrV = V();
            if (bArrV != null) {
                int iT = T();
                while (true) {
                    int i10 = iT - 1;
                    if (iT <= index) {
                        break;
                    }
                    byte b10 = bArrV[i10];
                    if (97 <= b10 && b10 <= 122) {
                        b10 = (byte) ((b10 - 97) + 65);
                    }
                    this.f64587f = (this.f64587f * 31) + b10;
                    iT = i10;
                }
            } else {
                int iT2 = T();
                while (true) {
                    int i11 = iT2 - 1;
                    if (iT2 <= index) {
                        break;
                    }
                    byte bQ = Q(i11);
                    if (97 <= bQ && bQ <= 122) {
                        bQ = (byte) ((bQ - 97) + 65);
                    }
                    this.f64587f = (this.f64587f * 31) + bQ;
                    iT2 = i11;
                }
            }
            if (this.f64587f == 0) {
                this.f64587f = -1;
            }
            this.f64588g = this.f64585d;
            this.f64589h = this.f64586e;
        }
        return this.f64587f;
    }

    @Override // mm.d
    public void i0(int i10) {
        this.f64585d = i10;
        this.f64587f = 0;
    }

    @Override // mm.d
    public boolean isReadOnly() {
        return this.f64583b <= 1;
    }

    @Override // mm.d
    public int length() {
        return this.f64586e - this.f64585d;
    }

    @Override // mm.d
    public byte peek() {
        return Q(this.f64585d);
    }

    public a(int i10, boolean z10) {
        if (i10 == 0 && z10) {
            throw new IllegalArgumentException("IMMUTABLE && VOLATILE");
        }
        U(-1);
        this.f64583b = i10;
        this.f64584c = z10;
    }

    @Override // mm.d
    public byte[] H() {
        int length = length();
        byte[] bArr = new byte[length];
        byte[] bArrV = V();
        if (bArrV != null) {
            System.arraycopy(bArrV, getIndex(), bArr, 0, length);
        } else {
            J(getIndex(), bArr, 0, length());
        }
        return bArr;
    }

    @Override // mm.d
    public int K(InputStream inputStream, int i10) throws IOException {
        byte[] bArrV = V();
        int iL = L();
        if (iL <= i10) {
            i10 = iL;
        }
        if (bArrV != null) {
            int i11 = inputStream.read(bArrV, this.f64586e, i10);
            if (i11 > 0) {
                this.f64586e += i11;
            }
            return i11;
        }
        int i12 = 1024;
        if (i10 <= 1024) {
            i12 = i10;
        }
        byte[] bArr = new byte[i12];
        while (i10 > 0) {
            int i13 = inputStream.read(bArr, 0, i12);
            if (i13 < 0) {
                return -1;
            }
            b(bArr, 0, i13);
            i10 -= i13;
        }
        return 0;
    }

    @Override // mm.d
    public int L() {
        return e0() - this.f64586e;
    }

    @Override // mm.d
    public int S(d dVar) {
        int iT = T();
        int iG0 = g0(iT, dVar);
        W(iT + iG0);
        return iG0;
    }

    @Override // mm.d
    public int X(byte[] bArr) {
        int iT = T();
        int iM = M(iT, bArr, 0, bArr.length);
        W(iT + iM);
        return iM;
    }

    public h a(int i10) {
        d dVarBuffer = buffer();
        if (!(this instanceof d.a) && !(dVarBuffer instanceof d.a)) {
            return new h(H(), 0, length(), i10);
        }
        return new h.a(H(), 0, length(), i10);
    }

    @Override // mm.d
    public int a0(byte[] bArr, int i10, int i11) {
        int index = getIndex();
        int length = length();
        if (length == 0) {
            return -1;
        }
        if (i11 > length) {
            i11 = length;
        }
        int iJ = J(index, bArr, i10, i11);
        if (iJ > 0) {
            i0(index + iJ);
        }
        return iJ;
    }

    public int b(byte[] bArr, int i10, int i11) {
        int iT = T();
        int iM = M(iT, bArr, i10, i11);
        W(iT + iM);
        return iM;
    }

    @Override // mm.d
    public void b0() {
        int index;
        if (!isReadOnly()) {
            if (f0() >= 0) {
                index = f0();
            } else {
                index = getIndex();
            }
            if (index > 0) {
                byte[] bArrV = V();
                int iT = T() - index;
                if (iT > 0) {
                    if (bArrV != null) {
                        System.arraycopy(V(), index, V(), 0, iT);
                    } else {
                        g0(0, N(index, iT));
                    }
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

    public d c(int i10) {
        if (f0() < 0) {
            return null;
        }
        d dVarN = N(f0(), i10);
        U(-1);
        return dVarN;
    }

    @Override // mm.d
    public d c0() {
        return c((getIndex() - f0()) - 1);
    }

    @Override // mm.d
    public d k0() {
        if (Y()) {
            return this;
        }
        return a(0);
    }

    @Override // mm.d
    public void put(byte b10) {
        int iT = T();
        I(iT, b10);
        W(iT + 1);
    }

    @Override // mm.d
    public int skip(int i10) {
        if (length() < i10) {
            i10 = length();
        }
        i0(getIndex() + i10);
        return i10;
    }

    @Override // mm.d
    public void writeTo(OutputStream outputStream) throws IOException {
        int i10;
        byte[] bArrV = V();
        if (bArrV != null) {
            outputStream.write(bArrV, getIndex(), length());
        } else {
            int length = length();
            int i11 = 1024;
            if (length <= 1024) {
                i11 = length;
            }
            byte[] bArr = new byte[i11];
            int i12 = this.f64585d;
            while (length > 0) {
                if (length > i11) {
                    i10 = i11;
                } else {
                    i10 = length;
                }
                int iJ = J(i12, bArr, 0, i10);
                outputStream.write(bArr, 0, iJ);
                i12 += iJ;
                length -= iJ;
            }
        }
        clear();
    }

    @Override // mm.d
    public String toString(String str) {
        try {
            byte[] bArrV = V();
            if (bArrV != null) {
                return new String(bArrV, getIndex(), length(), str);
            }
            return new String(H(), 0, length(), str);
        } catch (Exception e10) {
            f64581l.e(e10);
            return new String(H(), 0, length());
        }
    }
}
