package com.google.zxing.qrcode.decoder;

import c6.b;
import com.google.zxing.FormatException;
import v6.d;
import v6.f;

/* JADX INFO: compiled from: BitMatrixParser.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f20887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f20888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f20889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20890d;

    public void b() {
        int i10 = 0;
        while (i10 < this.f20887a.j()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f20887a.g(); i12++) {
                if (this.f20887a.d(i10, i12) != this.f20887a.d(i12, i10)) {
                    this.f20887a.c(i12, i10);
                    this.f20887a.c(i10, i12);
                }
            }
            i10 = i11;
        }
    }

    public void g(boolean z10) {
        this.f20888b = null;
        this.f20889c = null;
        this.f20890d = z10;
    }

    public final int a(int i10, int i11, int i12) {
        return this.f20890d ? this.f20887a.d(i11, i10) : this.f20887a.d(i10, i11) ? (i12 << 1) | 1 : i12 << 1;
    }

    public byte[] c() throws FormatException {
        d dVarD = d();
        f fVarE = e();
        DataMask dataMask = DataMask.values()[dVarD.c()];
        int iG = this.f20887a.g();
        dataMask.unmaskBitMatrix(this.f20887a, iG);
        b bVarA = fVarE.a();
        byte[] bArr = new byte[fVarE.h()];
        int i10 = iG - 1;
        boolean z10 = true;
        int i11 = i10;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i11 > 0) {
            if (i11 == 6) {
                i11--;
            }
            for (int i15 = 0; i15 < iG; i15++) {
                int i16 = z10 ? i10 - i15 : i15;
                for (int i17 = 0; i17 < 2; i17++) {
                    int i18 = i11 - i17;
                    if (!bVarA.d(i18, i16)) {
                        i13++;
                        i14 <<= 1;
                        if (this.f20887a.d(i18, i16)) {
                            i14 |= 1;
                        }
                        if (i13 == 8) {
                            bArr[i12] = (byte) i14;
                            i12++;
                            i13 = 0;
                            i14 = 0;
                        }
                    }
                }
            }
            z10 = !z10;
            i11 -= 2;
        }
        if (i12 == fVarE.h()) {
            return bArr;
        }
        throw FormatException.getFormatInstance();
    }

    public d d() throws FormatException {
        d dVar = this.f20889c;
        if (dVar != null) {
            return dVar;
        }
        int iA = 0;
        int iA2 = 0;
        for (int i10 = 0; i10 < 6; i10++) {
            iA2 = a(i10, 8, iA2);
        }
        int iA3 = a(8, 7, a(8, 8, a(7, 8, iA2)));
        for (int i11 = 5; i11 >= 0; i11--) {
            iA3 = a(8, i11, iA3);
        }
        int iG = this.f20887a.g();
        int i12 = iG - 7;
        for (int i13 = iG - 1; i13 >= i12; i13--) {
            iA = a(8, i13, iA);
        }
        for (int i14 = iG - 8; i14 < iG; i14++) {
            iA = a(i14, 8, iA);
        }
        d dVarA = d.a(iA3, iA);
        this.f20889c = dVarA;
        if (dVarA != null) {
            return dVarA;
        }
        throw FormatException.getFormatInstance();
    }

    public f e() throws FormatException {
        f fVar = this.f20888b;
        if (fVar != null) {
            return fVar;
        }
        int iG = this.f20887a.g();
        int i10 = (iG - 17) / 4;
        if (i10 <= 6) {
            return f.i(i10);
        }
        int i11 = iG - 11;
        int iA = 0;
        int iA2 = 0;
        for (int i12 = 5; i12 >= 0; i12--) {
            for (int i13 = iG - 9; i13 >= i11; i13--) {
                iA2 = a(i13, i12, iA2);
            }
        }
        f fVarC = f.c(iA2);
        if (fVarC != null && fVarC.e() == iG) {
            this.f20888b = fVarC;
            return fVarC;
        }
        for (int i14 = 5; i14 >= 0; i14--) {
            for (int i15 = iG - 9; i15 >= i11; i15--) {
                iA = a(i14, i15, iA);
            }
        }
        f fVarC2 = f.c(iA);
        if (fVarC2 == null || fVarC2.e() != iG) {
            throw FormatException.getFormatInstance();
        }
        this.f20888b = fVarC2;
        return fVarC2;
    }

    public void f() {
        if (this.f20889c == null) {
            return;
        }
        DataMask.values()[this.f20889c.c()].unmaskBitMatrix(this.f20887a, this.f20887a.g());
    }

    public a(b bVar) throws FormatException {
        int iG = bVar.g();
        if (iG >= 21 && (iG & 3) == 1) {
            this.f20887a = bVar;
            return;
        }
        throw FormatException.getFormatInstance();
    }
}
